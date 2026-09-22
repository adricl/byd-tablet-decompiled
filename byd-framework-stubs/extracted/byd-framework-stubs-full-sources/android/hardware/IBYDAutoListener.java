package android.hardware;

public interface IBYDAutoListener {
    void onDataChanged(android.hardware.IBYDAutoEvent arg0);
    void onDataEventChanged(int arg0, android.hardware.bydauto.BYDAutoEventValue arg1);
    void onError(int arg0, String arg1);
}
