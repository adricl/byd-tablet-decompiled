package android.hardware.bydauto.rescue;

public abstract class AbsBYDAutoRescueListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoRescueListener";

    public AbsBYDAutoRescueListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onInfoFromMCUChanged(int info) { throw new RuntimeException("Stub!"); }
}
