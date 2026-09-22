package android.hardware.bydauto.engine;

/** Permissions: {@code android.permission.BYDAUTO_ENGINE_GET}, {@code android.permission.BYDAUTO_ENGINE_SET} */
public final class BYDAutoEngineDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int DEVICE_HAS_THE_FEATURE = 1;
    public static final int DEVICE_NOT_HAS_THE_FEATURE = 0;
    public static final int DEVICE_THE_FEATURE_LINK_ERROR = 65535;
    public static final int DEVICE_THE_FEATURE_NEVER_GET = 2;
    public static final int ENGINE_CAPACITY_MAX = 250;
    public static final int ENGINE_CAPACITY_MIN = 0;
    public static final int ENGINE_COMMAND_BUSY = -2147482647;
    public static final int ENGINE_COMMAND_FAILED = -2147482648;
    public static final int ENGINE_COMMAND_INVALID_VALUE = -2147482645;
    public static final int ENGINE_COMMAND_SUCCESS = 0;
    public static final int ENGINE_COMMAND_TIMEOUT = -2147482646;
    public static final int ENGINE_COOLANT_LEVEL_LOW = 2;
    public static final int ENGINE_COOLANT_LEVEL_NORMAL = 1;
    public static final int ENGINE_COOLING_FAN_TEMPERATURE_MAX = 1;
    public static final int ENGINE_COOLING_FAN_TEMPERATURE_MIN = 0;
    public static final double ENGINE_DISPLACEMENT_MAX = 25.5d;
    public static final double ENGINE_DISPLACEMENT_MIN = 0.0d;
    public static final int ENGINE_IDLING_STATE_OFF = 0;
    public static final int ENGINE_IDLING_STATE_ON = 1;
    public static final double ENGINE_MILEAGE_MAX = 1677721.5d;
    public static final double ENGINE_MILEAGE_MIN = 0.0d;
    public static final int ENGINE_OIL_MAX = 254;
    public static final int ENGINE_OIL_MIN = 0;
    public static final int ENGINE_POWER_MAX = 300;
    public static final int ENGINE_POWER_MIN = -100;
    public static final int ENGINE_SIMULATOR_VOICE_SOURCE_1 = 1;
    public static final int ENGINE_SIMULATOR_VOICE_SOURCE_2 = 2;
    public static final int ENGINE_SIMULATOR_VOICE_SOURCE_3 = 3;
    public static final int ENGINE_SPEED_MAX = 8000;
    public static final int ENGINE_SPEED_MIN = 0;
    public static final int ENGINE_SPEED_WARNING_NO = 1;
    public static final int ENGINE_SPEED_WARNING_YES = 0;
    public static final int ENGINE_STATE_BREAKDOWN = 2;
    public static final int ENGINE_STATE_NORMAL = 1;
    public static final int ENGINE_TARGET_IDLING_VALUE_MAX = 2540;
    public static final int ENGINE_TARGET_IDLING_VALUE_MIN = 0;
    public static final String ENGINE_TYPE1 = "371QA";
    public static final String ENGINE_TYPE10 = "488QA";
    public static final String ENGINE_TYPE11 = "4G15";
    public static final String ENGINE_TYPE12 = "4G18";
    public static final String ENGINE_TYPE13 = "4G69";
    public static final String ENGINE_TYPE14 = "473QE";
    public static final String ENGINE_TYPE15 = "471ZQA";
    public static final String ENGINE_TYPE2 = "473QB";
    public static final String ENGINE_TYPE3 = "473QC";
    public static final String ENGINE_TYPE4 = "473QD";
    public static final String ENGINE_TYPE5 = "476ZQA";
    public static final String ENGINE_TYPE6 = "483QA";
    public static final String ENGINE_TYPE7 = "483QB";
    public static final String ENGINE_TYPE8 = "483QB CNG";
    public static final String ENGINE_TYPE9 = "487ZQA";
    public static final int ENGINE_VOICE_SIMULATOR_OFF = 0;
    public static final int ENGINE_VOICE_SIMULATOR_ON = 1;
    public static final int ENGINE_WATER_TEMPERATURE_ABNORMAL = 255;
    public static final int ENGINE_WATER_TEMPERATURE_MAX = 194;
    public static final int ENGINE_WATER_TEMPERATURE_MIN = -60;
    public static final String FEATURE_ENGINE_VOICE_SIMULATOR = "EngineVoiceSimulator";
    public static final String FEATURE_ENGINE_VOICE_SOURCE = "EngineVoiceSource";
    protected static final String TAG = "BYDAutoEngineDevice";

    BYDAutoEngineDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code ENGINE_CODE} (0x40d00028). */
    public String getEngineCode() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code ENGINE_COOLANT_LEVEL} (0x05500031). */
    public int getEngineCoolantLevel() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code ENGINE_DISPLACEMENT} (0x40d00008). */
    public double getEngineDisplacement() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code ENGINE_POWER} (0x14400020). */
    public int getEnginePower() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code ENGINE_SIMULATOR_SOURCE_TYPE} (0x48f00010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEngineSimulatorVoiceSource() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code ENGINE_SPEED} (0x14400012). */
    public int getEngineSpeed() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code ENGINE_SPEED_WARNING} (0x1440001f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEngineSpeedWarningValue() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code ENGINE_STATE_S} (0x000be73f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public byte[] getEngineState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code ENGINE_VOICE_SIMULATOR_STATE} (0x48f0000a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEngineVoiceSimulatorState() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.engine.BYDAutoEngineDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code ENGINE_OIL_LEVEL} (0x05500038). */
    public int getOilLevel() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code ENGINE_HAS_ENGINE_VOICE_SIMULATOR} (0x48f00000), {@code ENGINE_HAS_ENGINE_VOICE_SOURCE} (0x48f00013).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int hasFeature(String feature) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.engine.AbsBYDAutoEngineListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.engine.AbsBYDAutoEngineListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code ENGINE_SIMULATOR_SOURCE_TYPE_SET} (0x3e300038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setEngineSimulatorVoiceSource(int type) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code ENGINE_VOICE_SIMULATOR_STATE_SET} (0x3e300020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setEngineVoiceSimulatorState(int state) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.engine.AbsBYDAutoEngineListener l) { throw new RuntimeException("Stub!"); }
}
