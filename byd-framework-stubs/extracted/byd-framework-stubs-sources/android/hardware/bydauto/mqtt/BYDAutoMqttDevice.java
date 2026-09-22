package android.hardware.bydauto.mqtt;

/** Permissions: {@code android.permission.BYDAUTO_MQTT_GET}, {@code android.permission.BYDAUTO_MQTT_SET} */
public final class BYDAutoMqttDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int MQTT_COMMAND_BUSY = -2147482647;
    public static final int MQTT_COMMAND_FAILED = -2147482648;
    public static final int MQTT_COMMAND_INVALID_VALUE = -2147482645;
    public static final int MQTT_COMMAND_SUCCESS = 0;
    public static final int MQTT_COMMAND_TIMEOUT = -2147482646;
    protected static final String TAG = "BYDAutoMqttDevice";

    BYDAutoMqttDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.mqtt.BYDAutoMqttDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.mqtt.AbsBYDAutoMqttListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.mqtt.AbsBYDAutoMqttListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.mqtt.AbsBYDAutoMqttListener l) { throw new RuntimeException("Stub!"); }
}
