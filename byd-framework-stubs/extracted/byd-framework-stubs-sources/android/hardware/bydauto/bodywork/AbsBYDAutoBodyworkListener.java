package android.hardware.bydauto.bodywork;

public abstract class AbsBYDAutoBodyworkListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoBodyworkListener";

    public AbsBYDAutoBodyworkListener() { throw new RuntimeException("Stub!"); }

    public void onAlarmStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onAutoSystemStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onBatteryVoltageLevelChanged(int level) { throw new RuntimeException("Stub!"); }
    public void onCarWindowAntiPinchConfigChanged(int config) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onDoorStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onFuelElecLowPowerChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onMoonRoofConfigChanged(int config) { throw new RuntimeException("Stub!"); }
    public void onPowerLevelChanged(int level) { throw new RuntimeException("Stub!"); }
    public void onSteeringWheelValueChanged(int type, double value) { throw new RuntimeException("Stub!"); }
    public void onWindowOpenPercentChanged(int area, int percent) { throw new RuntimeException("Stub!"); }
    public void onWindowStateChanged(int area, int state) { throw new RuntimeException("Stub!"); }
}
