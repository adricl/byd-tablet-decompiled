package android.hardware.bydauto.energy;

public abstract class AbsBYDAutoEnergyListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoEnergyListener";

    public AbsBYDAutoEnergyListener() { throw new RuntimeException("Stub!"); }

    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onBCMStateChanged(int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onDCWorkModeChanged(int state) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onEnergyModeChanged(int mode) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onEnergyStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onOperationModeChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onPowerGenerationStateChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onPowerGenerationValueChanged(int value) { throw new RuntimeException("Stub!"); }
    public void onRoadSurfaceChanged(int type) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onRoadSurfaceKindChanged(int type) { throw new RuntimeException("Stub!"); }
}
