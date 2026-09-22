package android.hardware.bydauto.test;

public abstract class AbsBYDAutoTestListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoTestListener";

    public AbsBYDAutoTestListener() { throw new RuntimeException("Stub!"); }

    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onApkInstallReqChanged(int req) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onMcuStateChanged(int state) { throw new RuntimeException("Stub!"); }
}
