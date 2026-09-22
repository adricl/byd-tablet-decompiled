package android.hardware.bydauto.audio;

public abstract class AbsBYDAutoAudioListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoAudioListener";

    public AbsBYDAutoAudioListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
}
