package android.hardware.bydauto.auxiliary;

/** Permissions: {@code android.permission.BYDAUTO_AUX_GET}, {@code android.permission.BYDAUTO_AUX_SET} */
public final class BYDAutoAuxDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int AUX_COMMAND_BUSY = -2147482647;
    public static final int AUX_COMMAND_FAILED = -2147482648;
    public static final int AUX_COMMAND_INVALID_VALUE = -2147482645;
    public static final int AUX_COMMAND_SUCCESS = 0;
    public static final int AUX_COMMAND_TIMEOUT = -2147482646;
    public static final int AUX_CONNECTED = 1;
    public static final int AUX_DISCONNECTED = 0;
    public static final int AUX_NO_SIGNAL = 0;
    public static final int AUX_SIGNAL = 1;
    protected static final String TAG = "BYDAutoAuxDevice";

    BYDAutoAuxDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.auxiliary.BYDAutoAuxDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.auxiliary.AbsBYDAutoAuxListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.auxiliary.AbsBYDAutoAuxListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.auxiliary.AbsBYDAutoAuxListener l) { throw new RuntimeException("Stub!"); }
}
