package android.hardware.bydauto.pm2p5;

public abstract class AbsBYDAutoPM2p5Listener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoPM2p5Listener";

    public AbsBYDAutoPM2p5Listener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onPM2p5AnionDetectChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onPM2p5CheckStateChanged(int state_in, int state_out) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onPM2p5DualChannelDetectChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onPM2p5LevelChanged(int level_in, int level_out) { throw new RuntimeException("Stub!"); }
    public void onPM2p5OnlineStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onPM2p5ValueChanged(int value_in, int value_out) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onPM2p5WarningInfoChanged(int info) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onPromptInfoChanged(int info) { throw new RuntimeException("Stub!"); }
}
