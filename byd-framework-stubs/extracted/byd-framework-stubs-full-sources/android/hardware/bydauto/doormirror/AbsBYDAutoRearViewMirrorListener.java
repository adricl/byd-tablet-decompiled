package android.hardware.bydauto.doormirror;

public abstract class AbsBYDAutoRearViewMirrorListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDRearViewMirrorListener";

    public AbsBYDAutoRearViewMirrorListener() { throw new RuntimeException("Stub!"); }

    public void onAutoExternalRearMirrorAntiglareStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onAutoExternalRearMirrorStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
}
