package android.hardware.bydauto.light;

public abstract class AbsBYDAutoLightListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoLightListener";

    public AbsBYDAutoLightListener() { throw new RuntimeException("Stub!"); }

    public void onAFSSwitchStateChange(int state) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onGroupHeadlightStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onLightAutoSwitchOff() { throw new RuntimeException("Stub!"); }
    public void onLightAutoSwitchOn() { throw new RuntimeException("Stub!"); }
    public void onLightOff(int type) { throw new RuntimeException("Stub!"); }
    public void onLightOn(int type) { throw new RuntimeException("Stub!"); }
}
