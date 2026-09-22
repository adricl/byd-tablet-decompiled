package android.hardware.bydauto.tyre;

/** Permissions: {@code android.permission.BYDAUTO_TYRE_GET}, {@code android.permission.BYDAUTO_TYRE_SET} */
public final class BYDAutoTyreDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int DEVICE_HAS_THE_FEATURE = 1;
    public static final int DEVICE_NOT_HAS_THE_FEATURE = 0;
    public static final int DEVICE_THE_FEATURE_LINK_ERROR = 65535;
    public static final int DEVICE_THE_FEATURE_NEVER_GET = 2;
    public static final String FEATURE_INDIRECT_TYRE_PRESSURE_DISPLAY = "IndirectTyrePressureDisplay";
    public static final String FEATURE_INDIRECT_TYRE_PRESSURE_ONLINE = "IndirectTyrePressureMonitor";
    public static final String FEATURE_TYRE_PRESSURE_ONLINE = "TyrePressureMonitor";
    public static final int INDIRECT_TYRE_PRESSURE_CONFIRM = 1;
    public static final int INDITECT_TYRE_SYSTEM_RESETTING = 1;
    public static final int INDITECT_TYRE_SYSTEM_RESET_FAILED = 3;
    public static final int INDITECT_TYRE_SYSTEM_RESET_SUCCESS = 2;
    protected static final String TAG = "BYDAutoTyreDevice";
    public static final int TYRE_AIR_LEAK_STATE_NORMAL = 0;
    public static final int TYRE_AIR_LEAK_STATE_QUICK = 1;
    public static final int TYRE_AIR_LEAK_STATE_SLOW = 2;
    public static final int TYRE_BATTERY_STATE_LOW = 1;
    public static final int TYRE_BATTERY_STATE_NORMAL = 0;
    public static final double TYRE_BATTERY_VOLTAGE_MAX = 40.0d;
    public static final double TYRE_BATTERY_VOLTAGE_MIN = 0.0d;
    public static final int TYRE_COMMAND_AREA_LEFT_FRONT = 1;
    public static final int TYRE_COMMAND_AREA_LEFT_REAR = 3;
    public static final int TYRE_COMMAND_AREA_RIGHT_FRONT = 2;
    public static final int TYRE_COMMAND_AREA_RIGHT_REAR = 4;
    public static final int TYRE_COMMAND_BUSY = -2147482647;
    public static final int TYRE_COMMAND_FAILED = -2147482648;
    public static final int TYRE_COMMAND_INVALID_VALUE = -2147482645;
    public static final int TYRE_COMMAND_SUCCESS = 0;
    public static final int TYRE_COMMAND_TIMEOUT = -2147482646;
    public static final int TYRE_PRESSURE_STATE_NORMAL = 0;
    public static final int TYRE_PRESSURE_STATE_OVERPRESSURE = 1;
    public static final int TYRE_PRESSURE_STATE_UNDERPRESSURE = 2;
    public static final int TYRE_PRESSURE_VALUE_MAX = 4094;
    public static final int TYRE_PRESSURE_VALUE_MIN = 0;
    public static final int TYRE_SIGNAL_STATE_ERROR = 1;
    public static final int TYRE_SIGNAL_STATE_NORMAL = 0;
    public static final int TYRE_SYSTEM_STATE_BREAKDOWN = 3;
    public static final int TYRE_SYSTEM_STATE_MASKED = 4;
    public static final int TYRE_SYSTEM_STATE_NORMAL = 0;
    public static final int TYRE_SYSTEM_STATE_SELF_CHECKING = 1;
    public static final int TYRE_SYSTEM_STATE_SIGNAL_ANOMAL = 2;
    public static final double TYRE_TEMPERATURE_MAX = 369.4d;
    public static final double TYRE_TEMPERATURE_MIN = -40.0d;
    public static final int TYRE_TEMPERATURE_STATE_HIGH = 2;
    public static final int TYRE_TEMPERATURE_STATE_NORMAL = 0;
    public static final int TYRE_TEMPERATURE_STATE_SLEEP = 3;
    public static final int TYRE_TEMPERATURE_STATE_SUPER_HIGH = 1;

    BYDAutoTyreDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.tyre.BYDAutoTyreDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code TYRE_AIR_LEAK_STATE_LEFT_FRONT} (0x99000122), {@code TYRE_AIR_LEAK_STATE_RIGHT_FRONT} (0x99000126), {@code TYRE_AIR_LEAK_STATE_LEFT_REAR} (0x9900012a), {@code TYRE_AIR_LEAK_STATE_RIGHT_REAR} (0x9900012e). */
    public int getTyreAirLeakState(int area) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code TYRE_BATTERY_STATE} (0x3cd00046). */
    public int getTyreBatteryState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code TYRE_PRESSURE_STATE_LEFT_FRONT} (0x99000123), {@code TYRE_PRESSURE_STATE_RIGHT_FRONT} (0x99000127), {@code TYRE_PRESSURE_STATE_LEFT_REAR} (0x9900012b), {@code TYRE_PRESSURE_STATE_RIGHT_REAR} (0x9900012f). */
    public int getTyrePressureState(int area) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code TYRE_PRESSURE_VALUE_LEFT_FRONT} (0x99000124), {@code TYRE_PRESSURE_VALUE_RIGHT_FRONT} (0x99000128), {@code TYRE_PRESSURE_VALUE_LEFT_REAR} (0x9900012c), {@code TYRE_PRESSURE_VALUE_RIGHT_REAR} (0x99000130). */
    public int getTyrePressureValue(int area) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code TYRE_SIGNAL_STATE_LEFT_FRONT} (0x99000121), {@code TYRE_SIGNAL_STATE_RIGHT_FRONT} (0x99000125), {@code TYRE_SIGNAL_STATE_LEFT_REAR} (0x99000129), {@code TYRE_SIGNAL_STATE_RIGHT_REAR} (0x9900012d). */
    public int getTyreSignalState(int area) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code TYRE_SYSTEM_STATE} (0x3cd0000d). */
    public int getTyreSystemState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code TYRE_TEMPERATURE_STATE} (0x3cd00044). */
    public int getTyreTemperatureState() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.tyre.AbsBYDAutoTyreListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.tyre.AbsBYDAutoTyreListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.tyre.AbsBYDAutoTyreListener l) { throw new RuntimeException("Stub!"); }
}
