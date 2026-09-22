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

    /** Reads feature ID {@code SET_AC_AUTO_AIR} (0x4d902018). */
    public int getACAutoAir() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_AC_BT} (0x4d902016). */
    public int getACBTWind() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_AC_PAUSE_CYCLE} (0x4d902014). */
    public int getACPauseCycle() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_AC_TUNNEL_CYCLE} (0x4d902010). */
    public int getACTunnelCycle() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_EXTREARMIR_FOLLOWUP_SWITCH} (0x4070001c). */
    public int getAutoExternalRearMirrorFollowUpSwitch() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_BACK_DOOR_ELECTRIC_MODE} (0x4b60000b). */
    public int getBackDoorElectricMode() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_BACK_DOOR_OPEN_HEIGHT} (0x40100008). */
    public int getBackDoorOpenedHeight() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_BACK_HOME_LIGHT_DELAY_VALUE} (0x3ff0002d). */
    public int getBackHomeLightDelayValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DR_CHARGER_PORT} (0x4750000c). */
    public int getChargingPort() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DRIVE_CONFIG_TYPE} (0x34100038). */
    public int getDriveConfig() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_DV_AUTO_RETURN} (0x49400010). */
    public int getDriverSeatAutoReturn() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_DRIVER_SEATBK_DET} (0xc9400010). */
    public int getDriverSeatBack() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DR_ENERGY_FB} (0x34100022). */
    public int getEnergyFeedback() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_ENGINE_OIL_LEVEL} (0x30d00038). */
    public int getEngineOilLevel() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_AREA} (0x42e00020). */
    public int getIALArea() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_IAL_FRONT_BRIGHTNESS} (0x42e00008), {@code SET_IAL_BACK_BRIGHTNESS} (0x42e0000c), {@code SET_IAL_ALL_BRIGHTNESS} (0x00043611). */
    public int getIALBrightness(int area) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_IAL_FRONT_COLOR} (0x42e00010), {@code SET_IAL_BACK_COLOR} (0x42e00017), {@code SET_IAL_ALL_COLOR} (0x0002ae1a). */
    public int getIALColor(int area) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_INTERIOR_LAMP_DURATION} (0x39400015). */
    public int getILDuration() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.setting.BYDAutoSettingDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_LANGUAGE_TYPE} (0x49c0000a). */
    public int getLanguage() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_LEFT_HOME_LIGHT_DELAY_VALUE} (0x3ff00030). */
    public int getLeftHomeLightDelayValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_L_VIEW} (0x4b800024). */
    public int getLeftViewMirrorFlipAngle() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_LOCK_CLOSEWINDOW} (0x48e00020). */
    public int getLockCarRiseWindow() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_LOCK_OFF} (0x40700016). */
    public int getLockOff() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_MAINTAIN_REMIND_STATE} (0x0550001a). */
    public int getMaintainRemindState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_MICRO_SWITCH_LOCK_WINDOW} (0x48e0000c). */
    public int getMicroSwitchLockWindowState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_LPUNLOCKWINDOW} (0x48e0000e) [via getLongPressUnlockWindow()]. */
    public int getMicroSwitchUnlockWindowState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_OVERSPEED_LOCKING_STATE} (0x40700014). */
    public int getOverspeedLock() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_PM25_POWER} (0x4f600008). */
    public int getPM25Power() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_PM25_SW_CHECK} (0x4f60000c). */
    public int getPM25SwitchCheck() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_PM25_TIME} (0x4f60000e). */
    public int getPM25TimeCheck() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_REAR_AC_DET} (0x4330001a). */
    public int getRearAcOnlineState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_REAR_VIEW_ANGLE} (0x4940003e). */
    public int getRearViewMirrorAngle() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_REAR_VIEW} (0x49400018). */
    public int getRearViewMirrorFlip() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_CTRL_WINDOW} (0x48e0000a). */
    public int getRemoteControlDownwindowState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_REMOTE_CTRL_UPWINDOW} (0x48e00008). */
    public int getRemoteControlUpwindowState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_R_VIEW} (0x4b900010). */
    public int getRightViewMirrorFlipAngle() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DR_SOC_TARGET} (0x34100028). */
    public int getSOCTarget() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_SAFE_WARN_STATE} (0x0550001b). */
    public int getSafeWarnState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DRIVER_SEAT_HEATING_STATE} (0x4fa0000b), {@code SET_PASSENGER_SEAT_HEATING_STATE} (0x4fa00013), {@code SET_REAR_LEFT_SEAT_HEATING_STATE} (0x4860000b), {@code SET_REAR_RIGHT_SEAT_HEATING_STATE} (0x48600013). */
    public int getSeatHeatingState(int seatID) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DRIVER_SEAT_VENTILATING_STATE} (0x4fa00008), {@code SET_PASSENGER_SEAT_VENTILATING_STATE} (0x4fa00010), {@code SET_REAR_LEFT_SEAT_VENTILATING_STATE} (0x48600008), {@code SET_REAR_RIGHT_SEAT_VENTILATING_STATE} (0x48600010). */
    public int getSeatVentilatingState(int seatID) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_DR_ST_ASSIS} (0x24c00010). */
    public int getSteerAssis() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_STEER_BACK_DET} (0xc9400022). */
    public int getSteerBack() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_CAR_ST_AUTO_RETURN} (0x49400022). */
    public int getSteerPositionAutoReturn() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code SET_HAS_INTERIOR_ATMOSPHERE_LAMP} (0x3ff00000), {@code SET_HAS_SEAT_HEATING_AND_VENTILATING} (0xcfa00008), {@code SET_HAS_OVERSPEED_LOCKING} (0xc0700014), {@code SET_CAR_BACK_DOOR_ELECTRIC_MODE_DET} (0x4010001b), {@code SET_HAS_BT_CALL_REDUCTION_WIND} (0x4d902000), {@code SET_HAS_FRONT_WINDSCREEN_WIPER_OVERHAUL} (0xc750001c), {@code SET_REAR_WINDSCREEN_WIPER_OVERHAUL_STATE} (0x4750001e), {@code SET_HAS_PARKING_AUTO_INNER_LOOP} (0x4d902000), {@code SET_HAS_TUNNEL_AUTO_INNER_LOOP} (0x4d902010), {@code SET_CAR_EXT_REARVIEW_MIRROR_AUTO_FOLD_DET} (0x4070001a), {@code SET_ENGINE_OIL_ONLINE} (0x30d00038), {@code SET_INSIDE_LIGHT_ONLINE} (0x3ff00009), {@code SET_HAS_DRIVER_SEAT_HEATING} (0xcfa0000b), {@code SET_HAS_DRIVER_SEAT_VENTILATING} (0xcfa00008), {@code SET_HAS_PASSENGER_SEAT_HEATING} (0xcfa00013), {@code SET_HAS_PASSENGER_SEAT_VENTILATING} (0xcfa00010), {@code SET_HAS_REAR_LEFT_SEAT_HEATING} (0xc860000b), {@code SET_HAS_REAR_LEFT_SEAT_VENTILATING} (0xc8600008), {@code SET_HAS_REAR_RIGHT_SEAT_HEATING} (0xc8600013), {@code SET_HAS_REAR_RIGHT_SEAT_VENTILATING} (0xc8600010), {@code SET_AUTO_RAIN_WIPER_ONLINE} (0x47500020), {@code SET_REAR_LEFT_SEAT_MASSAGE_CONFIG} (0x4fa00027), {@code SET_REAR_RIGHT_SEAT_MASSAGE_CONFIG} (0x4fa0002f), {@code SET_SMART_WELCOME_LIGHT_ONLINE} (0x40700036), {@code SET_IAL_COLOR_CONFIG} (0x3ff0000a), {@code SET_CMD_HEADLAMP_HEIGHT_CONFIG} (0x3ff0000e), {@code SET_IAL_BRIGHTNESS_CONFIG} (0x3ff00040), {@code SET_DIMMING_CONTROLLER_CONFIG} (0x3ff00046), {@code SET_IAL_AREA_CONFIG} (0x3ff00043), {@code SET_INSIDE_LIGHT_DOOR_ONLINE} (0x3ff00008), {@code SET_CAR_REAR_MIRROR_FLIP_ANGEL_DET} (0xc940003e), {@code SET_DRIVER_SEAT_LEGREST_CONFIG} (0x0001a908), {@code SET_HAS_LANTERN_LANGUAGE_MODE} (0xb1e0000c), {@code SET_HAS_POWER_STEERING} (0x24c00018), {@code SET_HAS_DRIVER_SEAT_HEATING1} (0xbb400042), {@code SET_HAS_PASSENGER_SEAT_HEATING1} (0xbb400044), {@code SET_CMD_WHEEL_DOOR_KEY} (0x42900010), {@code SET_LEARNER_DRIVER_MODE_CONIG} (0x34f0002c), {@code SET_REAR_AC_PANEL_LOCK_TIME_CONFIG} (0xbf10000d), {@code SET_SPEED_REMINDER_ONLINE} (0xa5d00030), {@code SET_E_PEDAL_MODE_CONFIG} (0x34f00038), {@code SET_CMD_BT_KEY_MAC} (0x48004010), {@code SET_STEERING_WHEEL_HEAT_STATE} (0x4290000e) [direct + via getBTMacAddr(), getSteeringWheelHeatingState()]. */
    public int hasFeature(String feature) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public int queryAllStatus() { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.setting.AbsBYDAutoSettingListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.setting.AbsBYDAutoSettingListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_AC_AUTO_AIR_SET} (0x4e30000c). */
    public int setACAutoAir(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_AC_BT_SET} (0x4e300020). */
    public int setACBTWind(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_AC_PAUSE_CYCLE_SET} (0x4e300012). */
    public int setACPauseCycle(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_AC_TUNNEL_CYCLE_SET} (0x4e30000a). */
    public int setACTunnelCycle(int value) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_EXTREARMIR_FOLLOWUP_SWITCH_SET} (0x4e40001a). */
    public int setAutoExternalRearMirrorFollowUpSwitch(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_BACK_DOOR_ELECTRIC_MODE_SET} (0x3fc0001a). */
    public int setBackDoorElectricMode(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_BACK_DOOR_OPEN_HEIGHT_SET} (0x3fc00040). */
    public int setBackDoorOpenedHeight(int height) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_BACK_HOME_LIGHT_DELAY_VALUE_SET} (0x4e400012). */
    public int setBackHomeLightDelayValue(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_DR_CHARGER_PORT_SET} (0x4e300036). */
    public int setChargingPort(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_DV_AUTO_RETURN_SET} (0x4e400039). */
    public int setDriverSeatAutoReturn(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_DR_ENERGY_FB_SET} (0x4e300025). */
    public int setEnergyFeedback(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET} (0x3fc00008), {@code SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET} (0x3fc00010), {@code SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET} (0x3fc00014), {@code SET_INTERIOR_ATMOSPHERE_LAMP_SOURCE_SET} (0x3fc00037). */
    public int setIALArea(int area, int source) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET} (0x3fc00008), {@code SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET} (0x3fc00010), {@code SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET} (0x3fc00014), {@code SET_INTERIOR_ATMOSPHERE_LAMP_SOURCE_SET} (0x3fc00037). */
    public int setIALBrightness(int area, int brightness, int source) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_INTERIOR_ATMOSPHERE_LAMP_COLOR_SET} (0x3fc00008), {@code SET_INTERIOR_ATMOSPHERE_LAMP_BRIGHTNESS_SET} (0x3fc00010), {@code SET_INTERIOR_ATMOSPHERE_LAMP_AREA_SET} (0x3fc00014), {@code SET_INTERIOR_ATMOSPHERE_LAMP_SOURCE_SET} (0x3fc00037). */
    public int setIALColor(int area, int color, int source) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_INTERIOR_LAMP_DURATION_SET} (0x3e300022). */
    public int setILDuration(int duration) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_LANGUAGE_TYPE_SET} (0x4c108028). */
    public int setLanguage(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_LEFT_HOME_LIGHT_DELAY_VALUE_SET} (0x4e400015). */
    public int setLeftHomeLightDelayValue(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_LOCK_CLOSEWINDOW_SET} (0x4e300046). */
    public int setLockCarRiseWindow(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_LOCK_OFF_SET} (0x4e400018). */
    public int setLockOff(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_MICRO_SWITCH_LOCK_WINDOW_SET} (0x4e300040). */
    public int setMicroSwitchLockWindowState(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_LPUNLOCKWINDOW_SET} (0x4e300042) [via setLongPressUnlockWindow()]. */
    public int setMicroSwitchUnlockWindowState(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_OVERSPEED_LOCKING_STATE_SET} (0x4e400008). */
    public int setOverspeedLock(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_PM25_POWER_SET} (0x4f500014). */
    public int setPM25Power(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_PM25_SW_CHECK_SET} (0x4f500016). */
    public int setPM25SwitchCheck(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_PM25_TIME_SET} (0x4f500018). */
    public int setPM25TimeCheck(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_REAR_VIEW_SET} (0x4e40001c). */
    public int setRearViewMirrorFlip(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_CTRL_WINDOW_SET} (0x4e30001c). */
    public int setRemoteControlDownwindowState(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_REMOTE_CTRL_UPWINDOW_SET} (0x4e30001a). */
    public int setRemoteControlUpwindowState(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_DR_SOC_TARGET_SET} (0x4e300038). */
    public int setSOCTarget(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_DRIVER_SEAT_HEATING_STATE_SET} (0x43100014), {@code SET_PASSENGER_SEAT_HEATING_STATE_SET} (0x4310001c), {@code SET_REAR_LEFT_SEAT_HEATING_STATE_SET} (0x4310002b), {@code SET_REAR_RIGHT_SEAT_HEATING_STATE_SET} (0x43100033). */
    public int setSeatHeatingState(int seatID, int state) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_DRIVER_SEAT_VENTILATING_STATE_SET} (0x43100010), {@code SET_PASSENGER_SEAT_VENTILATING_STATE_SET} (0x43100018), {@code SET_REAR_LEFT_SEAT_VENTILATING_STATE_SET} (0x43100028), {@code SET_REAR_RIGHT_SEAT_VENTILATING_STATE_SET} (0x43100030). */
    public int setSeatVentilatingState(int seatID, int state) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_DR_ST_ASSIS_SET} (0x4e300022). */
    public int setSteerAssis(int value) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code SET_CAR_ST_AUTO_RETURN_SET} (0x4e40003b). */
    public int setSteerPositionAutoReturn(int value) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.setting.AbsBYDAutoSettingListener l) { throw new RuntimeException("Stub!"); }
}
