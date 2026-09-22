package android.hardware.bydauto.time;

public abstract class AbsBYDAutoTimeListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoTimeListener";

    public AbsBYDAutoTimeListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onTimeChanged(int[] time) { throw new RuntimeException("Stub!"); }
    public void onTimeFormatChanged(int value) { throw new RuntimeException("Stub!"); }
}
