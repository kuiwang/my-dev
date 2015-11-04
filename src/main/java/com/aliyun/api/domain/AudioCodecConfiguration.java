package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 音频编解码配置
 *
 * @author auto create
 * @since 1.0, null
 */
public class AudioCodecConfiguration extends TaobaoObject {

    private static final long serialVersionUID = 4113313353796989488L;

    /**
     * 输出文件的音频码率，范围Auto|[8,1000],单位KB/S
     */
    @ApiField("BitRate")
    private String bitRate;

    /**
     * 声道数，范围Auto|0|1|2|3|4|5|6|7|8，最多7.1声道
     */
    @ApiField("Channels")
    private String channels;

    /**
     * 音频编解码标准，取值范围AAC|mp3
     */
    @ApiField("Codec")
    private String codec;

    /**
     * 采样率，范围Auto|22050|32000|44100|48000|96000
     */
    @ApiField("Freq")
    private String freq;

    public String getBitRate() {
        return this.bitRate;
    }

    public void setBitRate(String bitRate) {
        this.bitRate = bitRate;
    }

    public String getChannels() {
        return this.channels;
    }

    public void setChannels(String channels) {
        this.channels = channels;
    }

    public String getCodec() {
        return this.codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public String getFreq() {
        return this.freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

}
