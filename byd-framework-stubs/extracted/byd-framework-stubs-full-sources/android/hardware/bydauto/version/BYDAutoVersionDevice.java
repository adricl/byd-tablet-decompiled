package android.hardware.bydauto.version;

/** Permissions: {@code android.permission.BYDAUTO_VERSION_GET}, {@code android.permission.BYDAUTO_VERSION_SET} */
public final class BYDAutoVersionDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    protected static final String TAG = "BYDAutoVersionDevice";
    public static final int VERSION_COMMAND_BUSY = -2147482647;
    public static final int VERSION_COMMAND_FAILED = -2147482648;
    public static final int VERSION_COMMAND_INVALID_VALUE = -2147482645;
    public static final int VERSION_COMMAND_SUCCESS = 0;
    public static final int VERSION_COMMAND_TIMEOUT = -2147482646;

    BYDAutoVersionDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /**
     * Reads feature ID {@code VERSION_AC} (0x9900003c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getACEcuVersion() { throw new RuntimeException("Stub!"); }
    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_BATTERY_CTRL} (0x00081a27).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getBatteryCtrlVersion() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_CAR_CHARGER} (0x000af07e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getCarChargerVersion() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_DSP_BOOT} (0x000fa623).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getDSPBootVersion() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_DSP} (0x9900011c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getDspVersion() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_DTC} (0x0007fe7e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getDtcVersion() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_ENGINE_CTRL} (0x0006fe74).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getEngineCtrlVersion() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.version.BYDAutoVersionDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_INSTRUMENT} (0x0006fdad).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getInstrumentVersion() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_MCU_BOOT} (0x99000001).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getMcuBootVersion() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_MCU} (0x99000002).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getMcuVersion() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_MOTOR_CTRL} (0x0008bb5b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getMotorCtrl1Version() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_MOTOR_CTRL_F} (0x00029505).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getMotorCtrl2Version() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_MOTOR_CTRL_R} (0x000c47bb).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getMotorCtrl3Version() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code VERSION_TRANS_CTRL} (0x0004d9b6).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getTransmissionCtrlVersion() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryAcEcuVersion() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryBatteryCtrlVersion() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryCarChargerVersion() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryDSPBootVersion() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryDspVersion() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryEngineCtrlVersion() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryInstrumentVersion() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryMcuBootVersion() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryMcuVersion() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryMotorCtrl1Version() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryMotorCtrl2Version() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryMotorCtrl3Version() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryTransmissionCtrlVersion() { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.version.AbsBYDAutoVersionListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.version.AbsBYDAutoVersionListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.version.AbsBYDAutoVersionListener l) { throw new RuntimeException("Stub!"); }
}
