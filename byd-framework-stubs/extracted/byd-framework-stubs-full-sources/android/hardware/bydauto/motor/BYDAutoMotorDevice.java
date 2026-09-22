package android.hardware.bydauto.motor;

/** Permissions: {@code android.permission.BYDAUTO_MOTOR_GET}, {@code android.permission.BYDAUTO_MOTOR_SET} */
public final class BYDAutoMotorDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final double MOTOR_ANGLE_MAX = 359.9d;
    public static final double MOTOR_ANGLE_MIN = 0.0d;
    public static final int MOTOR_ANGLE_VALUE = 0;
    public static final int MOTOR_COMMAND_BUSY = -2147482647;
    public static final int MOTOR_COMMAND_FAILED = -2147482648;
    public static final int MOTOR_COMMAND_INVALID = -2147482645;
    public static final int MOTOR_COMMAND_SUCCESS = 0;
    public static final int MOTOR_COMMAND_TIMEOUT = -2147482646;
    public static final int MOTOR_OFF = 0;
    public static final int MOTOR_ON = 1;
    public static final int MOTOR_POS_MAX = 500;
    public static final int MOTOR_POS_MIN = -500;
    public static final int MOTOR_SPEED_VALUE = 0;
    public static final int MOTOR_STATE_ANTICLOCKWISE = 8;
    public static final int MOTOR_STATE_BACKWARD = 6;
    public static final int MOTOR_STATE_CLOCKWISE = 7;
    public static final int MOTOR_STATE_DOWNWARD = 2;
    public static final int MOTOR_STATE_FORWARD = 5;
    public static final int MOTOR_STATE_LEFT = 3;
    public static final int MOTOR_STATE_RIGHT = 4;
    public static final int MOTOR_STATE_STOP = 0;
    public static final int MOTOR_STATE_UPWARD = 1;
    protected static final String TAG = "BYDAutoMotorDevice";

    BYDAutoMotorDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.motor.BYDAutoMotorDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code MOTOR_ANGLE} (0x000a5fdc).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMotorAngle() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code MOTOR_STATE} (0x000b468f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMotorDirection() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code MOTOR_LOCK} (0x00037fd4).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMotorLock() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code MOTOR_POS} (0x0008a80f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMotorPosition() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code MOTOR_POWER_STATE} (0x00053d72).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMotorPower() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code MOTOR_SPEED} (0x000dcbc8).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMotorSpeed() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.motor.AbsBYDAutoMotorListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.motor.AbsBYDAutoMotorListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code MOTOR_STATE_SET} (0x00073db3).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setMotorDirection(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code MOTOR_LOCK_SET} (0x000a8bfc).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setMotorLock(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code MOTOR_POWER_STATE_SET} (0x00044b53).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setMotorPower(int state) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.motor.AbsBYDAutoMotorListener l) { throw new RuntimeException("Stub!"); }
}
