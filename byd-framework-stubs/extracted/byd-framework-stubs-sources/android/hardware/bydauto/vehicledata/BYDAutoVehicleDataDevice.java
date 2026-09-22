package android.hardware.bydauto.vehicledata;

/** Permissions: {@code android.permission.BYDAUTO_VEHICLE_DATA_GET}, {@code android.permission.BYDAUTO_VEHICLE_DATA_SET} */
public final class BYDAutoVehicleDataDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int DATA_TYPE_BIG_DATA = 3;
    public static final int DATA_TYPE_GB = 2;
    public static final int DATA_TYPE_MQTT = 5;
    public static final int DATA_TYPE_OTA = 1;
    public static final int DATA_TYPE_YUN = 4;
    protected static final String TAG = "BYDAutoVehicleDataDevice";
    public static final int VEHICLE_DATA_COMMAND_BUSY = -2147482647;
    public static final int VEHICLE_DATA_COMMAND_FAILED = -2147482648;
    public static final int VEHICLE_DATA_COMMAND_INVALID_VALUE = -2147482645;
    public static final int VEHICLE_DATA_COMMAND_SUCCESS = 0;
    public static final int VEHICLE_DATA_COMMAND_TIMEOUT = -2147482646;

    BYDAutoVehicleDataDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.vehicledata.BYDAutoVehicleDataDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.vehicledata.AbsBYDAutoVehicleDataListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.vehicledata.AbsBYDAutoVehicleDataListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.vehicledata.AbsBYDAutoVehicleDataListener l) { throw new RuntimeException("Stub!"); }
}
