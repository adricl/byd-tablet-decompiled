package android.hardware.bydauto.auxiliary;

public abstract class AbsBYDAutoAuxListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoAuxListener";

    public AbsBYDAutoAuxListener() { throw new RuntimeException("Stub!"); }

    public void onAuxConnectStatusChanged(int value) { throw new RuntimeException("Stub!"); }
    public void onAuxSignalStatusChanged(int value) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
}
