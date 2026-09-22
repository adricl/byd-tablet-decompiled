package android.hardware.bydauto.rse;

/** Permissions: {@code android.permission.BYDAUTO_RSE_GET}, {@code android.permission.BYDAUTO_RSE_SET} */
public final class BYDAutoRSEDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int CLOSE_SUCCESS = 2;
    public static final int FB_ITEM_AUDIO_SWITCH = 9;
    public static final int FB_ITEM_KID_MODE = 7;
    public static final int FB_ITEM_MONITOR_SWITCH = 8;
    public static final int FB_ITEM_SCREEN_OFF = 10;
    public static final int IVI_ALLOW_FOLLOW_LINK = 1;
    public static final int IVI_CAST_SCREEN_TYPE_INVALID = 0;
    public static final int IVI_CAST_SCREEN_TYPE_SINK = 2;
    public static final int IVI_CAST_SCREEN_TYPE_SOURCE = 1;
    public static final int IVI_ENCRYPTION_INVALID = 0;
    public static final int IVI_ENCRYPTION_WPA2_PSK = 1;
    public static final int IVI_HOTPOST_LINK_LIMIT_INTIAL_VALUE = 0;
    public static final int IVI_HOTPOST_LINK_LIMIT_MAX = 10;
    public static final int IVI_HOTPOST_LINK_LIMIT_MIN = 1;
    public static final int IVI_HOTPOST_RESET_INVALID = 0;
    public static final int IVI_HOTPOST_RESET_VALID = 1;
    public static final int IVI_HOTPOST_STATE_CLOSED = 2;
    public static final int IVI_HOTPOST_STATE_INVALID = 0;
    public static final int IVI_HOTPOST_STATE_OPEN = 1;
    public static final int IVI_KARO_STATE_CLOSED = 0;
    public static final int IVI_KARO_STATE_IVI = 1;
    public static final int IVI_KARO_STATE_IVI_LEFT_RSE = 3;
    public static final int IVI_KARO_STATE_IVI_RIGHT_RSE = 2;
    public static final int IVI_KARO_STATE_LEFT_RIGHT_RSE = 5;
    public static final int IVI_KARO_STATE_LEFT_RSE = 4;
    public static final int IVI_KARO_STATE_LEFT_RSE_IVI = 6;
    public static final int IVI_KARO_STATE_RIGHT_LEFT_RSE = 8;
    public static final int IVI_KARO_STATE_RIGHT_RSE = 7;
    public static final int IVI_KARO_STATE_RIGHT_RSE_IVI = 9;
    public static final int IVI_KARO_WAY_INVALID = 0;
    public static final int IVI_KARO_WAY_IVI_KARO = 1;
    public static final int IVI_KARO_WAY_LEFT_RSE_IVI = 2;
    public static final int IVI_KARO_WAY_RIGHT_RSE_IVI = 3;
    public static final int IVI_NOT_ALLOW_FOLLOW_LINK = 0;
    public static final int IVI_NO_ENCRYPTION = 2;
    public static final int IVI_SET_TYPE_FOLLOW_LINK = 1;
    public static final int IVI_SET_TYPE_HOTPOST = 0;
    public static final int IVI_WIFI_STATE_EXTERNAL_HOTPOST = 2;
    public static final int IVI_WIFI_STATE_HOTPOST = 1;
    public static final int IVI_WIFI_STATE_INVALID = 0;
    public static final int LEFT_RSE = 0;
    public static final int MODE_CLOSE = 0;
    public static final int MODE_OPEN = 1;
    public static final int OPEN_SUCCESS = 1;
    public static final int REQUEST_IVI_EXIT_AUDIO = 3;
    public static final int REQUEST_IVI_INVALID = 0;
    public static final int REQUEST_IVI_SYNC_STATE = 1;
    public static final int REQUEST_IVI_USE_AUDIO = 2;
    public static final int RIGHT_RSE = 1;
    public static final int RSE_COMMAND_BUSY = -2147482647;
    public static final int RSE_COMMAND_FAILED = -2147482648;
    public static final int RSE_COMMAND_INVALID_VALUE = -2147482645;
    public static final int RSE_COMMAND_SUCCESS = 0;
    public static final int RSE_COMMAND_TIMEOUT = -2147482646;
    protected static final String TAG = "BYDAutoRSEDevice";

    BYDAutoRSEDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.rse.BYDAutoRSEDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code RSE_L_KID_MODE_FB_TO_IVI_SET} (0x1890201a), {@code RSE_L_MONITOR_SWITCH_FB_TO_IVI_SET} (0x18902020), {@code RSE_L_AUDIO_SWITCH_FB_TO_IVI_SET} (0x18902022), {@code RSE_L_SCREEN_OFF_FB_TO_IVI_SET} (0x18902024), {@code RSE_R_KID_MODE_FB_TO_IVI_SET} (0x1930201a), {@code RSE_R_MONITOR_SWITCH_FB_TO_IVI_SET} (0x19302020), {@code RSE_R_AUDIO_SWITCH_FB_TO_IVI_SET} (0x19302022), {@code RSE_R_SCREEN_OFF_FB_TO_IVI_SET} (0x19302024).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getWriteFeedbackFromRse(int source, int item) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.rse.AbsBYDAutoRSEListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.rse.AbsBYDAutoRSEListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendAudioCtlModeToRSE(int type, int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendCastDiffToRSE(int source, int role) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendEncryptionToRSE(int type, int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendFollowLinkPasswordToRSE(byte[] password) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendFollowLinkToRSE(int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendFollowLinkUsernameToRSE(byte[] username) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendHotpostLinkLimitToRSE(int value) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendHotpostPasswordToRSE(byte[] password) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendHotpostResetToRSE(int result) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendHotpostUsernameToRSE(byte[] username) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendIVIHotpostStateToRSE(int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendIVIWifiStateToRSE(int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendKaraokeStateToRSE(int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendKidModeToRSE(int type, int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendLinkCtrlModeToRSE(int type, int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendMacAddressToRSE(byte[] mac) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendMonitorModeToRSE(int type, int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendScreenOffModeToRSE(int type, int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendStartKaraokeMethodToRSE(int method) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.rse.AbsBYDAutoRSEListener l) { throw new RuntimeException("Stub!"); }
}
