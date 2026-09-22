package android.hardware.bydauto.version;

public abstract class AbsBYDAutoVersionListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoVersionListener";

    public AbsBYDAutoVersionListener() { throw new RuntimeException("Stub!"); }

    public void onBatteryCtrlVersionChanged(String version) { throw new RuntimeException("Stub!"); }
    public void onCarChargerVersionChanged(String version) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onDspVersionChanged(String version) { throw new RuntimeException("Stub!"); }
    public void onDtcVersionChanged(String version) { throw new RuntimeException("Stub!"); }
    public void onEngineCtrlVersionChanged(String version) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onInstrumentVersionChanged(String version) { throw new RuntimeException("Stub!"); }
    public void onMcuBootVersionChanged(String version) { throw new RuntimeException("Stub!"); }
    public void onMcuVersionChanged(String version) { throw new RuntimeException("Stub!"); }
    public void onMotorCtrl1VersionChanged(String version) { throw new RuntimeException("Stub!"); }
    public void onMotorCtrl2VersionChanged(String version) { throw new RuntimeException("Stub!"); }
    public void onMotorCtrl3VersionChanged(String version) { throw new RuntimeException("Stub!"); }
    public void onTransmissionCtrlVersionChanged(String version) { throw new RuntimeException("Stub!"); }
}
