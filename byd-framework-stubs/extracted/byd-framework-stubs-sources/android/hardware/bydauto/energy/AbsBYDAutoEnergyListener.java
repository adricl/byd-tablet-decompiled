package android.hardware.bydauto.energy;

public abstract class AbsBYDAutoEnergyListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoEnergyListener";

    public AbsBYDAutoEnergyListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onEnergyModeChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onOperationModeChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onPowerGenerationStateChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onPowerGenerationValueChanged(int value) { throw new RuntimeException("Stub!"); }
    public void onRoadSurfaceChanged(int type) { throw new RuntimeException("Stub!"); }
}
