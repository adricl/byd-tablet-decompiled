# BYDAuto framework stubs

Compile-only stubs of the car's `android.hardware.bydauto.*` API: all 50 `BYDAuto*Device` classes, their
`AbsBYDAuto*Listener`s, `BYDAutoFeatureIds`, `BYDAutoEventValue`, `BYDAutoManager`, `IBYDAuto*`, and so on.
They come from `framework.jar` from the Car Image

| File | Contents |
|---|---|
| `byd-framework-stubs.jar` | Only members a normal app can link to (hidden-API `whitelist`). **Use this one.** |
| `byd-framework-stubs-full.jar` | Every public/protected member. The 1,457 hidden-API `blacklist` ones are marked `@Deprecated`. |
| `*-sources.jar` | Sources for either jar, with parameter names, feature-ID javadoc and required permissions. |

## Using it in an Android project

Copy the jar (and its sources jar) into `app/libs/`, then add:

```kotlin
// app/build.gradle.kts
dependencies {
    compileOnly(files("libs/byd-framework-stubs.jar"))
}
```

Use **`compileOnly`**, not `implementation`. The real classes are already on the car's boot classpath. Every
stub method throws `RuntimeException("Stub!")`, so the jar must never be packaged into the APK.

To see the javadoc in Android Studio, open a stub class, click **Choose Sources…** and select the matching
`-sources.jar`.

```java
BYDAutoSpeedDevice speed = BYDAutoSpeedDevice.getInstance(context);
double kmh = speed.getCurrentSpeed();
speed.registerListener(new AbsBYDAutoSpeedListener() {
    @Override public void onSpeedChanged(double value) { /* ... */ }
});
```

## Runtime caveats (read before building an app)

- **Permissions.** Device getters and setters call `enforceCallingOrSelfPermission(...)` with a per-device
  permission, for example `getCurrentSpeed()` → `android.permission.BYDAUTO_SPEED_GET`. The permissions each
  class needs are in its class javadoc. `com.byd.auto.permission` defines these `*_GET` / `*_SET`
  permissions as **`signature`**, so a normal sideloaded app gets a `SecurityException`. `pm grant` cannot
  grant a signature permission. The `*_COMMON` permissions in `framework-res` are `dangerous`, but the
  getters checked so far don't use them.
- **Hidden API.** Blacklisted members (only in the `-full` jar) throw `NoSuchMethodError` /
  `NoSuchFieldError` when a normal app links to them on Android 10. They work for system/platform-signed
  apps, or after relaxing the policy over adb (`settings put global hidden_api_policy 1`).
- **Cloud kill-switch.** `BYDAutoManager` registers with the `strategy` system service for an
  `AutoApiBlack` item that can block API calls remotely.
- **Feature IDs depend on the protocol.** Most `BYDAutoFeatureIds` fields are set when the class loads,
  based on `sys.car.protocol`. The stubs deliberately leave them as non-constant, so your code reads the
  car's real value at runtime instead of a value inlined at compile time. The hex keys in the javadoc are
  for **CANFD**.

## Class listing

126 classes, grouped by package. Both jars contain the same classes; they differ only at the member
level (the `-full` jar adds the blacklisted methods/fields, marked `@Deprecated`).

**`android.hardware`**  
`BYDAutoManager`, `IBYDAutoDevice`, `IBYDAutoEvent`, `IBYDAutoListener`, `IBYDAutoListenerIdsMap`

**`android.hardware.bydauto`**  
`AbsBYDAutoDevice`, `BYDAutoConstants`, `BYDAutoDeviceFeaturesMap`, `BYDAutoDeviceManager`, `BYDAutoEvent`, `BYDAutoEventValue`, `BYDAutoFeatureIds`

**`android.hardware.bydauto.ac`**  
`AbsBYDAutoAcListener`, `BYDAutoAcDevice`

**`android.hardware.bydauto.adas`**  
`AbsBYDAutoADASListener`, `BYDAutoADASDevice`

**`android.hardware.bydauto.audio`**  
`AbsBYDAutoAudioListener`, `BYDAutoAudioDevice`

**`android.hardware.bydauto.auxiliary`**  
`AbsBYDAutoAuxListener`, `BYDAutoAuxDevice`

**`android.hardware.bydauto.bigdata`**  
`AbsBYDAutoBigDataListener`, `BYDAutoBigDataDevice`, `BYDAutoBigDataEvent`

**`android.hardware.bydauto.bodywork`**  
`AbsBYDAutoBodyworkListener`, `BYDAutoBodyworkDevice`

**`android.hardware.bydauto.charging`**  
`AbsBYDAutoChargingListener`, `BYDAutoChargingDevice`, `ChargingTimerInfo`

**`android.hardware.bydauto.collision`**  
`AbsBYDAutoCollisionListener`, `BYDAutoCollisionDevice`, `BYDAutoCollisionEvent`

**`android.hardware.bydauto.cputemprature`**  
`BYDAutoCpuTempratureDevice`

**`android.hardware.bydauto.doorlock`**  
`AbsBYDAutoDoorLockListener`, `BYDAutoDoorLockDevice`

**`android.hardware.bydauto.doormirror`**  
`AbsBYDAutoRearViewMirrorListener`, `BYDAutoRearViewMirrorDevice`

**`android.hardware.bydauto.dtc`**  
`BYDAutoDtcDevice`

