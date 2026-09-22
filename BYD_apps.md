# apks_pulled — app inventory

The APKs pulled from the BYD DiLink head unit. 82 packages have been decompiled into `<pkg>/extracted/` (`resources/` = decoded manifest + res, `sources/` = jadx Java). All of them are the `com.byd.*` apps plus `com.vivid.music.byd`. The other 94 packages (stock AOSP, Qualcomm, and sideloaded third-party apps) have only been pulled.

Descriptions are based on each app's manifest (label, components, permissions), its string resources,
and its own source code. The less obvious apps were read in depth; see [Deep dive](#deep-dive-less-obvious-apps). Notes:

- **uid=system** means `android:sharedUserId="android.uid.system"`, so the app runs as the system user.
- **persistent** means `android:persistent="true"`: the app is started at boot and restarted if it dies.
- `BYDAUTO_*_GET/SET/COMMON` are BYD's custom permissions for the vehicle HAL (`android.hardware.bydauto`),
  one per subsystem (AC, BODYWORK, GEARBOX, PANORAMA, INSTRUMENT, CHARGING, …). They show which
  vehicle domains each app talks to.

---

## Decompiled apps (82)

### Vehicle control and core vehicle services

| Package | Label | uid / flags | What it does |
|---|---|---|---|
| `com.byd.car.server` | DiCarServer | system, persistent | Hosts two backends. (1) `CarServiceProvider`: the server side of the **DiCar SPI**, registering `ICarPropertyService` that the other apps' `DiCar.init()` binds to. (2) Google Maps' OEM **Vehicle Energy Model** providers (`google_maps_energy`, `…_settings`, `…_assisted_driving`, `…_vehicle_profile`): battery capacity, charging curves, drivetrain and battery losses, auxiliary drain, used for EV route planning. Access is restricted to 10 whitelisted Google signing-cert SHA-1s. Also contains `com.gpack.*` (gear, driving state and car info for a third-party agent) and an app-focus service. See [deep dive](#combydcarserver). |
| `com.byd.appserver` | AppServer | system, persistent | Headless host that starts about 20 `AppUI` modules at boot. They cover: ESP-off button dialog and DiPilot hands-off toast; relaying weather from the iCoolMe provider to the ECM over CAN-FD; collecting ~100 user settings for big-data upload; VTOL (vehicle-to-load) timer; exhibition-mode resets; **wireless-ADB toggle**; default language and input method per country code; traffic-sign and DAW setting; wading protection; trailer/drag mode; NFC and UWB digital-key pairing pop-ups; seat-massage floating window; car-status and maintenance collection; screensaver flags; energy-consumption DB (`/sdcard/energydata/EC_database.db`); and the hood-open warning. See [deep dive](#combydappserver). |
| `com.byd.customserver` | System Services | system, persistent | Headless host for `CustomMain` and `StudyMain`. **Auto Study** is *vehicle-configuration self-learning*: it reads the car's feature config from the MCU and writes about 200 `*_visible` flags and model/energy-type properties (`persist.sys.AutoType`, `persist.sys.energytype`) that the settings UIs use to show or hide features. `OFFLineConfigActivity` dumps the raw MCU config bytes. Also: A/C, cruise and air-purifier listeners; recirculation when AutoNavi reports a tunnel; MCU→Android time sync; DiCare fluid-life reminders; trailer mode. See [deep dive](#combydcustomserver). |
| `com.byd.airconditioning` | A/C | system | Full-screen climate control UI plus A/C settings: preheating, air purification, fragrance, PM2.5. The UI is rendered with Cocos2d-x (`libcocos.so`). |
| `com.byd.gesture.global` | — | system, persistent | Global input monitor (`MONITOR_INPUT`/`INJECT_EVENTS`). It provides (a) the edge-swipe **back gesture**, drawn on its own surface and suppressed during the novice guide and SystemUI scene modes (nap, pet, rest), and (b) a **three-or-more-finger swipe** anywhere to change A/C temperature (vertical) or fan level, with pop-up overlays. |
| `com.byd.drivingrestriction` | CarDrivingRestriction | system, persistent | BYD port of AOSP's CarUxRestrictions. It registers `IBydCar` and monitors the top activity plus gear state. Unless the car is in P, it launches `ActivityBlockingActivity` over any package in `res/raw/car_config_black_list.txt`: YouTube, the BYD browser, TVer, U-Next, ZDF, BBC, and several kids' and games apps. The whitelist is empty. |
| `com.byd.cpdwarn` | com.byd.cpdwarn | system, persistent | **Child Presence Detection** warning. Shows a full-screen alert that you exit by long-pressing for 3 s, with an option to turn CPD off. |
| `com.byd.intelligententry` | Intelligent entry | system, persistent | Digital-key settings screen (NFC card, with China and abroad variants; BLE phone key; app key; palm-vein key), with per-user enable switches stored as JSON (`KEY_USER_SWITCH_CONFIGS`). Also physical-key settings and a debug activity. Uses CAN messages and cloud broadcast `com.byd.cloudmanager.broadcast.23`. |
| `com.byd.customkey` | CustomKey | system | Jetpack Compose screen for the left/right steering-wheel **custom buttons**. Assignable functions: DVR photo, DVR video lock, pause/play media, center-screen rotation, auto parking, Wi-Fi. Available functions depend on hardware (recorder present, rotating screen). Stored via `SETTING_CUSTOM_KEY_*` and `custom_key_value`. |
| `com.byd.smarttravel` | Smart Charging | system, persistent | Scheduled and smart charging: charge start time, charge to 100 %, a reminder when the charger connects, scheduled power-off, and an "energy centre" page. Provides `com.byd.smartchage.provider`. Has Fang Cheng Bao branding strings. |
| `com.byd.xcall` | XCall | system, persistent | **eCall / bCall** (emergency and breakdown call) handler. Shows floating call UIs and triggers on collision via the `BYDAUTO_RESCUE_*` permissions. |
| `com.byd.clusterdebug` | ClusterDebug | — | Instrument-cluster engineering tool. The UI sends `AutoContainerManager.sendInfo(1000, n)` commands to the cluster: stop/resume the IVI→cluster video stream, FPS overlay, OSD frame sequence, ADB screenshot, ADAS/SR scene switch, HUD menus, old/new UI, eth0 UDP capture. **Its exported receiver `BroadcastReceiverCAN` (action `com.byd.cluster.spi`, no permission) parses a comma-separated hex string and writes it to `BYDAutoTestDevice` feature `0xAA00000F`.** See [deep dive](#combydclusterdebug). |
| `com.byd.auto.permission` | PermissionTest | — | Tiny app whose resources hold descriptions for every `BYDAUTO_*` permission (AC, ADAS, audio, bodywork, charging, door lock, mirrors…). Useful as a reference list of the vehicle permission set. |

### Cameras, surround view, DVR

| Package | Label | uid / flags | What it does |
|---|---|---|---|
| `com.byd.avc` | Vehicle Image | system, persistent | **360° panoramic / surround-view and reversing camera** (AVM). Reverse image, guide lines, calibration, Auto Parking Assist UI. Bundles `ai.bst.surroundview` and `com.byd.glavm` GL renderer. The largest app (~400 MB, mostly 3D car models). |
| `com.byd.cameramanager` | BydCameraService | system, persistent | Camera arbitration service (`bydcameramanager` binder). It decides which client owns each camera, Android apps or the native "MM" user (AVM/DVR), handles pre-open conflicts, and shows a floating view when a client dies. Includes an ISP image-rotation helper and an analog decoder (`adv7282m`). |
| `com.byd.bydcamera` | BydCamera | system | Minimal camera viewer launched by broadcast (`LUANCH_CAMERA`). Can switch camera ID across DMS, interior, exterior, panorama and rear cameras. Includes watermark HAL classes. |
| `com.byd.auto_camera` | Camera | — | User-facing in-car camera app (interior/exterior camera, photo and video, P-gear only). |
| `com.byd.auto_photo` | Albums | — | Gallery app for car camera and USB media: viewing, editing (crop, blur, mosaic, filter, watermark, doodle), burst management, video play and edit, set as wallpaper, share to other devices. |
| `com.byd.cdr` | DVR | system, persistent | **Dashcam (Car Digital Recorder)**: loop and event recording, photo capture, SD/USB storage and formatting, export, a home-screen widget, and driving info overlaid on the recording. |
| `com.byd.cdrservice` | BydCameraService | system, persistent | Tiny binder service `IBYDCDRService`. It registers DVR "users" and forwards `setCommand(cmd, value)` to the first registered one, so other apps can control the dashcam through it. |

### Media, radio, entertainment

| Package | Label | uid / flags | What it does |
|---|---|---|---|
| `com.byd.mediacenter` | Media Center | system, persistent | Main media app: local/USB music and video, Bluetooth music, FM/AM radio, **DAB** (announcements, EPG, module firmware upgrade), and KaolaFM online radio SDK. |
| `com.byd.mediacontroller` | MediaController | system, persistent | Media-source arbiter behind the media card/widget. A notification-listener that tracks the active `MediaSession` across local media, BT, radio/DAB, CarPlay, Android Auto and Amazon Music. Exposes `IMediaControllerServiceInterface` and `IMediaWidgetService` to the widgets, caches BT cover art, and switches media mode for the cluster display. |
| `com.byd.media.autoplay` | MediaAutoPlay | system, persistent | Restores the last media source at boot or quick-boot (`byd.intent.action.RESTORE_PLAYBACK`). It works out which app held audio focus at shutdown (media center, BT, CarPlay, DAB services) and relaunches it if auto-play is enabled. |
| `com.byd.mediapreview` | Media Player | system | Lightweight viewer and player for opening single video, photo or audio files (e.g. from the file manager). |
| `com.byd.widget.mediacenter` | MediaControllerWidget | system, persistent | Home-screen media widget. Covers Bluetooth, Apple CarPlay, Android Auto, Amazon Music and the passenger screen. |
| `com.byd.musicwidget` | — | system, persistent | Older music widget (Bluetooth / local media / online radio). Bundles Ximalaya, KaolaFM and Kuwo SDKs. |
| `com.byd.dabclient` | DAB+ | — | DAB+ radio widget and background service (Dolphin and Dynasty widget styles). |
| `com.byd.dabservice` | DABService | — | DAB tuner backend over a USB DAB dongle (`libUSBAudio.so`, `libusb100.so`, radio HAL 1.0). Includes a pressure-test activity. |
| `com.byd.widget.dab2` | DAB | system | Second-generation DAB widget (Dolphin / Dynasty variants) that calls back into the media center. |
| `com.byd.minikaraoke` | MiniKaraoke | system, persistent | In-car karaoke: USB/wireless mic support, reverb tuning, and ambient-light rhythm. Based on the Loostone SDK (`libUsbMic.so`, `libUsbDongle.so`). |
| `com.byd.screensaver` | Screensaver | system | Clock / now-playing screensaver (FM/AM, Bluetooth audio, Kuwo/Kaola). |
| `com.byd.youtube` | YouTube | — | WebView wrapper around `m.youtube.com` (utm_source=byd_dilink). |
| `com.vivid.music.byd` | Spotify | — | Spotify client for BYD built by Vivid. Has BYD widgets (Dolphin/Dynasty/UI 4.0), instrument-cluster integration, and P-gear restrictions. |
| `com.byd.browser` | Browser | — | Chromium 113 fork rebranded as the BYD browser. Gear- and bodywork-aware. |
| `com.byd.mediatesttool` | MediaTestTool | system | Engineering tool for audio capture, denoise mode tests and frame-time tests. |

### Phone, Bluetooth, connectivity, projection

| Package | Label | uid / flags | What it does |
|---|---|---|---|
| `com.byd.bluetoothcall` | Phone | system, persistent | Bluetooth hands-free phone: dialer, contacts, call log, incoming-call UI, cluster display, phone widget. |
| `com.byd.btsetting` | Bluetooth Settings | system, persistent | Bluetooth pairing and settings service with permission and pairing-request dialogs. |
| `com.byd.bluetoothprovider` | BluetoothRemoteProvider | system | Content provider (`content://com.byd.bluetoothprovider/device`) that exposes bonded devices. |
| `com.byd.carplay.ui` | Apple CarPlay | system, persistent | Wired and wireless CarPlay receiver: connection service, iPhone call UI, video, Bluetooth/Wi-Fi setup. |
| `com.byd.mdconmanager` | Connected Devices | system, persistent | Device manager for projection phones (CarPlay / Android Auto): list, disconnect, delete. |
| `com.byd.WifiHotspotConnect` | WifiHotspotConnect | system, persistent | Tiny glue service. On connectivity change it pushes Wi-Fi link status and IP address to the native `deservice` (`IDataExtractService`), the **GB/T 32960 national-standard telematics client**. This lets that client report over Wi-Fi as well as cellular. |
| `com.byd.network.networksetting` | network setting | **phone** uid | APN editor and SIM-type selection service. |
| `com.byd.trafficmonitor` | Data Monitor | system, persistent | Mobile-data plan and enforcement. It queries the data plan ("goods") and usage from the cloud and tracks per-UID usage per APN into `/collect2/trafficDetail*.txt`. **It uses `NetworkPolicyManager.setUidPolicy` to block cellular data for apps not on the cloud-supplied whitelist**, which affects sideloaded apps on the car's SIM. Exposes remote-control AIDL for other system apps. |

### Settings, UI, themes

| Package | Label | uid / flags | What it does |
|---|---|---|---|
| `com.byd.carsettings` | Settings | system | Main **vehicle + system settings** app (54 activities): sound/EQ (Harman, Dynaudio, Dirac), Wi-Fi/hotspot, apps, digital key, units, legal, reset, and more. |
| `com.byd.carsettings.plugins` | — | — | Resource-only APK (~340 MB) holding car-model images and animations (per model code, e.g. `sc3e`, roof variants) for the Settings app. No code. |
| `com.byd.automultipletheme` | Themes | — | Theme store and wallpaper carousel. Also sets instrument-cluster themes and syncs themes to the DiLink account. |
| `com.byd.wallpaperhome` | WallpaperCenter | system | Wallpaper engine (static and video live wallpaper services) plus a wallpaper provider. |
| `com.byd.bydbootguide` | Guide | system, persistent | First-boot and onboarding flow: user agreement, privacy policy, disclaimers, cloud-service registration via QR code, real-name authentication, permission requests. |
| `com.byd.appstartmanagement` | Disable Autostart | — | UI for blocking apps from autostarting in the background (writes to `providers.appops`). |
| `com.byd.filemanager` | File Manager | system | File manager for internal storage and USB (copy, compress, search). |
| `com.byd.auto_emanual` | Manual | — | Interactive owner's manual with search, videos, voice entry, and USB import. |
| `com.byd.vrassistant` | BydVoice | system, persistent | **Voice assistant** built on the Cerence ARK engine (on-device ASR/NLU libraries). Handles calls/SMS, AC control, radio, navigation hints, and hard-key wake. |
| `com.byd.vrsettings` | BYD Assistant | system | Voice-assistant settings, voice-pack OTA and deletion, feedback. |
| `com.byd.vrdownload` | BydVoiceService | — | Downloader service for voice resources (FileDownloader-based). |

### Accounts, cloud, telemetry

| Package | Label | uid / flags | What it does |
|---|---|---|---|
| `com.byd.diLinkAccount` | Account Center | — | DiLink / BYD account: QR and Bluetooth login, face enrolment, personal info, driving-position profiles, third-party bindings. Exposes the account SDK (`DiLinkAccountSDKService`) and `com.byd.accountProvider`. |
| `com.byd.accountservice` | KeepAlive | system, persistent | Despite the name, this is a **keep-alive and helper** service. When the car powers on it binds to a list of partner and vendor apps (`com.byd.automap`, `naviauto`, `mycar`, `etc`, `yunnian`, `yisifang`, `yisanfang`, `dlc.drivingmode`, `isatphone`, `car.icebox`, `btet.man.car`, `ultratracker`, `cmgamecenter`, `diLinkAccount`) to keep them running. It also handles GameSir controller HID mode props. **Its three exported, permission-less services return the car's cloud token** (`/data/system/cloud/cloudToken.dat`), read system properties, launch activities in split screen, and read or write files as the system user (the file service checks a caller whitelist of map apps). See [deep dive](#combydaccountservice). |
| `com.byd.authservice` | AuthService | system, persistent | Registers the `byd_auth_service` binder (`IBYDAuthService.requestAuth`). A whitelisted caller triggers a **QR-code challenge**: the QR contains VIN, IMEI, taskId and auth type, encrypted with PBKDF2 using salt `byd_auth`. A technician scans it with BYD's VDS app or WeCom, and the unit polls `https://apr-<region>.byd.auto/authentication/verify`. Whitelisted callers and their auth types: `otgupdate`=0, `aftermarketinstalltool`=1, `byddevelopmenttools`=2, `newotgupdate`=3, `logswitch`=4. See [deep dive](#combydauthservice). |
| `com.byd.cloudserviceapp` | CloudServiceApp | system, persistent | Java-side bridge for the native cloud daemon (`native.cloud.manager.service`). Registers binder `cloud_server_app_service` (`ICloudServiceApp`). Apps register per-message-ID listeners; the daemon's messages are fanned out to them. JSON from the cloud with `APPID 14` becomes the V2G/smart-charge broadcast `com.byd.cloudmanager.broadcast.14`; `APPID 100` `cmd 11/12` takes or releases a wakelock. Apps send to the cloud via broadcast `com.byd.cloudmanager.receiver` (`json` extra). Also shows the **Remote Diagnostics allow/deny** pop-up (`rda_cmd`, 60 s timeout). |
| `com.byd.cloudserviceframe` | cloudserviceframe | — | Stand-alone copy of the "Remote Diagnostics" consent pop-up (Denza, Dynasty or Ocean skin). It triggers on `SHOW_DIAGNOSIS_DIALOG` with `rda_cmd=2` and answers with `CLOSE_DIAGNOSIS_DIALOG` (0 = timeout, 1 = deny, 2 = allow). |
| `com.byd.clientconfigurationservice` | ClientConfigurationService | system, persistent | **Cloud command and config receiver.** Listens on the native MQTT client (`mqttserv`) and dispatches JSON by key: `gb_ip` (GB/T 32960 server), `cloud_server`, `cloudservice_enable`, `reboot_qualcomm`, `kill_cloudmanager`, `clean_*_data`, `apr_server_address`, `client_config`, `module_switch`, `ota`, `gbUrl`, `ask_adc`, MQTT broker lists, and **`cmd`, which is run via `sh -c` as the system user, with its output uploaded to `/apis/config/save_cmd_result_post`**. Also: scheduled cloud reboot, remote-diagnosis requests, and a remote *uninstall* list (by default removes `com.byd.byddiagnosetool` after 15/50 km). See [deep dive](#combydclientconfigurationservice). |
| `com.byd.clientstatuscollectionservice` | ClientStatusCollectionService | system, persistent | Uploads connectivity and health status to iDiLink: APN1/2/3 state and IPs, signal, SIM and module failures, GB/T login state, ACC state, DTCs from the diagnostic HAL, and basic client info (versions, ICCID, location code). Also downloads the per-app **cellular-data whitelist** (`/data/client_config/forbid_whitelist.xml`, consumed by Data Monitor) and APN3 DNS config. |
| `com.byd.acquisitioncontrol` | Acquisitioncontrol | system, persistent | Scheduler for the native big-data **acquisition service** (`BYDAcquisitionClient`). It sets a daily alarm at a random time and triggers an upload (`acquisitionControl(1)`) only when the car is powered off. It signals network up/down and SIM ready, and passes the logged-in account's big-data user ID and privacy-consent state from `content://com.byd.accountProvider/account_big_data`. |
| `com.byd.CanDataCollect` | CanDataCollect | system, persistent | **CAN-bus data logger.** Downloads a CAN-ID collection config (periodic and event-triggered frames, fault snapshots) from `https://<area_prefix>-newcan-data.byd.auto:8087/cancollectpost/…`. The test endpoint is `eu-testnewcan-data…:8086`, enabled by a property. It receives whole CAN frames from `BYDAutoBigDataDevice`, stores them under `/collect2/dataCollect/`, zips and AES-encrypts them, and uploads over HTTPS. VIN, IMEI, ICCID and IMSI are partly masked. It is disabled in transport mode and gated on the country code. |
| `com.byd.overseaappstore` | BYD Store | — | Overseas app store: browse, install, update, uninstall apps. |

### OTA / upgrades

| Package | Label | uid / flags | What it does |
|---|---|---|---|
| `com.byd.otaupdate` | System updates | system, persistent | Consumer **OTA updater** for the whole vehicle: check, download, schedule, and install. Checks conditions (battery, hood, gear). Exposes `OTASdkService`. |
| `com.byd.productlineota` | ProductLineOTA | system, persistent | Factory/production-line variant of the OTA updater. |
| `com.byd.upgradeserver` | OTAServer | system, persistent | Native-backed update executor (`upgrade_server` binder). It checks `strategy.json`, verifies RSA signature and MD5, AES-decrypts packages, and applies them: Android A/B `payload.bin` via update_engine, and **MCU** (`mcu_=.xcd`), **DSP resources** and **vehicle ECUs** via JNI (`updateMCU`, `updateDspRes`, `updateVehicle`). It is the backend used by the OTA UIs. |
| `com.byd.otgupdate` | OTG upgrade software | system, persistent | **USB flash-disk upgrade**. Triggered on mount; verifies signature and verification code, then installs IVI/module updates. |
| `com.byd.cota` | Upgrade | system, persistent | "Cloud OTA" **resource and config delivery** engine (internal name `yqzx`). It polls `vehicle-data-api/data/groupConfigs` on iDiLink and installs resources by type through plugins: `apk` (incl. **runtime resource overlays** under `/cust_overlay/carbody`), `zip_file` (unpacked to app data dirs), `params_config` (`params.json` pushed to apps), and `cluster_language` (instrument-cluster translations). Resources go through signature verification, drive-state and time-window interceptors, and optional user-consent dialogs. Also shares vehicle data via `com.byd.yqzx.vehicle.data.shared`. Has many hidden test activities. |
| `com.byd.aftermarketinstalltool` | — | — | Dealer tool for **installing whitelisted third-party APKs from USB**. It runs on USB mount, requires a `byd_auth_service` QR auth (type 1) or a per-country password, and checks APKs against a whitelist, either built-in per country or online via `apr-<region>.byd.auto/authentication/whitelist-verify`. Built-in examples: WhatsApp, Telegram, Yandex Navi/Music/Weather, 2GIS, Mappls, VK Music, Streema radio, and Uzbek apps. |

### Engineering, diagnostics, factory tools

| Package | Label | uid / flags | What it does |
|---|---|---|---|
| `com.byd.byddevelopmenttools` | BydDevelopmentTools | system | **Engineering menu.** It is unlocked through `byd_auth_service` QR auth (type 2) or a code screen. The code is derived locally from the last 6 IMEI digits, or checked against a fixed SHA-256 if there is no IMEI; 10 failures send a warning report. Features: ADB/USB debugging, tcpdump (`persist.sys.tcpdump`), log control, airplane mode, layout/RTL debug, version info (incl. ANC), **repair mode** (`persist.sys.repair_mode.enable`, reported to the cloud as APPID 24), **roll-bench (dyno) mode** (tells the IPB brake unit), and OBD CAN-ID / network **mapping** tools. |
| `com.byd.logswitch` | V2C debug tool | system | "V2C debug tool" for cloud and telematics engineers. Gated by `BYDAuthManager.requestAuth` (type 4). Screens: cloud log switch and environment (prod/test) switch, MQTT diagnostics and broker override (`mqttEnvTest.json`), APN and IMSI/ICCID/VIN status, GB/T 32960 (`deservice`) status and BMS prod/test domain, CAN-collect file extraction and parsing, **raw CAN frame send on the chassis and energy buses** (`BYDAutoVehicleDataDevice` feature `0xAA00001E`), device certificate view, and a reboot/extract screen with the hard-coded password `byd1234`. |
| `com.byd.bydlogtool` | BydLogTool | system, persistent | Log capture and upload: crash/ANR collection, saves logs to `sdcard/logs`, and a "fault report" upload. Provides `CrashProvider`. |
| `com.byd.btlogtool` | BTLogSetting | system | Toggles for BT, Wi-Fi verbose and GPS logging, plus link-key dump (QTI log kit). |
| `com.byd.diagnosticinfo` | DiLink DiagnosticDataTool | system | Secret-code screen that shows HW/SW versions and diagnostic fault details. |
| `com.byd.byddatachecktool` | BydDataCheckTool | system | Factory end-of-line helper. When the test HAL fires `TEST_CHECK_SHIPPING_INFORMATION`, it writes back the external SW version, unit SN (`persist.sys.factory.data2`) or IMEI as BCD via `BYDAutoTestDevice`. It also records the map-data check result in `persist.sys.factory.map.check.result`. |
| `com.byd.countrycodetool` | CountryCodeTool | system | Sets the vehicle country/region code, which triggers a reboot. |
| `com.byd.materialinfo` | Material Info | system | Writes one of three hard-coded part/material codes (`11CJ`, `123P`, `11CK`) into `/collect2/material.txt`. Probably tells the data-collection stack which hardware bill-of-materials the unit is. |
| `com.byd.gpsinfo` | GpsInfo | system, persistent | GPS service and satellite-status screen. Covers dead-reckoning reset and antenna fault detection. |

### Content providers (tiny, no UI)

| Package | Authority | What it stores |
|---|---|---|
| `com.byd.providers.appops` | `appops` | Autostart allow/deny table used by *Disable Autostart*. |
| `com.byd.providers.carsettings` | `carsettings` | Key/value store for vehicle settings. |
| `com.byd.providers.carstatus` | `com.byd.carStatusProvider` | Maintenance mileage and time, DiCare fluid reminders (brake, coolant, oil), tyre-pressure prompts, trip "travel points". |

---

## Deep dive: less obvious apps

These notes come from reading each app's own source under `extracted/sources/com/byd/...`, not just the manifest.

### Findings worth knowing first

| Where | What |
|---|---|
| `clientconfigurationservice` | An MQTT message with a `cmd` key is run as `sh -c <cmd>` **as the system user**, and the output is uploaded to iDiLink. This is a remote shell for BYD's cloud. |
| `accountservice` | Three exported services with **no permission** (`DOCK_SCREEN_STATE`, `SAVE_READ_FILE`, `GET_CAR_TOKEN`). They return the cloud token from `/data/system/cloud/cloudToken.dat`, read arbitrary system properties, and launch any activity in split screen. The file service reads and writes files as system, but checks the caller's process name against a map-app whitelist. |
| `clusterdebug` | Exported receiver with no permission (`com.byd.cluster.spi`, extras `normal` / `wholeFrame` = comma-separated hex). It writes the bytes to `BYDAutoTestDevice` feature `0xAA00000F`. |
| `appserver` | Copies `persist.sys.adb.wiress.enable` into `sys.connect.adb.wiress` at boot, which turns wireless ADB on. |
| `logswitch` | Sends raw CAN frames (chassis and energy nets) through `BYDAutoVehicleDataDevice` feature `0xAA00001E`. Has the hard-coded password `byd1234`. |
| `byddevelopmenttools` | Local unlock code derived from the IMEI, as an alternative to the cloud QR auth. |
| `trafficmonitor` | Blocks cellular data per UID for apps missing from a cloud whitelist. This explains sideloaded apps having no mobile data. |
| `CanDataCollect` / `acquisitioncontrol` / `clientstatuscollectionservice` / `appserver` | Four separate telemetry paths: raw CAN frames, big-data acquisition, connectivity/DTC status, and user-settings snapshots. |

### Cloud stack: how the pieces fit

```
             iDiLink cloud (idilink*.byd.auto, apr-<region>.byd.auto, <area>-newcan-data.byd.auto)
                         │  MQTT / HTTPS
         native daemons: cloudmanager (native.cloud.manager.service), mqttserv,
                         gbacqservice, deservice (GB/T 32960), acquisition service
          │                    │                         │                    │
 cloudserviceapp      clientconfigurationservice   clientstatuscollection   acquisitioncontrol
 (binder bridge +     (MQTT cmds: config, cmd→sh,  (status/DTC upload,       (daily upload trigger,
  broadcast relay,     reboot, uninstall, OTA)      traffic whitelist)        privacy/user id)
  RDA consent popup)
          │
 apps via broadcast com.byd.cloudmanager.receiver  →  cloud
 cloud → apps via com.byd.cloudmanager.broadcast.<APPID>  (14 = V2G/smart charge, 23 = intelligent entry, …)
```

- `authservice` is the gate for local privileged tools. `otgupdate`, `aftermarketinstalltool`, `byddevelopmenttools` and `logswitch` call `requestAuth`, a QR code is shown, and a technician scans it with VDS or WeCom. The cloud then answers `apr-<region>.byd.auto/authentication/verify`.
- `cota` (cloud resource/config delivery), `otaupdate` / `productlineota` (UIs) and `upgradeserver` (executor) make up the update path. `otgupdate` covers USB-stick updates.

### `com.byd.accountservice`
- `MyApp` watches power level and package installs. When the car powers on, it binds a service in each partner app so they stay alive: automap, naviauto, mycar, etc, yunnian, yisifang, yisanfang, dlc.drivingmode, isatphone, car.icebox, btet.man.car, ultratracker and cmgamecenter. It uses actions such as `com.byd.automap.secret`.
- `DockScreenService` (`IDockScreenInterface`) handles these transaction codes:
  - 1: is split-screen/dock mode active
  - 2: package on the left or right
  - 3: which side a package is docked on
  - 4: `startActivityWhenMultiWindow(pkg, cls)`
  - 5: **cloud token**
  - 6: `SystemProperties.get(key)`
- `MessengerService`: `what=52` replies with `what=27` and the bundle `car_token`.
- `SaveAndReadFileService` (`ISaveAndReadFileInterface`): read file, check whether a file exists, write file. Callers are limited to `com.byd.launchermap`, `com.btet.automap`, `com.byd.automap` and `com.byd.naviauto`, matched by process name.
- `MapProvider`: `content://com.byd.accountservice.provider.mapProvider/map_profile`.
- GameSir controller support: toggles `sys.load_hid_virwifi_game` / `_aux`.

### `com.byd.car.server`
- `CarServiceProvider` is a `BinderProvider`. It calls `Spi.addService(ICarPropertyService, CarPropertyServiceImpl)` and runs every `IModuleInitializer` in priority order. This is the DiCar property backend that `ICarPropertyService_notes.md` describes.
- `com.byd.vem.VehicleContentProvider` implements the Google Maps OEM contract. The URIs are `google_maps_energy/model` and `…/forecast`, `google_maps_settings/content`, `…/ev_trip` and `…/ev_payment_network`, `google_maps_vehicle_profile/content`, and `google_maps_assisted_driving/profile` and `…/state`. The data comes from `com_byd_vem_data`, which can be updated per field or from an "excel" file.
- `com.gpack.*` exposes gear, driving state and car info to a third-party agent (`com.gpack.agent`) through `content://com.gpack.service.provider.VehicleServiceProvider/sync_binder`.

### `com.byd.appserver`
Its modules are started in `AppServerApplication` in this order: AppMain (ESP button and DiPilot notices), WeatherInfoToEcm, DataCollect (about 100 settings IDs in `DataCollectID`, sent through `BYDAcquisitionClient`), CloudDataManager, Vtol, ExhibitionMode, **WifiAdbDebug**, DynaReworkVersion, DefaultLanguage (country → locale and IME: AOSP, iQQi or Sogou), TrafficSign, WadingProtection, TrailerMode, NfcMain, MassageSuspensionWindow, CarStatusMain, TrailerModeMain, ScreenSaverBaBr, HistoricalEnergyConsumption, ConsumptionModel, DoorWindows.

### `com.byd.customserver`
- `StudyAutonomouslyPolicy` / `BydCanfdStudyAutonomouslyPolicy` read vehicle config from the MCU. They write about 200 `CarSettings.UserTableData` keys (`ac_perfume_visible`, `auto_mirror_for_reverse_visible`, `panorama_online`, `model_value`, …) and set `persist.sys.AutoType` / `persist.sys.energytype`. The feature can be switched off with `self_study_switch`. The Auto Study screen shows a history of learned changes, and the offline-config screen shows the raw MCU config hex.
- `TunnelReceiver`: an AutoNavi `AUTONAVI_STANDARD_BROADCAST_SEND` with `EXTRA_ISENTER` sets `AC_TUNNEL_ACCESS_MARK_SET`, switching to recirculation in tunnels.

### `com.byd.clusterdebug`
- The main screen lists cluster commands sent through `AutoContainerManager.sendInfo(1000, id, "")`:
  - 0/1: resume or stop the IVI→cluster video stream
  - 14/15: FPS overlay on or off
  - 19/20: OSD frame sequence
  - 36: ADB screenshot
  - 49/50: ADAS or SR scene (Di6.0)
  - 86/87: HUD menus
  - 108/109: force new or old UI (Di5 Dynasty/Ocean)
  - 200/201: eth0 UDP capture
  - 222/223: consumption UI
- The service manager name varies by platform: `auto_container`, `AutoContainer`, or `AutoContainerManager.init()` for DiLink100f, Di300 and Di150VCP.

### `com.byd.clientconfigurationservice`
MQTT keys and what they do:
- `gb_ip` → GB/T 32960 config
- `vin_valid`
- `cloud_server`
- `cloudservice_enable`
- `reboot_qualcomm`
- `kill_cloudmanager`
- `upload_status_enable`
- `clean_gb_data` / `clean_apn2_data` / `clean_xcall_data`
- `apr_server_address` → `persist.service.host.name`
- **`cmd`** → shell
- `client_config` / `module_switch` → per-module switches in `sys.module.config`
- `ota` → `com.byd.padota.broadcast.automatic`
- `gbUrl`
- `ask_adc`
- non-JSON payload → MQTT broker list (`/collect2/mqtt/brokerlistnew`)

Uninstall list: fetched from `<base>/remotediagnosis-api/app/dump/info` (headers vin/sign/ts) or pushed over MQTT. The fallback list is `res/values/arrays.xml` → `com.byd.byddiagnosetool`.

### `com.byd.authservice`
QR payload: `{vid, qrTime, taskId, type, version:"V1", countryCode, qrValue}`. `qrValue` is VIN and IMEI encrypted with AES-CBC, using a PBKDF2-SHA256 key (2047 iterations, salt `byd_auth`). If the VIN is invalid, a pseudo-VIN `TC` + the last 15 ICCID digits is used instead. The domain is picked per country code from `assets/DataCenter.json` and defaults to `apr-eu.byd.auto`.

### `com.byd.CanDataCollect`
Config and data paths are under `/collect2/dataCollect/` (`canConfigureJson`, `datacollectioncfg`, `VEHICLE_PERIOD_DATA`, `VEHICLE_EVENT_DATA`, `*_ZIP_TEMP`). CAN frames arrive through `BYDAutoBigDataDevice.onWholeFrameDataChanged`. Setting a test property switches to the `eu-testnewcan-data.byd.auto:8086` endpoints. `logswitch` can extract and parse these files.

---

## Not decompiled (94)

Pulled only. These are grouped by origin, and their descriptions come from the package names and standard platform knowledge, not from analysis.

### Third-party apps (sideloaded or bundled)

| Package | What it is |
|---|---|
| `com.telenav.app.arp` | Telenav navigation (likely the OEM nav app) |
| `com.google.android.projection.sink` | Android Auto receiver (head-unit side) |
| `com.iqqijni.car.keyboard` | iQQi car keyboard (IME) |
| `com.example.amapservice` | AMap (Gaode) location/map service stub |
| `com.ex.dabplayer.pad`, `com.fd.service.dab`, `com.hcc.dabservice` | Supplier DAB player/services |
| `com.dsi.ant.server` | ANT+ radio service |
| `com.idd.hidps` | IDD HID/peripheral service |
| `com.xdja.containerservice` | XDJA secure-container service |

### Qualcomm / CodeAurora platform

`com.qti.*`, `com.qualcomm.*`, `org.codeaurora.ims`: Snapdragon platform services for IMS/VoLTE, the RIL message tunnel, UIM/SIM settings, remote SIM lock, location, Wi-Fi Display (`wfd.service`), color/display tuning (`qcolor`, `colorservice`), secure UI, workload classifier, and dynamic DDS.

### Stock AOSP (Android 10)

`android` (framework-res), `android.ext.*`, and `com.android.*`: standard platform packages (SystemUI, Launcher3, Settings Intelligence, Bluetooth, telephony/Telecom, providers, package installer, permission controller, WebView, and so on).