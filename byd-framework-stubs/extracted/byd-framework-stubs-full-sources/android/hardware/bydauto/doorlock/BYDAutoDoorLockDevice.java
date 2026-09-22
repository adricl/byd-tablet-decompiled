package android.hardware.bydauto.doorlock;

/** Permissions: {@code android.permission.BYDAUTO_DOOR_LOCK_COMMON}, {@code android.permission.BYDAUTO_DOOR_LOCK_GET}, {@code android.permission.BYDAUTO_DOOR_LOCK_SET} */
public final class BYDAutoDoorLockDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int DOOR_LOCK_AREA_BACK = 5;
    public static final int DOOR_LOCK_AREA_CHILDLOCK_LEFT = 6;
    public static final int DOOR_LOCK_AREA_CHILDLOCK_RIGHT = 7;
    public static final int DOOR_LOCK_AREA_LEFT_FRONT = 1;
    public static final int DOOR_LOCK_AREA_LEFT_REAR = 2;
    public static final int DOOR_LOCK_AREA_RIGHT_FRONT = 3;
    public static final int DOOR_LOCK_AREA_RIGHT_REAR = 4;
    public static final int DOOR_LOCK_COMMAND_BUSY = -2147482647;
    public static final int DOOR_LOCK_COMMAND_FAILED = -2147482648;
    public static final int DOOR_LOCK_COMMAND_INVALID_VALUE = -2147482645;
    public static final int DOOR_LOCK_COMMAND_SUCCESS = 0;
    public static final int DOOR_LOCK_COMMAND_TIMEOUT = -2147482646;
    public static final int DOOR_LOCK_STATE_INVALID = 0;
    public static final int DOOR_LOCK_STATE_LOCK = 2;
    public static final int DOOR_LOCK_STATE_UNLOCK = 1;
    protected static final String TAG = "BYDAutoDoorLockDevice";

    BYDAutoDoorLockDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code DOOR_LOCK_COMMAND_AREA_CHILDLOCK_LEFT} (0x47500018), {@code DOOR_LOCK_COMMAND_AREA_CHILDLOCK_RIGHT} (0x49400024), {@code DOOR_LOCK_COMMAND_AREA_LEFT_FRONT} (0x39400034), {@code DOOR_LOCK_COMMAND_AREA_LEFT_REAR} (0x39400038), {@code DOOR_LOCK_COMMAND_AREA_RIGHT_FRONT} (0x39400036), {@code DOOR_LOCK_COMMAND_AREA_RIGHT_REAR} (0x3940003a), {@code DOOR_LOCK_COMMAND_AREA_BACK} (0x3940003c). */
    public int getDoorLockStatus(int area) { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.doorlock.BYDAutoDoorLockDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.doorlock.AbsBYDAutoDoorLockListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.doorlock.AbsBYDAutoDoorLockListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.doorlock.AbsBYDAutoDoorLockListener l) { throw new RuntimeException("Stub!"); }
}
