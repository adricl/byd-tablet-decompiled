package android.hardware.bydauto.collision;

public abstract class AbsBYDAutoCollisionListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoCollisionListener";

    public AbsBYDAutoCollisionListener() { throw new RuntimeException("Stub!"); }

    public void onCollisionSignalStateChanged(byte[] collisionInfo) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
}
