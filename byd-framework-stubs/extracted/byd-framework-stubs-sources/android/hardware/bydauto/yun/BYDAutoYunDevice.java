package android.hardware.bydauto.yun;

/** Permissions: {@code android.permission.BYDAUTO_YUN_GET} */
public final class BYDAutoYunDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    protected static final String TAG = "BYDAutoYunDevice";
    public static final int YUN_COMMAND_BUSY = -2147482647;
    public static final int YUN_COMMAND_FAILED = -2147482648;
    public static final int YUN_COMMAND_INVALID_VALUE = -2147482645;
    public static final int YUN_COMMAND_SUCCESS = 0;
    public static final int YUN_COMMAND_TIMEOUT = -2147482646;

    BYDAutoYunDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.yun.BYDAutoYunDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.yun.AbsBYDAutoYunListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.yun.AbsBYDAutoYunListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.yun.AbsBYDAutoYunListener l) { throw new RuntimeException("Stub!"); }
}
