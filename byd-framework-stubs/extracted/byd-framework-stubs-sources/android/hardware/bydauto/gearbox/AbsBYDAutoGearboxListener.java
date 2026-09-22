package android.hardware.bydauto.gearbox;

public abstract class AbsBYDAutoGearboxListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoGearboxListener";

    public AbsBYDAutoGearboxListener() { throw new RuntimeException("Stub!"); }

    public void onBrakeFluidLevelChanged(int level) { throw new RuntimeException("Stub!"); }
    public void onBrakePedalStateChanged(int level) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onGearboxAutoModeTypeChanged(int level) { throw new RuntimeException("Stub!"); }
    public void onGearboxManualModeLevelChanged(int level) { throw new RuntimeException("Stub!"); }
    public void onParkBrakeSwitchChanged(int level) { throw new RuntimeException("Stub!"); }
}
