package android.hardware.bydauto.speed;

public abstract class AbsBYDAutoSpeedListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoSpeedListener";

    public AbsBYDAutoSpeedListener() { throw new RuntimeException("Stub!"); }

    public void onAccelerateDeepnessChanged(int value) { throw new RuntimeException("Stub!"); }
    public void onAccelerateDeepnessChanged(int value, int flag) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onAccelerateValueChanged(double value) { throw new RuntimeException("Stub!"); }
    public void onBrakeDeepnessChanged(int value) { throw new RuntimeException("Stub!"); }
    public void onBrakeDeepnessChanged(int value, int flag) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onFuelAccelerateDeepnessChanged(double value) { throw new RuntimeException("Stub!"); }
    public void onSpeedChanged(double value) { throw new RuntimeException("Stub!"); }
    public void onSpeedChanged(double value, int flag) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onSpeedFromGatewayChanged(double value) { throw new RuntimeException("Stub!"); }
}
