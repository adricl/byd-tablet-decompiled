# How the BYD DiLink Android System Reads Data From the Car

A map of the data path from the vehicle's CAN bus up to the Android apps on the
DiLink 3.0 head unit, reconstructed from live `adb` inspection and the decompiled
`DiCarServer.apk`. Device observed: `BYD_AUTO / DiLink3.0` (Android 10, API 29).

---

## 1. The big picture

```
   ┌─────────────────────────────────────────────────────────────────────┐
   │  PHYSICAL VEHICLE (ECUs on CAN / LIN buses)                           │
   │  BMS · motor inverter · VCU · body controller · ABS/ESP · climate ·   │
   │  ADAS · instrument-cluster ECU · charging module · TPMS · …           │
   └───────────────────────────────┬─────────────────────────────────────┘
                                    │  CAN frames
                                    ▼
   ┌─────────────────────────────────────────────────────────────────────┐
   │  MCU  (vehicle micro-controller / gateway)                           │
   │  Bridges the CAN buses to the Android SoC. Scales raw CAN signals     │
   │  into "features" addressed by a 32-bit id.                            │
   └───────────────────────────────┬─────────────────────────────────────┘
                                    │  vendor transport (HAL)
                                    ▼
   ┌─────────────────────────────────────────────────────────────────────┐
   │  ANDROID (SoC) — HAL layer                                            │
   │  android.hardware.bydauto.*  →  AbsBYDAutoDevice subclasses           │
   │  (BYDAutoSpeedDevice, BYDAutoChargingDevice, BYDAutoAcDevice, …)      │
   │  one HAL "device" per feature category, keyed by BYDAutoFeatureIds    │
   └───────────────────────────────┬─────────────────────────────────────┘
                                    │
                                    ▼
   ┌─────────────────────────────────────────────────────────────────────┐
   │  com.byd.car.server  (DiCarServer.apk)  — the broker                  │
   │  process runs as uid=system, binder name "autoservice"/BYDAutoServer  │
   │                                                                       │
   │   McuManager ─ CarPropertyProxy ─ CarPropertyServiceImpl              │
   │        │              │                    │                          │
   │        │              │        ┌───────────┴───────────┐              │
   │        │              │   handlers: VehicleConfig,      │             │
   │        │              │   Audio, Extended               │             │
   │        └──────────────┴───────────────┬─────────────────┘             │
   │                                        ▼                              │
   │        exposes:  ICarPropertyService (binder)                         │
   │                  + several ContentProviders                           │
   └───────────────────────────────┬─────────────────────────────────────┘
                                    │  IPC (Binder / ContentResolver)
                                    ▼
   ┌─────────────────────────────────────────────────────────────────────┐
   │  CLIENT APPS                                                          │
   │  com.byd.carsettings · com.byd.cloudserviceapp · launcher widgets ·   │
   │  com.byd.providers.carstatus · Google Maps (via std car providers) ·  │
   │  3rd-party apps (seen: "TG2App")                                      │
   └─────────────────────────────────────────────────────────────────────┘
```

---

## 2. Signals are "properties" keyed by a hex string

Every readable/writable thing in the car is a **vehicle property** identified by a
32-bit id written as a hex string, e.g. `"0x08000020"` = road speed from the gateway.

- The decompiled sources define **10,735 named properties** across **46 categories**
  in `com/byd/feature/<category>/<Category>.java` (name → hex key) with a reverse map
  in `<Category>Mapper.java`. Full list: `BYD_Vehicle_Signals.md`.
- Each category maps to one HAL device (`BYDAutoSpeedDevice`, `BYDAutoChargingDevice`…).
- The `Mapper.transformFeatureId()` converts the string name to the integer feature id
  in `android.hardware.bydauto.BYDAutoFeatureIds` via reflection, then routes the
  call to that category's `AbsBYDAutoDevice`.

Naming conventions encode intent: `_SET` = writable command, `_STATUS`/`_STATE`/`_FLAG`
= readable state, `_CONFIG` = configuration, `_VISIBLE` = UI-visibility bool.

---

## 3. The broker API — `com.byd.car.property.ICarPropertyService`

Bundled inside DiCarServer (no separate framework jar). Binder descriptor
`com.byd.car.property.ICarPropertyService`, obtained from the `autoservice` service.

| Txn | Method | Purpose |
|----:|--------|---------|
| 2 | `Response getProperty(String key)` | read one property |
| 3 | `Response getProperties(String[] keys)` | read a batch |
| 4 | `List<CarPropertyConfig> getPropertyConfigs(String[] keys)` | metadata / access type |
| 1 | `Status setProperties(CarPropertyValue[] values)` | write (`_SET` props) |
| 5 | `void registerValueCallback(ICarPropertyListener l, String[] keys)` | **subscribe to live changes** |
| 6 | `void unregisterValueCallback(ICarPropertyListener l, String[] keys)` | unsubscribe |

