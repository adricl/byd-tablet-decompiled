package android.hardware.bydauto;

public abstract class AbsBYDAutoDevice implements android.hardware.IBYDAutoDevice {
    protected AbsBYDAutoDevice(android.content.Context con) { throw new RuntimeException("Stub!"); }

    public String arrayToStr(float[] floatArray) { throw new RuntimeException("Stub!"); }
    public String arrayToStr(int[] intArray) { throw new RuntimeException("Stub!"); }
    protected int get(int device, int event) { throw new RuntimeException("Stub!"); }
    public android.hardware.bydauto.BYDAutoEventValue get(int[] eventTypes, java.lang.Class<?> arg1) { throw new RuntimeException("Stub!"); }
    protected byte[] getBuffer(int device, int event) { throw new RuntimeException("Stub!"); }
    public abstract int getDevicetype();
    protected double getDouble(int device, int event) { throw new RuntimeException("Stub!"); }
    protected float[] getDoubleArray(int device, int[] event) { throw new RuntimeException("Stub!"); }
    public abstract String getGetPermission();
    protected int[] getIntArray(int device, int[] event) { throw new RuntimeException("Stub!"); }
    public abstract String getSetPermission();
    public boolean onError(int errCode, String errMessage) { throw new RuntimeException("Stub!"); }
    public boolean onPostEvent(android.hardware.IBYDAutoEvent event) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, float value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, byte[] value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.IBYDAutoListener l) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public void registerListener(android.hardware.IBYDAutoListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    protected int set(int device, int event, double value) { throw new RuntimeException("Stub!"); }
    protected int set(int device, int event, int value) { throw new RuntimeException("Stub!"); }
    protected int set(int device, int event, byte[] value) { throw new RuntimeException("Stub!"); }
    protected int set(int device, int[] event, float[] params) { throw new RuntimeException("Stub!"); }
    protected int set(int device, int[] event, int[] params) { throw new RuntimeException("Stub!"); }
    public int set(int[] eventTypes, android.hardware.bydauto.BYDAutoEventValue eventValue) { throw new RuntimeException("Stub!"); }
    public int setMediaInfo(int device, int event, byte[] value) { throw new RuntimeException("Stub!"); }
    public int setMediaState(int device, int event, int value) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.IBYDAutoListener l) { throw new RuntimeException("Stub!"); }
}
