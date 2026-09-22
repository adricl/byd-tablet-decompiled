package android.hardware.bydauto.power;

public abstract class AbsBYDAutoPowerListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoPowerListener";

    public AbsBYDAutoPowerListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onPowerCtlStatusChanged(int event_type, int value) { throw new RuntimeException("Stub!"); }
}
