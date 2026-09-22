package android.hardware.bydauto.audio;

/** Permissions: {@code android.permission.BYDAUTO_AUDIO_GET}, {@code android.permission.BYDAUTO_AUDIO_SET} */
public final class BYDAutoAudioDevice extends android.hardware.bydauto.AbsBYDAutoDevice {
    public static final int ARKAMYS_INVALID = 0;
    public static final int ARKAMYS_MODE_ALL = 2;
    public static final int ARKAMYS_MODE_DRIVER = 1;
    public static final int ARKAMYS_MODE_INVALID = 0;
    public static final int ARKAMYS_MODE_OFF = 3;
    public static final int ARKAMYS_OFF = 2;
    public static final int ARKAMYS_ON = 1;
    public static final int AUDIO_COMMAND_BUSY = -2147482647;
    public static final int AUDIO_COMMAND_FAILED = -2147482648;
    public static final int AUDIO_COMMAND_INVALID_VALUE = -2147482645;
    public static final int AUDIO_COMMAND_SUCCESS = 0;
    public static final int AUDIO_COMMAND_TIMEOUT = -2147482646;
    public static final int AUDIO_FUNCTION_OFF = 0;
    public static final int AUDIO_FUNCTION_ON = 1;
    public static final int AUDIO_MIC_AMP_GAIN_0 = 0;
    public static final int AUDIO_MIC_AMP_GAIN_1 = 1;
    public static final int AUDIO_MIC_AMP_GAIN_10 = 10;
    public static final int AUDIO_MIC_AMP_GAIN_2 = 2;
    public static final int AUDIO_MIC_AMP_GAIN_3 = 3;
    public static final int AUDIO_MIC_AMP_GAIN_4 = 4;
    public static final int AUDIO_MIC_AMP_GAIN_5 = 5;
    public static final int AUDIO_MIC_AMP_GAIN_6 = 6;
    public static final int AUDIO_MIC_AMP_GAIN_7 = 7;
    public static final int AUDIO_MIC_AMP_GAIN_8 = 8;
    public static final int AUDIO_MIC_AMP_GAIN_9 = 9;
    public static final int AUDIO_NO_DIRAC = 2;
    public static final int AUDIO_TIME_HOUR_MAX = 23;
    public static final int AUDIO_TIME_HOUR_MIN = 0;
    public static final int AUDIO_TIME_MINUTE_MAX = 59;
    public static final int AUDIO_TIME_MINUTE_MIN = 0;
    public static final int AUDIO_TIME_SECOND_MAX = 59;
    public static final int AUDIO_TIME_SECOND_MIN = 0;
    public static final int AUDIO_VOLUME_MAX = 100;
    public static final int AUDIO_VOLUME_MIN = 0;
    public static final int BACK_PAD_VOL_MAX = 39;
    public static final int BACK_PAD_VOL_MIN = 0;
    public static final int BACK_PAD_VOL_NO_ACTION = 63;
    public static final int BEAM_FORM_ALL = 1;
    public static final int BEAM_FORM_AUTO = 4;
    public static final int BEAM_FORM_INVALID = 0;
    public static final int BEAM_FORM_LEFT = 2;
    public static final int BEAM_FORM_RIGHT = 3;
    public static final int CHANNEL_KARAOKE = 3;
    public static final int CHANNEL_PAD = 2;
    public static final int CHANNEL_RADIO = 1;
    public static final int CONTROL_IFLYTEK_OFF = 0;
    public static final int CONTROL_IFLYTEK_ON = 1;
    public static final int CONTROL_IFLYTEK_RESET = 2;
    public static final int CTRL_SOURCE_KNOB = 1;
    public static final int CTRL_SOURCE_ST = 2;
    public static final int DIRAC_MODE_HIFI_ROOM = 1;
    public static final int DIRAC_MODE_LIVESTAGE = 2;
    public static final int DIRAC_MODE_OFF = 3;
    public static final int DIRAC_PERFORMANCE_CLARITY = 5;
    public static final int DIRAC_PERFORMANCE_DYNAMIC = 6;
    public static final int DIRAC_PERFORMANCE_OFF = 4;
    public static final int EQUALIZER_FREQUENCY_1 = 1;
    public static final int EQUALIZER_FREQUENCY_2 = 2;
    public static final int EQUALIZER_FREQUENCY_3 = 3;
    public static final int EQUALIZER_FREQUENCY_4 = 4;
    public static final int EQUALIZER_FREQUENCY_5 = 5;
    public static final int EQUALIZER_PERCENT_MAX = 30;
    public static final int EQUALIZER_PERCENT_MIN = 1;
    public static final int IFLYTEK_FUNCTION_MODE_BT_ELIMINATE_ECHO = 3;
    public static final int IFLYTEK_FUNCTION_MODE_OFF = 0;
    public static final int IFLYTEK_FUNCTION_MODE_RECORD = 1;
    public static final int IFLYTEK_FUNCTION_MODE_VOICE_DENOISING = 2;
    public static final int IFLYTEK_FUNCTION_MODE_VOICE_WAKE_UP = 4;
    public static final int IFLYTEK_WORK_MODE_ADDON = 2;
    public static final int IFLYTEK_WORK_MODE_CAR = 3;
    public static final int IFLYTEK_WORK_MODE_TOPLIGHT = 1;
    public static final int KARAOKE_EQUALIZER_1 = 1;
    public static final int KARAOKE_EQUALIZER_2 = 2;
    public static final int KARAOKE_EQUALIZER_3 = 3;
    public static final int KARAOKE_EQUALIZER_VALUE_MAX = 30;
    public static final int KARAOKE_EQUALIZER_VALUE_MIN = 1;
    public static final int KARAOKE_MODE_ENTER = 1;
    public static final int KARAOKE_MODE_EXIT = 2;
    public static final int LOUDSPEAKER_NUM_INVALID = 0;
    public static final int LOUDSPEAKER_NUM_MAX = 16;
    public static final int LOUDSPEAKER_NUM_MIN = 2;
    public static final int MUSIC_CHANGE_SOURCE_ST = 2;
    public static final int MUSIC_CHANGE_SOURCE_VOICE = 1;
    public static final int MUTE_DISABLE = 0;
    public static final int MUTE_ENABLE = 1;
    public static final int NAVI_MUTE_DISABLE = 3;
    public static final int NAVI_MUTE_ENABLE = 2;
    public static final int NAVI_VOLUME_MAX = 10;
    public static final int NAVI_VOLUME_MIN = 0;
    public static final int RESET_INVALID = 0;
    public static final int RESET_ITEM_BALANCE = 1;
    public static final int RESET_ITEM_EQ = 0;
    public static final int RESET_VALID = 1;
    public static final int SIGNAL_INVALID = 0;
    public static final int SIGNAL_MAX = 15;
    public static final int SIGNAL_MIN = 1;
    public static final int SOUND_EFFECT_CLASSICAL = 3;
    public static final int SOUND_EFFECT_COUNTRY = 4;
    public static final int SOUND_EFFECT_CUSTOM = 11;
    public static final int SOUND_EFFECT_DANCE = 9;
    public static final int SOUND_EFFECT_ELECTRONIC = 5;
    public static final int SOUND_EFFECT_JAZZ = 2;
    public static final int SOUND_EFFECT_NONE = 1;
    public static final int SOUND_EFFECT_OLDIES = 6;
    public static final int SOUND_EFFECT_OPERA = 10;
    public static final int SOUND_EFFECT_POP = 7;
    public static final int SOUND_EFFECT_ROCK = 8;
    public static final int SOUND_FIELD_MAX = 14;
    public static final int SOUND_FIELD_MIN = 0;
    protected static final String TAG = "BYDAutoAudioDevice";
    public static final int VOLUME_SOURCE_KNOB = 11;
    public static final int VOLUME_SOURCE_PADQUR = 0;
    public static final int VOLUME_SOURCE_PADREQ = 1;
    public static final int VOLUME_SOURCE_WHEEL = 12;

    BYDAutoAudioDevice() { super((android.content.Context) null); throw new RuntimeException("Stub!"); }

    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.audio.BYDAutoAudioDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.audio.AbsBYDAutoAudioListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.audio.AbsBYDAutoAudioListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    public int sendAudioPlayingTime(int playingHours, int playingMinutes, int playingSeconds) { throw new RuntimeException("Stub!"); }
    public int sendAudioTotalTime(int totalHours, int totalMinutes, int totalSeconds) { throw new RuntimeException("Stub!"); }
    public int sendSingerName(String singer) { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.audio.AbsBYDAutoAudioListener l) { throw new RuntimeException("Stub!"); }
}
