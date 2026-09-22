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

    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int FinishOTA() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int StartOTA() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_BATTERY_POWER_VOLTAGE} (0x43400028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getBatteryPowerVoltage() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_BATTERY_VOLTAGE} (0x44900018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getBatteryVoltage() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_CMD_CAN_INFO} (0x0007b6c3).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public byte[] getCanInfo() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_DISCHARGE_MAIN_CONTACTOR_STATE} (0x34400010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDischargeMainContactorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_CMD_ECU_SOFTCODE} (0x0003eafb).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public byte[] getECUSoftcode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_CMD_ECU_VER} (0x00026783).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public byte[] getECUVersion() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_CMD_ECU_VER_SOFTCODE} (0x99000053).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public byte[] getECUVersionAndSoftcode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_CMD_ECU_GET_FAULTCODE} (0x000caf3b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public byte[] getFaultCodeInfo() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.ota.BYDAutoOtaDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_LF_DOOR_LOCK} (0x40700008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLFDoorLockState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_LOCAL_DIAG_STATUS} (0x4f200808).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLocalDiagStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_CMD_MCU_DATA} (0x9900003d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public byte[] getMCUVersionAndSoftcode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_CMD_ACK} (0x00027f13).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public byte[] getOTAInfoACK() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_STATE} (0x43400030).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getOTAState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_TIMECOUNT_STATE} (0x05500008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getOTATimecountState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_POWERON_FORBID} (0x12d0001f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerOnForbidState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code OTA_POWEROFF_INFORM} (0x12d00026).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPoweroffInform() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int notifyTargetID(byte[] id) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int notifyTargetID2(byte[] channelAndId) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, float value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryECUVersionAndSoftcode(byte[] ids) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryMCUVersionAndSoftcode(byte[] ids) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.ota.AbsBYDAutoOtaListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.ota.AbsBYDAutoOtaListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendECUIds(int purpose, byte[] ids) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendECUIds2(int purpose, byte[] ids) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendMonitorTable(byte[] id) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendOTACtlCMD(android.hardware.bydauto.ota.OTAControlCMD controlCmd) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendOTAData(byte[] data) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendOTAData2(byte[] channelAndData) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendOTAServiceData(byte[] data) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendOTATimecountCtlCMD(int install, int user, int hour, int minute) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code OTA_CAN_INFO_SWITCH_STATE_SET} (0x0004229e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setCanInfoSwitchState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code OTA_SET_MCU_MESSAGE_SET} (0xaa00010f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setMcuMessage(int message) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code OTA_UPGRADE_INFO_SET} (0x49a00418).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setPowerOnForbidState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code OTA_SCREEN_CTL_SET} (0x0000ae52).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setScreenState(int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int syncMcuState() { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.ota.AbsBYDAutoOtaListener l) { throw new RuntimeException("Stub!"); }
}
