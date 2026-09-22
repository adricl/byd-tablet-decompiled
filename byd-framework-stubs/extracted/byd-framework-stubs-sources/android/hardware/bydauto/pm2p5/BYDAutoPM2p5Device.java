package android.hardware.bydauto.pm2p5;

/** Permissions: {@code android.permission.BYDAUTO_PM2P5_GET}, {@code android.permission.BYDAUTO_PM2P5_SET} */
public final class BYDAutoPM2p5Device extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int DEVICE_HAS_THE_FEATURE = 1;
    public static final int DEVICE_NOT_HAS_THE_FEATURE = 0;
    public static final int DEVICE_THE_FEATURE_LINK_ERROR = 65535;
    public static final String FEATURE_ANION_DETECT = "AnionDetect";
    public static final String FEATURE_DUAL_CHANNEL_DETECT = "DualChannelDetect";
    public static final int PM2P5_COMMAND_BUSY = -2147482647;
    public static final int PM2P5_COMMAND_FAILED = -2147482648;
    public static final int PM2P5_COMMAND_INVALID_VALUE = -2147482645;
    public static final int PM2P5_COMMAND_SUCCESS = 0;
    public static final int PM2P5_COMMAND_TIMEOUT = -2147482646;
    public static final int PM2P5_LEVEL_EXCELLENT = 1;
    public static final int PM2P5_LEVEL_GOOD = 2;
    public static final int PM2P5_LEVEL_HEAVY = 5;
    public static final int PM2P5_LEVEL_INVALID = 0;
    public static final int PM2P5_LEVEL_LOW_GRADE = 3;
    public static final int PM2P5_LEVEL_MIDDLE = 4;
    public static final int PM2P5_LEVEL_SERIOUS = 6;
    public static final int PM2P5_ONLINE_STATE_NULL = 0;
    public static final int PM2P5_ONLINE_STATE_OFF = 2;
    public static final int PM2P5_ONLINE_STATE_ON = 1;
    public static final int PM2P5_STATE_OFF = 0;
    public static final int PM2P5_STATE_ON = 1;
    public static final int PM2P5_VALUE_MAX = 3000;
    public static final int PM2P5_VALUE_MIN = 0;
    public static final int PROMPT_INFO_INNER_LOOP = 2;
    public static final int PROMPT_INFO_NORMAL = 0;
    public static final int PROMPT_INFO_START_AC = 1;
    public static final int STATE_CLOSE = 2;
    public static final int STATE_OPEN = 1;
    protected static final String TAG = "BYDAutoPM2p5Device";
    public static final int WARNING_INFO_EXCESS_IN = 1;
    public static final int WARNING_INFO_EXCESS_OUT = 2;
    public static final int WARNING_INFO_NORMAL;
    static {
        WARNING_INFO_NORMAL = 0;
    }

    BYDAutoPM2p5Device() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.pm2p5.BYDAutoPM2p5Device getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code PM2P5_STATE_IN} (0x4f600028), {@code PM2P5_STATE_OUT} (0x4f60002a). */
    public int[] getPM2p5CheckState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code PM2P5_LEVEL_IN} (0x4f600030), {@code PM2P5_LEVEL_OUT} (0x4f600033). */
    public int[] getPM2p5Level() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code PM2P5_ONLINE_STATE} (0x4f600000). */
    public int getPM2p5OnlineState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code PM2P5_VALUE_IN} (0x4f600010), {@code PM2P5_VALUE_OUT} (0x4f60001c). */
    public int[] getPM2p5Value() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.pm2p5.AbsBYDAutoPM2p5Listener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.pm2p5.AbsBYDAutoPM2p5Listener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.pm2p5.AbsBYDAutoPM2p5Listener l) { throw new RuntimeException("Stub!"); }
}
