package android.hardware.bydauto.gearbox;

/** Permissions: {@code android.permission.BYDAUTO_GEARBOX_GET} */
public final class BYDAutoGearboxDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int EPB_STATE_APPLIED = 3;
    public static final int EPB_STATE_APPLYING = 2;
    public static final int EPB_STATE_FAULT = 4;
    public static final int EPB_STATE_RELEASED = 1;
    public static final int EPB_STATE_RELEASING = 0;
    public static final int GEARBOX_AUTO_MODE_D = 4;
    public static final int GEARBOX_AUTO_MODE_M = 5;
    public static final int GEARBOX_AUTO_MODE_N = 3;
    public static final int GEARBOX_AUTO_MODE_P = 1;
    public static final int GEARBOX_AUTO_MODE_R = 2;
    public static final int GEARBOX_AUTO_MODE_S = 6;
    public static final int GEARBOX_BRAKE_FLUID_LEVEL_LOW = 1;
    public static final int GEARBOX_BRAKE_FLUID_LEVEL_NORMAL = 2;
    public static final int GEARBOX_BREAK_PADAL_NOT_PRESS = 2;
    public static final int GEARBOX_BREAK_PADAL_PRESS = 1;
    public static final String GEARBOX_CODE_0 = "DABS15-41";
    public static final String GEARBOX_CODE_1 = "F4A4";
    public static final String GEARBOX_CODE_10 = "5RT14";
    public static final String GEARBOX_CODE_11 = "6T25";
    public static final String GEARBOX_CODE_12 = "6DT25";
    public static final String GEARBOX_CODE_13 = "6DT33";
    public static final String GEARBOX_CODE_14 = "6T18";
    public static final String GEARBOX_CODE_15 = "6DT35";
    public static final String GEARBOX_CODE_16 = "AF636";
    public static final String GEARBOX_CODE_17 = "AF640";
    public static final String GEARBOX_CODE_18 = "F625";
    public static final String GEARBOX_CODE_19 = "F515";
    public static final String GEARBOX_CODE_2 = "F4A4B";
    public static final String GEARBOX_CODE_20 = "6F18";
    public static final String GEARBOX_CODE_21 = "CF18";
    public static final String GEARBOX_CODE_22 = "CF025";
    public static final String GEARBOX_CODE_23 = "7DT28";
    public static final String GEARBOX_CODE_24 = "6HDT35-3";
    public static final String GEARBOX_CODE_25 = "6HDT35-4";
    public static final String GEARBOX_CODE_26 = "6HDT35-5";
    public static final String GEARBOX_CODE_27 = "T75-1";
    public static final String GEARBOX_CODE_28 = "T75-3";
    public static final String GEARBOX_CODE_29 = "T75-2";
    public static final String GEARBOX_CODE_3 = "VT2-04O";
    public static final String GEARBOX_CODE_30 = "T75-5";
    public static final String GEARBOX_CODE_31 = "7DT30";
    public static final String GEARBOX_CODE_32 = "DHT30";
    public static final String GEARBOX_CODE_33 = "DHT33";
    public static final String GEARBOX_CODE_34 = "7DT20";
    public static final String GEARBOX_CODE_4 = "SSG";
    public static final String GEARBOX_CODE_5 = "5T09";
    public static final String GEARBOX_CODE_6 = "5T14";
    public static final String GEARBOX_CODE_7 = "5T19";
    public static final String GEARBOX_CODE_8 = "5T19-1";
    public static final String GEARBOX_CODE_9 = "5RT10";
    public static final int GEARBOX_COMMAND_BUSY = -2147482647;
    public static final int GEARBOX_COMMAND_FAILED = -2147482648;
    public static final int GEARBOX_COMMAND_INVALID_VALUE = -2147482645;
    public static final int GEARBOX_COMMAND_SUCCESS = 0;
    public static final int GEARBOX_COMMAND_TIMEOUT = -2147482646;
    public static final int GEARBOX_PARK_BREAK_SWITCH_INVALID = 0;
    public static final int GEARBOX_PARK_BREAK_SWITCH_VALID = 1;
    public static final int GEARBOX_REAL_LEVEL_D = 0;
    public static final int GEARBOX_REAL_LEVEL_N = 2;
    public static final int GEARBOX_REAL_LEVEL_R = 1;
    public static final int GEARBOX_STATE_OFF = 0;
    public static final int GEARBOX_STATE_ON = 1;
    public static final int GEARBOX_TYPE_AMT = 1;
    public static final int GEARBOX_TYPE_AT = 2;
    public static final int GEARBOX_TYPE_CVT = 3;
    public static final int GEARBOX_TYPE_DCT = 4;
    public static final int GEARBOX_TYPE_ECVT = 5;
    public static final int GEARBOX_TYPE_INVALID = 255;
    public static final int GEARBOX_TYPE_INVALID2 = 6;
    public static final int GEARBOX_TYPE_MT = 0;
    public static final int GEARBOX_TYPE_NONE = 7;
    public static final int GEAR_D = 2;
    public static final int GEAR_INVALID = 255;
    public static final int GEAR_N = 0;
    public static final int GEAR_P = 3;
    public static final int GEAR_R = 1;
    protected static final String TAG = "BYDAutoGearboxDevice";

    BYDAutoGearboxDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code GEARBOX_BRAKE_FLUID_LEVEL} (0x0550001c). */
    public int getBrakeFluidLevel() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code GEARBOX_BRAKE_PEDAL} (0x29400022). */
    public int getBrakePedalState() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code GEARBOX_AUTO_MODE_TYPE} (0x21200038). */
    public int getGearboxAutoModeType() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code GEARBOX_CODE} (0x40d00018). */
    public String getGearboxCode() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code GEARBOX_MANUAL_MODE_LEVEL} (0x29400020). */
    public int getGearboxManualModeLevel() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code GEARBOX_TYPE} (0x40d00020). */
    public int getGearboxType() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.gearbox.BYDAutoGearboxDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code GEARBOX_PARK_BRAKE_SWITCH} (0x05500030). */
    public int getParkBrakeSwitch() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code GEARBOX_TYPE} (0x40d00020) [via getGearboxType()]. */
    public int isGearboxAuto() { throw new RuntimeException("Stub!"); }
    public int learningEPB() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.gearbox.AbsBYDAutoGearboxListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.gearbox.AbsBYDAutoGearboxListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.gearbox.AbsBYDAutoGearboxListener l) { throw new RuntimeException("Stub!"); }
}
