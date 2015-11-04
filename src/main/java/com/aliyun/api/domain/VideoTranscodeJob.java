package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 视频转码任务
 *
 * @author auto create
 * @since 1.0, null
 */
public class VideoTranscodeJob extends TaobaoObject {

    private static final long serialVersionUID = 1727724593627138175L;

    /**
     * 转码任务ID
     */
    @ApiField("JobId")
    private String jobId;

    /**
     * 视频ID
     */
    @ApiField("MediaId")
    private String mediaId;

    /**
     * 转码进度0~100
     */
    @ApiField("Percent")
    private Long percent;

    /**
     * 转码任务状态：Queuing表示排队中，Transcoding表示转码中，TranscodeSuccess表示转码成功，
     * TranscodeFail表示转码失败，TranscodeCancelled表示转码取消
     */
    @ApiField("State")
    private String state;

    /**
     * 转码模板ID
     */
    @ApiField("TemplateId")
    private String templateId;

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public Long getPercent() {
        return this.percent;
    }

    public void setPercent(Long percent) {
        this.percent = percent;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

}
