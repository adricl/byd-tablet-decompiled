package android.hardware.bydauto.power;

/** Permissions: {@code android.permission.BYDAUTO_POWER_GET}, {@code android.permission.BYDAUTO_POWER_SET} */
public final class BYDAutoPowerDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int ACC_STATUS = -1728053193;
    public static final int BATTERY_VOLTAGE_LOW = 1;
    public static final int BATTERY_VOLTAGE_NORMAL = 0;
    public static final int DEVICE_PAD = 1;
    public static final double MAX_BATTERY_REMAIN_POWER = 409.4d;
    public static final int MCU_SLEEP = 0;
    public static final int MCU_WAKE = 1;
    public static final double MIN_BATTERY_REMAIN_POWER = 0.0d;
    public static final int POWER_COMMAND_BUSY = -2147482647;
    public static final int POWER_COMMAND_FAILED = -2147482648;
    public static final int POWER_COMMAND_INVALID_VALUE = -2147482645;
    public static final int POWER_COMMAND_SUCCESS = 0;
    public static final int POWER_COMMAND_TIMEOUT = -2147482646;
    public static final int POWER_CTL_STATE_OFF = 0;
    public static final int POWER_CTL_STATE_ON = 1;
    public static final int QCOM_REBOOT_STATE_DONE = 2;
    public static final int QCOM_REBOOT_STATE_INVALID = 0;
    public static final int QCOM_REBOOT_STATE_START = 1;
    public static final int SHUTDOWN_INFO_INVALID = 0;
    public static final int SHUTDOWN_INFO_WARNING = 1;
    public static final int START_GBDATA_TRANSMIT = 1;
    protected static final String TAG = "BYDAutoPowerDevice";
    public static final int TFT_BACKLIGHT_MAX = 11;
    public static final int TFT_BACKLIGHT_MIN = 0;
    public static final int TP_DISPLAY_FREESCALE = 2;
    public static final int TP_DISPLAY_PAD = 1;
    public static final int WAKEUP_ABNORMAL_RESTART = 2;
    public static final int WAKEUP_ACC_ON = 1;
    public static final int WAKEUP_EMERGENCY = 4;
    public static final int WAKEUP_NORMAL_START = 0;
    public static final int WAKEUP_REMOTE = 5;
    public static final int WAKEUP_UPGRADE = 3;

    BYDAutoPowerDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int dspReset() { throw new RuntimeException("Stub!"); }
    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code POWER_LOW_VOLTAGE} (0x12d0003d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBatteryLowVoltageState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code POWER_BATTERY_REMAIN_ELECTRICITY} (0x34a00010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getBatteryRemainPowerEV() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.power.BYDAutoPowerDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code POWER_MCU_STATUS} (0x99000003).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMcuStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code POWER_FREESCALE_POWER} (0x0008843c), {@code POWER_FREESCALE_RESET} (0x000bd59f), {@code POWER_ACC_STATUS} (0x99000037), {@code POWER_PAD_BOOT} (0x0003bcf5), {@code POWER_TFT_TP_POWER} (0x00084f99), {@code POWER_MOTOR_POWER} (0x0007f536), {@code POWER_OUTPUT_5V} (0x00045832), {@code POWER_OUTPUT_12V} (0x000aa82b), {@code POWER_SYSTEM_SUSPEND} (0x0007e044).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerCtlStatus(int event_type) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code POWER_SHUTDOWN_INFO_PAD} (0x03e00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getShutdownInfo(int device) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code POWER_TFT_BACKLIGHT} (0x0002570c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTftBacklight() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code POWER_TP_OWNER} (0x0005db1f), {@code POWER_DISPLAY_OWNER} (0x00024197).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTpDisplayController() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int padReset() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int qcomWakeup(int reason) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.power.AbsBYDAutoPowerListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.power.AbsBYDAutoPowerListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendQcomRebootState(int state) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code POWER_BCM_POWER_ON_LEVEL_SET} (0x0002dbff).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setBCMPowerOnLevel() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code POWER_OUTPUT_5V_SET} (0x00041ec6), {@code POWER_OUTPUT_12V_SET} (0x0007daea), {@code POWER_TFT_TP_POWER_SET} (0x000e16f1).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setPowerCtlStatus(int event_type, int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code POWER_TFT_BACKLIGHT_SET} (0x000b9519).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setTftBacklight(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code POWER_TP_OWNER_SET} (0x0002adac), {@code POWER_DISPLAY_OWNER_SET} (0x000373df).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setTpDisplayController(int value) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.power.AbsBYDAutoPowerListener l) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int wakeUpMcu() { throw new RuntimeException("Stub!"); }
}
