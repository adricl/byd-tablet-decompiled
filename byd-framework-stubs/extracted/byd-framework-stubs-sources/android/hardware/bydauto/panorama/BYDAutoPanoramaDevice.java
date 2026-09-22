package android.hardware.bydauto.panorama;

/** Permissions: {@code android.permission.BYDAUTO_PANORAMA_COMMON}, {@code android.permission.BYDAUTO_PANORAMA_GET}, {@code android.permission.BYDAUTO_PANORAMA_SET} */
public class BYDAutoPanoramaDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int APA_AVM_MODE_ENTER = 1;
    public static final int APA_AVM_MODE_EXIT = 2;
    public static final int APA_AVM_MODE_NOY_READY = 0;
    public static final int APA_OUTPUT_STATE_2D_FRONT_LEFT = 1;
    public static final int APA_OUTPUT_STATE_2D_FRONT_RIGHT = 2;
    public static final int APA_OUTPUT_STATE_2D_REAR_LEFT = 3;
    public static final int APA_OUTPUT_STATE_2D_REAR_RIGHT = 4;
    public static final int APA_OUTPUT_STATE_2D_WIDTHLIMIT_LEFT = 5;
    public static final int APA_OUTPUT_STATE_2D_WIDTHLIMIT_RIGHT = 6;
    public static final int APA_OUTPUT_STATE_3D_LEFT_2D_LEFT = 9;
    public static final int APA_OUTPUT_STATE_3D_LEFT_2D_RIGHT = 10;
    public static final int APA_OUTPUT_STATE_3D_LEFT_FRONT_2D_LEFT = 1;
    public static final int APA_OUTPUT_STATE_3D_LEFT_FRONT_2D_RIGHT = 2;
    public static final int APA_OUTPUT_STATE_3D_LOOKDOWN_LEFT = 7;
    public static final int APA_OUTPUT_STATE_3D_LOOKDOWN_RIGHT = 8;
    public static final int APA_OUTPUT_STATE_3D_RIGHT_2D_LEFT = 11;
    public static final int APA_OUTPUT_STATE_3D_RIGHT_2D_RIGHT = 12;
    public static final int APA_OUTPUT_STATE_3D_RIGHT_FRONT_2D_LEFT = 3;
    public static final int APA_OUTPUT_STATE_3D_RIGHT_FRONT_2D_RIGHT = 4;
    public static final int APA_OUTPUT_STATE_INVALID = 0;
    public static final int APA_OUTPUT_STATE_LEFT_FRONT = 13;
    public static final int APA_OUTPUT_STATE_RIGHT_FRONT = 14;
    public static final int APA_STATE_FAILURE = 6;
    public static final int APA_STATE_PARKING = 2;
    public static final int APA_STATE_PARKING_COMPLETED = 5;
    public static final int APA_STATE_PARKING_SUSPEND = 3;
    public static final int APA_STATE_PARKING_TERMINATED = 4;
    public static final int APA_STATE_PASSIVE = 0;
    public static final int APA_STATE_SEARCHING = 1;
    public static final int APA_STATE_STANDBY = 7;
    public static final int BACK_LINE_CONFIG = 1329598496;
    public static final int BACK_LINE_MULTIMEDIA = 2;
    public static final int BACK_LINE_NOT_SUPPORT = 0;
    public static final int BACK_LINE_PAN_INTERNAL = 1;
    public static final int DEVICE_HAS_THE_FEATURE = 1;
    public static final int DEVICE_NOT_HAS_THE_FEATURE = 0;
    public static final int DEVICE_THE_FEATURE_LINK_ERROR = 65535;
    public static final int DEVICE_THE_FEATURE_NEVER_GET = 2;
    public static final int DISPLAY_MODE_3D_PANORAMA = 6;
    public static final int DISPLAY_MODE_FULL_SCREEN = 1;
    public static final int DISPLAY_MODE_PANORAMA = 0;
    public static final int DISPLAY_MODE_REVERSE = 5;
    public static final int DISPLAY_MODE_RF_REVERSE = 4;
    public static final int DISPLAY_MODE_WIDGET = 3;
    public static final String FEATURE_ACU = "AbilityControlUnit";
    public static final int FUNCATION_DEFECT = 2;
    public static final int FUNCATION_OFF = 0;
    public static final int FUNCATION_ON = 1;
    public static final String GET_PANORAMA_CAMERA = "vehicle.config.cam_sort";
    public static final int HAS_ACU = 862978048;
    public static final int LVDS_DRIVING_RECORDER_VIEW = 2;
    public static final int LVDS_PANORMA_RF_VIEW = 1;
    public static final int LVDS_TOP_LIGHT_CAMERA_VIEW = 3;
    public static final int PANORAMA_ACU_STATE = 835431;
    public static final int PANORAMA_ACU_STATE_CLOSE = 2;
    public static final int PANORAMA_ACU_STATE_INVALID = 0;
    public static final int PANORAMA_ACU_STATE_OPEN = 1;
    public static final int PANORAMA_CAR_BODY_STATE = 1329598504;
    public static final int PANORAMA_CHECK = 3;
    public static final int PANORAMA_COMMAND_BUSY = -2147482647;
    public static final int PANORAMA_COMMAND_FAILED = -2147482648;
    public static final int PANORAMA_COMMAND_INVALID = -2147482645;
    public static final int PANORAMA_COMMAND_SUCCESS = 0;
    public static final int PANORAMA_COMMAND_TIMEOUT = -2147482646;
    public static final int PANORAMA_COORDINATE = 1;
    public static final int PANORAMA_EMERGENCY_BUTTON_INVALID = 0;
    public static final int PANORAMA_EMERGENCY_BUTTON_PRESS = 1;
    public static final int PANORAMA_EMERGENCY_BUTTON_STATE = 862978056;
    public static final int PANORAMA_FOCUS = 769940;
    public static final int PANORAMA_FOCUS_OFF = 0;
    public static final int PANORAMA_FOCUS_ON = 1;
    public static final int PANORAMA_FRONT = 4;
    public static final int PANORAMA_INVALID = 0;
    public static final int PANORAMA_LEFT = 6;
    public static final int PANORAMA_LVDS_STATE = 1329598498;
    public static final int PANORAMA_NEW_CAR_BODY = 1;
    public static final int PANORAMA_OFF = 2;
    public static final int PANORAMA_OFFLINE = 255;
    public static final int PANORAMA_OFFLINE_STATE = 1329598464;
    public static final int PANORAMA_OLD_CAR_BODY = 0;
    public static final int PANORAMA_ON = 1;
    public static final int PANORAMA_ONLINE = 1;
    public static final int PANORAMA_ONLINE_STATE = 1329598501;
    public static final int PANORAMA_OPERATION = 180979;
    public static final int PANORAMA_OUTPUT_COMPOSE = 6;
    public static final int PANORAMA_OUTPUT_FRONT = 2;
    public static final int PANORAMA_OUTPUT_FRONT_LEFT = 8;
    public static final int PANORAMA_OUTPUT_FRONT_RIGHT = 9;
    public static final int PANORAMA_OUTPUT_FRONT_WIDE = 12;
    public static final int PANORAMA_OUTPUT_INVALID = 0;
    public static final int PANORAMA_OUTPUT_LEFT = 4;
    public static final int PANORAMA_OUTPUT_MATCHING = 7;
    public static final int PANORAMA_OUTPUT_OFF = 1;
    public static final int PANORAMA_OUTPUT_REAR = 3;
    public static final int PANORAMA_OUTPUT_REAR_LEFT = 10;
    public static final int PANORAMA_OUTPUT_REAR_RIGHT = 11;
    public static final int PANORAMA_OUTPUT_REAR_WIDE = 13;
    public static final int PANORAMA_OUTPUT_RIGHT = 5;
    public static final int PANORAMA_OUTPUT_SIGNAL = 1329598490;
    public static final int PANORAMA_OUTPUT_SIGNAL_CVBS = 0;
    public static final int PANORAMA_OUTPUT_SIGNAL_LVDS = 1;
    public static final int PANORAMA_OUTPUT_STATE = 1329598480;
    public static final int PANORAMA_OUTPUT_WIDTH_LIMIT = 14;
    public static final int PANORAMA_REAR = 5;
    public static final int PANORAMA_REMOTE_CALL_HAVE_REQUEST = 1;
    public static final int PANORAMA_REMOTE_CALL_INVALID = 0;
    public static final int PANORAMA_REMOTE_IMAGE_CALL_INVALID = 0;
    public static final int PANORAMA_REMOTE_IMAGE_CALL_NOT_SUPPORT = 1;
    public static final int PANORAMA_REMOTE_IMAGE_CALL_SUPPORT = 2;
    public static final int PANORAMA_REVERSE = 3;
    public static final int PANORAMA_RF_REVERSE = 2;
    public static final int PANORAMA_RIGHT = 7;
    public static final int PANORAMA_RINGHT_CAMERA_SWITCH = 1086328862;
    public static final int PANORAMA_RINGHT_CAMERA_SWITCH_OFF = 2;
    public static final int PANORAMA_RINGHT_CAMERA_SWITCH_ON = 1;
    public static final int PANORAMA_ROTATION = 1329598492;
    public static final int PANORAMA_ROTATION_HORIZONTAL = 1;
    public static final int PANORAMA_ROTATION_VERTICAL = 2;
    public static final int PANORAMA_SD_ONLINE = 4;
    public static final int PANORAMA_WORK_MODE = 1329598484;
    public static final int PANORAMA_WORK_OFF = 0;
    public static final int PANORAMA_WORK_ON = 1;
    public static final int PANORAMA_WORK_STATE = 1329598488;
    public static final int PANO_OPERATE_DOWN = 1;
    public static final int PANO_OPERATE_INVALID = 0;
    public static final int PANO_OPERATE_MOVE = 3;
    public static final int PANO_OPERATE_UP = 2;
    public static final int PANO_TRANS_STATE_INVALID = 0;
    public static final int PANO_TRANS_STATE_OFF = 2;
    public static final int PANO_TRANS_STATE_ON = 1;
    protected static final String TAG = "BYDAutoPanoramaDevice";

    BYDAutoPanoramaDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /** Reads feature ID {@code PANORAMA_BACK_LINE_CONFIG} (0x4f401020). */
    public int getBackLineConfig() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code PANORAMA_WORK_MODE} (0x4f401014). */
    public int getDisplayMode() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.panorama.BYDAutoPanoramaDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code PANORAMA_OUTPUT_SIGNAL} (0x4f40101a). */
    public int getPanoOutputSignal() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code PANORAMA_OUTPUT_STATE} (0x4f401010). */
    public int getPanoOutputState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code PANORAMA_ROTATION} (0x4f40101c). */
    public int getPanoRotation() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code PANORAMA_WORK_STATE} (0x4f401018). */
    public int getPanoWorkState() { throw new RuntimeException("Stub!"); }
    public int getPanoramaOnlineState() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, float value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.panorama.AbsBYDAutoPanoramaListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.panorama.AbsBYDAutoPanoramaListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code PANORAMA_OUTPUT_STATE_SET} (0x4de01010), {@code PANORAMA_WORK_MODE_SET} (0x4de01014), {@code PANORAMA_ROTATION_SET} (0x4de01022). */
    public int setPanoParams(int output, int mode, int rotation) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.panorama.AbsBYDAutoPanoramaListener l) { throw new RuntimeException("Stub!"); }
}
