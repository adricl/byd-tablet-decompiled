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

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.version.BYDAutoVersionDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.version.AbsBYDAutoVersionListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.version.AbsBYDAutoVersionListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.version.AbsBYDAutoVersionListener l) { throw new RuntimeException("Stub!"); }
}
