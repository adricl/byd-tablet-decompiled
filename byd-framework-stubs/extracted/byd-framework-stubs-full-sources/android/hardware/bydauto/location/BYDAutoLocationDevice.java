package android.hardware.bydauto.location;

/** Permissions: {@code android.permission.BYDAUTO_LOCATION_GET}, {@code android.permission.BYDAUTO_LOCATION_SET} */
public final class BYDAutoLocationDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final double LOCATION_ALTITUDE_INVALID = 8001.0d;
    public static final double LOCATION_ALTITUDE_MAX = 8000.0d;
    public static final double LOCATION_ALTITUDE_MIN = -8000.0d;
    public static final int LOCATION_COMMAND_BUSY = -2147482647;
    public static final int LOCATION_COMMAND_FAILED = -2147482648;
    public static final int LOCATION_COMMAND_INVALID_VALUE = -2147482645;
    public static final int LOCATION_COMMAND_SUCCESS = 0;
    public static final int LOCATION_COMMAND_TIMEOUT = -2147482646;
    public static final int LOCATION_FIXPOSITION_FAIL = 0;
    public static final int LOCATION_FIXPOSITION_SUCCESS = 1;
    public static final int LOCATION_GPS_SPEED_MAX = 240;
    public static final int LOCATION_GPS_SPEED_MIN = 0;
    public static final double LOCATION_LATITUDE_MAX = 90.0d;
    public static final double LOCATION_LATITUDE_MIN = 0.0d;
    public static final int LOCATION_LATITUDE_TYPE_NORTH = 2;
    public static final int LOCATION_LATITUDE_TYPE_SOUTH = 1;
    public static final double LOCATION_LONGITUDE_MAX = 180.0d;
    public static final double LOCATION_LONGITUDE_MIN = 0.0d;
    public static final int LOCATION_LONGITUDE_TYPE_EAST = 1;
    public static final int LOCATION_LONGITUDE_TYPE_WEST = 2;
    public static final float LOCATION_ORIENTATION_INVALID = 360.0f;
    public static final float LOCATION_ORIENTATION_MAX = 359.0f;
    public static final float LOCATION_ORIENTATION_MIN = 0.0f;
    protected static final String TAG = "BYDAutoLocationDevice";
    public static final int VISIBLE_SATELLITE_NUMBER_MAX = 50;
    public static final int VISIBLE_SATELLITE_NUMBER_MIN;
    static {
        VISIBLE_SATELLITE_NUMBER_MIN = 0;
    }

    BYDAutoLocationDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.location.BYDAutoLocationDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code LOCATION_LONGITUDE_TYPE} (0x000c4a3c), {@code LOCATION_LONGITUDE_VALUE} (0x000ebbe0), {@code LOCATION_LATITUDE_TYPE} (0x000cee2c), {@code LOCATION_LATITUDE_VALUE} (0x0004bf2f), {@code LOCATION_FIXPOSITION} (0x00038e80), {@code LOCATION_ORIENTATION} (0x0009c1d0), {@code LOCATION_ALTITUDE} (0x000a8405).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double[] getLocationLongitudeLatitudeValue() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, float value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.location.AbsBYDAutoLocationListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.location.AbsBYDAutoLocationListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code LOCATION_LATITUDE_TYPE_SET} (0x2d40000f), {@code LOCATION_LATITUDE_DECIMAL_SET} (0x2d400008), {@code LOCATION_LATITUDE_INT_SET} (0x2d400010), {@code LOCATION_LONGITUDE_TYPE_SET} (0x2d40001f), {@code LOCATION_LONGITUDE_DECIMAL_SET} (0x2d400018), {@code LOCATION_LONGITUDE_INT_SET} (0x2d400020), {@code LOCATION_LATITUDE_VALUE_SET} (0x3d500008), {@code LOCATION_LONGITUDE_VALUE_SET} (0x3d500028), {@code LOCATION_GPS_SPPED_SET} (0x3b700008), {@code LOCATION_VISIBLE_SATELLITE_NUMBER_SET} (0x3b700010), {@code LOCATION_FIXPOSITION_SET} (0x2d400047), {@code LOCATION_ORIENTATION_SET} (0x2d400028), {@code LOCATION_ALTITUDE_DIRECTION_SET} (0x2d400046), {@code LOCATION_ALTITUDE_DECIMAL_SET} (0x2d400034), {@code LOCATION_ALTITUDE_INT_SET} (0x2d400038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setLocationInfo(int longitude, double longitudeValue, int latitude, double latitudeValue, int fixposition, float orientation, double altitude, int gpsSpeed, int satellitesNumber) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.location.AbsBYDAutoLocationListener l) { throw new RuntimeException("Stub!"); }
}
