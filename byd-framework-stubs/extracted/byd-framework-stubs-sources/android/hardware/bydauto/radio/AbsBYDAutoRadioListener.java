package android.hardware.bydauto.radio;

public abstract class AbsBYDAutoRadioListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoRadioListener";

    public AbsBYDAutoRadioListener() { throw new RuntimeException("Stub!"); }

    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onEffectiveFreqSearched(int radioState, int band, int searchProcessState, int frequency) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public void onSearchResultChanged(int band, int frequency, int isEffective, int searchProcessState) { throw new RuntimeException("Stub!"); }
}
