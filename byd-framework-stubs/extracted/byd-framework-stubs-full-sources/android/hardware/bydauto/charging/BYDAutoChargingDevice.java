package android.hardware.bydauto.charging;

/** Permissions: {@code android.permission.BYDAUTO_CHARGING_GET}, {@code android.permission.BYDAUTO_CHARGING_SET} */
public final class BYDAutoChargingDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int APPOINTMENT_FAILED = 2;
    public static final int APPOINTMENT_INVALID = 0;
    public static final int APPOINTMENT_VALID = 1;
    public static final int APPO_DAY_INVALID = 0;
    public static final int APPO_DAY_MAX = 31;
    public static final int APPO_DAY_MIN = 1;
    public static final int APPO_HOUR_INVALID = 31;
    public static final int APPO_HOUR_MAX = 23;
    public static final int APPO_HOUR_MIN = 0;
    public static final int APPO_MINUTE_INVALID = 63;
    public static final int APPO_MINUTE_MAX = 59;
    public static final int APPO_MINUTE_MIN = 0;
    public static final int APPO_MONTH_INVALID1 = 0;
    public static final int APPO_MONTH_INVALID2 = 15;
    public static final int APPO_MONTH_MAX = 12;
    public static final int APPO_MONTH_MIN = 1;
    public static final int APPO_YEAR_INVALID = 2127;
    public static final int APPO_YEAR_MAX = 2099;
    public static final int APPO_YEAR_MIN = 2000;
    public static final int BATTERY_TYPE_INVALID = 65535;
    public static final int BATTERY_TYPE_IRON = 1;
    public static final int BATTERY_TYPE_LEAD_ACID = 0;
    public static final int CAP_CONFIRM = 1;
    public static final int CAP_INVALID = 0;
    public static final int CAP_NOPROMPT = 1;
    public static final int CAP_PROMPT = 2;
    public static final int CAP_TIMEOUT = 2;
    public static final int CAR_DISCHARGE_CLOSE = 2;
    public static final int CAR_DISCHARGE_INVALID = 0;
    public static final int CAR_DISCHARGE_OPEN = 1;
    public static final int CHARGE_MODE_IMMEDIATELY = 1;
    public static final int CHARGE_MODE_INVALID = 0;
    public static final int CHARGE_MODE_RESERVE = 2;
    public static final int CHARGE_MODE_SMART = 3;
    public static final int CHARGE_STOP_CAPACITY_100 = 1;
    public static final int CHARGE_STOP_CAPACITY_50 = 6;
    public static final int CHARGE_STOP_CAPACITY_60 = 5;
    public static final int CHARGE_STOP_CAPACITY_70 = 4;
    public static final int CHARGE_STOP_CAPACITY_80 = 3;
    public static final int CHARGE_STOP_CAPACITY_90 = 2;
    public static final int CHARGE_STOP_CAPACITY_INVALID = 0;
    public static final int CHARGE_STOP_INVALID = 0;
    public static final int CHARGE_STOP_OFF = 1;
    public static final int CHARGE_STOP_ON = 2;
    public static final int CHARGE_STOP_SUPPORT_AVAILABLE = 2;
    public static final int CHARGE_STOP_SUPPORT_DEFAULT = 3;
    public static final int CHARGE_STOP_SUPPORT_DISAVAILABLE = 1;
    public static final int CHARGE_STOP_SUPPORT_RESERVED = 0;
    public static final int CHARGE_TEMP_CTL_STATE_INVALID = 0;
    public static final int CHARGE_TEMP_CTL_STATE_OFF = 2;
    public static final int CHARGE_TEMP_CTL_STATE_ON = 1;
    public static final int CHARGE_WIRELESS_CHARGING_INVALID = 0;
    public static final int CHARGE_WIRELESS_CHARGING_OFF = 2;
    public static final int CHARGE_WIRELESS_CHARGING_ON = 1;
    public static final int CHARGE_WIRELESS_CHARGING_ONLINE_OFF = 0;
    public static final int CHARGE_WIRELESS_CHARGING_ONLINE_ON = 1;
    public static final int CHARGING_BATTERY_STATE_BREAKDOWN_AC = 8;
    public static final int CHARGING_BATTERY_STATE_BREAKDOWN_C10 = 5;
    public static final int CHARGING_BATTERY_STATE_BREAKDOWN_CHARGER = 7;
    public static final int CHARGING_BATTERY_STATE_BREAKDOWN_CHARGING_GUN = 6;
    public static final int CHARGING_BATTERY_STATE_CHARGING = 1;
    public static final int CHARGING_BATTERY_STATE_CHARGING_PAUSE = 13;
    public static final int CHARGING_BATTERY_STATE_CHARG_FINISH = 2;
    public static final int CHARGING_BATTERY_STATE_CHARG_TERMINATE = 4;
    public static final int CHARGING_BATTERY_STATE_DISCHARG = 3;
    public static final int CHARGING_BATTERY_STATE_DISCHARG_CBU = 10;
    public static final int CHARGING_BATTERY_STATE_DISCHARG_FINISH = 12;
    public static final int CHARGING_BATTERY_STATE_READY = 0;
    public static final int CHARGING_BATTERY_STATE_SCHEDULE = 9;
    public static final int CHARGING_BATTERY_STATE_TIMEOUT = 11;
    public static final double CHARGING_CAPACITY_MAX = 131.07d;
    public static final double CHARGING_CAPACITY_MIN = 0.0d;
    public static final int CHARGING_CAP_AC = 1;
    public static final int CHARGING_CAP_DC = 2;
    public static final int CHARGING_CAP_STATE_OFF = 0;
    public static final int CHARGING_CAP_STATE_ON = 1;
    public static final int CHARGING_CHARGER_STATE_CONNECTED = 1;
    public static final int CHARGING_CHARGER_STATE_NOT_CONNECTED = 0;
    public static final int CHARGING_COMMAND_BUSY = -2147482647;
    public static final int CHARGING_COMMAND_FAILED = -2147482648;
    public static final int CHARGING_COMMAND_INVALID_VALUE = -2147482645;
    public static final int CHARGING_COMMAND_SUCCESS = 0;
    public static final int CHARGING_COMMAND_TIMEOUT = -2147482646;
    public static final int CHARGING_ENTER = 1;
    public static final int CHARGING_EXIT = 2;
    public static final int CHARGING_FAILURE = 1;
    public static final int CHARGING_FAULT_STATE_MAJOR = 3;
    public static final int CHARGING_FAULT_STATE_MINOR = 2;
    public static final int CHARGING_FAULT_STATE_NORMAL = 1;
    public static final int CHARGING_GUN_STATE_CONNECTED_AC = 2;
    public static final int CHARGING_GUN_STATE_CONNECTED_AC_DC = 4;
    public static final int CHARGING_GUN_STATE_CONNECTED_DC = 3;
    public static final int CHARGING_GUN_STATE_CONNECTED_NONE = 1;
    public static final int CHARGING_GUN_STATE_CONNECTED_VTOL = 5;
    public static final int CHARGING_GUN_STATE_OFF = 2;
    public static final int CHARGING_GUN_STATE_ON = 1;
    public static final int CHARGING_PORT_STATE_LOCK_FINISH = 1;
    public static final int CHARGING_PORT_STATE_LOCK_INVALID = 2;
    public static final int CHARGING_PORT_STATE_UNLOCK_FINISH = 3;
    public static final int CHARGING_PORT_STATE_UNLOCK_INVALID = 4;
    public static final double CHARGING_POWER_MAX = 500.0d;
    public static final double CHARGING_POWER_MIN = -500.0d;
    public static final int CHARGING_SCHEDULE_STATE_CANCEL = 2;
    public static final int CHARGING_SCHEDULE_STATE_INVALID = 1;
    public static final int CHARGING_SCHEDULE_STATE_LOCAL = 4;
    public static final int CHARGING_SCHEDULE_STATE_NONE = 3;
    public static final int CHARGING_SCHEDULE_STATE_REMOTE = 5;
    public static final int CHARGING_STATE_DISABLE = 1;
    public static final int CHARGING_STATE_ENABLE = 0;
    public static final int CHARGING_SUCCESS = 2;
    public static final int CHARGING_TYPE_AC = 2;
    public static final int CHARGING_TYPE_DEFAULT = 1;
    public static final int CHARGING_TYPE_GB_DC = 4;
    public static final int CHARGING_TYPE_GB_NON_DC = 5;
    public static final int CHARGING_TYPE_VTOG = 3;
    public static final int CHARGING_WORK_STATE_FINISH = 3;
    public static final int CHARGING_WORK_STATE_READY = 1;
    public static final int CHARGING_WORK_STATE_START = 2;
    public static final int CHARGING_WORK_STATE_TERMINATE = 4;
    public static final int DEVICE_HAS_THE_FEATURE = 1;
    public static final int DEVICE_NOT_HAS_THE_FEATURE = 0;
    public static final int DEVICE_THE_FEATURE_LINK_ERROR = 65535;
    public static final int DEVICE_THE_FEATURE_NEVER_GET = 2;
    public static final int DISCHARGE_CONNECT_DISCHARGE_CAR = 1;
    public static final int DISCHARGE_CONNECT_DISCHARGE_CHARGE_CAR = 2;
    public static final int DISCHARGE_CONNECT_NONE = 0;
    public static final int DISCHARGE_LIMIT_VAL_MAX = 100;
    public static final int DISCHARGE_LIMIT_VAL_MIN = 0;
    public static final int DISCHARGE_LOWEST_VAL_MAX = 100;
    public static final int DISCHARGE_LOWEST_VAL_MIN = 0;
    public static final double DISCHARGE_QUANTITY_MAX = 1000.0d;
    public static final double DISCHARGE_QUANTITY_MIN = 0.0d;
    public static final int DISCHARGE_STATE_FINISH = 2;
    public static final int DISCHARGE_STATE_HOUSEHOLD_APPLIANCE = 2;
    public static final int DISCHARGE_STATE_NON = 1;
    public static final int DISCHARGE_STATE_ONGOING = 1;
    public static final int DISCHARGE_STATE_POWER_SYSTEM = 5;
    public static final int DISCHARGE_STATE_READY = 0;
    public static final int DISCHARGE_STATE_SINGLE_PHASE_VEHICLE = 7;
    public static final int DISCHARGE_STATE_SOCKET = 6;
    public static final int DISCHARGE_STATE_THREE_PHASE_EQUIPMENT = 3;
    public static final int DISCHARGE_STATE_THREE_PHASE_VEHICLE = 4;
    public static final int DISCHARGE_TYPE_INNER_SOCKET = 2;
    public static final int DISCHARGE_TYPE_VTOL = 1;
    public static final int DISCHARGE_WARNING_STATE_INVALID = 1;
    public static final int DISCHARGE_WARNING_STATE_VALID = 2;
    public static final int ELECTRICITY_PRICE_LEVEL_LENGTH = 24;
    public static final String FEATURE_CHARGE_BY_APPOINTMENT = "ChargeByAppointment";
    public static final String FEATURE_CHARGE_DISCHARGE_TO_CAR = "ChargeDischargeToCar";
    public static final String FEATURE_CHARGE_STOP = "ChargeStop";
    public static final String FEATURE_CHARGE_TEMP_CTL = "ChargeTemperatureControl";
    public static final String FEATURE_CHARGE_WIRELESS_CHARGING = "ChargeWirlessCharging";
    public static final String FEATURE_CHARGING_SMART_TRAVEL = "SmartTravel";
    public static final String FEATURE_SOC_SAVE_SWITCH_CONFIG = "soc_sava_switch_config";
    public static final int HAS_WEATHER_AND_TIME_REQUIREMENT = 0;
    public static final int HOUR_MAX = 23;
    public static final int HOUR_MIN = 0;
    public static final int LOW_WARN_NONE = 0;
    public static final int LOW_WARN_TIPS = 1;
    public static final int MINUTE_MAX = 59;
    public static final int MINUTE_MIN = 0;
    public static final int NOT_HAS_WEATHER_AND_TIME_REQUIREMENT = 1;
    public static final int NOT_SMART_CHARGING_STATE = 3;
    public static final int PREDICTED_TEMPERATURE_MAX = 160;
    public static final int PREDICTED_TEMPERATURE_MIN = -80;
    public static final int RESET_INVALID = 0;
    public static final int RESET_ITEM_CHARGE = 0;
    public static final int RESET_VALID = 1;
    public static final int REST_HOUR_MAX = 254;
    public static final int REST_HOUR_MIN = 0;
    public static final int SAFE_BATTERY_INVALID = 127;
    public static final int SAFE_BATTERY_MAX = 100;
    public static final int SAFE_BATTERY_MIN = 20;
    public static final int SMART_CHARGING_STATE_ENTER = 0;
    public static final int SMART_CHARGING_STATE_EXIT = 2;
    public static final int SMART_CHARGING_STATE_ONGOING = 1;
    public static final int SOC_SAVE_SWITCH_INVALID = 0;
    public static final int SOC_SAVE_SWITCH_OFF = 1;
    public static final int SOC_SAVE_SWITCH_ON = 2;
    protected static final String TAG = "BYDAutoChargingDevice";
    public static final int WIRELESS_CHARGING_STATE_FAULT = 2;
    public static final int WIRELESS_CHARGING_STATE_FULL = 1;
    public static final int WIRELESS_CHARGING_STATE_ONGOING = 0;
    public static final int WIRELESS_CHARGING_STATE_STANDBY = 3;

    BYDAutoChargingDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_BATTERRY_DEVICE_STATE} (0x34400018). */
    public int getBatteryManagementDeviceState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_BATTERY_TYPE} (0x9900004f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBatteryType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CAP_STATE} (0x2400003a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getCapState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_DISCHARGE_TO_OUTSIDE_LOW_WARN} (0x4380002b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getCarDischargeLowWarn() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_DISCHARGE_TO_CAR_STATE} (0x3340002f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getCarDischargeState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_STOP_QUANTITY_SETTING} (0x43800028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getChargeStopCapacityState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_STOP_QUANTITY_SUPPORT} (0x43800024).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getChargeStopSupportConfig() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_STOP_QUANTITY_SWITCH} (0x43800026).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getChargeStopSwitchState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_TEMPERATURE_CTL_STATE} (0x43800020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getChargeTempCtlState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_CHARGER_FAULT_STATE} (0x27c00008). */
    public int getChargerFaultState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_CHARGER_CONNECT_STATE} (0x0550000d). */
    public int getChargerState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_CHARGER_WORK_STATE} (0x27c0000a). */
    public int getChargerWorkState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_CAP_STATE_AC} (0x4fb00020), {@code CHARGING_CAP_STATE_DC} (0x4fb00018). */
    public int getChargingCapState(int type) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_CAPACITY} (0x27c00018). */
    public double getChargingCapacity() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_GUN_NOTINSERT_WARN_STATE} (0x4c201013). */
    public int getChargingGunNotInsertedState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_GUN_CONNECT_STATE} (0x34400032). */
    public int getChargingGunState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_MODE} (0x49601012).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getChargingMode() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_CHARGE_PORT_LOCK_REBACK} (0x4940000a). */
    public int getChargingPortLockRebackState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_POWER} (0x000b4c9a). */
    public double getChargingPower() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_FULL_REST_HOUR} (0x44500018), {@code CHARGING_FULL_REST_MINUTE} (0x44500020). */
    public int[] getChargingRestTime() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_SCHEDULE_ENABLE_STATE} (0x0550000e). */
    public int getChargingScheduleEnableState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_SCHEDULE_STATE} (0x4c201010). */
    public int getChargingScheduleState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_SCHEDULE_TIME_HOUR} (0x4c201018), {@code CHARGING_SCHEDULE_TIME_MINUTE} (0x4c201020). */
    public int[] getChargingScheduleTime() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_STATE} (0x49601010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getChargingState() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public android.hardware.bydauto.charging.ChargingTimerInfo getChargingTimerInfo(int type) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_TYPE} (0x34400038). */
    public int getChargingType() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code CHARGING_DISCHARGE_REQUEST_STATE} (0x0550000a). */
    public int getDischargeRequestState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_DISCHARGE_STATE_VTOL} (0x44a0000b), {@code CHARGING_DISCHARGE_STATE_INNER_SOCKET} (0x44a00016).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDischargeState(int type) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_DISCHARGE_WARNING} (0x2450003a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDischargeWarningState() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.charging.BYDAutoChargingDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_SMART_CHARGING_STATE} (0x44900040).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSmartChargingState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_SOC_SAVE_SWITCH} (0x46c00036).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSocSaveSwitch() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_VTOV_DISCHARGE_CONNECT_STATE} (0x33400020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getVtovDischargeConnectState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_VTOV_DISCHARGE_LIMIT_VAL} (0x000e43ee).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getVtovDischargeLimitVal() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_VTOV_DISCHARGE_LOWEST_VAL} (0x0008b39d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getVtovDischargeLowestVal() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_VTOV_DISCHARGE_QUANTITY} (0x34400020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getVtovDischargeQuantity() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_WEATHER_TIME_REQUIREMENT} (0x2330002a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getWeatherAndTimeRequest() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_HAS_CHARGE_WIRELESS_CHARGING} (0x41e00000), {@code CHARGING_WIRELESS_CHARGING_ONLINE5S} (0x41e00000), {@code ONLINE_HAS_0x041E00} (0x41e00000).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getWirelessChargingOnline5sState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_WIRELESS_CHARGING_STATE} (0x41e00009).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getWirelessChargingState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_WIRELESS_CHARGING_SWITCH} (0x41e00010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getWirelessChargingSwitchState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_TEMPERATURE_CTL_ONLINE} (0x43800022), {@code CHARGING_STOP_QUANTITY_SUPPORT} (0x43800024), {@code CHARGING_DISCHARGE_TO_CAR_ONLINE} (0x3340002e), {@code CHARGING_SMART_TRAVEL_CONFIG} (0x47002011), {@code CHARGING_HAS_CHARGE_BY_APPOINTMENT} (0x4c201008), {@code CHARGING_WIRELESS_CHARGING_SWITCH_ONLINE} (0xc1e00010), {@code CHARGING_SOC_SAVE_SWITCH_CONFIG} (0xc6c00036).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int hasFeature(String feature) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, float value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.charging.AbsBYDAutoChargingListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.charging.AbsBYDAutoChargingListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int reset(int item, int value) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendCapState(int value) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendVtovDischargeLimitVal(int value) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code CHARGING_DISCHARGE_TO_CAR_STATE_SET} (0x2bc0000e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setCarDischargeState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code CHARGING_CAR_APPOINTMENT_VALID_FLAG_SET} (0x30000024), {@code CHARGING_CHARGE_MODE_SET} (0x30000026), {@code CHARGING_SAFE_BATTERY_SET} (0x30000040), {@code CHARGING_CAR_APPOINTMENT_YEAR_SET} (0x30000018), {@code CHARGING_CAR_APPOINTMENT_MONTH_SET} (0x30000020), {@code CHARGING_CAR_APPOINTMENT_DAY_SET} (0x30000028), {@code CHARGING_CAR_APPOINTMENT_HOUR_SET} (0x30000030), {@code CHARGING_CAR_APPOINTMENT_MINUTE_SET} (0x30000038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setCarPlan(int appointmentFlag, int chargeMode, int safeBattery, int year, int month, int day, int hour, int minute) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code CHARGING_STOP_QUANTITY_SETTING_SET} (0x2bc0001a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setChargeStopCapacityState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code CHARGING_STOP_QUANTITY_SWITCH_SET} (0x2bc00018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setChargeStopSwitchState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code CHARGING_CHARGE_TEMPERATURE_CTL_STATE_SET} (0x4e300044).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setChargeTempCtlState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code CHARGING_MODE_SET} (0x000a3372).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setChargingMode(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code CHARGING_TIMER_SWITCH_1_SET} (0x4c103028), {@code CHARGING_TIMER_TYPE_1_SET} (0x4c103008), {@code CHARGING_TIMER_UNIT_HOUR_1_SET} (0x4c103010), {@code CHARGING_TIMER_UNIT_MIMITE_1_SET} (0x4c103018), {@code CHARGING_TIMER_CYCLE_MON_1_SET} (0x4c103020), {@code CHARGING_TIMER_CYCLE_TUR_1_SET} (0x4c103021), {@code CHARGING_TIMER_CYCLE_WED_1_SET} (0x4c103022), {@code CHARGING_TIMER_CYCLE_THU_1_SET} (0x4c103023), {@code CHARGING_TIMER_CYCLE_FRI_1_SET} (0x4c103024), {@code CHARGING_TIMER_CYCLE_SAT_1_SET} (0x4c103025), {@code CHARGING_TIMER_CYCLE_SUN_1_SET} (0x4c103026), {@code CHARGING_TIMER_SWITCH_2_SET} (0x4c104028), {@code CHARGING_TIMER_TYPE_2_SET} (0x4c104008), {@code CHARGING_TIMER_UNIT_HOUR_2_SET} (0x4c104010), {@code CHARGING_TIMER_UNIT_MIMITE_2_SET} (0x4c104018), {@code CHARGING_TIMER_CYCLE_MON_2_SET} (0x4c104020), {@code CHARGING_TIMER_CYCLE_TUR_2_SET} (0x4c104021), {@code CHARGING_TIMER_CYCLE_WED_2_SET} (0x4c104022), {@code CHARGING_TIMER_CYCLE_THU_2_SET} (0x4c104023), {@code CHARGING_TIMER_CYCLE_FRI_2_SET} (0x4c104024), {@code CHARGING_TIMER_CYCLE_SAT_2_SET} (0x4c104025), {@code CHARGING_TIMER_CYCLE_SUN_2_SET} (0x4c104026).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setChargingTimerInfo(android.hardware.bydauto.charging.ChargingTimerInfo timerInfo) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code CHARGING_ELECTRICITY_PRICE_LEVEL_SET} (0x2cf06008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setElectricityPriceLevel(byte[] value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code CHARGING_TEMPERATURE_LOW_FORECAST_SET} (0x2ea00028), {@code CHARGING_TEMPERATURE_HIGN_FORECAST_SET} (0x2ea00018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setPredictTemperature(int minTemp, int maxTemp) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code CHARGING_SOC_SAVE_SWITCH_SET} (0x2ea00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setSocSaveSwitch(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code CHARGING_CHARGE_WIRELESS_CHARGING_SWITCH_SET} (0x4e400042).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setWirelessChargingSwitchState(int state) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.charging.AbsBYDAutoChargingListener l) { throw new RuntimeException("Stub!"); }
}
