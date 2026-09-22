package android.hardware.bydauto.ota;

/** Permissions: {@code android.permission.BYDAUTO_OTA_GET}, {@code android.permission.BYDAUTO_OTA_SET} */
public final class BYDAutoOtaDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final double BATTERY_POWER_VOLTAGE_MAX = 17.0d;
    public static final double BATTERY_POWER_VOLTAGE_MIN = 6.0d;
    public static final double BATTERY_VOLTAGE_MAX = 16.0d;
    public static final double BATTERY_VOLTAGE_MIN = 8.0d;
    public static final int CAN_INFO_SWITCH_CLOSE = 0;
    public static final int CAN_INFO_SWITCH_OPEN = 1;
    public static final int CAN_INST_COM1 = 4;
    public static final int CAN_INST_COM2 = 0;
    public static final int CAN_INST_ECM = 5;
    public static final int CAN_INST_ESC = 1;
    public static final int CAN_INST_EX = 2;
    public static final int CONTACTOR_STATE_CONNECT = 1;
    public static final int CONTACTOR_STATE_DISCONNECT = 0;
    public static final int LF_DOOR_LOCK = 2;
    public static final int LF_DOOR_LOCK_INVALID = 0;
    public static final int LF_DOOR_UNLOCK = 1;
    public static final int LOCAL_DIAG_ENTER = 1;
    public static final int LOCAL_DIAG_FINISH = 0;
    public static final int OTA_COMMAND_BUSY = -2147482647;
    public static final int OTA_COMMAND_FAILED = -2147482648;
    public static final int OTA_COMMAND_INVALID = -2147482645;
    public static final int OTA_COMMAND_SUCCESS = 0;
    public static final int OTA_COMMAND_TIMEOUT = -2147482646;
    public static final int OTA_SCREEN_OFF = 0;
    public static final int OTA_SCREEN_ON = 1;
    public static final int OTA_STATE_INVALID = 0;
    public static final int OTA_STATE_UPGRADE = 1;
    public static final int OTA_TIMECOUNT_CTL_HOUR_INVALID = 31;
    public static final int OTA_TIMECOUNT_CTL_HOUR_MAX = 23;
    public static final int OTA_TIMECOUNT_CTL_HOUR_MIN = 0;
    public static final int OTA_TIMECOUNT_CTL_INSTALL_APPOINTMENT = 2;
    public static final int OTA_TIMECOUNT_CTL_INSTALL_CANCLE = 3;
    public static final int OTA_TIMECOUNT_CTL_INSTALL_INVALID = 0;
    public static final int OTA_TIMECOUNT_CTL_INSTALL_NOW = 1;
    public static final int OTA_TIMECOUNT_CTL_MINUTE_INVALID = 63;
    public static final int OTA_TIMECOUNT_CTL_MINUTE_MAX = 59;
    public static final int OTA_TIMECOUNT_CTL_MINUTE_MIN = 0;
    public static final int OTA_TIMECOUNT_CTL_USER_CANCLE = 2;
    public static final int OTA_TIMECOUNT_CTL_USER_CONFIRM = 1;
    public static final int OTA_TIMECOUNT_CTL_USER_DO_NOTHING = 3;
    public static final int OTA_TIMECOUNT_CTL_USER_INVALID = 0;
    public static final int OTA_TIMECOUNT_STATE_ALLOW = 0;
    public static final int OTA_TIMECOUNT_STATE_NOT_ALLOW = 1;
    public static final int POWER_OFF_INFORM_INVALID = 0;
    public static final int POWER_OFF_INFORM_POWEROFF = 1;
    public static final int POWER_ON_FORBID_DISABLE = 2;
    public static final int POWER_ON_FORBID_ENABLE = 1;
    public static final int POWER_ON_FORBID_INVALID = 0;
    public static final int SEND_ECU_IDS_PURPOSE_FAULTCODE = 3;
    public static final int SEND_ECU_IDS_PURPOSE_SOFTCODE = 2;
    public static final int SEND_ECU_IDS_PURPOSE_VERSION_INFO = 1;
    public static final int START_REBOOT_RECOVERY = 1;
    public static final int SYNC_MCU_STATE_DONE = 1;
    public static final int SYNC_MCU_STATE_INVALID = 0;
    protected static final String TAG = "BYDAutoOTAdevice";

    BYDAutoOtaDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.ota.BYDAutoOtaDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, float value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.ota.AbsBYDAutoOtaListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.ota.AbsBYDAutoOtaListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.ota.AbsBYDAutoOtaListener l) { throw new RuntimeException("Stub!"); }
}
