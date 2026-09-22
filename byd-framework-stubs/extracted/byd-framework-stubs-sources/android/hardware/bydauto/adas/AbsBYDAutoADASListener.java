package android.hardware.bydauto.adas;

public abstract class AbsBYDAutoADASListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoADASListener";

    public AbsBYDAutoADASListener() { throw new RuntimeException("Stub!"); }

    public void onAEBStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onAVHStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onBSDStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onESPStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onFeatureChanged(String feature, int ifHas) { throw new RuntimeException("Stub!"); }
    public void onHMAStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onIboosterStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onLDSWTypeChanged(int type) { throw new RuntimeException("Stub!"); }
    public void onLKSModeChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onLKSSensitivityChanged(int sensitivity) { throw new RuntimeException("Stub!"); }
    public void onPCWStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onSLAStateChanged(int state) { throw new RuntimeException("Stub!"); }
}
