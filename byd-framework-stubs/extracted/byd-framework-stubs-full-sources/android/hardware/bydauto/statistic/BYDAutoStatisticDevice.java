package android.hardware.bydauto.statistic;

/** Permissions: {@code android.permission.BYDAUTO_STATISTIC_GET}, {@code android.permission.BYDAUTO_STATISTIC_SET} */
public final class BYDAutoStatisticDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final double AVERAGE_ELEC_CON_PHM_MAX = 99.9d;
    public static final double AVERAGE_ELEC_CON_PHM_MIN = -99.9d;
    public static final double AVERAGE_FUEL_CON_PHM_MAX = 51.1d;
    public static final double AVERAGE_FUEL_CON_PHM_MIN = 0.0d;
    public static final double AVERAGE_SPEED_MAX = 281.5d;
    public static final double AVERAGE_SPEED_MIN = 0.0d;
    public static final int CURVE_FLAG_INVALID = 0;
    public static final int CURVE_FLAG_VALID = 1;
    public static final int DEVICE_HAS_THE_FEATURE = 1;
    public static final int DEVICE_NOT_HAS_THE_FEATURE = 0;
    public static final int DEVICE_THE_FEATURE_LINK_ERROR = 65535;
    public static final int DEVICE_THE_FEATURE_NEVER_GET = 2;
    public static final int DRIVING_MILEAGE_CONFIG_DISABLE = 1;
    public static final int DRIVING_MILEAGE_CONFIG_SELECTABLE = 2;
    public static final int DRIVING_MILEAGE_MODE_DYNAMIC = 2;
    public static final int DRIVING_MILEAGE_MODE_INVALID = 0;
    public static final int DRIVING_MILEAGE_MODE_STANDARD = 1;
    public static final double ELEC_CONSUMPTION_MAX = 1676721.4d;
    public static final double ELEC_CONSUMPTION_MIN = -1000.0d;
    public static final int EV_PH_MAX = 1346;
    public static final int EV_PH_MIN = -700;
    public static final String FEATURE_FUEL_MILEAGE = "FuelMileage";
    public static final double FUEL_CONSUMPTION_MAX = 104857.4d;
    public static final double FUEL_CONSUMPTION_MIN = 0.0d;
    public static final int FUEL_PH_MAX = 510;
    public static final int FUEL_PH_MIN = 0;
    public static final int MESSAGE_3D9_SUBID_55 = 1;
    public static final int MESSAGE_3D9_SUBID_57 = 2;
    public static final int MESSAGE_OFFLINE = 0;
    public static final int MESSAGE_ONLINE = 1;
    public static final int MILEAGE_MAX = 99999;
    public static final int MILEAGE_MIN = 0;
    public static final int MILEAGE_ONE = 0;
    public static final int MILEAGE_TOTAL = 2;
    public static final int MILEAGE_TWO = 1;
    public static final int MILE_TOTAL_MAX = 99999999;
    public static final int MILE_TOTAL_MIN = 0;
    public static final int REMAINING_MAX = 100;
    public static final int REMAINING_MIN = 0;
    public static final int SOC_BATTERY_PERCENTAGE_MAX = 100;
    public static final int SOC_BATTERY_PERCENTAGE_MIN = 0;
    public static final int STATISTIC_COMMAND_BUSY = -2147482647;
    public static final int STATISTIC_COMMAND_FAILED = -2147482648;
    public static final int STATISTIC_COMMAND_INVALID_VALUE = -2147482645;
    public static final int STATISTIC_COMMAND_SUCCESS = 0;
    public static final int STATISTIC_COMMAND_TIMEOUT = -2147482646;
    public static final double STATISTIC_DRIVING_TIME_MAX;
    public static final double STATISTIC_DRIVING_TIME_MIN = 0.0d;
    public static final int STATISTIC_ELEC_DRIVING_RANGE_DEFAULT = 1023;
    public static final int STATISTIC_ELEC_DRIVING_RANGE_INVALID = 1000;
    public static final int STATISTIC_ELEC_DRIVING_RANGE_MAX;
    public static final int STATISTIC_ELEC_DRIVING_RANGE_MIN = 0;
    public static final double STATISTIC_ELEC_PERCENTAGE_MAX = 100.0d;
    public static final double STATISTIC_ELEC_PERCENTAGE_MIN = 0.0d;
    public static final int STATISTIC_FUEL_AD_MAX = 4095;
    public static final int STATISTIC_FUEL_AD_MIN = 0;
    public static final int STATISTIC_FUEL_DRIVING_RANGE_MAX;
    public static final int STATISTIC_FUEL_DRIVING_RANGE_MIN;
    public static final int STATISTIC_FUEL_PERCENTAGE_MAX = 100;
    public static final int STATISTIC_FUEL_PERCENTAGE_MIN = 0;
    public static final double STATISTIC_INSTANT_ELEC_CON_MAX = 2000.0d;
    public static final double STATISTIC_INSTANT_ELEC_CON_MIN = -2000.0d;
    public static final double STATISTIC_INSTANT_FUEL_CON_MAX;
    public static final double STATISTIC_INSTANT_FUEL_CON_MIN = 0.0d;
    public static final int STATISTIC_ISA_STATUS_FALSE = 2;
    public static final int STATISTIC_ISA_STATUS_INVALID = 0;
    public static final int STATISTIC_ISA_STATUS_TRUE = 1;
    public static final int STATISTIC_ISA_TRAFFIC_SIGN_TYPE_BEACON = 5;
    public static final int STATISTIC_ISA_TRAFFIC_SIGN_TYPE_INTERSECTION = 2;
    public static final int STATISTIC_ISA_TRAFFIC_SIGN_TYPE_INVALID = 0;
    public static final int STATISTIC_ISA_TRAFFIC_SIGN_TYPE_REDLIGHT = 3;
    public static final int STATISTIC_ISA_TRAFFIC_SIGN_TYPE_ROUNDABOUT = 1;
    public static final int STATISTIC_ISA_TRAFFIC_SIGN_TYPE_STOP = 4;
    public static final int STATISTIC_ISA_TRAFFIC_SIGN_TYPE_UNKNOWN = 6;
    public static final int STATISTIC_KEY_BATTERY_LEVEL_LOW = 1;
    public static final int STATISTIC_KEY_BATTERY_LEVEL_NORMAL = 2;
    public static final double STATISTIC_LAST_ELEC_CON_PHM_MAX = 99.9d;
    public static final double STATISTIC_LAST_ELEC_CON_PHM_MIN = -99.9d;
    public static final double STATISTIC_LAST_FUEL_CON_PHM_MAX;
    public static final double STATISTIC_LAST_FUEL_CON_PHM_MIN = 0.0d;
    public static final int STATISTIC_MILEAGE_MAX = 999999;
    public static final int STATISTIC_MILEAGE_MIN = 0;
    public static final double STATISTIC_TOTAL_ELEC_CONSUMPTION_MAX = 1676721.4d;
    public static final double STATISTIC_TOTAL_ELEC_CONSUMPTION_MIN = -1000.0d;
    public static final double STATISTIC_TOTAL_ELEC_CON_PHM_MAX = 99.9d;
    public static final double STATISTIC_TOTAL_ELEC_CON_PHM_MIN = -99.9d;
    public static final double STATISTIC_TOTAL_FUEL_CONSUMPTION_MAX;
    public static final double STATISTIC_TOTAL_FUEL_CONSUMPTION_MIN = 0.0d;
    public static final double STATISTIC_TOTAL_FUEL_CON_PHM_MAX;
    public static final double STATISTIC_TOTAL_FUEL_CON_PHM_MIN = 0.0d;
    public static final int STATISTIC_TOTAL_MILEAGE_MAX;
    public static final int STATISTIC_TOTAL_MILEAGE_MIN = 0;
    public static final int STATISTIC_WATER_TEMPERATURE_MAX = 255;
    public static final int STATISTIC_WATER_TEMPERATURE_MIN = 0;
    protected static final String TAG = "BYDAutoStatisticDevice";
    public static final int TARGET_MILEAGE1 = 2;
    public static final int TARGET_MILEAGE2 = 3;
    public static final int TARGET_TOTAL = 1;
    public static final double TRAVEL_TIME_MAX = 99999.0d;
    public static final double TRAVEL_TIME_MIN = 0.0d;
    public static final int UNIT_HP_100KM = 3;
    public static final int UNIT_HP_100MILES = 4;
    public static final int UNIT_INVALID = 0;
    public static final int UNIT_KW_100KM = 1;
    public static final int UNIT_KW_100MILES = 2;
    public static final int UNIT_TOTAL_FUEL_CONSUMPTION_GAL = 2;
    public static final int UNIT_TOTAL_FUEL_CONSUMPTION_INVALID = 0;
    public static final int UNIT_TOTAL_FUEL_CONSUMPTION_L = 1;
    static {
        STATISTIC_DRIVING_TIME_MAX = 0d;
        STATISTIC_ELEC_DRIVING_RANGE_MAX = 0;
        STATISTIC_FUEL_DRIVING_RANGE_MAX = 0;
        STATISTIC_FUEL_DRIVING_RANGE_MIN = 0;
        STATISTIC_INSTANT_FUEL_CON_MAX = 0d;
        STATISTIC_LAST_FUEL_CON_PHM_MAX = 0d;
        STATISTIC_TOTAL_FUEL_CONSUMPTION_MAX = 0d;
        STATISTIC_TOTAL_FUEL_CON_PHM_MAX = 0d;
        STATISTIC_TOTAL_MILEAGE_MAX = 0;
    }

    BYDAutoStatisticDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_TOTAL_ELEC_CON_PHM} (0x4a501030), {@code STATISTIC_MILEAGE1_ELEC_CON_PHKM} (0x00031062), {@code STATISTIC_MILEAGE2_ELEC_CON_PHKM} (0x000ca46c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getAverageElectricConsumption(int target) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTICS_AVERAGE_INSTANT_EV_LAST_200M_FLAG} (0x3d90601b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAverageEvCurveFlag() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTICS_AVERAGE_INSTANT_EV_LAST_200M} (0x3d906010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAverageEvLast200M() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_TOTAL_FUEL_CON_PHM} (0x4a507010), {@code STATISTIC_MILEAGE1_FULE_CON_PHKM} (0x000badd3), {@code STATISTIC_MILEAGE2_FULE_CON_PHKM} (0x00091090).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getAverageFuelConsumption(int target) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTICS_AVERAGE_INSTANT_FUEL_LAST_200M_FLAG} (0x3d906025).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAverageFuelCurveFlag() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTICS_AVERAGE_INSTANT_FUEL_LAST_200M} (0x3d90601c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAverageFuelLast200M() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_TOTAL_AVERAGE_SPEED} (0x3d906028), {@code STATISTIC_MILEAGE1_AVERAGE_SPEED} (0x0008d3f9), {@code STATISTIC_MILEAGE2_AVERAGE_SPEED} (0x0000ff15).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getAverageSpeed(int target) { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_DRIVING_TIME} (0x4a508024). */
    public double getDrivingTimeValue() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_EV_DRIVING_MILEAGE_CONFIG} (0x2450003e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEVDrivingMileageConfig() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_EV_DRIVING_MILEAGE_MODE} (0x2450003c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEVDrivingMileageMode() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_MILEAGE_EV} (0x4a504024). */
    public int getEVMileageValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_ELEC_DRIVING_RANGE} (0x4a50203e). */
    public int getElecDrivingRangeValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_ELEC_PERCENTAGE} (0x4a505038). */
    public double getElecPercentageValue() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_TOTAL_ELEC_CONSUMPTION} (0x3d906030), {@code STATISTIC_MILEAGE1_ELEC_CONSUMPTION} (0x0008964e), {@code STATISTIC_MILEAGE2_ELEC_CONSUMPTION} (0x00017c2f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getElectricConsumption(int target) { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_FUEL_AD_VALUE} (0x3d955010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getFuelADValue() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_TOTAL_FUEL_CONSUMPTION} (0x4a501010), {@code STATISTIC_MILEAGE1_FULE_CONSUMPTION} (0x00084deb), {@code STATISTIC_MILEAGE2_FULE_CONSUMPTION} (0x00032443).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getFuelConsumption(int target) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_FUEL_DRIVING_RANGE} (0x4a504038). */
    public int getFuelDrivingRangeValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_FUEL_PERCENTAGE} (0x4a507040). */
    public int getFuelPercentageValue() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_MILEAGE_HEV} (0x4a504010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getHEVMileageValue() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.statistic.BYDAutoStatisticDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_INSTANT_EV_CONSUME} (0x44500030). */
    public double getInstantElecConValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_INSTANT_FUEL_CONSUME} (0x4a501024). */
    public double getInstantFuelConValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_KEY_BATTERY_LEVEL} (0x18000010). */
    public int getKeyBatteryLevel() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_LAST_50KM_EQUAL_FUEL_CON} (0x4a507032).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getLast50KmEqualFuelConValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_LAST_ELEC_CON_PHM} (0x3d904032). */
    public double getLastElecConPHMValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_LAST_FUEL_CON_PHM} (0x3d904026). */
    public double getLastFuelConPHMValue() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_ONLINE_3D9_SUBID_55} (0x3d955000), {@code STATISTIC_ONLINE_3D9_SUBID_57} (0x3d957000).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMessage5sOnlineState(int id) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_DD_MILEAGE1} (0x4a503010), {@code STATISTIC_DD_MILEAGE2} (0x4a503024), {@code STATISTIC_TOTAL_MILEAGE} (0x4a502010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMileageNumber(int status) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_REMAINING_BATTERY_POWER} (0x44700028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRemainingBatteryPower() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_SOC_BATTERY_PERCENTAGE} (0x44400030).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSOCBatteryPercentage() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_SPEED_SIG_VDIS} (0x14400008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSpeedSignalVDisValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_TOTAL_ELEC_CON_PHM} (0x4a501030). */
    public double getTotalElecConPHMValue() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_TOTAL_ELEC_CON_PHM_UNIT} (0x4a501040).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTotalElecConPhmUnit() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_TOTAL_ELEC_CONSUMPTION} (0x3d906030). */
    public double getTotalElecConValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_TOTAL_FUEL_CON_PHM} (0x4a507010). */
    public double getTotalFuelConPHMValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_TOTAL_FUEL_CONSUMPTION} (0x4a501010). */
    public double getTotalFuelConValue() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_TOTAL_FUEL_CONSUMPTION_UNIT} (0x4a50102e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTotalFuelConsumptionUnit() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_TOTAL_MILEAGE} (0x4a502010). */
    public int getTotalMileageValue() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_DRIVING_TIME} (0x4a508024), {@code STATISTIC_MILEAGE1_DRIVE_TIME} (0x3d95a018), {@code STATISTIC_MILEAGE2_DRIVE_TIME} (0x3d95a02c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getTravelTime(int target) { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code STATISTIC_WATER_TEMPERATURE} (0x000cce5f). */
    public int getWaterTemperature() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code STATISTIC_FUEL_DRIVING_RANGE} (0x4a504038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int hasFeature(String feature) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, float value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.statistic.AbsBYDAutoStatisticListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.statistic.AbsBYDAutoStatisticListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public int sendIsaDataToAdas(int[] data) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code STATISTIC_EV_DRIVING_MILEAGE_MODE_SET} (0x1e00003a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setEVDrivingMileageMode(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code STATISTICS_ISA_ACCIDENT_AHEAD_STATUS_SET} (0x4b400060).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setISAAccidentAheadStatus(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code STATISTICS_ISA_CONSTRUCTION_ZONES_STATUS_SET} (0x4b40005e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setISAConstructionZonesStatus(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code STATISTICS_ISA_TRAFFIC_JAM_STATUS_SET} (0x4b40005c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setISATrafficJAMStatus(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code STATISTICS_ISA_TRAFFIC_SIGN_TYPE_SET} (0x4b400064).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setISATrafficSignType(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code STATISTICS_ISA_WRONG_WAY_DRIVER_STATUS_SET} (0x4b400062).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setISAWrongWayDriverStatus(int mode) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.statistic.AbsBYDAutoStatisticListener l) { throw new RuntimeException("Stub!"); }
}
