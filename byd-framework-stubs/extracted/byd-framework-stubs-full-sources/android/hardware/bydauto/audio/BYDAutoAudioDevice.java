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

    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int controlIflytek(int cmd) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_CMD_ARKAMYS_SOUNDSTAGE_MODE} (0x42b00015).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getArkamysMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_HAS_ARKAMYS_SOUNDSTAGE_MODE} (0xc2b00015).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getArkamysModeForLearn() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_CMD_ARKAMYS_SOUNDSTAGE_WOOFER} (0x42b0000e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getArkamysState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_MIC_AMP_GAIN} (0x42b00008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getAudioMicAmpGain() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_CMD_BEAM_FORM} (0x42b0001d).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getBeamForm() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_CHANNEL} (0x42100028).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getChannel() { throw new RuntimeException("Stub!"); }
    public int getDevicetype() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_DIRAC_LIVE_STAGE} (0x4210001c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDiracLiveMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_HAS_DIRAC_LIVE_STAGE} (0xc210001c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDiracLiveModeForLearn() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_DIRAC_LIVE} (0x4210001e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getDiracLiveState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_EQUALIZER_FREQUENCY_1} (0x4210002a), {@code AUDIO_EQUALIZER_FREQUENCY_2} (0x4210002f), {@code AUDIO_EQUALIZER_FREQUENCY_3} (0x42100034), {@code AUDIO_EQUALIZER_FREQUENCY_4} (0x42100039), {@code AUDIO_EQUALIZER_FREQUENCY_5} (0x4210003e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getEqualizer(int frequencyNum) { throw new RuntimeException("Stub!"); }
    public int[] getFeatureList() { throw new RuntimeException("Stub!"); }
    public String getGetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_IFLYTEK_FUNCTION_MODE} (0x42400008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getIflytekFunctionMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_IFLYTEK_WORK_MODE} (0x4240000b).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getIflytekWorkMode() { throw new RuntimeException("Stub!"); }
    public static synchronized android.hardware.bydauto.audio.BYDAutoAudioDevice getInstance(android.content.Context con) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_KARA_OK_EQ1} (0x42b00010), {@code AUDIO_KARA_OK_EQ2} (0x42b00018), {@code AUDIO_KARA_OK_EQ3} (0x42b00020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getKaraokeEqualizer(int EqualizerID) { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_LOUDNESS} (0x42100020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLoudnessState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_LOUDSPEAKER_NUM} (0x42100044).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getLoudspeakerNum() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_MUSIC_CHANGE_SOURCE} (0x9900004c).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMusicChangeSource() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_MUTE_STATUS} (0x4210000e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getMuteState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_NAVI_MUTE_STATUS} (0x42100023).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getNaviMuteState() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_NAVI_VOLUME} (0x42100024).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getNaviVolume() { throw new RuntimeException("Stub!"); }
    public String getSetPermission() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_SOUND_EFFECT} (0x42100018).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getSoundEffect() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_X_SOUND_FIELD} (0x42100010), {@code AUDIO_Y_SOUND_FIELD} (0x42100014).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int[] getSoundField() { throw new RuntimeException("Stub!"); }
    public int getType() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_VOLUME} (0x42100008).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getVolume() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_VOLUME_CTRL_MODE} (0x9900004e).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getVolumeCtrlMode() { throw new RuntimeException("Stub!"); }
    /**
     * Reads feature ID {@code AUDIO_VOLUME_SOURCE} (0x000a66a4).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int getVolumeSettingsource() { throw new RuntimeException("Stub!"); }
    public boolean postEvent(int device_type, int event_type, int value, Object data) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.audio.AbsBYDAutoAudioListener l) { throw new RuntimeException("Stub!"); }
    public void registerListener(android.hardware.bydauto.audio.AbsBYDAutoAudioListener l, int[] featureIDs) { throw new RuntimeException("Stub!"); }
    /** <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it. */
    @Deprecated
    public int reset(int item, int value) { throw new RuntimeException("Stub!"); }
    public int sendAudioPlayingTime(int playingHours, int playingMinutes, int playingSeconds) { throw new RuntimeException("Stub!"); }
    public int sendAudioTotalTime(int totalHours, int totalMinutes, int totalSeconds) { throw new RuntimeException("Stub!"); }
    public int sendSingerName(String singer) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_SPECTRUM_FREQ1_SET} (0x2e300008), {@code AUDIO_SPECTRUM_FREQ2_SET} (0x2e30000c), {@code AUDIO_SPECTRUM_FREQ3_SET} (0x2e300010), {@code AUDIO_SPECTRUM_FREQ4_SET} (0x2e300014), {@code AUDIO_SPECTRUM_FREQ5_SET} (0x2e300018), {@code AUDIO_SPECTRUM_FREQ6_SET} (0x2e30001c), {@code AUDIO_SPECTRUM_FREQ7_SET} (0x2e300020), {@code AUDIO_SPECTRUM_FREQ8_SET} (0x2e300024), {@code AUDIO_SPECTRUM_FREQ9_SET} (0x2e300028), {@code AUDIO_SPECTRUM_FREQ10_SET} (0x2e30002c), {@code AUDIO_SPECTRUM_FREQ11_SET} (0x2e300030), {@code AUDIO_SPECTRUM_FREQ12_SET} (0x2e300034), {@code AUDIO_SPECTRUM_FREQ13_SET} (0x2e300038), {@code AUDIO_SPECTRUM_FREQ14_SET} (0x2e30003c), {@code AUDIO_SPECTRUM_FREQ15_SET} (0x2e300040), {@code AUDIO_SPECTRUM_FREQ16_SET} (0x2e300044).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAmbientLightFreq(int[] value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_CMD_ARKAMYS_SOUNDSTAGE_MODE_SET} (0x4e06b010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setArkamysMode(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_CMD_ARKAMYS_SOUNDSTAGE_WOOFER_SET} (0x4e06b020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setArkamysState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_MIC_AMP_GAIN_SET} (0x4e068010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setAudioMicAmpGain(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_CMD_BEAM_FORM_SET} (0x4e06e010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setBeamForm(int form) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_CHANNEL_SET} (0x4e091010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setChannel(int channelId) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_DIRAC_LIVE_STAGE_SET} (0x4e0b0010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setDiracLiveMode(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_DIRAC_LIVE_SET} (0x4e06a010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setDiracLiveState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_EQUALIZER_FREQUENCY_1_SET} (0x4e066010), {@code AUDIO_EQUALIZER_FREQUENCY_2_SET} (0x4e066018), {@code AUDIO_EQUALIZER_FREQUENCY_3_SET} (0x4e066020), {@code AUDIO_EQUALIZER_FREQUENCY_4_SET} (0x4e066028), {@code AUDIO_EQUALIZER_FREQUENCY_5_SET} (0x4e066030).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setEqualizer(int frequencyNum, int percent) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_IFLYTEK_FUNCTION_MODE_SET} (0x4e081010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setIflytekFunctionMode(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_IFLYTEK_WORK_MODE_SET} (0x4e082010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setIflytekWorkMode(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_KARA_OK_EQ1_SET} (0x4e069010), {@code AUDIO_KARA_OK_EQ2_SET} (0x4e069018), {@code AUDIO_KARA_OK_EQ3_SET} (0x4e069020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setKaraokeEqualizer(int EqualizerID, int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_ARAOKE_MODE_SET} (0x4e093010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setKaraokeMode(int mode) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_LOUDNESS_SET} (0x4e06c010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setLoudnessState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_MUSIC_CHANGE_SOURCE_SET} (0xaa000043).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setMusicChangeSource(int source) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_MUTE_STATUS_SET} (0x4e062010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setMuteState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_NAVI_MUTE_STATUS_SET} (0x4e06d010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setNaviMuteState(int state) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_NAVI_VOLUME_SET} (0x4e070010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setNaviVolume(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_SOUND_EFFECT_SET} (0x4e067010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setSoundEffect(int effect) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_X_SOUND_FIELD_SET} (0x4e065010), {@code AUDIO_Y_SOUND_FIELD_SET} (0x4e065020).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setSoundField(int x, int y) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_VOLUME_SET} (0x4e061010).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setVolume(int value) { throw new RuntimeException("Stub!"); }
    /**
     * Writes feature ID {@code AUDIO_VOLUME_SOURCE} (0x000a66a4).
     * <b>Hidden API (blacklist):</b> normal apps get NoSuchMethodError / NoSuchFieldError; only system/platform apps, or a device with hidden_api_policy relaxed, can use it.
     */
    @Deprecated
    public int setVolumeSettingsource() { throw new RuntimeException("Stub!"); }
    public void unregisterListener(android.hardware.bydauto.audio.AbsBYDAutoAudioListener l) { throw new RuntimeException("Stub!"); }
}
