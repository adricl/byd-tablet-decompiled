package android.hardware.bydauto.sensor;

public abstract class AbsBYDAutoSensorListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoSensorListener";

    public AbsBYDAutoSensorListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onLightIntensityChanged(int value) { throw new RuntimeException("Stub!"); }
}
