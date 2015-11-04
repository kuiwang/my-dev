package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 转码模板结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class TranscodeTemplate extends TaobaoObject {

    private static final long serialVersionUID = 6854754393428139698L;

    /**
     * 音频编解码配置
     */
    @ApiField("AudioCodecConfiguration")
    private AudioCodecConfiguration audioCodecConfiguration;

    /**
     * 适合的带宽
     */
    @ApiField("BandWidth")
    private String bandWidth;

    /**
     * 容器
     */
    @ApiField("Container")
    private Container container;

    /**
     * 模板描述
     */
    @ApiField("TemplateDescription")
    private String templateDescription;

    /**
     * 转码模板ID
     */
    @ApiField("TemplateId")
    private String templateId;

    /**
     * 模板名称
     */
    @ApiField("TemplateName")
    private String templateName;

    /**
     * 模板类型，范围System|User
     */
    @ApiField("TemplateType")
    private String templateType;

    /**
     * 视频编解码配置
     */
    @ApiField("VideoCodecConfiguration")
    private VideoCodecConfiguration videoCodecConfiguration;

    public AudioCodecConfiguration getAudioCodecConfiguration() {
        return this.audioCodecConfiguration;
    }

    public void setAudioCodecConfiguration(AudioCodecConfiguration audioCodecConfiguration) {
        this.audioCodecConfiguration = audioCodecConfiguration;
    }

    public String getBandWidth() {
        return this.bandWidth;
    }

    public void setBandWidth(String bandWidth) {
        this.bandWidth = bandWidth;
    }

    public Container getContainer() {
        return this.container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public String getTemplateDescription() {
        return this.templateDescription;
    }

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateType() {
        return this.templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public VideoCodecConfiguration getVideoCodecConfiguration() {
        return this.videoCodecConfiguration;
    }

    public void setVideoCodecConfiguration(VideoCodecConfiguration videoCodecConfiguration) {
        this.videoCodecConfiguration = videoCodecConfiguration;
    }

}
