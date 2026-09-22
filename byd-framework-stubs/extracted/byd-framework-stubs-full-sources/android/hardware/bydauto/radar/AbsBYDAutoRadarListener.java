package android.hardware.bydauto.radar;

public abstract class AbsBYDAutoRadarListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoRadarListener";

    public AbsBYDAutoRadarListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onRadarObstacleDistanceChanged(int area, int value) { throw new RuntimeException("Stub!"); }
    public void onRadarProbeStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onReverseRadarSwitchStateChanged(int state) { throw new RuntimeException("Stub!"); }
}
