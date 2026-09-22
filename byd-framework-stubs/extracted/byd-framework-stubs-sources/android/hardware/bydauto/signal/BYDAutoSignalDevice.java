package android.hardware.bydauto.signal;

/** Permissions: {@code android.permission.BYDAUTO_SIGNAL_SET} */
public final class BYDAutoSignalDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int SIGNAL_COMMAND_BUSY = -2147482647;
    public static final int SIGNAL_COMMAND_FAILED = -2147482648;
    public static final int SIGNAL_COMMAND_INVALID_VALUE = -2147482645;
    public static final int SIGNAL_COMMAND_SUCCESS = 0;
    public static final int SIGNAL_COMMAND_TIMEOUT = -2147482646;
    public static final int SIGNAL_STATUS_NORMAL = 1;
    public static final int SIGNAL_STATUS_WORSE = 2;
    protected static final String TAG = "BYDAutoSignaldevice";

    BYDAutoSignalDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.signal.BYDAutoSignalDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SIGNAL_STATUS_SET} (0x00024306). */
    public int setSignalStatus(int value) { throw new RuntimeException("Stub!"); }
}
