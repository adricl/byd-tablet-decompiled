package android.hardware.bydauto.gb;

/** Permissions: {@code android.permission.BYDAUTO_GB_GET} */
public final class BYDAutoGBDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int GB_COMMAND_BUSY = -2147482647;
    public static final int GB_COMMAND_FAILED = -2147482648;
    public static final int GB_COMMAND_INVALID_VALUE = -2147482645;
    public static final int GB_COMMAND_SUCCESS = 0;
    public static final int GB_COMMAND_TIMEOUT = -2147482646;
    public static final int GB_WATE_TEMP_ALARM_NO = 0;
    public static final int GB_WATE_TEMP_ALARM_YES = 1;
    protected static final String TAG = "BYDAutoGBDevice";

    BYDAutoGBDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.gb.BYDAutoGBDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code GB_WATE_TEMP_ALARM} (0x4a509024).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTempMeterPercentAlarmValue() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.gb.AbsBYDAutoGBListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.gb.AbsBYDAutoGBListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.gb.AbsBYDAutoGBListener l) { throw new RuntimeException("Stub!"); }
}
