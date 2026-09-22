package android.hardware.bydauto.ac;

/** Permissions: {@code android.permission.BYDAUTO_AC_COMMON}, {@code android.permission.BYDAUTO_AC_GET}, {@code android.permission.BYDAUTO_AC_SET} */
public final class BYDAutoAcDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int AC = 1;
    public static final int AC_AIR_QUAL_CTRL_MENU_OFF = 0;
    public static final int AC_AIR_QUAL_CTRL_MENU_ON = 1;
    public static final int AC_COMMAND_BUSY = -2147482647;
    public static final int AC_COMMAND_FAILED = -2147482648;
    public static final int AC_COMMAND_INVALID_VALUE = -2147482645;
    public static final int AC_COMMAND_SUCCESS = 0;
    public static final int AC_COMMAND_TIMEOUT = -2147482646;
    public static final int AC_COMPRESSOR_MANUAL_SIGN_OFF = 0;
    public static final int AC_COMPRESSOR_MANUAL_SIGN_ON = 1;
    public static final int AC_COMPRESSOR_OFF = 0;
    public static final int AC_COMPRESSOR_ON = 1;
    public static final int AC_CTRLMODE_AUTO = 0;
    public static final int AC_CTRLMODE_MANUAL = 1;
    public static final int AC_CTRL_SOURCE_UI_KEY = 0;
    public static final int AC_CTRL_SOURCE_VOICE = 1;
    public static final int AC_CYCLEMODE_INLOOP = 1;
    public static final int AC_CYCLEMODE_OUTLOOP = 0;
    public static final int AC_DEFROST_5S_OFFLINE = 0;
    public static final int AC_DEFROST_5S_ONLINE = 1;
    public static final int AC_DEFROST_AREA_FRONT = 1;
    public static final int AC_DEFROST_AREA_REAR = 2;
    public static final int AC_DEFROST_STATE_OFF = 0;
    public static final int AC_DEFROST_STATE_ON = 1;
    public static final int AC_FAULT_NUM_SHOWN_STATE_INVALID = 0;
    public static final int AC_FAULT_NUM_SHOWN_STATE_OFF = 1;
    public static final int AC_FAULT_NUM_SHOWN_STATE_ON = 2;
    public static final int AC_FAULT_NUM_SHOWN_STATE_RESERVED = 3;
    public static final int AC_KEY_ACTION_FALSE = 1;
    public static final int AC_KEY_ACTION_INVALID = 0;
    public static final int AC_KEY_ACTION_TRUE = 2;
    public static final int AC_MAX_COOLING_OFF = 0;
    public static final int AC_MAX_COOLING_ON = 1;
    public static final int AC_ONLINE_STATE_OFF = 0;
    public static final int AC_ONLINE_STATE_ON = 1;
    public static final int AC_POWER_OFF = 0;
    public static final int AC_POWER_ON = 1;
    public static final int AC_PROMPT_BOX_SHOWN_STATE_INVALID = 0;
    public static final int AC_PROMPT_BOX_SHOWN_STATE_OFF = 1;
    public static final int AC_PROMPT_BOX_SHOWN_STATE_ON = 2;
    public static final int AC_PROMPT_BOX_SHOWN_STATE_RESERVE = 3;
    public static final int AC_PTC_PREHEAT_ILLUME = 1;
    public static final int AC_PTC_PREHEAT_INVALID = 0;
    public static final int AC_PTC_PREHEAT_NOTILLUME = 2;
    public static final int AC_PTC_PREHEAT_RESERVE = 3;
    public static final int AC_REAR_LOCK_STATE_OFF = 0;
    public static final int AC_REAR_LOCK_STATE_ON = 1;
    public static final int AC_REAR_NOT_AVAILABLE_MENU_INVALID = 0;
    public static final int AC_REAR_NOT_AVAILABLE_MENU_NO_POP = 1;
    public static final int AC_REAR_NOT_AVAILABLE_MENU_POP = 2;
    public static final int AC_REAR_PANEL_LOCK_INVALID = 0;
    public static final int AC_REAR_PANEL_LOCK_LOCKED = 1;
    public static final int AC_REAR_PANEL_LOCK_PROMPT_CLOSED = 0;
    public static final int AC_REAR_PANEL_LOCK_PROMPT_OPEN = 1;
    public static final int AC_REAR_PANEL_LOCK_UNLOCKED = 2;
    public static final int AC_REMOTE_CTRL_TIME_10 = 1;
    public static final int AC_REMOTE_CTRL_TIME_15 = 2;
    public static final int AC_REMOTE_CTRL_TIME_20 = 3;
    public static final int AC_REMOTE_CTRL_TIME_25 = 4;
    public static final int AC_REMOTE_CTRL_TIME_30 = 5;
    public static final int AC_TEMPCTRL_RANGE_SINGLE = 3;
    public static final int AC_TEMPCTRL_SEPARATE_OFF = 0;
    public static final int AC_TEMPCTRL_SEPARATE_ON = 1;
    public static final int AC_TEMPERATURE_DEPUTY = 2;
    public static final int AC_TEMPERATURE_MAIN = 1;
    public static final int AC_TEMPERATURE_MAIN_DEPUTY = 0;
    public static final int AC_TEMPERATURE_OUT = 4;
    public static final int AC_TEMPERATURE_REAR = 3;
    public static final int AC_TEMPERATURE_UNIT_OC = 1;
    public static final int AC_TEMPERATURE_UNIT_OF = 0;
    public static final int AC_TEMP_INVALID = 0;
    public static final int AC_TEMP_IN_CELSIUS_HALF_MAX = 66;
    public static final int AC_TEMP_IN_CELSIUS_HALF_MIN = 34;
    public static final int AC_TEMP_IN_CELSIUS_MAX = 33;
    public static final int AC_TEMP_IN_CELSIUS_MIN = 17;
    public static final int AC_TEMP_IN_FAHRENHEIT_HALF_MAX = 182;
    public static final int AC_TEMP_IN_FAHRENHEIT_HALF_MIN = 128;
    public static final int AC_TEMP_IN_FAHRENHEIT_MAX = 91;
    public static final int AC_TEMP_IN_FAHRENHEIT_MIN = 64;
    public static final int AC_TEMP_OUT_CELSIUS_MAX = 50;
    public static final int AC_TEMP_OUT_CELSIUS_MIN = -40;
    public static final int AC_TEMP_OUT_FAHRENHEIT_MAX = 122;
    public static final int AC_TEMP_OUT_FAHRENHEIT_MIN = -40;
    public static final int AC_TYPE_AUTO = 1;
    public static final int AC_TYPE_ELECTRIC = 2;
    public static final int AC_TYPE_INVALID = 0;
    public static final int AC_VENTILATION_STATE_OFF = 0;
    public static final int AC_VENTILATION_STATE_ON = 1;
    public static final int AC_WARM_FUEL = 2;
    public static final int AC_WARM_INVALID = 0;
    public static final int AC_WARM_PTC = 1;
    public static final int AC_WARM_TYPE_FLAG_FUEL = 2;
    public static final int AC_WARM_TYPE_FLAG_INVALID = 0;
    public static final int AC_WARM_TYPE_FLAG_PTC = 1;
    public static final int AC_WARM_TYPE_FLAG_PTCFUEL = 3;
    public static final int AC_WINDLEVEL_0 = 0;
    public static final int AC_WINDLEVEL_1 = 1;
    public static final int AC_WINDLEVEL_2 = 2;
    public static final int AC_WINDLEVEL_3 = 3;
    public static final int AC_WINDLEVEL_4 = 4;
    public static final int AC_WINDLEVEL_5 = 5;
    public static final int AC_WINDLEVEL_6 = 6;
    public static final int AC_WINDLEVEL_7 = 7;
    public static final int AC_WINDLEVEL_MANUAL_SIGN_OFF = 0;
    public static final int AC_WINDLEVEL_MANUAL_SIGN_ON = 1;
    public static final int AC_WINDMODE_DEFROST = 5;
    public static final int AC_WINDMODE_FACE = 1;
    public static final int AC_WINDMODE_FACEDEFROST = 7;
    public static final int AC_WINDMODE_FACEFOOT = 2;
    public static final int AC_WINDMODE_FACEFOOTDEFROST = 6;
    public static final int AC_WINDMODE_FOOT = 3;
    public static final int AC_WINDMODE_FOOTDEFROST = 4;
    public static final int AC_WINDMODE_MANUAL_SIGN_OFF = 0;
    public static final int AC_WINDMODE_MANUAL_SIGN_ON = 1;
    public static final int AC_WINDMODE_SHOWN_STATE_OFF = 0;
    public static final int AC_WINDMODE_SHOWN_STATE_ON = 1;
    public static final int AC_WIND_TOTAL_MODES_NUM_5 = 1;
    public static final int AC_WIND_TOTAL_MODES_NUM_7 = 2;
    public static final int AC_WIND_TOTAL_MODES_NUM_INVALID = 0;
    public static final int ANTIVIRUS_COUNT_DOWN_MAX = 70;
    public static final int ANTIVIRUS_COUNT_DOWN_MIN = 0;
    public static final int ANTIVIRUS_DO_NOT_NEED = 4;
    public static final int ANTIVIRUS_END = 2;
    public static final int ANTIVIRUS_EXIT_LOW_POWER = 6;
    public static final int ANTIVIRUS_INTERRUPT = 3;
    public static final int ANTIVIRUS_START = 1;
    public static final int ANTIVIRUS_START_FAIL = 5;
    public static final int AUTO_CLEAN_AIR_INVALID = 0;
    public static final int AUTO_CLEAN_AIR_OFF = 2;
    public static final int AUTO_CLEAN_AIR_ON = 1;
    public static final int COLD = 1;
    public static final int DEFROST_REAR_DEFAULT = 3;
    public static final int DEFROST_REAR_HAS_FUNC = 1;
    public static final int DEFROST_REAR_MIRROR_HEATING_HAS_FUNC = 2;
    public static final int DEFROST_REAR_NO_FUNC = 0;
    public static final int DEVICE_HAS_THE_FEATURE = 1;
    public static final int DEVICE_NOT_HAS_THE_FEATURE = 0;
    public static final int DEVICE_THE_FEATURE_LINK_ERROR = 65535;
    public static final int DEVICE_THE_FEATURE_NEVER_GET = 2;
    public static final String FEATURE_AC_449_ONLINE = "449Online";
    public static final String FEATURE_AC_AUTO_MODE = "ACAutoMode";
    public static final String FEATURE_AC_DEFROST = "ACDefrost";
    public static final String FEATURE_AC_REAR_PANEL_3F1 = "ACRearPanel3f1";
    public static final String FEATURE_AC_REAR_PANEL_408 = "ACRearPanel408";
    public static final String FEATURE_AC_REMOTE_CTL = "ACRemoteControl";
    public static final String FEATURE_AC_WARM_SETTING = "WarmSetting";
    public static final int FRAGRANCE_CONCENTRATION_CLOSE = 4;
    public static final int FRAGRANCE_CONCENTRATION_HIGH = 3;
    public static final int FRAGRANCE_CONCENTRATION_LOW = 1;
    public static final int FRAGRANCE_CONCENTRATION_MID = 2;
    public static final java.util.List<String> FRAGRANCE_NAMES_CHN;
    public static final java.util.List<String> FRAGRANCE_NAMES_ENG;
    public static final java.util.List<java.lang.Integer> FRAGRANCE_NAME_NUMBERS;
    public static final int GET_QUICK_CLEAN_BEGIN = 1;
    public static final int GET_QUICK_CLEAN_END = 2;
    public static final int GET_QUICK_CLEAN_TERMINATE = 3;
    public static final int HOT = 0;
    public static final int LANGUAGE_CHN = 2;
    public static final int LANGUAGE_ENG = 1;
    public static final int OTA_SUB_BATTERY_TEMPRATURE_INVALID = 65535;
    public static final int OTA_SUB_BATTERY_TEMPRATURE_MAX = 160;
    public static final int OTA_SUB_BATTERY_TEMPRATURE_MIN = -60;
    public static final int PURIFICATION_FUNCTION_PROMPT_ENABLE = 1;
    public static final int QUICK_CLEAN_3DA_OFFLINE = 0;
    public static final int QUICK_CLEAN_3DA_ONLINE = 1;
    public static final int QUICK_CLEAN_INVALID = 0;
    public static final int REAR_AC = 2;
    public static final int REAR_AC_MAX_WINDLEVEL_4 = 1;
    public static final int REAR_AC_MAX_WINDLEVEL_7 = 2;
    public static final int RESET_INVALID = 0;
    public static final int RESET_ITEM_AC = 0;
    public static final int RESET_VALID = 1;
    public static final int RET_ERROR_FRAGRANCE_USED_UP = 3;
    public static final int RET_ERROR_NONE_FRAGRANCE = 1;
    public static final int RET_ERROR_NO_SPRCIFIED_FRAGRANCE = 2;
    public static final int RET_ERROR_UNKNOWN = -1;
    public static final int RET_SUCCESS = 5;
    public static final int RET_SUCCESS_BUT_REMAIN_LESS = 4;
    public static final int SET_QUICK_CLEAN_CLOSE2 = 2;
    @Deprecated
    public static final int SET_QUICK_CLEAN_CLOSE3 = 3;
    public static final int SET_QUICK_CLEAN_OPEN = 1;
    protected static final String TAG = "BYDAutoAcDevice";
    public static final int TIP_AUTO_CLEAN = 2;
    public static final int TIP_FLAG_INVALID = 0;
    public static final int TIP_QUICK_CLEAN = 1;
    public static final int VOICE_AC_ALREADY_IN_MAX_TEMP = 5;
    public static final int VOICE_AC_ALREADY_IN_MIN_TEMP = 4;
    public static final int VOICE_CMD_INVALID = 0;
    public static final int VOICE_SET_INVALID_TEMP = 2;
    public static final int VOICE_SET_INVALID_WIND_LEVEL = 3;
    public static final int VOICE_START_AC_SUCCESS = 1;
    static {
        FRAGRANCE_NAMES_CHN = null;
        FRAGRANCE_NAMES_ENG = null;
        FRAGRANCE_NAME_NUMBERS = null;
    }

    BYDAutoAcDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int enablePurificationFunctionPrompt(int enable) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int feelColdHot(int whichAC, int signal) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get3daOnlineState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_COMPRESSOR_MANUAL_SIGN} (0x4040000a). */
    public int getAcCompressorManualSign() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_COMPRESSOR_MODE} (0x40400009). */
    public int getAcCompressorMode() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_CTRL_MODE} (0x40400012). */
    public int getAcControlMode() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_CYCLE_MODE} (0x40400014). */
    public int getAcCycleMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_CMD_AC_DEFROST_5S_ONLINE} (0x43400000).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcDefrostOnlineState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_DEFROST_FRONT_STATE} (0x40400016), {@code AC_DEFROST_REAR_STATE} (0x43400031). */
    public int getAcDefrostState(int area) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_FAULT_NUM_SHOWN_STATE} (0x40400040).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcFaultNumShownState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_KEY_ACTION_STATE} (0x40400022).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcKeyActionState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_MAX_COOLING_STATE} (0x4e600014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcMaxCoolingState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_ONLINE_STATE} (0x40400000).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcOnlineState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_REAR_PANEL_LOCK_HINT} (0x3f100010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcPanelLockPromptState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_PROMPT_BOX_SHOWN_STATE} (0x40400020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcPromptBoxShownState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_PTC_PREHEAT_SIGNAL} (0x4e600026).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcPtcPreheatSignal() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_REAR_NOT_AVAILABLE_MENU} (0x3f10000b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcRearPaneNotAvailableMenuState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_REAR_PANEL_LOCK} (0x3f100009).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcRearPanelLockState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_REMOTE_CTRL_TIME} (0x43400032).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcRemoteCtrlTime() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_POWER_STATE} (0x40400010). */
    public int getAcStartState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_CMD_OTA_SUB_BATTERY_TEMPRATURE} (0x44900028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcSubBatteryTemperature() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_TEMPCTRL_SEPARATE_STATE} (0x40400024). */
    public int getAcTemperatureControlMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_TYPE} (0x4330001c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcType() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_VENTILATION_STATE} (0x4e60000a). */
    public int getAcVentilationState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_WARM_STATE} (0x4e60003c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcWarmState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_WARM_TYPE_FLAG} (0x43300020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcWarmTypeOnlineState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_WIND_LEVEL} (0x4040001c). */
    public int getAcWindLevel() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_WINDLEVEL_MANUAL_SIGN} (0x4040000c). */
    public int getAcWindLevelManualSign() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_WIND_MODE} (0x40400018). */
    public int getAcWindMode() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_WINDMODE_MANUAL_SIGN} (0x4040000b). */
    public int getAcWindModeManualSign() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_WIND_MODE_NUM} (0x4330001e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcWindModeNum() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_WINDMODE_SHOWN_STATE} (0x0009790f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAcWindModeShownState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_AIR_QUAL_CTRL_MENU_STATE} (0x00014af4).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAirQualityCtrlMenuState() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public java.util.List<String> getAllFragranceNames(int language) { throw new RuntimeException("Stub!"); }
    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_AUTO_CLEAN_AIR} (0x4d902026).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAutoCleanAirState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_DEFROST_REAR_CONFIG} (0x43400038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDefrostRearConfig() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_HIGH_TEMP_ANTIVIRUS_COUNT_DOWN} (0x3da00038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getHighTempAntivirusCountDown() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_HIGH_TEMP_ANTIVIRUS_STATE} (0x3da00034).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getHighTempAntivirusState() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public java.util.List<String> getInstalledFragranceNames(int language) { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.ac.BYDAutoAcDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_QUICK_CLEAN_AIR} (0x3da00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getQuickCleanAirState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_QUICK_CLEAN_AIR_TIP} (0x3da0000a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getQuickCleanTip() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_REAR_CTRL_MODE} (0x48a0000e). */
    public int getRearAcControlMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_REAR_LOCK_STATE} (0x4e600016).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRearAcLockState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_REAR_MAX_WIND_LEVEL} (0x43300014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRearAcMaxWindLevel() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_REAR_POWER_STATE} (0x48a0000c). */
    public int getRearAcStartState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_REAR_WIND_LEVEL} (0x48a00008). */
    public int getRearAcWindLevel() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_REAR_WIND_MODE} (0x48a00018). */
    public int getRearAcWindMode() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_TEMPERATURE_UNIT} (0x40400027). */
    public int getTemperatureUnit() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code AC_TEMP_MAIN} (0x40400028), {@code AC_TEMP_DEPUTY} (0x40400030), {@code AC_TEMP_OUT} (0x40400038), {@code AC_TEMP_REAR} (0x48a00010). */
    public int getTemprature(int area) { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_VOICE_CMD_RESULT} (0x2db0001c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getVoiceCmdResult() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AC_HAS_AC_AUTO_MODE} (0xcd902018), {@code AC_HAS_AC_REMOTE_CTRL} (0xc3400032), {@code ONLINE_HAS_0x044900} (0x44900000), {@code AC_WARM_TYPE_FLAG} (0x43300020), {@code AC_HAS_AC_DEFROST} (0x0000e051), {@code AC_REAR_PANEL_3F1_ONLINE} (0x3f100000), {@code ONLINE_HAS_0x03F100} (0x3f100000), {@code AC_REAR_PANEL_408_ONLINE} (0x40800008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int hasFeature(String feature) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int qurAcAllStatus() { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.ac.AbsBYDAutoAcListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.ac.AbsBYDAutoAcListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int reset(int item, int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AC_COMPRESSOR_MODE_SET} (0x1de00010), {@code AC_CTRL_SOURCE_SET} (0x1de00015).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAcCompressorMode(int setSource, int mode) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code AC_CTRL_MODE_SET} (0x1de00018), {@code AC_CTRL_SOURCE_SET} (0x1de00015). */
    public int setAcControlMode(int setSource, int mode) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code AC_CYCLE_MODE_SET} (0x1de0001b), {@code AC_CTRL_SOURCE_SET} (0x1de00015). */
    public int setAcCycleMode(int setSource, int mode) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code AC_DEFROST_FRONT_STATE_SET} (0x1de00022), {@code AC_DEFROST_REAR_STATE_SET} (0x1de0001d), {@code AC_CTRL_SOURCE_SET} (0x1de00015). */
    public int setAcDefrostState(int setSource, int area, int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AC_MAX_COOLING_STATE_SET} (0x4fc0001c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAcMaxCoolingState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AC_REAR_PANEL_LOCK_SET} (0x4fc0002c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAcRearPanelLockState(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AC_REMOTE_CTRL_TIME_SET} (0x4df00040).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAcRemoteCtrlTime(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code AC_TEMPERATURE_UNIT_SET} (0x1de00040), {@code AC_TEMP_MAIN_SET} (0x1de00028), {@code AC_TEMP_DEPUTY_SET} (0x1de00030), {@code AC_TEMP_REAR_SET} (0x1de00038), {@code AC_CTRL_SOURCE_SET} (0x1de00015). */
    public int setAcTemperature(int type, int value, int tempSource, int unit) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code AC_TEMPCTRL_SEPARATE_STATE_SET} (0x1de00012), {@code AC_CTRL_SOURCE_SET} (0x1de00015). */
    public int setAcTemperatureControlMode(int setSource, int mode) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code AC_VENTILATION_STATE_SET} (0x1de00042), {@code AC_CTRL_SOURCE_SET} (0x1de00015). */
    public int setAcVentilationState(int setSource, int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AC_WARM_STATE_SET} (0x4fc0002a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAcWarmState(int state) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code AC_WIND_LEVEL_SET} (0x1de0000c), {@code AC_CTRL_SOURCE_SET} (0x1de00015). */
    public int setAcWindLevel(int setSource, int level) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code AC_WIND_MODE_SET} (0x1de00008), {@code AC_CTRL_SOURCE_SET} (0x1de00015). */
    public int setAcWindMode(int setSource, int mode) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AC_AUTO_CLEAN_AIR_SET} (0x4fc00010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAutoCleanAirState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AC_FIRST_PERFUME_INSTALLATION_STATUS} (0x4a100034), {@code AC_SECOND_PERFUME_INSTALLATION_STATUS} (0x4a100036), {@code AC_THIRD_PERFUME_INSTALLATION_STATUS} (0x4a100038), {@code AC_THE_FIRST_PERFUME_NAME_ABBR} (0x4a100050), {@code AC_THE_FIRST_PERFUME_SURPLUS} (0x4a100018), {@code AC_THE_FIRST_PERFUME_SURPLUS_ALERT} (0x4a10001f), {@code AC_THE_SECOND_PERFUME_NAME_ABBR} (0x4a100090), {@code AC_THE_SECOND_PERFUME_SURPLUS} (0x4a100020), {@code AC_THE_SECOND_PERFUME_SURPLUS_ALERT} (0x4a100027), {@code AC_THE_THIRD_PERFUME_NAME_ABBR} (0x4a1000d0), {@code AC_THE_THIRD_PERFUME_SURPLUS} (0x4a100028), {@code AC_THE_THIRD_PERFUME_SURPLUS_ALERT} (0x4a10002f), {@code AC_CURRENT_PERFUME_TYPE_SET} (0x4ef3202b), {@code AC_PERFUME_WORKING_STATE_SET} (0x4ef32028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setFragrance(String fraNameParam, int fraLevelParam) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AC_QUICK_CLEAN_AIR_SET} (0x4f500010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setQuickCleanAirState(int state) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code AC_REAR_CTRL_MODE_SET} (0x4fc0000e), {@code AC_CTRL_SOURCE_SET} (0x1de00015). */
    public int setRearAcControlMode(int setSource, int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AC_REAR_LOCK_STATE_SET} (0x4fc0001e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setRearAcLockState(int state) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code AC_REAR_WIND_LEVEL_SET} (0x4fc00008), {@code AC_CTRL_SOURCE_SET} (0x1de00015). */
    public int setRearAcWindLevel(int setSource, int level) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code AC_REAR_WIND_MODE_SET} (0x4fc00018), {@code AC_CTRL_SOURCE_SET} (0x1de00015). */
    public int setRearAcWindMode(int setSource, int mode) { throw new RuntimeException("Stub!"); }
    public int start(int setSource) { throw new RuntimeException("Stub!"); }
    public int startRearAc(int setSource) { throw new RuntimeException("Stub!"); }
    public int stop(int setSource) { throw new RuntimeException("Stub!"); }
    public int stopRearAc(int setSource) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.ac.AbsBYDAutoAcListener l) { throw new RuntimeException("Stub!"); }
}
