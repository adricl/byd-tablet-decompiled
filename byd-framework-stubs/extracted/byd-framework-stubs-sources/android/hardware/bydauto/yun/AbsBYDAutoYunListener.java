package android.hardware.bydauto.yun;

public abstract class AbsBYDAutoYunListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoYunListener";

    public AbsBYDAutoYunListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
}
