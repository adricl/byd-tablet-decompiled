package android.hardware.bydauto.tyre;

public abstract class AbsBYDAutoTyreListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoTyreListener";

    public AbsBYDAutoTyreListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onTyreAirLeakStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onTyreBatteryStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onTyrePressureStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onTyrePressureValueChanged(int area, int value) { throw new RuntimeException("Stub!"); }
    public void onTyreSignalStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onTyreSystemStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onTyreTemperatureStateChanged(int state) { throw new RuntimeException("Stub!"); }
}
