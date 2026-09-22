package android.hardware;

public final class BYDAutoManager {
    public static final int BYDAUTO_COMMAND_RESULT_BUSY = -2147482647;
    public static final int BYDAUTO_COMMAND_RESULT_FAILED = -2147482648;
    public static final int BYDAUTO_COMMAND_RESULT_INVALID_VALUE = -2147482645;
    public static final int BYDAUTO_COMMAND_RESULT_SUCCESS = 0;
    public static final int BYDAUTO_COMMAND_RESULT_TIMEOUT = -2147482646;
    public static final int UNKNOWN_ERROR = -2147483648;
    public static android.hardware.BYDAutoManager mInstance;

    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public BYDAutoManager(android.content.Context context) { throw new RuntimeException("Stub!"); }

    public int disableDevice(int deviceType) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public static void dispatchError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public static void dispatchNativeEvent(int device_type, int event_type, float value) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public static void dispatchNativeEvent(int device_type, int event_type, int value) { throw new RuntimeException("Stub!"); }
    public static void dispatchNativeEvent(int device_type, int event_type, byte[] value) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public static void dispatchResponse(int device_type, int event_type, int successful) { throw new RuntimeException("Stub!"); }
    public int enableDevice(int deviceType) { throw new RuntimeException("Stub!"); }
    public int enableDevice(int deviceID, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public byte[] getBuffer(int deviceType, int eventType) { throw new RuntimeException("Stub!"); }
    public float getDouble(int deviceType, int eventType) { throw new RuntimeException("Stub!"); }
    public float[] getDoubleArray(int deviceType, int[] eventType) { throw new RuntimeException("Stub!"); }
    public int getInt(int deviceType, int eventType) { throw new RuntimeException("Stub!"); }
    public int[] getIntArray(int deviceType, int[] eventType) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.BYDAutoManager.OnBYDAutoListener l) { throw new RuntimeException("Stub!"); }
    public int setBuffer(int deviceType, int eventType, byte[] value) { throw new RuntimeException("Stub!"); }
    public int setDouble(int deviceType, int eventType, double value) { throw new RuntimeException("Stub!"); }
    public int setDoubleArray(int deviceType, int[] eventType, float[] value) { throw new RuntimeException("Stub!"); }
    public int setInt(int deviceType, int eventType, int value) { throw new RuntimeException("Stub!"); }
    public int setIntArray(int deviceType, int[] eventType, int[] value) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.BYDAutoManager.OnBYDAutoListener l) { throw new RuntimeException("Stub!"); }

    public interface OnBYDAutoListener {
        void onChanged(int arg0, int arg1, float arg2, Object arg3);
        void onChanged(int arg0, int arg1, int arg2, Object arg3);
        void onChanged(int arg0, int arg1, byte[] arg2, Object arg3);
        void onError(int arg0, String arg1);
    }
}