**Value model — `CarPropertyValue<V>`:** fields `mPropertyKey` (hex), `mPropertyId`,
`mValue`. The value is dynamically typed over the wire — String, Integer, Long, Float,
Double, Boolean, or arrays (`int[]`, `float[]`, `long[]`, `byte[]`). Its `toString()` is
`CarProperty{key=<hex>, value=<v>}` — the exact form that appears in logcat.

**Push path:** when the MCU reports a change, `CarPropertyServiceImpl` invokes each
subscribed `ICarPropertyListener` — this is how the cluster/apps stay live without polling.

---

## 4. The other exit: ContentProviders (for Google Maps & BYD map UI)

DiCarServer also hosts `VehicleContentProvider` (`com.byd.vem`) with these authorities:

| Authority | Consumer | Payload |
|-----------|----------|---------|
| `google_maps_energy` | Google Maps | battery level/capacity (Wh), temps, charging model (protobuf) |
| `google_maps_assisted_driving` | Google Maps | driving/assist state enum, speed |
| `google_maps_vehicle_profile` | Google Maps | static vehicle profile |
| `google_maps_settings` | Google Maps | EV trip / payment settings |
| `com_byd_vem_data`, `com_byd_map_ui` | BYD map UI | BYD's own vehicle-data feed |

These serve the **standard Android "car data for Maps" protobuf schema** — the `.proto`
files (`energy_model.proto`, `assisted_driving_state.proto`, `vehicle_profile.proto`, …)
are shipped inside the APK and are authoritative for units (watt-hours, °C, m/s) and
enums. Direct `content query` on them is refused (`Query unsupported`) — they only feed
the whitelisted Maps client and push via observers.

Other providers in the app: `CarServiceProvider`, `VehicleServiceProvider`.

Separately, `com.byd.providers.carstatus` (authority `com.byd.carStatusProvider`) is a
small **queryable** SQLite key/value store for maintenance/service state
(`content query --uri content://com.byd.carStatusProvider/car_status`).

---

## 5. Who reads what — observed clients

- **Google Maps** — energy/range/speed via the `google_maps_*` providers.
- **`com.byd.cloudserviceapp`** — seen live in logcat subscribing to
  `0x44700038` (= `STATISTIC_AVERAGE_BATTERY_TEMP`) and uploading telemetry to cloud/MQTT
  (`mqttserv`, `IBYDCloudMqttServer`).
- **`com.byd.carsettings`** — vehicle status/settings screens.
- **`com.byd.providers.carstatus`** — maintenance data store.
- **A 3rd-party app "TG2App"** — was using the standard Android `CarPropertyManager`
  (`CAR.L.CAR_CAR_PROPERTY` log tag), i.e. BYD also bridges into the AOSP car framework.
- **Instrument-cluster ECU** — the digital dash is its own hardware/screen behind the
  wheel, fed directly over CAN; it is **not** an Android app on the head unit.

---

## 6. How to observe it yourself over adb

```bash
# 1) Passive — watch live property callbacks (only shows keys someone subscribed to):
adb shell logcat | grep -E "CAR_CAR_PROPERTY|CarProperty\{"
#    → CarProperty{key=0x44700038, value=51}

# 2) Decode any hex key to its name:
grep -rn "0x44700038" DiCarServer/sources/com/byd/feature/
#    → STATISTIC_AVERAGE_BATTERY_TEMP

# 3) The maintenance key/value store is directly queryable:
adb shell content query --uri content://com.byd.carStatusProvider/car_status

# 4) Active read/subscribe of ANY property requires binding the "autoservice"
#    binder and calling getProperty()/registerValueCallback() — needs a
#    system signature or the BYD-auto permission (not available to a plain shell).
```

---

## 7. Layer summary

| Layer | Component | Role |
|-------|-----------|------|
| Vehicle | ECUs on CAN/LIN | produce raw signals |
| Gateway | MCU | bridge CAN ↔ Android, scale to feature ids |
| HAL | `android.hardware.bydauto.*` `BYDAuto*Device` | per-category hardware access |
| Service | `com.byd.car.server` (DiCarServer) | broker: `ICarPropertyService` + providers |
| Framework | property name↔key dictionary (`com/byd/feature/*`) | 10,735 named signals |
| Apps | carsettings, cloudserviceapp, Maps, carstatus, widgets | consume & display / upload |

---

*Generated 2026-07-28 from live device inspection + decompiled `DiCarServer.apk`.
Companion files: `BYD_Vehicle_Signals.md` (full signal list),
`ICarPropertyService_notes.md` (API deep-dive).*
