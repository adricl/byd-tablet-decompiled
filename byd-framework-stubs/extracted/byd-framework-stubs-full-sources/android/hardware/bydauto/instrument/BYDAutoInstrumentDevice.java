package android.hardware.bydauto.instrument;

/** Permissions: {@code android.permission.BYDAUTO_INSTRUMENT_COMMON}, {@code android.permission.BYDAUTO_INSTRUMENT_GET}, {@code android.permission.BYDAUTO_INSTRUMENT_SET} */
public final class BYDAutoInstrumentDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int ACC_COLOR_BEAUTIFUL_RED = 6;
    public static final int ACC_COLOR_BEAUTIFUL_YELLOW = 6;
    public static final int ACC_COLOR_BLUE = 5;
    public static final int ACC_COLOR_GREEN = 4;
    public static final int ACC_COLOR_GREEN_MAIN = 6;
    public static final int ACC_COLOR_INVALID = 0;
    public static final int ACC_COLOR_RED = 3;
    public static final int ACC_COLOR_WHITE = 1;
    public static final int ACC_COLOR_YELLOW = 2;
    public static final int ACC_SPEED_MAX = 240;
    public static final int ACC_SPEED_MIN = 0;
    public static final int AIR_HEATING_OIL_WARN_ALARM = 2;
    public static final int AIR_HEATING_OIL_WARN_INVALID = 0;
    public static final int AIR_HEATING_OIL_WARN_NORMAL = 1;
    public static final int APPOINTMENT_HOUR_MAX = 23;
    public static final int APPOINTMENT_HOUR_MIN = 0;
    public static final int APPOINTMENT_MINUTE_MAX = 59;
    public static final int APPOINTMENT_MINUTE_MIN = 0;
    public static final int AVERAGE_SPEED_MAX = 240;
    public static final int AVERAGE_SPEED_MIN = 0;
    public static final int BAR = 1;
    public static final int BATTERY_PERCENT_PH_MAX = 100;
    public static final int BATTERY_PERCENT_PH_MIN = 0;
    public static final int BODY_POSITION_CENTER = 1;
    public static final int BODY_POSITION_HEAD_LEFT = 2;
    public static final int BODY_POSITION_HEAD_RIGHT = 3;
    public static final int BODY_POSITION_INVALID = 0;
    public static final int BOTH_GRAY = 1;
    public static final int BOTH_GREEN = 4;
    public static final int BOTH_YELLOW_MODE_LKS = 9;
    public static final int B_MALFUNCTION_ABS = 14;
    public static final int B_MALFUNCTION_ACC_SYSTEM = 36;
    public static final int B_MALFUNCTION_AC_HEAT_MANAGEMENT = 7;
    public static final int B_MALFUNCTION_AEB_SYSTEM = 43;
    public static final int B_MALFUNCTION_AUTO_NETWORK = 24;
    public static final int B_MALFUNCTION_BRAKE_FLUID_LEVEL_LOW = 3;
    public static final int B_MALFUNCTION_BRAKE_PAD = 32;
    public static final int B_MALFUNCTION_BRAKE_SYSTEM = 4;
    public static final int B_MALFUNCTION_BRAKE_SYSTEM_1 = 11;
    public static final int B_MALFUNCTION_BSD_SYSTEM = 40;
    public static final int B_MALFUNCTION_CHARGING_EQUIPMENT = 2;
    public static final int B_MALFUNCTION_CHARGING_SYSTEM = 20;
    public static final int B_MALFUNCTION_COOLANT_LEVEL_LOW = 6;
    public static final int B_MALFUNCTION_ELECTRONIC_PARKING_SYSTEM = 12;
    public static final int B_MALFUNCTION_ENGINE_ACCESSORY_FUNCTION_LIMIT = 26;
    public static final int B_MALFUNCTION_ENGINE_OIL_DETECTING_SYSTEM = 9;
    public static final int B_MALFUNCTION_ENGINE_OIL_PRESSURE_LACK = 8;
    public static final int B_MALFUNCTION_ENGINE_SYSTEM = 25;
    public static final int B_MALFUNCTION_ESP = 30;
    public static final int B_MALFUNCTION_EV_FUNCTION_LIMIT = 18;
    public static final int B_MALFUNCTION_FCW_SYSTEM = 41;
    public static final int B_MALFUNCTION_GEAR_SYSTEM = 19;
    public static final int B_MALFUNCTION_HDC = 31;
    public static final int B_MALFUNCTION_HMA_SYSTEM = 39;
    public static final int B_MALFUNCTION_IRON_BATTERY = 22;
    public static final int B_MALFUNCTION_IRON_BATTERY_POWER_LOW = 23;
    public static final int B_MALFUNCTION_LDW = 47;
    public static final int B_MALFUNCTION_LEFT_HEADLAMP_SYSTEM = 33;
    public static final int B_MALFUNCTION_LKS = 46;
    public static final int B_MALFUNCTION_LOW_VOLTAGE_POWER_SUPPLY_SYSTEM = 15;
    public static final int B_MALFUNCTION_MAX = 48;
    public static final int B_MALFUNCTION_MEMORY_SYSTEM = 35;
    public static final int B_MALFUNCTION_MULTIFUNCTION_VIDEO_CONTROLLER = 44;
    public static final int B_MALFUNCTION_MULTI_VIDEO_CON_FUNCTION_LIMIT = 45;
    public static final int B_MALFUNCTION_PARKING_POWER_LACK = 13;
    public static final int B_MALFUNCTION_PEDESTRIAN_DETECTION_SYSTEM = 37;
    public static final int B_MALFUNCTION_POWER_GENERATION_SYSTEM = 16;
    public static final int B_MALFUNCTION_POWER_SYSTEM = 17;
    public static final int B_MALFUNCTION_PRE_MILLIMETER_WAVE_RADAR = 42;
    public static final int B_MALFUNCTION_RIGHT_HEADLAMP_SYSTEM = 34;
    public static final int B_MALFUNCTION_SRS = 29;
    public static final int B_MALFUNCTION_START_TYPE_IRON_BATTERY_SYSTEM = 21;
    public static final int B_MALFUNCTION_STEERING_SYSTEM = 5;
    public static final int B_MALFUNCTION_TIRE_PRESSURE_DETECTING_SYSTEM = 10;
    public static final int B_MALFUNCTION_TRAFFIC_SIGN_RECOGNITION_SYSTEM = 38;
    public static final int B_MALFUNCTION_TRANSMISSION_FUNCTION_LIMIT = 27;
    public static final int B_MALFUNCTION_TRANSMISSION_SYSTEM = 28;
    public static final int B_MALFUNCTION_VEHICLE_CHARGING_SYSTEM = 1;
    public static final int CALL_DIAL = 1;
    public static final int CALL_HANG_UP = 2;
    public static final int CALL_TIME_HOUR_INVALID = 255;
    public static final int CALL_TIME_HOUR_MAX = 99;
    public static final int CALL_TIME_HOUR_MIN = 0;
    public static final int CALL_TIME_MINUTE_INVALID = 255;
    public static final int CALL_TIME_MINUTE_MAX = 59;
    public static final int CALL_TIME_MINUTE_MIN = 0;
    public static final int CALL_TIME_SECOND_INVALID = 255;
    public static final int CALL_TIME_SECOND_MAX = 59;
    public static final int CALL_TIME_SECOND_MIN = 0;
    public static final int CAMERA_TYPE_BUS_LANE = 8;
    public static final int CAMERA_TYPE_EMERGENCY_LANE = 17;
    public static final int CAMERA_TYPE_HOV_LANE = 18;
    public static final int CAMERA_TYPE_INTERVAL_IN = 5;
    public static final int CAMERA_TYPE_INTERVAL_OUT = 9;
    public static final int CAMERA_TYPE_LEFT_TURN_FOBIDDEN = 12;
    public static final int CAMERA_TYPE_NONE = 0;
    public static final int CAMERA_TYPE_NO_ADMITTANCE = 15;
    public static final int CAMERA_TYPE_NO_AUTO_LANE = 6;
    public static final int CAMERA_TYPE_NO_PARKING = 10;
    public static final int CAMERA_TYPE_NO_PASS_GREEN_LIGHT = 19;
    public static final int CAMERA_TYPE_ONE_WAY_ROAD = 11;
    public static final int CAMERA_TYPE_PECCANRY = 3;
    public static final int CAMERA_TYPE_PRESS_PHOTO = 4;
    public static final int CAMERA_TYPE_RIGHT_TURN_FOBIDDEN = 13;
    public static final int CAMERA_TYPE_SECURITY_MONITORING = 7;
    public static final int CAMERA_TYPE_SPEED_LIMITED = 1;
    public static final int CAMERA_TYPE_TRAFFIC_LIGHT = 2;
    public static final int CAMERA_TYPE_U_TURN_FOBIDDEN = 14;
    public static final int CAMERA_TYPE_VEHICLE_LIMITED = 16;
    public static final int CAM_REMAINING_MILEAGE_MAX = 16777214;
    public static final int CAM_REMAINING_MILEAGE_MIN = 0;
    public static final int CHARGE_OPTION_HOUR = 1;
    public static final int CHARGE_OPTION_INVALID = 0;
    public static final int CHARGE_OPTION_MINUTE = 2;
    public static final int CHARGE_PERCENT_MAX = 100;
    public static final int CHARGE_PERCENT_MIN = 0;
    public static final double CHARGE_POWER_MAX = 100.0d;
    public static final double CHARGE_POWER_MIN = -50.0d;
    public static final int CLEAR_FAULT_FINISH = 1;
    public static final int CLEAR_FAULT_INVALID = 0;
    public static final int CLEAR_INFO_AVERAGE_ENERGY_CONSUMPTION_LATEST_50KM = 5;
    public static final int CLEAR_INFO_AVERAGE_SPEED = 3;
    public static final int CLEAR_INFO_EXTERNAL_CHARGE_POWER = 2;
    public static final int CLEAR_INFO_FUEL_CONSUMPTION = 1;
    public static final int CLEAR_INFO_TRAVEL_TIME = 4;
    public static final int COLOR_INVALID = 0;
    public static final int COLOR_RED = 3;
    public static final int COLOR_WHITE = 1;
    public static final int COLOR_YELLOW = 2;
    public static final int CONTINUE_ALARM = 11;
    public static final int COUNTDOWN_HOUR_MAX = 23;
    public static final int COUNTDOWN_HOUR_MIN = 0;
    public static final int COUNTDOWN_MINUTE_MAX = 59;
    public static final int COUNTDOWN_MINUTE_MIN = 0;
    public static final int DASHBOARD_ALARM = 0;
    public static final int DASHBOARD_NOT_ALARM = 1;
    public static final int DD_2IN1_FAULT_ENGINE_SPPED_HIGH = 91;
    public static final int DD_2IN1_FAULT_YUN_ABS_SYS = 98;
    public static final int DD_2IN1_FAULT_YUN_BRAKING_SYS_FAILUE = 95;
    public static final int DD_2IN1_FAULT_YUN_COOLANT_TEMP_HIGH = 106;
    public static final int DD_2IN1_FAULT_YUN_ENGINE = 97;
    public static final int DD_2IN1_FAULT_YUN_ESP = 99;
    public static final int DD_2IN1_FAULT_YUN_LOW_OIL_PRESS = 94;
    public static final int DD_2IN1_FAULT_YUN_LOW_VOLT_POWER_SUPPLY_SYS = 96;
    public static final int DD_2IN1_FAULT_YUN_OK = 105;
    public static final int DD_2IN1_FAULT_YUN_POWER_BATTARY = 103;
    public static final int DD_2IN1_FAULT_YUN_POWER_SYS = 104;
    public static final int DD_2IN1_FAULT_YUN_SRS = 100;
    public static final int DD_2IN1_FAULT_YUN_STEERING_SYS = 101;
    public static final int DD_2IN1_FAULT_YUN_TYRE_PRESS = 102;
    public static final int DD_FAULT_ACCELERATION_BREAK_PEDAL = 89;
    public static final int DD_FAULT_AC_WARM_DIESEL = 17;
    public static final int DD_FAULT_ADAPTIVE_CRUISE_LIMITED = 83;
    public static final int DD_FAULT_ADAPT_GEARBOX = 31;
    public static final int DD_FAULT_AIR_HOT_MANAGEMENT_FAILURE = 68;
    public static final int DD_FAULT_AP_LIMITED = 38;
    public static final int DD_FAULT_AUTO_EMERGENCY_BRAKING_LIMITED = 79;
    public static final int DD_FAULT_BATTERY_LOW = 92;
    public static final int DD_FAULT_BLIND_SPOT_MONITORING_LIMITED = 85;
    public static final int DD_FAULT_CAR_CHARGE_SYSTEM = 20;
    public static final int DD_FAULT_CELL_LOE_POWER = 33;
    public static final int DD_FAULT_CELL_LOW_POWER_AC_LIMITED = 43;
    public static final int DD_FAULT_CELL_LOW_POWER_DRIVE_LIMITED = 44;
    public static final int DD_FAULT_CELL_TEMP_AC_LIMITED = 42;
    public static final int DD_FAULT_CHARGE_POT_NOT_CLOSE = 34;
    public static final int DD_FAULT_CHECK_BRAKE_PAD = 76;
    public static final int DD_FAULT_CHECK_BRAKING_SYSTEM = 46;
    public static final int DD_FAULT_CHECK_CAR_NETWORK = 52;
    public static final int DD_FAULT_CHECK_ENGINE_SYSTEM = 60;
    public static final int DD_FAULT_CHECK_FRONT_WAVE_RADAR = 78;
    public static final int DD_FAULT_CHECK_GEAR_SYSTEM = 74;
    public static final int DD_FAULT_CHECK_HDC_SYSTEM = 75;
    public static final int DD_FAULT_CHECK_IRON_BATTERY_SYSTEM = 59;
    public static final int DD_FAULT_CHECK_MEMORY_SYATEM = 40;
    public static final int DD_FAULT_CHECK_MOONROOF = 41;
    public static final int DD_FAULT_CHECK_MUL_VIDEO_CONTROLLER = 77;
    public static final int DD_FAULT_CHECK_OIL_MONITORING_SYSTEM = 71;
    public static final int DD_FAULT_CHECK_PERSON_DETECTION_SYSTEM = 81;
    public static final int DD_FAULT_CHECK_POWERTRAIN = 49;
    public static final int DD_FAULT_CHECK_POWER_GENERATION_SYSTEM = 73;
    public static final int DD_FAULT_CHECK_PREDICTIVE_COLLISION_WARNING_SYSTEM = 80;
    public static final int DD_FAULT_CHECK_SAFETYBELT_SYSTEM = 39;
    public static final int DD_FAULT_CHECK_SRS_SYSTEM = 65;
    public static final int DD_FAULT_CHECK_TRANSMISSION_SYSTEM = 53;
    public static final int DD_FAULT_CHECK_TRANSMISSION_SYSTEM_SEC = 54;
    public static final int DD_FAULT_DISCHARGE_DEVICE = 18;
    public static final int DD_FAULT_DISCHARGE_STOP = 32;
    public static final int DD_FAULT_ENGINE_ASSESSORY_FUNC_LIMITED = 61;
    public static final int DD_FAULT_ENGINE_COOLANT_TEMP_HIGH = 87;
    public static final int DD_FAULT_ENGINE_COOLANT_TEMP_HIGH_SAFE_PARK = 88;
    public static final int DD_FAULT_ENGINE_START_FAILED = 66;
    public static final int DD_FAULT_ENTER_FORCED_EV = 22;
    public static final int DD_FAULT_EV_FUNC_LIMITED = 56;
    public static final int DD_FAULT_EXIT_SMART_DRIVING_MODE_MANUAL_TAKEOVER = 57;
    public static final int DD_FAULT_GPF_REBUILD = 25;
    public static final int DD_FAULT_HIGH_CLUTCH_TEMPERATURE = 63;
    public static final int DD_FAULT_HIGH_OIL_LEVEL = 70;
    public static final int DD_FAULT_HIGH_TRANSMISSION_OIL_TEMPERATURE = 64;
    public static final int DD_FAULT_INSUFFICIENT_OIL_PRESSURE = 48;
    public static final int DD_FAULT_IRON_BATTERY_FAILURE = 51;
    public static final int DD_FAULT_KEY_LOW_POWER = 27;
    public static final int DD_FAULT_KEY_NOT_DETECTED = 26;
    public static final int DD_FAULT_KEY_NOT_DETECTED_IN_CAR = 29;
    public static final int DD_FAULT_KEY_NOT_DETECTED_READER = 28;
    public static final int DD_FAULT_LANE_DEPARTURE_FUNC_LIMITED = 84;
    public static final int DD_FAULT_LANE_KEEPING_LIMITED = 82;
    public static final int DD_FAULT_LINK_ERROR_KEY_DAY = 24;
    public static final int DD_FAULT_LINK_ERROR_KEY_HOUR = 25;
    public static final int DD_FAULT_LOW_BATTERY_LIMITED_POWER = 55;
    public static final int DD_FAULT_LOW_BRAKE_FLUID_LEVEL = 47;
    public static final int DD_FAULT_LOW_COOLANT_LEVEL = 67;
    public static final int DD_FAULT_LOW_OIL_LEVEL = 69;
    public static final int DD_FAULT_LOW_POWER_LIMIT = 21;
    public static final int DD_FAULT_LOW_TYRE_PRESSURE = 72;
    public static final int DD_FAULT_LOW_VOLTAGE_POWER_SUPPLY_SYSTEM_FAILURE = 50;
    public static final int DD_FAULT_NEED_CHARGE = 36;
    public static final int DD_FAULT_NEED_MAINTAIN = 23;
    public static final int DD_FAULT_NOTICE_ABS_SYSTEM = 0;
    public static final int DD_FAULT_NOTICE_ADD_FUEL = 90;
    public static final int DD_FAULT_NOTICE_EPB = 1;
    public static final int DD_FAULT_NOTICE_EPB_NOT_RELEASED = 2;
    public static final int DD_FAULT_NOTICE_ESP_SYSTEM = 3;
    public static final int DD_FAULT_NOTICE_FRONT_LIGHT_STSTEM = 4;
    public static final int DD_FAULT_NOTICE_LEAVE_CAR = 5;
    public static final int DD_FAULT_NOTICE_LF_LIGHT_STSTEM = 6;
    public static final int DD_FAULT_NOTICE_LV_SUPPLY = 7;
    public static final int DD_FAULT_NOTICE_PARK_SYSTEM = 8;
    public static final int DD_FAULT_NOTICE_PARK_WEAK = 9;
    public static final int DD_FAULT_NOTICE_POWER_SYSTEM = 93;
    public static final int DD_FAULT_NOTICE_RF_LIGHT_STSTEM = 10;
    public static final int DD_FAULT_NOTICE_STEERING_SYSTEM = 11;
    public static final int DD_FAULT_NOTICE_TRYE_PRES_DET = 12;
    public static final int DD_FAULT_OUT_CHARGE_DEVICE = 19;
    public static final int DD_FAULT_PARK_BRAKE_UNRELEASED = 37;
    public static final int DD_FAULT_REMOTE_DRIVING_SUSPENDED = 45;
    public static final int DD_FAULT_SMART_CAMERA_USELESS = 86;
    public static final int DD_FAULT_SMART_DRIVING_FAILURE_MANUAL_TAKEOVER = 58;
    public static final int DD_FAULT_SWITCH_TO_P_GEAR = 35;
    public static final int DD_FAULT_TRANSMISSION_FUNC_LIMITED = 62;
    public static final int DD_FAULT_WASH_ELEC_GATE = 30;
    public static final int DD_INDIRECT_TYPE_PRES_LF = 13;
    public static final int DD_INDIRECT_TYPE_PRES_LR = 14;
    public static final int DD_INDIRECT_TYPE_PRES_RF = 15;
    public static final int DD_INDIRECT_TYPE_PRES_RR = 16;
    public static final int DEFAULT_STATE = 0;
    public static final int DEGREE_CENTIGRADE = 1;
    public static final int DEGREE_FAHRENHEIT = 2;
    public static final int DESTINATION_STATE_NOT_SET = 1;
    public static final int DESTINATION_STATE_SET_DONE = 2;
    public static final int DEVICE_HAS_THE_FEATURE = 1;
    public static final int DEVICE_HAS_THE_MALFUNCTION = 1;
    public static final int DEVICE_NOT_HAS_THE_FEATURE = 0;
    public static final int DEVICE_NOT_HAS_THE_MALFUNCTION = 0;
    public static final int DEVICE_THE_FEATURE_LINK_ERROR = 65535;
    public static final int DEVICE_THE_FEATURE_NEVER_GET = 2;
    public static final int DIRECT_EAST = 3;
    public static final int DIRECT_INVALID = 0;
    public static final int DIRECT_NORTH = 1;
    public static final int DIRECT_NORTHEAST = 2;
    public static final int DIRECT_NORTHWEST = 8;
    public static final int DIRECT_SOUTH = 5;
    public static final int DIRECT_SOUTHEAST = 4;
    public static final int DIRECT_WEST = 7;
    public static final int DIRECT_WESTSOUTH = 6;
    public static final int DISCHARGE_CONNECTING = 1;
    public static final int DISCHARGE_DOING = 2;
    public static final int DISCHARGE_FAILED = 4;
    public static final int DISCHARGE_FINISH = 3;
    public static final int DISCHARGE_INVALID = 0;
    public static final double DISCHARGE_MAX = 100.0d;
    public static final double DISCHARGE_MIN = 0.0d;
    public static final int DISCHARGE_NOT_DISPLAY = 4095;
    public static final int DISCHARGE_VTOL = 1;
    public static final int DISCHARGE_VTOV = 2;
    public static final int DISPLAY_CHARGE_APPOINTMENT_CHARGING = 6;
    public static final int DISPLAY_CHARGE_APPOINTMENT_COUNTDOWN = 7;
    public static final int DISPLAY_CHARGE_OVER = 4;
    public static final int DISPLAY_CHARGE_PAUSING = 5;
    public static final int DISPLAY_CHARGING = 3;
    public static final int DISPLAY_CONNECTING = 2;
    public static final int DISPLAY_FRONTCAR_NODISPLAY_DISTANCE = 1;
    public static final int DISTANCE_INVALID = 0;
    public static final int DISTANCE_MAX = 16777214;
    public static final int DISTANCE_MIN = 0;
    public static final int DOOR_HOOD = 5;
    public static final int DOOR_LEFT_FRONT = 1;
    public static final int DOOR_LEFT_REAR = 3;
    public static final int DOOR_LUGGAGE_DOOR = 6;
    public static final int DOOR_RIGHT_FRONT = 2;
    public static final int DOOR_RIGHT_REAR = 4;
    public static final int DOOR_STATE_CLOSED = 0;
    public static final int DOOR_STATE_OPEN = 1;
    public static final double DRIVE_MILEAGE_MAX = 9999.9d;
    public static final double DRIVE_MILEAGE_MIN = 0.0d;
    public static final double DRIVE_TIME_MAX = 99.9d;
    public static final double DRIVE_TIME_MIN = 0.0d;
    public static final int DRIVING_INFO_INVALID = 0;
    public static final int DRIVING_INFO_NEXT = 2;
    public static final int DRIVING_INFO_PREVIOUS = 1;
    public static final int ENERY_CONSUMPTION_DISPLAY_NO = 1;
    public static final int ENERY_CONSUMPTION_DISPLAY_RESERVED = 3;
    public static final int ENERY_CONSUMPTION_DISPLAY_VAILID = 0;
    public static final int ENERY_CONSUMPTION_DISPLAY_YES = 2;
    public static final int EXP_NOT_DISPLAY = 1;
    public static final int EXP_SETTING = 2;
    public static final int EXP_TIME_COUNT = 3;
    public static final double EXTERNAL_CHARGE_POWER_PH_MAX = 9999.9d;
    public static final double EXTERNAL_CHARGE_POWER_PH_MIN = 0.0d;
    public static final double EXTERNAL_CHARGING_POWER_MAX = 10000.0d;
    public static final double EXTERNAL_CHARGING_POWER_MIN = 0.0d;
    public static final int FAULT_CRUISE_MAIN_INDICATOR = 0;
    public static final int FAULT_CRUISE_MAIN_INDICATOR_COLOR = 0;
    public static final int FAULT_INDICATOR_025HZ = 3;
    public static final int FAULT_INDICATOR_05HZ = 4;
    public static final int FAULT_INDICATOR_1HZ = 5;
    public static final int FAULT_INDICATOR_2HZ = 6;
    public static final int FAULT_INDICATOR_4HZ = 7;
    public static final int FAULT_INDICATOR_COLOR_BLUE = 5;
    public static final int FAULT_INDICATOR_COLOR_GREEN = 4;
    public static final int FAULT_INDICATOR_COLOR_INVALID = 0;
    public static final int FAULT_INDICATOR_COLOR_RED = 3;
    public static final int FAULT_INDICATOR_COLOR_WHITE = 1;
    public static final int FAULT_INDICATOR_COLOR_YELLOW = 2;
    public static final int FAULT_INDICATOR_INVALID = 0;
    public static final int FAULT_INDICATOR_LIGHT = 1;
    public static final int FAULT_INDICATOR_QUENCH = 2;
    public static final String FEATURE_CON_DIS_UNIT = "ConDisUnit";
    public static final String FEATURE_ENERGY_DISPLAY = "InstrumentEnergyDisplay";
    public static final String FEATURE_POWER_UNIT = "PowerUnit";
    public static final String FEATURE_PRESS_UNIT = "PressUnit";
    public static final String FEATURE_TEMP_UNIT = "TempUnit";
    public static final int FEEDBACK_INVALID = 0;
    public static final int FIRST_GEAR = 1;
    public static final int FIRST_GEAR_SPACING = 3;
    public static final int FIRST_MENU_MAX = 7;
    public static final int FIRST_MENU_MIN = 0;
    public static final int FORTH_GEAR = 4;
    public static final int FORTH_GEAR_SPACING = 6;
    public static final int FOUR_HZ_LIGHT = 7;
    public static final int FUEL_CONSUMPTION_AND_DISTANCE_UNIT = 3;
    public static final int FUEL_CONSUMPTION_UNIT = 5;
    public static final int GROUND_BAD = 4;
    public static final int GUN_UNLOCK = 7;
    public static final int HP = 2;
    public static final int INFOR_LENGTH_MAX = 255;
    public static final int INFOR_LENGTH_MIN = 0;
    public static final int INSTRUMENT_AIR_HEATING_DISPLAY = 2;
    public static final int INSTRUMENT_AIR_HEATING_INVALID = 0;
    public static final int INSTRUMENT_AIR_HEATING_NODISPLAY = 1;
    public static final int INSTRUMENT_ALARM_BUZZLE_ATATE_OFF = 0;
    public static final int INSTRUMENT_ALARM_BUZZLE_ATATE_ON = 1;
    public static final int INSTRUMENT_BACKLIGHT_BRIGHTNESS_MAX = 22;
    public static final int INSTRUMENT_BACKLIGHT_BRIGHTNESS_MIN = 1;
    public static final int INSTRUMENT_BACKLIGHT_MODE_AUTO = 1;
    public static final int INSTRUMENT_BACKLIGHT_MODE_OFF = 0;
    public static final int INSTRUMENT_BACKLIGHT_MODE_ON = 1;
    public static final int INSTRUMENT_BACKLIGHT_MODE_RELATE = 2;
    public static final int INSTRUMENT_COMMAND_BUSY = -2147482647;
    public static final int INSTRUMENT_COMMAND_FAILED = -2147482648;
    public static final int INSTRUMENT_COMMAND_INVALID_VALUE = -2147482645;
    public static final int INSTRUMENT_COMMAND_SUCCESS = 0;
    public static final int INSTRUMENT_COMMAND_TIMEOUT = -2147482646;
    public static final int INSTRUMENT_DIRECT_TYRE_PRES__DISPLAY = 2;
    public static final int INSTRUMENT_DIRECT_TYRE_PRES__INVALID = 0;
    public static final int INSTRUMENT_DIRECT_TYRE_PRES__NODISPLAY = 1;
    public static final int INSTRUMENT_ENERGEY_DISPLAY_INVALID = 0;
    public static final int INSTRUMENT_ENERGEY_DISPLAY_REMAINING_MILEAGE = 1;
    public static final int INSTRUMENT_ENERGEY_DISPLAY_SOC = 2;
    public static final int INSTRUMENT_FUEL_LOW_ALARM_NO = 1;
    public static final int INSTRUMENT_FUEL_LOW_ALARM_YES = 0;
    public static final int INSTRUMENT_LCD_SCREEN = 2;
    public static final int INSTRUMENT_NAVI_GO_COMPANY = 2;
    public static final int INSTRUMENT_NAVI_GO_HOME = 1;
    public static final int INSTRUMENT_PEN_DUAN_SCREEN = 1;
    public static final int INSTRUMENT_ROAD_NAME_CHECK_INVALID = 2;
    public static final int INSTRUMENT_ROAD_NAME_CHECK_VALID = 1;
    public static final int INSTRUMENT_UNIT_INSTANT_FUELCON_INVALID = 0;
    public static final int INSTRUMENT_UNIT_INSTANT_FUELCON_KM_L = 2;
    public static final int INSTRUMENT_UNIT_INSTANT_FUELCON_L_100KM = 1;
    public static final int INSTRUMENT_UNIT_INSTANT_FUELCON_L_H = 4;
    public static final int INSTRUMENT_UNIT_INSTANT_FUELCON_MPG = 3;
    public static final int INSTRUMET_ACCELEROMETER_VIEW = 8;
    public static final int INSTRUMET_ADAS_VIEW = 6;
    public static final int INSTRUMET_CHARGE_VIEW = 4;
    public static final int INSTRUMET_DISCHARGE_VIEW = 5;
    public static final int INSTRUMET_DRIVING_VIEW = 1;
    public static final int INSTRUMET_FAULT_VIEW = 3;
    public static final int INSTRUMET_INVALID_VIEW = 0;
    public static final int INSTRUMET_MENU_VIEW = 2;
    public static final int INSTRUMET_TRAVEL_VIEW = 7;
    public static final int INTERFACE_CLOSE = 2;
    public static final int INTERFACE_DISPLAY = 1;
    public static final int INTERFACE_INVALID = 0;
    public static final int INTERFACE_NOT_DISPLAY = 2;
    public static final int INTERFACE_OPEN = 1;
    public static final int IN_BOTH_SIDE = 3;
    public static final int IN_LEFT_SIDE = 1;
    public static final int IN_RIGHT_SIDE = 2;
    public static final int KEY_DETECTION_REMINDER_INVALID = 0;
    public static final int KEY_DETECTION_REMINDER_KEY_LEAVING = 2;
    public static final int KEY_DETECTION_REMINDER_NO_KEY = 1;
    public static final int KM_P_L_AND_KM = 2;
    public static final int KM_P_L_UNIT = 2;
    public static final int KPA = 3;
    public static final int KW = 1;
    public static final int KWH_P_100KM_AND_KM = 5;
    public static final int KWH_P_100MI_AND_MILE = 6;
    public static final int LARGER_FEEDBACK = 2;
    public static final int LEFT_DEVIATION = 1;
    public static final int LEFT_GRAY_RIGHT_GREEN = 2;
    public static final int LEFT_GRAY_RIGHT_RED = 7;
    public static final int LEFT_GREEN_RIGHT_GRAY = 3;
    public static final int LEFT_GREEN_RIGHT_RED = 8;
    public static final int LEFT_LINE = 1;
    public static final int LEFT_RED_RIGHT_GRAY = 5;
    public static final int LEFT_RED_RIGHT_GREEN = 6;
    public static final int LEFT_RED_RIGHT_YELLOW = 10;
    public static final int LEFT_YELLOW_RIGHT_RED = 11;
    public static final int LIGHT_INVALID = 0;
    public static final int LIGHT_OFF = 2;
    public static final int LIGHT_ON = 1;
    public static final int LIMITED_POWER = 6;
    public static final int LINE_GRAY_DASH = 1;
    public static final int LINE_GREEN_DASH = 2;
    public static final int LINE_INVALID = 0;
    public static final int LINE_RED_SOLID = 4;
    public static final int LINE_YELLOW_DASH = 3;
    public static final int LINK_ERROR_KEY_DAY = 0;
    public static final int LINK_ERROR_KEY_HOUR = 1;
    public static final int LINK_ERR_DAY_MAX = 7;
    public static final int LINK_ERR_DAY_MIN = 1;
    public static final int LINK_ERR_HOUR_MAX = 23;
    public static final int LINK_ERR_HOUR_MIN = 1;
    public static final int LINK_NORMAL = 0;
    public static final int LOW_TEMPERATURE = 8;
    public static final int L_P_100KM_AND_KM = 1;
    public static final int L_P_100KM_UNIT = 1;
    public static final int L_P_H_UNIT = 4;
    public static final int MAINTENANCE_MILEAGE = 2;
    public static final int MAINTENANCE_MILEAGE_KILOMETER_MAX = 34001;
    public static final int MAINTENANCE_MILEAGE_KILOMETER_MIN = 0;
    public static final int MAINTENANCE_TIME = 1;
    public static final int MAINTENANCE_TIME_DAY_MAX = 991;
    public static final int MAINTENANCE_TIME_DAY_MIN = 0;
    public static final int MALFUNCTION_ABS_SYSTEM = 6;
    public static final int MALFUNCTION_AC_CHARGING_EQUIPMENT = 50;
    public static final int MALFUNCTION_AC_HEAT_MANAGEMENT = 25;
    public static final int MALFUNCTION_ADAPTIVE_CRUISE_CONTROL_SYSTEM = 41;
    public static final int MALFUNCTION_BATTERY = 16;
    public static final int MALFUNCTION_BLIND_AREA_DETECTION_SYSTEM = 45;
    public static final int MALFUNCTION_BRAKE_PADS = 34;
    public static final int MALFUNCTION_CAR_CHARGER = 49;
    public static final int MALFUNCTION_CHARGING_CABINET = 48;
    public static final int MALFUNCTION_CHARGING_GUN_CONNECTION = 51;
    public static final int MALFUNCTION_CHARGING_GUN_NOT_DISCONNECT = 58;
    public static final int MALFUNCTION_CHARGING_SOCKET = 40;
    public static final int MALFUNCTION_CHARGING_SYSTEM = 4;
    public static final int MALFUNCTION_DC_SYSTEM = 47;
    public static final int MALFUNCTION_ELECTRIC_PARKING_BRAKE = 10;
    public static final int MALFUNCTION_ELECTRONIC_PARKING = 26;
    public static final int MALFUNCTION_ENGINE = 5;
    public static final int MALFUNCTION_ENGINE_COOLANT_LOW = 52;
    public static final int MALFUNCTION_ENGINE_OIL_DETECTION_SYSTEM = 53;
    public static final int MALFUNCTION_ENGINE_PART_FUNCTION = 31;
    public static final int MALFUNCTION_ENGINE_SYSTEM = 30;
    public static final int MALFUNCTION_EPS = 12;
    public static final int MALFUNCTION_ESP = 7;
    public static final int MALFUNCTION_EV = 20;
    public static final int MALFUNCTION_EV_FUNCTION = 27;
    public static final int MALFUNCTION_FRONT_BELT = 23;
    public static final int MALFUNCTION_FRONT_LIGHT_SYSTEM = 37;
    public static final int MALFUNCTION_GEAR_SYSTEM = 28;
    public static final int MALFUNCTION_HEV = 21;
    public static final int MALFUNCTION_HIGH_BATTERY_TEMPERATURE = 17;
    public static final int MALFUNCTION_HIGH_MOTOR_TEMPERATURE = 15;
    public static final int MALFUNCTION_HIGH_VOLTAGE_SYSTEM_LEAKAGE = 55;
    public static final int MALFUNCTION_HIGH_WATER_TEMPERATURE = 9;
    public static final int MALFUNCTION_INSTRUMENT_DISPLAY = 1;
    public static final int MALFUNCTION_INTELLIGENT_FAR_LIGHT_LAMP_SYSTEM = 44;
    public static final int MALFUNCTION_IRON_BATTERY = 29;
    public static final int MALFUNCTION_LANE_ASSISTANCE_SYSTEM = 42;
    public static final int MALFUNCTION_LEFT_FRONT_LIGHT_SYSTEM = 35;
    public static final int MALFUNCTION_LOW_VOLTAGE_BATTERY_SYSTEM = 57;
    public static final int MALFUNCTION_MACHINE_OIL_LOW_PRESSURE = 2;
    public static final int MALFUNCTION_MAX = 59;
    public static final int MALFUNCTION_MEMORY_SYSTEM = 38;
    public static final int MALFUNCTION_MOTOR_COOLANT_TEMP_OVER_HIGH = 56;
    public static final int MALFUNCTION_NETWORK_SYSTEM = 54;
    public static final int MALFUNCTION_OK = 19;
    public static final int MALFUNCTION_PARKING_BRAKE = 3;
    public static final int MALFUNCTION_POWER_SYSTEM = 18;
    public static final int MALFUNCTION_PREDICTIVE_BRAKE_SYSTEM = 46;
    public static final int MALFUNCTION_QUICK_AIR_LEAK = 8;
    public static final int MALFUNCTION_RIGHT_FRONT_LIGHT_SYSTEM = 36;
    public static final int MALFUNCTION_SMART_KEY = 22;
    public static final int MALFUNCTION_SRS = 11;
    public static final int MALFUNCTION_STEERING_SYSTEM = 24;
    public static final int MALFUNCTION_SUNROOF_SYSTEM = 39;
    public static final int MALFUNCTION_SVS = 14;
    public static final int MALFUNCTION_TRAFFIC_SIGN_RECOGNITION_SYSTEM = 43;
    public static final int MALFUNCTION_TRANSMISSION_FUNCTION = 32;
    public static final int MALFUNCTION_TRANSMISSION_SYSTEM = 33;
    public static final int MALFUNCTION_TYRE_PRESSURE = 13;
    public static final int MEMORY_SYS_RESTORE_TURN_RING = 8;
    public static final int MEMORY_SYS_SET_FAILED = 10;
    public static final int MEMORY_SYS_SET_SUCCESS = 9;
    public static final int MENU_STATE_CLOSED = 1;
    public static final int MENU_STATE_INVALID = 0;
    public static final int MENU_STATE_OPEN = 2;
    public static final int MENU_STATE_REVERSE = 3;
    public static final int MILEAGE_50KM = 3;
    public static final int MILEAGE_NORMAL = 0;
    public static final int MILEAGE_ONE = 1;
    public static final int MILEAGE_RESET = 1;
    public static final int MILEAGE_TWO = 2;
    public static final int MILE_PH_MAX = 99999999;
    public static final int MILE_PH_MIN = 0;
    public static final int MILE_UNIT_KM = 1;
    public static final int MILE_UNIT_MILE = 2;
    public static final int MODE_LDW = 1;
    public static final int MODE_PCW = 2;
    public static final int MODULE_STATE_FAULT = 1;
    public static final int MODULE_STATE_NORMAL = 0;
    public static final int MPG_GB_AND_MILE = 3;
    public static final int MPG_UNIT = 3;
    public static final int MPG_US_AND_MILE = 4;
    public static final int MUSIC_PAUSE = 2;
    public static final int MUSIC_PLAY = 1;
    public static final int MUSIC_PLAYBACK_PROGRESS_MAX = 100;
    public static final int MUSIC_PLAYBACK_PROGRESS_MIN = 0;
    public static final int MUSIC_SOURCE_AMAZON_MUSIC = 19;
    public static final int MUSIC_SOURCE_AM_MUSIC = 23;
    public static final int MUSIC_SOURCE_ANDROIDAUTO = 17;
    public static final int MUSIC_SOURCE_AUX = 5;
    public static final int MUSIC_SOURCE_BT = 6;
    public static final int MUSIC_SOURCE_CARKSONG = 15;
    public static final int MUSIC_SOURCE_CARPLAY = 16;
    public static final int MUSIC_SOURCE_DAB_MUSIC = 24;
    public static final int MUSIC_SOURCE_DANNA_MUSIC = 25;
    public static final int MUSIC_SOURCE_FLO_MUSIC = 22;
    public static final int MUSIC_SOURCE_FM = 7;
    public static final int MUSIC_SOURCE_HIMALAYA = 12;
    public static final int MUSIC_SOURCE_KOALA = 10;
    public static final int MUSIC_SOURCE_KUGOU = 13;
    public static final int MUSIC_SOURCE_KUWO = 9;
    public static final int MUSIC_SOURCE_LOCAL = 1;
    public static final int MUSIC_SOURCE_MAX = 26;
    public static final int MUSIC_SOURCE_NET_EASE_CLOUD_MUSIC = 20;
    public static final int MUSIC_SOURCE_NON_WHITELIST_THIRD_APP_MUSIC = 26;
    public static final int MUSIC_SOURCE_OTHERS = 11;
    public static final int MUSIC_SOURCE_QQ_MUSIC = 21;
    public static final int MUSIC_SOURCE_SD = 4;
    public static final int MUSIC_SOURCE_SPOTIFY = 18;
    public static final int MUSIC_SOURCE_USB1 = 2;
    public static final int MUSIC_SOURCE_USB2 = 3;
    public static final int MUSIC_SOURCE_VIDEO = 8;
    public static final int MUSIC_SOURCE_YUNTING = 14;
    public static final int MUSIC_STOP = 3;
    public static final int NATIVE_POWER = 5;
    public static final int NAVI_CLOSE = 4;
    public static final int NAVI_INVALID = 0;
    public static final int NAVI_OPENING = 3;
    public static final int NAVI_OPEN_NOT_SET_DEST = 1;
    public static final int NAVI_OPEN_SET_DEST = 2;
    public static final int NODISPLAY_FRONTCAR_DISTANCE = 2;
    public static final int NONE = 0;
    public static final int NORMAL_600_ALARM = 7;
    public static final int NORMAL_DEVIATION = 3;
    public static final int NOTICE_NOT_DISPLAY = 1;
    public static final int NOT_DISPLAY = 1;
    public static final int NO_B_MALFUNCTION = 0;
    public static final int NO_MALFUNCTION = 0;
    public static final int NO_OBJECT = 0;
    public static final int ODOMETER_EV = 5;
    public static final int ODOMETER_HEV = 4;
    public static final int ODOMETER_INVALID = 0;
    public static final int ODOMETER_ONE = 2;
    public static final int ODOMETER_TOTAL = 1;
    public static final int ODOMETER_TWO = 3;
    public static final int OIL_DISPLAY_MAX = 5;
    public static final int OIL_DISPLAY_MIN = 0;
    public static final int ONE_ALARM = 3;
    public static final int ONE_HZ_LIGHT = 5;
    public static final int PCW_LIGHT_GREEN = 4;
    public static final int PCW_LIGHT_ON = 1;
    public static final int PCW_LIGHT_RED = 3;
    public static final int POINT_25_HZ_LIGHT = 3;
    public static final int POINT_50_HZ_LIGHT = 4;
    public static final int POSITION_LF = 3;
    public static final int POSITION_LR = 4;
    public static final int POSITION_RF = 1;
    public static final int POSITION_RR = 2;
    public static final double POWER_CONSUME_PH_DEFAULT = 4095.0d;
    public static final double POWER_CONSUME_PH_MAX = 99.9d;
    public static final double POWER_CONSUME_PH_MIN = -99.9d;
    public static final int POWER_OFF_ERROR_GEAR_SIGNAL_ERR = 3;
    public static final int POWER_OFF_ERROR_INVALID = 0;
    public static final int POWER_OFF_ERROR_NO_3G_SIGNAL = 6;
    public static final int POWER_OFF_ERROR_SPEED_OVER_5KMH = 4;
    public static final int POWER_OFF_ERROR_SPEED_OVER_5KMH_START_VALID = 5;
    public static final int POWER_OFF_ERROR_SPEED_SIGNAL_ERR = 1;
    public static final int POWER_OFF_ERROR_WRONG_GEAR = 2;
    public static final int POWER_ON_ERROR_AUTO_NOT_RIGHT_GEAR = 6;
    public static final int POWER_ON_ERROR_BRAKING_SWITCH_ERR = 5;
    public static final int POWER_ON_ERROR_CHECKING_WITH_ECM_ERR = 8;
    public static final int POWER_ON_ERROR_CHECKING_WITH_MM_ERR = 9;
    public static final int POWER_ON_ERROR_COMMU_WITH_ECU_ERR = 4;
    public static final int POWER_ON_ERROR_GEAR_SIGNAL_ERR = 3;
    public static final int POWER_ON_ERROR_IG1_POWER_ERR = 1;
    public static final int POWER_ON_ERROR_INVALID = 0;
    public static final int POWER_ON_ERROR_MANUAL_NOT_NEUTRAL_GEAR = 10;
    public static final int POWER_ON_ERROR_NO_DETECT_KEY = 11;
    public static final int POWER_ON_ERROR_NO_READY_SIGNAL = 7;
    public static final int POWER_ON_ERROR_PROHIBIT_STARTING = 2;
    public static final int POWER_UNIT = 4;
    public static final int POWER_UNIT_HP = 2;
    public static final int POWER_UNIT_KW = 1;
    public static final int PRESSURE_MAX = 1000;
    public static final int PRESSURE_MIN = 0;
    public static final int PRESSURE_UNIT = 2;
    public static final int PROMPT_ACC_ACTIVE = 3;
    public static final int PROMPT_ACC_CANCEL = 2;
    public static final int PROMPT_ACC_NOT_ACTIVE = 4;
    public static final int PROMPT_ACC_OPEN = 1;
    public static final int PROMPT_COMFIRM_DOOR_IS_CLOSED = 6;
    public static final int PROMPT_COMFIRM_GEAR_IS_D = 7;
    public static final int PROMPT_FASTEN_DRIVER_SEAT_BELT = 5;
    public static final int PROMPT_INVALID = 0;
    public static final int PROMPT_OPEN_EPB = 9;
    public static final int PROMPT_RELEASE_EPB = 8;
    public static final int PSI = 2;
    public static final int RADIO_PLAY = 1;
    public static final int RADIO_STOP = 2;
    public static final int REMOTE_DRIVING_REMINDER_OFF = 1;
    public static final int REMOTE_DRIVING_REMINDER_ON = 2;
    public static final int RESET_INVALID = 0;
    public static final int RESET_ITEM_MAINTAIN = 0;
    public static final int RESET_ITEM_UNIT = 1;
    public static final int RESET_VALID = 1;
    public static final int REST_HOURE_MAX = 254;
    public static final int REST_HOUR_MIN = 0;
    public static final long REST_MILEAGE_MAX = 4294967294L;
    public static final int REST_MILEAGE_MIN = 0;
    public static final int REST_MINUTE_MAX = 59;
    public static final int REST_MINUTE_MIN = 0;
    public static final int REST_SECOND_MAX = 59;
    public static final int REST_SECOND_MIN = 0;
    public static final int RIGHT_DEVIATION = 2;
    public static final int RIGHT_LINE = 2;
    public static final int RSET_HOUR_MAX = 254;
    public static final int RSET_HOUR_MIN = 0;
    public static final int RSET_MINUTE_MAX = 59;
    public static final int RSET_MINUTE_MIN = 0;
    public static final int SAFETY_BELT_AREA_DEPUTY = 2;
    public static final int SAFETY_BELT_AREA_MAIN = 1;
    public static final int SAFETY_BELT_AREA_SECOND_ROW_SEAT_LEFT = 3;
    public static final int SAFETY_BELT_AREA_SECOND_ROW_SEAT_MID = 5;
    public static final int SAFETY_BELT_AREA_SECOND_ROW_SEAT_RIGHT = 4;
    public static final int SAFETY_BELT_STATE_LOCK = 1;
    public static final int SAFETY_BELT_STATE_UNLOCK = 0;
    public static final int SAFETY_DISTANCE_MAX = 4094;
    public static final int SAFETY_DISTANCE_MIN = 0;
    public static final int SAFETY_REMAINING_MILEAGE_MAX = 16777214;
    public static final int SAFETY_REMAINING_MILEAGE_MIN = 0;
    public static final int SAFETY_TYPE_ACCIDENT = 10;
    public static final int SAFETY_TYPE_BLIND_BEND_CONTINUE = 25;
    public static final int SAFETY_TYPE_BLIND_BEND_LEFT = 22;
    public static final int SAFETY_TYPE_BLIND_BEND_REVERSE = 24;
    public static final int SAFETY_TYPE_BLIND_BEND_RIGHT = 23;
    public static final int SAFETY_TYPE_BLIND_SLOPE_CONDOWN = 21;
    public static final int SAFETY_TYPE_BLIND_SLOPE_DOWN = 20;
    public static final int SAFETY_TYPE_BLIND_SLOPE_UP = 19;
    public static final int SAFETY_TYPE_CROSS_WIND = 7;
    public static final int SAFETY_TYPE_HILLSIDE_DANGEROUS = 4;
    public static final int SAFETY_TYPE_HONK = 30;
    public static final int SAFETY_TYPE_HUMP_BRIDGE = 9;
    public static final int SAFETY_TYPE_JOINT_LEFT = 12;
    public static final int SAFETY_TYPE_JOINT_RIGHT = 13;
    public static final int SAFETY_TYPE_LOW_SPEED = 1;
    public static final int SAFETY_TYPE_NARROW_BOTH = 16;
    public static final int SAFETY_TYPE_NARROW_BRIDGE = 3;
    public static final int SAFETY_TYPE_NARROW_LEFT = 14;
    public static final int SAFETY_TYPE_NARROW_RIGHT = 15;
    public static final int SAFETY_TYPE_NONE = 0;
    public static final int SAFETY_TYPE_OVERTAKE_FORBIDDEN = 29;
    public static final int SAFETY_TYPE_RAILWAY_MANAGED = 26;
    public static final int SAFETY_TYPE_RAILWAY_UNMANAGED = 27;
    public static final int SAFETY_TYPE_ROCK_DOWN_LEFT = 17;
    public static final int SAFETY_TYPE_ROCK_DOWN_RIGHT = 18;
    public static final int SAFETY_TYPE_SCHOOL_ZONE = 8;
    public static final int SAFETY_TYPE_SLIP = 6;
    public static final int SAFETY_TYPE_TUNNEL = 31;
    public static final int SAFETY_TYPE_UNDER_WATER = 2;
    public static final int SAFETY_TYPE_UNEVEN = 5;
    public static final int SAFETY_TYPE_VILLAGE = 28;
    public static final int SAFETY_TYPE_ZIP_PASS = 11;
    public static final int SCHEDULE_CHARGE = 2;
    public static final int SCHEDULE_CHARGE_NOT_ALLOW = 3;
    public static final int SEAT_BELT_CONTINUE_ALARM = 5;
    public static final int SEAT_BELT_RE_ALARM = 6;
    public static final int SECOND_GEAR = 2;
    public static final int SECOND_GEAR_SPACING = 4;
    public static final int SECOND_MENU_MAX = 15;
    public static final int SECOND_MENU_MIN = 0;
    public static final int SEND_INFO_FAIL = 2;
    public static final int SEND_INFO_SUCCESS = 1;
    public static final int SMART_TEMT_CTL = 9;
    public static final int SOUND_FREQ_0POINT5HZ = 1;
    public static final int SOUND_FREQ_1HZ = 2;
    public static final int SOUND_FREQ_2HZ = 3;
    public static final int SOUND_FREQ_2POINT5HZ = 4;
    public static final int SOUND_FREQ_4HZ = 5;
    public static final int SOUND_FREQ_ALWAYS = 6;
    public static final int SOUND_FREQ_INVALID = 0;
    public static final int SPEED_INVALID = 0;
    public static final int SPEED_UNIT_KM = 1;
    public static final int SPEED_UNIT_MPH = 2;
    public static final int STANDARD_FEEDBACK = 1;
    public static final int STATE_INVISIBLE = 1;
    public static final int STATE_VISIBLE = 2;
    protected static final String TAG = "BYDAutoInstrumentDevice";
    public static final int TARGET_COMPANY = 2;
    public static final int TARGET_HOME = 1;
    public static final int TARGET_OBJECT_DETECTED = 1;
    public static final int TEMPERATURE_INVALID = 195;
    public static final int TEMPERATURE_MAX = 195;
    public static final int TEMPERATURE_MIN = -60;
    public static final int TEMPERATURE_UNIT = 1;
    public static final int TEMP_MAX = 499;
    public static final int TEMP_MIN = -40;
    public static final int TEXT_COLOR_RED = 3;
    public static final int TEXT_COLOR_WHITE = 1;
    public static final int TEXT_COLOR_YELLOW = 2;
    public static final int THIRD_GEAR = 3;
    public static final int THIRD_GEAR_SPACING = 5;
    public static final int THREE_ALARM = 4;
    public static final int TIME_CALCULATING = 1;
    public static final int TIME_DISTANCE_FIFTH_GEAR = 5;
    public static final int TIME_DISTANCE_FIRST_GEAR = 1;
    public static final int TIME_DISTANCE_FORTH_GEAR = 4;
    public static final int TIME_DISTANCE_INVALID = 0;
    public static final int TIME_DISTANCE_SECOND_GEAR = 2;
    public static final int TIME_DISTANCE_THIRD_GEAR = 3;
    public static final int TIME_FIRST_GEAR = 1;
    public static final int TIME_FORTH_GEAR = 4;
    public static final int TIME_NOT_DISPLAY = 3;
    public static final int TIME_REST_TIME = 2;
    public static final int TIME_SECOND_GEAR = 2;
    public static final int TIME_THIRD_GEAR = 3;
    public static final int TOTAL_MILEAGE_INVALID = 1;
    public static final int TOTAL_MILEAGE_VALID = 0;
    public static final double TRAVEL_TIME_PH_MAX = 9999.9d;
    public static final double TRAVEL_TIME_PH_MIN = 0.0d;
    public static final int TURN_KIND_BACK = 5;
    public static final int TURN_KIND_BACK_2BRANCH_LEFT_BASE = 64;
    public static final int TURN_KIND_BACK_2BRANCH_RIGHT_BASE = 65;
    public static final int TURN_KIND_BACK_3BRANCH_LEFT_BASE = 66;
    public static final int TURN_KIND_BACK_3BRANCH_MIDDLE_BASE = 67;
    public static final int TURN_KIND_BACK_3BRANCH_RIGHT_BASE = 68;
    public static final int TURN_KIND_BLANK = 0;
    public static final int TURN_KIND_BRANCH_CENTER = 22;
    public static final int TURN_KIND_BRANCH_CENTER_IC = 40;
    public static final int TURN_KIND_BRANCH_CENTER_IC_STRAIGHT = 43;
    public static final int TURN_KIND_BRANCH_CENTER_STRAIGHT = 37;
    public static final int TURN_KIND_BRANCH_LEFT = 20;
    public static final int TURN_KIND_BRANCH_LEFT_IC = 39;
    public static final int TURN_KIND_BRANCH_LEFT_IC_STRAIGHT = 42;
    public static final int TURN_KIND_BRANCH_LEFT_MAIN = 14;
    public static final int TURN_KIND_BRANCH_LEFT_STRAIGHT = 36;
    public static final int TURN_KIND_BRANCH_RIGHT = 21;
    public static final int TURN_KIND_BRANCH_RIGHT_IC = 41;
    public static final int TURN_KIND_BRANCH_RIGHT_IC_STRAIGHT = 44;
    public static final int TURN_KIND_BRANCH_RIGHT_MAIN = 16;
    public static final int TURN_KIND_BRANCH_RIGHT_STRAIGHT = 38;
    public static final int TURN_KIND_CAR_SIGN = 102;
    public static final int TURN_KIND_CENTER_MAIN = 17;
    public static final int TURN_KIND_DEST = 24;
    public static final int TURN_KIND_FRONT = 1;
    public static final int TURN_KIND_INFERRY = 29;
    public static final int TURN_KIND_LEFT = 7;
    public static final int TURN_KIND_LEFT_2BRANCH_LEFT = 50;
    public static final int TURN_KIND_LEFT_2BRANCH_RIGHT = 51;
    public static final int TURN_KIND_LEFT_3BRANCH_LEFT = 52;
    public static final int TURN_KIND_LEFT_3BRANCH_MIDDLE = 53;
    public static final int TURN_KIND_LEFT_3BRANCH_RIGHT = 54;
    public static final int TURN_KIND_LEFT_BACK = 6;
    public static final int TURN_KIND_LEFT_FRONT = 8;
    public static final int TURN_KIND_LEFT_FRONT_2BRANCH_LEFT = 60;
    public static final int TURN_KIND_LEFT_FRONT_2BRANCH_RIGHT = 61;
    public static final int TURN_KIND_LEFT_SIDE = 11;
    public static final int TURN_KIND_LEFT_SIDE_BACK = 81;
    public static final int TURN_KIND_LEFT_SIDE_IC = 18;
    public static final int TURN_KIND_LEFT_SIDE_MAIN = 13;
    public static final int TURN_KIND_LEFT_SIDE_STRAIGHT = 34;
    public static final int TURN_KIND_LEFT_SIDE_STRAIGHT_IC = 32;
    public static final int TURN_KIND_OUTFERRY = 30;
    public static final int TURN_KIND_RIGHT = 3;
    public static final int TURN_KIND_RIGHT_2BRANCH_LEFT = 55;
    public static final int TURN_KIND_RIGHT_2BRANCH_RIGHT = 56;
    public static final int TURN_KIND_RIGHT_3BRANCH_LEFT = 57;
    public static final int TURN_KIND_RIGHT_3BRANCH_MIDDLE = 58;
    public static final int TURN_KIND_RIGHT_3BRANCH_RIGHT = 59;
    public static final int TURN_KIND_RIGHT_BACK = 4;
    public static final int TURN_KIND_RIGHT_FRONT = 2;
    public static final int TURN_KIND_RIGHT_SIDE = 12;
    public static final int TURN_KIND_RIGHT_SIDE_IC = 19;
    public static final int TURN_KIND_RIGHT_SIDE_MAIN = 15;
    public static final int TURN_KIND_RIGHT_SIDE_STRAIGHT = 35;
    public static final int TURN_KIND_RIGHT_SIDE_STRAIGHT_IC = 33;
    public static final int TURN_KIND_RING = 9;
    public static final int TURN_KIND_RING_BACK = 73;
    public static final int TURN_KIND_RING_FRONT = 69;
    public static final int TURN_KIND_RING_LEFT = 75;
    public static final int TURN_KIND_RING_LEFTBACK = 74;
    public static final int TURN_KIND_RING_LEFTFRONT = 76;
    public static final int TURN_KIND_RING_LEFT_SIDE_ANTICCLOCKWISE_IN_10OUT = 101;
    public static final int TURN_KIND_RING_LEFT_SIDE_ANTICCLOCKWISE_IN_1OUT = 92;
    public static final int TURN_KIND_RING_LEFT_SIDE_ANTICCLOCKWISE_IN_2OUT = 93;
    public static final int TURN_KIND_RING_LEFT_SIDE_ANTICCLOCKWISE_IN_3OUT = 94;
    public static final int TURN_KIND_RING_LEFT_SIDE_ANTICCLOCKWISE_IN_4OUT = 95;
    public static final int TURN_KIND_RING_LEFT_SIDE_ANTICCLOCKWISE_IN_5OUT = 96;
    public static final int TURN_KIND_RING_LEFT_SIDE_ANTICCLOCKWISE_IN_6OUT = 97;
    public static final int TURN_KIND_RING_LEFT_SIDE_ANTICCLOCKWISE_IN_7OUT = 98;
    public static final int TURN_KIND_RING_LEFT_SIDE_ANTICCLOCKWISE_IN_8OUT = 99;
    public static final int TURN_KIND_RING_LEFT_SIDE_ANTICCLOCKWISE_IN_9OUT = 100;
    public static final int TURN_KIND_RING_LEFT_SIDE_CLOCKWISE_IN = 79;
    public static final int TURN_KIND_RING_LEFT_SIDE_CLOCKWISE_OUT = 80;
    public static final int TURN_KIND_RING_OUT = 10;
    public static final int TURN_KIND_RING_RIGHT = 71;
    public static final int TURN_KIND_RING_RIGHTBACK = 72;
    public static final int TURN_KIND_RING_RIGHTFRONT = 70;
    public static final int TURN_KIND_RING_RIGHT_SIDE_ANTICCLOCKWISE_IN_10OUT = 91;
    public static final int TURN_KIND_RING_RIGHT_SIDE_ANTICCLOCKWISE_IN_1OUT = 82;
    public static final int TURN_KIND_RING_RIGHT_SIDE_ANTICCLOCKWISE_IN_2OUT = 83;
    public static final int TURN_KIND_RING_RIGHT_SIDE_ANTICCLOCKWISE_IN_3OUT = 84;
    public static final int TURN_KIND_RING_RIGHT_SIDE_ANTICCLOCKWISE_IN_4OUT = 85;
    public static final int TURN_KIND_RING_RIGHT_SIDE_ANTICCLOCKWISE_IN_5OUT = 86;
    public static final int TURN_KIND_RING_RIGHT_SIDE_ANTICCLOCKWISE_IN_6OUT = 87;
    public static final int TURN_KIND_RING_RIGHT_SIDE_ANTICCLOCKWISE_IN_7OUT = 88;
    public static final int TURN_KIND_RING_RIGHT_SIDE_ANTICCLOCKWISE_IN_8OUT = 89;
    public static final int TURN_KIND_RING_RIGHT_SIDE_ANTICCLOCKWISE_IN_91OUT = 90;
    public static final int TURN_KIND_RIRHGT_FRONT_2BRANCH_LEFT = 62;
    public static final int TURN_KIND_RIRHGT_FRONT_2BRANCH_RIGHT = 63;
    public static final int TURN_KIND_START = 23;
    public static final int TURN_KIND_STRAIGHT = 77;
    public static final int TURN_KIND_STRAIGHT_2BRANCH_LEFT = 45;
    public static final int TURN_KIND_STRAIGHT_2BRANCH_RIGHT = 46;
    public static final int TURN_KIND_STRAIGHT_3BRANCH_LEFT = 47;
    public static final int TURN_KIND_STRAIGHT_3BRANCH_MIDDLE = 48;
    public static final int TURN_KIND_STRAIGHT_3BRANCH_RIGHT = 49;
    public static final int TURN_KIND_TOLLGATE = 31;
    public static final int TURN_KIND_VIA_1 = 25;
    public static final int TURN_KIND_VIA_2 = 26;
    public static final int TURN_KIND_VIA_3 = 27;
    public static final int TURN_KIND_VIA_4 = 28;
    public static final int TURN_KIN_REST_AREA = 78;
    public static final int TWO_HZ_LIGHT = 6;
    public static final int TYRE_DIRECT = 1;
    public static final int TYRE_INDIRECT_WITH_CAR = 2;
    public static final int TYRE_INVALID = 0;
    public static final int TYRE_INVALID_WITHOUT_CAR = 3;
    public static final int UNRECOGNIZED_LINE = 4;
    public static final int VIEW_STATUS_BAR = 2;
    public static final int VIEW_STATUS_HUGE_WIN = 1;
    public static final int VIEW_STATUS_INVALID = 0;
    public static final int VIEW_SWITCH_INVALID = 0;
    public static final int VIEW_SWITCH_WIN_CLOSE = 1;
    public static final int VIEW_SWITCH_WIN_OPEN = 2;
    public static final double WATER_TEMP_METER_PERCENT_MAX = 100.0d;
    public static final double WATER_TEMP_METER_PERCENT_MIN;
    static {
        WATER_TEMP_METER_PERCENT_MIN = 0d;
    }

    BYDAutoInstrumentDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int clearInfo(int info) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1AccDistance() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1AccTextPrompt() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1AccTimeDistance() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1AccWorkInterface() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1BodyPosition() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultFrontFogLightIndicator() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultFrontFogLightIndicatorColor() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultGrassIndicator() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultGrassIndicatorColor() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultIndicatorColor(int indicatorType) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultMuddyIndicator() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultMuddyIndicatorColor() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultNormalIndicator() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultNormalIndicatorColor() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultOilLifeDetectIndicator() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultOilLifeDetectIndicatorColor() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultSandIndicator() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultSandIndicatorColor() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultSmallLightIndicator() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1FaultSmallLightIndicatorColor() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get2in1MenuState() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get50KmEneryConsumptionDisplayState() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int get50KmFuelConsumptionDisplayState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_ABS_FAILURE_WARN_LIGHT} (0x27500014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getABSFaultWarningLight() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_ABS_FAILURE_WARN_LIGHT_COLOR} (0x27500017).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getABSFaultWarningLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_ACC_INDICAT_LIGHT_COLOR} (0x29600035).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getACCIndicateLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_ACC_INDICAT_LIGHT_STATE} (0x29600032).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getACCIndicateLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_ACC_CRUISING_SPEED} (0x2a600008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAccCruisingSpeed() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_ACC_CRUISING_SPEED_COLOR} (0x2a60000b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAccCruisingSpeedColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_ACC_SPEED} (0x23a00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAccCruisingSpeedValue() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_AIR_HEATING_OIL_DISPLAY} (0x4a50803a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAirHeatOilDisplay() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_AIR_HEATING_DISPLAY_STATE} (0x3a700028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAirHeatingDisplayState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_AIR_HEATING_OIL_WARN} (0x4a508046).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAirHeatingOilWarn() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code INSTRUMENT_ALARM_BUZZLE_STATE} (0x12d0003c). */
    public int getAlarmBuzzleState() { throw new RuntimeException("Stub!"); }
    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_APPOINTMENT_COUNTDOWN_HOUR} (0x26f00013).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAppCountdownHour() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_APPOINTMENT_COUNTDOWN_MINUTE} (0x26f00018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAppCountdownMinute() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_APPOINTMENT_HOUR} (0x26f00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAppointmentHour() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_APPOINTMENT_MINUTE} (0x26f0000d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAppointmentMinute() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_AVERAGE_ENERY_CONSUMPTION_DISPLAY_STATE} (0x3a700010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAverageEneryConsumptionDisplayState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_AVERAGE_FUEL_CONSUMPTION_DISPLAY_STATE} (0x3a700012).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAverageFuelConsumptionDisplayState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_AVERAGE_SPEED} (0x4a50502c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAverageSpeed() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_BACKLIGHT_BRIGHTNESS} (0x4bf00038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBacklightBrightness() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_BACKLIGHT_AUTO_MODE_STATE} (0x4c800022), {@code INSTRUMENT_BACKLIGHT_LINK_MODE_STATE} (0x4c800046).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBacklightModeState(int backlightMode) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int getBatteryPercent() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_BRAKE_SYS_FAILURE_WARN_LIGHT_COLOR} (0x27500023).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBrakeSysFaultLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_BRAKE_SYS_FAILURE_WARN_LIGHT} (0x27500020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBrakeSysFaultLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_CALL_INFO_RESULT} (0x420c1010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getCallInfoResult() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_APPOINTMET_TIME_OPTION} (0x3230000b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getChargeAppTimeOption() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_DISPLAY_DD} (0x32300008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getChargeDisplay() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_NOTICE_DD} (0x32300024).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getChargeNotice() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_PERCENT_DD} (0x32300010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getChargePercent() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_POWER_DD} (0x32300018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getChargePower() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_REST_HOUR_DD} (0x32300028), {@code CHARGING_CHARGE_REST_MINUTE_DD} (0x32300030).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int[] getChargeRestTime() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_COOLANT_TEMP_HIGH_WARN_LIGHT_COLOR} (0x2870002f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getCoolantTempHighWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_COOLANT_TEMP_HIGH_WARN_LIGHT} (0x2870002c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getCoolantTempHighWarnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_CRUISE_CTRL_INDICATOR_COLOR} (0x2b000011).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getCruiseCtrlIndicatorColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_CRUISE_CTRL_INDICATOR} (0x2b00000e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getCruiseCtrlIndicatorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_CURRENT_JOURNEY_INTERFACE} (0x4a50b010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getCurrentDriveInterFace() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_CURRENT_JOURNEY_DRIVE_MILEAGE} (0x4a50b01c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getCurrentJourneyDriveMileage() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_CURRENT_JOURNEY_DRIVE_TIME} (0x4a50b012).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getCurrentJourneyDriveTime() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_DASHBOARD_ALARM} (0x4a505037).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDashboardAlarmState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_DEVIATION_STATE} (0x26100012).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDeviationState() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DIRECT_TYRE_PRES_DISPLAY_STATE} (0x3a700008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDirectTypePressDisplayState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_DIRECTION_INFO} (0x4a503038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDirectionInfo() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_DISCHARGE_ELEC_ENERGY} (0x23a00028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getDischargeElecEnergy() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_DISCHARGE_INDICATOR_COLOR} (0x2b000023).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDischargeIndicatorColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_DISCHARGE_MODE} (0x23a00026).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDischargeMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_DISCHARGE_UI} (0x23a00020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDischargeUiState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_DISCHARGE_INDICATOR} (0x2b000020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDishargeIndicatorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_LEFT_FRONT_DOOR_STATE} (0x26100014), {@code INSTRUMENT_DD_RIGHT_FRONT_DOOR_STATE} (0x26100015), {@code INSTRUMENT_DD_LEFT_REAR_DOOR_STATE} (0x26100016), {@code INSTRUMENT_DD_RIGHT_REAR_DOOR_STATE} (0x26100017), {@code INSTRUMENT_DD_HOOD_STATE} (0x26100019), {@code INSTRUMENT_DD_LUGGAGE_DOOR_STATE} (0x26100018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDoorState(int area) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_DRIVE_POWER_LIMIT_INDICATOR_COLOR} (0x2b00001d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDrivePowerLimitIndicatorColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_DRIVE_POWER_LIMIT_INDICATOR} (0x2b00001a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDrivePowerLimitIndicatorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_ECO_INDICATOR_COLOR} (0x2b000029).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getECOIndicatorColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_ECO_INDICATOR} (0x2b000026).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getECOIndicatorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_ELEC_PARKING_STATE_INDICATOR_COLOR} (0x2750001d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getELECParkingColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_ELEC_PARKING_STATE_INDICATOR} (0x2750001a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getELECParkingState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_ESP_FAILURE_WARN_LIGHT_COLOR} (0x2750002f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getESPFailWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_ESP_FAILURE_WARN_LIGHT} (0x2750002c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getESPFailWarnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_EV_INDICATOR_COLOR} (0x2c00002f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEVIndicatorColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_EV_INDICATOR} (0x2c00002c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEVIndicatorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_ENERGY_DISPLAY} (0x26f00025).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEnergyDisplay() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_ENERGY_INTENSITY_FEEDBACK} (0x26100026).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEnergyFeedback() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code INSTRUMENT_ENERGY_DISPLAY} (0x26f00025). */
    public int getEneryDisplayState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_ENGINE_FAILURE_WARN_LIGHT_COLOR} (0x28700029).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEngineFailWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_ENGINE_FAILURE_WARN_LIGHT} (0x28700026).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEngineFailWarnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_SCHEDULE_DISPLAY_DD} (0x3230003a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getExpectChargeDisplay() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code CHARGING_CHARGE_REST_TIME_DD} (0x32300038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getExpectChargeState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_EXTERNAL_CHARGE_POWER} (0x4a508010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getExternalChargePower() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code INSTRUMENT_EXTERNAL_CHARGING_POWER} (0x4a508010). */
    public double getExternalChargingPower() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUEMNT_2IN1_FIRST_MENU} (0x25d00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getFirstMenu() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_FUEL_CONSUMPTION_DISPLAY_STATE} (0x3a70000e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getFuelConsumptionDisplayState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_FUEL_LOW_ALARM} (0x4a507027).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getFuelLowAlarm() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_GPF_INDICATOR_COLOR} (0x2870001d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getGPFIndicatorColorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_GPF_INDICATOR} (0x2870001a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getGPFIndicatorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_GAP_DETECTION} (0x000237ae).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getGapDetection() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_HEV_INDICATOR_COLOR} (0x2c000035).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getHEVIndicatorColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_HEV_INDICATOR} (0x2c000032).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getHEVIndicatorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_HEADLAMP_FAILURE_WARN_LIGHT_COLOR} (0x28f00029).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getHeadlampFailWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_HEADLAMP_FAILURE_WARN_LIGHT} (0x28f00026).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getHeadlampFailWarnLightState() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.instrument.BYDAutoInstrumentDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_INSTANT_FUEL_CONSUMPTION_DISPLAY_STATE} (0x3a70001c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getInstantFuelConsumptionDisplayState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_UNIT_INSTANT_FUELCON} (0x4a501043).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getInstantFuelConsumptionUnit() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_SCREEN_TYPE} (0x23500022).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getInstrumentScreenType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMET_VIEW_INTERFACE} (0x26f00028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getInstrumentView() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_KEY_DETECTION_REMINDER} (0x43400013).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getKeyDetectionReminder() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_LANE_LINE_COLOR} (0x2c000038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLaneLineColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_LANE_LINE_STATE} (0x0000cd09).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLaneLineState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_LAST_50KM_POWER_CONSUME} (0x4a505020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getLast50KmPowerConsume() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_LEFT_LINE} (0x23500018), {@code INSTRUMENT_2IN1_RIGHT_LINE} (0x2350001c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLineValue(int flag) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_FAULT_KEY_FUNC_COUNTDOWN_DAY} (0x3d902030), {@code INSTRUMENT_DD_FAULT_KEY_FUNC_COUNTDOWN_HOUR} (0x3d902034).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLinkErrKeyTime(int flag) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_LOW_FUEL_WARN_LIGHT_COLOR} (0x28700035).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLowFuelWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_LOW_FUEL_WARN_LIGHT} (0x28700032).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLowFuelWarnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_LOW_POWER_BATTERY_WARN_LIGHT_COLOR} (0x2a600029).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLowPowerBatteryWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_LOW_POWER_BATTERY_WARN_LIGHT} (0x2a600026).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLowPowerBatteryWarnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_MAIN_ALARM_INDICATOR_COLOR} (0x29600011).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMainAlarmIndicatorColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_MAIN_ALARM_INDICATOR} (0x2960000e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMainAlarmIndicatorState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code INSTRUMENT_MAINTENANCE_TIME} (0x1c000020), {@code INSTRUMENT_MAINTENANCE_MILEAGE} (0x4c800028). */
    public int getMaintenanceInfo(int typeName) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code INSTRUMENT_DISPLAY_BREAKDOWN} (0x3d911010), {@code INSTRUMENT_LOW_OIL_PRESSURE} (0x3d911011), {@code INSTRUMENT_PARKING_BRAKING} (0x3d903012), {@code INSTRUMENT_CHARGING_SYSTEM_BREAKDOWN} (0x3d911013), {@code INSTRUMENT_ENGINE_BREAKDOWN} (0x3d911014), {@code INSTRUMENT_ABS_SYSTEM_BREAKDOWN} (0x3d911015), {@code INSTRUMENT_ESC_INDICATOR} (0x3d911016), {@code INSTRUMENT_QUICK_AIR_LEAK} (0x3d911017), {@code INSTRUMENT_HIGH_WATER_TEMPERATURE} (0x3d911018), {@code INSTRUMENT_ELECTRONIC_PARKING} (0x3d911019), {@code INSTRUMENT_SRS_BREAKDOWN} (0x3d91101a), {@code INSTRUMENT_EPS_INDICATOR} (0x3d91101b), {@code INSTRUMENT_TIRE_PRESSURE_BREAKDOWN} (0x3d91101c), {@code INSTRUMENT_SVS_INDICATOR} (0x3d91101d), {@code INSTRUMENT_MOTOR_TOO_HIGH} (0x3d91101e), {@code INSTRUMENT_BATTERY_BREAKDOWN} (0x3d91101f), {@code INSTRUMENT_BATTERY_TOO_HIGH} (0x3d911020), {@code INSTRUMENT_ENERGY_SYSTEM_INDICATOR} (0x3d911021), {@code INSTRUMENT_OK_INDICATOR} (0x3d911022), {@code INSTRUMENT_EV_MODE_INDICATORE} (0x3d91102e), {@code INSTRUMENT_HEV_MODE_INDICATORE} (0x3d91102f), {@code INSTRUMENT_SMART_KEY_SYS_WARN_LIGHT} (0x12d00028), {@code INSTRUMENT_FRONT_SAFEBELT_WARN_SWITCH} (0x05500017), {@code INSTRUMENT_CHARGING_CABINET} (0x3d911024), {@code INSTRUMENT_CAR_CHARGER} (0x3d911025), {@code INSTRUMENT_AC_CHARGING_EQUIPMENT} (0x3d911026), {@code INSTRUMENT_CHARGING_GUN_CONNECTION} (0x3d911027), {@code INSTRUMENT_ENGINE_COOLANT_LOW} (0x3d911028), {@code INSTRUMENT_ENGINE_OIL_DETECTION_SYSTEM} (0x3d911029), {@code INSTRUMENT_NETWORK_SYSTEM} (0x3d91102c), {@code INSTRUMENT_HIGH_VOLTAGE_SYSTEM_LEAKAGE} (0x3d911023), {@code INSTRUMENT_MOTOR_COOLANT_TEMP_OVER_HIGH} (0x3d91102a), {@code INSTRUMENT_LOW_VOLTAGE_BATTERY_SYSTEM} (0x3d91102b), {@code INSTRUMENT_CHARGING_GUN_NOT_DISCONNECT} (0x3d91102d), {@code INSTRUMENT_STEERING_SYSTEM} (0x00009eec), {@code INSTRUMENT_AC_HEAT_MANAGEMENT} (0x000babe5), {@code INSTRUMENT_ELECTIC_PARKING_FAIL} (0x000cefad), {@code INSTRUMENT_EV_FUNCTION} (0x000b4909), {@code INSTRUMENT_GEAR_SYSTEM} (0x0004be3e), {@code INSTRUMENT_IRON_BATTERY} (0x00038f7b), {@code INSTRUMENT_ENGINE_SYSTEM} (0x00016fbb), {@code INSTRUMENT_ENGINE_PART_FUNCTION} (0x00082d37), {@code INSTRUMENT_TRANSMISSION_FUNCTION} (0x000bfcdf), {@code INSTRUMENT_TRANSMISSION_SYSTEM} (0x000d3c8b), {@code INSTRUMENT_BRAKE_PADS} (0x00002fbe), {@code INSTRUMENT_LEFT_FRONT_LIGHT_SYSTEM} (0x00003d12), {@code INSTRUMENT_RIGHT_FRONT_LIGHT_SYSTEM} (0x000e5c52), {@code INSTRUMENT_FRONT_LIGHT_SYSTEM} (0x000d955f), {@code INSTRUMENT_MEMORY_SYSTEM} (0x00048f86), {@code INSTRUMENT_SUNROOF_SYSTEM} (0x00058ebf), {@code INSTRUMENT_CHARGING_SOCKET} (0x000713e2), {@code INSTRUMENT_ADAPTIVE_CRUISE_CONTROL_SYSTEM} (0x0002ecdd), {@code INSTRUMENT_LANE_ASSISTANCE_SYSTEM} (0x000e57c6), {@code INSTRUMENT_TRAFFIC_SIGN_RECOGNITION_SYSTEM} (0x0001ca57), {@code INSTRUMENT_INTELLIGENT_FAR_LIGHT_LAMP_SYSTEM} (0x0007a935), {@code INSTRUMENT_BLIND_AREA_DETECTION_SYSTEM} (0x0001a590), {@code INSTRUMENT_PREDICTIVE_BRAKE_SYSTEM} (0x0009106a), {@code INSTRUMENT_DC_SYSTEM} (0x000f2fd0). */
    public int getMalfunctionInfo(int typeName) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_B_M_VEHICLE_CHARGING_SYSTEM} (0x3d95d010), {@code INSTRUMENT_B_M_CHARGING_EQUIPMENT} (0x3d95d011), {@code INSTRUMENT_B_M_BRAKE_FLUID_LEVEL_LOW} (0x3d95d012), {@code INSTRUMENT_B_M_BRAKE_SYSTEM} (0x3d95d013), {@code INSTRUMENT_B_M_STEERING_SYSTEM} (0x3d95d014), {@code INSTRUMENT_B_M_COOLANT_LEVEL_LOW} (0x3d95d015), {@code INSTRUMENT_B_M_AC_HEAT_MANAGEMENT} (0x3d95d016), {@code INSTRUMENT_B_M_ENGINE_OIL_PRESSURE_LACK} (0x3d95d017), {@code INSTRUMENT_B_M_ENGINE_OIL_DETECTING_SYSTEM} (0x3d95d018), {@code INSTRUMENT_B_M_TIRE_PRESSURE_DETECTING_SYSTEM} (0x3d95d019), {@code INSTRUMENT_B_M_BRAKE_SYSTEM_1} (0x3d95d01a), {@code INSTRUMENT_B_M_ELECTRONIC_PARKING_SYSTEM} (0x3d95d01b), {@code INSTRUMENT_B_M_PARKING_POWER_LACK} (0x3d95d01c), {@code INSTRUMENT_B_M_ABS} (0x3d95d01d), {@code INSTRUMENT_B_M_LOW_VOLTAGE_POWER_SUPPLY_SYSTEM} (0x3d95d01e), {@code INSTRUMENT_B_M_POWER_GENERATION_SYSTEM} (0x3d95d01f), {@code INSTRUMENT_B_M_POWER_SYSTEM} (0x3d95d020), {@code INSTRUMENT_B_M_EV_FUNCTION_LIMIT} (0x3d95d021), {@code INSTRUMENT_B_M_GEAR_SYSTEM} (0x3d95d022), {@code INSTRUMENT_B_M_CHARGING_SYSTEM} (0x3d95d023), {@code INSTRUMENT_B_M_START_TYPE_IRON_BATTERY_SYSTEM} (0x3d95d024), {@code INSTRUMENT_B_M_IRON_BATTERY} (0x3d95d025), {@code INSTRUMENT_B_M_IRON_BATTERY_POWER_LOW} (0x3d95d026), {@code INSTRUMENT_B_M_AUTO_NETWORK} (0x3d95d027), {@code INSTRUMENT_B_M_ENGINE_SYSTEM} (0x3d95d028), {@code INSTRUMENT_B_M_ENGINE_ACCESSORY_FUNCTION_LIMIT} (0x3d95d029), {@code INSTRUMENT_B_M_TRANSMISSION_FUNCTION_LIMIT} (0x3d95d02a), {@code INSTRUMENT_B_M_TRANSMISSION_SYSTEM} (0x3d95d02b), {@code INSTRUMENT_B_M_SRS} (0x3d95d02c), {@code INSTRUMENT_B_M_ESP} (0x3d95d02d), {@code INSTRUMENT_B_M_HDC} (0x3d95d02e), {@code INSTRUMENT_B_M_BRAKE_PAD} (0x3d95d02f), {@code INSTRUMENT_B_M_LEFT_HEADLAMP_SYSTEM} (0x3d95d030), {@code INSTRUMENT_B_M_RIGHT_HEADLAMP_SYSTEM} (0x3d95d031), {@code INSTRUMENT_B_M_MEMORY_SYSTEM} (0x3d95d032), {@code INSTRUMENT_B_M_ACC_SYSTEM} (0x3d95d033), {@code INSTRUMENT_B_M_PEDESTRIAN_DETECTION_SYSTEM} (0x3d95d034), {@code INSTRUMENT_B_M_TRAFFIC_SIGN_RECOGNITION_SYSTEM} (0x3d95d035), {@code INSTRUMENT_B_M_HMA_SYSTEM} (0x3d95d036), {@code INSTRUMENT_B_M_BSD_SYSTEM} (0x3d95d037), {@code INSTRUMENT_B_M_FCW_SYSTEM} (0x3d95d038), {@code INSTRUMENT_B_M_PRE_MILLIMETER_WAVE_RADAR} (0x3d95d039), {@code INSTRUMENT_B_M_AEB_SYSTEM} (0x3d95d03a), {@code INSTRUMENT_B_M_MULTIFUNCTION_VIDEO_CONTROLLER} (0x3d95d03b), {@code INSTRUMENT_B_M_MULTI_VIDEO_CON_FUNCTION_LIMIT} (0x3d95d03c), {@code INSTRUMENT_B_M_LKS} (0x3d95d03d), {@code INSTRUMENT_B_M_LDW} (0x3d95d03e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMalfunctionInfo2(int typeName) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public java.util.ArrayList<java.lang.Integer> getMalfunctionList() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_MILEAGE_UNIT} (0x4a50202b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMileageUnit() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_MILEAGE_VALID_FLAG} (0x0000db18).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMileageValidFlag() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_FAULT_NOTICE_ABS_SYSTEM} (0x3d901038), {@code INSTRUMENT_DD_FAULT_NOTICE_EPB} (0x3d901022), {@code INSTRUMENT_DD_FAULT_NOTICE_EPB_NOT_RELEASED} (0x3d902026), {@code INSTRUMENT_DD_FAULT_NOTICE_ESP_SYSTEM} (0x3d90103b), {@code INSTRUMENT_DD_FAULT_NOTICE_FRONT_LIGHT_STSTEM} (0x3d90102e), {@code INSTRUMENT_DD_FAULT_NOTICE_LEAVE_CAR} (0x3d901010), {@code INSTRUMENT_DD_FAULT_NOTICE_LF_LIGHT_STSTEM} (0x3d90102c), {@code INSTRUMENT_DD_FAULT_NOTICE_LV_SUPPLY} (0x3d901025), {@code INSTRUMENT_DD_FAULT_NOTICE_PARK_SYSTEM} (0x3d901037), {@code INSTRUMENT_DD_FAULT_NOTICE_PARK_WEAK} (0x3d901023), {@code INSTRUMENT_DD_FAULT_NOTICE_STEERING_SYSTEM} (0x3d901014), {@code INSTRUMENT_DD_FAULT_NOTICE_TRYE_PRES_DET} (0x3d901035), {@code INSTRUMENT_DD_INDIRECT_TYPE_PRES_LF} (0x4a506043), {@code INSTRUMENT_DD_INDIRECT_TYPE_PRES_LR} (0x4a506045), {@code INSTRUMENT_DD_INDIRECT_TYPE_PRES_RF} (0x4a506044), {@code INSTRUMENT_DD_INDIRECT_TYPE_PRES_RR} (0x4a506046), {@code INSTRUMENT_DD_FAULT_AC_WARM_DIESEL} (0x3d902010), {@code INSTRUMENT_DD_FAULT_DISCHARGE_DEVICE} (0x3d902011), {@code INSTRUMENT_DD_FAULT_OUT_CHARGE_DEVICE} (0x3d902012), {@code INSTRUMENT_DD_FAULT_CAR_CHARGE_SYSTEM} (0x3d902013), {@code INSTRUMENT_DD_FAULT_LOW_POWER_LIMIT} (0x3d902014), {@code INSTRUMENT_DD_FAULT_ENTER_FORCED_EV} (0x3d902015), {@code INSTRUMENT_DD_FAULT_NEED_MAINTAIN} (0x3d902016), {@code INSTRUMENT_DD_FAULT_LINK_ERROR_KEY_HOUR} (0x3d902018), {@code INSTRUMENT_DD_FAULT_KEY_NOT_DETECTED} (0x3d902019), {@code INSTRUMENT_DD_FAULT_KEY_LOW_POWER} (0x3d90201a), {@code INSTRUMENT_DD_FAULT_KEY_NOT_DETECTED_READER} (0x3d90201b), {@code INSTRUMENT_DD_FAULT_KEY_NOT_DETECTED_IN_CAR} (0x3d90201c), {@code INSTRUMENT_DD_FAULT_WASH_ELEC_GATE} (0x3d90201e), {@code INSTRUMENT_DD_FAULT_ADAPT_GEARBOX} (0x3d90201f), {@code INSTRUMENT_DD_FAULT_DISCHARGE_STOP} (0x3d902020), {@code INSTRUMENT_DD_FAULT_CELL_LOE_POWER} (0x3d902021), {@code INSTRUMENT_DD_FAULT_CHARGE_POT_NOT_CLOSE} (0x3d902022), {@code INSTRUMENT_DD_FAULT_SWITCH_TO_P_GEAR} (0x3d902023), {@code INSTRUMENT_DD_FAULT_NEED_CHARGE} (0x3d902024), {@code INSTRUMENT_DD_FAULT_PARK_BRAKE_UNRELEASED} (0x3d902025), {@code INSTRUMENT_DD_FAULT_AP_LIMITED} (0x3d902028), {@code INSTRUMENT_DD_FAULT_CHECK_SAFETYBELT_SYSTEM} (0x3d902029), {@code INSTRUMENT_DD_FAULT_CHECK_MEMORY_SYATEM} (0x3d90202a), {@code INSTRUMENT_DD_FAULT_CHECK_MOONROOF} (0x3d90202b), {@code INSTRUMENT_DD_FAULT_CELL_TEMP_AC_LIMITED} (0x3d90202c), {@code INSTRUMENT_DD_FAULT_CELL_LOW_POWER_AC_LIMITED} (0x3d90202d), {@code INSTRUMENT_DD_FAULT_CELL_LOW_POWER_DRIVE_LIMITED} (0x3d90202e), {@code INSTRUMENT_DD_FAULT_REMOTE_DRIVING_SUSPENDED} (0x3d901011), {@code INSTRUMENT_DD_FAULT_CHECK_BRAKING_SYSTEM} (0x3d901012), {@code INSTRUMENT_DD_FAULT_LOW_BRAKE_FLUID_LEVEL} (0x3d901013), {@code INSTRUMENT_DD_FAULT_INSUFFICIENT_OIL_PRESSURE} (0x3d901017), {@code INSTRUMENT_DD_FAULT_CHECK_POWERTRAIN} (0x3d901018), {@code INSTRUMENT_DD_FAULT_LOW_VOLTAGE_POWER_SUPPLY_SYSTEM_FAILURE} (0x3d901019), {@code INSTRUMENT_DD_FAULT_IRON_BATTERY_FAILURE} (0x3d90101a), {@code INSTRUMENT_DD_FAULT_CHECK_CAR_NETWORK} (0x3d90101b), {@code INSTRUMENT_DD_FAULT_CHECK_TRANSMISSION_SYSTEM} (0x3d90101c), {@code INSTRUMENT_DD_FAULT_CHECK_TRANSMISSION_SYSTEM_SEC} (0x3d90101d), {@code INSTRUMENT_DD_FAULT_LOW_BATTERY_LIMITED_POWER} (0x3d90101e), {@code INSTRUMENT_DD_FAULT_EV_FUNC_LIMITED} (0x3d90101f), {@code INSTRUMENT_DD_FAULT_EXIT_SMART_DRIVING_MODE_MANUAL_TAKEOVER} (0x3d901020), {@code INSTRUMENT_DD_FAULT_SMART_DRIVING_FAILURE_MANUAL_TAKEOVER} (0x3d901021), {@code INSTRUMENT_DD_FAULT_CHECK_IRON_BATTERY_SYSTEM} (0x3d901024), {@code INSTRUMENT_DD_FAULT_CHECK_ENGINE_SYSTEM} (0x3d901026), {@code INSTRUMENT_DD_FAULT_ENGINE_ASSESSORY_FUNC_LIMITED} (0x3d901027), {@code INSTRUMENT_DD_FAULT_TRANSMISSION_FUNC_LIMITED} (0x3d901028), {@code INSTRUMENT_DD_FAULT_HIGH_CLUTCH_TEMPERATURE} (0x3d901029), {@code INSTRUMENT_DD_FAULT_HIGH_TRANSMISSION_OIL_TEMPERATURE} (0x3d90102a), {@code INSTRUMENT_DD_FAULT_CHECK_SRS_SYSTEM} (0x3d90102b), {@code INSTRUMENT_DD_FAULT_ENGINE_START_FAILED} (0x3d90102f), {@code INSTRUMENT_DD_FAULT_LOW_COOLANT_LEVEL} (0x3d901030), {@code INSTRUMENT_DD_FAULT_AIR_HOT_MANAGEMENT_FAILURE} (0x3d901031), {@code INSTRUMENT_DD_FAULT_LOW_OIL_LEVEL} (0x3d901032), {@code INSTRUMENT_DD_FAULT_HIGH_OIL_LEVEL} (0x3d901033), {@code INSTRUMENT_DD_FAULT_CHECK_OIL_MONITORING_SYSTEM} (0x3d901034), {@code INSTRUMENT_DD_FAULT_LOW_TYRE_PRESSURE} (0x3d901036), {@code INSTRUMENT_DD_FAULT_CHECK_POWER_GENERATION_SYSTEM} (0x3d901039), {@code INSTRUMENT_DD_FAULT_CHECK_GEAR_SYSTEM} (0x3d90103a), {@code INSTRUMENT_DD_FAULT_CHECK_HDC_SYSTEM} (0x3d90103c), {@code INSTRUMENT_DD_FAULT_CHECK_BRAKE_PAD} (0x3d90103d), {@code INSTRUMENT_DD_FAULT_CHECK_MUL_VIDEO_CONTROLLER} (0x3d90103e), {@code INSTRUMENT_DD_FAULT_CHECK_FRONT_WAVE_RADAR} (0x3d90103f), {@code INSTRUMENT_DD_FAULT_AUTO_EMERGENCY_BRAKING_LIMITED} (0x3d901040), {@code INSTRUMENT_DD_FAULT_CHECK_PREDICTIVE_COLLISION_WARNING_SYSTEM} (0x3d901041), {@code INSTRUMENT_DD_FAULT_CHECK_PERSON_DETECTION_SYSTEM} (0x3d901042), {@code INSTRUMENT_DD_FAULT_LANE_KEEPING_LIMITED} (0x3d901043), {@code INSTRUMENT_DD_FAULT_ADAPTIVE_CRUISE_LIMITED} (0x3d901044), {@code INSTRUMENT_DD_FAULT_LANE_DEPARTURE_FUNC_LIMITED} (0x3d901045), {@code INSTRUMENT_DD_FAULT_BLIND_SPOT_MONITORING_LIMITED} (0x3d901046), {@code INSTRUMENT_DD_FAULT_SMART_CAMERA_USELESS} (0x3d901047), {@code INSTRUMENT_DD_FAULT_ENGINE_COOLANT_TEMP_HIGH} (0x3d901016), {@code INSTRUMENT_DD_FAULT_ENGINE_COOLANT_TEMP_HIGH_SAFE_PARK} (0x3d901015), {@code INSTRUMENT_DD_FAULT_ACCELERATION_BREAK_PEDAL} (0x3d90202f), {@code INSTRUMENT_DD_FAULT_NOTICE_ADD_FUEL} (0x3d902027), {@code INSTRUMENT_2IN1_FAULT_ENGINE_SPPED_HIGH} (0x3d90201d), {@code INSTRUMENT_DD_FAULT_BATTERY_LOW} (0x3d902017), {@code INSTRUMENT_DD_FAULT_NOTICE_POWER_SYSTEM} (0x3d90102d), {@code INSTRUMENT_2IN1_FAULT_YUN_LOW_OIL_PRESS} (0x3d903011), {@code INSTRUMENT_2IN1_FAULT_YUN_BRAKING_SYS_FAILUE} (0x3d903012), {@code INSTRUMENT_2IN1_FAULT_YUN_LOW_VOLT_POWER_SUPPLY_SYS} (0x3d903013), {@code INSTRUMENT_2IN1_FAULT_YUN_ENGINE} (0x3d903014), {@code INSTRUMENT_2IN1_FAULT_YUN_ABS_SYS} (0x3d903015), {@code INSTRUMENT_2IN1_FAULT_YUN_ESP} (0x3d903016), {@code INSTRUMENT_2IN1_FAULT_YUN_SRS} (0x3d90301a), {@code INSTRUMENT_2IN1_FAULT_YUN_STEERING_SYS} (0x3d90301b), {@code INSTRUMENT_2IN1_FAULT_YUN_TYRE_PRESS} (0x3d90301c), {@code INSTRUMENT_2IN1_FAULT_YUN_POWER_BATTARY} (0x3d90301f), {@code INSTRUMENT_2IN1_FAULT_YUN_POWER_SYS} (0x3d903021), {@code INSTRUMENT_2IN1_FAULT_YUN_OK} (0x3d903022), {@code INSTRUMENT_2IN1_FAULT_YUN_COOLANT_TEMP_HIGH} (0x3d90302a), {@code INSTRUMENT_DD_FAULT_NOTICE_RF_LIGHT_STSTEM} (0x0003d70b), {@code INSTRUMENT_DD_FAULT_LINK_ERROR_KEY_DAY} (0x000f8c01).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getModuleState(int module) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_MUSIC_INFO_RESULT} (0x420b1010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMusicInfoResult() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code INSTRUMENT_GET_NAVI_DESTINATION} (0x40c0103b). */
    public int getNaviDestinationCommand() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_OK_INDICATOR_COLOR} (0x2c000017).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getOKIndicatorColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_OK_INDICATOR} (0x2c000014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getOKIndicatorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_ODOMETER_DISPLAY} (0x26f00020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getOdometerDisplay() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_OIL_LEVEL_LIGHT} (0x4a508040).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getOilLevelAlarmIndicator() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_OIL_LEVEL_LIGHT_COLOR} (0x4a508043).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getOilLevelAlarmIndicatorColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_OUT_TEMP} (0x4a503040).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getOutCarTemperature() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_PCW_SAFE_DIST_ALARM_INSTRUCTION} (0x2a600014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPCWAlarmInstruction() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_POWER_BAT_FAILURE_WARN_LIGHT_COLOR} (0x2b00000b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerBatFailWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_POWER_BAT_FAILURE_WARN_LIGHT} (0x2b000008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerBatFailWarnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_POWER_BATTERY_CHARGE_CONNECT_INDICATOR_COLOR} (0x2a60002f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerBatteryChargeConnectIndicatorColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_POWER_BATTERY_CHARGE_CONNECT_INDICATOR} (0x2a60002c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerBatteryChargeConnectIndicatorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_POWER_BATTERY_HEAT_WARN_LIGHT_COLOR} (0x2a600035).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerBatteryHeatWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_POWER_BATTERY_HEAT_WARN_LIGHT} (0x2a600032).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerBatteryHeatWarnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_POWER_OFF_ERROR_INFO} (0x43400020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerOffErrInfo() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_POWER_ON_ERROR_INFO} (0x4340001c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerOnErrInfo() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_POWER_SYS_FAILURE_WARN_LIGHT_COLOR} (0x2a60001d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerSysFailWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_POWER_SYS_FAILURE_WARN_LIGHT} (0x2a60001a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerSysFailWarnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_POWER_UNIT} (0x4a508038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerUnit() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_PRESSURE_SUPPLY_SYS_FAILURE_WARN_LIGHT_COLOR} (0x28700023).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPressureSupplySysFailWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_PRESSURE_SUPPLY_SYS_FAILURE_WARN_LIGHT} (0x28700020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPressureSupplySysFailWarnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_LOW_OIL_PRESSURE_WARN_LIGHT_COLOR} (0x2960000b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPressureWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_LOW_OIL_PRESSURE_WARN_LIGHT} (0x29600008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPressureWarnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_RADIO_INFO_RESULT} (0x420d1010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRadioInfoResult() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_REMOTE_DRIVING_REMINDER} (0x43400024).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRemoteDrivingReminder() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code INSTRUMENT_GET_ROAD_NAME_CHECK_STATE} (0x420a1010). */
    public int getRoadNameCheckState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_SRS_FAILURE_WARN_LIGHT} (0x27500008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSRSFaultWarningLight() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_SRS_FAILURE_WARN_LIGHT_COLOR} (0x2750000b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSRSFaultWarningLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_MAIN_SAFETYBELT_STATE} (0x29400018), {@code INSTRUMENT_DD_DEPUTY_SAFETYBELT_STATE} (0x2610001b), {@code INSTRUMENT_DD_REAR_LEFT_SAFETYBELT_STATE} (0x2610001c), {@code INSTRUMENT_DD_REAR_RIGHT_SAFETYBELT_STATE} (0x2610001e), {@code INSTRUMENT_DD_REAR_MID_SAFETYBELT_STATE} (0x2610001d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSafetyBeltStatus(int area) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUEMNT_2IN1_SECOND_MENU} (0x25d0000b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSecondMenu() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_SMART_KEY_SYS_COLOR} (0x29600029).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSmartKeySysWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_SMART_KEY_SYS_WARN_LIGHT} (0x29600026).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSmartKeySysWarnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_SOUND_FREQ} (0x26100035).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSoundFreq() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_SOUND_TYPE} (0x26100038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSoundType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_SPACING_STATE} (0x26100032).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSpacingState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_SPEED_UNIT} (0x14400010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSpeedUnit() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_SPORT_INDICATOR_COLOR} (0x2b00002f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSportIndicatorColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_SPORT_INDICATOR} (0x2b00002c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSportIndicatorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_STEERINT_SYS_FAILURE_WARN_LIGHT_COLOR} (0x28700011).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSteeringSYSFailWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_STEERING_SYS_FAILURE_WARN_LIGHT} (0x2870000e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSteeringSYSFailWarnLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_TEXT_COLOR} (0x26100028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTextColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_FAULT_NOTICE_261} (0x26100008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTextInfo() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_DD_TIME_INTERVAL_STATE} (0x0006e5ab).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTimeIntervalState() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int getTotalMileage() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public double getTravelTime() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_TYRE_PRESSURE_CAR_TYPE} (0x4a50501e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTyrePressureCarType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_TYRE_PRESSURE_SYS_FAILURE_WARN_LIGHT_COLOR} (0x28700017).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTyrePressureSYSFailWarnLightColor() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_FAULT_TYRE_PRESSURE_SYS_FAILURE_WARN_LIGHT} (0x28700014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getTyrePressureSYSFailWarnLightState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code INSTRUMENT_UNIT_TEMPERATURE} (0x4a50303f), {@code INSTRUMENT_UNIT_PRESSURE} (0x4a506040), {@code INSTRUMENT_UNIT_POWER} (0x1440002c), {@code INSTRUMENT_UNIT_FUELCON} (0x4a507024), {@code INSTRUMENT_UNIT_FUELCON_DISTANCE} (0x49c00025). */
    public int getUnit(int unitName) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMET_2IN1_VIEW_STATUS} (0x26f0001e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getViewStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_WATER_TEMP_METER_PERCENT} (0x4a509018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getWaterTempMeterPercent() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_RF_TYRE_COLOR} (0x4a50a012), {@code INSTRUMENT_2IN1_RB_TYRE_COLOR} (0x4a50a016), {@code INSTRUMENT_2IN1_LF_TYRE_COLOR} (0x4a50a010), {@code INSTRUMENT_2IN1_LB_TYRE_COLOR} (0x4a50a014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getWheelColor(int position) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_RF_TYRE_PRESSURE} (0x4a50601c), {@code INSTRUMENT_2IN1_RB_TYRE_PRESSURE} (0x4a506034), {@code INSTRUMENT_2IN1_LF_TYRE_PRESSURE} (0x4a506010), {@code INSTRUMENT_2IN1_LB_TYRE_PRESSURE} (0x4a506028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getWheelPressure(int position) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_RF_TYRE_TEMPERATURE} (0x4a50a024), {@code INSTRUMENT_2IN1_RB_TYRE_TEMPERATURE} (0x4a50a03c), {@code INSTRUMENT_2IN1_LF_TYRE_TEMPERATURE} (0x4a50a018), {@code INSTRUMENT_2IN1_LB_TYRE_TEMPERATURE} (0x4a50a030).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getWheelTemperature(int position) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_2IN1_RF_TYRE_TEMPERATURE_COLOR} (0x4a50a02d), {@code INSTRUMENT_2IN1_RB_TYRE_TEMPERATURE_COLOR} (0x4a50a045), {@code INSTRUMENT_2IN1_LF_TYRE_TEMPERATURE_COLOR} (0x4a50a021), {@code INSTRUMENT_2IN1_LB_TYRE_TEMPERATURE_COLOR} (0x4a50a039).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getWheelTemperatureColor(int position) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code INSTRUMENT_UNIT_POWER_ONLINE} (0x9440002c), {@code INSTRUMENT_UNIT_PRESSURE_ONLINE} (0xca506040), {@code INSTRUMENT_UNIT_FUELCON_DISTANCE_ONLINE} (0xc9c00025), {@code INSTRUMENT_UNIT_TEMPERATURE_ONLINE} (0xc9c00020), {@code INSTRUMENT_ENERGY_DISPLAY} (0x26f00025).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int hasFeature(String feature) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, float value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.instrument.AbsBYDAutoInstrumentListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.instrument.AbsBYDAutoInstrumentListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int reset(int item, int value) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int resetMileage(int target, int value) { throw new RuntimeException("Stub!"); }
    public int sendAddressInfo(int target, String address) { throw new RuntimeException("Stub!"); }
    public int sendAutoNaviStatus(int status) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendCallInfo(byte[] info) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendCallState(int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendCallTime(int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
    public int sendCameraGuidanceInfo(int cameraType, int distance, int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendDestinationSetStatus(int status) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendMusicInfo(byte[] info) { throw new RuntimeException("Stub!"); }
    public int sendMusicName(String name) { throw new RuntimeException("Stub!"); }
    public int sendMusicPlaybackProgress(int progress) { throw new RuntimeException("Stub!"); }
    public int sendMusicSource(int source) { throw new RuntimeException("Stub!"); }
    public int sendMusicState(int state) { throw new RuntimeException("Stub!"); }
    public int sendNextPathName(String name) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendRadioInfo(byte[] info) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendRadioState(int state) { throw new RuntimeException("Stub!"); }
    public int sendRestRouteInfo(int restHour, int restMinute, long restMileage) { throw new RuntimeException("Stub!"); }
    public int sendSafeGuidanceInfo(int safeType, int distance, int state) { throw new RuntimeException("Stub!"); }
    public int sendSimpleGuidanceInfo(int simpleType, int distance) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code INSTRUMENT_BACKLIGHT_BRIGHTNESS_SET} (0x3e300018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setBacklightBrightness(int brightness) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code INSTRUMENT_BACKLIGHT_AUTO_MODE_STATE_SET} (0x3e300012), {@code INSTRUMENT_BACKLIGHT_LINK_MODE_STATE_SET} (0x3e300036).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setBacklightModeState(int backlightMode, int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code INSTRUMET_2IN1_CLEAR_FAULT_SET} (0x4c108010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setClearFault(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code INSTRUMENT_DRIVING_INFO_SWITCH_SET} (0x3a20000a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setDrivingInfoSwitch(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code INSTRUMENT_ENERGY_DISPLAY_SET} (0x4c108014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setEnergyDisplay(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code INSTRUMENT_MAINTENANCE_TIME_SET} (0x3b700028), {@code INSTRUMENT_MAINTENANCE_MILEAGE_SET} (0x3b700018). */
    public int setMaintenanceInfo(int typeName, int infoValue) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code INSTRUMENT_UNIT_PRESSURE_SET} (0x4e400022), {@code INSTRUMENT_UNIT_FUELCON_DISTANCE_SET} (0x4e400025), {@code INSTRUMENT_UNIT_POWER_SET} (0x4e400040), {@code INSTRUMENT_UNIT_TEMPERATURE_SET} (0x4e400020). */
    public int setUnit(int unitName, int unitValue) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code INSTRUMET_2IN1_VIEW_SWITCH_SET} (0x4c108012).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setViewSwitch(int value) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.instrument.AbsBYDAutoInstrumentListener l) { throw new RuntimeException("Stub!"); }
}
