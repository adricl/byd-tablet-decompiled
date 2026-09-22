package android.hardware.bydauto.vehicledata;

public abstract class AbsBYDAutoVehicleDataListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoVehicleDataListener";

    public AbsBYDAutoVehicleDataListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
}
