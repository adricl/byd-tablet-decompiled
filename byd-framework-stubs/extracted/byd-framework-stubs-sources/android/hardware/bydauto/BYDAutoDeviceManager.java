package android.hardware.bydauto;

public abstract class BYDAutoDeviceManager implements android.hardware.BYDAutoManager.OnBYDAutoListener {
    protected android.hardware.BYDAutoManager mAutoManager;

    protected BYDAutoDeviceManager(android.content.Context con) { throw new RuntimeException("Stub!"); }

    public abstract void addDevice(android.hardware.IBYDAutoDevice arg0);
    public int disableDevice(android.hardware.IBYDAutoDevice device) { throw new RuntimeException("Stub!"); }
    public int enableDevice(android.hardware.IBYDAutoDevice device) { throw new RuntimeException("Stub!"); }
    public int enableDevice(android.hardware.IBYDAutoDevice device, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public byte[] getBuffer(int device, int event) { throw new RuntimeException("Stub!"); }
    public double getDouble(int device, int event) { throw new RuntimeException("Stub!"); }
    public float[] getDoubleArray(int device, int[] event) { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.BYDAutoDeviceManager getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public int getInt(int device, int event) { throw new RuntimeException("Stub!"); }
    public int[] getIntArray(int device, int[] event) { throw new RuntimeException("Stub!"); }
    public abstract void removeDevice(android.hardware.IBYDAutoDevice arg0);
    public int setBuffer(int device, int event, byte[] value) { throw new RuntimeException("Stub!"); }
    public int setDouble(int device, int event, double value) { throw new RuntimeException("Stub!"); }
    public int setDoubleArray(int device, int[] event, float[] value) { throw new RuntimeException("Stub!"); }
    public int setInt(int device, int event, int value) { throw new RuntimeException("Stub!"); }
    public int setIntArray(int device, int[] event, int[] value) { throw new RuntimeException("Stub!"); }
}
