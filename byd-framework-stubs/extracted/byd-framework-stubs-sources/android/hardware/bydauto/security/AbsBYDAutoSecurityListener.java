package android.hardware.bydauto.security;

public abstract class AbsBYDAutoSecurityListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoSecurityListener";

    public AbsBYDAutoSecurityListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onSecurityStateChanged(byte[] state) { throw new RuntimeException("Stub!"); }
}
