package android.hardware.bydauto.radar;

/** Permissions: {@code android.permission.BYDAUTO_RADAR_GET}, {@code android.permission.BYDAUTO_RADAR_SET} */
public final class BYDAutoRadarDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int LINK_ERROR = 65535;
    public static final int RADAR_AREA_FRONT_LEFT_MID = 7;
    public static final int RADAR_AREA_FRONT_RIGHT_MID = 8;
    public static final int RADAR_AREA_LEFT = 5;
    public static final int RADAR_AREA_LEFT_FRONT = 1;
    public static final int RADAR_AREA_LEFT_REAR = 3;
    public static final int RADAR_AREA_MIDDLE_REAR = 9;
    public static final int RADAR_AREA_RIGHT = 6;
    public static final int RADAR_AREA_RIGHT_FRONT = 2;
    public static final int RADAR_AREA_RIGHT_REAR = 4;
    public static final int RADAR_COMMAND_BUSY = -2147482647;
    public static final int RADAR_COMMAND_FAILED = -2147482648;
    public static final int RADAR_COMMAND_INVALID_VALUE = -2147482645;
    public static final int RADAR_COMMAND_SUCCESS = 0;
    public static final int RADAR_COMMAND_TIMEOUT = -2147482646;
    public static final int RADAR_DISTANCE_MAX = 155;
    public static final int RADAR_DISTANCE_MIN = 0;
    public static final int RADAR_MANUFACTURE_15_SECTOR = 0;
    public static final int RADAR_MANUFACTURE_VALEO = 1;
    public static final int RADAR_OBSTACLE_DISTANCE_ALL = 2;
    public static final int RADAR_OBSTACLE_DISTANCE_MAX = 6;
    public static final int RADAR_OBSTACLE_DISTANCE_MIN = 0;
    public static final int RADAR_OBSTACLE_DISTANCE_SAFE = 14;
    public static final int RADAR_OBSTACLE_DIS_MAX = 12;
    public static final int RADAR_PROBE_STATE_ABNORMAL = 0;
    public static final int RADAR_PROBE_STATE_ALL = 1;
    public static final int RADAR_PROBE_STATE_GREEN = 2;
    public static final int RADAR_PROBE_STATE_RED = 4;
    public static final int RADAR_PROBE_STATE_SAFE = 1;
    public static final int RADAR_PROBE_STATE_YELLOW = 3;
    public static final int RADAR_REVERSE_SWITCH_OFF = 0;
    public static final int RADAR_REVERSE_SWITCH_ON = 1;
    public static final int RADAR_SOUND_STATE_OFF = 0;
    public static final int RADAR_SOUND_STATE_ON = 1;
    public static final int RADAR_STATUS_ALL = 1;
    protected static final String TAG = "BYDAutoRadarDevice";

    BYDAutoRadarDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /**
     * Reads feature ID {@code RADAR_OBSTACLE_DISTANCE_LEFT_FRONT} (0x99000061), {@code RADAR_OBSTACLE_DISTANCE_RIGHT_FRONT} (0x99000064), {@code RADAR_OBSTACLE_DISTANCE_LEFT_REAR} (0x99000066), {@code RADAR_OBSTACLE_DISTANCE_RIGHT_REAR} (0x99000067), {@code RADAR_OBSTACLE_DISTANCE_LEFT} (0x99000065), {@code RADAR_OBSTACLE_DISTANCE_RIGHT} (0x99000068), {@code RADAR_OBSTACLE_DISTANCE_FRONT_LEFT_MID} (0x99000062), {@code RADAR_OBSTACLE_DISTANCE_FRONT_RIGHT_MID} (0x99000063), {@code RADAR_MR_OBSTACLE_DIS} (0x99000069).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int[] getAllRadarDistance() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int[] getAllRadarObstacleDistances() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code RADAR_PROBE_STATE_LEFT_FRONT} (0x99000071), {@code RADAR_PROBE_STATE_RIGHT_FRONT} (0x99000074), {@code RADAR_PROBE_STATE_LEFT_REAR} (0x99000076), {@code RADAR_PROBE_STATE_RIGHT_REAR} (0x99000077), {@code RADAR_PROBE_STATE_LEFT} (0x99000075), {@code RADAR_PROBE_STATE_RIGHT} (0x99000078), {@code RADAR_PROBE_STATE_FRONT_LEFT_MID} (0x99000072), {@code RADAR_PROBE_STATE_FRONT_RIGHT_MID} (0x99000073), {@code RADAR_MR_SONDE_STATUS} (0x99000079). */
    public int[] getAllRadarProbeStates() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int[][] getAllRadarStatus() { throw new RuntimeException("Stub!"); }
    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.radar.BYDAutoRadarDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code RADAR_MANUFACTURE} (0x00083b3d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRadarManufacture() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code RADAR_OBSTACLE_DISTANCE_LEFT_FRONT} (0x99000061), {@code RADAR_OBSTACLE_DISTANCE_RIGHT_FRONT} (0x99000064), {@code RADAR_OBSTACLE_DISTANCE_LEFT_REAR} (0x99000066), {@code RADAR_OBSTACLE_DISTANCE_RIGHT_REAR} (0x99000067), {@code RADAR_OBSTACLE_DISTANCE_LEFT} (0x99000065), {@code RADAR_OBSTACLE_DISTANCE_RIGHT} (0x99000068), {@code RADAR_OBSTACLE_DISTANCE_FRONT_LEFT_MID} (0x99000062), {@code RADAR_OBSTACLE_DISTANCE_FRONT_RIGHT_MID} (0x99000063), {@code RADAR_MR_OBSTACLE_DIS} (0x99000069).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRadarObstacleDistance(int area) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code RADAR_PROBE_STATE_LEFT_FRONT} (0x99000071), {@code RADAR_PROBE_STATE_RIGHT_FRONT} (0x99000074), {@code RADAR_PROBE_STATE_LEFT_REAR} (0x99000076), {@code RADAR_PROBE_STATE_RIGHT_REAR} (0x99000077), {@code RADAR_PROBE_STATE_LEFT} (0x99000075), {@code RADAR_PROBE_STATE_RIGHT} (0x99000078), {@code RADAR_PROBE_STATE_FRONT_LEFT_MID} (0x99000072), {@code RADAR_PROBE_STATE_FRONT_RIGHT_MID} (0x99000073), {@code RADAR_MR_SONDE_STATUS} (0x99000079). */
    public int getRadarProbeState(int area) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code RADAR_REVERSE_RADAR_SWITCH_STATE} (0x26700038). */
    public int getReverseRadarSwitchState() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.radar.AbsBYDAutoRadarListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.radar.AbsBYDAutoRadarListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code RADAR_SOUND_STATE_SET} (0x4f50003b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setRadarSoundState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code RADAR_REVERSE_RADAR_SWITCH_STATE} (0x26700038), {@code RADAR_REVERSE_RADAR_SWITCH_STATE_SET1} (0x4f500008), {@code RADAR_REVERSE_RADAR_SWITCH_STATE_SET2} (0x4f500047).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setReverseRadarSwitchState(int state) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.radar.AbsBYDAutoRadarListener l) { throw new RuntimeException("Stub!"); }
}
