package android.hardware.bydauto.collision;

/** Permissions: {@code android.permission.BYDAUTO_COLLISION_GET}, {@code android.permission.BYDAUTO_COLLISION_SET} */
public final class BYDAutoCollisionDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int COLLISION_COMMAND_BUSY = -2147482647;
    public static final int COLLISION_COMMAND_FAILED = -2147482648;
    public static final int COLLISION_COMMAND_INVALID_VALUE = -2147482645;
    public static final int COLLISION_COMMAND_SUCCESS = 0;
    public static final int COLLISION_COMMAND_TIMEOUT = -2147482646;
    public static final int COLLISION_SIGNAL = 2;
    public static final int NORMAL_SIGNAL = 1;
    protected static final String TAG = "BYDAutoCollisionDevice";

    BYDAutoCollisionDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code COLLISION_STATE_S} (0x000235b8).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public byte[] getCollisionInfo() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.collision.BYDAutoCollisionDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.collision.AbsBYDAutoCollisionListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.collision.AbsBYDAutoCollisionListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.collision.AbsBYDAutoCollisionListener l) { throw new RuntimeException("Stub!"); }
}
