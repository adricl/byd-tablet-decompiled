package android.hardware.bydauto.energy;

/** Permissions: {@code android.permission.BYDAUTO_ENERGY_GET}, {@code android.permission.BYDAUTO_ENERGY_SET} */
public final class BYDAutoEnergyDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int BCM_STATE_CLOSE = 1;
    public static final int BCM_STATE_OPEN = 0;
    public static final int DC_WORK_MODE_STATE_BOOST = 1;
    public static final int DC_WORK_MODE_STATE_CLOSE = 0;
    public static final int DC_WORK_MODE_STATE_STEP_DOWN = 2;
    public static final int ENERGY_COMMAND_BUSY = -2147482647;
    public static final int ENERGY_COMMAND_FAILED = -2147482648;
    public static final int ENERGY_COMMAND_INVALID = -2147482645;
    public static final int ENERGY_COMMAND_SUCCESS = 0;
    public static final int ENERGY_COMMAND_TIMEOUT = -2147482646;
    public static final int ENERGY_MODE_EV = 1;
    public static final int ENERGY_MODE_FORCE_EV = 2;
    public static final int ENERGY_MODE_FUEL = 4;
    public static final int ENERGY_MODE_HEV = 3;
    public static final int ENERGY_MODE_KEEP = 5;
    public static final int ENERGY_MODE_STOP = 0;
    public static final int ENERGY_OPERATION_ECONOMY = 1;
    public static final int ENERGY_OPERATION_KEEP = 3;
    protected static final int ENERGY_OPERATION_MODE_ECO = 2;
    protected static final int ENERGY_OPERATION_MODE_NORMAL = 1;
    protected static final int ENERGY_OPERATION_MODE_SPORT = 3;
    public static final int ENERGY_OPERATION_MUDDY = 5;
    public static final int ENERGY_OPERATION_NORMAL = 3;
    public static final int ENERGY_OPERATION_SAND = 6;
    public static final int ENERGY_OPERATION_SNOW = 4;
    public static final int ENERGY_OPERATION_SPORT = 2;
    public static final int ENERGY_POWER_GENERATING = 1;
    public static final int ENERGY_POWER_GENERATION_END = 2;
    public static final int ENERGY_POWER_GENERATION_ERROR = 3;
    public static final int ENERGY_POWER_GENERATION_INVALID = 0;
    public static final int ENERGY_POWER_GENERATION_VALUE_MAX = 31;
    public static final int ENERGY_POWER_GENERATION_VALUE_MIN = 1;
    public static final int ENERGY_ROAD_SURFACE_COMMON = 1;
    public static final int ENERGY_ROAD_SURFACE_KEEP = 0;
    public static final int ENERGY_ROAD_SURFACE_MUDDY = 3;
    public static final int ENERGY_ROAD_SURFACE_ONE = 0;
    public static final int ENERGY_ROAD_SURFACE_SAND = 4;
    public static final int ENERGY_ROAD_SURFACE_SNOW = 2;
    public static final int ENERGY_ROAD_SURFACE_THREE = 1;
    public static final int ENERGY_STATE_DRIVE_ASSIST_DRIVING_MODE_1 = 24;
    public static final int ENERGY_STATE_DRIVE_ASSIST_DRIVING_MODE_2 = 25;
    public static final int ENERGY_STATE_DRIVE_ASSIST_DRIVING_MODE_3 = 26;
    public static final int ENERGY_STATE_DRIVE_ASSIST_FEEDBACK_MODE_1 = 27;
    public static final int ENERGY_STATE_DRIVE_ASSIST_FEEDBACK_MODE_2 = 28;
    public static final int ENERGY_STATE_DRIVE_ASSIST_FEEDBACK_MODE_3 = 29;
    public static final int ENERGY_STATE_ELECTRIC_POWER_FOUR_WHEEL_DRIVE = 1;
    public static final int ENERGY_STATE_ELECTRIC_POWER_FOUR_WHEEL_DRIVE_FEEDBACK = 4;
    public static final int ENERGY_STATE_ELECTRIC_POWER_FRONT_WHEEL_DRIVE = 2;
    public static final int ENERGY_STATE_ELECTRIC_POWER_FRONT_WHEEL_DRIVE_FEEDBACK = 5;
    public static final int ENERGY_STATE_ELECTRIC_POWER_REAR_WHEEL_DRIVE = 3;
    public static final int ENERGY_STATE_ELECTRIC_POWER_REAR_WHEEL_DRIVE_FEEDBACK = 6;
    public static final int ENERGY_STATE_FUEL_POWER_DRIVE = 17;
    public static final int ENERGY_STATE_GENERATE_ELECTRICITY = 18;
    public static final int ENERGY_STATE_HEV_FRONT_WHEEL_DRIVE_PARALLELING = 8;
    public static final int ENERGY_STATE_HEV_THREE_POWER = 7;
    public static final int ENERGY_STATE_HEV_TWO_POWER_FOUR_WHEEL_DRIVE = 9;
    public static final int ENERGY_STATE_HIGH_SPEED_GENERATE_ELECTRICITY = 22;
    public static final int ENERGY_STATE_HYBRID_POWER_FEEDBACK_MODE_1 = 14;
    public static final int ENERGY_STATE_HYBRID_POWER_FEEDBACK_MODE_2 = 15;
    public static final int ENERGY_STATE_HYBRID_POWER_FEEDBACK_MODE_3 = 16;
    public static final int ENERGY_STATE_HYBRID_POWER_LOW_POWER_OUTPUT = 10;
    public static final int ENERGY_STATE_HYBRID_POWER_RUNNING_GENERATE_ELECTRICITY_1 = 11;
    public static final int ENERGY_STATE_HYBRID_POWER_RUNNING_GENERATE_ELECTRICITY_2 = 12;
    public static final int ENERGY_STATE_HYBRID_POWER_RUNNING_GENERATE_ELECTRICITY_3 = 13;
    public static final int ENERGY_STATE_IDLING = 23;
    public static final int ENERGY_STATE_LOW_SPEED_GENERATE_ELECTRICITY_1 = 20;
    public static final int ENERGY_STATE_LOW_SPEED_GENERATE_ELECTRICITY_2 = 21;
    public static final int ENERGY_STATE_MAX = 255;
    public static final int ENERGY_STATE_NONE = 0;
    public static final int ENERGY_STATE_SERIES_FOUR_WHEEL_DRIVE_2 = 33;
    public static final int ENERGY_STATE_SERIES_MODE_2 = 30;
    public static final int ENERGY_STATE_SERIES_MODE_3 = 31;
    public static final int ENERGY_STATE_SERIES_MODE_4 = 32;
    public static final int ENERGY_STATE_SERIES_REAR_WHEEL_DRIVE = 19;
    protected static final String TAG = "BYDAutoEnergyDevice";

    BYDAutoEnergyDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code ENERGY_BCM_STATE} (0x12d00012).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBCMState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code ENERGY_DC_WORK_MODE} (0x36d00030).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDCWorkMode() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code ENERGY_MODE_INSTRUMENT} (0x34200024). */
    public int getEnergyMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code ENERGY_STATE} (0x34100018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEnergyState() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.energy.BYDAutoEnergyDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code ENERGY_OPERATION_MODE} (0x2120000e). */
    public int getOperationMode() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code ENERGY_POWER_GENERATION_STATE} (0x34f0000a). */
    public int getPowerGenerationState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code ENERGY_POWER_GENERATION_VALUE} (0x2610001f). */
    public int getPowerGenerationValue() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code ENERGY_ROAD_SURFACE_KIND} (0x46c0003e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRoadSurfacKind() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code ENERGY_ROAD_SURFACE_MODE} (0x24000033). */
    public int getRoadSurfaceMode() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.energy.AbsBYDAutoEnergyListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.energy.AbsBYDAutoEnergyListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code ENERGY_MODE_SET} (0x2bc00036).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setEnergyMode(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code ENERGY_OPERATION_MODE_SET} (0x2bc0001d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setOperationMode(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code ENERGY_ROAD_SURFACE_MODE_SET} (0x000eea89).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setRoadSurfaceMode(int value) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.energy.AbsBYDAutoEnergyListener l) { throw new RuntimeException("Stub!"); }
}
