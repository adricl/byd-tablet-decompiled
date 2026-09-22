package android.hardware.bydauto.time;

/** Permissions: {@code android.permission.BYDAUTO_TIME_GET}, {@code android.permission.BYDAUTO_TIME_SET} */
public final class BYDAutoTimeDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    protected static final String TAG = "BYDAutoTIMEDevice";
    public static final int TIME_COMMAND_BUSY = -2147482647;
    public static final int TIME_COMMAND_FAILED = -2147482648;
    public static final int TIME_COMMAND_INVALID_VALUE = -2147482645;
    public static final int TIME_COMMAND_SUCCESS = 0;
    public static final int TIME_COMMAND_TIMEOUT = -2147482646;
    public static final int TIME_DATE_FORMAT1 = 1;
    public static final int TIME_DATE_FORMAT2 = 2;
    public static final int TIME_DATE_FORMAT3 = 3;
    public static final int TIME_DAY_MAX = 31;
    public static final int TIME_DAY_MIN = 1;
    public static final int TIME_FORMAT_24H_OFF = 0;
    public static final int TIME_FORMAT_24H_ON = 1;
    public static final int TIME_FORMAT_INVALID = 0;
    public static final int TIME_FORMAT_TWELVE_HOUR = 1;
    public static final int TIME_FORMAT_TWENTYFOUR_HOUR = 2;
    public static final int TIME_HOUR_MAX = 23;
    public static final int TIME_HOUR_MIN = 0;
    public static final int TIME_MINUTE_MAX = 59;
    public static final int TIME_MINUTE_MIN = 0;
    public static final int TIME_MONTH_MAX = 12;
    public static final int TIME_MONTH_MIN = 1;
    public static final int TIME_SECOND_MAX = 59;
    public static final int TIME_SECOND_MIN = 0;
    public static final int TIME_SET_AUTO = 1;
    public static final int TIME_SET_MANUAL = 2;
    public static final int TIME_SUMMERTIME_OFF = 0;
    public static final int TIME_SUMMERTIME_ON = 1;
    public static final int TIME_WEEKDAY_MAX = 7;
    public static final int TIME_WEEKDAY_MIN = 1;
    public static final int TIME_YEAR_MAX = 2255;
    public static final int TIME_YEAR_MIN = 2001;
    public static final int TIME_ZONE_MAX = 23;
    public static final int TIME_ZONE_MIN;
    static {
        TIME_ZONE_MIN = 0;
    }

    BYDAutoTimeDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.time.BYDAutoTimeDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code TIME_YEAR} (0x0004e18f), {@code TIME_MONTH} (0x0007543f), {@code TIME_DAY} (0x0003f5f0), {@code TIME_HOUR} (0x0000ee09), {@code TIME_MINUTE} (0x000897c8), {@code TIME_SECOND} (0x0008e77a). */
    public int[] getTime() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code TIME_FORMAT_24H} (0x49c0002e). */
    public int getTimeFormat() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.time.AbsBYDAutoTimeListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.time.AbsBYDAutoTimeListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code TIME_SET_MODE_SET} (0x4df00038), {@code TIME_YEAR_SET} (0x4df00008), {@code TIME_MONTH_SET} (0x4df00010), {@code TIME_DAY_SET} (0x4df00018), {@code TIME_WEEKDAY_SET} (0x4df0003c). */
    public int setDate(int year, int month, int day, int weekday) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code TIME_SET_MODE_SET} (0x4df00038), {@code TIME_HOUR_SET} (0x4df00020), {@code TIME_MINUTE_SET} (0x4df00028), {@code TIME_SECOND_SET} (0x4df00030). */
    public int setTime(int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code TIME_FORMAT_24H_SET} (0x4e40002e). */
    public int setTimeFormat(int value) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.time.AbsBYDAutoTimeListener l) { throw new RuntimeException("Stub!"); }
}
