package android.hardware.bydauto.light;

/** Permissions: {@code android.permission.BYDAUTO_LIGHT_GET}, {@code android.permission.BYDAUTO_LIGHT_SET} */
public final class BYDAutoLightDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int DAYTIME_LIGHT_CLOSE = 2;
    public static final int DAYTIME_LIGHT_INVALID = 0;
    public static final int DAYTIME_LIGHT_OPEN = 1;
    public static final int DAYTIME_LIGHT_UNDEFINED = 3;
    public static final int DAY_RUNNING_LIGHT_INVALID = 0;
    public static final int DAY_RUNNING_LIGHT_OFF = 2;
    public static final int DAY_RUNNING_LIGHT_ON = 1;
    public static final int DEVICE_HAS_THE_FEATURE = 1;
    public static final int DEVICE_NOT_HAS_THE_FEATURE = 0;
    public static final int DEVICE_THE_FEATURE_LINK_ERROR = 65535;
    public static final int DEVICE_THE_FEATURE_NEVER_GET = 2;
    public static final int DOUBLE_FLASH_INVALID = 0;
    public static final int DOUBLE_FLASH_OFF = 2;
    public static final int DOUBLE_FLASH_ON = 1;
    public static final String FEATURE_DAY_RUNNING_LIGHT_3AC = "DayRunningLight3ac";
    public static final String FEATURE_DAY_RUNNING_LIGHT_475 = "DayRunningLight475";
    public static final String FEATURE_DAY_RUNNING_LIGHT_CONFIG = "DayRunningLightConfig";
    public static final String FEATURE_LIGHT_LEFT_ADB = "LeftADB";
    public static final String FEATURE_LIGHT_RIGHT_ADB = "RightADB";
    public static final int LEFT_TURN_LIGHT = 1;
    public static final int LIGHT_ADB_ACTIVATION = 3;
    public static final int LIGHT_ADB_FAULT = 5;
    public static final int LIGHT_ADB_INVALID = 0;
    public static final int LIGHT_ADB_OFF = 1;
    public static final int LIGHT_ADB_STANDBY = 2;
    public static final int LIGHT_ADB_STATE_INVALID = 0;
    public static final int LIGHT_ADB_STATE_OFF = 2;
    public static final int LIGHT_ADB_STATE_ON = 1;
    public static final int LIGHT_ADB_WORKING = 4;
    public static final int LIGHT_COMMAND_BUSY = -2147482647;
    public static final int LIGHT_COMMAND_FAILED = -2147482648;
    public static final int LIGHT_COMMAND_INVALID = -2147482645;
    public static final int LIGHT_COMMAND_SUCCESS = 0;
    public static final int LIGHT_COMMAND_TIMEOUT = -2147482646;
    public static final int LIGHT_FL_ADB = 0;
    public static final int LIGHT_FOOT = 8;
    public static final int LIGHT_FRONT_FOG = 6;
    public static final int LIGHT_FR_ADB = 1;
    public static final int LIGHT_GROUP_LEFT = 0;
    public static final int LIGHT_GROUP_RIGHT = 1;
    public static final int LIGHT_HAS_DEVICE = 1;
    public static final int LIGHT_HIGH_BEAM = 3;
    public static final int LIGHT_ILLUM_LEVEL1 = 1;
    public static final int LIGHT_ILLUM_LEVEL2 = 2;
    public static final int LIGHT_ILLUM_LEVEL3 = 3;
    public static final int LIGHT_ILLUM_LEVEL4 = 4;
    public static final int LIGHT_ILLUM_LEVEL5 = 5;
    public static final int LIGHT_LEFT_TURN_SIGNAL = 4;
    public static final int LIGHT_LOW_BEAM = 2;
    public static final int LIGHT_NOT_HAS_DEVICE = 2;
    public static final int LIGHT_OFF = 0;
    public static final int LIGHT_ON = 1;
    public static final int LIGHT_REAR_FOG = 7;
    public static final int LIGHT_RIGHT_TURN_SIGNAL = 5;
    public static final int LIGHT_SIDE = 1;
    public static final int LIGHT_STATE_FAULT = 1;
    public static final int LIGHT_STATE_INVALID = 2;
    public static final int LIGHT_STATE_NORMAL = 0;
    public static final int REVERSING_LIGHT_INVALID = 0;
    public static final int REVERSING_LIGHT_OFF = 2;
    public static final int REVERSING_LIGHT_ON = 1;
    public static final int RIGHT_TURN_LIGHT = 2;
    public static final int SEQUENTIAL_LIGHT_INVALID = 3;
    public static final int SEQUENTIAL_LIGHT_OFF = 1;
    public static final int SEQUENTIAL_LIGHT_ON = 0;
    public static final int STOP_LIGHT_FLASH = 2;
    public static final int STOP_LIGHT_INVALID = 0;
    public static final int STOP_LIGHT_OFF = 3;
    public static final int STOP_LIGHT_ON = 1;
    protected static final String TAG = "BYDAutoLightDevice";
    public static final int TURN_LIGHT_FLASH_DANGER = 6;
    public static final int TURN_LIGHT_FLASH_EMERG = 7;
    public static final int TURN_LIGHT_FLASH_FAST = 9;
    public static final int TURN_LIGHT_FLASH_REAR_END = 8;
    public static final int TURN_LIGHT_INVALID = 0;
    public static final int TURN_LIGHT_LEFT_FLASH_FAST = 3;
    public static final int TURN_LIGHT_LEFT_FLASH_NORMAL = 2;
    public static final int TURN_LIGHT_LEFT_LONG = 3;
    public static final int TURN_LIGHT_LEFT_SHORT = 2;
    public static final int TURN_LIGHT_LONG = 2;
    public static final int TURN_LIGHT_NOT_FLASH = 1;
    public static final int TURN_LIGHT_OFF = 1;
    public static final int TURN_LIGHT_RIGHT_FLASH_FAULT = 5;
    public static final int TURN_LIGHT_RIGHT_FLASH_NORMAL = 4;
    public static final int TURN_LIGHT_RIGHT_LONG = 5;
    public static final int TURN_LIGHT_RIGHT_SHORT = 4;
    public static final int TURN_LIGHT_SHORT = 1;

    BYDAutoLightDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /** Reads feature ID {@code LIGHT_AFS_SWITCH} (0x49c0002c). */
    public int getAFSSwitch() { throw new RuntimeException("Stub!"); }
    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LIGHT_CMD_DAY_RUNNING_LIGHT_STATE} (0x49603010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDayRunningLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LIGHT_DAY_RUNNING_LIGHT_AUTO_STATE} (0x3ac00024).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDayTimeLightState() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LIGHT_CMD_DOUBLE_FLASH_STATE} (0x39400033).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDoubleFlashLightState() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code LIGHT_GROUP_LEFT_LIGHT} (0x3ac0000b), {@code LIGHT_GROUP_RIGHT_LIGHT} (0x3ad0000b). */
    public int getGroupHeadlightState(int area) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LIGHT_ILLUMINATION_LEVEL} (0x000c0a7c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getIlluminationIntensityLevel() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.light.BYDAutoLightDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LIGHT_LF_ADB_STATE} (0x3ac0001c), {@code LIGHT_RF_ADB_STATE} (0x3ad0001c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLightAdbState(int id) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code LIGHT_AUTO_SWITCH} (0x000d1b88). */
    public int getLightAutoStatus() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code LIGHT_SIDE_LIGHT} (0x38a00008), {@code LIGHT_LOW_BEAM_LIGHT} (0x38a0000a), {@code LIGHT_HIGH_BEAM_LIGHT} (0x38a0000c), {@code LIGHT_FOOT_LIGHT} (0x12d00038), {@code LIGHT_LEFT_TURN_SIGNAL_LIGHT} (0x1330000c), {@code LIGHT_RIGHT_TURN_SIGNAL_LIGHT} (0x1330000d), {@code LIGHT_FRONT_FOG_LIGHT} (0x1330000e), {@code LIGHT_REAR_FOG_LIGHT} (0x1330000f). */
    public int getLightStatus(int type) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LIGHT_CMD_REVERSING_LIGHT_STATE} (0x38a00014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getReversingLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LIGHT_CMD_SEQUENTIAL_STATE} (0x3b400046).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSequentialLightState() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LIGHT_CMD_STOP_LIGHT_STATE} (0x38a00012).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getStopLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LIGHT_TURN_SIGNAL_LIGHT} (0x38a0002c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTurnLightFlashState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LIGHT_TURN_SIGNAL_LIGHT_SWITCH_STATE} (0x1330002c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTurnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LIGHT_LEFT_TURN_SIGNAL_LIGHT_SWITCH_STATE} (0x0004cd1d), {@code LIGHT_RIGHT_TURN_SIGNAL_LIGHT_SWITCH_STATE} (0x000e3177).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTurnLightState(int id) { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LIGHT_HAS_DAY_RUNNING_LIGHT_AUTO_475} (0x000eb879), {@code LIGHT_DAY_RUNNING_LIGHT_CONFIG} (0x38a00033), {@code LIGHT_LF_ADB_CONFIG} (0x3ac00022), {@code LIGHT_RF_ADB_CONFIG} (0x3ad00022), {@code LIGHT_HAS_DAY_RUNNING_LIGHT_AUTO_3AC} (0xbac00024).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int hasFeature(String feature) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.light.AbsBYDAutoLightListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.light.AbsBYDAutoLightListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code LIGHT_ADB_STATE_SET} (0x4310003e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAcLightAdbState(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code LIGHT_DAY_RUNNING_LIGHT_AUTO_STATE_SET} (0x43100046).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setDayTimeLightState(int state) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.light.AbsBYDAutoLightListener l) { throw new RuntimeException("Stub!"); }
}
