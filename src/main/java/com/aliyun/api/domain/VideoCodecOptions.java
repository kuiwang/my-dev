package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 视频编解码选项
 *
 * @author auto create
 * @since 1.0, null
 */
public class VideoCodecOptions extends TaobaoObject {

    private static final long serialVersionUID = 8898327437817295115L;

    /**
     * 视频输出文件的码率，范围[50,10000]，单位KB/S
     */
    @ApiField("BitRate")
    private String bitRate;

    /**
     * 恒定码率质量控制因子，取值范围[0 51]|Auto，如果为Auto则BitRate的设置失效
     */
    @ApiField("CRF")
    private String cRF;

    /**
     * 帧率，取值范围(0，60]
     */
    @ApiField("Fps")
    private String fps;

    /**
     * 高，范围(0,2000]
     */
    @ApiField("Height")
    private String height;

    /**
     * 关键帧间最大帧数，取值范围(0,GOPsize), GOPsize<300*FrameRate
     */
    @ApiField("KeyInt")
    private String keyInt;

    /**
     * 编码级别，取值范围baseline|main|high，默认high profile, main/baseline
     * profile针对中低端移动设备
     */
    @ApiField("Profile")
    private String profile;

    /**
     * 宽，范围(0,4000]
     */
    @ApiField("Width")
    private String width;

    public String getBitRate() {
        return this.bitRate;
    }

    public String getcRF() {
        return this.cRF;
    }

    public String getFps() {
        return this.fps;
    }

    public String getHeight() {
        return this.height;
    }

    public String getKeyInt() {
        return this.keyInt;
    }

    public String getProfile() {
        return this.profile;
    }

    public String getWidth() {
        return this.width;
    }

    public void setBitRate(String bitRate) {
        this.bitRate = bitRate;
    }

    public void setcRF(String cRF) {
        this.cRF = cRF;
    }

    public void setFps(String fps) {
        this.fps = fps;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setKeyInt(String keyInt) {
        this.keyInt = keyInt;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setWidth(String width) {
        this.width = width;
    }

}
