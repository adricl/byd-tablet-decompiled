package android.hardware.bydauto.wiper;

public abstract class AbsBYDAutoWiperListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoWiperListener";

    public AbsBYDAutoWiperListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onWindscreenWiperRelayStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onWindscreenWiperResetStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onWindscreenWiperSensitivityChanged(int value) { throw new RuntimeException("Stub!"); }
}
