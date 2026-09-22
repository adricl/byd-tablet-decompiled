package android.hardware.bydauto.reminder;

public abstract class AbsBYDAutoReminderListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoReminderListener";

    public AbsBYDAutoReminderListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onIndChanged(int value) { throw new RuntimeException("Stub!"); }
}
