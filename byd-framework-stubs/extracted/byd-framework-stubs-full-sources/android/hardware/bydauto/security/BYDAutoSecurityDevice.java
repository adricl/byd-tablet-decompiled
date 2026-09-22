package android.hardware.bydauto.security;

/** Permissions: {@code android.permission.BYDAUTO_SECURITY_GET} */
public final class BYDAutoSecurityDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int SECURITY_COMMAND_BUSY = -2147482647;
    public static final int SECURITY_COMMAND_FAILED = -2147482648;
    public static final int SECURITY_COMMAND_SUCCESS = 0;
    public static final int SECURITY_COMMAND_TIMEOUT = -2147482646;
    public static final int SECURITY_STATE_SAFE = 0;
    public static final int SECURITY_STATE_WARNING = 1;
    protected static final String TAG = "BYDAutoSecurityDevice";

    BYDAutoSecurityDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.security.BYDAutoSecurityDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SECURITY_STATE_S} (0x000b6bdb).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public byte[] getSecurityState() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.security.AbsBYDAutoSecurityListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.security.AbsBYDAutoSecurityListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.security.AbsBYDAutoSecurityListener l) { throw new RuntimeException("Stub!"); }
}
