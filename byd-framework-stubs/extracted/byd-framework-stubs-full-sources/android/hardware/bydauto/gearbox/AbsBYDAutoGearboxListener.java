package android.hardware.bydauto.gearbox;

public abstract class AbsBYDAutoGearboxListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoGearboxListener";

    public AbsBYDAutoGearboxListener() { throw new RuntimeException("Stub!"); }

    public void onBrakeFluidLevelChanged(int level) { throw new RuntimeException("Stub!"); }
    public void onBrakePedalStateChanged(int level) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onCurrentGearChanged(int gear) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onEPBStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onGearboxAutoModeTypeChanged(int level) { throw new RuntimeException("Stub!"); }
    public void onGearboxManualModeLevelChanged(int level) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onGearboxStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onParkBrakeSwitchChanged(int level) { throw new RuntimeException("Stub!"); }
}
