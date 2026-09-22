package android.hardware.bydauto.qcfs;

/** Permissions: {@code android.permission.BYDAUTO_QCFS_GET}, {@code android.permission.BYDAUTO_QCFS_SET} */
public final class BYDAutoQcfsDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int AFTER_DOWNLOAD_UPGRADE_NO = 12;
    public static final int AFTER_DOWNLOAD_UPGRADE_NOW_YES = 11;
    public static final int AFTER_DOWNLOAD_UPGRADE_RESERVE = 13;
    public static final int BEFORE_DOWNLOAD_UPGRADE_NO = 2;
    public static final int BEFORE_DOWNLOAD_UPGRADE_YES = 1;
    public static final int FS_FEEDBACK_FAKEOK_ENTERING = 1;
    public static final int FS_FEEDBACK_TRUE = 0;
    public static final int QCFS_COMMAND_BUSY = -2147482647;
    public static final int QCFS_COMMAND_FAILED = -2147482648;
    public static final int QCFS_COMMAND_INVALID_VALUE = -2147482645;
    public static final int QCFS_COMMAND_SUCCESS = 0;
    public static final int QCFS_COMMAND_TIMEOUT = -2147482646;
    public static final int QCFS_WAIT_UPGRADE_NO = 0;
    public static final int QCFS_WAIT_UPGRADE_YES = 1;
    public static final int QC_REBOOT_CONFIRM_UPGRADE_END = 4;
    public static final int QC_UPGRADE_BEGIN = 2;
    public static final int QC_UPGRADE_END = 3;
    public static final int QC_WILL_GOTO_RECOVERY = 1;
    public static final int SECURE_IC_UPGRADE_BEGIN = 1;
    public static final int SECURE_IC_UPGRADE_END = 2;
    public static final int SECURE_IC_UPGRADE_ERROR = 3;
    public static final int SEND_KEY = 3;
    public static final int SEND_KEY_BEGIN = 1;
    public static final int SEND_KEY_END = 2;
    protected static final String TAG = "BYDAutoQcfsDevice";

    BYDAutoQcfsDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.qcfs.BYDAutoQcfsDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int qurCondNewVer(byte[] value) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int qurCondRcvKey() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int qurCondUpgrade() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int qurEcuVersion() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int qurFsCondFakeok() { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.qcfs.AbsBYDAutoQcfsListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.qcfs.AbsBYDAutoQcfsListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int reqSpecifiedEcuVersion(byte[] ecudid) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendKeyToFs(byte[] key) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code FS_STATUS_ALL_SET} (0x000b02e9).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAllUpgradeStatus(byte[] state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code FS_STATUS_QC_SET} (0x000f4abe).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setQcomUpgradeStatus(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code FS_STATUS_SECURE_IC_SET} (0x000905ff).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setSecureIcUpgradeStatus(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code FS_CONFIRM_SET} (0x000a1800).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setUserConfirm(int value) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.qcfs.AbsBYDAutoQcfsListener l) { throw new RuntimeException("Stub!"); }
}