**`android.hardware.bydauto.energy`**  
`AbsBYDAutoEnergyListener`, `BYDAutoEnergyDevice`

**`android.hardware.bydauto.engine`**  
`AbsBYDAutoEngineListener`, `BYDAutoEngineDevice`, `BYDAutoEngineEvent`

**`android.hardware.bydauto.funcnotice`**  
`AbsBYDAutoFuncNoticeListener`, `BYDAutoFuncNoticeDevice`

**`android.hardware.bydauto.gb`**  
`AbsBYDAutoGBListener`, `BYDAutoGBDevice`, `BYDAutoGBEvent`

**`android.hardware.bydauto.gearbox`**  
`AbsBYDAutoGearboxListener`, `BYDAutoGearboxDevice`

**`android.hardware.bydauto.instrument`**  
`AbsBYDAutoInstrumentListener`, `BYDAutoInstrumentDevice`

**`android.hardware.bydauto.light`**  
`AbsBYDAutoLightListener`, `BYDAutoLightDevice`

**`android.hardware.bydauto.location`**  
`AbsBYDAutoLocationListener`, `BYDAutoLocationDevice`

**`android.hardware.bydauto.motor`**  
`AbsBYDAutoMotorListener`, `BYDAutoMotorDevice`

**`android.hardware.bydauto.mqtt`**  
`AbsBYDAutoMqttListener`, `BYDAutoMqttDevice`

**`android.hardware.bydauto.multimedia`**  
`AbsBYDAutoMultimediaListener`, `BYDAutoMultimediaDevice`, `MediaInfo`

**`android.hardware.bydauto.ota`**  
`AbsBYDAutoOtaListener`, `BYDAutoOtaDevice`, `BYDAutoOtaEvent`, `OTAControlCMD`

**`android.hardware.bydauto.panorama`**  
`AbsBYDAutoPanoramaListener`, `BYDAutoPanoramaDevice`, `BYDAutoPanoramaDeviceDi2l`, `IBYDAutoPanoListener`, `IBYDAutoPanoService`

**`android.hardware.bydauto.phone`**  
`AbsBYDAutoPhoneListener`, `BYDAutoPhoneDevice`

**`android.hardware.bydauto.pm2p5`**  
`AbsBYDAutoPM2p5Listener`, `BYDAutoPM2p5Device`

**`android.hardware.bydauto.power`**  
`AbsBYDAutoPowerListener`, `BYDAutoPowerDevice`

**`android.hardware.bydauto.qcfs`**  
`AbsBYDAutoQcfsListener`, `BYDAutoQcfsDevice`, `BYDAutoQcfsEvent`

**`android.hardware.bydauto.radar`**  
`AbsBYDAutoRadarListener`, `BYDAutoRadarDevice`

**`android.hardware.bydauto.radio`**  
`AbsBYDAutoRadioListener`, `BYDAutoRadioDevice`, `BYDAutoRadioEvent`

**`android.hardware.bydauto.reminder`**  
`AbsBYDAutoReminderListener`, `BYDAutoReminderDevice`

**`android.hardware.bydauto.rescue`**  
`AbsBYDAutoRescueListener`, `BYDAutoRescueDevice`

**`android.hardware.bydauto.rse`**  
`AbsBYDAutoRSEListener`, `BYDAutoRSEDevice`

**`android.hardware.bydauto.safetybelt`**  
`AbsBYDAutoSafetyBeltListener`, `BYDAutoSafetyBeltDevice`

**`android.hardware.bydauto.security`**  
`AbsBYDAutoSecurityListener`, `BYDAutoSecurityDevice`, `BYDAutoSecurityEvent`

**`android.hardware.bydauto.sensor`**  
`AbsBYDAutoSensorListener`, `BYDAutoSensorDevice`, `BYDAutoSensorEvent`

**`android.hardware.bydauto.setting`**  
`AbsBYDAutoSettingListener`, `BYDAutoSettingDevice`

**`android.hardware.bydauto.signal`**  
`BYDAutoSignalDevice`

**`android.hardware.bydauto.special`**  
`AbsBYDAutoSpecialListener`, `BYDAutoSpecialDevice`, `BYDAutoSpecialEvent`

**`android.hardware.bydauto.speed`**  
`AbsBYDAutoSpeedListener`, `BYDAutoSpeedDevice`, `BYDAutoSpeedEvent`

**`android.hardware.bydauto.statistic`**  
`AbsBYDAutoStatisticListener`, `BYDAutoStatisticDevice`

**`android.hardware.bydauto.test`**  
`AbsBYDAutoTestListener`, `BYDAutoTestDevice`

**`android.hardware.bydauto.time`**  
`AbsBYDAutoTimeListener`, `BYDAutoTimeDevice`

**`android.hardware.bydauto.tyre`**  
`AbsBYDAutoTyreListener`, `BYDAutoTyreDevice`

**`android.hardware.bydauto.vehicledata`**  
`AbsBYDAutoVehicleDataListener`, `BYDAutoVehicleDataDevice`, `BYDAutoVehicleDataEvent`

**`android.hardware.bydauto.version`**  
`AbsBYDAutoVersionListener`, `BYDAutoVersionDevice`

**`android.hardware.bydauto.wiper`**  
`AbsBYDAutoWiperListener`, `BYDAutoWiperDevice`

**`android.hardware.bydauto.yun`**  
`AbsBYDAutoYunListener`, `BYDAutoYunDevice`, `BYDAutoYunEvent`
