# BYD Tablet Decompiled: Decompiled all BYD apps from an BYD Atto 3 running DiLink 3.0 from the car tablet to allow for Android Dev 

# Why?
I have been wanting to build an app for the BYD in car tablet but the device has security blocking getting any data from car. 
I wanted to see what the % of break vs regenerative breaking but now have tried to understand how the Car System is working.
There is also no SDK for android so I have built one. 

# What?: 
* [List of all the BYD apps and what they do](https://github.com/adricl/byd-tablet-decompiled/blob/main/BYD_apps.md) and what each app does based on the decompilation
  - Cameras, surround view, DVR Apps
  - Media, radio, entertainment Apps
  - Phone, Bluetooth, connectivity, projection Apps
  - Settings, UI, themes Apps
  - Accounts, cloud, telemetry
  - OTA / upgrades
  - Engineering, diagnostics, factory tools
  - Vehicle control and core vehicle services
  - Content providers (tiny, no UI)
* [Android SDK Stubs](https://github.com/adricl/byd-tablet-decompiled/blob/main/byd-framework-stubs/README.md) for all the BYD Framework to allow for development of apps
  - Stubs for all the different features, AirConditiong, Audio, ADAS, Charging, Door Locking ect.
* [List of all the signals](https://github.com/adricl/byd-tablet-decompiled/blob/main/BYD_Vehicle_Signals.md) that the BYD Car Server DiCarServer.apk (com.byd.car.server)
  - All the signals you can access from the DiCarServer via IPC (Binder / ContentResolver) 
* [BYD signal Architecture](https://github.com/adricl/byd-tablet-decompiled/blob/main/BYD_DiLink_Architecture.md)
  - Physical Vehicle Can Bus -> MCU on the Android Device that reads the CAN bus -> Android HAL Layer -> DiCarServer car server


# Android SDK
## How to use it in an Android project

Copy the jar (and its sources jar) into `app/libs/`, then add:

```kotlin
// app/build.gradle.kts
dependencies {
    compileOnly(files("libs/byd-framework-stubs.jar"))
}
```

