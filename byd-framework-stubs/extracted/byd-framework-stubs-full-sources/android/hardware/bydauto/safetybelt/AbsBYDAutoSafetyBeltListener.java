package android.hardware.bydauto.safetybelt;

public abstract class AbsBYDAutoSafetyBeltListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoSafetyBeltListener";

    public AbsBYDAutoSafetyBeltListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onMessage5sOnlineStateChanged(int id, int state) { throw new RuntimeException("Stub!"); }
    public void onPassengerStatusChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onSafetyBeltMsrStateChanged(int value) { throw new RuntimeException("Stub!"); }
    public void onSafetyBeltReminderReceived(int value) { throw new RuntimeException("Stub!"); }
    public void onSafetyBeltStatusChanged(int area, int state) { throw new RuntimeException("Stub!"); }
}
