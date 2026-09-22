package android.hardware.bydauto.wiper;

/** Permissions: {@code android.permission.BYDAUTO_WIPER_GET}, {@code android.permission.BYDAUTO_WIPER_SET} */
public final class BYDAutoWiperDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    protected static final String TAG = "BYDAutoWiperDevice";
    public static final int WIPER_AREA_FRONT = 0;
    public static final int WIPER_AREA_REAR = 1;
    public static final int WIPER_COMMAND_BUSY = -2147482647;
    public static final int WIPER_COMMAND_FAILED = -2147482648;
    public static final int WIPER_COMMAND_INVALID = -2147482645;
    public static final int WIPER_COMMAND_SUCCESS = 0;
    public static final int WIPER_COMMAND_TIMEOUT = -2147482646;
    public static final int WIPER_RELAY_STATE_ACTUATION = 1;
    public static final int WIPER_RELAY_STATE_DISCONNECT = 2;
    public static final int WIPER_RELAY_STATE_INVALID = 0;
    public static final int WIPER_SENSITIVITY_1 = 1;
    public static final int WIPER_SENSITIVITY_2 = 2;
    public static final int WIPER_SENSITIVITY_3 = 3;
    public static final int WIPER_SENSITIVITY_4 = 4;
    public static final int WIPER_SENSITIVITY_INVALID = 0;
    public static final int WIPER_STATE_INVALID = 0;
    public static final int WIPER_STATE_NOT_RESET = 1;
    public static final int WIPER_STATE_RESET = 2;

    BYDAutoWiperDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.wiper.BYDAutoWiperDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code WIPER_RELAY_STATE} (0x4fb00026). */
    public int getWindscreenWiperRelayState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code WIPER_AREA_FRONT_STATE} (0x00083e7f), {@code WIPER_AREA_REAR_STATE} (0x4750000a). */
    public int getWindscreenWiperResetState(int area) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code WIPER_WINDSCREEN_WIPER_SENSITIVITY} (0x13300020). */
    public int getWindscreenWiperSensitivity() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.wiper.AbsBYDAutoWiperListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.wiper.AbsBYDAutoWiperListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.wiper.AbsBYDAutoWiperListener l) { throw new RuntimeException("Stub!"); }
}
