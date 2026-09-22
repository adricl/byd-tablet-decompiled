package android.hardware.bydauto.dtc;

/** Permissions: {@code android.permission.BYDAUTO_DTC_GET}, {@code android.permission.BYDAUTO_DTC_SET} */
public final class BYDAutoDtcDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int DTC_COMMAND_BUSY = -2147482647;
    public static final int DTC_COMMAND_FAILED = -2147482648;
    public static final int DTC_COMMAND_INVALID_VALUE = -2147482645;
    public static final int DTC_COMMAND_SUCCESS = 0;
    public static final int DTC_COMMAND_TIMEOUT = -2147482646;
    protected static final String TAG = "BYDAutoDtcDevice";

    BYDAutoDtcDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.dtc.BYDAutoDtcDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
}
