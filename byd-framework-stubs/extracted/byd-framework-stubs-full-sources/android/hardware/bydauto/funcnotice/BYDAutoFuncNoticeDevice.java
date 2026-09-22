package android.hardware.bydauto.funcnotice;

/** Permissions: {@code android.permission.BYDAUTO_FUNCNOTICE_GET}, {@code android.permission.BYDAUTO_FUNCNOTICE_SET} */
public final class BYDAutoFuncNoticeDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int FUNCNOTICE_COMMAND_BUSY = -2147482647;
    public static final int FUNCNOTICE_COMMAND_FAILED = -2147482648;
    public static final int FUNCNOTICE_COMMAND_INVALID_VALUE = -2147482645;
    public static final int FUNCNOTICE_COMMAND_SUCCESS = 0;
    public static final int FUNCNOTICE_COMMAND_TIMEOUT = -2147482646;
    public static final int FUNC_3RD_APP = 9;
    public static final int FUNC_APP_MENU = 8;
    public static final int FUNC_BACK = 0;
    public static final int FUNC_BL_OFF = 11;
    public static final int FUNC_MEDIA = 2;
    public static final int FUNC_NAVI = 1;
    public static final int FUNC_PANORAMA = 3;
    public static final int FUNC_PHONE = 5;
    public static final int FUNC_PHONE_LINK = 4;
    public static final int FUNC_SCREENS = 10;
    public static final int FUNC_SETTIGN = 6;
    public static final int FUNC_STATUSBAR = 7;
    protected static final String TAG = "BYDAutoFuncNoticeDevice";

    BYDAutoFuncNoticeDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public void getAllStatus() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code FUNC_SCREEN_NOTICE} (0x0008c23f).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getFuncNotice() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.funcnotice.BYDAutoFuncNoticeDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.funcnotice.AbsBYDAutoFuncNoticeListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.funcnotice.AbsBYDAutoFuncNoticeListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code FUNC_SCREEN_NOTICE_SET} (0x00058d63).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setFuncNotice(int value) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.funcnotice.AbsBYDAutoFuncNoticeListener l) { throw new RuntimeException("Stub!"); }
}
