package android.hardware.bydauto.radio;

/** Permissions: {@code android.permission.BYDAUTO_RADIO_GET}, {@code android.permission.BYDAUTO_RADIO_SET} */
public final class BYDAutoRadioDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int AM_STEP_10KHZ = 10;
    public static final int AM_STEP_9KHZ = 9;
    public static final int FM_STEP_100KHZ = 100;
    public static final int FM_STEP_200KHZ = 200;
    public static final int FM_STEP_50KHZ = 50;
    public static final int RADIO_BAND_AM = 2;
    public static final int RADIO_BAND_FM = 1;
    public static final int RADIO_COMMAND_BUSY = -2147482647;
    public static final int RADIO_COMMAND_FAILED = -2147482648;
    public static final int RADIO_COMMAND_INVALID_VALUE = -2147482645;
    public static final int RADIO_COMMAND_SUCCESS = 0;
    public static final int RADIO_COMMAND_TIMEOUT = -2147482646;
    public static final int RADIO_STATE_OFF = 0;
    public static final int RADIO_STATE_PLAY = 1;
    public static final int RADIO_STATE_SEARCH_ALL = 3;
    public static final int RADIO_STATE_SEARCH_NEXT_PREV = 2;
    public static final int SEARCH_FREQUENCY_EFFECTIVE = 1;
    public static final int SEARCH_FREQUENCY_INVALID = 0;
    public static final int SEARCH_PROCESS_STATE_FINISH = 0;
    public static final int SEARCH_PROCESS_STATE_UNFINISH = 1;
    protected static final String TAG = "BYDAutoRADIODevice";
    public static final int TURN_OFF_RADIO = 0;
    public static final int TURN_ON_RADIO = 1;

    BYDAutoRadioDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.radio.BYDAutoRadioDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.radio.AbsBYDAutoRadioListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.radio.AbsBYDAutoRadioListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.radio.AbsBYDAutoRadioListener l) { throw new RuntimeException("Stub!"); }
}
