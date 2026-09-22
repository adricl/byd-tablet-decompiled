package android.hardware.bydauto.instrument;

public abstract class AbsBYDAutoInstrumentListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoInstrumentListener";

    public AbsBYDAutoInstrumentListener() { throw new RuntimeException("Stub!"); }

    public void onAlarmBuzzleStateChange(int state) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onExternalChargingPowerChanged(double value) { throw new RuntimeException("Stub!"); }
    public void onMaintenanceInfoChanged(int typeName, int infoValue) { throw new RuntimeException("Stub!"); }
    public void onMalfunctionInfoChanged(int typeName, int hasMalfunction) { throw new RuntimeException("Stub!"); }
    public void onNaviDestinationCommandChanged(int command) { throw new RuntimeException("Stub!"); }
    public void onRoadNameCheckStateChanged(int state) { throw new RuntimeException("Stub!"); }
}
