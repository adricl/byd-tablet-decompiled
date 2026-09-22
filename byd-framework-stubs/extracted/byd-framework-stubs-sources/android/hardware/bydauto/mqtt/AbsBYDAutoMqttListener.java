package android.hardware.bydauto.mqtt;

public abstract class AbsBYDAutoMqttListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoMqttListener";

    public AbsBYDAutoMqttListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
}
