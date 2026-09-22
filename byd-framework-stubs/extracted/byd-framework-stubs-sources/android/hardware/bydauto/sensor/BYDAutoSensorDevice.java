package android.hardware.bydauto.sensor;

/** Permissions: {@code android.permission.BYDAUTO_SENSOR_GET}, {@code android.permission.BYDAUTO_SENSOR_SET} */
public final class BYDAutoSensorDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int AUTO_SLOPE_MAX = 60;
    public static final int AUTO_SLOPE_MIN = -60;
    public static final int AX_223 = 1;
    public static final int AX_OFFSET_223 = 2;
    public static final int G_SENSOR_OR_ANGLE_MAX = 359;
    public static final int G_SENSOR_OR_ANGLE_MIN = 0;
    public static final double HUMIDITY_MAX = 100.0d;
    public static final double HUMIDITY_MIN = 0.0d;
    public static final int LIGHT_INTENSITY_LEVEL1 = 1;
    public static final int LIGHT_INTENSITY_LEVEL2 = 2;
    public static final int LIGHT_INTENSITY_LEVEL3 = 3;
    public static final int LIGHT_INTENSITY_LEVEL4 = 4;
    public static final int LIGHT_INTENSITY_LEVEL5 = 5;
    public static final int SENSOR_AX_INVALID = 0;
    public static final int SENSOR_AX_VALID = 1;
    public static final int SENSOR_COMMAND_BUSY = -2147482647;
    public static final int SENSOR_COMMAND_FAILED = -2147482648;
    public static final int SENSOR_COMMAND_INVALID_VALUE = -2147482645;
    public static final int SENSOR_COMMAND_SUCCESS = 0;
    public static final int SENSOR_COMMAND_TIMEOUT = -2147482646;
    protected static final String TAG = "BYDAutoSensorDevice";
    public static final double TEMPERATURE_MAX = 125.0d;
    public static final double TEMPERATURE_MIN = -40.0d;

    BYDAutoSensorDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.sensor.BYDAutoSensorDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SENSOR_LIGHT} (0x12d00014). */
    public int getLightIntensity() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, float value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.sensor.AbsBYDAutoSensorListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.sensor.AbsBYDAutoSensorListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.sensor.AbsBYDAutoSensorListener l) { throw new RuntimeException("Stub!"); }
}
