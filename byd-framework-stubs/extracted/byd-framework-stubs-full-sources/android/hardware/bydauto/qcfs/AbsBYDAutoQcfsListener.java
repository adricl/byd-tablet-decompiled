package android.hardware.bydauto.qcfs;

public abstract class AbsBYDAutoQcfsListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoQcfsListener";

    public AbsBYDAutoQcfsListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onEcuVersionInd(byte[] value) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onFsQurQcStateInd() { throw new RuntimeException("Stub!"); }
    public void onKeyIdInd(byte[] value) { throw new RuntimeException("Stub!"); }
    public void onNewVerUpgradeCond(int value) { throw new RuntimeException("Stub!"); }
    public void onOtaStateInd(int value) { throw new RuntimeException("Stub!"); }
    public void onRcvKeyCond(int value) { throw new RuntimeException("Stub!"); }
    public void onUpgradeCond(int value) { throw new RuntimeException("Stub!"); }
    public void onUpgradeCond(byte[] value) { throw new RuntimeException("Stub!"); }
}
