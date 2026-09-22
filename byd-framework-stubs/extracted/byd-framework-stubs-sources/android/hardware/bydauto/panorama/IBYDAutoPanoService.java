package android.hardware.bydauto.panorama;

public interface IBYDAutoPanoService extends android.os.IInterface {
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    byte[] getBuffer(int arg0) throws android.os.RemoteException;
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    int getValue(int arg0) throws android.os.RemoteException;
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    int registerUser(android.hardware.bydauto.panorama.IBYDAutoPanoListener arg0) throws android.os.RemoteException;
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    int setBuffer(int arg0, byte[] arg1) throws android.os.RemoteException;
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    int setMap(String[] arg0, java.util.Map arg1) throws android.os.RemoteException;
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    int setValue(int arg0, int arg1) throws android.os.RemoteException;
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    int unregisterUser(android.hardware.bydauto.panorama.IBYDAutoPanoListener arg0) throws android.os.RemoteException;

    public abstract class Stub extends android.os.Binder implements android.hardware.bydauto.panorama.IBYDAutoPanoService {
        Stub() { throw new RuntimeException("Stub!"); }

        public android.os.IBinder asBinder() { throw new RuntimeException("Stub!"); }
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException { throw new RuntimeException("Stub!"); }
    }
}
