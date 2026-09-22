package android.hardware.bydauto.ac;

public abstract class AbsBYDAutoAcListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoAcListener";

    public AbsBYDAutoAcListener() { throw new RuntimeException("Stub!"); }

    public void onAcCompressorManualSignChanged(int sign) { throw new RuntimeException("Stub!"); }
    public void onAcCompressorModeChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onAcCtrlModeChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onAcCycleModeChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onAcDefrostStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onAcRearStarted() { throw new RuntimeException("Stub!"); }
    public void onAcRearStoped() { throw new RuntimeException("Stub!"); }
    public void onAcStarted() { throw new RuntimeException("Stub!"); }
    public void onAcStoped() { throw new RuntimeException("Stub!"); }
    public void onAcVentilationStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onAcWindLevelChanged(int level) { throw new RuntimeException("Stub!"); }
    public void onAcWindLevelManualSignChanged(int sign) { throw new RuntimeException("Stub!"); }
    public void onAcWindModeChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onAcWindModeManualSignChanged(int sign) { throw new RuntimeException("Stub!"); }
    @Deprecated
    public void onAcWindModeShownStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onRearAcCtrlModeChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onRearAcWindLevelChanged(int level) { throw new RuntimeException("Stub!"); }
    public void onRearAcWindModeChanged(int mode) { throw new RuntimeException("Stub!"); }
    public void onTemperatureChanged(int area, int value) { throw new RuntimeException("Stub!"); }
    public void onTemperatureUnitChanged(int unit) { throw new RuntimeException("Stub!"); }
}
