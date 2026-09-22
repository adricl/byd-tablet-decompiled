package android.hardware.bydauto.special;

/** Permissions: {@code android.permission.BYDAUTO_SPECIAL_GET}, {@code android.permission.BYDAUTO_SPECIAL_SET} */
public final class BYDAutoSpecialDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int SPECIAL_COMMAND_BUSY = -2147482647;
    public static final int SPECIAL_COMMAND_FAILED = -2147482648;
    public static final int SPECIAL_COMMAND_INVALID_VALUE = -2147482645;
    public static final int SPECIAL_COMMAND_SUCCESS = 0;
    public static final int SPECIAL_COMMAND_TIMEOUT = -2147482646;
    protected static final String TAG = "BYDAutoSpecialDevice";

    BYDAutoSpecialDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.special.BYDAutoSpecialDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SPECIAL_CMD_WHEEL_DIECTION} (0x99000058). */
    public byte[] getWheelDirection() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SPECIAL_CMD_WHEEL_SPEED} (0x99000059). */
    public byte[] getWheelSpeed() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.special.AbsBYDAutoSpecialListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.special.AbsBYDAutoSpecialListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.special.AbsBYDAutoSpecialListener l) { throw new RuntimeException("Stub!"); }
}
