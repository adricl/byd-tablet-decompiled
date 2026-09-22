package android.hardware.bydauto.multimedia;

public class MediaInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.bydauto.multimedia.MediaInfo> CREATOR;
    public String albumName;
    public String artistName;
    public int duration;
    public String fileName;
    static {
        CREATOR = null;
    }

    public MediaInfo() { throw new RuntimeException("Stub!"); }

    public final int describeContents() { throw new RuntimeException("Stub!"); }
    public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
    public int hashCode() { throw new RuntimeException("Stub!"); }
    public void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
    public String toString() { throw new RuntimeException("Stub!"); }
    public void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
}
