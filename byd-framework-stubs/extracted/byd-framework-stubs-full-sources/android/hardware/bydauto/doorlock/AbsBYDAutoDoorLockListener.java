package android.hardware.bydauto.doorlock;

public abstract class AbsBYDAutoDoorLockListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoDoorLockListener";

    public AbsBYDAutoDoorLockListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onDoorLockStatusChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
}
