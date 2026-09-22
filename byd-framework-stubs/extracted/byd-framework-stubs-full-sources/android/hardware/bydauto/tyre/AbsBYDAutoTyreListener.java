package android.hardware.bydauto.tyre;

public abstract class AbsBYDAutoTyreListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoTyreListener";

    public AbsBYDAutoTyreListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onFeatureChanged(String feature, int ifHas) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onIndirectTyreSystemStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onTyreAirLeakStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onTyreBatteryStateChanged(int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onTyreBatteryValueChanged(int area, double value) { throw new RuntimeException("Stub!"); }
    public void onTyrePressureStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onTyrePressureValueChanged(int area, int value) { throw new RuntimeException("Stub!"); }
    public void onTyreSignalStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onTyreSystemStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onTyreTemperatureStateChanged(int state) { throw new RuntimeException("Stub!"); }
}
