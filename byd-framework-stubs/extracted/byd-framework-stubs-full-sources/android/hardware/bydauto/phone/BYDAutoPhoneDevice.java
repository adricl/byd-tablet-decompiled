package android.hardware.bydauto.phone;

/** Permissions: {@code android.permission.BYDAUTO_PHONE_GET}, {@code android.permission.BYDAUTO_PHONE_SET} */
public final class BYDAutoPhoneDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int PHONE_COMMAND_BUSY = -2147482647;
    public static final int PHONE_COMMAND_FAILED = -2147482648;
    public static final int PHONE_COMMAND_INVALID = -2147482645;
    public static final int PHONE_COMMAND_SUCCESS = 0;
    public static final int PHONE_COMMAND_TIMEOUT = -2147482646;
    public static final int PHONE_EVENT_ANSWER = 1;
    public static final int PHONE_EVENT_HANGUP = 3;
    public static final int PHONE_EVENT_REJECT = 2;
    public static final int PHONE_INFO_CALLING = 2;
    public static final int PHONE_INFO_DAIL = 1;
    public static final int PHONE_INFO_HANGUP = 4;
    public static final int PHONE_INFO_ONLINE = 3;
    public static final int PHONE_MUTE_OFF = 1;
    public static final int PHONE_MUTE_ON = 0;
    public static final int PHONE_NAME_LEN_MAX = 160;
    public static final int PHONE_NAME_LEN_MIN = 1;
    public static final int PHONE_NUMBER_LEN_MAX = 20;
    public static final int PHONE_NUMBER_LEN_MIN = 1;
    protected static final String TAG = "BYDAutoPhoneDevice";

    BYDAutoPhoneDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.phone.BYDAutoPhoneDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code PHONE_EVENT} (0x000d65ea).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPhoneEvent() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code PHONE_MUTE} (0x00044c95).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPhoneMute() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.phone.AbsBYDAutoPhoneListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.phone.AbsBYDAutoPhoneListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code PHONE_INFO_ST_SET} (0x000686a9).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setPhoneInfoState(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code PHONE_MUTE} (0x00044c95), {@code PHONE_INFO_ST_SET} (0x000686a9).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setPhoneMute(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code PHONE_NAME_SET} (0x0007991f), {@code PHONE_NUMBER_SET} (0x000a6680).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int[] setPhoneNameNumber(String name, String number) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.phone.AbsBYDAutoPhoneListener l) { throw new RuntimeException("Stub!"); }
}
