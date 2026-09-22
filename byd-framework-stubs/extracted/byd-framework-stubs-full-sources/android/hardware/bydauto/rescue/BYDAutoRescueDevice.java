package android.hardware.bydauto.rescue;

/** Permissions: {@code android.permission.BYDAUTO_RESCUE_GET}, {@code android.permission.BYDAUTO_RESCUE_SET} */
public final class BYDAutoRescueDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int RESCUE_COMMAND_BUSY = -2147482647;
    public static final int RESCUE_COMMAND_FAILED = -2147482648;
    public static final int RESCUE_COMMAND_INVALID_VALUE = -2147482645;
    public static final int RESCUE_COMMAND_SUCCESS = 0;
    public static final int RESCUE_COMMAND_TIMEOUT = -2147482646;
    protected static final String TAG = "BYDAutoRescueDevice";

    BYDAutoRescueDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /**
     * Reads feature ID {@code RESCUE_CALL_AIRBAG_STATE} (0x08c00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAirbagState() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code RESCUE_INFO_FROM_MCU} (0x3fd00014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getInfoFromMCU() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.rescue.BYDAutoRescueDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.rescue.AbsBYDAutoRescueListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.rescue.AbsBYDAutoRescueListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code RESCUE_INFO_TO_MCU_SET} (0xaa000028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setInfoToMCU(byte[] info) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.rescue.AbsBYDAutoRescueListener l) { throw new RuntimeException("Stub!"); }
}
