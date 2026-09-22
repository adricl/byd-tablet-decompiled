package android.hardware.bydauto.doormirror;

/** Permissions: {@code android.permission.BYDAUTO_REAR_VIEW_MIRROR_GET}, {@code android.permission.BYDAUTO_REAR_VIEW_MIRROR_SET} */
public final class BYDAutoRearViewMirrorDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int REAR_VIEW_MIRROR_ANTIGLARE_STATE_INVALID = 0;
    public static final int REAR_VIEW_MIRROR_ANTIGLARE_STATE_MILD = 1;
    public static final int REAR_VIEW_MIRROR_ANTIGLARE_STATE_MODERATE = 2;
    public static final int REAR_VIEW_MIRROR_ANTIGLARE_STATE_SERIOUS = 3;
    public static final int REAR_VIEW_MIRROR_COMMAND_BUSY = -2147482647;
    public static final int REAR_VIEW_MIRROR_COMMAND_FAILED = -2147482648;
    public static final int REAR_VIEW_MIRROR_COMMAND_INVALID = -2147482645;
    public static final int REAR_VIEW_MIRROR_COMMAND_SUCCESS = 0;
    public static final int REAR_VIEW_MIRROR_COMMAND_TIMEOUT = -2147482646;
    public static final int REAR_VIEW_MIRROR_FOLD = 1;
    public static final int REAR_VIEW_MIRROR_NO_ACTION = 0;
    public static final int REAR_VIEW_MIRROR_UNFOLD = 2;
    protected static final String TAG = "BYDAutoRearViewMirrorDevice";

    BYDAutoRearViewMirrorDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    /** Reads feature ID {@code REAR_VIEW_MIRROR_ANTIGLARE_STATE} (0x3b900038). */
    public int getAutoExternalRearMirrorAntiglareState() { throw new RuntimeException("Stub!"); }
    /** Reads feature ID {@code REAR_VIEW_MIRROR_STATE} (0x39400008). */
    public int getAutoExternalRearMirrorState() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.doormirror.BYDAutoRearViewMirrorDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.doormirror.AbsBYDAutoRearViewMirrorListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.doormirror.AbsBYDAutoRearViewMirrorListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.doormirror.AbsBYDAutoRearViewMirrorListener l) { throw new RuntimeException("Stub!"); }
}
