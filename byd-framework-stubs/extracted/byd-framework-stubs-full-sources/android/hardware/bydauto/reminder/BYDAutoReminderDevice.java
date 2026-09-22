package android.hardware.bydauto.reminder;

/** Permissions: {@code android.permission.BYDAUTO_REMINDER_GET}, {@code android.permission.BYDAUTO_REMINDER_SET} */
public final class BYDAutoReminderDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int REMINDER_COMMAND_BUSY = -2147482647;
    public static final int REMINDER_COMMAND_FAILED = -2147482648;
    public static final int REMINDER_COMMAND_INVALID = -2147482645;
    public static final int REMINDER_COMMAND_SUCCESS = 0;
    public static final int REMINDER_COMMAND_TIMEOUT = -2147482646;
    public static final int RMD_AC_DECREASE_WIND_LEVEL = 83;
    public static final int RMD_ATTTION_DRIVING = 12;
    public static final int RMD_AUTO_LIGHT_OFF = 14;
    public static final int RMD_AUTO_LIGHT_ON = 13;
    public static final int RMD_BEAM_LIGHT_ON = 38;
    public static final int RMD_CHANGE_LOWKEY = 10;
    public static final int RMD_DOOR_OK = 9;
    public static final int RMD_FINISH_STUDY = 35;
    public static final int RMD_FST_PWD_BTN = 5;
    public static final int RMD_HIGHT_TEMPERATURE = 39;
    public static final int RMD_KEYCLSTART_BTN = 6;
    public static final int RMD_KEY_INCAR = 7;
    public static final int RMD_LOCK_SAFEBELT = 36;
    public static final int RMD_LOW_BATT = 1;
    public static final int RMD_LOW_OIL = 37;
    public static final int RMD_LOW_SINGAL_NET = 42;
    public static final int RMD_LOW_TEMPERATURE = 40;
    public static final int RMD_LPSTART_BTN = 4;
    public static final int RMD_NPLEAVE_CAR = 3;
    public static final int RMD_PM2P5_AUTO_INTER_CIRCUL = 82;
    public static final int RMD_PM2P5_INTER_CIRCUL = 81;
    public static final int RMD_PM2P5_OPEN_AC = 80;
    public static final int RMD_RM_BRAKE = 8;
    public static final int RMD_START_CAR = 2;
    public static final int RMD_STEER_START = 11;
    public static final int RMD_STOP_REMOTECTRL_DRV = 41;
    public static final int RMD_SYS_FATIGUE_DEMO = 33;
    public static final int RMD_SYS_FATIGUE_OFF = 32;
    public static final int RMD_SYS_FATIGUE_ON = 15;
    public static final int RMD_SYS_FATIGUE_WORK = 34;
    protected static final String TAG = "BYDAutoReminderDevice";

    BYDAutoReminderDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code REMINDER} (0x000161e1).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getIndicatorValue() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.reminder.BYDAutoReminderDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.reminder.AbsBYDAutoReminderListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.reminder.AbsBYDAutoReminderListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.reminder.AbsBYDAutoReminderListener l) { throw new RuntimeException("Stub!"); }
}
