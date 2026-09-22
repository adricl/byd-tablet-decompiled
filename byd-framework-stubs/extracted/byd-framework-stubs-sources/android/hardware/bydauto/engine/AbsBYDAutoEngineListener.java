package android.hardware.bydauto.engine;

public abstract class AbsBYDAutoEngineListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoEngineListener";

    public AbsBYDAutoEngineListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onEngineCoolantLevelChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onEngineSpeedChanged(int value) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onOilLevelChanged(int value) { throw new RuntimeException("Stub!"); }
}
