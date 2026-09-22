package android.hardware.bydauto.radar;

public abstract class AbsBYDAutoRadarListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoRadarListener";

    public AbsBYDAutoRadarListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onRadarProbeStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onReverseRadarSwitchStateChanged(int state) { throw new RuntimeException("Stub!"); }
}
