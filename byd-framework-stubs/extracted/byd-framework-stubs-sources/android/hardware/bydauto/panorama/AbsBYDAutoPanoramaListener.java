package android.hardware.bydauto.panorama;

public abstract class AbsBYDAutoPanoramaListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoPanoramaListener";

    public AbsBYDAutoPanoramaListener() { throw new RuntimeException("Stub!"); }

    public void onBackLineConfigChanged(int mode) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onDisplayModeChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onPanOutputStateChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onPanoRotationChanged(int value) { throw new RuntimeException("Stub!"); }
    public void onPanoWorkStateChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onPanoramaOnlineStateChanged(int value) { throw new RuntimeException("Stub!"); }
}
