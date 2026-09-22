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

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.power.BYDAutoPowerDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.power.AbsBYDAutoPowerListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.power.AbsBYDAutoPowerListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.power.AbsBYDAutoPowerListener l) { throw new RuntimeException("Stub!"); }
}
