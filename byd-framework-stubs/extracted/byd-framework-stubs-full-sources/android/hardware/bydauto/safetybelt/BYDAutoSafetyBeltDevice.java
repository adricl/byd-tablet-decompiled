package android.hardware.bydauto.safetybelt;

/** Permissions: {@code android.permission.BYDAUTO_SAFETY_BELT_GET}, {@code android.permission.BYDAUTO_SAFETY_BELT_SET} */
public final class BYDAutoSafetyBeltDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int DEVICE_HAS_THE_FEATURE = 1;
    public static final int DEVICE_NOT_HAS_THE_FEATURE = 0;
    public static final int DEVICE_THE_FEATURE_LINK_ERROR = 65535;
    public static final int DEVICE_THE_FEATURE_NEVER_GET = 2;
    public static final int MESSAGE_481 = 1;
    public static final int MESSAGE_OFFLINE = 0;
    public static final int MESSAGE_ONLINE = 1;
    public static final int SAFETY_BELT_AREA_DEPUTY = 2;
    public static final int SAFETY_BELT_AREA_MAIN = 1;
    public static final int SAFETY_BELT_AREA_SECOND_ROW_SEAT_LEFT = 3;
    public static final int SAFETY_BELT_AREA_SECOND_ROW_SEAT_MID = 5;
    public static final int SAFETY_BELT_AREA_SECOND_ROW_SEAT_RIGHT = 4;
    public static final int SAFETY_BELT_COMMAND_BUSY = -2147482647;
    public static final int SAFETY_BELT_COMMAND_FAILED = -2147482648;
    public static final int SAFETY_BELT_COMMAND_INVALID_VALUE = -2147482645;
    public static final int SAFETY_BELT_COMMAND_SUCCESS = 0;
    public static final int SAFETY_BELT_COMMAND_TIMEOUT = -2147482646;
    public static final int SAFETY_BELT_MSR_SWITCH_OFF = 1;
    public static final int SAFETY_BELT_MSR_SWITCH_ON = 0;
    public static final int SAFETY_BELT_PASSENGER_DEPUTY = 1;
    public static final int SAFETY_BELT_PASSENGER_SECOND_ROW_SEAT_LEFT = 2;
    public static final int SAFETY_BELT_PASSENGER_SECOND_ROW_SEAT_MID = 4;
    public static final int SAFETY_BELT_PASSENGER_SECOND_ROW_SEAT_RIGHT = 3;
    public static final int SAFETY_BELT_PASSENGER_STATE_INVALID = 2;
    public static final int SAFETY_BELT_PASSENGER_STATE_NOBODY = 0;
    public static final int SAFETY_BELT_PASSENGER_STATE_SOMEBODY = 1;
    public static final int SAFETY_BELT_REMINDER_ENABLED = 1;
    public static final int SAFETY_BELT_SBCD_INVALID = 0;
    public static final int SAFETY_BELT_SBCD_OFF = 1;
    public static final int SAFETY_BELT_SBCD_ON = 2;
    public static final int SAFETY_BELT_STATE_INVALID = 2;
    public static final int SAFETY_BELT_STATE_LOCK = 1;
    public static final int SAFETY_BELT_STATE_UNLOCK = 0;
    protected static final String TAG = "BYDAutoSafetyBeltDevice";

    BYDAutoSafetyBeltDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.safetybelt.BYDAutoSafetyBeltDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code ONLINE_HAS_0x048100} (0x48100000), {@code SAFETY_BELT_MSR_481_ONLINE} (0x48100000).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMessage5sOnlineState(int id) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SAFETY_BELT_PASSENGER_COMMAND_DEPUTY} (0x12d0000f), {@code SAFETY_BELT_PASSENGER_COMMAND_SECOND_ROW_SEAT_LEFT} (0x0008702b), {@code SAFETY_BELT_PASSENGER_COMMAND_SECOND_ROW_SEAT_RIGHT} (0x4750001b), {@code SAFETY_BELT_PASSENGER_COMMAND_SECOND_ROW_SEAT_MID} (0x000b2021). */
    public int getPassengerStatus(int area) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SAFETY_BELT_MSR_STATE} (0x48100028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSafetyBeltMsrState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SAFETY_BELT_REMINDER} (0x05500043).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSafetyBeltReminder() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SAFETY_BELT_COMMAND_AREA_MAIN} (0xa9400018), {@code SAFETY_BELT_COMMAND_AREA_DEPUTY} (0x12d0003f), {@code SAFETY_BELT_COMMAND_AREA_SECOND_ROW_SEAT_LEFT} (0x000b8915), {@code SAFETY_BELT_COMMAND_AREA_SECOND_ROW_SEAT_RIGHT} (0x4750001a), {@code SAFETY_BELT_COMMAND_AREA_SECOND_ROW_SEAT_MID} (0x00076420). */
    public int getSafetyBeltStatus(int area) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.safetybelt.AbsBYDAutoSafetyBeltListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.safetybelt.AbsBYDAutoSafetyBeltListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SAFETY_BELT_MSR_STATE_SET} (0x3850001c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setSafetyBeltSbcdState(int state) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.safetybelt.AbsBYDAutoSafetyBeltListener l) { throw new RuntimeException("Stub!"); }
}
