package android.hardware.bydauto.test;

/** Permissions: {@code android.permission.BYDAUTO_TEST_GET}, {@code android.permission.BYDAUTO_TEST_SET} */
public final class BYDAutoTestDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int APK_NUM_MAX = 255;
    public static final int APK_NUM_MIN = 0;
    public static final int AUDIO_DEBUG_MODE_ENTER = 1;
    public static final int AVAH_DEBUG_1K = 1;
    public static final int AVAH_DEBUG_2K = 2;
    public static final int AVAH_DEBUG_3K = 3;
    public static final int DEBUG_EXIT = 0;
    public static final int FM_DEBUG_1K = 1;
    public static final int FM_DEBUG_2K = 2;
    public static final int FM_DEBUG_3K = 3;
    public static final int IFLY_DEBUG_FUNCTION = 2;
    public static final int IFLY_DEBUG_RECORDING = 1;
    public static final int INSTALL_DONE = 2;
    public static final int INSTALL_GOING = 1;
    public static final int INSTALL_NOT_START = 0;
    public static final int REQUEST_INSTALL = 1;
    protected static final String TAG = "BYDAutoTestDevice";
    public static final int TEST_COMMAND_BUSY = -2147482647;
    public static final int TEST_COMMAND_FAILED = -2147482648;
    public static final int TEST_COMMAND_INVALID_VALUE = -2147482645;
    public static final int TEST_COMMAND_SUCCESS = 0;
    public static final int TEST_COMMAND_TIMEOUT = -2147482646;
    public static final int TEST_SET_TEC_LEVEL_0 = 0;
    public static final int TEST_SET_TEC_LEVEL_1 = 1;
    public static final int TEST_SET_TEC_LEVEL_2 = 2;
    public static final int TEST_SET_TEC_LEVEL_3 = 3;
    public static final int TEST_SET_TEC_LEVEL_4 = 4;
    public static final int TEST_SET_TEC_LEVEL_5 = 5;

    BYDAutoTestDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /**
     * Reads feature ID {@code TEST_CMD_TEST_AUDIO_AVAH} (0x6ea70010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAVAHDebugMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code TEST_CMD_TEST_AUDIO_MODE} (0x6ea90008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAudioDebugMode() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code TEST_CMD_TEST_AUDIO_FM} (0x6ea90010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getFMDebugMode() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code TEST_CMD_TEST_AUDIO_XF} (0x6ea90040).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getIflyDebugMode() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.test.BYDAutoTestDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.test.AbsBYDAutoTestListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.test.AbsBYDAutoTestListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendApkInstallState(int state, int successNum, int failNum, String sn) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code TEST_CMD_TEST_AUDIO_AVAH_SET} (0x6e970010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAVAHDebugMode(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code TEST_CMD_TEST_AUDIO_MODE_SET} (0x6e990008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAudioDebugMode(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code TEST_CMD_TEST_AUDIO_FM_SET} (0x6e990010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setFMDebugMode(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code TEST_CMD_TEST_AUDIO_XF_SET} (0x6e990040).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setIflyDebugMode(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code TEST_SET_TEC_LEVEL_SET} (0xaa000042).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setTecLevel(int level) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.test.AbsBYDAutoTestListener l) { throw new RuntimeException("Stub!"); }
}
