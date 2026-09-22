package android.hardware.bydauto.cputemprature;

/** Permissions: {@code android.permission.BYDAUTO_CPUTEMPRATURE_SET} */
public final class BYDAutoCpuTempratureDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int CPUTEMPRATURE_COMMAND_BUSY = -2147482647;
    public static final int CPUTEMPRATURE_COMMAND_FAILED = -2147482648;
    public static final int CPUTEMPRATURE_COMMAND_INVALID_VALUE = -2147482645;
    public static final int CPUTEMPRATURE_COMMAND_SUCCESS = 0;
    public static final int CPUTEMPRATURE_COMMAND_TIMEOUT = -2147482646;
    public static final int CPU_TEMPRATURE_MAX = 155;
    public static final int CPU_TEMPRATURE_MIN = -100;
    public static final int PMIC_TEMPRATURE_MAX = 155;
    public static final int PMIC_TEMPRATURE_MIN = -100;
    protected static final String TAG = "BYDAutoCPUTEMPATUREDevice";
    public static final int TEC_CTL_MAX = 100;
    public static final int TEC_CTL_MIN;
    static {
        TEC_CTL_MIN = 0;
    }

    BYDAutoCpuTempratureDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.cputemprature.BYDAutoCpuTempratureDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public void setAllStatus() { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code CPU_TEMPRATURE_SET} (0xaa000045). */
    public int setCpuTemprature(int temprature) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code CPU_TEMPRATURE_PMIC_TEMPRATURE_SET} (0xaa000044). */
    public int setPmicTemprature(int temprature) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code CPU_TEMPRATURE_TEC_CTL_SET} (0x000c4fdb). */
    public int setTecCtrlLevel(int level) { throw new RuntimeException("Stub!"); }
    /** Writes feature ID {@code CPU_TEMPRATURE_SET} (0xaa000045), {@code CPU_TEMPRATURE_PMIC_TEMPRATURE_SET} (0xaa000044). */
    public int setTemprature(int cpuTemprature, int pmicTemprature) { throw new RuntimeException("Stub!"); }
}
