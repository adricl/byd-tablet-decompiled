package android.hardware;

public interface IBYDAutoDevice {
    int[] getFeatureList();
    int getType();
    boolean onError(int arg0, String arg1);
    boolean onPostEvent(android.hardware.IBYDAutoEvent arg0);
    boolean postEvent(int arg0, int arg1, float arg2, Object arg3);
    boolean postEvent(int arg0, int arg1, int arg2, Object arg3);
    boolean postEvent(int arg0, int arg1, byte[] arg2, Object arg3);
    void registerListener(android.hardware.IBYDAutoListener arg0);
    void unregisterListener(android.hardware.IBYDAutoListener arg0);
}
