package android.hardware.bydauto.bodywork;

/** Permissions: {@code android.permission.BYDAUTO_BODYWORK_COMMON}, {@code android.permission.BYDAUTO_BODYWORK_GET}, {@code android.permission.BYDAUTO_BODYWORK_SET} */
public final class BYDAutoBodyworkDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int AUTO_MODEL_NEW_QIN_EV = 2;
    public static final int AUTO_MODEL_NEW_QIN_FUEL = 3;
    public static final int AUTO_MODEL_NEW_QIN_HEV = 1;
    public static final int AUTO_MODEL_NEW_TANG_EV = 6;
    public static final int AUTO_MODEL_NEW_TANG_FUEL = 5;
    public static final int AUTO_MODEL_NEW_TANG_HEV = 4;
    public static final int AUTO_MODEL_NULL = 11;
    public static final int AUTO_MODEL_SONG_18_EV = 9;
    public static final int AUTO_MODEL_SONG_18_FUEL = 7;
    public static final int AUTO_MODEL_SONG_18_HEV = 8;
    public static final int AUTO_MODEL_SONG_MAX_HEV = 10;
    public static final int AUTO_TYPE_3A = 20;
    public static final int AUTO_TYPE_3B = 36;
    public static final int AUTO_TYPE_5A = 5;
    public static final int AUTO_TYPE_5AEV = 29;
    public static final int AUTO_TYPE_5B = 22;
    public static final int AUTO_TYPE_5BH = 27;
    public static final int AUTO_TYPE_5BHE = 53;
    public static final int AUTO_TYPE_5BHI = 64;
    public static final int AUTO_TYPE_6A = 7;
    public static final int AUTO_TYPE_6B = 8;
    public static final int AUTO_TYPE_CV_SEDAN_HK = 188;
    public static final int AUTO_TYPE_CV_T35A02 = 40;
    public static final int AUTO_TYPE_CV_TE_HK = 280;
    public static final int AUTO_TYPE_EK = 138;
    public static final int AUTO_TYPE_EL = 96;
    public static final int AUTO_TYPE_EL20 = 117;
    public static final int AUTO_TYPE_ELEBD = 149;
    public static final int AUTO_TYPE_ELEBU = 108;
    public static final int AUTO_TYPE_EM2E = 127;
    public static final int AUTO_TYPE_EM2E_UY = 186;
    public static final int AUTO_TYPE_EMEA = 95;
    public static final int AUTO_TYPE_EQ = 215;
    public static final int AUTO_TYPE_EQE = 251;
    public static final int AUTO_TYPE_EQEK = 230;
    public static final int AUTO_TYPE_ESEA = 146;
    public static final int AUTO_TYPE_EW_UY = 191;
    public static final int AUTO_TYPE_F0 = 0;
    public static final int AUTO_TYPE_F3 = 1;
    public static final int AUTO_TYPE_F3R = 2;
    public static final int AUTO_TYPE_F6 = 6;
    public static final int AUTO_TYPE_G3 = 3;
    public static final int AUTO_TYPE_HA = 13;
    public static final int AUTO_TYPE_HA2EM = 101;
    public static final int AUTO_TYPE_HA2FL = 122;
    public static final int AUTO_TYPE_HA2FM = 122;
    public static final int AUTO_TYPE_HA2H = 141;
    public static final int AUTO_TYPE_HA2HE = 102;
    public static final int AUTO_TYPE_HA6H = 217;
    public static final int AUTO_TYPE_HAC = 46;
    public static final int AUTO_TYPE_HAD = 50;
    public static final int AUTO_TYPE_HADA = 63;
    public static final int AUTO_TYPE_HADE = 51;
    public static final int AUTO_TYPE_HADF = 66;
    public static final int AUTO_TYPE_HADG = 85;
    public static final int AUTO_TYPE_HAEA = 49;
    public static final int AUTO_TYPE_HAEC = 62;
    public static final int AUTO_TYPE_HAEV = 28;
    public static final int AUTO_TYPE_HA_15A = 37;
    public static final int AUTO_TYPE_HB = 14;
    public static final int AUTO_TYPE_HC = 15;
    public static final int AUTO_TYPE_HCE = 92;
    public static final int AUTO_TYPE_HCEF = 135;
    public static final int AUTO_TYPE_HCF = 93;
    public static final int AUTO_TYPE_HCHY = 121;
    public static final int AUTO_TYPE_HD = 31;
    public static final int AUTO_TYPE_HDE = 98;
    public static final int AUTO_TYPE_HDE21 = 124;
    public static final int AUTO_TYPE_HDF = 99;
    public static final int AUTO_TYPE_HXH_ABC_L = 244;
    public static final int AUTO_TYPE_KD = 131;
    public static final int AUTO_TYPE_L3 = 4;
    public static final int AUTO_TYPE_L3G = 33;
    public static final int AUTO_TYPE_M6 = 10;
    public static final int AUTO_TYPE_MEE = 44;
    public static final int AUTO_TYPE_MEEY = 109;
    public static final int AUTO_TYPE_MEEY_KL = 220;
    public static final int AUTO_TYPE_MEF = 42;
    public static final int AUTO_TYPE_MEFD = 81;
    public static final int AUTO_TYPE_MEH = 43;
    public static final int AUTO_TYPE_MEHD = 67;
    public static final int AUTO_TYPE_MEHM = 113;
    public static final int AUTO_TYPE_MRE = 60;
    public static final int AUTO_TYPE_MRH = 57;
    public static final int AUTO_TYPE_PAHAL = 143;
    public static final int AUTO_TYPE_PKEAS_PKEBS = 248;
    public static final int AUTO_TYPE_PKHAS = 249;
    public static final int AUTO_TYPE_RSA = 45;
    public static final int AUTO_TYPE_S6 = 9;
    public static final int AUTO_TYPE_S6DM = 17;
    public static final int AUTO_TYPE_S8 = 16;
    public static final int AUTO_TYPE_SA = 11;
    public static final int AUTO_TYPE_SA2E = 84;
    public static final int AUTO_TYPE_SA2EM = 112;
    public static final int AUTO_TYPE_SA2FC = 82;
    public static final int AUTO_TYPE_SA2FL = 110;
    public static final int AUTO_TYPE_SA2H = 83;
    public static final int AUTO_TYPE_SA2HG = 111;
    public static final int AUTO_TYPE_SA2H_RQ = 90;
    public static final int AUTO_TYPE_SA3 = 162;
    public static final int AUTO_TYPE_SA3E = 72;
    public static final int AUTO_TYPE_SA3EE = 74;
    public static final int AUTO_TYPE_SA3EJ = 147;
    public static final int AUTO_TYPE_SA3E_FG = 173;
    public static final int AUTO_TYPE_SA3F = 68;
    public static final int AUTO_TYPE_SA3FL = 139;
    public static final int AUTO_TYPE_SA3H = 71;
    public static final int AUTO_TYPE_SADM = 12;
    public static final int AUTO_TYPE_SAEA = 40;
    public static final int AUTO_TYPE_SAEC = 70;
    public static final int AUTO_TYPE_SAED = 97;
    public static final int AUTO_TYPE_SAEG = 94;
    public static final int AUTO_TYPE_SAEV = 39;
    public static final int AUTO_TYPE_SAFG = 73;
    public static final int AUTO_TYPE_SAFJ = 73;
    public static final int AUTO_TYPE_SAH = 32;
    public static final int AUTO_TYPE_SAHA = 88;
    public static final int AUTO_TYPE_SAHB = 89;
    public static final int AUTO_TYPE_SAHC = 90;
    public static final int AUTO_TYPE_SAHE = 65;
    public static final int AUTO_TYPE_SAHG = 61;
    public static final int AUTO_TYPE_SAHX = 74;
    public static final int AUTO_TYPE_SC = 30;
    public static final int AUTO_TYPE_SC2E = 128;
    public static final int AUTO_TYPE_SC3E = 160;
    public static final int AUTO_TYPE_SC3EBE = 81;
    public static final int AUTO_TYPE_SC3H = 291;
    public static final int AUTO_TYPE_SCEA = 41;
    public static final int AUTO_TYPE_SCED = 69;
    public static final int AUTO_TYPE_SCH = 35;
    public static final int AUTO_TYPE_SE = 23;
    public static final int AUTO_TYPE_SEF = 24;
    public static final int AUTO_TYPE_SEH = 48;
    public static final int AUTO_TYPE_SF = 153;
    public static final int AUTO_TYPE_SGE = 144;
    public static final int AUTO_TYPE_SGH = 145;
    public static final int AUTO_TYPE_SK2F = 130;
    public static final int AUTO_TYPE_SK2H = 129;
    public static final int AUTO_TYPE_SLHAB = 90;
    public static final int AUTO_TYPE_ST = 47;
    public static final int AUTO_TYPE_STC = 56;
    public static final int AUTO_TYPE_STE = 58;
    public static final int AUTO_TYPE_STEAU = 137;
    public static final int AUTO_TYPE_STEB = 59;
    public static final int AUTO_TYPE_STEL = 114;
    public static final int AUTO_TYPE_STEM = 60;
    public static final int AUTO_TYPE_STF = 54;
    public static final int AUTO_TYPE_STF20 = 53;
    public static final int AUTO_TYPE_STF21 = 116;
    public static final int AUTO_TYPE_STFD = 55;
    public static final int AUTO_TYPE_STH20 = 52;
    public static final int AUTO_TYPE_STH21 = 115;
    public static final int AUTO_TYPE_STHAM = 136;
    public static final int AUTO_TYPE_STHM = 56;
    public static final int AUTO_TYPE_STHNY = 353;
    public static final int AUTO_TYPE_STM = 57;
    public static final int AUTO_TYPE_SUE = 150;
    public static final int AUTO_TYPE_SUH = 151;
    public static final int AUTO_TYPE_UXE = 152;
    public static final int AUTO_TYPE_VA = 18;
    public static final int AUTO_TYPE_VB = 19;
    public static final int AUTO_TYPE_VBEV = 26;
    public static final int AUTO_TYPE_VBH = 25;
    public static final int AUTO_TYPE_VC = 21;
    public static final int AUTO_TYPE_VCE = 174;
    public static final int AUTO_TYPE_VDE_AB = 175;
    public static final int AUTO_TYPE_VDE_AU = 273;
    public static final int AUTO_TYPE_VDE_TUTEFU = 272;
    public static final int AUTO_TYPE_e6B = 38;
    public static final int AUTO_TYPE_e6H = 34;
    public static final int AUTO_TYPE_e6K = 52;
    public static final int BATTERY_POWER_MAX = 255;
    public static final int BATTERY_POWER_MIN = 0;
    public static final int BODYWORK_ALARM_STATE_OFF = 0;
    public static final int BODYWORK_ALARM_STATE_ON = 1;
    public static final int BODYWORK_ALL_WINDOW_ANTI_PINCH = 4;
    public static final int BODYWORK_ANTI_PINCH_INVLAID = 0;
    public static final int BODYWORK_AUTO_SYSTEM_STATE_NORMAL = 0;
    public static final int BODYWORK_AUTO_SYSTEM_STATE_SET_SECURE = 1;
    public static final int BODYWORK_AUTO_SYSTEM_STATE_START_SECURE = 2;
    public static final int BODYWORK_AUTO_SYSTEM_STATE_UNDEFINED = 255;
    public static final int BODYWORK_BATTERY_MODE_DAY = 0;
    public static final int BODYWORK_BATTERY_MODE_INVALID = 255;
    public static final int BODYWORK_BATTERY_MODE_NIGHT = 1;
    public static final int BODYWORK_BATTERY_VOLTAGE_LEVEL_INVALID = 255;
    public static final int BODYWORK_BATTERY_VOLTAGE_LEVEL_LOW = 0;
    public static final int BODYWORK_BATTERY_VOLTAGE_LEVEL_NORMAL = 1;
    public static final int BODYWORK_CMD_DOOR_FUEL_TANK_CAP = 7;
    public static final int BODYWORK_CMD_DOOR_HOOD = 5;
    public static final int BODYWORK_CMD_DOOR_LEFT_FRONT = 1;
    public static final int BODYWORK_CMD_DOOR_LEFT_REAR = 3;
    public static final int BODYWORK_CMD_DOOR_LUGGAGE_DOOR = 6;
    public static final int BODYWORK_CMD_DOOR_RIGHT_FRONT = 2;
    public static final int BODYWORK_CMD_DOOR_RIGHT_REAR = 4;
    public static final int BODYWORK_CMD_MOON_ROOF = 5;
    public static final int BODYWORK_CMD_STEERING_WHEEL_ANGEL = 1;
    public static final int BODYWORK_CMD_STEERING_WHEEL_SPEED = 2;
    public static final int BODYWORK_CMD_SUNSHADE_PANEL = 6;
    public static final int BODYWORK_CMD_WINDOW_LEFT_FRONT = 1;
    public static final int BODYWORK_CMD_WINDOW_LEFT_REAR = 3;
    public static final int BODYWORK_CMD_WINDOW_RIGHT_FRONT = 2;
    public static final int BODYWORK_CMD_WINDOW_RIGHT_REAR = 4;
    public static final int BODYWORK_COMMAND_BUSY = -2147482647;
    public static final int BODYWORK_COMMAND_FAILED = -2147482648;
    public static final int BODYWORK_COMMAND_INVALID_VALUE = -2147482645;
    public static final int BODYWORK_COMMAND_SUCCESS = 0;
    public static final int BODYWORK_COMMAND_TIMEOUT = -2147482646;
    public static final int BODYWORK_FRONT_WINDOW_ANTI_PINCH = 3;
    public static final int BODYWORK_LEFT_WINDOW_ANTI_PINCH_CONFIG = 2;
    public static final int BODYWORK_LOW_POWER_BOTH = 3;
    public static final int BODYWORK_LOW_POWER_ELEC = 2;
    public static final int BODYWORK_LOW_POWER_FUEL = 1;
    public static final int BODYWORK_LOW_POWER_NORMAL = 0;
    public static final int BODYWORK_NO_ANTI_PINCH = 1;
    public static final int BODYWORK_POWER_LEVEL_ACC = 1;
    public static final int BODYWORK_POWER_LEVEL_FAKE_OK = 4;
    public static final int BODYWORK_POWER_LEVEL_INVALID = 255;
    public static final int BODYWORK_POWER_LEVEL_OFF = 0;
    public static final int BODYWORK_POWER_LEVEL_OK = 3;
    public static final int BODYWORK_POWER_LEVEL_ON = 2;
    public static final int BODYWORK_STATE_CLOSED = 0;
    public static final int BODYWORK_STATE_OPEN = 1;
    public static final int BODYWORK_STATE_UNDEFINED = 255;
    public static final double BODYWORK_STEERING_WHEEL_ANGEL_MAX = 780.0d;
    public static final double BODYWORK_STEERING_WHEEL_ANGEL_MIN = -780.0d;
    public static final double BODYWORK_STEERING_WHEEL_SPEED_MAX = 1016.0d;
    public static final double BODYWORK_STEERING_WHEEL_SPEED_MIN = 0.0d;
    public static final int CLOSE_WINDOW_FOR_RAIN_INVALID = 0;
    public static final int CLOSE_WINDOW_FOR_RAIN_OFF = 2;
    public static final int CLOSE_WINDOW_FOR_RAIN_ON = 1;
    public static final int CONFIG_ANTI_PINCH_MOON_ROOF = 3;
    public static final int CONFIG_MOON_ROOF_SUNSHADE_PANEL = 1;
    public static final int CONFIG_NONE = 0;
    public static final int CONFIG_SUNSHADE_PANEL = 2;
    public static final int DATA_FLAG_INVALID = 0;
    public static final int DATA_FLAG_VALID = 1;
    public static final int DATA_STWHEEL_SENSOR_CALIBRATION_STATE = 1;
    public static final int DATA_STWHEEL_SENSOR_STATE = 0;
    public static final int DEVICE_HAS_THE_FEATURE = 1;
    public static final int DEVICE_NOT_HAS_THE_FEATURE = 0;
    public static final int DEVICE_THE_FEATURE_LINK_ERROR = 65535;
    public static final int DEVICE_THE_FEATURE_NEVER_GET = 2;
    public static final int ENERGY_TYPE_EV = 1;
    public static final int ENERGY_TYPE_FUEL = 3;
    public static final int ENERGY_TYPE_HEV = 2;
    public static final String FEATURE_MOON_ROOF = "MoonRoof";
    public static final String FEATURE_RAIN_CLOSE_WINDOW = "RainAutoCloseWindow";
    public static final int HAS_0x005500 = 24;
    public static final int HAS_0x00D500 = 33;
    public static final int HAS_0x010D00 = 49;
    public static final int HAS_0x012300 = 18;
    public static final int HAS_0x012F00 = 5;
    public static final int HAS_0x013300 = 42;
    public static final int HAS_0x013B00 = 4;
    public static final int HAS_0x013F00 = 54;
    public static final int HAS_0x014400 = 72;
    public static final int HAS_0x015100 = 69;
    public static final int HAS_0x01C000 = 55;
    public static final int HAS_0x01D100 = 48;
    public static final int HAS_0x021800 = 43;
    public static final int HAS_0x024500 = 28;
    public static final int HAS_0x024A00 = 53;
    public static final int HAS_0x024C00 = 17;
    public static final int HAS_0x025D00 = 73;
    public static final int HAS_0x026F00 = 74;
    public static final int HAS_0x029400 = 56;
    public static final int HAS_0x030D00 = 46;
    public static final int HAS_0x032100 = 19;
    public static final int HAS_0x033400 = 51;
    public static final int HAS_0x034200 = 52;
    public static final int HAS_0x034F00 = 20;
    public static final int HAS_0x038A00 = 57;
    public static final int HAS_0x039400 = 44;
    public static final int HAS_0x039600 = 6;
    public static final int HAS_0x03AC00 = 37;
    public static final int HAS_0x03AD00 = 38;
    public static final int HAS_0x03B300 = 50;
    public static final int HAS_0x03B400 = 29;
    public static final int HAS_0x03C100 = 41;
    public static final int HAS_0x03CD00 = 47;
    public static final int HAS_0x03D901 = 80;
    public static final int HAS_0x03D902 = 81;
    public static final int HAS_0x03D903 = 82;
    public static final int HAS_0x03D904 = 83;
    public static final int HAS_0x03D905 = 84;
    public static final int HAS_0x03D906 = 85;
    public static final int HAS_0x03D911 = 86;
    public static final int HAS_0x03D955 = 34;
    public static final int HAS_0x03D956 = 87;
    public static final int HAS_0x03D958 = 88;
    public static final int HAS_0x03D959 = 89;
    public static final int HAS_0x03D95A = 90;
    public static final int HAS_0x03D95B = 91;
    public static final int HAS_0x03D95C = 92;
    public static final int HAS_0x03D95D = 93;
    public static final int HAS_0x03D9AA = 94;
    public static final int HAS_0x03F100 = 40;
    public static final int HAS_0x03FF00 = 8;
    public static final int HAS_0x040100 = 58;
    public static final int HAS_0x040400 = 59;
    public static final int HAS_0x040700 = 60;
    public static final int HAS_0x040800 = 39;
    public static final int HAS_0x040D00 = 1;
    public static final int HAS_0x041700 = 26;
    public static final int HAS_0x041800 = 11;
    public static final int HAS_0x041A00 = 61;
    public static final int HAS_0x041C00 = 62;
    public static final int HAS_0x041E00 = 30;
    public static final int HAS_0x042900 = 22;
    public static final int HAS_0x042E00 = 63;
    public static final int HAS_0x043200 = 10;
    public static final int HAS_0x043300 = 3;
    public static final int HAS_0x043400 = 64;
    public static final int HAS_0x043800 = 32;
    public static final int HAS_0x044700 = 106;
    public static final int HAS_0x046C00 = 70;
    public static final int HAS_0x047000 = 95;
    public static final int HAS_0x047500 = 15;
    public static final int HAS_0x048004 = 35;
    public static final int HAS_0x048100 = 36;
    public static final int HAS_0x048600 = 65;
    public static final int HAS_0x048E00 = 66;
    public static final int HAS_0x048F00 = 9;
    public static final int HAS_0x049400 = 67;
    public static final int HAS_0x049C00 = 27;
    public static final int HAS_0x04A400 = 68;
    public static final int HAS_0x04A501 = 96;
    public static final int HAS_0x04A502 = 97;
    public static final int HAS_0x04A503 = 98;
    public static final int HAS_0x04A504 = 99;
    public static final int HAS_0x04A505 = 100;
    public static final int HAS_0x04A506 = 71;
    public static final int HAS_0x04A507 = 101;
    public static final int HAS_0x04A508 = 102;
    public static final int HAS_0x04A509 = 103;
    public static final int HAS_0x04A50A = 104;
    public static final int HAS_0x04A50B = 105;
    public static final int HAS_0x04B600 = 7;
    public static final int HAS_0x04B800 = 45;
    public static final int HAS_0x04BF00 = 25;
    public static final int HAS_0x04C201 = 12;
    public static final int HAS_0x04C202 = 13;
    public static final int HAS_0x04C203 = 14;
    public static final int HAS_0x04C800 = 31;
    public static final int HAS_0x04D902 = 21;
    public static final int HAS_0x04F600 = 2;
    public static final int HAS_0x04FA00 = 23;
    public static final int HAS_0x04FB00 = 16;
    public static final double MAX_BATTERY_POWER = 25.5d;
    public static final int MCU_RESTART_INVALID = 0;
    public static final int MCU_RESTART_VALID = 1;
    public static final int MESSAGE_55 = 1;
    public static final int MESSAGE_OFFLINE = 0;
    public static final int MESSAGE_ONLINE = 1;
    public static final double MIN_BATTERY_POWER = 0.0d;
    public static final int MOONROOF_BREATH = 253;
    public static final int MOONROOF_CLOSED = 0;
    public static final int MOONROOF_COMFORTABLE = 252;
    public static final int MOONROOF_INVALID = 255;
    public static final int MOONROOF_MIN = 21;
    public static final int MOONROOF_OPEN = 100;
    public static final int MOONROOF_STOP = 254;
    public static final int SMART_VOICE_LIMIT_INVALID = 0;
    public static final int SMART_VOICE_LIMIT_VALID = 1;
    public static final int STATE_INITIALIZED = 1;
    public static final int STATE_INVALID = 0;
    public static final int STATE_UNINITIALIZED = 2;
    public static final int SUNROOF_CLOSE = 4;
    public static final int SUNROOF_CLOSE_NOTICE_CLOSE = 1;
    public static final int SUNROOF_CLOSE_NOTICE_INVALID = 0;
    public static final int SUNROOF_INVALID = 0;
    public static final int SUNROOF_OPEN = 3;
    public static final int SUNROOF_POSITION_COMFORTABLE = 6;
    public static final int SUNROOF_POSITION_FULL_CLOSE = 2;
    public static final int SUNROOF_POSITION_FULL_OPEN = 1;
    public static final int SUNROOF_POSITION_HALF_OPEN = 3;
    public static final int SUNROOF_POSITION_INVALID = 0;
    public static final int SUNROOF_POSITION_STOP = 4;
    public static final int SUNROOF_POSITION_UPDIP = 5;
    public static final int SUNROOF_STOP = 1;
    public static final int SUNROOF_TILTUP = 2;
    public static final int SUNSHADE_INVALID = 255;
    public static final int SUNSHADE_STOP = 254;
    protected static final String TAG = "BYDAutoBodyworkDevice";
    public static final int VOICE_CMD_CLOSE = 2;
    public static final int VOICE_CMD_HALF_OPEN = 3;
    public static final int VOICE_CMD_OPEN = 1;
    public static final int VOICE_CMD_STOP = 4;
    public static final int VOICE_CMD_VENTILATE = 5;
    public static final int WINDOW_BREATH = 5;
    public static final int WINDOW_CLOSE = 2;
    public static final int WINDOW_DISABLE = 1;
    public static final int WINDOW_ENABLE = 0;
    public static final int WINDOW_INVALID = 0;
    public static final int WINDOW_OPEN_FULL = 1;
    public static final int WINDOW_OPEN_HALF = 4;
    public static final int WINDOW_OPEN_PERCENT_MAX = 100;
    public static final int WINDOW_OPEN_PERCENT_MIN = 0;
    public static final int WINDOW_STOP = 3;
    protected static int mSensorCalFlag;
    protected static int mSensorFlag;

    BYDAutoBodyworkDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /** Reads feature ID {@code BODYWORK_ALARM_STATE} (0x4490003e). */
    public int getAlarmState() { throw new RuntimeException("Stub!"); }
    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_AUTO_TYPE} (0x40d00010). */
    public int getAutoModelName() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_AUTO_SYSTEM_STATE} (0x12d0002d). */
    public int getAutoSystemState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_AUTO_TYPE} (0x40d00010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAutoType() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_AUTO_VIN} (0x99000035). */
    public String getAutoVIN() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_BATTERY_CAPACITY} (0x44500010). */
    public int getBatteryCapacity() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_BATTERY_POWER} (0x44500008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public double getBatteryPowerHEV() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_BATTERY_POWER} (0x44500008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBatteryPowerValue() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_BATTERY_VOLTAGE_LEVEL} (0x40400042). */
    public int getBatteryVoltageLevel() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_WINDOW_ANTIPINCH_CONFIG} (0x48e00033). */
    public int getCarWindowAntiPinchConfig() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_STEERING_WHEEL_SENSOR_FLAG} (0x11f00020), {@code BODYWORK_STEERING_WHEEL_SENSOR_CAL_FLAG} (0x11f00021).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDataFlag(int item) { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_LEFT_HAND_FRONT_DOOR} (0x29400008), {@code BODYWORK_RIGHT_HAND_FRONT_DOOR} (0x2940000a), {@code BODYWORK_LEFT_HAND_REAR_DOOR} (0x2940000c), {@code BODYWORK_RIGHT_HAND_REAR_DOOR} (0x2940000e), {@code BODYWORK_HOOD} (0x2940001c), {@code BODYWORK_LUGGAGE_DOOR} (0x2940001a), {@code BODYWORK_FUEL_TANK_CAP} (0x4fb00016). */
    public int getDoorState(int area) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_AUTO_ENERGY_TYPE} (0x99000107).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEnergyType() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_FUEL_ELEC_LOW_POWER} (0x0550001e). */
    public int getFuelElecLowPower() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.bodywork.BYDAutoBodyworkDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_CMD_55_ONLINE} (0x05500000).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMessage5sOnlineState(int id) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_MOON_ROOF_CONFIG} (0x41a0002c), {@code BODYWORK_CLOSE_WINDOW_FOR_RAIN_ONLINE} (0xc8e0002b) [direct + via hasFeature()]. */
    public int getMoonRoofConfig() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_POWER_DAY_MODE} (0x000492e4).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getPowerDayMode() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_POWER_LEVEL} (0x12d0002a). */
    public int getPowerLevel() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_CLOSE_WINDOW_FOR_RAIN} (0x48e0002b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getRainCloseWindow() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_REAL_AUTO_VIN} (0x9900021a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public String getRealAutoVIN() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_SMART_VOICE_LIMIT} (0x48e00037).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSmartVoiceLimit() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_STEERING_WHEEL_ANGEL} (0x11f00008), {@code BODYWORK_STEERING_WHEEL_SPEED} (0x11f00018). */
    public double getSteeringWheelValue(int type) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_SUNROOF_CLOSE_NOTICE} (0x41a0002f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSunroofCloseNotice() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_SUNROOF_INIT_STATE} (0x41a00018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSunroofInitState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_SUNROOF_POSITION} (0x41a00030).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSunroofPosition() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_SUNROOF_STATE} (0x41a00020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSunroofState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_SUNROOF_WINDOBLIND_POSITION} (0x41a00034).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSunroofWindowblindPosition() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_SUNROOF_WINDOBLIND_INIT_STATE} (0x41a0001a).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getWindoblindInitState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_WINDOW_LEFT_FRONT_PERCENT} (0x38800018), {@code BODYWORK_WINDOW_RIGHT_FRONT_PERCENT} (0x4b900010), {@code BODYWORK_WINDOW_LEFT_REAR_PERCENT} (0x38800020), {@code BODYWORK_WINDOW_RIGHT_REAR_PERCENT} (0x4b900018), {@code BODYWORK_MOON_ROOF_OPEN_PERCENT} (0x41a00008), {@code BODYWORK_SUNSHADE_PANEL_PERCENT} (0x41a00010). */
    public int getWindowOpenPercent(int area) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_LEFT_FRONT_WINDOW_PERMIT} (0x48e00036).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getWindowPermitState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code BODYWORK_LEFT_FRONT_WINDOW} (0x38800038), {@code BODYWORK_RIGHT_FRONT_WINDOW} (0x4b90000c), {@code BODYWORK_LEFT_REAR_WINDOW} (0x3880003a), {@code BODYWORK_RIGHT_REAR_WINDOW} (0x4b90000e), {@code BODYWORK_MOON_ROOF} (0x41a0001c), {@code BODYWORK_SUNSHADE_PANEL} (0x41a00023). */
    public int getWindowState(int area) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_CLOSE_WINDOW_FOR_RAIN_ONLINE} (0xc8e0002b), {@code BODYWORK_MOON_ROOF_CONFIG} (0x41a0002c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int hasFeature(String feature) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code BODYWORK_ONLINE_HAS_0x040D00} (0x40d00000), {@code ONLINE_HAS_0x04F600} (0x4f600000), {@code ONLINE_HAS_0x013B00} (0x13b00000), {@code ONLINE_HAS_0x03FF00} (0x3ff00000), {@code ONLINE_HAS_0x048F00} (0x48f00000), {@code BODYWORK_ONLINE_HAS_0x047500} (0x47500000), {@code ONLINE_HAS_0x04D902} (0x4d902000), {@code BODYWORK_ONLINE_HAS_0x04FA00} (0x4fa00000), {@code ONLINE_HAS_0x005500} (0x05500000), {@code BODYWORK_ONLINE_HAS_0x04BF00} (0x4bf00000), {@code BODYWORK_ONLINE_HAS_0x024500} (0x24500000), {@code BODYWORK_ONLINE_HAS_0x04C800} (0x4c800000), {@code BODYWORK_ONLINE_HAS_0x043800} (0x43800000), {@code BODYWORK_ONLINE_3D9_SUBID_55} (0x3d955000), {@code BODYWORK_ONLINE_480_SUBID_04} (0x48004000), {@code ONLINE_HAS_0x03CD00} (0x3cd00000), {@code BODYWORK_ONLINE_HAS_0x033400} (0x33400000), {@code BODYWORK_ONLINE_HAS_0x034200} (0x34200000), {@code BODYWORK_ONLINE_HAS_0x013F00} (0x13f00000), {@code BODYWORK_ONLINE_HAS_0x01C000} (0x1c000000), {@code BODYWORK_ONLINE_HAS_0x029400} (0x29400000), {@code BODYWORK_ONLINE_HAS_0x038A00} (0x38a00000), {@code ONLINE_HAS_0x040400} (0x40400000), {@code BODYWORK_ONLINE_HAS_0x040700} (0x40700000), {@code BODYWORK_ONLINE_HAS_0x041A00} (0x41a00000), {@code BODYWORK_ONLINE_HAS_0x041C00} (0x41c00000), {@code BODYWORK_ONLINE_HAS_0x042E00} (0x42e00000), {@code BODYWORK_ONLINE_HAS_0x043400} (0x43400000), {@code BODYWORK_ONLINE_HAS_0x048600} (0x48600000), {@code BODYWORK_ONLINE_HAS_0x048E00} (0x48e00000), {@code BODYWORK_ONLINE_HAS_0x049400} (0x49400000), {@code BODYWORK_ONLINE_HAS_0x015100} (0x15100000), {@code BODYWORK_ONLINE_HAS_0x04A506} (0x4a506000), {@code BODYWORK_ONLINE_HAS_0x014400} (0x14400000), {@code BODYWORK_ONLINE_HAS_0x03D901} (0x3d901000), {@code BODYWORK_ONLINE_HAS_0x03D902} (0x3d902000), {@code BODYWORK_ONLINE_HAS_0x03D903} (0x3d903000), {@code BODYWORK_ONLINE_HAS_0x03D904} (0x3d904000), {@code BODYWORK_ONLINE_HAS_0x03D905} (0x3d905000), {@code BODYWORK_ONLINE_HAS_0x03D906} (0x3d906000), {@code BODYWORK_ONLINE_HAS_0x03D911} (0x3d911000), {@code BODYWORK_ONLINE_HAS_0x03D956} (0x3d956000), {@code BODYWORK_ONLINE_HAS_0x03D958} (0x3d958000), {@code BODYWORK_ONLINE_HAS_0x03D959} (0x3d959000), {@code BODYWORK_ONLINE_HAS_0x03D95A} (0x3d95a000), {@code BODYWORK_ONLINE_HAS_0x03D95B} (0x3d95b000), {@code BODYWORK_ONLINE_HAS_0x03D95C} (0x3d95c000), {@code BODYWORK_ONLINE_HAS_0x03D95D} (0x3d95d000), {@code BODYWORK_ONLINE_HAS_0x03D9AA} (0x3d9aa000), {@code BODYWORK_ONLINE_HAS_0x047000} (0x47002000), {@code BODYWORK_ONLINE_HAS_0x04A501} (0x4a501000), {@code BODYWORK_ONLINE_HAS_0x04A502} (0x4a502000), {@code BODYWORK_ONLINE_HAS_0x04A503} (0x4a503000), {@code BODYWORK_ONLINE_HAS_0x04A504} (0x4a504000), {@code BODYWORK_ONLINE_HAS_0x04A505} (0x4a505000), {@code BODYWORK_ONLINE_HAS_0x04A507} (0x4a507000), {@code BODYWORK_ONLINE_HAS_0x04A508} (0x4a508000), {@code BODYWORK_ONLINE_HAS_0x04A509} (0x4a509000), {@code BODYWORK_ONLINE_HAS_0x04A50A} (0x4a50a000), {@code BODYWORK_ONLINE_HAS_0x04A50B} (0x4a50b000), {@code BODYWORK_ONLINE_HAS_0x044700} (0x44700000), {@code BODYWORK_ONLINE_HAS_0x043300} (0x43300000), {@code BODYWORK_ONLINE_HAS_0x012F00} (0x12f00000), {@code BODYWORK_ONLINE_HAS_0x039600} (0x39600000), {@code ONLINE_HAS_0x04B600} (0x4b600000), {@code BODYWORK_ONLINE_HAS_0x043200} (0x43200000), {@code ADAS_HAS_BSD} (0x41800000), {@code ONLINE_HAS_0x041800} (0x41800000), {@code BODYWORK_ONLINE_HAS_0x04C201} (0x4c201000), {@code BODYWORK_ONLINE_HAS_0x04C202} (0x4c202000), {@code BODYWORK_ONLINE_HAS_0x04C203} (0x4c203000), {@code BODYWORK_ONLINE_HAS_0x04FB00} (0x4fb00000), {@code BODYWORK_ONLINE_HAS_0x024C00} (0x24c00000), {@code ADAS_CMD_ADAS_ESP_ONLINE} (0x12300000), {@code ONLINE_HAS_0x012300} (0x12300000), {@code BODYWORK_ONLINE_HAS_0x032100} (0x32100000), {@code BODYWORK_ONLINE_HAS_0x034F00} (0x34f00000), {@code BODYWORK_ONLINE_HAS_0x042900} (0x42900000), {@code BODYWORK_ONLINE_HAS_0x041700} (0x41700000), {@code BODYWORK_ONLINE_HAS_0x049C00} (0x49c00000), {@code BODYWORK_ONLINE_HAS_0x03B400} (0x3b400000), {@code CHARGING_HAS_CHARGE_WIRELESS_CHARGING} (0x41e00000), {@code CHARGING_WIRELESS_CHARGING_ONLINE5S} (0x41e00000), {@code ONLINE_HAS_0x041E00} (0x41e00000), {@code ONLINE_HAS_0x00D500} (0x0d500000), {@code ONLINE_HAS_0x048100} (0x48100000), {@code SAFETY_BELT_MSR_481_ONLINE} (0x48100000), {@code BODYWORK_ONLINE_HAS_0x03AC00} (0x3ac00000), {@code BODYWORK_ONLINE_HAS_0x03AD00} (0x3ad00000), {@code BODYWORK_ONLINE_HAS_0x040800} (0x40800000), {@code AC_REAR_PANEL_3F1_ONLINE} (0x3f100000), {@code ONLINE_HAS_0x03F100} (0x3f100000), {@code BODYWORK_ONLINE_HAS_0x03C100} (0x3c100000), {@code BODYWORK_ONLINE_HAS_0x013300} (0x13300000), {@code ONLINE_HAS_0x021800} (0x21800000), {@code SET_CAR_ELEC_HANDBRAKE_DET} (0x21800000), {@code BODYWORK_ONLINE_HAS_0x039400} (0x39400000), {@code BODYWORK_ONLINE_HAS_0x04B800} (0x4b800000), {@code BODYWORK_ONLINE_HAS_0x030D00} (0x30d00000), {@code BODYWORK_ONLINE_HAS_0x01D100} (0x1d100000), {@code ONLINE_HAS_0x010D00} (0x10d00000), {@code BODYWORK_ONLINE_HAS_0x03B300} (0x3b300000), {@code BODYWORK_ONLINE_HAS_0x024A00} (0x24a00000), {@code BODYWORK_ONLINE_HAS_0x040100} (0x40100000), {@code BODYWORK_ONLINE_HAS_0x046C00} (0x46c00000), {@code BODYWORK_ONLINE_HAS_0x025D00} (0x25d00000), {@code BODYWORK_ONLINE_HAS_0x026F00} (0x26f00000).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int hasMessage(int id) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, float value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int queryAutoVIN() { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.bodywork.AbsBYDAutoBodyworkListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.bodywork.AbsBYDAutoBodyworkListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code BODYWORK_LF_WINDOW_CTRL_SET} (0x43100038), {@code BODYWORK_RF_WINDOW_CTRL_SET} (0x4310003b), {@code BODYWORK_LR_WINDOW_CTRL_SET} (0x43100040), {@code BODYWORK_RR_WINDOW_CTRL_SET} (0x43100043).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAllWindowState(int leftFront, int rightFront, int leftRear, int rightRear) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code BODYWORK_LF_WINDOW_CTRL_SET} (0x43100038), {@code BODYWORK_LR_WINDOW_CTRL_SET} (0x43100040), {@code BODYWORK_RF_WINDOW_CTRL_SET} (0x4310003b), {@code BODYWORK_RR_WINDOW_CTRL_SET} (0x43100043).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setBodyWindowCtrlState(int area, int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code BODYWORK_MOON_ROOF_OPEN_PERCENT_SET} (0x4f500020), {@code BODYWORK_SUNSHADE_PANEL_PERCENT_SET} (0x4f500028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setMoonRoofAndSunshadeStop() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code BODYWORK_MOON_ROOF_OPEN_PERCENT_SET} (0x4f500020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setMoonRoofState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code BODYWORK_CLOSE_WINDOW_FOR_RAIN_SET} (0x43100036).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setRainCloseWindow(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code BODYWORK_SUNSHADE_PANEL_PERCENT_SET} (0x4f500028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setSunshadeState(int state) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.bodywork.AbsBYDAutoBodyworkListener l) { throw new RuntimeException("Stub!"); }
    public int voiceCtlMoonRoof(int cmd) { throw new RuntimeException("Stub!"); }
    public int voiceCtlSunshadePanel(int cmd) { throw new RuntimeException("Stub!"); }
}
