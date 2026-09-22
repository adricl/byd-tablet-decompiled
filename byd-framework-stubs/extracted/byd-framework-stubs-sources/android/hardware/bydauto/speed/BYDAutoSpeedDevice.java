package android.hardware.bydauto.speed;

/** Permissions: {@code android.permission.BYDAUTO_SPEED_GET}, {@code android.permission.BYDAUTO_SPEED_SET} */
public final class BYDAutoSpeedDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final double ACCELERATE_MAX = 31.0d;
    public static final double ACCELERATE_MIN = -30.0d;
    public static final int DATA_ACCELERATOR_DEPTH = 1;
    public static final int DATA_BRAKE_DEPTH = 2;
    public static final int DATA_FLAG_INVALID = 0;
    public static final int DATA_FLAG_VALID = 1;
    public static final int DATA_SPEED = 0;
    public static final int DEEP_PERSENT_MAX = 100;
    public static final int DEEP_PERSENT_MIN = 0;
    public static final double FUEL_ACCELERATE_MAX = 99.6d;
    public static final double FUEL_ACCELERATE_MIN = 0.0d;
    public static final int SPEED_COMMAND_BUSY = -2147482647;
    public static final int SPEED_COMMAND_FAILED = -2147482648;
    public static final int SPEED_COMMAND_INVALID = -2147482645;
    public static final int SPEED_COMMAND_SUCCESS = 0;
    public static final int SPEED_COMMAND_TIMEOUT = -2147482646;
    public static final double SPEED_MAX = 282.0d;
    public static final double SPEED_MIN = 0.0d;
    protected static final String TAG = "BYDAutoSpeedDevice";
    protected static int mAccFlag;
    protected static int mBrakeFlag;
    protected static int mSpeedFlag;

    BYDAutoSpeedDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /** Reads feature ID {@code SPEED_ACCELERATOR_S} (0x34200008). */
    public int getAccelerateDeepness() { throw new RuntimeException("Stub!"); }
    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SPEED_BRAKE_S} (0x34200010). */
    public int getBrakeDeepness() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SPEED_AUTO_SPEED} (0x94400008). */
    public double getCurrentSpeed() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.speed.BYDAutoSpeedDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, float value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.speed.AbsBYDAutoSpeedListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.speed.AbsBYDAutoSpeedListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.speed.AbsBYDAutoSpeedListener l) { throw new RuntimeException("Stub!"); }
}
