package android.hardware.bydauto.radio;

public abstract class AbsBYDAutoRadioListener implements android.hardware.IBYDAutoListener {
    protected static final String TAG = "AbsBYDAutoRadioListener";

    public AbsBYDAutoRadioListener() { throw new RuntimeException("Stub!"); }

    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onCurFreqChanged(int radioState, int band, int frequency) { throw new RuntimeException("Stub!"); }
    public final void onDataChanged(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public void onDataEventChanged(int eventType, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public void onEffectiveFreqSearched(int radioState, int band, int searchProcessState, int frequency) { throw new RuntimeException("Stub!"); }
    public void onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onRadioParamChanged(int band, int start, int end, int step) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void onRadioStateChanged(int state) { throw new RuntimeException("Stub!"); }
    public void onSearchResultChanged(int band, int frequency, int isEffective, int searchProcessState) { throw new RuntimeException("Stub!"); }
}
