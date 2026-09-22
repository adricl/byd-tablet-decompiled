package android.hardware.bydauto.motor;

public abstract class AbsBYDAutoMotorListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoMotorListener";

    public AbsBYDAutoMotorListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onMotorAngleChanged(int angle) { throw new RuntimeException("Stub!"); }
    public void onMotorDirectionChanged(int direction) { throw new RuntimeException("Stub!"); }
    public void onMotorLockChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onMotorPositionChanged(int position) { throw new RuntimeException("Stub!"); }
    public void onMotorPowerChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onMotorSpeedChanged(int speed) { throw new RuntimeException("Stub!"); }
}
