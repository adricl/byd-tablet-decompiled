package android.hardware.bydauto;

public class BYDAutoEvent implements android.hardware.IBYDAutoEvent {
    public BYDAutoEvent(int deviceType, int eventType, float value) { throw new RuntimeException("Stub!"); }
    public BYDAutoEvent(int deviceType, int eventType, float value, Object data) { throw new RuntimeException("Stub!"); }
    public BYDAutoEvent(int deviceType, int eventType, int value) { throw new RuntimeException("Stub!"); }
    public BYDAutoEvent(int deviceType, int eventType, int value, Object data) { throw new RuntimeException("Stub!"); }
    public BYDAutoEvent(int deviceType, int eventType, byte[] value, Object data) { throw new RuntimeException("Stub!"); }

    public byte[] getBufferData() { throw new RuntimeException("Stub!"); }
    public Object getData() { throw new RuntimeException("Stub!"); }
    public int getDeviceType() { throw new RuntimeException("Stub!"); }
    public double getDoubleValue() { throw new RuntimeException("Stub!"); }
    public int getEventType() { throw new RuntimeException("Stub!"); }
    public int getValue() { throw new RuntimeException("Stub!"); }
    public void setData(Object data) { throw new RuntimeException("Stub!"); }
}
