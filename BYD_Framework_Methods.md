# BYDAuto device API → feature ID map

Generated 2026-09-19 for protocol **CANFD**.

Each `BYDAuto*Device` getter/setter in the car's framework reads or writes one or more `BYDAutoFeatureIds` values through `AbsBYDAutoDevice.get/getDouble/set(...)`. The key column is the same hex key used in `BYD_Vehicle_Signals.csv`, so a method can be looked up there by feature name or key. Keys are for the protocol above (most IDs differ on non-CAN-FD / Toyota-protocol cars).

**1024 methods** across 46 devices; 948 resolve to at least one feature ID.

*Resolution*: `direct` — the method body names the ID; `via x()` — it delegates to another method of the class; `none` — no ID found (e.g. computed from arguments or handled by a listener).

## Devices

- [BYDAutoADASDevice](#bydautoadasdevice) — `android.hardware.bydauto.adas.BYDAutoADASDevice` — 47 methods
- [BYDAutoAcDevice](#bydautoacdevice) — `android.hardware.bydauto.ac.BYDAutoAcDevice` — 70 methods
- [BYDAutoAudioDevice](#bydautoaudiodevice) — `android.hardware.bydauto.audio.BYDAutoAudioDevice` — 46 methods
- [BYDAutoAuxDevice](#bydautoauxdevice) — `android.hardware.bydauto.auxiliary.BYDAutoAuxDevice` — 4 methods
- [BYDAutoBigDataDevice](#bydautobigdatadevice) — `android.hardware.bydauto.bigdata.BYDAutoBigDataDevice` — 1 methods
- [BYDAutoBodyworkDevice](#bydautobodyworkdevice) — `android.hardware.bydauto.bodywork.BYDAutoBodyworkDevice` — 41 methods
- [BYDAutoChargingDevice](#bydautochargingdevice) — `android.hardware.bydauto.charging.BYDAutoChargingDevice` — 53 methods
- [BYDAutoCollisionDevice](#bydautocollisiondevice) — `android.hardware.bydauto.collision.BYDAutoCollisionDevice` — 2 methods
- [BYDAutoCpuTempratureDevice](#bydautocputempraturedevice) — `android.hardware.bydauto.cputemprature.BYDAutoCpuTempratureDevice` — 5 methods
- [BYDAutoDoorLockDevice](#bydautodoorlockdevice) — `android.hardware.bydauto.doorlock.BYDAutoDoorLockDevice` — 1 methods
- [BYDAutoEnergyDevice](#bydautoenergydevice) — `android.hardware.bydauto.energy.BYDAutoEnergyDevice` — 14 methods
- [BYDAutoEngineDevice](#bydautoenginedevice) — `android.hardware.bydauto.engine.BYDAutoEngineDevice` — 15 methods
- [BYDAutoFuncNoticeDevice](#bydautofuncnoticedevice) — `android.hardware.bydauto.funcnotice.BYDAutoFuncNoticeDevice` — 4 methods
- [BYDAutoGBDevice](#bydautogbdevice) — `android.hardware.bydauto.gb.BYDAutoGBDevice` — 2 methods
- [BYDAutoGearboxDevice](#bydautogearboxdevice) — `android.hardware.bydauto.gearbox.BYDAutoGearboxDevice` — 14 methods
- [BYDAutoInstrumentDevice](#bydautoinstrumentdevice) — `android.hardware.bydauto.instrument.BYDAutoInstrumentDevice` — 166 methods
- [BYDAutoLightDevice](#bydautolightdevice) — `android.hardware.bydauto.light.BYDAutoLightDevice` — 19 methods
- [BYDAutoLocationDevice](#bydautolocationdevice) — `android.hardware.bydauto.location.BYDAutoLocationDevice` — 3 methods
- [BYDAutoMotorDevice](#bydautomotordevice) — `android.hardware.bydauto.motor.BYDAutoMotorDevice` — 11 methods
- [BYDAutoMultimediaDevice](#bydautomultimediadevice) — `android.hardware.bydauto.multimedia.BYDAutoMultimediaDevice` — 11 methods
- [BYDAutoOtaDevice](#bydautootadevice) — `android.hardware.bydauto.ota.BYDAutoOtaDevice` — 21 methods
- [BYDAutoPM2p5Device](#bydautopm2p5device) — `android.hardware.bydauto.pm2p5.BYDAutoPM2p5Device` — 13 methods
- [BYDAutoPanoramaDevice](#bydautopanoramadevice) — `android.hardware.bydauto.panorama.BYDAutoPanoramaDevice` — 33 methods
- [BYDAutoPhoneDevice](#bydautophonedevice) — `android.hardware.bydauto.phone.BYDAutoPhoneDevice` — 7 methods
- [BYDAutoPowerDevice](#bydautopowerdevice) — `android.hardware.bydauto.power.BYDAutoPowerDevice` — 13 methods
- [BYDAutoQcfsDevice](#bydautoqcfsdevice) — `android.hardware.bydauto.qcfs.BYDAutoQcfsDevice` — 6 methods
- [BYDAutoRSEDevice](#bydautorsedevice) — `android.hardware.bydauto.rse.BYDAutoRSEDevice` — 1 methods
- [BYDAutoRadarDevice](#bydautoradardevice) — `android.hardware.bydauto.radar.BYDAutoRadarDevice` — 12 methods
- [BYDAutoRadioDevice](#bydautoradiodevice) — `android.hardware.bydauto.radio.BYDAutoRadioDevice` — 7 methods
- [BYDAutoRearViewMirrorDevice](#bydautorearviewmirrordevice) — `android.hardware.bydauto.doormirror.BYDAutoRearViewMirrorDevice` — 2 methods
- [BYDAutoReminderDevice](#bydautoreminderdevice) — `android.hardware.bydauto.reminder.BYDAutoReminderDevice` — 2 methods
- [BYDAutoRescueDevice](#bydautorescuedevice) — `android.hardware.bydauto.rescue.BYDAutoRescueDevice` — 3 methods
- [BYDAutoSafetyBeltDevice](#bydautosafetybeltdevice) — `android.hardware.bydauto.safetybelt.BYDAutoSafetyBeltDevice` — 6 methods
- [BYDAutoSecurityDevice](#bydautosecuritydevice) — `android.hardware.bydauto.security.BYDAutoSecurityDevice` — 3 methods
- [BYDAutoSensorDevice](#bydautosensordevice) — `android.hardware.bydauto.sensor.BYDAutoSensorDevice` — 6 methods
- [BYDAutoSettingDevice](#bydautosettingdevice) — `android.hardware.bydauto.setting.BYDAutoSettingDevice` — 244 methods
- [BYDAutoSignalDevice](#bydautosignaldevice) — `android.hardware.bydauto.signal.BYDAutoSignalDevice` — 2 methods
- [BYDAutoSpecialDevice](#bydautospecialdevice) — `android.hardware.bydauto.special.BYDAutoSpecialDevice` — 3 methods
- [BYDAutoSpeedDevice](#bydautospeeddevice) — `android.hardware.bydauto.speed.BYDAutoSpeedDevice` — 8 methods
- [BYDAutoStatisticDevice](#bydautostatisticdevice) — `android.hardware.bydauto.statistic.BYDAutoStatisticDevice` — 47 methods
- [BYDAutoTestDevice](#bydautotestdevice) — `android.hardware.bydauto.test.BYDAutoTestDevice` — 9 methods
- [BYDAutoTimeDevice](#bydautotimedevice) — `android.hardware.bydauto.time.BYDAutoTimeDevice` — 14 methods
- [BYDAutoTyreDevice](#bydautotyredevice) — `android.hardware.bydauto.tyre.BYDAutoTyreDevice` — 12 methods
- [BYDAutoVersionDevice](#bydautoversiondevice) — `android.hardware.bydauto.version.BYDAutoVersionDevice` — 16 methods
- [BYDAutoWiperDevice](#bydautowiperdevice) — `android.hardware.bydauto.wiper.BYDAutoWiperDevice` — 4 methods
- [BYDAutoYunDevice](#bydautoyundevice) — `android.hardware.bydauto.yun.BYDAutoYunDevice` — 1 methods

## BYDAutoADASDevice

`android.hardware.bydauto.adas.BYDAutoADASDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getAEBState()` | R | `ADAS_AEB_STATE` `0x32d0002c` | direct |
| `int getAVHState()` | R | `ADAS_AVH_STATE` `0x12200046` | direct |
| `int getAVMSwitchState()` | R | `ADAS_AVM_APA_SWITCH` `0x1d100026` | direct |
| `int getAbortReason()` | R | `ADAS_AVM_APA_ABORT_REASON` `0x1d100013` | direct |
| `int getActive()` | R | `ADAS_AVM_APA_ACTIVE` `0x1d100020` | direct |
| `int getAutoParkButtonState()` | R | `ADAS_AVM_APA_KEY` `0x4a900014` | direct |
| `int getAutoSearchState()` | R | `ADAS_AVM_APA_AUTOSEARCH_STATE` `0x1d100010` | direct |
| `int getBSDState()` | R | `ADAS_BSD_STATE` `0x41800008` | direct |
| `int getBrakeFootSenseState()` | R | `ADAS_CMD_BRAKE_FOOT_SENSE` `0x1230000d` | direct |
| `int getCSTData()` | R | `ADAS_CMD_CST_SWITCH` `0x0d500018` | direct |
| `int getCSTState()` | R | `ADAS_CMD_CST_SWITCH` `0x0d500018` | direct |
| `int getESPOnlineState()` | R | `ADAS_HAS_ESP` `0x3210003a` | direct |
| `int getESPState()` | R | `ADAS_ESP_STATE` `0x1230003c` | direct |
| `int getHDCKeyState()` | R | `ADAS_CMD_ADAS_HDC_KEY` `0x4a900036` | direct |
| `int getHDCState()` | R | `ADAS_CMD_HDC_STATE` `0x12300031` | direct |
| `int getHMAState()` | R | `ADAS_HMA_STATE` `0x31600008` | direct |
| `int getIboosterState()` | R | `ADAS_IBOOSTER_STATE` `0x000d0a58` | direct |
| `int getInterActiveHint()` | R | `ADAS_AVM_APA_INTERACTIVE_HINT` `0x1d10000c` | direct |
| `int getLDSWType()` | R | `ADAS_LDSW_TYPE` `0x31600038` | direct |
| `int getLKSMode()` | R | `ADAS_LKS_MODE` `0x3160000e` | direct |
| `int getLKSSensitivity()` | R | `ADAS_LKS_SENSITIVITY` `0x31600010` | direct |
| `int getLaneOffsetState()` | R | `ADAS_LANE_OFFSET_KEY` `0x4a900010` | direct |
| `int getPCWState()` | R | `ADAS_PCW_STATE` `0x32d0001a` | direct |
| `int getSLAState()` | R | `ADAS_SLA_STATE` `0x31600025` | direct |
| `int getSuspen()` | R | `ADAS_AVM_APA_SUSPEND` `0x1d100008` | direct |
| `int getTJAState()` | R | `ADAS_TJA_ICA_STATE_hal_only` `0xb160002c` | direct |
| `int hasFeature(String feature)` | R | `ADAS_CMD_CST_ONLINE` `0x0d50001e`<br>`ADAS_HAS2_FCW` `0x4320000a`<br>`ADAS_HAS2_AEB` `0x43200009`<br>`ADAS_HAS_LKS_MODE` `0x000b37c5`<br>`ADAS_HAS_LKS_SENSITIVITY` `0x0001b109`<br>`ADAS_HAS_LDSW` `0x43200014`<br>`ADAS_HAS_BSD` `0x41800000`<br>`ONLINE_HAS_0x041800` `0x41800000`<br>… +5 more | direct |
| `int hasFeature2(String feature)` | R | `ADAS_CMD_CST_ONLINE` `0x0d50001e`<br>`ADAS_HAS2_LDW` `0x4320000c`<br>`ADAS_HAS2_LKS` `0x4320000d`<br>`ADAS_HAS2_TJA` `0x4320000f` | direct |
| `int setAEBState(int state)` | W | `ADAS_AEB_STATE_SET` `0x3850002c` | direct |
| `int setAVHState(int state)` | W | `ADAS_AVH_STATE_SET` `0x3850000a` | direct |
| `int setAVMSwitchState(int state)` | W | `ADAS_AVM_APA_SWITCH_SET` `0x3850001a` | direct |
| `int setAdasReset(int safetyResetState, int lksLdwsResetState, int driveResetState)` | W | `ADAS_SAFETY_RESET_SET` `0x3e30003f`<br>`ADAS_LKS_LDWS_RESET_SET` `0x3e300041`<br>`ADAS_DRIVE_RESET_SET` `0x3e300040` | direct |
| `int setBSDState(int state)` | W | `BODYWORK_AUTO_TYPE` `0x40d00010`<br>`ADAS_BSD_CONFIG` `0x4530000c`<br>`ADAS_BSD_STATE_SET` `0x38500030`<br>`ADAS_RCTA_STATE_SET` `0x3850000e`<br>`ADAS_DOW_STATE_SET` `0x38500012`<br>`ADAS_ECTB_STATE_SET` `0x3850001e` | direct |
| `int setBSDStaticCalibration(int value)` | W | `ADAS_BSD_STATIC_CALIBRATION_SET` `0x38500032` | direct |
| `int setBrakeFootSenseState(int state)` | W | `ADAS_CMD_BRAKE_FOOT_SENSE_SET` `0x3850000c` | direct |
| `int setCSTState(int state)` | W | `ADAS_CMD_CST_SWITCH_SET` `0x38500018` | direct |
| `int setESPState(int state)` | W | `ADAS_ESP_STATE_SET` `0x38500008` | direct |
| `int setHDCState(int state)` | W | `ADAS_CMD_HDC_SWITCH_SET` `0x38500016` | direct |
| `int setHMAState(int state)` | W | `ADAS_HMA_STATE_SET` `0x38500020` | direct |
| `int setIboosterState(int state)` | W | `ADAS_IBOOSTER_STATE_SET` `0x3850000c` | direct |
| `int setLDSWType(int type)` | W | `ADAS_LDSW_TYPE_SET` `0x3850002e` | direct |
| `int setLDWStaticCalibration(int value)` | W | `ADAS_LDW_STATIC_CALIBRATION_SET` `0x38500033` | direct |
| `int setLKSMode(int mode)` | W | `ADAS_LKS_MODE_SET` `0x38500028` | direct |
| `int setLKSSensitivity(int sensitivity)` | W | `ADAS_LKS_SENSITIVITY_SET` `0x38500024` | direct |
| `int setPCWState(int state)` | W | `ADAS_PCW_STATE_SET` `0x38500026` | direct |
| `int setSLAState(int state)` | W | `ADAS_SLA_STATE_SET` `0x38500022` | direct |
| `int setTJAState(int state)` | W | `ADAS_TJA_ICA_SWITCH_SET` `0x38500014` | direct |

## BYDAutoAcDevice

`android.hardware.bydauto.ac.BYDAutoAcDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getAcCompressorManualSign()` | R | `AC_COMPRESSOR_MANUAL_SIGN` `0x4040000a` | direct |
| `int getAcCompressorMode()` | R | `AC_COMPRESSOR_MODE` `0x40400009` | direct |
| `int getAcControlMode()` | R | `AC_CTRL_MODE` `0x40400012` | direct |
| `int getAcCycleMode()` | R | `AC_CYCLE_MODE` `0x40400014` | direct |
| `int getAcDefrostOnlineState()` | R | `AC_CMD_AC_DEFROST_5S_ONLINE` `0x43400000` | direct |
| `int getAcDefrostState(int area)` | R | `AC_DEFROST_FRONT_STATE` `0x40400016`<br>`AC_DEFROST_REAR_STATE` `0x43400031` | direct |
| `int getAcFaultNumShownState()` | R | `AC_FAULT_NUM_SHOWN_STATE` `0x40400040` | direct |
| `int getAcKeyActionState()` | R | `AC_KEY_ACTION_STATE` `0x40400022` | direct |
| `int getAcMaxCoolingState()` | R | `AC_MAX_COOLING_STATE` `0x4e600014` | direct |
| `int getAcOnlineState()` | R | `AC_ONLINE_STATE` `0x40400000` | direct |
| `int getAcPanelLockPromptState()` | R | `AC_REAR_PANEL_LOCK_HINT` `0x3f100010` | direct |
| `int getAcPromptBoxShownState()` | R | `AC_PROMPT_BOX_SHOWN_STATE` `0x40400020` | direct |
| `int getAcPtcPreheatSignal()` | R | `AC_PTC_PREHEAT_SIGNAL` `0x4e600026` | direct |
| `int getAcRearPaneNotAvailableMenuState()` | R | `AC_REAR_NOT_AVAILABLE_MENU` `0x3f10000b` | direct |
| `int getAcRearPanelLockState()` | R | `AC_REAR_PANEL_LOCK` `0x3f100009` | direct |
| `int getAcRemoteCtrlTime()` | R | `AC_REMOTE_CTRL_TIME` `0x43400032` | direct |
| `int getAcStartState()` | R | `AC_POWER_STATE` `0x40400010` | direct |
| `int getAcSubBatteryTemperature()` | R | `AC_CMD_OTA_SUB_BATTERY_TEMPRATURE` `0x44900028` | direct |
| `int getAcTemperatureControlMode()` | R | `AC_TEMPCTRL_SEPARATE_STATE` `0x40400024` | direct |
| `int getAcType()` | R | `AC_TYPE` `0x4330001c` | direct |
| `int getAcVentilationState()` | R | `AC_VENTILATION_STATE` `0x4e60000a` | direct |
| `int getAcWarmState()` | R | `AC_WARM_STATE` `0x4e60003c` | direct |
| `int getAcWarmTypeOnlineState()` | R | `AC_WARM_TYPE_FLAG` `0x43300020` | direct |
| `int getAcWindLevel()` | R | `AC_WIND_LEVEL` `0x4040001c` | direct |
| `int getAcWindLevelManualSign()` | R | `AC_WINDLEVEL_MANUAL_SIGN` `0x4040000c` | direct |
| `int getAcWindMode()` | R | `AC_WIND_MODE` `0x40400018` | direct |
| `int getAcWindModeManualSign()` | R | `AC_WINDMODE_MANUAL_SIGN` `0x4040000b` | direct |
| `int getAcWindModeNum()` | R | `AC_WIND_MODE_NUM` `0x4330001e` | direct |
| `int getAcWindModeShownState()` | R | `AC_WINDMODE_SHOWN_STATE` `0x0009790f` | direct |
| `int getAirQualityCtrlMenuState()` | R | `AC_AIR_QUAL_CTRL_MENU_STATE` `0x00014af4` | direct |
| `List<String> getAllFragranceNames(int language)` | R |  | none |
| `void getAllStatus()` | R |  | none |
| `int getAutoCleanAirState()` | R | `AC_AUTO_CLEAN_AIR` `0x4d902026` | direct |
| `int getDefrostRearConfig()` | R | `AC_DEFROST_REAR_CONFIG` `0x43400038` | direct |
| `int getHighTempAntivirusCountDown()` | R | `AC_HIGH_TEMP_ANTIVIRUS_COUNT_DOWN` `0x3da00038` | direct |
| `int getHighTempAntivirusState()` | R | `AC_HIGH_TEMP_ANTIVIRUS_STATE` `0x3da00034` | direct |
| `List<String> getInstalledFragranceNames(int language)` | R | `AC_FIRST_PERFUME_INSTALLATION_STATUS` `0x4a100034`<br>`AC_THE_FIRST_PERFUME_NAME_ABBR` `0x4a100050`<br>`AC_THE_FIRST_PERFUME_NAME_ABBR_2ND` `0x4a100060`<br>`AC_SECOND_PERFUME_INSTALLATION_STATUS` `0x4a100036`<br>`AC_THE_SECOND_PERFUME_NAME_ABBR` `0x4a100090`<br>`AC_THE_SECOND_PERFUME_NAME_ABBR_2ND` `0x4a1000a0`<br>`AC_THIRD_PERFUME_INSTALLATION_STATUS` `0x4a100038`<br>`AC_THE_THIRD_PERFUME_NAME_ABBR` `0x4a1000d0`<br>… +1 more | direct |
| `int getQuickCleanAirState()` | R | `AC_QUICK_CLEAN_AIR` `0x3da00008` | direct |
| `int getQuickCleanTip()` | R | `AC_QUICK_CLEAN_AIR_TIP` `0x3da0000a` | direct |
| `int getRearAcControlMode()` | R | `AC_REAR_CTRL_MODE` `0x48a0000e` | direct |
| `int getRearAcLockState()` | R | `AC_REAR_LOCK_STATE` `0x4e600016` | direct |
| `int getRearAcMaxWindLevel()` | R | `AC_REAR_MAX_WIND_LEVEL` `0x43300014` | direct |
| `int getRearAcStartState()` | R | `AC_REAR_POWER_STATE` `0x48a0000c` | direct |
| `int getRearAcWindLevel()` | R | `AC_REAR_WIND_LEVEL` `0x48a00008` | direct |
| `int getRearAcWindMode()` | R | `AC_REAR_WIND_MODE` `0x48a00018` | direct |
| `int getTemperatureUnit()` | R | `AC_TEMPERATURE_UNIT` `0x40400027` | direct |
| `int getTemprature(int area)` | R | `AC_TEMP_MAIN` `0x40400028`<br>`AC_TEMP_DEPUTY` `0x40400030`<br>`AC_TEMP_OUT` `0x40400038`<br>`AC_TEMP_REAR` `0x48a00010` | direct |
| `int getVoiceCmdResult()` | R | `AC_VOICE_CMD_RESULT` `0x2db0001c` | direct |
| `int hasFeature(String feature)` | R | `AC_HAS_AC_AUTO_MODE` `0xcd902018`<br>`AC_HAS_AC_REMOTE_CTRL` `0xc3400032`<br>`ONLINE_HAS_0x044900` `0x44900000`<br>`AC_WARM_TYPE_FLAG` `0x43300020`<br>`AC_HAS_AC_DEFROST` `0x0000e051`<br>`AC_REAR_PANEL_3F1_ONLINE` `0x3f100000`<br>`ONLINE_HAS_0x03F100` `0x3f100000`<br>`AC_REAR_PANEL_408_ONLINE` `0x40800008` | direct |
| `int setAcCompressorMode(int setSource, int mode)` | W | `AC_COMPRESSOR_MODE_SET` `0x1de00010`<br>`AC_CTRL_SOURCE_SET` `0x1de00015` | direct |
| `int setAcControlMode(int setSource, int mode)` | W | `AC_CTRL_MODE_SET` `0x1de00018`<br>`AC_CTRL_SOURCE_SET` `0x1de00015` | direct |
| `int setAcCycleMode(int setSource, int mode)` | W | `AC_CYCLE_MODE_SET` `0x1de0001b`<br>`AC_CTRL_SOURCE_SET` `0x1de00015` | direct |
| `int setAcDefrostState(int setSource, int area, int state)` | W | `AC_DEFROST_FRONT_STATE_SET` `0x1de00022`<br>`AC_DEFROST_REAR_STATE_SET` `0x1de0001d`<br>`AC_CTRL_SOURCE_SET` `0x1de00015` | direct |
| `int setAcMaxCoolingState(int state)` | W | `AC_MAX_COOLING_STATE_SET` `0x4fc0001c` | direct |
| `int setAcRearPanelLockState(int value)` | W | `AC_REAR_PANEL_LOCK_SET` `0x4fc0002c` | direct |
| `int setAcRemoteCtrlTime(int value)` | W | `AC_REMOTE_CTRL_TIME_SET` `0x4df00040` | direct |
| `int setAcTemperature(int type, int value, int tempSource, int unit)` | W | `AC_TEMPERATURE_UNIT_SET` `0x1de00040`<br>`AC_TEMP_MAIN_SET` `0x1de00028`<br>`AC_TEMP_DEPUTY_SET` `0x1de00030`<br>`AC_TEMP_REAR_SET` `0x1de00038`<br>`AC_CTRL_SOURCE_SET` `0x1de00015` | direct |
| `int setAcTemperatureControlMode(int setSource, int mode)` | W | `AC_TEMPCTRL_SEPARATE_STATE_SET` `0x1de00012`<br>`AC_CTRL_SOURCE_SET` `0x1de00015` | direct |
| `int setAcVentilationState(int setSource, int state)` | W | `AC_VENTILATION_STATE_SET` `0x1de00042`<br>`AC_CTRL_SOURCE_SET` `0x1de00015` | direct |
| `int setAcWarmState(int state)` | W | `AC_WARM_STATE_SET` `0x4fc0002a` | direct |
| `int setAcWindLevel(int setSource, int level)` | W | `AC_WIND_LEVEL_SET` `0x1de0000c`<br>`AC_CTRL_SOURCE_SET` `0x1de00015` | direct |
| `int setAcWindMode(int setSource, int mode)` | W | `AC_WIND_MODE_SET` `0x1de00008`<br>`AC_CTRL_SOURCE_SET` `0x1de00015` | direct |
| `void setAllStatus()` | W |  | none |
| `int setAutoCleanAirState(int state)` | W | `AC_AUTO_CLEAN_AIR_SET` `0x4fc00010` | direct |
| `int setFragrance(String fraNameParam, int fraLevelParam)` | W | `AC_FIRST_PERFUME_INSTALLATION_STATUS` `0x4a100034`<br>`AC_SECOND_PERFUME_INSTALLATION_STATUS` `0x4a100036`<br>`AC_THIRD_PERFUME_INSTALLATION_STATUS` `0x4a100038`<br>`AC_THE_FIRST_PERFUME_NAME_ABBR` `0x4a100050`<br>`AC_THE_FIRST_PERFUME_SURPLUS` `0x4a100018`<br>`AC_THE_FIRST_PERFUME_SURPLUS_ALERT` `0x4a10001f`<br>`AC_THE_SECOND_PERFUME_NAME_ABBR` `0x4a100090`<br>`AC_THE_SECOND_PERFUME_SURPLUS` `0x4a100020`<br>… +6 more | direct |
| `int setQuickCleanAirState(int state)` | W | `AC_QUICK_CLEAN_AIR_SET` `0x4f500010` | direct |
| `int setRearAcControlMode(int setSource, int mode)` | W | `AC_REAR_CTRL_MODE_SET` `0x4fc0000e`<br>`AC_CTRL_SOURCE_SET` `0x1de00015` | direct |
| `int setRearAcLockState(int state)` | W | `AC_REAR_LOCK_STATE_SET` `0x4fc0001e` | direct |
| `int setRearAcWindLevel(int setSource, int level)` | W | `AC_REAR_WIND_LEVEL_SET` `0x4fc00008`<br>`AC_CTRL_SOURCE_SET` `0x1de00015` | direct |
| `int setRearAcWindMode(int setSource, int mode)` | W | `AC_REAR_WIND_MODE_SET` `0x4fc00018`<br>`AC_CTRL_SOURCE_SET` `0x1de00015` | direct |

## BYDAutoAudioDevice

`android.hardware.bydauto.audio.BYDAutoAudioDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getArkamysMode()` | R | `AUDIO_CMD_ARKAMYS_SOUNDSTAGE_MODE` `0x42b00015` | direct |
| `int getArkamysModeForLearn()` | R | `AUDIO_HAS_ARKAMYS_SOUNDSTAGE_MODE` `0xc2b00015` | direct |
| `int getArkamysState()` | R | `AUDIO_CMD_ARKAMYS_SOUNDSTAGE_WOOFER` `0x42b0000e` | direct |
| `int getAudioMicAmpGain()` | R | `AUDIO_MIC_AMP_GAIN` `0x42b00008` | direct |
| `int getBeamForm()` | R | `AUDIO_CMD_BEAM_FORM` `0x42b0001d` | direct |
| `int getChannel()` | R | `AUDIO_CHANNEL` `0x42100028` | direct |
| `int getDiracLiveMode()` | R | `AUDIO_DIRAC_LIVE_STAGE` `0x4210001c` | direct |
| `int getDiracLiveModeForLearn()` | R | `AUDIO_HAS_DIRAC_LIVE_STAGE` `0xc210001c` | direct |
| `int getDiracLiveState()` | R | `AUDIO_DIRAC_LIVE` `0x4210001e` | direct |
| `int getEqualizer(int frequencyNum)` | R | `AUDIO_EQUALIZER_FREQUENCY_1` `0x4210002a`<br>`AUDIO_EQUALIZER_FREQUENCY_2` `0x4210002f`<br>`AUDIO_EQUALIZER_FREQUENCY_3` `0x42100034`<br>`AUDIO_EQUALIZER_FREQUENCY_4` `0x42100039`<br>`AUDIO_EQUALIZER_FREQUENCY_5` `0x4210003e` | direct |
| `int getIflytekFunctionMode()` | R | `AUDIO_IFLYTEK_FUNCTION_MODE` `0x42400008` | direct |
| `int getIflytekWorkMode()` | R | `AUDIO_IFLYTEK_WORK_MODE` `0x4240000b` | direct |
| `int getKaraokeEqualizer(int EqualizerID)` | R | `AUDIO_KARA_OK_EQ1` `0x42b00010`<br>`AUDIO_KARA_OK_EQ2` `0x42b00018`<br>`AUDIO_KARA_OK_EQ3` `0x42b00020` | direct |
| `int getLoudnessState()` | R | `AUDIO_LOUDNESS` `0x42100020` | direct |
| `int getLoudspeakerNum()` | R | `AUDIO_LOUDSPEAKER_NUM` `0x42100044` | direct |
| `int getMusicChangeSource()` | R | `AUDIO_MUSIC_CHANGE_SOURCE` `0x9900004c` | direct |
| `int getMuteState()` | R | `AUDIO_MUTE_STATUS` `0x4210000e` | direct |
| `int getNaviMuteState()` | R | `AUDIO_NAVI_MUTE_STATUS` `0x42100023` | direct |
| `int getNaviVolume()` | R | `AUDIO_NAVI_VOLUME` `0x42100024` | direct |
| `int getSoundEffect()` | R | `AUDIO_SOUND_EFFECT` `0x42100018` | direct |
| `int[] getSoundField()` | R | `AUDIO_X_SOUND_FIELD` `0x42100010`<br>`AUDIO_Y_SOUND_FIELD` `0x42100014` | direct |
| `int getVolume()` | R | `AUDIO_VOLUME` `0x42100008` | direct |
| `int getVolumeCtrlMode()` | R | `AUDIO_VOLUME_CTRL_MODE` `0x9900004e` | direct |
| `int getVolumeSettingsource()` | R | `AUDIO_VOLUME_SOURCE` `0x000a66a4` | direct |
| `int setAmbientLightFreq(int[] value)` | W | `AUDIO_SPECTRUM_FREQ1_SET` `0x2e300008`<br>`AUDIO_SPECTRUM_FREQ2_SET` `0x2e30000c`<br>`AUDIO_SPECTRUM_FREQ3_SET` `0x2e300010`<br>`AUDIO_SPECTRUM_FREQ4_SET` `0x2e300014`<br>`AUDIO_SPECTRUM_FREQ5_SET` `0x2e300018`<br>`AUDIO_SPECTRUM_FREQ6_SET` `0x2e30001c`<br>`AUDIO_SPECTRUM_FREQ7_SET` `0x2e300020`<br>`AUDIO_SPECTRUM_FREQ8_SET` `0x2e300024`<br>… +8 more | direct |
| `int setArkamysMode(int mode)` | W | `AUDIO_CMD_ARKAMYS_SOUNDSTAGE_MODE_SET` `0x4e06b010` | direct |
| `int setArkamysState(int state)` | W | `AUDIO_CMD_ARKAMYS_SOUNDSTAGE_WOOFER_SET` `0x4e06b020` | direct |
| `int setAudioMicAmpGain(int value)` | W | `AUDIO_MIC_AMP_GAIN_SET` `0x4e068010` | direct |
| `int setBeamForm(int form)` | W | `AUDIO_CMD_BEAM_FORM_SET` `0x4e06e010` | direct |
| `int setChannel(int channelId)` | W | `AUDIO_CHANNEL_SET` `0x4e091010` | direct |
| `int setDiracLiveMode(int mode)` | W | `AUDIO_DIRAC_LIVE_STAGE_SET` `0x4e0b0010` | direct |
| `int setDiracLiveState(int state)` | W | `AUDIO_DIRAC_LIVE_SET` `0x4e06a010` | direct |
| `int setEqualizer(int frequencyNum, int percent)` | W | `AUDIO_EQUALIZER_FREQUENCY_1_SET` `0x4e066010`<br>`AUDIO_EQUALIZER_FREQUENCY_2_SET` `0x4e066018`<br>`AUDIO_EQUALIZER_FREQUENCY_3_SET` `0x4e066020`<br>`AUDIO_EQUALIZER_FREQUENCY_4_SET` `0x4e066028`<br>`AUDIO_EQUALIZER_FREQUENCY_5_SET` `0x4e066030` | direct |
| `int setIflytekFunctionMode(int mode)` | W | `AUDIO_IFLYTEK_FUNCTION_MODE_SET` `0x4e081010` | direct |
| `int setIflytekWorkMode(int mode)` | W | `AUDIO_IFLYTEK_WORK_MODE_SET` `0x4e082010` | direct |
| `int setKaraokeEqualizer(int EqualizerID, int value)` | W | `AUDIO_KARA_OK_EQ1_SET` `0x4e069010`<br>`AUDIO_KARA_OK_EQ2_SET` `0x4e069018`<br>`AUDIO_KARA_OK_EQ3_SET` `0x4e069020` | direct |
| `int setKaraokeMode(int mode)` | W | `AUDIO_ARAOKE_MODE_SET` `0x4e093010` | direct |
| `int setLoudnessState(int state)` | W | `AUDIO_LOUDNESS_SET` `0x4e06c010` | direct |
| `int setMusicChangeSource(int source)` | W | `AUDIO_MUSIC_CHANGE_SOURCE_SET` `0xaa000043` | direct |
| `int setMuteState(int state)` | W | `AUDIO_MUTE_STATUS_SET` `0x4e062010` | direct |
| `int setNaviMuteState(int state)` | W | `AUDIO_NAVI_MUTE_STATUS_SET` `0x4e06d010` | direct |
| `int setNaviVolume(int value)` | W | `AUDIO_NAVI_VOLUME_SET` `0x4e070010` | direct |
| `int setSoundEffect(int effect)` | W | `AUDIO_SOUND_EFFECT_SET` `0x4e067010` | direct |
| `int setSoundField(int x, int y)` | W | `AUDIO_X_SOUND_FIELD_SET` `0x4e065010`<br>`AUDIO_Y_SOUND_FIELD_SET` `0x4e065020` | direct |
| `int setVolume(int value)` | W | `AUDIO_VOLUME_SET` `0x4e061010` | direct |
| `int setVolumeSettingsource()` | W | `AUDIO_VOLUME_SOURCE` `0x000a66a4` | direct |

## BYDAutoAuxDevice

`android.hardware.bydauto.auxiliary.BYDAutoAuxDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getAuxConnectStatus()` | R | `AUX_CONNECT_STATE` `0x0005afdc` | direct |
| `int getAuxSignalStatus()` | R | `AUX_SIGNAL_STATE` `0x0004a222` | direct |
| `void setAllStatus()` | W |  | none |

## BYDAutoBigDataDevice

`android.hardware.bydauto.bigdata.BYDAutoBigDataDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |

## BYDAutoBodyworkDevice

`android.hardware.bydauto.bodywork.BYDAutoBodyworkDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getAlarmState()` | R | `BODYWORK_ALARM_STATE` `0x4490003e` | direct |
| `void getAllStatus()` | R |  | none |
| `int getAutoModelName()` | R | `BODYWORK_AUTO_TYPE` `0x40d00010` | direct |
| `int getAutoSystemState()` | R | `BODYWORK_AUTO_SYSTEM_STATE` `0x12d0002d` | direct |
| `int getAutoType()` | R | `BODYWORK_AUTO_TYPE` `0x40d00010` | direct |
| `String getAutoVIN()` | R | `BODYWORK_AUTO_VIN` `0x99000035` | direct |
| `int getBatteryCapacity()` | R | `BODYWORK_BATTERY_CAPACITY` `0x44500010` | direct |
| `double getBatteryPowerHEV()` | R | `BODYWORK_BATTERY_POWER` `0x44500008` | direct |
| `int getBatteryPowerValue()` | R | `BODYWORK_BATTERY_POWER` `0x44500008` | direct |
| `int getBatteryVoltageLevel()` | R | `BODYWORK_BATTERY_VOLTAGE_LEVEL` `0x40400042` | direct |
| `int getCarWindowAntiPinchConfig()` | R | `BODYWORK_WINDOW_ANTIPINCH_CONFIG` `0x48e00033` | direct |
| `int getDataFlag(int item)` | R | `BODYWORK_STEERING_WHEEL_SENSOR_FLAG` `0x11f00020`<br>`BODYWORK_STEERING_WHEEL_SENSOR_CAL_FLAG` `0x11f00021` | direct |
| `int getDoorState(int area)` | R | `BODYWORK_LEFT_HAND_FRONT_DOOR` `0x29400008`<br>`BODYWORK_RIGHT_HAND_FRONT_DOOR` `0x2940000a`<br>`BODYWORK_LEFT_HAND_REAR_DOOR` `0x2940000c`<br>`BODYWORK_RIGHT_HAND_REAR_DOOR` `0x2940000e`<br>`BODYWORK_HOOD` `0x2940001c`<br>`BODYWORK_LUGGAGE_DOOR` `0x2940001a`<br>`BODYWORK_FUEL_TANK_CAP` `0x4fb00016` | direct |
| `int getEnergyType()` | R | `BODYWORK_AUTO_ENERGY_TYPE` `0x99000107` | direct |
| `int getFuelElecLowPower()` | R | `BODYWORK_FUEL_ELEC_LOW_POWER` `0x0550001e` | direct |
| `int getMessage5sOnlineState(int id)` | R | `BODYWORK_CMD_55_ONLINE` `0x05500000` | direct |
| `int getMoonRoofConfig()` | R | `BODYWORK_MOON_ROOF_CONFIG` `0x41a0002c`<br>`BODYWORK_CLOSE_WINDOW_FOR_RAIN_ONLINE` `0xc8e0002b` | direct + via hasFeature() |
| `int getPowerDayMode()` | R | `BODYWORK_POWER_DAY_MODE` `0x000492e4` | direct |
| `int getPowerLevel()` | R | `BODYWORK_POWER_LEVEL` `0x12d0002a` | direct |
| `int getRainCloseWindow()` | R | `BODYWORK_CLOSE_WINDOW_FOR_RAIN` `0x48e0002b` | direct |
| `String getRealAutoVIN()` | R | `BODYWORK_REAL_AUTO_VIN` `0x9900021a` | direct |
| `int getSmartVoiceLimit()` | R | `BODYWORK_SMART_VOICE_LIMIT` `0x48e00037` | direct |
| `double getSteeringWheelValue(int type)` | R | `BODYWORK_STEERING_WHEEL_ANGEL` `0x11f00008`<br>`BODYWORK_STEERING_WHEEL_SPEED` `0x11f00018` | direct |
| `int getSunroofCloseNotice()` | R | `BODYWORK_SUNROOF_CLOSE_NOTICE` `0x41a0002f` | direct |
| `int getSunroofInitState()` | R | `BODYWORK_SUNROOF_INIT_STATE` `0x41a00018` | direct |
| `int getSunroofPosition()` | R | `BODYWORK_SUNROOF_POSITION` `0x41a00030` | direct |
| `int getSunroofState()` | R | `BODYWORK_SUNROOF_STATE` `0x41a00020` | direct |
| `int getSunroofWindowblindPosition()` | R | `BODYWORK_SUNROOF_WINDOBLIND_POSITION` `0x41a00034` | direct |
| `int getWindoblindInitState()` | R | `BODYWORK_SUNROOF_WINDOBLIND_INIT_STATE` `0x41a0001a` | direct |
| `int getWindowOpenPercent(int area)` | R | `BODYWORK_WINDOW_LEFT_FRONT_PERCENT` `0x38800018`<br>`BODYWORK_WINDOW_RIGHT_FRONT_PERCENT` `0x4b900010`<br>`BODYWORK_WINDOW_LEFT_REAR_PERCENT` `0x38800020`<br>`BODYWORK_WINDOW_RIGHT_REAR_PERCENT` `0x4b900018`<br>`BODYWORK_MOON_ROOF_OPEN_PERCENT` `0x41a00008`<br>`BODYWORK_SUNSHADE_PANEL_PERCENT` `0x41a00010` | direct |
| `int getWindowPermitState()` | R | `BODYWORK_LEFT_FRONT_WINDOW_PERMIT` `0x48e00036` | direct |
| `int getWindowState(int area)` | R | `BODYWORK_LEFT_FRONT_WINDOW` `0x38800038`<br>`BODYWORK_RIGHT_FRONT_WINDOW` `0x4b90000c`<br>`BODYWORK_LEFT_REAR_WINDOW` `0x3880003a`<br>`BODYWORK_RIGHT_REAR_WINDOW` `0x4b90000e`<br>`BODYWORK_MOON_ROOF` `0x41a0001c`<br>`BODYWORK_SUNSHADE_PANEL` `0x41a00023` | direct |
| `int hasFeature(String feature)` | R | `BODYWORK_CLOSE_WINDOW_FOR_RAIN_ONLINE` `0xc8e0002b`<br>`BODYWORK_MOON_ROOF_CONFIG` `0x41a0002c` | direct |
| `int hasMessage(int id)` | R | `BODYWORK_ONLINE_HAS_0x040D00` `0x40d00000`<br>`ONLINE_HAS_0x04F600` `0x4f600000`<br>`ONLINE_HAS_0x013B00` `0x13b00000`<br>`ONLINE_HAS_0x03FF00` `0x3ff00000`<br>`ONLINE_HAS_0x048F00` `0x48f00000`<br>`BODYWORK_ONLINE_HAS_0x047500` `0x47500000`<br>`ONLINE_HAS_0x04D902` `0x4d902000`<br>`BODYWORK_ONLINE_HAS_0x04FA00` `0x4fa00000`<br>… +99 more | direct |
| `void setAllStatus()` | W |  | none |
| `int setAllWindowState(int leftFront, int rightFront, int leftRear, int rightRear)` | W | `BODYWORK_LF_WINDOW_CTRL_SET` `0x43100038`<br>`BODYWORK_RF_WINDOW_CTRL_SET` `0x4310003b`<br>`BODYWORK_LR_WINDOW_CTRL_SET` `0x43100040`<br>`BODYWORK_RR_WINDOW_CTRL_SET` `0x43100043` | direct |
| `int setBodyWindowCtrlState(int area, int state)` | W | `BODYWORK_LF_WINDOW_CTRL_SET` `0x43100038`<br>`BODYWORK_LR_WINDOW_CTRL_SET` `0x43100040`<br>`BODYWORK_RF_WINDOW_CTRL_SET` `0x4310003b`<br>`BODYWORK_RR_WINDOW_CTRL_SET` `0x43100043` | direct |
| `int setMoonRoofAndSunshadeStop()` | W | `BODYWORK_MOON_ROOF_OPEN_PERCENT_SET` `0x4f500020`<br>`BODYWORK_SUNSHADE_PANEL_PERCENT_SET` `0x4f500028` | direct |
| `int setMoonRoofState(int state)` | W | `BODYWORK_MOON_ROOF_OPEN_PERCENT_SET` `0x4f500020` | direct |
| `int setRainCloseWindow(int state)` | W | `BODYWORK_CLOSE_WINDOW_FOR_RAIN_SET` `0x43100036` | direct |
| `int setSunshadeState(int state)` | W | `BODYWORK_SUNSHADE_PANEL_PERCENT_SET` `0x4f500028` | direct |

## BYDAutoChargingDevice

`android.hardware.bydauto.charging.BYDAutoChargingDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getBatteryManagementDeviceState()` | R | `CHARGING_BATTERRY_DEVICE_STATE` `0x34400018` | direct |
| `int getBatteryType()` | R | `CHARGING_BATTERY_TYPE` `0x9900004f` | direct |
| `int getCapState()` | R | `CHARGING_CAP_STATE` `0x2400003a` | direct |
| `int getCarDischargeLowWarn()` | R | `CHARGING_DISCHARGE_TO_OUTSIDE_LOW_WARN` `0x4380002b` | direct |
| `int getCarDischargeState()` | R | `CHARGING_DISCHARGE_TO_CAR_STATE` `0x3340002f` | direct |
| `int getChargeStopCapacityState()` | R | `CHARGING_STOP_QUANTITY_SETTING` `0x43800028` | direct |
| `int getChargeStopSupportConfig()` | R | `CHARGING_STOP_QUANTITY_SUPPORT` `0x43800024` | direct |
| `int getChargeStopSwitchState()` | R | `CHARGING_STOP_QUANTITY_SWITCH` `0x43800026` | direct |
| `int getChargeTempCtlState()` | R | `CHARGING_CHARGE_TEMPERATURE_CTL_STATE` `0x43800020` | direct |
| `int getChargerFaultState()` | R | `CHARGING_CHARGER_FAULT_STATE` `0x27c00008` | direct |
| `int getChargerState()` | R | `CHARGING_CHARGER_CONNECT_STATE` `0x0550000d` | direct |
| `int getChargerWorkState()` | R | `CHARGING_CHARGER_WORK_STATE` `0x27c0000a` | direct |
| `int getChargingCapState(int type)` | R | `CHARGING_CAP_STATE_AC` `0x4fb00020`<br>`CHARGING_CAP_STATE_DC` `0x4fb00018` | direct |
| `double getChargingCapacity()` | R | `CHARGING_CAPACITY` `0x27c00018` | direct |
| `int getChargingGunNotInsertedState()` | R | `CHARGING_GUN_NOTINSERT_WARN_STATE` `0x4c201013` | direct |
| `int getChargingGunState()` | R | `CHARGING_GUN_CONNECT_STATE` `0x34400032` | direct |
| `int getChargingMode()` | R | `CHARGING_MODE` `0x49601012` | direct |
| `int getChargingPortLockRebackState()` | R | `CHARGING_CHARGE_PORT_LOCK_REBACK` `0x4940000a` | direct |
| `double getChargingPower()` | R | `CHARGING_POWER` `0x000b4c9a` | direct |
| `int[] getChargingRestTime()` | R | `CHARGING_FULL_REST_HOUR` `0x44500018`<br>`CHARGING_FULL_REST_MINUTE` `0x44500020` | direct |
| `int getChargingScheduleEnableState()` | R | `CHARGING_SCHEDULE_ENABLE_STATE` `0x0550000e` | direct |
| `int getChargingScheduleState()` | R | `CHARGING_SCHEDULE_STATE` `0x4c201010` | direct |
| `int[] getChargingScheduleTime()` | R | `CHARGING_SCHEDULE_TIME_HOUR` `0x4c201018`<br>`CHARGING_SCHEDULE_TIME_MINUTE` `0x4c201020` | direct |
| `int getChargingState()` | R | `CHARGING_STATE` `0x49601010` | direct |
| `ChargingTimerInfo getChargingTimerInfo(int type)` | R | `CHARGING_TIMER_TYPE_1_GET` `0x4c202008`<br>`CHARGING_TIMER_SWITCH_1_GET` `0x4c202028`<br>`CHARGING_TIMER_UNIT_HOUR_1_GET` `0x4c202010`<br>`CHARGING_TIMER_UNIT_MIMITE_1_GET` `0x4c202018`<br>`CHARGING_TIMER_CYCLE_MON_1_GET` `0x4c202020`<br>`CHARGING_TIMER_CYCLE_TUR_1_GET` `0x4c202021`<br>`CHARGING_TIMER_CYCLE_WED_1_GET` `0x4c202022`<br>`CHARGING_TIMER_CYCLE_THU_1_GET` `0x4c202023`<br>… +14 more | direct |
| `int getChargingType()` | R | `CHARGING_TYPE` `0x34400038` | direct |
| `int getDischargeRequestState()` | R | `CHARGING_DISCHARGE_REQUEST_STATE` `0x0550000a` | direct |
| `int getDischargeState(int type)` | R | `CHARGING_DISCHARGE_STATE_VTOL` `0x44a0000b`<br>`CHARGING_DISCHARGE_STATE_INNER_SOCKET` `0x44a00016` | direct |
| `int getDischargeWarningState()` | R | `CHARGING_CHARGE_DISCHARGE_WARNING` `0x2450003a` | direct |
| `int getSmartChargingState()` | R | `CHARGING_SMART_CHARGING_STATE` `0x44900040` | direct |
| `int getSocSaveSwitch()` | R | `CHARGING_SOC_SAVE_SWITCH` `0x46c00036` | direct |
| `int getVtovDischargeConnectState()` | R | `CHARGING_VTOV_DISCHARGE_CONNECT_STATE` `0x33400020` | direct |
| `int getVtovDischargeLimitVal()` | R | `CHARGING_VTOV_DISCHARGE_LIMIT_VAL` `0x000e43ee` | direct |
| `int getVtovDischargeLowestVal()` | R | `CHARGING_VTOV_DISCHARGE_LOWEST_VAL` `0x0008b39d` | direct |
| `double getVtovDischargeQuantity()` | R | `CHARGING_VTOV_DISCHARGE_QUANTITY` `0x34400020` | direct |
| `int getWeatherAndTimeRequest()` | R | `CHARGING_WEATHER_TIME_REQUIREMENT` `0x2330002a` | direct |
| `int getWirelessChargingOnline5sState()` | R | `CHARGING_HAS_CHARGE_WIRELESS_CHARGING` `0x41e00000`<br>`CHARGING_WIRELESS_CHARGING_ONLINE5S` `0x41e00000`<br>`ONLINE_HAS_0x041E00` `0x41e00000` | direct |
| `int getWirelessChargingState()` | R | `CHARGING_CHARGE_WIRELESS_CHARGING_STATE` `0x41e00009` | direct |
| `int getWirelessChargingSwitchState()` | R | `CHARGING_CHARGE_WIRELESS_CHARGING_SWITCH` `0x41e00010` | direct |
| `int hasFeature(String feature)` | R | `CHARGING_CHARGE_TEMPERATURE_CTL_ONLINE` `0x43800022`<br>`CHARGING_STOP_QUANTITY_SUPPORT` `0x43800024`<br>`CHARGING_DISCHARGE_TO_CAR_ONLINE` `0x3340002e`<br>`CHARGING_SMART_TRAVEL_CONFIG` `0x47002011`<br>`CHARGING_HAS_CHARGE_BY_APPOINTMENT` `0x4c201008`<br>`CHARGING_WIRELESS_CHARGING_SWITCH_ONLINE` `0xc1e00010`<br>`CHARGING_SOC_SAVE_SWITCH_CONFIG` `0xc6c00036` | direct |
| `void setAllStatus()` | W |  | none |
| `int setCarDischargeState(int state)` | W | `CHARGING_DISCHARGE_TO_CAR_STATE_SET` `0x2bc0000e` | direct |
| `int setCarPlan(int appointmentFlag, int chargeMode, int safeBattery, int year, int month, int day, int hour, int minute)` | W | `CHARGING_CAR_APPOINTMENT_VALID_FLAG_SET` `0x30000024`<br>`CHARGING_CHARGE_MODE_SET` `0x30000026`<br>`CHARGING_SAFE_BATTERY_SET` `0x30000040`<br>`CHARGING_CAR_APPOINTMENT_YEAR_SET` `0x30000018`<br>`CHARGING_CAR_APPOINTMENT_MONTH_SET` `0x30000020`<br>`CHARGING_CAR_APPOINTMENT_DAY_SET` `0x30000028`<br>`CHARGING_CAR_APPOINTMENT_HOUR_SET` `0x30000030`<br>`CHARGING_CAR_APPOINTMENT_MINUTE_SET` `0x30000038` | direct |
| `int setChargeStopCapacityState(int state)` | W | `CHARGING_STOP_QUANTITY_SETTING_SET` `0x2bc0001a` | direct |
| `int setChargeStopSwitchState(int state)` | W | `CHARGING_STOP_QUANTITY_SWITCH_SET` `0x2bc00018` | direct |
| `int setChargeTempCtlState(int state)` | W | `CHARGING_CHARGE_TEMPERATURE_CTL_STATE_SET` `0x4e300044` | direct |
| `int setChargingMode(int mode)` | W | `CHARGING_MODE_SET` `0x000a3372` | direct |
| `int setChargingTimerInfo(ChargingTimerInfo timerInfo)` | W | `CHARGING_TIMER_SWITCH_1_SET` `0x4c103028`<br>`CHARGING_TIMER_TYPE_1_SET` `0x4c103008`<br>`CHARGING_TIMER_UNIT_HOUR_1_SET` `0x4c103010`<br>`CHARGING_TIMER_UNIT_MIMITE_1_SET` `0x4c103018`<br>`CHARGING_TIMER_CYCLE_MON_1_SET` `0x4c103020`<br>`CHARGING_TIMER_CYCLE_TUR_1_SET` `0x4c103021`<br>`CHARGING_TIMER_CYCLE_WED_1_SET` `0x4c103022`<br>`CHARGING_TIMER_CYCLE_THU_1_SET` `0x4c103023`<br>… +14 more | direct |
| `int setElectricityPriceLevel(byte[] value)` | W | `CHARGING_ELECTRICITY_PRICE_LEVEL_SET` `0x2cf06008` | direct |
| `int setPredictTemperature(int minTemp, int maxTemp)` | W | `CHARGING_TEMPERATURE_LOW_FORECAST_SET` `0x2ea00028`<br>`CHARGING_TEMPERATURE_HIGN_FORECAST_SET` `0x2ea00018` | direct |
| `int setSocSaveSwitch(int value)` | W | `CHARGING_SOC_SAVE_SWITCH_SET` `0x2ea00008` | direct |
| `int setWirelessChargingSwitchState(int state)` | W | `CHARGING_CHARGE_WIRELESS_CHARGING_SWITCH_SET` `0x4e400042` | direct |

## BYDAutoCollisionDevice

`android.hardware.bydauto.collision.BYDAutoCollisionDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `byte[] getCollisionInfo()` | R | `COLLISION_STATE_S` `0x000235b8` | direct |

## BYDAutoCpuTempratureDevice

`android.hardware.bydauto.cputemprature.BYDAutoCpuTempratureDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void setAllStatus()` | W |  | none |
| `int setCpuTemprature(int temprature)` | W | `CPU_TEMPRATURE_SET` `0xaa000045` | direct |
| `int setPmicTemprature(int temprature)` | W | `CPU_TEMPRATURE_PMIC_TEMPRATURE_SET` `0xaa000044` | direct |
| `int setTecCtrlLevel(int level)` | W | `CPU_TEMPRATURE_TEC_CTL_SET` `0x000c4fdb` | direct |
| `int setTemprature(int cpuTemprature, int pmicTemprature)` | W | `CPU_TEMPRATURE_SET` `0xaa000045`<br>`CPU_TEMPRATURE_PMIC_TEMPRATURE_SET` `0xaa000044` | direct |

## BYDAutoDoorLockDevice

`android.hardware.bydauto.doorlock.BYDAutoDoorLockDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getDoorLockStatus(int area)` | R | `DOOR_LOCK_COMMAND_AREA_CHILDLOCK_LEFT` `0x47500018`<br>`DOOR_LOCK_COMMAND_AREA_CHILDLOCK_RIGHT` `0x49400024`<br>`DOOR_LOCK_COMMAND_AREA_LEFT_FRONT` `0x39400034`<br>`DOOR_LOCK_COMMAND_AREA_LEFT_REAR` `0x39400038`<br>`DOOR_LOCK_COMMAND_AREA_RIGHT_FRONT` `0x39400036`<br>`DOOR_LOCK_COMMAND_AREA_RIGHT_REAR` `0x3940003a`<br>`DOOR_LOCK_COMMAND_AREA_BACK` `0x3940003c` | direct |

## BYDAutoEnergyDevice

`android.hardware.bydauto.energy.BYDAutoEnergyDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getBCMState()` | R | `ENERGY_BCM_STATE` `0x12d00012` | direct |
| `int getDCWorkMode()` | R | `ENERGY_DC_WORK_MODE` `0x36d00030` | direct |
| `int getEnergyMode()` | R | `ENERGY_MODE_INSTRUMENT` `0x34200024` | direct |
| `int getEnergyState()` | R | `ENERGY_STATE` `0x34100018` | direct |
| `int getOperationMode()` | R | `ENERGY_OPERATION_MODE` `0x2120000e` | direct |
| `int getPowerGenerationState()` | R | `ENERGY_POWER_GENERATION_STATE` `0x34f0000a` | direct |
| `int getPowerGenerationValue()` | R | `ENERGY_POWER_GENERATION_VALUE` `0x2610001f` | direct |
| `int getRoadSurfacKind()` | R | `ENERGY_ROAD_SURFACE_KIND` `0x46c0003e` | direct |
| `int getRoadSurfaceMode()` | R | `ENERGY_ROAD_SURFACE_MODE` `0x24000033` | direct |
| `void setAllStatus()` | W |  | none |
| `int setEnergyMode(int value)` | W | `ENERGY_MODE_SET` `0x2bc00036` | direct |
| `int setOperationMode(int value)` | W | `ENERGY_OPERATION_MODE_SET` `0x2bc0001d` | direct |
| `int setRoadSurfaceMode(int value)` | W | `ENERGY_ROAD_SURFACE_MODE_SET` `0x000eea89` | direct |

## BYDAutoEngineDevice

`android.hardware.bydauto.engine.BYDAutoEngineDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `String getEngineCode()` | R | `ENGINE_CODE` `0x40d00028` | direct |
| `int getEngineCoolantLevel()` | R | `ENGINE_COOLANT_LEVEL` `0x05500031` | direct |
| `double getEngineDisplacement()` | R | `ENGINE_DISPLACEMENT` `0x40d00008` | direct |
| `int getEnginePower()` | R | `ENGINE_POWER` `0x14400020` | direct |
| `int getEngineSimulatorVoiceSource()` | R | `ENGINE_SIMULATOR_SOURCE_TYPE` `0x48f00010` | direct |
| `int getEngineSpeed()` | R | `ENGINE_SPEED` `0x14400012` | direct |
| `int getEngineSpeedWarningValue()` | R | `ENGINE_SPEED_WARNING` `0x1440001f` | direct |
| `byte[] getEngineState()` | R | `ENGINE_STATE_S` `0x000be73f` | direct |
| `int getEngineVoiceSimulatorState()` | R | `ENGINE_VOICE_SIMULATOR_STATE` `0x48f0000a` | direct |
| `int getOilLevel()` | R | `ENGINE_OIL_LEVEL` `0x05500038` | direct |
| `int hasFeature(String feature)` | R | `ENGINE_HAS_ENGINE_VOICE_SIMULATOR` `0x48f00000`<br>`ENGINE_HAS_ENGINE_VOICE_SOURCE` `0x48f00013` | direct |
| `void setAllStatus()` | W |  | none |
| `int setEngineSimulatorVoiceSource(int type)` | W | `ENGINE_SIMULATOR_SOURCE_TYPE_SET` `0x3e300038` | direct |
| `int setEngineVoiceSimulatorState(int state)` | W | `ENGINE_VOICE_SIMULATOR_STATE_SET` `0x3e300020` | direct |

## BYDAutoFuncNoticeDevice

`android.hardware.bydauto.funcnotice.BYDAutoFuncNoticeDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getFuncNotice()` | R | `FUNC_SCREEN_NOTICE` `0x0008c23f` | direct |
| `void setAllStatus()` | W |  | none |
| `int setFuncNotice(int value)` | W | `FUNC_SCREEN_NOTICE_SET` `0x00058d63` | direct |

## BYDAutoGBDevice

`android.hardware.bydauto.gb.BYDAutoGBDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getTempMeterPercentAlarmValue()` | R | `GB_WATE_TEMP_ALARM` `0x4a509024` | direct |

## BYDAutoGearboxDevice

`android.hardware.bydauto.gearbox.BYDAutoGearboxDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getBrakeFluidLevel()` | R | `GEARBOX_BRAKE_FLUID_LEVEL` `0x0550001c` | direct |
| `int getBrakePedalState()` | R | `GEARBOX_BRAKE_PEDAL` `0x29400022` | direct |
| `int getCurrentGear()` | R | `GEARBOX_TYPE` `0x40d00020`<br>`GEARBOX_PARK_BRAKE_SWITCH` `0x05500030`<br>`GEARBOX_MANUAL_MODE_LEVEL` `0x29400020`<br>`GEARBOX_AUTO_MODE_TYPE` `0x21200038` | via isGearboxAuto(), getParkBrakeSwitch(), getGearboxManualModeLevel(), getGearboxAutoModeType() |
| `int getEPBState()` | R | `GEARBOX_EPB_STATE` `0x21800011` | direct |
| `int getGearboxAutoModeType()` | R | `GEARBOX_AUTO_MODE_TYPE` `0x21200038` | direct |
| `String getGearboxCode()` | R | `GEARBOX_CODE` `0x40d00018` | direct |
| `int getGearboxManualModeLevel()` | R | `GEARBOX_MANUAL_MODE_LEVEL` `0x29400020` | direct |
| `int getGearboxState()` | R | `GEARBOX_PARK_BRAKE_SWITCH` `0x05500030` | via getParkBrakeSwitch() |
| `int getGearboxType()` | R | `GEARBOX_TYPE` `0x40d00020` | direct |
| `int getParkBrakeSwitch()` | R | `GEARBOX_PARK_BRAKE_SWITCH` `0x05500030` | direct |
| `int isGearboxAuto()` | R | `GEARBOX_TYPE` `0x40d00020` | via getGearboxType() |
| `boolean isInReverseGear()` | R | `GEARBOX_TYPE` `0x40d00020`<br>`GEARBOX_MANUAL_MODE_LEVEL` `0x29400020`<br>`GEARBOX_AUTO_MODE_TYPE` `0x21200038` | direct |
| `void setAllStatus()` | W |  | none |

## BYDAutoInstrumentDevice

`android.hardware.bydauto.instrument.BYDAutoInstrumentDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getABSFaultWarningLight()` | R | `INSTRUMENT_2IN1_FAULT_ABS_FAILURE_WARN_LIGHT` `0x27500014` | direct |
| `int getABSFaultWarningLightColor()` | R | `INSTRUMENT_2IN1_FAULT_ABS_FAILURE_WARN_LIGHT_COLOR` `0x27500017` | direct |
| `int getACCIndicateLightColor()` | R | `INSTRUMENT_DD_ACC_INDICAT_LIGHT_COLOR` `0x29600035` | direct |
| `int getACCIndicateLightState()` | R | `INSTRUMENT_DD_ACC_INDICAT_LIGHT_STATE` `0x29600032` | direct |
| `int getAccCruisingSpeed()` | R | `INSTRUMENT_DD_ACC_CRUISING_SPEED` `0x2a600008` | direct |
| `int getAccCruisingSpeedColor()` | R | `INSTRUMENT_DD_ACC_CRUISING_SPEED_COLOR` `0x2a60000b` | direct |
| `int getAccCruisingSpeedValue()` | R | `INSTRUMENT_DD_ACC_SPEED` `0x23a00008` | direct |
| `int getAirHeatOilDisplay()` | R | `INSTRUMENT_DD_AIR_HEATING_OIL_DISPLAY` `0x4a50803a` | direct |
| `int getAirHeatingDisplayState()` | R | `INSTRUMENT_AIR_HEATING_DISPLAY_STATE` `0x3a700028` | direct |
| `int getAirHeatingOilWarn()` | R | `INSTRUMENT_DD_AIR_HEATING_OIL_WARN` `0x4a508046` | direct |
| `int getAlarmBuzzleState()` | R | `INSTRUMENT_ALARM_BUZZLE_STATE` `0x12d0003c` | direct |
| `void getAllStatus()` | R |  | none |
| `int getAppCountdownHour()` | R | `INSTRUMENT_APPOINTMENT_COUNTDOWN_HOUR` `0x26f00013` | direct |
| `int getAppCountdownMinute()` | R | `INSTRUMENT_APPOINTMENT_COUNTDOWN_MINUTE` `0x26f00018` | direct |
| `int getAppointmentHour()` | R | `INSTRUMENT_APPOINTMENT_HOUR` `0x26f00008` | direct |
| `int getAppointmentMinute()` | R | `INSTRUMENT_APPOINTMENT_MINUTE` `0x26f0000d` | direct |
| `int getAverageEneryConsumptionDisplayState()` | R | `INSTRUMENT_AVERAGE_ENERY_CONSUMPTION_DISPLAY_STATE` `0x3a700010` | direct |
| `int getAverageFuelConsumptionDisplayState()` | R | `INSTRUMENT_AVERAGE_FUEL_CONSUMPTION_DISPLAY_STATE` `0x3a700012` | direct |
| `int getAverageSpeed()` | R | `INSTRUMENT_AVERAGE_SPEED` `0x4a50502c` | direct |
| `int getBacklightBrightness()` | R | `INSTRUMENT_BACKLIGHT_BRIGHTNESS` `0x4bf00038` | direct |
| `int getBacklightModeState(int backlightMode)` | R | `INSTRUMENT_BACKLIGHT_AUTO_MODE_STATE` `0x4c800022`<br>`INSTRUMENT_BACKLIGHT_LINK_MODE_STATE` `0x4c800046` | direct |
| `int getBatteryPercent()` | R |  | none |
| `int getBrakeSysFaultLightColor()` | R | `INSTRUMENT_2IN1_FAULT_BRAKE_SYS_FAILURE_WARN_LIGHT_COLOR` `0x27500023` | direct |
| `int getBrakeSysFaultLightState()` | R | `INSTRUMENT_2IN1_FAULT_BRAKE_SYS_FAILURE_WARN_LIGHT` `0x27500020` | direct |
| `int getCallInfoResult()` | R | `INSTRUMENT_CALL_INFO_RESULT` `0x420c1010` | direct |
| `int getChargeAppTimeOption()` | R | `CHARGING_CHARGE_APPOINTMET_TIME_OPTION` `0x3230000b` | direct |
| `int getChargeDisplay()` | R | `CHARGING_CHARGE_DISPLAY_DD` `0x32300008` | direct |
| `int getChargeNotice()` | R | `CHARGING_CHARGE_NOTICE_DD` `0x32300024` | direct |
| `int getChargePercent()` | R | `CHARGING_CHARGE_PERCENT_DD` `0x32300010` | direct |
| `double getChargePower()` | R | `CHARGING_CHARGE_POWER_DD` `0x32300018` | direct |
| `int[] getChargeRestTime()` | R | `CHARGING_CHARGE_REST_HOUR_DD` `0x32300028`<br>`CHARGING_CHARGE_REST_MINUTE_DD` `0x32300030` | direct |
| `int getCoolantTempHighWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_COOLANT_TEMP_HIGH_WARN_LIGHT_COLOR` `0x2870002f` | direct |
| `int getCoolantTempHighWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_COOLANT_TEMP_HIGH_WARN_LIGHT` `0x2870002c` | direct |
| `int getCruiseCtrlIndicatorColor()` | R | `INSTRUMENT_2IN1_FAULT_CRUISE_CTRL_INDICATOR_COLOR` `0x2b000011` | direct |
| `int getCruiseCtrlIndicatorState()` | R | `INSTRUMENT_2IN1_FAULT_CRUISE_CTRL_INDICATOR` `0x2b00000e` | direct |
| `int getCurrentDriveInterFace()` | R | `INSTRUMENT_2IN1_CURRENT_JOURNEY_INTERFACE` `0x4a50b010` | direct |
| `double getCurrentJourneyDriveMileage()` | R | `INSTRUMENT_2IN1_CURRENT_JOURNEY_DRIVE_MILEAGE` `0x4a50b01c` | direct |
| `double getCurrentJourneyDriveTime()` | R | `INSTRUMENT_2IN1_CURRENT_JOURNEY_DRIVE_TIME` `0x4a50b012` | direct |
| `int getDashboardAlarmState()` | R | `INSTRUMENT_2IN1_FAULT_DASHBOARD_ALARM` `0x4a505037` | direct |
| `int getDeviationState()` | R | `INSTRUMENT_DD_DEVIATION_STATE` `0x26100012` | direct |
| `int getDirectTypePressDisplayState()` | R | `INSTRUMENT_DIRECT_TYRE_PRES_DISPLAY_STATE` `0x3a700008` | direct |
| `int getDirectionInfo()` | R | `INSTRUMENT_2IN1_DIRECTION_INFO` `0x4a503038` | direct |
| `double getDischargeElecEnergy()` | R | `INSTRUMENT_2IN1_DISCHARGE_ELEC_ENERGY` `0x23a00028` | direct |
| `int getDischargeIndicatorColor()` | R | `INSTRUMENT_2IN1_FAULT_DISCHARGE_INDICATOR_COLOR` `0x2b000023` | direct |
| `int getDischargeMode()` | R | `INSTRUMENT_2IN1_DISCHARGE_MODE` `0x23a00026` | direct |
| `int getDischargeUiState()` | R | `INSTRUMENT_2IN1_DISCHARGE_UI` `0x23a00020` | direct |
| `int getDishargeIndicatorState()` | R | `INSTRUMENT_2IN1_FAULT_DISCHARGE_INDICATOR` `0x2b000020` | direct |
| `int getDoorState(int area)` | R | `INSTRUMENT_DD_LEFT_FRONT_DOOR_STATE` `0x26100014`<br>`INSTRUMENT_DD_RIGHT_FRONT_DOOR_STATE` `0x26100015`<br>`INSTRUMENT_DD_LEFT_REAR_DOOR_STATE` `0x26100016`<br>`INSTRUMENT_DD_RIGHT_REAR_DOOR_STATE` `0x26100017`<br>`INSTRUMENT_DD_HOOD_STATE` `0x26100019`<br>`INSTRUMENT_DD_LUGGAGE_DOOR_STATE` `0x26100018` | direct |
| `int getDrivePowerLimitIndicatorColor()` | R | `INSTRUMENT_2IN1_FAULT_DRIVE_POWER_LIMIT_INDICATOR_COLOR` `0x2b00001d` | direct |
| `int getDrivePowerLimitIndicatorState()` | R | `INSTRUMENT_2IN1_FAULT_DRIVE_POWER_LIMIT_INDICATOR` `0x2b00001a` | direct |
| `int getECOIndicatorColor()` | R | `INSTRUMENT_2IN1_FAULT_ECO_INDICATOR_COLOR` `0x2b000029` | direct |
| `int getECOIndicatorState()` | R | `INSTRUMENT_2IN1_FAULT_ECO_INDICATOR` `0x2b000026` | direct |
| `int getELECParkingColor()` | R | `INSTRUMENT_2IN1_FAULT_ELEC_PARKING_STATE_INDICATOR_COLOR` `0x2750001d` | direct |
| `int getELECParkingState()` | R | `INSTRUMENT_2IN1_FAULT_ELEC_PARKING_STATE_INDICATOR` `0x2750001a` | direct |
| `int getESPFailWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_ESP_FAILURE_WARN_LIGHT_COLOR` `0x2750002f` | direct |
| `int getESPFailWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_ESP_FAILURE_WARN_LIGHT` `0x2750002c` | direct |
| `int getEVIndicatorColor()` | R | `INSTRUMENT_2IN1_FAULT_EV_INDICATOR_COLOR` `0x2c00002f` | direct |
| `int getEVIndicatorState()` | R | `INSTRUMENT_2IN1_FAULT_EV_INDICATOR` `0x2c00002c` | direct |
| `int getEnergyDisplay()` | R | `INSTRUMENT_ENERGY_DISPLAY` `0x26f00025` | direct |
| `int getEnergyFeedback()` | R | `INSTRUMENT_DD_ENERGY_INTENSITY_FEEDBACK` `0x26100026` | direct |
| `int getEneryDisplayState()` | R | `INSTRUMENT_ENERGY_DISPLAY` `0x26f00025` | direct |
| `int getEngineFailWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_ENGINE_FAILURE_WARN_LIGHT_COLOR` `0x28700029` | direct |
| `int getEngineFailWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_ENGINE_FAILURE_WARN_LIGHT` `0x28700026` | direct |
| `int getExpectChargeDisplay()` | R | `CHARGING_CHARGE_SCHEDULE_DISPLAY_DD` `0x3230003a` | direct |
| `int getExpectChargeState()` | R | `CHARGING_CHARGE_REST_TIME_DD` `0x32300038` | direct |
| `double getExternalChargePower()` | R | `INSTRUMENT_DD_EXTERNAL_CHARGE_POWER` `0x4a508010` | direct |
| `double getExternalChargingPower()` | R | `INSTRUMENT_EXTERNAL_CHARGING_POWER` `0x4a508010` | direct |
| `int getFirstMenu()` | R | `INSTRUEMNT_2IN1_FIRST_MENU` `0x25d00008` | direct |
| `int getFuelConsumptionDisplayState()` | R | `INSTRUMENT_FUEL_CONSUMPTION_DISPLAY_STATE` `0x3a70000e` | direct |
| `int getFuelLowAlarm()` | R | `INSTRUMENT_FUEL_LOW_ALARM` `0x4a507027` | direct |
| `int getGPFIndicatorColorState()` | R | `INSTRUMENT_2IN1_FAULT_GPF_INDICATOR_COLOR` `0x2870001d` | direct |
| `int getGPFIndicatorState()` | R | `INSTRUMENT_2IN1_FAULT_GPF_INDICATOR` `0x2870001a` | direct |
| `int getGapDetection()` | R | `INSTRUMENT_DD_GAP_DETECTION` `0x000237ae` | direct |
| `int getHEVIndicatorColor()` | R | `INSTRUMENT_2IN1_FAULT_HEV_INDICATOR_COLOR` `0x2c000035` | direct |
| `int getHEVIndicatorState()` | R | `INSTRUMENT_2IN1_FAULT_HEV_INDICATOR` `0x2c000032` | direct |
| `int getHeadlampFailWarnLightColor()` | R | `INSTRUMENT_2IN1_HEADLAMP_FAILURE_WARN_LIGHT_COLOR` `0x28f00029` | direct |
| `int getHeadlampFailWarnLightState()` | R | `INSTRUMENT_2IN1_HEADLAMP_FAILURE_WARN_LIGHT` `0x28f00026` | direct |
| `int getInstantFuelConsumptionDisplayState()` | R | `INSTRUMENT_INSTANT_FUEL_CONSUMPTION_DISPLAY_STATE` `0x3a70001c` | direct |
| `int getInstantFuelConsumptionUnit()` | R | `INSTRUMENT_UNIT_INSTANT_FUELCON` `0x4a501043` | direct |
| `int getInstrumentScreenType()` | R | `INSTRUMENT_SCREEN_TYPE` `0x23500022` | direct |
| `int getInstrumentView()` | R | `INSTRUMET_VIEW_INTERFACE` `0x26f00028` | direct |
| `int getKeyDetectionReminder()` | R | `INSTRUMENT_KEY_DETECTION_REMINDER` `0x43400013` | direct |
| `int getLaneLineColor()` | R | `INSTRUMENT_DD_LANE_LINE_COLOR` `0x2c000038` | direct |
| `int getLaneLineState()` | R | `INSTRUMENT_DD_LANE_LINE_STATE` `0x0000cd09` | direct |
| `double getLast50KmPowerConsume()` | R | `INSTRUMENT_DD_LAST_50KM_POWER_CONSUME` `0x4a505020` | direct |
| `int getLineValue(int flag)` | R | `INSTRUMENT_2IN1_LEFT_LINE` `0x23500018`<br>`INSTRUMENT_2IN1_RIGHT_LINE` `0x2350001c` | direct |
| `int getLinkErrKeyTime(int flag)` | R | `INSTRUMENT_DD_FAULT_KEY_FUNC_COUNTDOWN_DAY` `0x3d902030`<br>`INSTRUMENT_DD_FAULT_KEY_FUNC_COUNTDOWN_HOUR` `0x3d902034` | direct |
| `int getLowFuelWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_LOW_FUEL_WARN_LIGHT_COLOR` `0x28700035` | direct |
| `int getLowFuelWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_LOW_FUEL_WARN_LIGHT` `0x28700032` | direct |
| `int getLowPowerBatteryWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_LOW_POWER_BATTERY_WARN_LIGHT_COLOR` `0x2a600029` | direct |
| `int getLowPowerBatteryWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_LOW_POWER_BATTERY_WARN_LIGHT` `0x2a600026` | direct |
| `int getMainAlarmIndicatorColor()` | R | `INSTRUMENT_2IN1_FAULT_MAIN_ALARM_INDICATOR_COLOR` `0x29600011` | direct |
| `int getMainAlarmIndicatorState()` | R | `INSTRUMENT_2IN1_FAULT_MAIN_ALARM_INDICATOR` `0x2960000e` | direct |
| `int getMaintenanceInfo(int typeName)` | R | `INSTRUMENT_MAINTENANCE_TIME` `0x1c000020`<br>`INSTRUMENT_MAINTENANCE_MILEAGE` `0x4c800028` | direct |
| `int getMalfunctionInfo(int typeName)` | R | `INSTRUMENT_DISPLAY_BREAKDOWN` `0x3d911010`<br>`INSTRUMENT_LOW_OIL_PRESSURE` `0x3d911011`<br>`INSTRUMENT_PARKING_BRAKING` `0x3d903012`<br>`INSTRUMENT_CHARGING_SYSTEM_BREAKDOWN` `0x3d911013`<br>`INSTRUMENT_ENGINE_BREAKDOWN` `0x3d911014`<br>`INSTRUMENT_ABS_SYSTEM_BREAKDOWN` `0x3d911015`<br>`INSTRUMENT_ESC_INDICATOR` `0x3d911016`<br>`INSTRUMENT_QUICK_AIR_LEAK` `0x3d911017`<br>… +50 more | direct |
| `int getMalfunctionInfo2(int typeName)` | R | `INSTRUMENT_B_M_VEHICLE_CHARGING_SYSTEM` `0x3d95d010`<br>`INSTRUMENT_B_M_CHARGING_EQUIPMENT` `0x3d95d011`<br>`INSTRUMENT_B_M_BRAKE_FLUID_LEVEL_LOW` `0x3d95d012`<br>`INSTRUMENT_B_M_BRAKE_SYSTEM` `0x3d95d013`<br>`INSTRUMENT_B_M_STEERING_SYSTEM` `0x3d95d014`<br>`INSTRUMENT_B_M_COOLANT_LEVEL_LOW` `0x3d95d015`<br>`INSTRUMENT_B_M_AC_HEAT_MANAGEMENT` `0x3d95d016`<br>`INSTRUMENT_B_M_ENGINE_OIL_PRESSURE_LACK` `0x3d95d017`<br>… +39 more | direct |
| `ArrayList<Integer> getMalfunctionList()` | R | `INSTRUMENT_B_M_VEHICLE_CHARGING_SYSTEM` `0x3d95d010`<br>`INSTRUMENT_B_M_CHARGING_EQUIPMENT` `0x3d95d011`<br>`INSTRUMENT_B_M_BRAKE_FLUID_LEVEL_LOW` `0x3d95d012`<br>`INSTRUMENT_B_M_BRAKE_SYSTEM` `0x3d95d013`<br>`INSTRUMENT_B_M_STEERING_SYSTEM` `0x3d95d014`<br>`INSTRUMENT_B_M_COOLANT_LEVEL_LOW` `0x3d95d015`<br>`INSTRUMENT_B_M_AC_HEAT_MANAGEMENT` `0x3d95d016`<br>`INSTRUMENT_B_M_ENGINE_OIL_PRESSURE_LACK` `0x3d95d017`<br>… +39 more | via getMalfunctionInfo2() |
| `int getMileageUnit()` | R | `INSTRUMENT_DD_MILEAGE_UNIT` `0x4a50202b` | direct |
| `int getMileageValidFlag()` | R | `INSTRUMENT_DD_MILEAGE_VALID_FLAG` `0x0000db18` | direct |
| `int getModuleState(int module)` | R | `INSTRUMENT_DD_FAULT_NOTICE_ABS_SYSTEM` `0x3d901038`<br>`INSTRUMENT_DD_FAULT_NOTICE_EPB` `0x3d901022`<br>`INSTRUMENT_DD_FAULT_NOTICE_EPB_NOT_RELEASED` `0x3d902026`<br>`INSTRUMENT_DD_FAULT_NOTICE_ESP_SYSTEM` `0x3d90103b`<br>`INSTRUMENT_DD_FAULT_NOTICE_FRONT_LIGHT_STSTEM` `0x3d90102e`<br>`INSTRUMENT_DD_FAULT_NOTICE_LEAVE_CAR` `0x3d901010`<br>`INSTRUMENT_DD_FAULT_NOTICE_LF_LIGHT_STSTEM` `0x3d90102c`<br>`INSTRUMENT_DD_FAULT_NOTICE_LV_SUPPLY` `0x3d901025`<br>… +99 more | direct |
| `int getMusicInfoResult()` | R | `INSTRUMENT_MUSIC_INFO_RESULT` `0x420b1010` | direct |
| `int getNaviDestinationCommand()` | R | `INSTRUMENT_GET_NAVI_DESTINATION` `0x40c0103b` | direct |
| `int getOKIndicatorColor()` | R | `INSTRUMENT_2IN1_FAULT_OK_INDICATOR_COLOR` `0x2c000017` | direct |
| `int getOKIndicatorState()` | R | `INSTRUMENT_2IN1_FAULT_OK_INDICATOR` `0x2c000014` | direct |
| `int getOdometerDisplay()` | R | `INSTRUMENT_2IN1_ODOMETER_DISPLAY` `0x26f00020` | direct |
| `int getOilLevelAlarmIndicator()` | R | `INSTRUMENT_DD_OIL_LEVEL_LIGHT` `0x4a508040` | direct |
| `int getOilLevelAlarmIndicatorColor()` | R | `INSTRUMENT_DD_OIL_LEVEL_LIGHT_COLOR` `0x4a508043` | direct |
| `int getOutCarTemperature()` | R | `INSTRUMENT_DD_OUT_TEMP` `0x4a503040` | direct |
| `int getPCWAlarmInstruction()` | R | `INSTRUMENT_DD_PCW_SAFE_DIST_ALARM_INSTRUCTION` `0x2a600014` | direct |
| `int getPowerBatFailWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_POWER_BAT_FAILURE_WARN_LIGHT_COLOR` `0x2b00000b` | direct |
| `int getPowerBatFailWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_POWER_BAT_FAILURE_WARN_LIGHT` `0x2b000008` | direct |
| `int getPowerBatteryChargeConnectIndicatorColor()` | R | `INSTRUMENT_2IN1_FAULT_POWER_BATTERY_CHARGE_CONNECT_INDICATOR_COLOR` `0x2a60002f` | direct |
| `int getPowerBatteryChargeConnectIndicatorState()` | R | `INSTRUMENT_2IN1_FAULT_POWER_BATTERY_CHARGE_CONNECT_INDICATOR` `0x2a60002c` | direct |
| `int getPowerBatteryHeatWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_POWER_BATTERY_HEAT_WARN_LIGHT_COLOR` `0x2a600035` | direct |
| `int getPowerBatteryHeatWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_POWER_BATTERY_HEAT_WARN_LIGHT` `0x2a600032` | direct |
| `int getPowerOffErrInfo()` | R | `INSTRUMENT_POWER_OFF_ERROR_INFO` `0x43400020` | direct |
| `int getPowerOnErrInfo()` | R | `INSTRUMENT_POWER_ON_ERROR_INFO` `0x4340001c` | direct |
| `int getPowerSysFailWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_POWER_SYS_FAILURE_WARN_LIGHT_COLOR` `0x2a60001d` | direct |
| `int getPowerSysFailWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_POWER_SYS_FAILURE_WARN_LIGHT` `0x2a60001a` | direct |
| `int getPowerUnit()` | R | `INSTRUMENT_DD_POWER_UNIT` `0x4a508038` | direct |
| `int getPressureSupplySysFailWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_PRESSURE_SUPPLY_SYS_FAILURE_WARN_LIGHT_COLOR` `0x28700023` | direct |
| `int getPressureSupplySysFailWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_PRESSURE_SUPPLY_SYS_FAILURE_WARN_LIGHT` `0x28700020` | direct |
| `int getPressureWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_LOW_OIL_PRESSURE_WARN_LIGHT_COLOR` `0x2960000b` | direct |
| `int getPressureWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_LOW_OIL_PRESSURE_WARN_LIGHT` `0x29600008` | direct |
| `int getRadioInfoResult()` | R | `INSTRUMENT_RADIO_INFO_RESULT` `0x420d1010` | direct |
| `int getRemoteDrivingReminder()` | R | `INSTRUMENT_REMOTE_DRIVING_REMINDER` `0x43400024` | direct |
| `int getRoadNameCheckState()` | R | `INSTRUMENT_GET_ROAD_NAME_CHECK_STATE` `0x420a1010` | direct |
| `int getSRSFaultWarningLight()` | R | `INSTRUMENT_2IN1_FAULT_SRS_FAILURE_WARN_LIGHT` `0x27500008` | direct |
| `int getSRSFaultWarningLightColor()` | R | `INSTRUMENT_2IN1_FAULT_SRS_FAILURE_WARN_LIGHT_COLOR` `0x2750000b` | direct |
| `int getSafetyBeltStatus(int area)` | R | `INSTRUMENT_DD_MAIN_SAFETYBELT_STATE` `0x29400018`<br>`INSTRUMENT_DD_DEPUTY_SAFETYBELT_STATE` `0x2610001b`<br>`INSTRUMENT_DD_REAR_LEFT_SAFETYBELT_STATE` `0x2610001c`<br>`INSTRUMENT_DD_REAR_RIGHT_SAFETYBELT_STATE` `0x2610001e`<br>`INSTRUMENT_DD_REAR_MID_SAFETYBELT_STATE` `0x2610001d` | direct |
| `int getSecondMenu()` | R | `INSTRUEMNT_2IN1_SECOND_MENU` `0x25d0000b` | direct |
| `int getSmartKeySysWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_SMART_KEY_SYS_COLOR` `0x29600029` | direct |
| `int getSmartKeySysWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_SMART_KEY_SYS_WARN_LIGHT` `0x29600026` | direct |
| `int getSoundFreq()` | R | `INSTRUMENT_DD_SOUND_FREQ` `0x26100035` | direct |
| `int getSoundType()` | R | `INSTRUMENT_DD_SOUND_TYPE` `0x26100038` | direct |
| `int getSpacingState()` | R | `INSTRUMENT_DD_SPACING_STATE` `0x26100032` | direct |
| `int getSpeedUnit()` | R | `INSTRUMENT_DD_SPEED_UNIT` `0x14400010` | direct |
| `int getSportIndicatorColor()` | R | `INSTRUMENT_2IN1_FAULT_SPORT_INDICATOR_COLOR` `0x2b00002f` | direct |
| `int getSportIndicatorState()` | R | `INSTRUMENT_2IN1_FAULT_SPORT_INDICATOR` `0x2b00002c` | direct |
| `int getSteeringSYSFailWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_STEERINT_SYS_FAILURE_WARN_LIGHT_COLOR` `0x28700011` | direct |
| `int getSteeringSYSFailWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_STEERING_SYS_FAILURE_WARN_LIGHT` `0x2870000e` | direct |
| `int getTextColor()` | R | `INSTRUMENT_DD_TEXT_COLOR` `0x26100028` | direct |
| `int getTextInfo()` | R | `INSTRUMENT_DD_FAULT_NOTICE_261` `0x26100008` | direct |
| `int getTimeIntervalState()` | R | `INSTRUMENT_DD_TIME_INTERVAL_STATE` `0x0006e5ab` | direct |
| `int getTotalMileage()` | R |  | none |
| `double getTravelTime()` | R |  | none |
| `int getTyrePressureCarType()` | R | `INSTRUMENT_2IN1_TYRE_PRESSURE_CAR_TYPE` `0x4a50501e` | direct |
| `int getTyrePressureSYSFailWarnLightColor()` | R | `INSTRUMENT_2IN1_FAULT_TYRE_PRESSURE_SYS_FAILURE_WARN_LIGHT_COLOR` `0x28700017` | direct |
| `int getTyrePressureSYSFailWarnLightState()` | R | `INSTRUMENT_2IN1_FAULT_TYRE_PRESSURE_SYS_FAILURE_WARN_LIGHT` `0x28700014` | direct |
| `int getUnit(int unitName)` | R | `INSTRUMENT_UNIT_TEMPERATURE` `0x4a50303f`<br>`INSTRUMENT_UNIT_PRESSURE` `0x4a506040`<br>`INSTRUMENT_UNIT_POWER` `0x1440002c`<br>`INSTRUMENT_UNIT_FUELCON` `0x4a507024`<br>`INSTRUMENT_UNIT_FUELCON_DISTANCE` `0x49c00025` | direct |
| `int getViewStatus()` | R | `INSTRUMET_2IN1_VIEW_STATUS` `0x26f0001e` | direct |
| `double getWaterTempMeterPercent()` | R | `INSTRUMENT_WATER_TEMP_METER_PERCENT` `0x4a509018` | direct |
| `int getWheelColor(int position)` | R | `INSTRUMENT_2IN1_RF_TYRE_COLOR` `0x4a50a012`<br>`INSTRUMENT_2IN1_RB_TYRE_COLOR` `0x4a50a016`<br>`INSTRUMENT_2IN1_LF_TYRE_COLOR` `0x4a50a010`<br>`INSTRUMENT_2IN1_LB_TYRE_COLOR` `0x4a50a014` | direct |
| `int getWheelPressure(int position)` | R | `INSTRUMENT_2IN1_RF_TYRE_PRESSURE` `0x4a50601c`<br>`INSTRUMENT_2IN1_RB_TYRE_PRESSURE` `0x4a506034`<br>`INSTRUMENT_2IN1_LF_TYRE_PRESSURE` `0x4a506010`<br>`INSTRUMENT_2IN1_LB_TYRE_PRESSURE` `0x4a506028` | direct |
| `int getWheelTemperature(int position)` | R | `INSTRUMENT_2IN1_RF_TYRE_TEMPERATURE` `0x4a50a024`<br>`INSTRUMENT_2IN1_RB_TYRE_TEMPERATURE` `0x4a50a03c`<br>`INSTRUMENT_2IN1_LF_TYRE_TEMPERATURE` `0x4a50a018`<br>`INSTRUMENT_2IN1_LB_TYRE_TEMPERATURE` `0x4a50a030` | direct |
| `int getWheelTemperatureColor(int position)` | R | `INSTRUMENT_2IN1_RF_TYRE_TEMPERATURE_COLOR` `0x4a50a02d`<br>`INSTRUMENT_2IN1_RB_TYRE_TEMPERATURE_COLOR` `0x4a50a045`<br>`INSTRUMENT_2IN1_LF_TYRE_TEMPERATURE_COLOR` `0x4a50a021`<br>`INSTRUMENT_2IN1_LB_TYRE_TEMPERATURE_COLOR` `0x4a50a039` | direct |
| `int hasFeature(String feature)` | R | `INSTRUMENT_UNIT_POWER_ONLINE` `0x9440002c`<br>`INSTRUMENT_UNIT_PRESSURE_ONLINE` `0xca506040`<br>`INSTRUMENT_UNIT_FUELCON_DISTANCE_ONLINE` `0xc9c00025`<br>`INSTRUMENT_UNIT_TEMPERATURE_ONLINE` `0xc9c00020`<br>`INSTRUMENT_ENERGY_DISPLAY` `0x26f00025` | direct |
| `void setAllStatus()` | W |  | none |
| `int setBacklightBrightness(int brightness)` | W | `INSTRUMENT_BACKLIGHT_BRIGHTNESS_SET` `0x3e300018` | direct |
| `int setBacklightModeState(int backlightMode, int state)` | W | `INSTRUMENT_BACKLIGHT_AUTO_MODE_STATE_SET` `0x3e300012`<br>`INSTRUMENT_BACKLIGHT_LINK_MODE_STATE_SET` `0x3e300036` | direct |
| `int setClearFault(int value)` | W | `INSTRUMET_2IN1_CLEAR_FAULT_SET` `0x4c108010` | direct |
| `int setDrivingInfoSwitch(int value)` | W | `INSTRUMENT_DRIVING_INFO_SWITCH_SET` `0x3a20000a` | direct |
| `int setEnergyDisplay(int value)` | W | `INSTRUMENT_ENERGY_DISPLAY_SET` `0x4c108014` | direct |
| `int setMaintenanceInfo(int typeName, int infoValue)` | W | `INSTRUMENT_MAINTENANCE_TIME_SET` `0x3b700028`<br>`INSTRUMENT_MAINTENANCE_MILEAGE_SET` `0x3b700018` | direct |
| `int setUnit(int unitName, int unitValue)` | W | `INSTRUMENT_UNIT_PRESSURE_SET` `0x4e400022`<br>`INSTRUMENT_UNIT_FUELCON_DISTANCE_SET` `0x4e400025`<br>`INSTRUMENT_UNIT_POWER_SET` `0x4e400040`<br>`INSTRUMENT_UNIT_TEMPERATURE_SET` `0x4e400020` | direct |
| `int setViewSwitch(int value)` | W | `INSTRUMET_2IN1_VIEW_SWITCH_SET` `0x4c108012` | direct |

## BYDAutoLightDevice

`android.hardware.bydauto.light.BYDAutoLightDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getAFSSwitch()` | R | `LIGHT_AFS_SWITCH` `0x49c0002c` | direct |
| `void getAllStatus()` | R |  | none |
| `int getDayRunningLightState()` | R | `LIGHT_CMD_DAY_RUNNING_LIGHT_STATE` `0x49603010` | direct |
| `int getDayTimeLightState()` | R | `LIGHT_DAY_RUNNING_LIGHT_AUTO_STATE` `0x3ac00024` | direct |
| `int getDoubleFlashLightState()` | R | `LIGHT_CMD_DOUBLE_FLASH_STATE` `0x39400033` | direct |
| `int getGroupHeadlightState(int area)` | R | `LIGHT_GROUP_LEFT_LIGHT` `0x3ac0000b`<br>`LIGHT_GROUP_RIGHT_LIGHT` `0x3ad0000b` | direct |
| `int getIlluminationIntensityLevel()` | R | `LIGHT_ILLUMINATION_LEVEL` `0x000c0a7c` | direct |
| `int getLightAdbState(int id)` | R | `LIGHT_LF_ADB_STATE` `0x3ac0001c`<br>`LIGHT_RF_ADB_STATE` `0x3ad0001c` | direct |
| `int getLightAutoStatus()` | R | `LIGHT_AUTO_SWITCH` `0x000d1b88` | direct |
| `int getLightStatus(int type)` | R | `LIGHT_SIDE_LIGHT` `0x38a00008`<br>`LIGHT_LOW_BEAM_LIGHT` `0x38a0000a`<br>`LIGHT_HIGH_BEAM_LIGHT` `0x38a0000c`<br>`LIGHT_FOOT_LIGHT` `0x12d00038`<br>`LIGHT_LEFT_TURN_SIGNAL_LIGHT` `0x1330000c`<br>`LIGHT_RIGHT_TURN_SIGNAL_LIGHT` `0x1330000d`<br>`LIGHT_FRONT_FOG_LIGHT` `0x1330000e`<br>`LIGHT_REAR_FOG_LIGHT` `0x1330000f` | direct |
| `int getReversingLightState()` | R | `LIGHT_CMD_REVERSING_LIGHT_STATE` `0x38a00014` | direct |
| `int getSequentialLightState()` | R | `LIGHT_CMD_SEQUENTIAL_STATE` `0x3b400046` | direct |
| `int getStopLightState()` | R | `LIGHT_CMD_STOP_LIGHT_STATE` `0x38a00012` | direct |
| `int getTurnLightFlashState()` | R | `LIGHT_TURN_SIGNAL_LIGHT` `0x38a0002c` | direct |
| `int getTurnLightState()` | R | `LIGHT_TURN_SIGNAL_LIGHT_SWITCH_STATE` `0x1330002c` | direct |
| `int getTurnLightState(int id)` | R | `LIGHT_LEFT_TURN_SIGNAL_LIGHT_SWITCH_STATE` `0x0004cd1d`<br>`LIGHT_RIGHT_TURN_SIGNAL_LIGHT_SWITCH_STATE` `0x000e3177` | direct |
| `int hasFeature(String feature)` | R | `LIGHT_HAS_DAY_RUNNING_LIGHT_AUTO_475` `0x000eb879`<br>`LIGHT_DAY_RUNNING_LIGHT_CONFIG` `0x38a00033`<br>`LIGHT_LF_ADB_CONFIG` `0x3ac00022`<br>`LIGHT_RF_ADB_CONFIG` `0x3ad00022`<br>`LIGHT_HAS_DAY_RUNNING_LIGHT_AUTO_3AC` `0xbac00024` | direct |
| `int setAcLightAdbState(int value)` | W | `LIGHT_ADB_STATE_SET` `0x4310003e` | direct |
| `int setDayTimeLightState(int state)` | W | `LIGHT_DAY_RUNNING_LIGHT_AUTO_STATE_SET` `0x43100046` | direct |

## BYDAutoLocationDevice

`android.hardware.bydauto.location.BYDAutoLocationDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `double[] getLocationLongitudeLatitudeValue()` | R | `LOCATION_LONGITUDE_TYPE` `0x000c4a3c`<br>`LOCATION_LONGITUDE_VALUE` `0x000ebbe0`<br>`LOCATION_LATITUDE_TYPE` `0x000cee2c`<br>`LOCATION_LATITUDE_VALUE` `0x0004bf2f`<br>`LOCATION_FIXPOSITION` `0x00038e80`<br>`LOCATION_ORIENTATION` `0x0009c1d0`<br>`LOCATION_ALTITUDE` `0x000a8405` | direct |
| `int setLocationInfo(int longitude, double longitudeValue, int latitude, double latitudeValue, int fixposition, float orientation, double altitude, int gpsSpeed, int satellitesNumber)` | W | `LOCATION_LATITUDE_TYPE_SET` `0x2d40000f`<br>`LOCATION_LATITUDE_DECIMAL_SET` `0x2d400008`<br>`LOCATION_LATITUDE_INT_SET` `0x2d400010`<br>`LOCATION_LONGITUDE_TYPE_SET` `0x2d40001f`<br>`LOCATION_LONGITUDE_DECIMAL_SET` `0x2d400018`<br>`LOCATION_LONGITUDE_INT_SET` `0x2d400020`<br>`LOCATION_LATITUDE_VALUE_SET` `0x3d500008`<br>`LOCATION_LONGITUDE_VALUE_SET` `0x3d500028`<br>… +7 more | direct |

## BYDAutoMotorDevice

`android.hardware.bydauto.motor.BYDAutoMotorDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getMotorAngle()` | R | `MOTOR_ANGLE` `0x000a5fdc` | direct |
| `int getMotorDirection()` | R | `MOTOR_STATE` `0x000b468f` | direct |
| `int getMotorLock()` | R | `MOTOR_LOCK` `0x00037fd4` | direct |
| `int getMotorPosition()` | R | `MOTOR_POS` `0x0008a80f` | direct |
| `int getMotorPower()` | R | `MOTOR_POWER_STATE` `0x00053d72` | direct |
| `int getMotorSpeed()` | R | `MOTOR_SPEED` `0x000dcbc8` | direct |
| `void setAllStatus()` | W |  | none |
| `int setMotorDirection(int state)` | W | `MOTOR_STATE_SET` `0x00073db3` | direct |
| `int setMotorLock(int state)` | W | `MOTOR_LOCK_SET` `0x000a8bfc` | direct |
| `int setMotorPower(int state)` | W | `MOTOR_POWER_STATE_SET` `0x00044b53` | direct |

## BYDAutoMultimediaDevice

`android.hardware.bydauto.multimedia.BYDAutoMultimediaDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getMediaMode()` | R |  | none |
| `int getMediaType()` | R |  | none |
| `MediaInfo getPlayMediaInfo()` | R |  | none |
| `int getPlayMode()` | R |  | none |
| `int getPlayProgress()` | R |  | none |
| `int getPlayState()` | R |  | none |
| `int setMediaType(int mediaType)` | W |  | none |
| `int setPlayMediaInfo(int mode, MediaInfo mediaInfo)` | W |  | none |
| `int setPlayMode(int mode, int playMode)` | W |  | none |
| `int setPlayProgress(int mode, int progress)` | W |  | none |
| `int setPlayState(int mode, int playState)` | W |  | none |

## BYDAutoOtaDevice

`android.hardware.bydauto.ota.BYDAutoOtaDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `double getBatteryPowerVoltage()` | R | `OTA_BATTERY_POWER_VOLTAGE` `0x43400028` | direct |
| `double getBatteryVoltage()` | R | `OTA_BATTERY_VOLTAGE` `0x44900018` | direct |
| `byte[] getCanInfo()` | R | `OTA_CMD_CAN_INFO` `0x0007b6c3` | direct |
| `int getDischargeMainContactorState()` | R | `OTA_DISCHARGE_MAIN_CONTACTOR_STATE` `0x34400010` | direct |
| `byte[] getECUSoftcode()` | R | `OTA_CMD_ECU_SOFTCODE` `0x0003eafb` | direct |
| `byte[] getECUVersion()` | R | `OTA_CMD_ECU_VER` `0x00026783` | direct |
| `byte[] getECUVersionAndSoftcode()` | R | `OTA_CMD_ECU_VER_SOFTCODE` `0x99000053` | direct |
| `byte[] getFaultCodeInfo()` | R | `OTA_CMD_ECU_GET_FAULTCODE` `0x000caf3b` | direct |
| `int getLFDoorLockState()` | R | `OTA_LF_DOOR_LOCK` `0x40700008` | direct |
| `int getLocalDiagStatus()` | R | `OTA_LOCAL_DIAG_STATUS` `0x4f200808` | direct |
| `byte[] getMCUVersionAndSoftcode()` | R | `OTA_CMD_MCU_DATA` `0x9900003d` | direct |
| `byte[] getOTAInfoACK()` | R | `OTA_CMD_ACK` `0x00027f13` | direct |
| `int getOTAState()` | R | `OTA_STATE` `0x43400030` | direct |
| `int getOTATimecountState()` | R | `OTA_TIMECOUNT_STATE` `0x05500008` | direct |
| `int getPowerOnForbidState()` | R | `OTA_POWERON_FORBID` `0x12d0001f` | direct |
| `int getPoweroffInform()` | R | `OTA_POWEROFF_INFORM` `0x12d00026` | direct |
| `void setAllStatus()` | W |  | none |
| `int setCanInfoSwitchState(int state)` | W | `OTA_CAN_INFO_SWITCH_STATE_SET` `0x0004229e` | direct |
| `int setMcuMessage(int message)` | W | `OTA_SET_MCU_MESSAGE_SET` `0xaa00010f` | direct |
| `int setPowerOnForbidState(int state)` | W | `OTA_UPGRADE_INFO_SET` `0x49a00418` | direct |
| `int setScreenState(int state)` | W | `OTA_SCREEN_CTL_SET` `0x0000ae52` | direct |

## BYDAutoPM2p5Device

`android.hardware.bydauto.pm2p5.BYDAutoPM2p5Device`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getPM2p5AnionState()` | R | `PM25_ANION_STATE` `0x3da00016` | direct |
| `int[] getPM2p5CheckState()` | R | `PM2P5_STATE_IN` `0x4f600028`<br>`PM2P5_STATE_OUT` `0x4f60002a` | direct |
| `int getPM2p5DualChannelDetectState()` | R | `PM25_DUAL_CHANNEL_DETECT_STATE` `0x4f600039` | direct |
| `int[] getPM2p5Level()` | R | `PM2P5_LEVEL_IN` `0x4f600030`<br>`PM2P5_LEVEL_OUT` `0x4f600033` | direct |
| `int getPM2p5OnlineState()` | R | `PM2P5_ONLINE_STATE` `0x4f600000` | direct |
| `int[] getPM2p5Value()` | R | `PM2P5_VALUE_IN` `0x4f600010`<br>`PM2P5_VALUE_OUT` `0x4f60001c` | direct |
| `int getPM2p5WarningInfo()` | R | `PM2P5_WARNING_INFO` `0x4f60002c` | direct |
| `int getPromptInfo()` | R | `PM2P5_PROMPT_INFO` `0x4f60002c` | direct |
| `int hasFeature(String feature)` | R | `PM25_DUAL_CHANNEL_DETECT_CONFIG` `0x4f600036`<br>`PM25_ANION_CONFIG` `0x43300025` | direct |
| `void setAllStatus()` | W |  | none |
| `int setPM2p5AnionDetectState(int state)` | W | `PM25_ANION_STATE_SET` `0x4fc00012` | direct |
| `int setPM2p5DualChannelDetectState(int state)` | W | `PM25_DUAL_CHANNEL_DETECT_STATE_SET` `0x4f50001a` | direct |

## BYDAutoPanoramaDevice

`android.hardware.bydauto.panorama.BYDAutoPanoramaDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getACUState()` | R | `PANORAMA_ACU_STATE` `0x000cbf67` | direct |
| `int getBackLineConfig()` | R | `PANORAMA_BACK_LINE_CONFIG` `0x4f401020` | direct |
| `int getCarInfo()` | R | `PANORAMA_CAR_BODY_STATE` `0x4f401028` | direct |
| `int getDisplayMode()` | R | `PANORAMA_WORK_MODE` `0x4f401014` | direct |
| `int getEmergencyButtonState()` | R | `PANORAMA_EMERGENCY_BUTTON_STATE` `0x33700008` | direct |
| `int getLVDSState()` | R | `PANORAMA_LVDS_STATE` `0x4f401022` | direct |
| `int getPanoAPAState()` | R | `PANORAMA_APA_STATE` `0x13400008` | direct |
| `int getPanoOutputSignal()` | R | `PANORAMA_OUTPUT_SIGNAL` `0x4f40101a` | direct |
| `int getPanoOutputState()` | R | `PANORAMA_OUTPUT_STATE` `0x4f401010` | direct |
| `int getPanoRemoteImageCallSupport()` | R | `PANORAMA_REMOTE_CALL_SUPPORT` `0x4f40102c` | direct |
| `int getPanoRotation()` | R | `PANORAMA_ROTATION` `0x4f40101c` | direct |
| `int getPanoTransparence()` | R | `PANORAMA_APA_TRANSPARENT_SWITCH` `0x4f40101e` | direct |
| `int getPanoWorkState()` | R | `PANORAMA_WORK_STATE` `0x4f401018` | direct |
| `int getPanoramaOnlineState()` | R |  | none |
| `int getRFCameraSwitchState()` | R | `PANORAMA_RINGHT_CAMERA_SWITCH` `0x40c0101e` | direct |
| `int getRightCameraSwitchState()` | R | `PANORAMA_RINGHT_CAMERA_SWITCH` `0x40c0101e` | direct |
| `int hasFeature(String feature)` | R | `ONLINE_HAS_0x033700` `0x33700000`<br>`PANORAMA_HAS_ACU` `0x33700000` | direct |
| `int setAPAAvmMode(int mode)` | W | `PANORAMA_APA_AVM_MODE` `0x4de01046` | direct |
| `int setAPATransparentSwitch()` | W | `PANORAMA_APA_TRANSPARENT_SWITCH_SET` `0x4de01040` | direct |
| `void setAllStatus()` | W |  | none |
| `int setDisplayMode(int mode)` | W | `PANORAMA_WORK_MODE_SET` `0x4de01014` | direct |
| `int setLVDSState(int state)` | W | `PANORAMA_LVDS_STATE_SET` `0x4f500040` | direct |
| `int setPanoFocusState(int state)` | W | `PANORAMA_FOCUS_SET` `0x000bbf94` | direct |
| `int setPanoOperation(int operation)` | W | `PANORAMA_OPERATION_SET` `0x0002c2f3` | direct |
| `int setPanoOutputState(int value)` | W | `PANORAMA_OUTPUT_STATE_SET` `0x4de01010` | direct |
| `int setPanoParams(int output, int mode, int rotation)` | W | `PANORAMA_OUTPUT_STATE_SET` `0x4de01010`<br>`PANORAMA_WORK_MODE_SET` `0x4de01014`<br>`PANORAMA_ROTATION_SET` `0x4de01022` | direct |
| `int setPanoParams(int output, int mode, int rotation, int apaMode)` | W | `PANORAMA_OUTPUT_STATE_SET` `0x4de01010`<br>`PANORAMA_WORK_MODE_SET` `0x4de01014`<br>`PANORAMA_ROTATION_SET` `0x4de01022`<br>`PANORAMA_APA_OUTPUT_STATUS` `0x4de01024` | direct |
| `int setPanoParams(int output, int mode, int rotation, int apaMode, int apaMode2)` | W | `PANORAMA_OUTPUT_STATE_SET` `0x4de01010`<br>`PANORAMA_WORK_MODE_SET` `0x4de01014`<br>`PANORAMA_ROTATION_SET` `0x4de01022`<br>`PANORAMA_APA_OUTPUT_STATUS` `0x4de01024`<br>`PANORAMA_APA_OUTPUT_STATUS2` `0x4de01028` | direct |
| `int setPanoRemoteCall(int value)` | W | `PANORAMA_REMOTE_CALL` `0x4de01042` | direct |
| `int setPanoRotation(int value)` | W | `PANORAMA_ROTATION_SET` `0x4de01022` | direct |
| `int setPanoTouchCoordinateAndShowArea(double x, double y, int operate, double width, double height)` | W | `PANORAMA_SET_TOUCH_X_SET` `0x3ec00008`<br>`PANORAMA_SET_TOUCH_Y_SET` `0x3ec00018`<br>`PANORAMA_SET_PRESS_ACTION_SET` `0x3ec00016`<br>`PANORAMA_SET_RESOLUTION_WIDE_SET` `0x3ec00028`<br>`PANORAMA_SET_RESOLUTION_HIGH_SET` `0x3ec00038` | direct |
| `int setPanoramaTransparence(int state)` | W | `PANORAMA_TRANSPARENCE_SWITCH_SET` `0xaa000048` | direct |
| `int setRFCameraSwitchState(int state)` | W | `PANORAMA_RINGHT_CAMERA_SWITCH_SET` `0x1e000017` | direct |

## BYDAutoPhoneDevice

`android.hardware.bydauto.phone.BYDAutoPhoneDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getPhoneEvent()` | R | `PHONE_EVENT` `0x000d65ea` | direct |
| `int getPhoneMute()` | R | `PHONE_MUTE` `0x00044c95` | direct |
| `void setAllStatus()` | W |  | none |
| `int setPhoneInfoState(int value)` | W | `PHONE_INFO_ST_SET` `0x000686a9` | direct |
| `int setPhoneMute(int value)` | W | `PHONE_MUTE` `0x00044c95`<br>`PHONE_INFO_ST_SET` `0x000686a9` | direct |
| `int[] setPhoneNameNumber(String name, String number)` | W | `PHONE_NAME_SET` `0x0007991f`<br>`PHONE_NUMBER_SET` `0x000a6680` | direct |

## BYDAutoPowerDevice

`android.hardware.bydauto.power.BYDAutoPowerDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getBatteryLowVoltageState()` | R | `POWER_LOW_VOLTAGE` `0x12d0003d` | direct |
| `double getBatteryRemainPowerEV()` | R | `POWER_BATTERY_REMAIN_ELECTRICITY` `0x34a00010` | direct |
| `int getMcuStatus()` | R | `POWER_MCU_STATUS` `0x99000003` | direct |
| `int getPowerCtlStatus(int event_type)` | R | `POWER_FREESCALE_POWER` `0x0008843c`<br>`POWER_FREESCALE_RESET` `0x000bd59f`<br>`POWER_ACC_STATUS` `0x99000037`<br>`POWER_PAD_BOOT` `0x0003bcf5`<br>`POWER_TFT_TP_POWER` `0x00084f99`<br>`POWER_MOTOR_POWER` `0x0007f536`<br>`POWER_OUTPUT_5V` `0x00045832`<br>`POWER_OUTPUT_12V` `0x000aa82b`<br>… +1 more | direct |
| `int getShutdownInfo(int device)` | R | `POWER_SHUTDOWN_INFO_PAD` `0x03e00008` | direct |
| `int getTftBacklight()` | R | `POWER_TFT_BACKLIGHT` `0x0002570c` | direct |
| `int getTpDisplayController()` | R | `POWER_TP_OWNER` `0x0005db1f`<br>`POWER_DISPLAY_OWNER` `0x00024197` | direct |
| `void setAllStatus()` | W |  | none |
| `int setBCMPowerOnLevel()` | W | `POWER_BCM_POWER_ON_LEVEL_SET` `0x0002dbff` | direct |
| `int setPowerCtlStatus(int event_type, int value)` | W | `POWER_OUTPUT_5V_SET` `0x00041ec6`<br>`POWER_OUTPUT_12V_SET` `0x0007daea`<br>`POWER_TFT_TP_POWER_SET` `0x000e16f1` | direct |
| `int setTftBacklight(int value)` | W | `POWER_TFT_BACKLIGHT_SET` `0x000b9519` | direct |
| `int setTpDisplayController(int value)` | W | `POWER_TP_OWNER_SET` `0x0002adac`<br>`POWER_DISPLAY_OWNER_SET` `0x000373df` | direct |

## BYDAutoQcfsDevice

`android.hardware.bydauto.qcfs.BYDAutoQcfsDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `void setAllStatus()` | W |  | none |
| `int setAllUpgradeStatus(byte[] state)` | W | `FS_STATUS_ALL_SET` `0x000b02e9` | direct |
| `int setQcomUpgradeStatus(int value)` | W | `FS_STATUS_QC_SET` `0x000f4abe` | direct |
| `int setSecureIcUpgradeStatus(int value)` | W | `FS_STATUS_SECURE_IC_SET` `0x000905ff` | direct |
| `int setUserConfirm(int value)` | W | `FS_CONFIRM_SET` `0x000a1800` | direct |

## BYDAutoRSEDevice

`android.hardware.bydauto.rse.BYDAutoRSEDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getWriteFeedbackFromRse(int source, int item)` | R | `RSE_L_KID_MODE_FB_TO_IVI_SET` `0x1890201a`<br>`RSE_L_MONITOR_SWITCH_FB_TO_IVI_SET` `0x18902020`<br>`RSE_L_AUDIO_SWITCH_FB_TO_IVI_SET` `0x18902022`<br>`RSE_L_SCREEN_OFF_FB_TO_IVI_SET` `0x18902024`<br>`RSE_R_KID_MODE_FB_TO_IVI_SET` `0x1930201a`<br>`RSE_R_MONITOR_SWITCH_FB_TO_IVI_SET` `0x19302020`<br>`RSE_R_AUDIO_SWITCH_FB_TO_IVI_SET` `0x19302022`<br>`RSE_R_SCREEN_OFF_FB_TO_IVI_SET` `0x19302024` | direct |

## BYDAutoRadarDevice

`android.hardware.bydauto.radar.BYDAutoRadarDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int[] getAllRadarDistance()` | R | `RADAR_OBSTACLE_DISTANCE_LEFT_FRONT` `0x99000061`<br>`RADAR_OBSTACLE_DISTANCE_RIGHT_FRONT` `0x99000064`<br>`RADAR_OBSTACLE_DISTANCE_LEFT_REAR` `0x99000066`<br>`RADAR_OBSTACLE_DISTANCE_RIGHT_REAR` `0x99000067`<br>`RADAR_OBSTACLE_DISTANCE_LEFT` `0x99000065`<br>`RADAR_OBSTACLE_DISTANCE_RIGHT` `0x99000068`<br>`RADAR_OBSTACLE_DISTANCE_FRONT_LEFT_MID` `0x99000062`<br>`RADAR_OBSTACLE_DISTANCE_FRONT_RIGHT_MID` `0x99000063`<br>… +1 more | direct |
| `int[] getAllRadarObstacleDistances()` | R |  | none |
| `int[] getAllRadarProbeStates()` | R | `RADAR_PROBE_STATE_LEFT_FRONT` `0x99000071`<br>`RADAR_PROBE_STATE_RIGHT_FRONT` `0x99000074`<br>`RADAR_PROBE_STATE_LEFT_REAR` `0x99000076`<br>`RADAR_PROBE_STATE_RIGHT_REAR` `0x99000077`<br>`RADAR_PROBE_STATE_LEFT` `0x99000075`<br>`RADAR_PROBE_STATE_RIGHT` `0x99000078`<br>`RADAR_PROBE_STATE_FRONT_LEFT_MID` `0x99000072`<br>`RADAR_PROBE_STATE_FRONT_RIGHT_MID` `0x99000073`<br>… +1 more | direct |
| `int[][] getAllRadarStatus()` | R |  | none |
| `void getAllStatus()` | R |  | none |
| `int getRadarManufacture()` | R | `RADAR_MANUFACTURE` `0x00083b3d` | direct |
| `int getRadarObstacleDistance(int area)` | R | `RADAR_OBSTACLE_DISTANCE_LEFT_FRONT` `0x99000061`<br>`RADAR_OBSTACLE_DISTANCE_RIGHT_FRONT` `0x99000064`<br>`RADAR_OBSTACLE_DISTANCE_LEFT_REAR` `0x99000066`<br>`RADAR_OBSTACLE_DISTANCE_RIGHT_REAR` `0x99000067`<br>`RADAR_OBSTACLE_DISTANCE_LEFT` `0x99000065`<br>`RADAR_OBSTACLE_DISTANCE_RIGHT` `0x99000068`<br>`RADAR_OBSTACLE_DISTANCE_FRONT_LEFT_MID` `0x99000062`<br>`RADAR_OBSTACLE_DISTANCE_FRONT_RIGHT_MID` `0x99000063`<br>… +1 more | direct |
| `int getRadarProbeState(int area)` | R | `RADAR_PROBE_STATE_LEFT_FRONT` `0x99000071`<br>`RADAR_PROBE_STATE_RIGHT_FRONT` `0x99000074`<br>`RADAR_PROBE_STATE_LEFT_REAR` `0x99000076`<br>`RADAR_PROBE_STATE_RIGHT_REAR` `0x99000077`<br>`RADAR_PROBE_STATE_LEFT` `0x99000075`<br>`RADAR_PROBE_STATE_RIGHT` `0x99000078`<br>`RADAR_PROBE_STATE_FRONT_LEFT_MID` `0x99000072`<br>`RADAR_PROBE_STATE_FRONT_RIGHT_MID` `0x99000073`<br>… +1 more | direct |
| `int getReverseRadarSwitchState()` | R | `RADAR_REVERSE_RADAR_SWITCH_STATE` `0x26700038` | direct |
| `void setAllStatus()` | W |  | none |
| `int setRadarSoundState(int state)` | W | `RADAR_SOUND_STATE_SET` `0x4f50003b` | direct |
| `int setReverseRadarSwitchState(int state)` | W | `RADAR_REVERSE_RADAR_SWITCH_STATE` `0x26700038`<br>`RADAR_REVERSE_RADAR_SWITCH_STATE_SET1` `0x4f500008`<br>`RADAR_REVERSE_RADAR_SWITCH_STATE_SET2` `0x4f500047` | direct |

## BYDAutoRadioDevice

`android.hardware.bydauto.radio.BYDAutoRadioDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getCurFreq()` | R | `RADIO_CURRENT_FREQ` `0x330a2020`<br>`RADIO_PLAY_FREQ` `0x330a2020` | direct |
| `int getRadioBand()` | R | `RADIO_CURRENT_STATUS` `0x330a2010`<br>`RADIO_PLAY_BAND` `0x330a2010` | direct |
| `int[] getRadioParam(int band)` | R | `RADIO_FM_INIT_STARTFREQ` `0x330a0010`<br>`RADIO_FM_INIT_ENDFREQ` `0x330a0020`<br>`RADIO_FM_INIT_STEP` `0x330a0030`<br>`RADIO_AM_INIT_STARTFREQ` `0x330a1010`<br>`RADIO_AM_INIT_ENDFREQ` `0x330a1020`<br>`RADIO_AM_INIT_STEP` `0x330a1030` | direct |
| `int getRadioState()` | R | `RADIO_CURRENT_STATUS` `0x330a2010`<br>`RADIO_PLAY_BAND` `0x330a2010` | direct |
| `int getSearchProcessState()` | R | `RADIO_SEARCH_STATUS` `0x330aa010` | direct |
| `int setCurFreq(int band, int frequency)` | W | `RADIO_PLAY_BAND_SET` `0x4e0a2010`<br>`RADIO_PLAY_FREQ_SET` `0x4e0a2020` | direct |
| `int setRadioParam(int band, int start, int end, int step)` | W | `RADIO_FM_INIT_STARTFREQ_SET` `0x4e0a0010`<br>`RADIO_FM_INIT_ENDFREQ_SET` `0x4e0a0020`<br>`RADIO_FM_INIT_STEP_SET` `0x4e0a0030`<br>`RADIO_AM_INIT_STARTFREQ_SET` `0x4e0a1010`<br>`RADIO_AM_INIT_ENDFREQ_SET` `0x4e0a1020`<br>`RADIO_AM_INIT_STEP_SET` `0x4e0a1030` | direct |

## BYDAutoRearViewMirrorDevice

`android.hardware.bydauto.doormirror.BYDAutoRearViewMirrorDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getAutoExternalRearMirrorAntiglareState()` | R | `REAR_VIEW_MIRROR_ANTIGLARE_STATE` `0x3b900038` | direct |
| `int getAutoExternalRearMirrorState()` | R | `REAR_VIEW_MIRROR_STATE` `0x39400008` | direct |

## BYDAutoReminderDevice

`android.hardware.bydauto.reminder.BYDAutoReminderDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getIndicatorValue()` | R | `REMINDER` `0x000161e1` | direct |

## BYDAutoRescueDevice

`android.hardware.bydauto.rescue.BYDAutoRescueDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getAirbagState()` | R | `RESCUE_CALL_AIRBAG_STATE` `0x08c00008` | direct |
| `int getInfoFromMCU()` | R | `RESCUE_INFO_FROM_MCU` `0x3fd00014` | direct |
| `int setInfoToMCU(byte[] info)` | W | `RESCUE_INFO_TO_MCU_SET` `0xaa000028` | direct |

## BYDAutoSafetyBeltDevice

`android.hardware.bydauto.safetybelt.BYDAutoSafetyBeltDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getMessage5sOnlineState(int id)` | R | `ONLINE_HAS_0x048100` `0x48100000`<br>`SAFETY_BELT_MSR_481_ONLINE` `0x48100000` | direct |
| `int getPassengerStatus(int area)` | R | `SAFETY_BELT_PASSENGER_COMMAND_DEPUTY` `0x12d0000f`<br>`SAFETY_BELT_PASSENGER_COMMAND_SECOND_ROW_SEAT_LEFT` `0x0008702b`<br>`SAFETY_BELT_PASSENGER_COMMAND_SECOND_ROW_SEAT_RIGHT` `0x4750001b`<br>`SAFETY_BELT_PASSENGER_COMMAND_SECOND_ROW_SEAT_MID` `0x000b2021` | direct |
| `int getSafetyBeltMsrState()` | R | `SAFETY_BELT_MSR_STATE` `0x48100028` | direct |
| `int getSafetyBeltReminder()` | R | `SAFETY_BELT_REMINDER` `0x05500043` | direct |
| `int getSafetyBeltStatus(int area)` | R | `SAFETY_BELT_COMMAND_AREA_MAIN` `0xa9400018`<br>`SAFETY_BELT_COMMAND_AREA_DEPUTY` `0x12d0003f`<br>`SAFETY_BELT_COMMAND_AREA_SECOND_ROW_SEAT_LEFT` `0x000b8915`<br>`SAFETY_BELT_COMMAND_AREA_SECOND_ROW_SEAT_RIGHT` `0x4750001a`<br>`SAFETY_BELT_COMMAND_AREA_SECOND_ROW_SEAT_MID` `0x00076420` | direct |
| `int setSafetyBeltSbcdState(int state)` | W | `SAFETY_BELT_MSR_STATE_SET` `0x3850001c` | direct |

## BYDAutoSecurityDevice

`android.hardware.bydauto.security.BYDAutoSecurityDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `byte[] getSecurityState()` | R | `SECURITY_STATE_S` `0x000b6bdb` | direct |
| `void setAllStatus()` | W |  | none |

## BYDAutoSensorDevice

`android.hardware.bydauto.sensor.BYDAutoSensorDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `double getHumiditySensorValue()` | R | `SENSOR_HUMIDITY` `0x000b4cd7` | direct |
| `int getLightIntensity()` | R | `SENSOR_LIGHT` `0x12d00014` | direct |
| `byte[] getSensorAxValue()` | R | `SENSOR_AX_STATUS_223` `0x2230003f`<br>`SENSOR_AX_223` `0x22300008`<br>`SENSOR_AX_OFFSET_223` `0x22300014` | direct + via getSensorAxValue() |
| `int getSlope()` | R | `SENSOR_AUTO_SLOPE` `0x2230002c` | direct |
| `double getTemperatureSensorValue()` | R | `SENSOR_TEMPERATURE` `0x000c2697` | direct |
| `int setOrientationAngle(int value)` | W | `SENSOR_G_SENSOR_OR_ANGLE_SET` `0x42600008` | direct |

## BYDAutoSettingDevice

`android.hardware.bydauto.setting.BYDAutoSettingDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getACAutoAir()` | R | `SET_AC_AUTO_AIR` `0x4d902018` | direct |
| `int getACAutoWindLevel()` | R | `SET_AC_AUTO_WIND_LV` `0x4d902012` | direct |
| `int getACBTWind()` | R | `SET_AC_BT` `0x4d902016` | direct |
| `int getACPauseCycle()` | R | `SET_AC_PAUSE_CYCLE` `0x4d902014` | direct |
| `int getACTunnelCycle()` | R | `SET_AC_TUNNEL_CYCLE` `0x4d902010` | direct |
| `int getAirLightPanelState()` | R | `SET_ATMOSPHERE_LAMP_PANEL_STATE` `0x3b300008` | direct |
| `int getAirLightTextNumber()` | R | `SET_ATMOSPHERE_LAMP_TEXT_TRIGGER_NUMBER` `0x3b300018` | direct |
| `int getAirLightTextState()` | R | `SET_ATMOSPHERE_LAMP_TEXT_STATE` `0x3b300014` | direct |
| `int getAutoExternalRearMirrorFollowUpSwitch()` | R | `SET_CAR_EXTREARMIR_FOLLOWUP_SWITCH` `0x4070001c` | direct |
| `int getAutoLock()` | R | `SET_CAR_AUTO_LOCK_DET` `0xc0700014` | direct |
| `int getAutoLockSwitch()` | R | `SET_CAR_AUTO_LOCK` `0x40700014` | direct |
| `int getAutoLockTime()` | R | `SET_AUTO_LOCK_TIME` `0x3940001c` | direct |
| `int getAutoRainWiperState()` | R | `SET_AUTO_RAIN_WIPER_SWITCH` `0x1330001e` | direct |
| `int getBTCallReductionWindMenuState()` | R | `SET_BT_CALL_REDUCTION_WIND_MENU` `0x4e600008` | direct |
| `byte[] getBTMacAddr()` | R | `SET_CMD_BT_KEY_MAC` `0x48004010` | direct |
| `int getBackDoorElectricMode()` | R | `SET_CAR_BACK_DOOR_ELECTRIC_MODE` `0x4b60000b` | direct |
| `int getBackDoorElectricModeOnlineState()` | R | `SET_CAR_BACK_DOOR_ELECTRIC_MODE_DET` `0x4010001b` | direct |
| `int getBackDoorOpenedHeight()` | R | `SET_BACK_DOOR_OPEN_HEIGHT` `0x40100008` | direct |
| `int getBackHomeLightDelay()` | R |  | none |
| `int getBackHomeLightDelayValue()` | R | `SET_CAR_BACK_HOME_LIGHT_DELAY_VALUE` `0x3ff0002d` | direct |
| `int getBackRowControl()` | R | `SET_CAR_BACK_ROW` `0x00016ba3` | direct |
| `int getBasePadAutoRise()` | R | `SET_CAR_BASE_PAD_AUTO_RISE_DET` `0x000fb0cc` | direct |
| `int getBasePadAutoRiseState()` | R | `SET_CAR_BASE_PAD_AUTO_RISE` `0x000a41ad` | direct |
| `int getCarRecorderRecording()` | R | `SET_CAR_DVR_RECORD` `0x3ba00020` | direct |
| `int getChargingPort()` | R | `SET_DR_CHARGER_PORT` `0x4750000c` | direct |
| `int getCourtesyLampTime()` | R | `SET_COURTESY_LAMP_TIME` `0x39400010` | direct |
| `int getCruiseBulletBox()` | R | `SETTING_AUTO_CRUISE_PROMPT` `0x32d0001e` | direct |
| `int getDmPlatform()` | R | `SET_DM_PLATFORM` `0x2ed00008` | direct |
| `int getDoorLock()` | R | `SET_CAR_DOOR_LOCK` `0x0002e81d` | direct |
| `int getDriveConfig()` | R | `SET_DRIVE_CONFIG_TYPE` `0x34100038` | direct |
| `int getDriveDoorCloseInd()` | R | `SET_MMS_DOOR_CLOSE` `0x0003723e` | direct |
| `int getDriverSeatAutoReturn()` | R | `SET_CAR_DV_AUTO_RETURN` `0x49400010` | direct |
| `int getDriverSeatBack()` | R | `SET_CAR_DRIVER_SEATBK_DET` `0xc9400010` | direct |
| `int getDrivingRecorder()` | R | `SET_CAR_DRVING_RECORD_DET` `0x3ba00000` | direct |
| `int getDrivingRecorderSwitchState()` | R |  | none |
| `int getDualTempAreaAcOnlineState()` | R | `SET_CAR_DUAL_TEMP_AREA_AC_DET` `0x000a4bf7` | direct |
| `int getEPedalMode()` | R | `SET_E_PEDAL_MODE_STATE` `0x34f0003a` | direct |
| `int getElecHandbrakeState()` | R | `ONLINE_HAS_0x021800` `0x21800000`<br>`SET_CAR_ELEC_HANDBRAKE_DET` `0x21800000` | direct |
| `int getEnergyFeedback()` | R | `SET_DR_ENERGY_FB` `0x34100022` | direct |
| `int getEngineOilExitUpdateState()` | R | `SET_ENGINEOIL_EXIT_UPDATE` `0x05500011` | direct |
| `int getEngineOilLevel()` | R | `SET_ENGINE_OIL_LEVEL` `0x30d00038` | direct |
| `int getEngineOilUpdateSignal()` | R | `SET_ENGINE_OIL_UPDATE_SIGNAL` `0x23300018` | direct |
| `int getExhibitionMode()` | R | `SET_EXHIBITION_MODE` `0x31e00008` | direct |
| `int getExhibitionStartEnginePrompt()` | R | `SET_EXHIBITION_START_ENGINE_PROMPT` `0x46c0003c` | direct |
| `int getExternalRearMirrorAutoFoldSetting()` | R | `SET_HAVE_REARVIEW_MIRROR_AUTO_FOLD` `0x4070001a` | direct |
| `int getHandleAutoResetTime()` | R | `SET_HANDLE_AUTO_RESET` `0x40700041` | direct |
| `int getHomeLightTime()` | R | `SET_CAR_HOME_LIGHT_DET` `0xbff0002d` | direct |
| `int getIALArea()` | R | `SET_INTERIOR_ATMOSPHERE_LAMP_AREA` `0x42e00020` | direct |
| `int getIALBrightness()` | R | `SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS` `0x0007f8ae` | direct |
| `int getIALBrightness(int area)` | R | `SET_IAL_FRONT_BRIGHTNESS` `0x42e00008`<br>`SET_IAL_BACK_BRIGHTNESS` `0x42e0000c`<br>`SET_IAL_ALL_BRIGHTNESS` `0x00043611` | direct |
| `int getIALColor()` | R | `SET_INTERIOR_ATMOSPHERE_LAMP_COLOR` `0x000453c2` | direct |
| `int getIALColor(int area)` | R | `SET_IAL_FRONT_COLOR` `0x42e00010`<br>`SET_IAL_BACK_COLOR` `0x42e00017`<br>`SET_IAL_ALL_COLOR` `0x0002ae1a` | direct |
| `int getIKEYBTLowPowerMode()` | R | `SET_CMD_BT_LOW_POWER_MODE` `0x40b10010` | direct |
| `int getILDuration()` | R | `SET_INTERIOR_LAMP_DURATION` `0x39400015` | direct |
| `int getINSTheme()` | R | `SET_INS_THEME_VALUE` `0x49c00028` | direct |
| `int getInsBacklightCtl()` | R | `SET_INSTRUMENT_BACKLIGHT_CTL_TYPE` `0x4bf0002d` | direct |
| `int getInsideLightDoorState()` | R | `SET_INSIDE_LIGHT_DOOR_STATE` `0x42e0002b` | direct |
| `int getInsideRearMirrorScreenSwitchState()` | R | `SET_CAR_INSIDE_REAR_MIRROR_SCREEN_SWITCH` `0x3b900018` | direct |
| `int getInstrumentAcKeyType()` | R | `SET_INSTRUEMT_AC_KEY` `0x4e501010` | direct |
| `int getIntelligentVoiceIND()` | R | `SET_CAR_SPEECH_HINT` `0x000a8985` | direct |
| `int getKeyPowerLowInd()` | R | `SET_MMS_KEY_LOW` `0x0000afa7` | direct |
| `int getLPSwitchDownwindow()` | R | `SET_CAR_LPSWITCH_DNWINDOW_DET` `0xc8e0000e` | direct |
| `int getLPSwitchUpwindow()` | R | `SET_CAR_LPSWITCH_UPWINDOW_DET` `0xc8e0000c` | direct |
| `int getLanguage()` | R | `SET_LANGUAGE_TYPE` `0x49c0000a` | direct |
| `int getLanternLanguageMode()` | R | `SET_LANTERN_LANGUAGE_MODE` `0x31e0000c` | direct |
| `int getLearnerDriverAccLimitState()` | R | `SET_LEARNER_DRIVER_ACC_LIMIT_STATE` `0x34f00028` | direct |
| `int getLearnerDriverModeState()` | R | `SET_LEARNER_DRIVER_MODE_STATE` `0x34f00025` | direct |
| `int getLearnerDriverModeSwitchState()` | R | `SET_LEARNER_DRIVER_MODE_STATE` `0x34f00025` | direct |
| `int getLeaveCarPInd()` | R | `SET_MMS_LEAVE_P` `0x0007e78d` | direct |
| `int getLeaveHomeLightTime()` | R | `SET_CAR_HOME_OFF_LIGHT_DET` `0xbff00030` | direct |
| `int getLeftFieldPlatform()` | R | `SET_LEFT_FIELD_PLATFORM` `0x2940002a` | direct |
| `int getLeftHeadlampLevel()` | R | `SET_CMD_LEFT_HEAD_LIGHT_LEVEL` `0x3ac00013` | direct |
| `int getLeftHomeLightDelay()` | R | `SET_CAR_LEFT_HOME_LIGHT_DELAY` `0x00034898` | direct |
| `int getLeftHomeLightDelayValue()` | R | `SET_CAR_LEFT_HOME_LIGHT_DELAY_VALUE` `0x3ff00030` | direct |
| `int getLeftViewMirrorFlipAngle()` | R | `SET_CAR_L_VIEW` `0x4b800024` | direct |
| `int getLockCarRiseWindow()` | R | `SET_CAR_LOCK_CLOSEWINDOW` `0x48e00020` | direct |
| `int getLockOff()` | R | `SET_CAR_LOCK_OFF` `0x40700016` | direct |
| `int getLockUpwindow()` | R | `SET_CAR_LOCK_AUTO_WINDOW_DET` `0xc8e00020` | direct |
| `int getLongPressUnlockWindow()` | R | `SET_CAR_LPUNLOCKWINDOW` `0x48e0000e` | direct |
| `int getLowBatteryInd()` | R | `SET_MMS_LOW_BAT` `0x00093073` | direct |
| `int getLowOilInd()` | R | `SET_MMS_LOW_OIL` `0x000eceb3` | direct |
| `int getMaintainRemindState()` | R | `SET_MAINTAIN_REMIND_STATE` `0x0550001a` | direct |
| `int getMassageLevel(int type)` | R | `SET_REAR_LEFT_SEAT_MASSAGE_LEVEL` `0x4fa00024`<br>`SET_REAR_RIGHT_SEAT_MASSAGE_LEVEL` `0x4fa0002c` | direct |
| `int getMassageMode(int type)` | R | `SET_REAR_LEFT_SEAT_MASSAGE_MODE` `0x4fa00020`<br>`SET_REAR_RIGHT_SEAT_MASSAGE_MODE` `0x4fa00028` | direct |
| `int getMicroSwitchLockWindowState()` | R | `SET_CAR_MICRO_SWITCH_LOCK_WINDOW` `0x48e0000c` | direct |
| `int getMicroSwitchUnlockWindowState()` | R | `SET_CAR_LPUNLOCKWINDOW` `0x48e0000e` | via getLongPressUnlockWindow() |
| `int getMissKeyInd()` | R | `SET_MMS_MIS_KEY` `0x000999e2` | direct |
| `int getMultimediaMotorTemperatureState()` | R | `SET_MULTIMEDIA_ELECTRIC_MOTOR_TEMP` `0x41f0001a` | direct |
| `int getNightDRLightOnInd()` | R | `SET_MMS_NIGHT_DR` `0x0006ffc8` | direct |
| `int getNightDriveLightOnReminder()` | R | `SET_NIGHT_DRIVE_LIGHT_ON_REMINDER` `0x3ff0000f` | direct |
| `int getOffReminder()` | R | `SET_POWER_OFF_REMINDER` `0x43400008` | direct |
| `int getOverspeedLock()` | R | `SET_OVERSPEED_LOCKING_STATE` `0x40700014` | direct |
| `int getOverspeedLockingState()` | R | `SET_OVERSPEED_LOCKING_STATE` `0x40700014` | direct |
| `int getPM25Power()` | R | `SET_CAR_PM25_POWER` `0x4f600008` | direct |
| `int getPM25Switch()` | R | `SET_CAR_PM25_CTRL` `0x0000a5d0` | direct |
| `int getPM25SwitchCheck()` | R | `SET_CAR_PM25_SW_CHECK` `0x4f60000c` | direct |
| `int getPM25TimeCheck()` | R | `SET_CAR_PM25_TIME` `0x4f60000e` | direct |
| `int getPanoramaSunRoofOnlineState()` | R | `SET_CAR_PANORAMIC_SUNROOF_DET` `0x0007f440` | direct |
| `int getParkBrakeInd()` | R | `SET_MMS_FREE_P` `0x00082d2b` | direct |
| `int getRearAcOnlineState()` | R | `SET_CAR_REAR_AC_DET` `0x4330001a` | direct |
| `int getRearAcPanelAutoLockTime()` | R | `SET_REAR_AC_PANEL_LOCK_TIME` `0x3f10000d` | direct |
| `int getRearMirrorFlip()` | R | `SET_CAR_REAR_MIRROR_FLIP_DET` `0xc9400018` | direct |
| `int getRearViewMirrorAngle()` | R | `SET_CAR_REAR_VIEW_ANGLE` `0x4940003e` | direct |
| `int getRearViewMirrorAutoFoldMode()` | R | `SET_CAR_EXT_REARVIEW_MIRROR_AUTO_FOLD` `0x0003b9bf` | direct |
| `int getRearViewMirrorAutoFoldModeOnlineState()` | R | `SET_CAR_EXT_REARVIEW_MIRROR_AUTO_FOLD_DET` `0x4070001a` | direct |
| `int getRearViewMirrorFlip()` | R | `SET_CAR_REAR_VIEW` `0x49400018` | direct |
| `int getRemoteControlDownwindow()` | R | `SET_CAR_TELECTRL_DNWINDOW_DET` `0xc8e0000a` | direct |
| `int getRemoteControlDownwindowState()` | R | `SET_CAR_CTRL_WINDOW` `0x48e0000a` | direct |
| `int getRemoteControlUpwindow()` | R | `SET_CAR_TELECTRL_UPWINDOW_DET` `0xc8e00008` | direct |
| `int getRemoteControlUpwindowState()` | R | `SET_CAR_REMOTE_CTRL_UPWINDOW` `0x48e00008` | direct |
| `int getRemoteCtlUnlockingState()` | R | `SET_REMOTE_CONTROL_UNLOCKING` `0x40700016` | direct |
| `int getRemoteDrivingOnlineState()` | R | `SET_CAR_REMOTE_DRIVING_DET` `0x000b550c` | direct |
| `int getRightHeadlampLevel()` | R | `SET_CMD_RIGHT_HEAD_LIGHT_LEVEL` `0x3ad00013` | direct |
| `int getRightViewMirrorFlipAngle()` | R | `SET_CAR_R_VIEW` `0x4b900010` | direct |
| `int getSOCConfig()` | R | `SET_SOC_DM_VERSION` `0x34f00015` | direct |
| `int getSOCTarget()` | R | `SET_DR_SOC_TARGET` `0x34100028` | direct |
| `int getSafeBeltInd()` | R | `SET_MMS_BELT` `0x00029c92` | direct |
| `int getSafeWarnState()` | R | `SET_SAFE_WARN_STATE` `0x0550001b` | direct |
| `int getSeatHeatingState(int seatID)` | R | `SET_DRIVER_SEAT_HEATING_STATE` `0x4fa0000b`<br>`SET_PASSENGER_SEAT_HEATING_STATE` `0x4fa00013`<br>`SET_REAR_LEFT_SEAT_HEATING_STATE` `0x4860000b`<br>`SET_REAR_RIGHT_SEAT_HEATING_STATE` `0x48600013` | direct |
| `int getSeatHeatingState1(int seatID)` | R | `SET_DRIVER_SEAT_HEATING_STATE1` `0x3b400042`<br>`SET_PASSENGER_SEAT_HEATING_STATE1` `0x3b400044` | direct |
| `int getSeatVentilatingState(int seatID)` | R | `SET_DRIVER_SEAT_VENTILATING_STATE` `0x4fa00008`<br>`SET_PASSENGER_SEAT_VENTILATING_STATE` `0x4fa00010`<br>`SET_REAR_LEFT_SEAT_VENTILATING_STATE` `0x48600008`<br>`SET_REAR_RIGHT_SEAT_VENTILATING_STATE` `0x48600010` | direct |
| `int getSmartWelcomeLightState()` | R | `SET_SMART_WELCOME_LIGHT_STATE` `0x3c500008` | direct |
| `int getSpeedReminderValue()` | R | `SET_SPEED_REMINDER` `0x25d00030` | direct |
| `int getStartKeyState()` | R | `SET_START_KEY_STATE` `0x4340000a` | direct |
| `int getStartOrPowerInd()` | R | `SET_MMS_START_F` `0x00020328` | direct |
| `int getSteerAssis()` | R | `SET_DR_ST_ASSIS` `0x24c00010` | direct |
| `int getSteerAssistPermission()` | R | `SET_EPS_PERMISSION` `0x24c00013` | direct |
| `int getSteerBack()` | R | `SET_CAR_STEER_BACK_DET` `0xc9400022` | direct |
| `int getSteerPositionAutoReturn()` | R | `SET_CAR_ST_AUTO_RETURN` `0x49400022` | direct |
| `int getSteerType()` | R | `SET_CMD_WHEEL_DOOR_KEY` `0x42900010` | direct |
| `int getSteeringWheelHeatingState()` | R | `SET_STEERING_WHEEL_HEAT_STATE` `0x4290000e` | direct |
| `int getStopRemoteCtrlDriveInd()` | R | `SET_MMS_STOP_REMOTECTRL_DRIVE` `0x000219c5` | direct |
| `int getUnlockDownwindow()` | R | `SET_CAR_UNLOCK_AUTO_WINDOW_DET` `0x000579ff` | direct |
| `int getUnlockSettingOnlineState()` | R | `SET_CAR_UNLOCK_SETTING_DET` `0xc0700016` | direct |
| `int getVehicleState()` | R | `SET_VEHICLE_STATE` `0x12d00020` | direct |
| `int getVoiceINDLevel()` | R | `SET_CAR_SPEECH_VOL` `0x0003f327` | direct |
| `int getWindscreenWiperOverhaulState(int area)` | R | `SET_FRONT_WINDSCREEN_WIPER_OVERHAUL_STATE` `0x4750001c`<br>`SET_REAR_WINDSCREEN_WIPER_OVERHAUL_STATE` `0x4750001e` | direct |
| `int hasFeature(String feature)` | R | `SET_HAS_INTERIOR_ATMOSPHERE_LAMP` `0x3ff00000`<br>`SET_HAS_SEAT_HEATING_AND_VENTILATING` `0xcfa00008`<br>`SET_HAS_OVERSPEED_LOCKING` `0xc0700014`<br>`SET_CAR_BACK_DOOR_ELECTRIC_MODE_DET` `0x4010001b`<br>`SET_HAS_BT_CALL_REDUCTION_WIND` `0x4d902000`<br>`SET_HAS_FRONT_WINDSCREEN_WIPER_OVERHAUL` `0xc750001c`<br>`SET_REAR_WINDSCREEN_WIPER_OVERHAUL_STATE` `0x4750001e`<br>`SET_HAS_PARKING_AUTO_INNER_LOOP` `0x4d902000`<br>… +35 more | direct + via getBTMacAddr(), getSteeringWheelHeatingState() |
| `int setACAutoAir(int value)` | W | `SET_AC_AUTO_AIR_SET` `0x4e30000c` | direct |
| `int setACAutoWindLevel(int value)` | W | `SET_AC_AUTO_WIND_LV_SET` `0x4e300010` | direct |
| `int setACBTWind(int value)` | W | `SET_AC_BT_SET` `0x4e300020` | direct |
| `int setACPauseCycle(int value)` | W | `SET_AC_PAUSE_CYCLE_SET` `0x4e300012` | direct |
| `int setACTunnelCycle(int value)` | W | `SET_AC_TUNNEL_CYCLE_SET` `0x4e30000a` | direct |
| `int setAirLightPanelState(int state)` | W | `SET_ATMOSPHERE_LAMP_PANEL_STATE_SET` `0x4c109010` | direct |
| `void setAllStatus()` | W |  | none |
| `int setAutoExternalRearMirrorFollowUpSwitch(int value)` | W | `SET_CAR_EXTREARMIR_FOLLOWUP_SWITCH_SET` `0x4e40001a` | direct |
| `int setAutoLockSwitch(int value)` | W | `SET_CAR_AUTO_LOCK_SET` `0x4e400008` | direct |
| `int setAutoLockTime(int time)` | W | `SET_AUTO_LOCK_TIME_SET` `0x000d6643` | direct |
| `int setAutoRainWiperState(int state)` | W | `SET_AUTO_RAIN_WIPER_SWITCH_SET` `0x1e00003c` | direct |
| `int setBTCallState(int state)` | W | `SET_CMD_BTCALL_STATE_SET` `0x43e00035` | direct |
| `int setBackDoorElectricMode(int value)` | W | `SET_CAR_BACK_DOOR_ELECTRIC_MODE_SET` `0x3fc0001a` | direct |
| `int setBackDoorOpenedHeight(int height)` | W | `SET_BACK_DOOR_OPEN_HEIGHT_SET` `0x3fc00040` | direct |
| `int setBackHomeLightDelay(int value)` | W | `SET_CAR_BACK_HOME_LIGHT_DELAY_SET` `0x000a2ed8` | direct |
| `int setBackHomeLightDelayValue(int value)` | W | `SET_CAR_BACK_HOME_LIGHT_DELAY_VALUE_SET` `0x4e400012` | direct |
| `int setBackRowControl(int value)` | W | `SET_CAR_BACK_ROW_SET` `0x1e000010` | direct |
| `int setBasePadAutoRiseState(int value)` | W | `SET_CAR_BASE_PAD_AUTO_RISE_SET` `0x00029736` | direct |
| `int setCallState(int value)` | W | `SET_CALL_STATE_SET` `0x1de00020` | direct |
| `int setCarRecorderRecording(int value)` | W | `SET_CAR_DVR_RECORD_SET` `0x3fc0002e` | direct |
| `int setCarSetReset(int doorWindowResetState, int lockResetState, int seatSelfReturnResetState, int rearMirrorResetState, int atmpResetState, int readingLightResetState, int backLightResetState, int acResetState, int equalizerState, int soundfieldState)` | W | `SET_DOOR_WINDOW_RESET_SET` `0x3e300032`<br>`SET_LOCK_RESET_SET` `0x3e300033`<br>`SET_SEAT_SELF_RETURN_RESET_SET` `0x3e300035`<br>`SET_REAR_MIRROR_RESET_SET` `0x3e300034`<br>`SET_ATMP_RESET_SET` `0x3e30003c`<br>`SET_READING_LIGHT_RESET_SET` `0x3e30003d`<br>`SET_BACK_LIGHT_RESET_SET` `0x3e30003e`<br>`AC_RESET_SET` `0x3e300030`<br>… +2 more | direct |
| `int setChargingPort(int value)` | W | `SET_DR_CHARGER_PORT_SET` `0x4e300036` | direct |
| `int setCourtesyLampTime(int time)` | W | `SET_COURTESY_LAMP_TIME_SET` `0x3e300025` | direct |
| `int setDigitalPanelTestMode(int value)` | W | `SET_DIGITAL_PANEL_TEST_MODE_SET` `0x000e4372` | direct |
| `int setDoorLock(int value)` | W | `SET_CAR_DOOR_LOCK_SET` `0x0007de3f` | direct |
| `int setDriveDoorCloseInd(int value)` | W | `SET_MMS_DOOR_CLOSE_SET` `0x0000e865` | direct |
| `int setDriverSeatAutoReturn(int value)` | W | `SET_CAR_DV_AUTO_RETURN_SET` `0x4e400039` | direct |
| `int setDrivingRecorderSwitchState(int value)` | W |  | none |
| `int setDrivingRecorderUIStatus(int value)` | W |  | none |
| `int setEPedalMode(int value)` | W | `SET_E_PEDAL_MODE_STATE_SET` `0x2bc00028` | direct |
| `int setEnergyFeedback(int value)` | W | `SET_DR_ENERGY_FB_SET` `0x4e300025` | direct |
| `int setEngineOilExitUpdateState(int state)` | W | `SET_ENGINEOIL_EXIT_UPDATE_SET` `0x4e40003f` | direct |
| `int setExhibitionStartEnginePermit(int value)` | W | `SET_EXHIBITION_START_ENGINE_PERMIT_SET` `0x2ea00010` | direct |
| `int setFestivalInfo(int info)` | W | `SET_FESTIVAL_INFORMATION_SET` `0x40901028` | direct |
| `int setFormatMemoryCard(int value)` | W | `SET_CAR_FORMAT_MEMORY_CARD_SET` `0x4de01021` | direct |
| `int setHandleAutoResetTime(int time)` | W | `SET_HANDLE_AUTO_RESET_SET` `0x4ef32018` | direct |
| `int setHeadlampLevel(int level)` | W | `SET_CMD_HEADLAMP_HEIGHT_LEVEL_SET` `0x43100024` | direct |
| `int setIALArea(int area)` | W | `SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET` `0x3fc00014` | direct |
| `int setIALArea(int area, int source)` | W | `SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET` `0x3fc00008`<br>`SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET` `0x3fc00010`<br>`SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET` `0x3fc00014`<br>`SET_INTERIOR_ATMOSPHERE_LAMP_SOURCE_SET` `0x3fc00037` | direct |
| `int setIALBrightness(int area, int brightness, int source)` | W | `SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET` `0x3fc00008`<br>`SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET` `0x3fc00010`<br>`SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET` `0x3fc00014`<br>`SET_INTERIOR_ATMOSPHERE_LAMP_SOURCE_SET` `0x3fc00037` | direct |
| `int setIALBrightness(int brightness)` | W | `SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET` `0x3fc00010` | direct |
| `int setIALColor(int area, int color, int source)` | W | `SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET` `0x3fc00008`<br>`SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET` `0x3fc00010`<br>`SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET` `0x3fc00014`<br>`SET_INTERIOR_ATMOSPHERE_LAMP_SOURCE_SET` `0x3fc00037` | direct |
| `int setIALColor(int color)` | W | `SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET` `0x3fc00008` | direct |
| `int setIALInfo(int area, int color, int brightness, int source)` | W | `SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET` `0x3fc00008`<br>`SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET` `0x3fc00010`<br>`SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET` `0x3fc00014`<br>`SET_INTERIOR_ATMOSPHERE_LAMP_SOURCE_SET` `0x3fc00037` | direct |
| `int setILDuration(int duration)` | W | `SET_INTERIOR_LAMP_DURATION_SET` `0x3e300022` | direct |
| `int setINSTheme(int value)` | W | `SET_INS_THEME_VALUE_SET` `0x4e400028` | direct |
| `int setInsideLightDoorState(int state)` | W | `SET_INSIDE_LIGHT_DOOR_STATE_SET` `0x4f500038` | direct |
| `int setInsideRearMirrorScreenState(int value)` | W | `SET_CAR_INSIDE_REAR_MIRROR_SCREEN_SET` `0x4de0101e` | direct |
| `int setInsideRearMirrorScreenSwitchState(int value)` | W | `SET_CAR_INSIDE_REAR_MIRROR_SCREEN_SWITCH_SET` `0x4de0101c` | direct |
| `int setIntelligentVoiceIND(int value)` | W | `SET_CAR_SPEECH_HINT_SET` `0x00094527` | direct |
| `int setKeyPowerLowInd(int value)` | W | `SET_MMS_KEY_LOW_SET` `0x00013ece` | direct |
| `int setLanguage(int value)` | W | `SET_LANGUAGE_TYPE_SET` `0x4c108028` | direct |
| `int setLanternLanguageMode(int mode)` | W | `SET_LANTERN_LANGUAGE_MODE_SET` `0x4c10a02a` | direct |
| `int setLearnerDriverModeSwitchState(int state)` | W | `SET_LEARNER_DRIVER_MODE_STATE_SET` `0x2bc00008` | direct |
| `int setLeaveCarPInd(int value)` | W | `SET_MMS_LEAVE_P_SET` `0x000ee279` | direct |
| `int setLeftHomeLightDelay(int value)` | W | `SET_CAR_LEFT_HOME_LIGHT_DELAY_SET` `0x000821ef` | direct |
| `int setLeftHomeLightDelayValue(int value)` | W | `SET_CAR_LEFT_HOME_LIGHT_DELAY_VALUE_SET` `0x4e400015` | direct |
| `int setLeftViewMirrorFlipAngle(int value)` | W | `SET_CAR_L_VIEW_SET` `0x0005cfe5` | direct |
| `int setLockCarRiseWindow(int value)` | W | `SET_CAR_LOCK_CLOSEWINDOW_SET` `0x4e300046` | direct |
| `int setLockOff(int value)` | W | `SET_CAR_LOCK_OFF_SET` `0x4e400018` | direct |
| `int setLockReplayVideo(int value)` | W |  | none |
| `int setLongPressUnlockWindow(int value)` | W | `SET_CAR_LPUNLOCKWINDOW_SET` `0x4e300042` | direct |
| `int setLowBatteryInd(int value)` | W | `SET_MMS_LOW_BAT_SET` `0x000bf405` | direct |
| `int setLowOilInd(int value)` | W | `SET_MMS_LOW_OIL_SET` `0x000c0f87` | direct |
| `int setMassageLevel(int type, int state)` | W | `SET_REAR_LEFT_SEAT_MASSAGE_LEVEL_SET` `0x2cc00024`<br>`SET_REAR_RIGHT_SEAT_MASSAGE_LEVEL_SET` `0x2cc0002c` | direct |
| `int setMassageMode(int type, int state)` | W | `SET_REAR_LEFT_SEAT_MASSAGE_MODE_SET` `0x2cc00020`<br>`SET_REAR_RIGHT_SEAT_MASSAGE_MODE_SET` `0x2cc00028` | direct |
| `int setMcuPH2State(int state)` | W | `SET_BACKLIGHT_NIGHTMODE_SET` `0x000176aa` | direct |
| `int setMicroSwitchLockWindowState(int value)` | W | `SET_CAR_MICRO_SWITCH_LOCK_WINDOW_SET` `0x4e300040` | direct |
| `int setMicroSwitchUnlockWindowState(int value)` | W | `SET_CAR_LPUNLOCKWINDOW_SET` `0x4e300042` | via setLongPressUnlockWindow() |
| `int setMissKeyInd(int value)` | W | `SET_MMS_MIS_KEY_SET` `0x0004fefa` | direct |
| `int setNightDRLightOnInd(int value)` | W | `SET_MMS_NIGHT_DR_SET` `0x000ab24b` | direct |
| `int setOverspeedLock(int value)` | W | `SET_OVERSPEED_LOCKING_STATE_SET` `0x4e400008` | direct |
| `int setOverspeedLockingState(int state)` | W | `SET_OVERSPEED_LOCKING_STATE_SET` `0x4e400008` | direct |
| `int setPM25Power(int value)` | W | `SET_CAR_PM25_POWER_SET` `0x4f500014` | direct |
| `int setPM25Switch(int value)` | W | `SET_CAR_PM25_CTRL_SET` `0x4f500012` | direct |
| `int setPM25SwitchCheck(int value)` | W | `SET_CAR_PM25_SW_CHECK_SET` `0x4f500016` | direct |
| `int setPM25TimeCheck(int value)` | W | `SET_CAR_PM25_TIME_SET` `0x4f500018` | direct |
| `int setPadRotation(int rotation)` | W | `SET_PAD_ROTATION_SET` `0x4f50003d` | direct |
| `int setParkBrakeInd(int value)` | W | `SET_MMS_FREE_P_SET` `0x000950f2` | direct |
| `int setRearAcPanelAutoLockTime(int time)` | W | `SET_REAR_AC_PANEL_LOCK_TIME_SET` `0x4f500030` | direct |
| `int setRearViewMirrorAutoFoldMode(int value)` | W | `SET_CAR_EXT_REARVIEW_MIRROR_AUTO_FOLD_SET` `0x0004e7bb` | direct |
| `int setRearViewMirrorFlip(int value)` | W | `SET_CAR_REAR_VIEW_SET` `0x4e40001c` | direct |
| `int setRemoteControlDownwindowState(int value)` | W | `SET_CAR_CTRL_WINDOW_SET` `0x4e30001c` | direct |
| `int setRemoteControlUpwindowState(int value)` | W | `SET_CAR_REMOTE_CTRL_UPWINDOW_SET` `0x4e30001a` | direct |
| `int setRemoteCtlUnlockingState(int state)` | W | `SET_REMOTE_CONTROL_UNLOCKING_SET` `0x4e400018` | direct |
| `int setRightViewMirrorFlipAngle(int value)` | W | `SET_CAR_R_VIEW_SET` `0x000a451d` | direct |
| `int setSOCTarget(int value)` | W | `SET_DR_SOC_TARGET_SET` `0x4e300038` | direct |
| `int setSafeBeltInd(int value)` | W | `SET_MMS_BELT_SET` `0x000029e3` | direct |
| `int setSeatHeatingState(int seatID, int state)` | W | `SET_DRIVER_SEAT_HEATING_STATE_SET` `0x43100014`<br>`SET_PASSENGER_SEAT_HEATING_STATE_SET` `0x4310001c`<br>`SET_REAR_LEFT_SEAT_HEATING_STATE_SET` `0x4310002b`<br>`SET_REAR_RIGHT_SEAT_HEATING_STATE_SET` `0x43100033` | direct |
| `int setSeatHeatingState1(int seatID, int state)` | W | `SET_DRIVER_SEAT_HEATING_STATE_SET` `0x43100014`<br>`SET_PASSENGER_SEAT_HEATING_STATE_SET` `0x4310001c` | direct |
| `int setSeatVentilatingState(int seatID, int state)` | W | `SET_DRIVER_SEAT_VENTILATING_STATE_SET` `0x43100010`<br>`SET_PASSENGER_SEAT_VENTILATING_STATE_SET` `0x43100018`<br>`SET_REAR_LEFT_SEAT_VENTILATING_STATE_SET` `0x43100028`<br>`SET_REAR_RIGHT_SEAT_VENTILATING_STATE_SET` `0x43100030` | direct |
| `int setSmartWelcomeLightState(int state)` | W | `SET_SMART_WELCOME_LIGHT_STATE_SET` `0x4f500045` | direct |
| `int setSpeedReminderValue(int value)` | W | `SET_SPEED_REMINDER_SET` `0x3e300028` | direct |
| `int setStartOrPowerInd(int value)` | W | `SET_MMS_START_F_SET` `0x00057c3e` | direct |
| `int setSteerAssis(int value)` | W | `SET_DR_ST_ASSIS_SET` `0x4e300022` | direct |
| `int setSteerPositionAutoReturn(int value)` | W | `SET_CAR_ST_AUTO_RETURN_SET` `0x4e40003b` | direct |
| `int setSteeringWheelHeatingState(int state)` | W | `SET_STEERING_WHEEL_HEAT_STATE_SET` `0x38500035` | direct |
| `int setStopRemoteCtrlDriveInd(int value)` | W | `SET_MMS_STOP_REMOTECTRL_DRIVE_SET` `0x00070ba7` | direct |
| `int setTextContent(byte[] text)` | W | `SET_ATMOSPHERE_LAMP_TEXT_SET` `0x1caa1008` | direct |
| `int setTextInfo(int textState, int textNum, int textSize, int textRedColor, int textGreenColor, int textBlueColor, int animationType, int playSpeed, int textBackground)` | W | `SET_ATMOSPHERE_LAMP_TEXT_STATE_SET` `0x1ca01010`<br>`SET_ATMOSPHERE_LAMP_TEXT_TRIGGER_NUMBER_SET` `0x1ca01012`<br>`SET_ATMOSPHERE_LAMP_TEXT_LENGTH_SET` `0x1ca01018`<br>`SET_ATMOSPHERE_LAMP_TEXT_COLOR_RED_SET` `0x1ca01020`<br>`SET_ATMOSPHERE_LAMP_TEXT_COLOR_GREEN_SET` `0x1ca01028`<br>`SET_ATMOSPHERE_LAMP_TEXT_COLOR_BLUE_SET` `0x1ca01030`<br>`SET_ATMOSPHERE_LAMP_TEXT_ANIMATION_TYPE_SET` `0x1ca01038`<br>`SET_ATMOSPHERE_LAMP_TEXT_PLAY_SPEED_SET` `0x1ca0103c`<br>… +1 more | direct |
| `int setUIPlatformState(int state)` | W | `SETTING_UI_PLATFORM_SET` `0x1e000008` | direct |
| `int setUserdefinedBodyColor(int value)` | W | `SET_USERDEFINE_BODY_COLOR_SET` `0x3fc00020` | direct |
| `int setVoiceINDLevel(int value)` | W | `SET_CAR_SPEECH_VOL_SET` `0x1e000022` | direct |
| `int setWeatherAndTempState(int weatherState, int tempValue)` | W | `SET_ATMOSPHERE_LAMP_WEATHER_SET` `0x33f00010`<br>`SET_ATMOSPHERE_LAMP_TEMPRATURE_SET` `0x33f00018` | direct |
| `int setWeatherForcast(byte[] value)` | W | `SET_WEATHER_FORCAST_SET` `0x2cf01008` | direct |
| `int setWindscreenWiperOverhaulState(int area, int state)` | W | `SET_FRONT_WINDSCREEN_WIPER_OVERHAUL_STATE_SET` `0x4f50001c`<br>`SET_REAR_WINDSCREEN_WIPER_OVERHAUL_STATE_SET` `0x4f50001e` | direct |

## BYDAutoSignalDevice

`android.hardware.bydauto.signal.BYDAutoSignalDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void setAllStatus()` | W |  | none |
| `int setSignalStatus(int value)` | W | `SIGNAL_STATUS_SET` `0x00024306` | direct |

## BYDAutoSpecialDevice

`android.hardware.bydauto.special.BYDAutoSpecialDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `byte[] getWheelDirection()` | R | `SPECIAL_CMD_WHEEL_DIECTION` `0x99000058` | direct |
| `byte[] getWheelSpeed()` | R | `SPECIAL_CMD_WHEEL_SPEED` `0x99000059` | direct |

## BYDAutoSpeedDevice

`android.hardware.bydauto.speed.BYDAutoSpeedDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getAccelerateDeepness()` | R | `SPEED_ACCELERATOR_S` `0x34200008` | direct |
| `double getAccelerateValue()` | R | `SPEED_ACCELERATE_VALUE` `0x3d95b010` | direct |
| `void getAllStatus()` | R |  | none |
| `int getBrakeDeepness()` | R | `SPEED_BRAKE_S` `0x34200010` | direct |
| `double getCurrentSpeed()` | R | `SPEED_AUTO_SPEED` `0x94400008` | direct |
| `int getDataFlag(int item)` | R | `SPEED_AUTO_SPEED_FLAG` `0x12100017`<br>`SPEED_ACCELERATOR_VALID_FLAG` `0x34200018`<br>`SPEED_BRAKE_DEPTH_VALID_FLAG` `0x34200019` | direct |
| `double getFuelAccelerateDeepness()` | R | `SPEED_ACCELERATOR_DEPTH_10D` `0x10d00030` | direct |
| `double getSpeedFromGateway()` | R | `SPEED_FROM_GATEWAY` `0x08000020` | direct |

## BYDAutoStatisticDevice

`android.hardware.bydauto.statistic.BYDAutoStatisticDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `double getAverageElectricConsumption(int target)` | R | `STATISTIC_TOTAL_ELEC_CON_PHM` `0x4a501030`<br>`STATISTIC_MILEAGE1_ELEC_CON_PHKM` `0x00031062`<br>`STATISTIC_MILEAGE2_ELEC_CON_PHKM` `0x000ca46c` | direct |
| `int getAverageEvCurveFlag()` | R | `STATISTICS_AVERAGE_INSTANT_EV_LAST_200M_FLAG` `0x3d90601b` | direct |
| `int getAverageEvLast200M()` | R | `STATISTICS_AVERAGE_INSTANT_EV_LAST_200M` `0x3d906010` | direct |
| `double getAverageFuelConsumption(int target)` | R | `STATISTIC_TOTAL_FUEL_CON_PHM` `0x4a507010`<br>`STATISTIC_MILEAGE1_FULE_CON_PHKM` `0x000badd3`<br>`STATISTIC_MILEAGE2_FULE_CON_PHKM` `0x00091090` | direct |
| `int getAverageFuelCurveFlag()` | R | `STATISTICS_AVERAGE_INSTANT_FUEL_LAST_200M_FLAG` `0x3d906025` | direct |
| `int getAverageFuelLast200M()` | R | `STATISTICS_AVERAGE_INSTANT_FUEL_LAST_200M` `0x3d90601c` | direct |
| `double getAverageSpeed(int target)` | R | `STATISTIC_TOTAL_AVERAGE_SPEED` `0x3d906028`<br>`STATISTIC_MILEAGE1_AVERAGE_SPEED` `0x0008d3f9`<br>`STATISTIC_MILEAGE2_AVERAGE_SPEED` `0x0000ff15` | direct |
| `double getDrivingTimeValue()` | R | `STATISTIC_DRIVING_TIME` `0x4a508024` | direct |
| `int getEVDrivingMileageConfig()` | R | `STATISTIC_EV_DRIVING_MILEAGE_CONFIG` `0x2450003e` | direct |
| `int getEVDrivingMileageMode()` | R | `STATISTIC_EV_DRIVING_MILEAGE_MODE` `0x2450003c` | direct |
| `int getEVMileageValue()` | R | `STATISTIC_MILEAGE_EV` `0x4a504024` | direct |
| `int getElecDrivingRangeValue()` | R | `STATISTIC_ELEC_DRIVING_RANGE` `0x4a50203e` | direct |
| `double getElecPercentageValue()` | R | `STATISTIC_ELEC_PERCENTAGE` `0x4a505038` | direct |
| `double getElectricConsumption(int target)` | R | `STATISTIC_TOTAL_ELEC_CONSUMPTION` `0x3d906030`<br>`STATISTIC_MILEAGE1_ELEC_CONSUMPTION` `0x0008964e`<br>`STATISTIC_MILEAGE2_ELEC_CONSUMPTION` `0x00017c2f` | direct |
| `int getFuelADValue()` | R | `STATISTIC_FUEL_AD_VALUE` `0x3d955010` | direct |
| `double getFuelConsumption(int target)` | R | `STATISTIC_TOTAL_FUEL_CONSUMPTION` `0x4a501010`<br>`STATISTIC_MILEAGE1_FULE_CONSUMPTION` `0x00084deb`<br>`STATISTIC_MILEAGE2_FULE_CONSUMPTION` `0x00032443` | direct |
| `int getFuelDrivingRangeValue()` | R | `STATISTIC_FUEL_DRIVING_RANGE` `0x4a504038` | direct |
| `int getFuelPercentageValue()` | R | `STATISTIC_FUEL_PERCENTAGE` `0x4a507040` | direct |
| `int getHEVMileageValue()` | R | `STATISTIC_MILEAGE_HEV` `0x4a504010` | direct |
| `double getInstantElecConValue()` | R | `STATISTIC_INSTANT_EV_CONSUME` `0x44500030` | direct |
| `double getInstantFuelConValue()` | R | `STATISTIC_INSTANT_FUEL_CONSUME` `0x4a501024` | direct |
| `int getKeyBatteryLevel()` | R | `STATISTIC_KEY_BATTERY_LEVEL` `0x18000010` | direct |
| `double getLast50KmEqualFuelConValue()` | R | `STATISTIC_LAST_50KM_EQUAL_FUEL_CON` `0x4a507032` | direct |
| `double getLastElecConPHMValue()` | R | `STATISTIC_LAST_ELEC_CON_PHM` `0x3d904032` | direct |
| `double getLastFuelConPHMValue()` | R | `STATISTIC_LAST_FUEL_CON_PHM` `0x3d904026` | direct |
| `int getMessage5sOnlineState(int id)` | R | `STATISTIC_ONLINE_3D9_SUBID_55` `0x3d955000`<br>`STATISTIC_ONLINE_3D9_SUBID_57` `0x3d957000` | direct |
| `int getMileageNumber(int status)` | R | `STATISTIC_DD_MILEAGE1` `0x4a503010`<br>`STATISTIC_DD_MILEAGE2` `0x4a503024`<br>`STATISTIC_TOTAL_MILEAGE` `0x4a502010` | direct |
| `int getRemainingBatteryPower()` | R | `STATISTIC_REMAINING_BATTERY_POWER` `0x44700028` | direct |
| `int getSOCBatteryPercentage()` | R | `STATISTIC_SOC_BATTERY_PERCENTAGE` `0x44400030` | direct |
| `int getSpeedSignalVDisValue()` | R | `STATISTIC_SPEED_SIG_VDIS` `0x14400008` | direct |
| `double getTotalElecConPHMValue()` | R | `STATISTIC_TOTAL_ELEC_CON_PHM` `0x4a501030` | direct |
| `int getTotalElecConPhmUnit()` | R | `STATISTIC_TOTAL_ELEC_CON_PHM_UNIT` `0x4a501040` | direct |
| `double getTotalElecConValue()` | R | `STATISTIC_TOTAL_ELEC_CONSUMPTION` `0x3d906030` | direct |
| `double getTotalFuelConPHMValue()` | R | `STATISTIC_TOTAL_FUEL_CON_PHM` `0x4a507010` | direct |
| `double getTotalFuelConValue()` | R | `STATISTIC_TOTAL_FUEL_CONSUMPTION` `0x4a501010` | direct |
| `int getTotalFuelConsumptionUnit()` | R | `STATISTIC_TOTAL_FUEL_CONSUMPTION_UNIT` `0x4a50102e` | direct |
| `int getTotalMileageValue()` | R | `STATISTIC_TOTAL_MILEAGE` `0x4a502010` | direct |
| `double getTravelTime(int target)` | R | `STATISTIC_DRIVING_TIME` `0x4a508024`<br>`STATISTIC_MILEAGE1_DRIVE_TIME` `0x3d95a018`<br>`STATISTIC_MILEAGE2_DRIVE_TIME` `0x3d95a02c` | direct |
| `int getWaterTemperature()` | R | `STATISTIC_WATER_TEMPERATURE` `0x000cce5f` | direct |
| `int hasFeature(String feature)` | R | `STATISTIC_FUEL_DRIVING_RANGE` `0x4a504038` | direct |
| `int setEVDrivingMileageMode(int mode)` | W | `STATISTIC_EV_DRIVING_MILEAGE_MODE_SET` `0x1e00003a` | direct |
| `int setISAAccidentAheadStatus(int mode)` | W | `STATISTICS_ISA_ACCIDENT_AHEAD_STATUS_SET` `0x4b400060` | direct |
| `int setISAConstructionZonesStatus(int mode)` | W | `STATISTICS_ISA_CONSTRUCTION_ZONES_STATUS_SET` `0x4b40005e` | direct |
| `int setISATrafficJAMStatus(int mode)` | W | `STATISTICS_ISA_TRAFFIC_JAM_STATUS_SET` `0x4b40005c` | direct |
| `int setISATrafficSignType(int mode)` | W | `STATISTICS_ISA_TRAFFIC_SIGN_TYPE_SET` `0x4b400064` | direct |
| `int setISAWrongWayDriverStatus(int mode)` | W | `STATISTICS_ISA_WRONG_WAY_DRIVER_STATUS_SET` `0x4b400062` | direct |

## BYDAutoTestDevice

`android.hardware.bydauto.test.BYDAutoTestDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `int getAVAHDebugMode()` | R | `TEST_CMD_TEST_AUDIO_AVAH` `0x6ea70010` | direct |
| `int getAudioDebugMode()` | R | `TEST_CMD_TEST_AUDIO_MODE` `0x6ea90008` | direct |
| `int getFMDebugMode()` | R | `TEST_CMD_TEST_AUDIO_FM` `0x6ea90010` | direct |
| `int getIflyDebugMode()` | R | `TEST_CMD_TEST_AUDIO_XF` `0x6ea90040` | direct |
| `int setAVAHDebugMode(int mode)` | W | `TEST_CMD_TEST_AUDIO_AVAH_SET` `0x6e970010` | direct |
| `int setAudioDebugMode(int mode)` | W | `TEST_CMD_TEST_AUDIO_MODE_SET` `0x6e990008` | direct |
| `int setFMDebugMode(int mode)` | W | `TEST_CMD_TEST_AUDIO_FM_SET` `0x6e990010` | direct |
| `int setIflyDebugMode(int mode)` | W | `TEST_CMD_TEST_AUDIO_XF_SET` `0x6e990040` | direct |
| `int setTecLevel(int level)` | W | `TEST_SET_TEC_LEVEL_SET` `0xaa000042` | direct |

## BYDAutoTimeDevice

`android.hardware.bydauto.time.BYDAutoTimeDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getDateFormat()` | R | `TIME_DATE_FORMAT` `0x49c0000e` | direct |
| `int getSummertimeState()` | R | `TIME_SUMMERTIME_STATE` `0x49c00010` | direct |
| `int[] getTime()` | R | `TIME_YEAR` `0x0004e18f`<br>`TIME_MONTH` `0x0007543f`<br>`TIME_DAY` `0x0003f5f0`<br>`TIME_HOUR` `0x0000ee09`<br>`TIME_MINUTE` `0x000897c8`<br>`TIME_SECOND` `0x0008e77a` | direct |
| `int getTimeFormat()` | R | `TIME_FORMAT_24H` `0x49c0002e` | direct |
| `int getTimeZone()` | R | `TIME_ZONE` `0x0000b6e7` | direct |
| `void setAllStatus()` | W |  | none |
| `int setDate(int year, int month, int day, int weekday)` | W | `TIME_SET_MODE_SET` `0x4df00038`<br>`TIME_YEAR_SET` `0x4df00008`<br>`TIME_MONTH_SET` `0x4df00010`<br>`TIME_DAY_SET` `0x4df00018`<br>`TIME_WEEKDAY_SET` `0x4df0003c` | direct |
| `int setFullTime(int mode, int year, int month, int day, int weekday, int hour, int minute, int second)` | W | `TIME_DATE_FLAG_SET` `0x4df00039`<br>`TIME_SET_MODE_SET` `0x4df00038`<br>`TIME_YEAR_SET` `0x4df00008`<br>`TIME_MONTH_SET` `0x4df00010`<br>`TIME_DAY_SET` `0x4df00018`<br>`TIME_WEEKDAY_SET` `0x4df0003c`<br>`TIME_HOUR_SET` `0x4df00020`<br>`TIME_MINUTE_SET` `0x4df00028`<br>… +10 more | direct |
| `int setFullTimeToECM(int year, int month, int day, int hour, int minute, int second)` | W | `TIME_DATE_FLAG_SET` `0x4df00039`<br>`TIME_SET_MODE_SET` `0x4df00038`<br>`TIME_YEAR_SET` `0x4df00008`<br>`TIME_MONTH_SET` `0x4df00010`<br>`TIME_DAY_SET` `0x4df00018`<br>`TIME_HOUR_SET` `0x4df00020`<br>`TIME_MINUTE_SET` `0x4df00028`<br>`TIME_SECOND_SET` `0x4df00030` | direct |
| `int setFullTimeWithTimeFormat(int year, int month, int day, int hour, int minute, int second, int weekday, int timeFormat)` | W | `TIME_YEAR_2B6_SET` `0x2b600008`<br>`TIME_MONTH_2B6_SET` `0x2b600010`<br>`TIME_DAY_2B6_SET` `0x2b600018`<br>`TIME_HOUR_2B6_SET` `0x2b600020`<br>`TIME_MINUTE_2B6_SET` `0x2b600028`<br>`TIME_SECOND_2B6_SET` `0x2b600030`<br>`TIME_WEEKDAY_2B6_SET` `0x2b600038`<br>`TIME_FORMAT_2B6_SET` `0x2b60003b` | direct |
| `int setTime(int hour, int minute, int second)` | W | `TIME_SET_MODE_SET` `0x4df00038`<br>`TIME_HOUR_SET` `0x4df00020`<br>`TIME_MINUTE_SET` `0x4df00028`<br>`TIME_SECOND_SET` `0x4df00030` | direct |
| `int setTimeFormat(int value)` | W | `TIME_FORMAT_24H_SET` `0x4e40002e` | direct |
| `int setTimeZone(int value)` | W | `TIME_ZONE_SET` `0x0007e2fe` | direct |

## BYDAutoTyreDevice

`android.hardware.bydauto.tyre.BYDAutoTyreDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getIndirectTyreSystemState()` | R | `TYRE_INDITECT_TYRE_SYSTEM_STATE` `0x4170000e` | direct |
| `int getTyreAirLeakState(int area)` | R | `TYRE_AIR_LEAK_STATE_LEFT_FRONT` `0x99000122`<br>`TYRE_AIR_LEAK_STATE_RIGHT_FRONT` `0x99000126`<br>`TYRE_AIR_LEAK_STATE_LEFT_REAR` `0x9900012a`<br>`TYRE_AIR_LEAK_STATE_RIGHT_REAR` `0x9900012e` | direct |
| `int getTyreBatteryState()` | R | `TYRE_BATTERY_STATE` `0x3cd00046` | direct |
| `double getTyreBatteryValue(int area)` | R | `TYRE_BATTERY_VALUE_LEFT_FRONT` `0x000f2de3`<br>`TYRE_BATTERY_VALUE_RIGHT_FRONT` `0x0006af1b`<br>`TYRE_BATTERY_VALUE_LEFT_REAR` `0x0005a68b`<br>`TYRE_BATTERY_VALUE_RIGHT_REAR` `0x0001d3e7` | direct |
| `int getTyrePressureState(int area)` | R | `TYRE_PRESSURE_STATE_LEFT_FRONT` `0x99000123`<br>`TYRE_PRESSURE_STATE_RIGHT_FRONT` `0x99000127`<br>`TYRE_PRESSURE_STATE_LEFT_REAR` `0x9900012b`<br>`TYRE_PRESSURE_STATE_RIGHT_REAR` `0x9900012f` | direct |
| `int getTyrePressureValue(int area)` | R | `TYRE_PRESSURE_VALUE_LEFT_FRONT` `0x99000124`<br>`TYRE_PRESSURE_VALUE_RIGHT_FRONT` `0x99000128`<br>`TYRE_PRESSURE_VALUE_LEFT_REAR` `0x9900012c`<br>`TYRE_PRESSURE_VALUE_RIGHT_REAR` `0x99000130` | direct |
| `int getTyreSignalState(int area)` | R | `TYRE_SIGNAL_STATE_LEFT_FRONT` `0x99000121`<br>`TYRE_SIGNAL_STATE_RIGHT_FRONT` `0x99000125`<br>`TYRE_SIGNAL_STATE_LEFT_REAR` `0x99000129`<br>`TYRE_SIGNAL_STATE_RIGHT_REAR` `0x9900012d` | direct |
| `int getTyreSystemState()` | R | `TYRE_SYSTEM_STATE` `0x3cd0000d` | direct |
| `int getTyreTemperatureState()` | R | `TYRE_TEMPERATURE_STATE` `0x3cd00044` | direct |
| `int hasFeature(String feature)` | R | `TYRE_HAS_TYRE_PRESSURE_ONLINE` `0x3cd00000`<br>`TYRE_HAS_TYRE_INDIRECT_PRESSURE_DISPLAY_ONLINE` `0x4bf00044`<br>`TYRE_HAS_INDIRECT_TYRE_PRESSURE_ONLINE` `0x41700010` | direct |
| `int setIndirectTyreConfirm(int value)` | W | `TYRE_INDIRECT_TYRE_SYSTEM_CONFIRM_SET` `0x38500034` | direct |

## BYDAutoVersionDevice

`android.hardware.bydauto.version.BYDAutoVersionDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `String getACEcuVersion()` | R | `VERSION_AC` `0x9900003c` | direct |
| `void getAllStatus()` | R |  | none |
| `String getBatteryCtrlVersion()` | R | `VERSION_BATTERY_CTRL` `0x00081a27` | direct |
| `String getCarChargerVersion()` | R | `VERSION_CAR_CHARGER` `0x000af07e` | direct |
| `String getDSPBootVersion()` | R | `VERSION_DSP_BOOT` `0x000fa623` | direct |
| `String getDspVersion()` | R | `VERSION_DSP` `0x9900011c` | direct |
| `String getDtcVersion()` | R | `VERSION_DTC` `0x0007fe7e` | direct |
| `String getEngineCtrlVersion()` | R | `VERSION_ENGINE_CTRL` `0x0006fe74` | direct |
| `String getInstrumentVersion()` | R | `VERSION_INSTRUMENT` `0x0006fdad` | direct |
| `String getMcuBootVersion()` | R | `VERSION_MCU_BOOT` `0x99000001` | direct |
| `String getMcuVersion()` | R | `VERSION_MCU` `0x99000002` | direct |
| `String getMotorCtrl1Version()` | R | `VERSION_MOTOR_CTRL` `0x0008bb5b` | direct |
| `String getMotorCtrl2Version()` | R | `VERSION_MOTOR_CTRL_F` `0x00029505` | direct |
| `String getMotorCtrl3Version()` | R | `VERSION_MOTOR_CTRL_R` `0x000c47bb` | direct |
| `String getTransmissionCtrlVersion()` | R | `VERSION_TRANS_CTRL` `0x0004d9b6` | direct |
| `void setAllStatus()` | W |  | none |

## BYDAutoWiperDevice

`android.hardware.bydauto.wiper.BYDAutoWiperDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
| `int getWindscreenWiperRelayState()` | R | `WIPER_RELAY_STATE` `0x4fb00026` | direct |
| `int getWindscreenWiperResetState(int area)` | R | `WIPER_AREA_FRONT_STATE` `0x00083e7f`<br>`WIPER_AREA_REAR_STATE` `0x4750000a` | direct |
| `int getWindscreenWiperSensitivity()` | R | `WIPER_WINDSCREEN_WIPER_SENSITIVITY` `0x13300020` | direct |

## BYDAutoYunDevice

`android.hardware.bydauto.yun.BYDAutoYunDevice`

| Method | Access | Feature ID → key | Resolution |
|---|:--:|---|---|
| `void getAllStatus()` | R |  | none |
