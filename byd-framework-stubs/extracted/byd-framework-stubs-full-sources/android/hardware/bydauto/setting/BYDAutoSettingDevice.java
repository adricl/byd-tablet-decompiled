package android.hardware.bydauto.setting;

/** Permissions: {@code android.permission.BYDAUTO_SETTING_COMMON}, {@code android.permission.BYDAUTO_SETTING_GET}, {@code android.permission.BYDAUTO_SETTING_SET} */
public final class BYDAutoSettingDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int AIR_LIGHT_PANEL_STATE_CLOSE = 2;
    public static final int AIR_LIGHT_PANEL_STATE_FIRST_POWERON = 3;
    public static final int AIR_LIGHT_PANEL_STATE_INVALID = 0;
    public static final int AIR_LIGHT_PANEL_STATE_OPEN = 1;
    public static final int AUTO_LOCK_TIME_30S = 1;
    public static final int AUTO_LOCK_TIME_60S = 2;
    public static final int AUTO_RAIN_WIPER_INVALID = 0;
    public static final int AUTO_RAIN_WIPER_OFF = 2;
    public static final int AUTO_RAIN_WIPER_ON = 1;
    public static final int BACK_DOOR_OPENED_HEIGHT_MAX = 100;
    public static final int BACK_DOOR_OPENED_HEIGHT_MIN = 15;
    public static final int BODY_COLOR_AURORA_WHITE = 28;
    public static final int BODY_COLOR_BLACKSTONE_BLUE = 8;
    public static final int BODY_COLOR_BLEU_OCEAN_LENS = 31;
    public static final int BODY_COLOR_CRYSTAL_WHITE = 13;
    public static final int BODY_COLOR_DELAND_BLACK = 6;
    public static final int BODY_COLOR_DEMON_BLACK = 35;
    public static final int BODY_COLOR_DOME_BLUE = 40;
    public static final int BODY_COLOR_DOME_WHITE = 27;
    public static final int BODY_COLOR_FRENCH_RED = 14;
    public static final int BODY_COLOR_GRAY_SMOG = 26;
    public static final int BODY_COLOR_HONEY_ORANGE = 18;
    public static final int BODY_COLOR_INVALID = 0;
    public static final int BODY_COLOR_JET_BLACK = 1;
    public static final int BODY_COLOR_JUN_KILN_GRAY = 100;
    public static final int BODY_COLOR_MERCURY_BLUE = 32;
    public static final int BODY_COLOR_MONET_SUNRISE_GOLD = 39;
    public static final int BODY_COLOR_MOUNTAIN_ASH = 7;
    public static final int BODY_COLOR_MOUNTAIN_GREEN = 24;
    public static final int BODY_COLOR_MOUNTAIN_ROCK_GREEN = 34;
    public static final int BODY_COLOR_POOP_PINK = 20;
    public static final int BODY_COLOR_RED_EMPEROR = 3;
    public static final int BODY_COLOR_ROSEMARY_GREY = 29;
    public static final int BODY_COLOR_RUSTLING_GREEN = 19;
    public static final int BODY_COLOR_SANDALWOOD_PURPLE = 38;
    public static final int BODY_COLOR_SILVER_SAND_BLACK = 9;
    public static final int BODY_COLOR_SILVER_TITANATE = 10;
    public static final int BODY_COLOR_SKY_BLUE = 15;
    public static final int BODY_COLOR_SKY_GREEN = 25;
    public static final int BODY_COLOR_SMART_BLUE = 17;
    public static final int BODY_COLOR_SNOW_WHITE = 4;
    public static final int BODY_COLOR_SPARKING_BLUE = 21;
    public static final int BODY_COLOR_STRATEGIC_BLUE = 11;
    public static final int BODY_COLOR_SURFING_BLUE = 22;
    public static final int BODY_COLOR_THE_LOST_ATLANTIS = 30;
    public static final int BODY_COLOR_TIANSHAN_WHITE = 5;
    public static final int BODY_COLOR_TIME_GREY = 2;
    public static final int BODY_COLOR_TITANIUM_EMPTY_GRAY = 12;
    public static final int BODY_COLOR_VAN_GOGH_ROSE_GOLD = 37;
    public static final int BODY_COLOR_VIBRANT_ORANGE = 16;
    public static final int BODY_COLOR_WHALE_BLUE = 36;
    public static final int BODY_COLOR_WINDSWEPT_GREEN = 33;
    public static final int BODY_COLOR_XK_BLACK = 23;
    public static final int BT_CALL_REDUCTION_WIND_MENU_OFF = 1;
    public static final int BT_CALL_REDUCTION_WIND_MENU_ON = 2;
    public static final int BT_CALL_STATE_BE_CALLED = 2;
    public static final int BT_CALL_STATE_CALL_SOMEBODY = 1;
    public static final int BT_CALL_STATE_DEFAULT = 0;
    public static final int BT_CALL_STATE_IGNORED = 4;
    public static final int BT_CALL_STATE_OVER = 5;
    public static final int BT_CALL_STATE_TALKING = 3;
    public static final int BT_LOW_POWER_MODE_ENTER = 1;
    public static final int BT_LOW_POWER_MODE_EXIT = 2;
    public static final int BT_LOW_POWER_MODE_INVALID = 0;
    public static final int CAR_REAR_VIEW_FIXED_ANGLE = 3;
    protected static final int CAR_REAR_VIEW_FIXED_ANGLE_HAL = 2;
    public static final int CAR_REAR_VIEW_MEMORY_ANGLE = 1;
    public static final int CAR_REAR_VIEW_OFF = 2;
    public static final int CAR_SETTING_INVALID = 0;
    public static final int CAR_SETTING_VALID = 1;
    public static final int COURTESY_LAMP_TIME_15S = 3;
    public static final int COURTESY_LAMP_TIME_30S = 4;
    public static final int COURTESY_LAMP_TIME_7P5S = 2;
    public static final int COURTESY_LAMP_TIME_OFF = 1;
    public static final int CRUISE_NOT_PROMPT = 0;
    public static final int CRUISE_PROMPT = 1;
    public static final int DEVICE_HAS_THE_FEATURE = 1;
    public static final int DEVICE_NOT_HAS_THE_FEATURE = 0;
    public static final int DEVICE_THE_FEATURE_LINK_ERROR = 65535;
    public static final int DEVICE_THE_FEATURE_NEVER_GET = 2;
    public static final int DIMMING_CONTROLLER_INTEGRATED = 2;
    public static final int DIMMING_CONTROLLER_INVALID = 0;
    public static final int DIMMING_CONTROLLER_NOT_INTEGRATED = 1;
    public static final int DM20_SOC_TARGET_MIN = 15;
    public static final int DM25_SOC_TARGET_MIN = 25;
    public static final int DRIVER_SEAT = 1;
    public static final int DRIVE_CONFIG_EV_FOUR_WHEEL = 4;
    public static final int DRIVE_CONFIG_FOUR_WHEEL = 2;
    public static final int DRIVE_CONFIG_FRONT = 1;
    public static final int DRIVE_CONFIG_REAR = 3;
    public static final int ENGINE_OIL_LEVEL_1P8_MIN = 2;
    public static final int ENGINE_OIL_LEVEL_2P8_MIN = 3;
    public static final int ENGINE_OIL_LEVEL_3P8_MIN = 4;
    public static final int ENGINE_OIL_LEVEL_4P8_MIN = 5;
    public static final int ENGINE_OIL_LEVEL_5P8_MIN = 6;
    public static final int ENGINE_OIL_LEVEL_6P8_MIN = 7;
    public static final int ENGINE_OIL_LEVEL_7P8_MIN = 8;
    public static final int ENGINE_OIL_LEVEL_BELOW_MIN = 0;
    public static final int ENGINE_OIL_LEVEL_CONFIG = 255;
    public static final int ENGINE_OIL_LEVEL_FAULT = 13;
    public static final int ENGINE_OIL_LEVEL_MAX = 9;
    public static final int ENGINE_OIL_LEVEL_MEASUREMENT = 11;
    public static final int ENGINE_OIL_LEVEL_MIN = 1;
    public static final int ENGINE_OIL_LEVEL_OIL_OK = 12;
    public static final int ENGINE_OIL_LEVEL_OVERFILL = 10;
    public static final int ENGINE_OIL_UPDATE_SIGNAL_NO = 0;
    public static final int ENGINE_OIL_UPDATE_SIGNAL_YES = 1;
    public static final int EXHIBITION_MODE_INDOOR = 1;
    public static final int EXHIBITION_MODE_INVALID = 0;
    public static final int EXHIBITION_MODE_NON = 3;
    public static final int EXHIBITION_MODE_OUTDOOR = 2;
    public static final int EXHIBITION_START_ENGINE_FLAG_FORBID = 2;
    public static final int EXHIBITION_START_ENGINE_FLAG_INVALID = 0;
    public static final int EXHIBITION_START_ENGINE_FLAG_PERMIT = 1;
    public static final int EXHIBITION_START_ENGINE_NO_PROMPT = 1;
    public static final int EXHIBITION_START_ENGINE_PROMPT = 0;
    public static final int EXIT_UPDATE = 1;
    public static final int E_PEDAL_MODE_CLOSE = 2;
    public static final int E_PEDAL_MODE_OPEN = 1;
    public static final int FACTORY_RESET_DEFAULT = 0;
    public static final int FACTORY_RESET_DISABLE = 2;
    public static final int FACTORY_RESET_ENABLE = 1;
    public static final String FEATURE_AUTO_RAIN_WIPER = "AutoRainWiper";
    public static final String FEATURE_BACK_DOOR = "BackDoor";
    public static final String FEATURE_BT_CALL_REDUCTION_WIND = "BTCallReductionWind";
    public static final String FEATURE_BT_KEY = "BluetoothKey";
    public static final String FEATURE_CAR_REAR_MIRROR_FLIP_ANGEL = "CarRearMirrorFilpAngle";
    public static final String FEATURE_CMD_HEADLAMP_HEIGHT_CONFIG = "HeadlampHeightConfig";
    public static final String FEATURE_DIMMING_CONTROLLER_CONFIG = "DimmingControllerConfig";
    public static final String FEATURE_DOOR_SC10_429 = "DoorSC19";
    public static final String FEATURE_DRIVER_SEAT_HEATING = "DriverSeatHeating";
    public static final String FEATURE_DRIVER_SEAT_HEATING_LEVEL1 = "DriverSeatHeatingLevel1";
    public static final String FEATURE_DRIVER_SEAT_LEGREST_CONFIG = "DriverSeatLegrestConfig";
    public static final String FEATURE_DRIVER_SEAT_VENTILATING = "DriverSeatVentilating";
    public static final String FEATURE_DRIVING_RECORDER = "DrivingRecorder";
    public static final String FEATURE_ENGINE_OIL_DETECTION = "EngineOilDetection";
    public static final String FEATURE_E_PEDAL_MODE_STATE = "EPedalModeState";
    public static final String FEATURE_FRONT_WINDSCREEN_WIPER_OVERHAUL = "FrontWindscreenWiperOverhaul";
    public static final String FEATURE_IAL_AREA_CONFIG = "IALAreaConfig";
    public static final String FEATURE_IAL_BRIGHTNESS_CONFIG = "IALBrightnessConfig";
    public static final String FEATURE_IAL_COLOR_CINFIG = "IALColorConfig";
    public static final String FEATURE_INSIDE_LIGHT = "InsideLight";
    public static final String FEATURE_INSIDE_LIGHT_DOOR_ONLINE = "InsideLightDoorOnline";
    public static final String FEATURE_INTERIOR_ATMOSPHERE_LAMP = "InteriorAtmosphereLamp";
    public static final String FEATURE_LANTERN_LANGUAGE_MODE = "LanternLanguageMode";
    public static final String FEATURE_LEARNER_DRIVER_MODE = "LearnerDriverMode";
    public static final String FEATURE_MASSAGE_ONLINE_LB = "MassageOnlineLB";
    public static final String FEATURE_MASSAGE_ONLINE_RB = "MassageOnlineRB";
    public static final String FEATURE_OVERSPEED_LOCKING = "OverspeedLocking";
    public static final String FEATURE_PARKING_AUTO_INNER_LOOP = "ParkingAutoInnerLoop";
    public static final String FEATURE_PASSENGER_SEAT_HEATING = "PassengerSeatHeating";
    public static final String FEATURE_PASSENGER_SEAT_HEATING_LEVEL1 = "PassengerSeatHeatingLevel1";
    public static final String FEATURE_PASSENGER_SEAT_VENTILATING = "PassengerSeatVentilating";
    public static final String FEATURE_POWER_STEERING = "PowerSteering";
    public static final String FEATURE_REARVIEW_MIRROR_FOLLOW_UP = "RearviewMirrorFollowUp";
    public static final String FEATURE_REAR_AC_PANEL_LOCK_TIME = "RearACPanelAutoLockTime";
    public static final String FEATURE_REAR_LEFT_SEAT_HEATING = "RearLeftSeatHeating";
    public static final String FEATURE_REAR_LEFT_SEAT_VENTILATING = "RearLeftSeatVentilating";
    public static final String FEATURE_REAR_RIGHT_SEAT_HEATING = "RearRightSeatHeating";
    public static final String FEATURE_REAR_RIGHT_SEAT_VENTILATING = "RearRightSeatVentilating";
    public static final String FEATURE_REAR_WINDSCREEN_WIPER_OVERHAUL = "RearWindscreenWiperOverhaul";
    public static final String FEATURE_SEAT_HEATING_AND_VENTILATING = "SeatHeatingAndVentilating";
    public static final String FEATURE_SMART_WELCOME_LIGHT_STATE = "SmartWelcomeLightState";
    public static final String FEATURE_SPEED_REMINDER_ONLINE = "SpeedReminderOnline";
    public static final String FEATURE_STEERING_WHEEL_HEATING_STATE = "SteeringWheelHeatingState";
    public static final String FEATURE_TUNNEL_AUTO_INNER_LOOP = "TunnelAutoInnerLoop";
    public static final int FESTIVAL_INFO_CHRISTMAS = 9;
    public static final int FESTIVAL_INFO_DRAGON_BOAT_FESTIVAL = 6;
    public static final int FESTIVAL_INFO_INVALID = 0;
    public static final int FESTIVAL_INFO_LABOR_DAY = 5;
    public static final int FESTIVAL_INFO_LANTERN_FESTIVAL = 3;
    public static final int FESTIVAL_INFO_NATIONAL_DAY = 8;
    public static final int FESTIVAL_INFO_NEW_YEAR = 1;
    public static final int FESTIVAL_INFO_SPRING_FESTIVAL = 2;
    public static final int FESTIVAL_INFO_TEACHER_DAY = 7;
    public static final int FESTIVAL_INFO_WOMEN_DAY = 4;
    public static final int FRONT_WINDSCREEN_WIPER = 1;
    public static final int HANDLE_AUTO_RESET_10MIN = 4;
    public static final int HANDLE_AUTO_RESET_2MIN = 2;
    public static final int HANDLE_AUTO_RESET_5MIN = 3;
    public static final int HANDLE_AUTO_RESET_OFF = 1;
    public static final int HEADLAMP_HEIGHT_LEVEL_INVALID = 0;
    public static final int HEADLAMP_HEIGHT_LEVEL_MAX = 11;
    public static final int HEADLAMP_HEIGHT_LEVEL_MIN = 1;
    public static final int IAL_AREA_ALL_ROW = 3;
    public static final int IAL_AREA_BACK_ROW = 2;
    public static final int IAL_AREA_FRONT_ROW = 1;
    public static final int IAL_BRIGHTNESS_MAX = 5;
    public static final int IAL_BRIGHTNESS_MIN = 0;
    public static final int IAL_COLD_WHITE = 2;
    public static final int IAL_COLOR_INVALID = 0;
    public static final int IAL_COLOR_NONE = 1;
    public static final int IAL_COLOR_ONE = 2;
    public static final int IAL_COLOR_SEVEN = 3;
    public static final int IAL_COLOR_THIRTYONE = 4;
    public static final int IAL_CTRL_SOURCE_UI = 0;
    public static final int IAL_CTRL_SOURCE_VOICE = 1;
    public static final int IAL_DARK_BLUE = 7;
    public static final int IAL_ICE_BLUE = 1;
    public static final int IAL_OTHER_COLOR = 31;
    public static final int IAL_RED_ORANGE = 4;
    public static final int IAL_RED_PURPLE = 6;
    public static final int IAL_TRUE_RED = 5;
    public static final int IAL_WARM_WHITE = 3;
    public static final int IL_DURATION_15_S = 3;
    public static final int IL_DURATION_30_S = 4;
    public static final int IL_DURATION_7p5_S = 2;
    public static final int IL_DURATION_OFF = 1;
    public static final int INSIDE_LIGHT_DOOR_CLOSE = 2;
    public static final int INSIDE_LIGHT_DOOR_INVALID = 0;
    public static final int INSIDE_LIGHT_DOOR_OPEN = 1;
    public static final int INSIGHT_LIGHT_OFF = 1;
    public static final int INSIGHT_LIGHT_ON = 2;
    public static final int INSTRUMENT_AC_KEY_AUTO = 2;
    public static final int INSTRUMENT_AC_KEY_AUTODIAGNOSIS_SIGNAL = 13;
    public static final int INSTRUMENT_AC_KEY_FRONT_DEFROST = 3;
    public static final int INSTRUMENT_AC_KEY_INVALID = 0;
    public static final int INSTRUMENT_AC_KEY_OFF = 1;
    public static final int INSTRUMENT_AC_KEY_PRESS_AC = 10;
    public static final int INSTRUMENT_BACKLIGHT_CTL_TYPE_N = 1;
    public static final int INSTRUMENT_BACKLIGHT_CTL_TYPE_R = 0;
    public static final int LANTERN_LANGUAGE_MODE_HL_LOCK_WELCOME = 3;
    public static final int LANTERN_LANGUAGE_MODE_HL_UNLOCK_WELCOME = 2;
    public static final int LANTERN_LANGUAGE_MODE_NONE = 1;
    public static final int LEARNER_DRIVER_ACC_LIMIT_STATE_ACTIVATED = 0;
    public static final int LEARNER_DRIVER_ACC_LIMIT_STATE_INACTIVATED = 1;
    public static final int LEARNER_DRIVER_MODE_STATE_ENTERED = 2;
    public static final int LEARNER_DRIVER_MODE_STATE_ENTERING = 1;
    public static final int LEARNER_DRIVER_MODE_STATE_ERROR = 6;
    public static final int LEARNER_DRIVER_MODE_STATE_EXITED = 4;
    public static final int LEARNER_DRIVER_MODE_STATE_EXITING = 3;
    public static final int LEARNER_DRIVER_MODE_STATE_INVALID = 0;
    public static final int LEARNER_DRIVER_MODE_STATE_UNAVAILABLE = 5;
    protected static final int LEARNER_DRIVER_MODE_SWITCH_OFF = 2;
    protected static final int LEARNER_DRIVER_MODE_SWITCH_ON = 1;
    public static final int LEFT_FIELD_PLATFORM_INVALID = 0;
    public static final int LEFT_FIELD_PLATFORM_L1 = 1;
    public static final int LEFT_FIELD_PLATFORM_L2 = 2;
    public static final int LEFT_FIELD_PLATFORM_L3 = 3;
    public static final int LEFT_FIELD_PLATFORM_L4 = 4;
    public static final int MASSAGE_LEVEL_INTENSITY1 = 1;
    public static final int MASSAGE_LEVEL_INTENSITY2 = 2;
    public static final int MASSAGE_LEVEL_INTENSITY3 = 3;
    public static final int MASSAGE_LEVEL_INVALID = 0;
    public static final int MASSAGE_MODE_CLOSE = 1;
    public static final int MASSAGE_MODE_INVALID = 0;
    public static final int MASSAGE_MODE_PULSE = 3;
    public static final int MASSAGE_MODE_SHOULDER = 6;
    public static final int MASSAGE_MODE_STRETCH = 4;
    public static final int MASSAGE_MODE_WAIST = 5;
    public static final int MASSAGE_MODE_WAVE = 2;
    public static final int MCU_PH2_STATE_H = 1;
    public static final int MCU_PH2_STATE_L = 0;
    public static final int MCU_RESTART_INVALID = 0;
    public static final int MCU_RESTART_VALID = 1;
    public static final int MULTIMEDIA_MOTOR_TEMP_NORMAL = 1;
    public static final int MULTIMEDIA_MOTOR_TEMP_OVERHEAT = 2;
    public static final int NEED_NOTICE = 2;
    public static final int NIGHT_DRIVE_LIGHT_ON_REMINDER_OFF = 0;
    public static final int NIGHT_DRIVE_LIGHT_ON_REMINDER_ON = 1;
    public static final int NOT_NEED_NOTICE = 1;
    public static final int OVERSPEED_LOCKING_OFF = 0;
    public static final int OVERSPEED_LOCKING_ON = 1;
    public static final int PASSENGER_SEAT = 2;
    public static final int REARVIEW_MIRROR_AUTO_FOLD_INVALID = 0;
    public static final int REARVIEW_MIRROR_AUTO_FOLD_NO = 1;
    public static final int REARVIEW_MIRROR_AUTO_FOLD_YES = 2;
    public static final int REAR_AC_PANEL_AUTO_LOCK_0S = 1;
    public static final int REAR_AC_PANEL_AUTO_LOCK_15S = 4;
    public static final int REAR_AC_PANEL_AUTO_LOCK_5S = 2;
    public static final int REAR_AC_PANEL_AUTO_LOCK_8S = 3;
    public static final int REAR_AC_PANEL_AUTO_LOCK_INVALID = 0;
    public static final int REAR_LEFT_SEAT = 3;
    public static final int REAR_RIGHT_SEAT = 4;
    public static final int REAR_WINDSCREEN_WIPER = 2;
    public static final int REMINDER_FINISH = 2;
    public static final int REMINDER_INVALID = 0;
    public static final int REMINDER_POWER_ONOFF = 2;
    public static final int REMINDER_REMINDING = 1;
    public static final int REMINDER_SHUTDOWN_POWER = 1;
    public static final int REMOTE_CONTROL_UNLOCKING_OFF = 0;
    public static final int REMOTE_CONTROL_UNLOCKING_ON = 1;
    public static final int REQUEST_UPDATE = 0;
    public static final int RESET_INVALID = 0;
    public static final int RESET_ITEM_ATMP = 4;
    public static final int RESET_ITEM_BACK_LIGHT = 6;
    public static final int RESET_ITEM_DOOR_WINDOW = 0;
    public static final int RESET_ITEM_LOCK = 1;
    public static final int RESET_ITEM_READING_LIGHT = 5;
    public static final int RESET_ITEM_REAR_MIRROR = 3;
    public static final int RESET_ITEM_SEAT_SELF_RETURN = 2;
    public static final int RESET_VALID = 1;
    public static final int RESTORE_DEFAULT_VALUES = 1;
    public static final int ROTATION_HORIZONTAL = 1;
    public static final int ROTATION_VERTICAL = 2;
    public static final int SEAT_HEATING_HIGH = 3;
    public static final int SEAT_HEATING_LEVEL1_CLOSE = 5;
    public static final int SEAT_HEATING_LEVEL1_OFF = 1;
    public static final int SEAT_HEATING_LEVEL1_ON = 2;
    public static final int SEAT_HEATING_LEVEL1_OPEN = 4;
    public static final int SEAT_HEATING_LEVEL3 = 4;
    public static final int SEAT_HEATING_LEVEL3_ON = 6;
    public static final int SEAT_HEATING_LOW = 2;
    public static final int SEAT_HEATING_OFF = 1;
    public static final int SEAT_VENTILATING_HIGH = 3;
    public static final int SEAT_VENTILATING_LEVEL1_CLOSE = 5;
    public static final int SEAT_VENTILATING_LEVEL1_OPEN = 4;
    public static final int SEAT_VENTILATING_LEVEL3 = 4;
    public static final int SEAT_VENTILATING_LEVEL3_ON = 6;
    public static final int SEAT_VENTILATING_LOW = 2;
    public static final int SEAT_VENTILATING_OFF = 1;
    public static final int SETTING_CMD_MASSAGE_LB = 1;
    public static final int SETTING_CMD_MASSAGE_RB = 2;
    public static final int SETTING_COMMAND_BUSY = -2147482647;
    public static final int SETTING_COMMAND_FAILED = -2147482648;
    public static final int SETTING_COMMAND_INVALID = -2147482645;
    public static final int SETTING_COMMAND_SUCCESS = 0;
    public static final int SETTING_COMMAND_TIMEOUT = -2147482646;
    public static final int SET_AC_AUTO_AIR_COMFORT = 2;
    public static final int SET_AC_AUTO_AIR_ECONOMY = 1;
    public static final int SET_AC_AUTO_WIND_LV_LARGE = 3;
    public static final int SET_AC_AUTO_WIND_LV_MEDIUM = 2;
    public static final int SET_AC_AUTO_WIND_LV_SMALL = 1;
    public static final int SET_ALL_INTERFACE_SETTINGS_AND_KEY = 3;
    public static final int SET_ALL_INTERFACE_SETTINGS_NO_KEY = 2;
    public static final int SET_CAR_LIGHT_DELAY_VALUE_MAX = 60;
    public static final int SET_CAR_LIGHT_DELAY_VALUE_MIN = 0;
    public static final int SET_CAR_LOCK_OFF_4DOORS = 0;
    public static final int SET_CAR_LOCK_OFF_DR_SIDE = 1;
    public static final int SET_CAR_REAR_VIEW_FLIP_ANGLE_MAX = 8;
    public static final int SET_CAR_REAR_VIEW_FLIP_ANGLE_MIN = 0;
    public static final int SET_CAR_SPEECH_VOL_HIGH = 3;
    public static final int SET_CAR_SPEECH_VOL_LOW = 1;
    public static final int SET_CAR_SPEECH_VOL_MEDIUM = 2;
    public static final int SET_CHARGE_PORT_LOCK_MODE = 2;
    public static final int SET_DM_PLATFORM_INVALID = 0;
    public static final int SET_DM_PLATFORM_ONE = 1;
    public static final int SET_DM_PLATFORM_TWO = 2;
    public static final int SET_DR_ENERGY_FB_LARGE = 3;
    public static final int SET_DR_ENERGY_FB_LARGE_DM = 6;
    public static final int SET_DR_ENERGY_FB_LOW = 1;
    public static final int SET_DR_ENERGY_FB_STANDARD = 2;
    public static final int SET_DR_ENERGY_FB_STANDARD_DM = 5;
    public static final int SET_DR_ENERGY_FB_SUPER = 4;
    public static final int SET_DR_SOC_TARGET_MAX = 70;
    public static final int SET_DR_SOC_TARGET_MIN = 0;
    public static final int SET_DR_ST_ASSIS_COMFORT = 1;
    public static final int SET_DR_ST_ASSIS_SPORT = 2;
    public static final int SET_DR_SWITCH_FAIL = 0;
    public static final int SET_DR_SWITCH_FAIL_WHILE_LOCKING = 2;
    public static final int SET_DR_SWITCH_SUCCESS = 1;
    public static final int SET_INSIDE_REAR_SCREEN_COMPASS = 2;
    public static final int SET_INSIDE_REAR_SCREEN_OFF = 3;
    public static final int SET_INSIDE_REAR_SCREEN_VIDEO_RECORDING = 1;
    public static final int SET_INS_THEME_MAX = 10;
    public static final int SET_INS_THEME_MIN = 1;
    public static final int SET_INVALID = 255;
    public static final int SET_LANGUAGE_ARABIC = 14;
    public static final int SET_LANGUAGE_BOSNIAN = 46;
    public static final int SET_LANGUAGE_BULGARIAN = 40;
    public static final int SET_LANGUAGE_CATALAN = 34;
    public static final int SET_LANGUAGE_COMPLEX_CHINESE = 2;
    public static final int SET_LANGUAGE_CROATIAN = 35;
    public static final int SET_LANGUAGE_CZECH = 27;
    public static final int SET_LANGUAGE_DANISH = 20;
    public static final int SET_LANGUAGE_DUTCH = 15;
    public static final int SET_LANGUAGE_ENGLISH = 3;
    public static final int SET_LANGUAGE_ENGLISH_AUSTRALIA = 33;
    public static final int SET_LANGUAGE_ESTONIAN = 44;
    public static final int SET_LANGUAGE_FINNISH = 19;
    public static final int SET_LANGUAGE_FRENCH = 10;
    public static final int SET_LANGUAGE_FRENCH_CANADA = 32;
    public static final int SET_LANGUAGE_GERMAN = 11;
    public static final int SET_LANGUAGE_GREEK = 37;
    public static final int SET_LANGUAGE_HEBREW = 21;
    public static final int SET_LANGUAGE_HINDI = 13;
    public static final int SET_LANGUAGE_HUNGARIAN = 25;
    public static final int SET_LANGUAGE_INDONESIAN = 30;
    public static final int SET_LANGUAGE_ITALIAN = 12;
    public static final int SET_LANGUAGE_JAPANESE = 8;
    public static final int SET_LANGUAGE_KAZAKH = 39;
    public static final int SET_LANGUAGE_KOREAN = 9;
    public static final int SET_LANGUAGE_LATVIAN = 45;
    public static final int SET_LANGUAGE_LITHUANIAN = 43;
    public static final int SET_LANGUAGE_MALAYSIAN = 31;
    public static final int SET_LANGUAGE_MAX = 46;
    public static final int SET_LANGUAGE_MIN = 1;
    public static final int SET_LANGUAGE_NORWEGIAN = 18;
    public static final int SET_LANGUAGE_POLISH = 28;
    public static final int SET_LANGUAGE_PORTUGUESE = 6;
    public static final int SET_LANGUAGE_PORTUGUESE_BRAZIL = 7;
    public static final int SET_LANGUAGE_ROMANIAN = 36;
    public static final int SET_LANGUAGE_RUSSIAN = 22;
    public static final int SET_LANGUAGE_SERBIAN = 41;
    public static final int SET_LANGUAGE_SIMPLE_CHINESE = 1;
    public static final int SET_LANGUAGE_SLOVAK = 26;
    public static final int SET_LANGUAGE_SLOVENIAN = 42;
    public static final int SET_LANGUAGE_SPANISH = 4;
    public static final int SET_LANGUAGE_SPANISH_AMERICA = 5;
    public static final int SET_LANGUAGE_SWEDISH = 17;
    public static final int SET_LANGUAGE_THAI = 16;
    public static final int SET_LANGUAGE_TURKISH = 24;
    public static final int SET_LANGUAGE_UKRAINIAN = 38;
    public static final int SET_LANGUAGE_UZBEK_STAN = 23;
    public static final int SET_LANGUAGE_VIETNAMESE = 29;
    public static final int SET_NO_DETECT = 0;
    public static final int SET_NO_INTERFACE_ALL_SETTINGS = 0;
    public static final int SET_OFF = 0;
    public static final int SET_ON = 1;
    public static final int SET_ONLINE = 1;
    public static final int SET_ONLY_RECORD = 1;
    public static final int SET_PM25_SWITCH_OFF_ALL = 3;
    @Deprecated
    public static final int SET_PM25_SWITCH_ON_ALL = 0;
    public static final int SET_PM25_SWITCH_ON_IN = 1;
    public static final int SET_PM25_SWITCH_ON_OUT = 2;
    public static final int SET_STEER_ASSIST_FORBIT = 1;
    public static final int SET_STEER_ASSIST_PERMISSION = 0;
    public static final int SET_UNINVALID = 255;
    public static final int SMART_WELCOME_LIGHT_CLOSE = 2;
    public static final int SMART_WELCOME_LIGHT_INVALID = 0;
    public static final int SMART_WELCOME_LIGHT_OPEN = 1;
    public static final int SOC_CONFIG_DM20 = 3;
    public static final int SOC_CONFIG_DM25 = 2;
    public static final int SOC_CONFIG_DM25_4 = 4;
    public static final int SOC_CONFIG_DM25_5 = 5;
    public static final int SOC_CONFIG_DM25_6 = 6;
    public static final int SOC_CONFIG_DM25_7 = 7;
    public static final int SOC_CONFIG_DM25_8 = 8;
    public static final int SOC_CONFIG_DM25_9 = 9;
    public static final int SOC_CONFIG_DM25_A = 10;
    public static final int SOC_CONFIG_DM25_B = 11;
    public static final int SOC_CONFIG_DM25_C = 12;
    public static final int SOC_CONFIG_DM25_D = 13;
    public static final int SOC_CONFIG_DM25_E = 14;
    public static final int SOC_CONFIG_OFFLINE = 1;
    public static final int SPEED_REMINDER_MAX = 240;
    public static final int SPEED_REMINDER_MIN = 60;
    public static final int SPEED_REMINDER_MPH_MAX = 150;
    public static final int SPEED_REMINDER_MPH_MIN = 35;
    public static final int SPEED_REMINDER_OFF = 241;
    public static final int SPEED_REMINDER_TO_SET_MPH_ON = 75;
    public static final int SPEED_REMINDER_TO_SET_ON = 120;
    public static final int START_KEY_BOTH_VALID = 3;
    public static final int START_KEY_INVALID = 0;
    public static final int START_KEY_SIG1_VALID = 1;
    public static final int START_KEY_SIG2_VALID = 2;
    public static final int STATE_LOCK_RECORD = 2;
    public static final int STATE_NORMAL_RECORD = 1;
    public static final int STATE_TAKE_PICTURE = 4;
    public static final int STEERING_WHEEL_HEATING_INVALID = 0;
    public static final int STEERING_WHEEL_HEATING_OFF = 1;
    public static final int STEERING_WHEEL_HEATING_ON = 2;
    public static final int STEER_INVALID = 0;
    public static final int STEER_QIN_WITHOUT_ACC = 3;
    public static final int STEER_QIN_WITH_ACC = 4;
    public static final int STEER_YUAN_WITHOUT_ACC = 1;
    public static final int STEER_YUAN_WITH_ACC = 2;
    protected static final String TAG = "BYDAutoSettingDevice";
    public static final int TEMP_VALUE_MAX = 164;
    public static final int TEMP_VALUE_MIN = -80;
    public static final int TEST_MODE_ENTER = 1;
    public static final int TEST_MODE_INVALID = 0;
    public static final int TEXT_ANIMATION_TYPE_INVALID = 0;
    public static final int TEXT_ANIMATION_TYPE_MAX = 14;
    public static final int TEXT_ANIMATION_TYPE_MIN = 2;
    public static final int TEXT_BACKGROUND_INVALID = 0;
    public static final int TEXT_BACKGROUND_NUMBER_MAX = 14;
    public static final int TEXT_BACKGROUND_NUMBER_MIN = 2;
    public static final int TEXT_COLOR_B_VALUE_INVALID = 0;
    public static final int TEXT_COLOR_B_VALUE_MAX = 254;
    public static final int TEXT_COLOR_B_VALUE_MIN = 1;
    public static final int TEXT_COLOR_G_VALUE_INVALID = 0;
    public static final int TEXT_COLOR_G_VALUE_MAX = 254;
    public static final int TEXT_COLOR_G_VALUE_MIN = 1;
    public static final int TEXT_COLOR_R_VALUE_INVALID = 0;
    public static final int TEXT_COLOR_R_VALUE_MAX = 254;
    public static final int TEXT_COLOR_R_VALUE_MIN = 1;
    public static final int TEXT_CONTENT_LENGTH_MAX = 255;
    public static final int TEXT_CONTENT_LENGTH_MIN = 1;
    public static final int TEXT_INFO_NUMBER_INVALID = 0;
    public static final int TEXT_INFO_NUMBER_MAX = 62;
    public static final int TEXT_INFO_NUMBER_MIN = 1;
    public static final int TEXT_NO_ANIMATION = 1;
    public static final int TEXT_NO_BACKGROUND = 1;
    public static final int TEXT_PLAY_SPEED_INVALID = 0;
    public static final int TEXT_PLAY_SPEED_MAX = 14;
    public static final int TEXT_PLAY_SPEED_MIN = 2;
    public static final int TEXT_PLAY_SPEED_SHOW_NOW = 1;
    public static final int TEXT_SIZE_INVALID = 0;
    public static final int TEXT_SIZE_MAX = 254;
    public static final int TEXT_SIZE_MIN = 1;
    public static final int TEXT_STATE_INVALID = 0;
    public static final int TEXT_STATE_READ = 1;
    public static final int TEXT_STATE_READING = 1;
    public static final int TEXT_STATE_READ_COMPLETE = 2;
    public static final int TEXT_STATE_READ_FAILURE = 3;
    public static final int TEXT_STATE_WRITE = 2;
    public static final int TEXT_STATE_WRITE_COMPLETE = 5;
    public static final int TEXT_STATE_WRITE_FAILURE = 6;
    public static final int TEXT_STATE_WRITING = 4;
    public static final int UI_GENERATION_ONE = 0;
    public static final int UI_GENERATION_ONE_PONIT_FIVE = 1;
    public static final int VEHICLE_STATE_BT_ON = 6;
    public static final int VEHICLE_STATE_EXHIBITION_MODE = 8;
    public static final int VEHICLE_STATE_HIGH_TEMP_DISINFECT = 7;
    public static final int VEHICLE_STATE_INVALID = 0;
    public static final int VEHICLE_STATE_NON_REMOTE_BOOT = 2;
    public static final int VEHICLE_STATE_OUTDOOR_EXHIBITION_MODE = 9;
    public static final int VEHICLE_STATE_PRESS_STARTUP = 5;
    public static final int VEHICLE_STATE_REMOTE_BOOT = 1;
    public static final int VEHICLE_STATE_REMOTE_CONTROL_START = 3;
    public static final int VEHICLE_STATE_SMART_CHARGE = 4;
    public static final int VOICE_CMD_CLOSE = 3;
    public static final int VOICE_CMD_OPEN = 1;
    public static final int VOICE_CMD_STOP = 2;
    public static final int WEATHER_FORCAST_BYTE_LEN = 33;
    public static final int WEATHER_STATE_CLOUDY = 1;
    public static final int WEATHER_STATE_INVALID = 0;
    public static final int WEATHER_STATE_RAINY = 3;
    public static final int WEATHER_STATE_SNOWY = 4;
    public static final int WEATHER_STATE_SUNNY = 2;
    public static final int WINDSCREEN_WIPER_OVERHAUL_CLOSE = 2;
    public static final int WINDSCREEN_WIPER_OVERHAUL_INVALID = 0;
    public static final int WINDSCREEN_WIPER_OVERHAUL_OPEN = 1;
    public static final int WINDSCREEN_WIPER_UNALLOWED_OVERHAUL = 3;

    BYDAutoSettingDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int factoryResetAll(int state) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_AC_AUTO_AIR} (0x4d902018). */
    public int getACAutoAir() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_AC_AUTO_WIND_LV} (0x4d902012).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getACAutoWindLevel() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_AC_BT} (0x4d902016). */
    public int getACBTWind() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_AC_PAUSE_CYCLE} (0x4d902014). */
    public int getACPauseCycle() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_AC_TUNNEL_CYCLE} (0x4d902010). */
    public int getACTunnelCycle() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_ATMOSPHERE_LAMP_PANEL_STATE} (0x3b300008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAirLightPanelState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_ATMOSPHERE_LAMP_TEXT_TRIGGER_NUMBER} (0x3b300018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAirLightTextNumber() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_ATMOSPHERE_LAMP_TEXT_STATE} (0x3b300014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAirLightTextState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_EXTREARMIR_FOLLOWUP_SWITCH} (0x4070001c). */
    public int getAutoExternalRearMirrorFollowUpSwitch() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_AUTO_LOCK_DET} (0xc0700014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAutoLock() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_AUTO_LOCK} (0x40700014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAutoLockSwitch() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_AUTO_LOCK_TIME} (0x3940001c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAutoLockTime() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_AUTO_RAIN_WIPER_SWITCH} (0x1330001e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAutoRainWiperState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_BT_CALL_REDUCTION_WIND_MENU} (0x4e600008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBTCallReductionWindMenuState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CMD_BT_KEY_MAC} (0x48004010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public byte[] getBTMacAddr() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_BACK_DOOR_ELECTRIC_MODE} (0x4b60000b). */
    public int getBackDoorElectricMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_BACK_DOOR_ELECTRIC_MODE_DET} (0x4010001b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBackDoorElectricModeOnlineState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_BACK_DOOR_OPEN_HEIGHT} (0x40100008). */
    public int getBackDoorOpenedHeight() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int getBackHomeLightDelay() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_BACK_HOME_LIGHT_DELAY_VALUE} (0x3ff0002d). */
    public int getBackHomeLightDelayValue() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_BACK_ROW} (0x00016ba3).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBackRowControl() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_BASE_PAD_AUTO_RISE_DET} (0x000fb0cc).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBasePadAutoRise() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_BASE_PAD_AUTO_RISE} (0x000a41ad).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBasePadAutoRiseState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_DVR_RECORD} (0x3ba00020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getCarRecorderRecording() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DR_CHARGER_PORT} (0x4750000c). */
    public int getChargingPort() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_COURTESY_LAMP_TIME} (0x39400010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getCourtesyLampTime() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SETTING_AUTO_CRUISE_PROMPT} (0x32d0001e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getCruiseBulletBox() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_DM_PLATFORM} (0x2ed00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDmPlatform() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_DOOR_LOCK} (0x0002e81d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDoorLock() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DRIVE_CONFIG_TYPE} (0x34100038). */
    public int getDriveConfig() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_MMS_DOOR_CLOSE} (0x0003723e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDriveDoorCloseInd() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_DV_AUTO_RETURN} (0x49400010). */
    public int getDriverSeatAutoReturn() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_DRIVER_SEATBK_DET} (0xc9400010). */
    public int getDriverSeatBack() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_DRVING_RECORD_DET} (0x3ba00000).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDrivingRecorder() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int getDrivingRecorderSwitchState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_DUAL_TEMP_AREA_AC_DET} (0x000a4bf7).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDualTempAreaAcOnlineState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_E_PEDAL_MODE_STATE} (0x34f0003a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEPedalMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code ONLINE_HAS_0x021800} (0x21800000), {@code SET_CAR_ELEC_HANDBRAKE_DET} (0x21800000).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getElecHandbrakeState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DR_ENERGY_FB} (0x34100022). */
    public int getEnergyFeedback() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_ENGINEOIL_EXIT_UPDATE} (0x05500011).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEngineOilExitUpdateState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_ENGINE_OIL_LEVEL} (0x30d00038). */
    public int getEngineOilLevel() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_ENGINE_OIL_UPDATE_SIGNAL} (0x23300018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEngineOilUpdateSignal() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_EXHIBITION_MODE} (0x31e00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getExhibitionMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_EXHIBITION_START_ENGINE_PROMPT} (0x46c0003c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getExhibitionStartEnginePrompt() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_HAVE_REARVIEW_MIRROR_AUTO_FOLD} (0x4070001a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getExternalRearMirrorAutoFoldSetting() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_HANDLE_AUTO_RESET} (0x40700041).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getHandleAutoResetTime() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_HOME_LIGHT_DET} (0xbff0002d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getHomeLightTime() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_AREA} (0x42e00020). */
    public int getIALArea() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS} (0x0007f8ae).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getIALBrightness() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_IAL_FRONT_BRIGHTNESS} (0x42e00008), {@code SET_IAL_BACK_BRIGHTNESS} (0x42e0000c), {@code SET_IAL_ALL_BRIGHTNESS} (0x00043611). */
    public int getIALBrightness(int area) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_COLOR} (0x000453c2).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getIALColor() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_IAL_FRONT_COLOR} (0x42e00010), {@code SET_IAL_BACK_COLOR} (0x42e00017), {@code SET_IAL_ALL_COLOR} (0x0002ae1a). */
    public int getIALColor(int area) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CMD_BT_LOW_POWER_MODE} (0x40b10010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getIKEYBTLowPowerMode() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_INTERIOR_LAMP_DURATION} (0x39400015). */
    public int getILDuration() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_INS_THEME_VALUE} (0x49c00028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getINSTheme() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_INSTRUMENT_BACKLIGHT_CTL_TYPE} (0x4bf0002d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getInsBacklightCtl() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_INSIDE_LIGHT_DOOR_STATE} (0x42e0002b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getInsideLightDoorState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_INSIDE_REAR_MIRROR_SCREEN_SWITCH} (0x3b900018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getInsideRearMirrorScreenSwitchState() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.setting.BYDAutoSettingDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_INSTRUEMT_AC_KEY} (0x4e501010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getInstrumentAcKeyType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_SPEECH_HINT} (0x000a8985).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getIntelligentVoiceIND() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_MMS_KEY_LOW} (0x0000afa7).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getKeyPowerLowInd() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_LPSWITCH_DNWINDOW_DET} (0xc8e0000e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLPSwitchDownwindow() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_LPSWITCH_UPWINDOW_DET} (0xc8e0000c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLPSwitchUpwindow() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_LANGUAGE_TYPE} (0x49c0000a). */
    public int getLanguage() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_LANTERN_LANGUAGE_MODE} (0x31e0000c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLanternLanguageMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_LEARNER_DRIVER_ACC_LIMIT_STATE} (0x34f00028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLearnerDriverAccLimitState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_LEARNER_DRIVER_MODE_STATE} (0x34f00025).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLearnerDriverModeState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_LEARNER_DRIVER_MODE_STATE} (0x34f00025).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLearnerDriverModeSwitchState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_MMS_LEAVE_P} (0x0007e78d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLeaveCarPInd() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_HOME_OFF_LIGHT_DET} (0xbff00030).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLeaveHomeLightTime() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_LEFT_FIELD_PLATFORM} (0x2940002a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLeftFieldPlatform() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CMD_LEFT_HEAD_LIGHT_LEVEL} (0x3ac00013).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLeftHeadlampLevel() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_LEFT_HOME_LIGHT_DELAY} (0x00034898).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLeftHomeLightDelay() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_LEFT_HOME_LIGHT_DELAY_VALUE} (0x3ff00030). */
    public int getLeftHomeLightDelayValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_L_VIEW} (0x4b800024). */
    public int getLeftViewMirrorFlipAngle() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_LOCK_CLOSEWINDOW} (0x48e00020). */
    public int getLockCarRiseWindow() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_LOCK_OFF} (0x40700016). */
    public int getLockOff() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_LOCK_AUTO_WINDOW_DET} (0xc8e00020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLockUpwindow() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_LPUNLOCKWINDOW} (0x48e0000e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLongPressUnlockWindow() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_MMS_LOW_BAT} (0x00093073).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLowBatteryInd() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_MMS_LOW_OIL} (0x000eceb3).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLowOilInd() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_MAINTAIN_REMIND_STATE} (0x0550001a). */
    public int getMaintainRemindState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_REAR_LEFT_SEAT_MASSAGE_LEVEL} (0x4fa00024), {@code SET_REAR_RIGHT_SEAT_MASSAGE_LEVEL} (0x4fa0002c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMassageLevel(int type) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_REAR_LEFT_SEAT_MASSAGE_MODE} (0x4fa00020), {@code SET_REAR_RIGHT_SEAT_MASSAGE_MODE} (0x4fa00028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMassageMode(int type) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_MICRO_SWITCH_LOCK_WINDOW} (0x48e0000c). */
    public int getMicroSwitchLockWindowState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_LPUNLOCKWINDOW} (0x48e0000e) [via getLongPressUnlockWindow()]. */
    public int getMicroSwitchUnlockWindowState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_MMS_MIS_KEY} (0x000999e2).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMissKeyInd() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_MULTIMEDIA_ELECTRIC_MOTOR_TEMP} (0x41f0001a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMultimediaMotorTemperatureState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_MMS_NIGHT_DR} (0x0006ffc8).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getNightDRLightOnInd() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_NIGHT_DRIVE_LIGHT_ON_REMINDER} (0x3ff0000f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getNightDriveLightOnReminder() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_POWER_OFF_REMINDER} (0x43400008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getOffReminder() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_OVERSPEED_LOCKING_STATE} (0x40700014). */
    public int getOverspeedLock() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_OVERSPEED_LOCKING_STATE} (0x40700014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getOverspeedLockingState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_PM25_POWER} (0x4f600008). */
    public int getPM25Power() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_PM25_CTRL} (0x0000a5d0).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPM25Switch() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_PM25_SW_CHECK} (0x4f60000c). */
    public int getPM25SwitchCheck() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_PM25_TIME} (0x4f60000e). */
    public int getPM25TimeCheck() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_PANORAMIC_SUNROOF_DET} (0x0007f440).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPanoramaSunRoofOnlineState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_MMS_FREE_P} (0x00082d2b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getParkBrakeInd() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_REAR_AC_DET} (0x4330001a). */
    public int getRearAcOnlineState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_REAR_AC_PANEL_LOCK_TIME} (0x3f10000d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRearAcPanelAutoLockTime() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_REAR_MIRROR_FLIP_DET} (0xc9400018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRearMirrorFlip() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_REAR_VIEW_ANGLE} (0x4940003e). */
    public int getRearViewMirrorAngle() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_EXT_REARVIEW_MIRROR_AUTO_FOLD} (0x0003b9bf).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRearViewMirrorAutoFoldMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_EXT_REARVIEW_MIRROR_AUTO_FOLD_DET} (0x4070001a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRearViewMirrorAutoFoldModeOnlineState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_REAR_VIEW} (0x49400018). */
    public int getRearViewMirrorFlip() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_TELECTRL_DNWINDOW_DET} (0xc8e0000a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRemoteControlDownwindow() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_CTRL_WINDOW} (0x48e0000a). */
    public int getRemoteControlDownwindowState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_TELECTRL_UPWINDOW_DET} (0xc8e00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRemoteControlUpwindow() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_REMOTE_CTRL_UPWINDOW} (0x48e00008). */
    public int getRemoteControlUpwindowState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_REMOTE_CONTROL_UNLOCKING} (0x40700016).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRemoteCtlUnlockingState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_REMOTE_DRIVING_DET} (0x000b550c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRemoteDrivingOnlineState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CMD_RIGHT_HEAD_LIGHT_LEVEL} (0x3ad00013).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRightHeadlampLevel() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_R_VIEW} (0x4b900010). */
    public int getRightViewMirrorFlipAngle() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_SOC_DM_VERSION} (0x34f00015).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSOCConfig() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DR_SOC_TARGET} (0x34100028). */
    public int getSOCTarget() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_MMS_BELT} (0x00029c92).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSafeBeltInd() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_SAFE_WARN_STATE} (0x0550001b). */
    public int getSafeWarnState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DRIVER_SEAT_HEATING_STATE} (0x4fa0000b), {@code SET_PASSENGER_SEAT_HEATING_STATE} (0x4fa00013), {@code SET_REAR_LEFT_SEAT_HEATING_STATE} (0x4860000b), {@code SET_REAR_RIGHT_SEAT_HEATING_STATE} (0x48600013). */
    public int getSeatHeatingState(int seatID) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_DRIVER_SEAT_HEATING_STATE1} (0x3b400042), {@code SET_PASSENGER_SEAT_HEATING_STATE1} (0x3b400044).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSeatHeatingState1(int seatID) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DRIVER_SEAT_VENTILATING_STATE} (0x4fa00008), {@code SET_PASSENGER_SEAT_VENTILATING_STATE} (0x4fa00010), {@code SET_REAR_LEFT_SEAT_VENTILATING_STATE} (0x48600008), {@code SET_REAR_RIGHT_SEAT_VENTILATING_STATE} (0x48600010). */
    public int getSeatVentilatingState(int seatID) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_SMART_WELCOME_LIGHT_STATE} (0x3c500008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSmartWelcomeLightState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_SPEED_REMINDER} (0x25d00030).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSpeedReminderValue() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_START_KEY_STATE} (0x4340000a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getStartKeyState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_MMS_START_F} (0x00020328).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getStartOrPowerInd() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DR_ST_ASSIS} (0x24c00010). */
    public int getSteerAssis() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_EPS_PERMISSION} (0x24c00013).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSteerAssistPermission() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_STEER_BACK_DET} (0xc9400022). */
    public int getSteerBack() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_ST_AUTO_RETURN} (0x49400022). */
    public int getSteerPositionAutoReturn() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CMD_WHEEL_DOOR_KEY} (0x42900010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSteerType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_STEERING_WHEEL_HEAT_STATE} (0x4290000e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSteeringWheelHeatingState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_MMS_STOP_REMOTECTRL_DRIVE} (0x000219c5).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getStopRemoteCtrlDriveInd() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_UNLOCK_AUTO_WINDOW_DET} (0x000579ff).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getUnlockDownwindow() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_UNLOCK_SETTING_DET} (0xc0700016).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getUnlockSettingOnlineState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_VEHICLE_STATE} (0x12d00020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getVehicleState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_CAR_SPEECH_VOL} (0x0003f327).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getVoiceINDLevel() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code SET_FRONT_WINDSCREEN_WIPER_OVERHAUL_STATE} (0x4750001c), {@code SET_REAR_WINDSCREEN_WIPER_OVERHAUL_STATE} (0x4750001e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getWindscreenWiperOverhaulState(int area) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_HAS_INTERIOR_ATMOSPHERE_LAMP} (0x3ff00000), {@code SET_HAS_SEAT_HEATING_AND_VENTILATING} (0xcfa00008), {@code SET_HAS_OVERSPEED_LOCKING} (0xc0700014), {@code SET_CAR_BACK_DOOR_ELECTRIC_MODE_DET} (0x4010001b), {@code SET_HAS_BT_CALL_REDUCTION_WIND} (0x4d902000), {@code SET_HAS_FRONT_WINDSCREEN_WIPER_OVERHAUL} (0xc750001c), {@code SET_REAR_WINDSCREEN_WIPER_OVERHAUL_STATE} (0x4750001e), {@code SET_HAS_PARKING_AUTO_INNER_LOOP} (0x4d902000), {@code SET_HAS_TUNNEL_AUTO_INNER_LOOP} (0x4d902010), {@code SET_CAR_EXT_REARVIEW_MIRROR_AUTO_FOLD_DET} (0x4070001a), {@code SET_ENGINE_OIL_ONLINE} (0x30d00038), {@code SET_INSIDE_LIGHT_ONLINE} (0x3ff00009), {@code SET_HAS_DRIVER_SEAT_HEATING} (0xcfa0000b), {@code SET_HAS_DRIVER_SEAT_VENTILATING} (0xcfa00008), {@code SET_HAS_PASSENGER_SEAT_HEATING} (0xcfa00013), {@code SET_HAS_PASSENGER_SEAT_VENTILATING} (0xcfa00010), {@code SET_HAS_REAR_LEFT_SEAT_HEATING} (0xc860000b), {@code SET_HAS_REAR_LEFT_SEAT_VENTILATING} (0xc8600008), {@code SET_HAS_REAR_RIGHT_SEAT_HEATING} (0xc8600013), {@code SET_HAS_REAR_RIGHT_SEAT_VENTILATING} (0xc8600010), {@code SET_AUTO_RAIN_WIPER_ONLINE} (0x47500020), {@code SET_REAR_LEFT_SEAT_MASSAGE_CONFIG} (0x4fa00027), {@code SET_REAR_RIGHT_SEAT_MASSAGE_CONFIG} (0x4fa0002f), {@code SET_SMART_WELCOME_LIGHT_ONLINE} (0x40700036), {@code SET_IAL_COLOR_CONFIG} (0x3ff0000a), {@code SET_CMD_HEADLAMP_HEIGHT_CONFIG} (0x3ff0000e), {@code SET_IAL_BRIGHTNESS_CONFIG} (0x3ff00040), {@code SET_DIMMING_CONTROLLER_CONFIG} (0x3ff00046), {@code SET_IAL_AREA_CONFIG} (0x3ff00043), {@code SET_INSIDE_LIGHT_DOOR_ONLINE} (0x3ff00008), {@code SET_CAR_REAR_MIRROR_FLIP_ANGEL_DET} (0xc940003e), {@code SET_DRIVER_SEAT_LEGREST_CONFIG} (0x0001a908), {@code SET_HAS_LANTERN_LANGUAGE_MODE} (0xb1e0000c), {@code SET_HAS_POWER_STEERING} (0x24c00018), {@code SET_HAS_DRIVER_SEAT_HEATING1} (0xbb400042), {@code SET_HAS_PASSENGER_SEAT_HEATING1} (0xbb400044), {@code SET_CMD_WHEEL_DOOR_KEY} (0x42900010), {@code SET_LEARNER_DRIVER_MODE_CONIG} (0x34f0002c), {@code SET_REAR_AC_PANEL_LOCK_TIME_CONFIG} (0xbf10000d), {@code SET_SPEED_REMINDER_ONLINE} (0xa5d00030), {@code SET_E_PEDAL_MODE_CONFIG} (0x34f00038), {@code SET_CMD_BT_KEY_MAC} (0x48004010), {@code SET_STEERING_WHEEL_HEAT_STATE} (0x4290000e) [direct + via getBTMacAddr(), getSteeringWheelHeatingState()]. */
    public int hasFeature(String feature) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public int queryAllStatus() { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.setting.AbsBYDAutoSettingListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.setting.AbsBYDAutoSettingListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int reset(int item, int value) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int resetSetting(int[] featureIds, int[] values) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int restoreCarDefaultValue() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int restoreDrDefaultValue() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendBTMacToIKEY(byte[] addr) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int sendOffReminder(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_AC_AUTO_AIR_SET} (0x4e30000c). */
    public int setACAutoAir(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_AC_AUTO_WIND_LV_SET} (0x4e300010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setACAutoWindLevel(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_AC_BT_SET} (0x4e300020). */
    public int setACBTWind(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_AC_PAUSE_CYCLE_SET} (0x4e300012). */
    public int setACPauseCycle(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_AC_TUNNEL_CYCLE_SET} (0x4e30000a). */
    public int setACTunnelCycle(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_ATMOSPHERE_LAMP_PANEL_STATE_SET} (0x4c109010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAirLightPanelState(int state) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_EXTREARMIR_FOLLOWUP_SWITCH_SET} (0x4e40001a). */
    public int setAutoExternalRearMirrorFollowUpSwitch(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_AUTO_LOCK_SET} (0x4e400008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAutoLockSwitch(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_AUTO_LOCK_TIME_SET} (0x000d6643).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAutoLockTime(int time) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_AUTO_RAIN_WIPER_SWITCH_SET} (0x1e00003c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAutoRainWiperState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CMD_BTCALL_STATE_SET} (0x43e00035).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setBTCallState(int state) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_BACK_DOOR_ELECTRIC_MODE_SET} (0x3fc0001a). */
    public int setBackDoorElectricMode(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_BACK_DOOR_OPEN_HEIGHT_SET} (0x3fc00040). */
    public int setBackDoorOpenedHeight(int height) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_BACK_HOME_LIGHT_DELAY_SET} (0x000a2ed8).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setBackHomeLightDelay(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_BACK_HOME_LIGHT_DELAY_VALUE_SET} (0x4e400012). */
    public int setBackHomeLightDelayValue(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_BACK_ROW_SET} (0x1e000010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setBackRowControl(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_BASE_PAD_AUTO_RISE_SET} (0x00029736).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setBasePadAutoRiseState(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CALL_STATE_SET} (0x1de00020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setCallState(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_DVR_RECORD_SET} (0x3fc0002e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setCarRecorderRecording(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_DOOR_WINDOW_RESET_SET} (0x3e300032), {@code SET_LOCK_RESET_SET} (0x3e300033), {@code SET_SEAT_SELF_RETURN_RESET_SET} (0x3e300035), {@code SET_REAR_MIRROR_RESET_SET} (0x3e300034), {@code SET_ATMP_RESET_SET} (0x3e30003c), {@code SET_READING_LIGHT_RESET_SET} (0x3e30003d), {@code SET_BACK_LIGHT_RESET_SET} (0x3e30003e), {@code AC_RESET_SET} (0x3e300030), {@code AUDIO_EQ_RESET_SET} (0x3e300042), {@code AUDIO_BALANCE_RESET_SET} (0x3e300043).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setCarSetReset(int doorWindowResetState, int lockResetState, int seatSelfReturnResetState, int rearMirrorResetState, int atmpResetState, int readingLightResetState, int backLightResetState, int acResetState, int equalizerState, int soundfieldState) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_DR_CHARGER_PORT_SET} (0x4e300036). */
    public int setChargingPort(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_COURTESY_LAMP_TIME_SET} (0x3e300025).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setCourtesyLampTime(int time) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_DIGITAL_PANEL_TEST_MODE_SET} (0x000e4372).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setDigitalPanelTestMode(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_DOOR_LOCK_SET} (0x0007de3f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setDoorLock(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_MMS_DOOR_CLOSE_SET} (0x0000e865).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setDriveDoorCloseInd(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_DV_AUTO_RETURN_SET} (0x4e400039). */
    public int setDriverSeatAutoReturn(int value) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int setDrivingRecorderSwitchState(int value) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int setDrivingRecorderUIStatus(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_E_PEDAL_MODE_STATE_SET} (0x2bc00028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setEPedalMode(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_DR_ENERGY_FB_SET} (0x4e300025). */
    public int setEnergyFeedback(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_ENGINEOIL_EXIT_UPDATE_SET} (0x4e40003f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setEngineOilExitUpdateState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_EXHIBITION_START_ENGINE_PERMIT_SET} (0x2ea00010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setExhibitionStartEnginePermit(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_FESTIVAL_INFORMATION_SET} (0x40901028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setFestivalInfo(int info) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_FORMAT_MEMORY_CARD_SET} (0x4de01021).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setFormatMemoryCard(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_HANDLE_AUTO_RESET_SET} (0x4ef32018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setHandleAutoResetTime(int time) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CMD_HEADLAMP_HEIGHT_LEVEL_SET} (0x43100024).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setHeadlampLevel(int level) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET} (0x3fc00014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setIALArea(int area) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET} (0x3fc00008), {@code SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET} (0x3fc00010), {@code SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET} (0x3fc00014), {@code SET_INTERIOR_ATMOSPHERE_LAMP_SOURCE_SET} (0x3fc00037). */
    public int setIALArea(int area, int source) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET} (0x3fc00010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setIALBrightness(int brightness) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET} (0x3fc00008), {@code SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET} (0x3fc00010), {@code SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET} (0x3fc00014), {@code SET_INTERIOR_ATMOSPHERE_LAMP_SOURCE_SET} (0x3fc00037). */
    public int setIALBrightness(int area, int brightness, int source) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET} (0x3fc00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setIALColor(int color) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET} (0x3fc00008), {@code SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET} (0x3fc00010), {@code SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET} (0x3fc00014), {@code SET_INTERIOR_ATMOSPHERE_LAMP_SOURCE_SET} (0x3fc00037). */
    public int setIALColor(int area, int color, int source) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET} (0x3fc00008), {@code SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET} (0x3fc00010), {@code SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET} (0x3fc00014), {@code SET_INTERIOR_ATMOSPHERE_LAMP_SOURCE_SET} (0x3fc00037).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setIALInfo(int area, int color, int brightness, int source) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_INTERIOR_LAMP_DURATION_SET} (0x3e300022). */
    public int setILDuration(int duration) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_INS_THEME_VALUE_SET} (0x4e400028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setINSTheme(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_INSIDE_LIGHT_DOOR_STATE_SET} (0x4f500038).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setInsideLightDoorState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_INSIDE_REAR_MIRROR_SCREEN_SET} (0x4de0101e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setInsideRearMirrorScreenState(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_INSIDE_REAR_MIRROR_SCREEN_SWITCH_SET} (0x4de0101c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setInsideRearMirrorScreenSwitchState(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_SPEECH_HINT_SET} (0x00094527).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setIntelligentVoiceIND(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_MMS_KEY_LOW_SET} (0x00013ece).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setKeyPowerLowInd(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_LANGUAGE_TYPE_SET} (0x4c108028). */
    public int setLanguage(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_LANTERN_LANGUAGE_MODE_SET} (0x4c10a02a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setLanternLanguageMode(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_LEARNER_DRIVER_MODE_STATE_SET} (0x2bc00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setLearnerDriverModeSwitchState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_MMS_LEAVE_P_SET} (0x000ee279).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setLeaveCarPInd(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_LEFT_HOME_LIGHT_DELAY_SET} (0x000821ef).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setLeftHomeLightDelay(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_LEFT_HOME_LIGHT_DELAY_VALUE_SET} (0x4e400015). */
    public int setLeftHomeLightDelayValue(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_L_VIEW_SET} (0x0005cfe5).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setLeftViewMirrorFlipAngle(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_LOCK_CLOSEWINDOW_SET} (0x4e300046). */
    public int setLockCarRiseWindow(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_LOCK_OFF_SET} (0x4e400018). */
    public int setLockOff(int value) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int setLockReplayVideo(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_LPUNLOCKWINDOW_SET} (0x4e300042).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setLongPressUnlockWindow(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_MMS_LOW_BAT_SET} (0x000bf405).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setLowBatteryInd(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_MMS_LOW_OIL_SET} (0x000c0f87).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setLowOilInd(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_REAR_LEFT_SEAT_MASSAGE_LEVEL_SET} (0x2cc00024), {@code SET_REAR_RIGHT_SEAT_MASSAGE_LEVEL_SET} (0x2cc0002c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setMassageLevel(int type, int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_REAR_LEFT_SEAT_MASSAGE_MODE_SET} (0x2cc00020), {@code SET_REAR_RIGHT_SEAT_MASSAGE_MODE_SET} (0x2cc00028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setMassageMode(int type, int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_BACKLIGHT_NIGHTMODE_SET} (0x000176aa).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setMcuPH2State(int state) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_MICRO_SWITCH_LOCK_WINDOW_SET} (0x4e300040). */
    public int setMicroSwitchLockWindowState(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_LPUNLOCKWINDOW_SET} (0x4e300042) [via setLongPressUnlockWindow()]. */
    public int setMicroSwitchUnlockWindowState(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_MMS_MIS_KEY_SET} (0x0004fefa).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setMissKeyInd(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_MMS_NIGHT_DR_SET} (0x000ab24b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setNightDRLightOnInd(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_OVERSPEED_LOCKING_STATE_SET} (0x4e400008). */
    public int setOverspeedLock(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_OVERSPEED_LOCKING_STATE_SET} (0x4e400008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setOverspeedLockingState(int state) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_PM25_POWER_SET} (0x4f500014). */
    public int setPM25Power(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_PM25_CTRL_SET} (0x4f500012).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setPM25Switch(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_PM25_SW_CHECK_SET} (0x4f500016). */
    public int setPM25SwitchCheck(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_PM25_TIME_SET} (0x4f500018). */
    public int setPM25TimeCheck(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_PAD_ROTATION_SET} (0x4f50003d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setPadRotation(int rotation) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_MMS_FREE_P_SET} (0x000950f2).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setParkBrakeInd(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_REAR_AC_PANEL_LOCK_TIME_SET} (0x4f500030).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setRearAcPanelAutoLockTime(int time) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_EXT_REARVIEW_MIRROR_AUTO_FOLD_SET} (0x0004e7bb).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setRearViewMirrorAutoFoldMode(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_REAR_VIEW_SET} (0x4e40001c). */
    public int setRearViewMirrorFlip(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_CTRL_WINDOW_SET} (0x4e30001c). */
    public int setRemoteControlDownwindowState(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_REMOTE_CTRL_UPWINDOW_SET} (0x4e30001a). */
    public int setRemoteControlUpwindowState(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_REMOTE_CONTROL_UNLOCKING_SET} (0x4e400018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setRemoteCtlUnlockingState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_R_VIEW_SET} (0x000a451d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setRightViewMirrorFlipAngle(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_DR_SOC_TARGET_SET} (0x4e300038). */
    public int setSOCTarget(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_MMS_BELT_SET} (0x000029e3).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setSafeBeltInd(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_DRIVER_SEAT_HEATING_STATE_SET} (0x43100014), {@code SET_PASSENGER_SEAT_HEATING_STATE_SET} (0x4310001c), {@code SET_REAR_LEFT_SEAT_HEATING_STATE_SET} (0x4310002b), {@code SET_REAR_RIGHT_SEAT_HEATING_STATE_SET} (0x43100033). */
    public int setSeatHeatingState(int seatID, int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_DRIVER_SEAT_HEATING_STATE_SET} (0x43100014), {@code SET_PASSENGER_SEAT_HEATING_STATE_SET} (0x4310001c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setSeatHeatingState1(int seatID, int state) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_DRIVER_SEAT_VENTILATING_STATE_SET} (0x43100010), {@code SET_PASSENGER_SEAT_VENTILATING_STATE_SET} (0x43100018), {@code SET_REAR_LEFT_SEAT_VENTILATING_STATE_SET} (0x43100028), {@code SET_REAR_RIGHT_SEAT_VENTILATING_STATE_SET} (0x43100030). */
    public int setSeatVentilatingState(int seatID, int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_SMART_WELCOME_LIGHT_STATE_SET} (0x4f500045).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setSmartWelcomeLightState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_SPEED_REMINDER_SET} (0x3e300028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setSpeedReminderValue(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_MMS_START_F_SET} (0x00057c3e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setStartOrPowerInd(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_DR_ST_ASSIS_SET} (0x4e300022). */
    public int setSteerAssis(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_ST_AUTO_RETURN_SET} (0x4e40003b). */
    public int setSteerPositionAutoReturn(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_STEERING_WHEEL_HEAT_STATE_SET} (0x38500035).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setSteeringWheelHeatingState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_MMS_STOP_REMOTECTRL_DRIVE_SET} (0x00070ba7).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setStopRemoteCtrlDriveInd(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_ATMOSPHERE_LAMP_TEXT_SET} (0x1caa1008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setTextContent(byte[] text) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_ATMOSPHERE_LAMP_TEXT_STATE_SET} (0x1ca01010), {@code SET_ATMOSPHERE_LAMP_TEXT_TRIGGER_NUMBER_SET} (0x1ca01012), {@code SET_ATMOSPHERE_LAMP_TEXT_LENGTH_SET} (0x1ca01018), {@code SET_ATMOSPHERE_LAMP_TEXT_COLOR_RED_SET} (0x1ca01020), {@code SET_ATMOSPHERE_LAMP_TEXT_COLOR_GREEN_SET} (0x1ca01028), {@code SET_ATMOSPHERE_LAMP_TEXT_COLOR_BLUE_SET} (0x1ca01030), {@code SET_ATMOSPHERE_LAMP_TEXT_ANIMATION_TYPE_SET} (0x1ca01038), {@code SET_ATMOSPHERE_LAMP_TEXT_PLAY_SPEED_SET} (0x1ca0103c), {@code SET_ATMOSPHERE_LAMP_TEXT_BACKGROND_SET} (0x1ca01040).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setTextInfo(int textState, int textNum, int textSize, int textRedColor, int textGreenColor, int textBlueColor, int animationType, int playSpeed, int textBackground) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SETTING_UI_PLATFORM_SET} (0x1e000008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setUIPlatformState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_USERDEFINE_BODY_COLOR_SET} (0x3fc00020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setUserdefinedBodyColor(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_CAR_SPEECH_VOL_SET} (0x1e000022).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setVoiceINDLevel(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_ATMOSPHERE_LAMP_WEATHER_SET} (0x33f00010), {@code SET_ATMOSPHERE_LAMP_TEMPRATURE_SET} (0x33f00018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setWeatherAndTempState(int weatherState, int tempValue) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_WEATHER_FORCAST_SET} (0x2cf01008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setWeatherForcast(byte[] value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code SET_FRONT_WINDSCREEN_WIPER_OVERHAUL_STATE_SET} (0x4f50001c), {@code SET_REAR_WINDSCREEN_WIPER_OVERHAUL_STATE_SET} (0x4f50001e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setWindscreenWiperOverhaulState(int area, int state) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int takeDrivingRecorderPicture() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int turnOffInsideLight() { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int turnOffInsideLight(int state) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.setting.AbsBYDAutoSettingListener l) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int voiceCtlBackDoor(int cmd) { throw new RuntimeException("Stub!"); }
}
