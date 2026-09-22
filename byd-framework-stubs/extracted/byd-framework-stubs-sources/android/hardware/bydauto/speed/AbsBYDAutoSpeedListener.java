package android.hardware.bydauto.speed;

public abstract class AbsBYDAutoSpeedListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoSpeedListener";

    public AbsBYDAutoSpeedListener() { throw new RuntimeException("Stub!"); }

    public void onAccelerateDeepnessChanged(int value) { throw new RuntimeException("Stub!"); }
    public void onAccelerateDeepnessChanged(int value, int flag) { throw new RuntimeException("Stub!"); }
    public void onBrakeDeepnessChanged(int value) { throw new RuntimeException("Stub!"); }
    public void onBrakeDeepnessChanged(int value, int flag) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onSpeedChanged(double value) { throw new RuntimeException("Stub!"); }
    public void onSpeedChanged(double value, int flag) { throw new RuntimeException("Stub!"); }
}
