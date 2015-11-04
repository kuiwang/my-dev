package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 视频资源
 *
 * @author auto create
 * @since 1.0, null
 */
public class TranscodeOutput extends TaobaoObject {

    private static final long serialVersionUID = 8577386872578788849L;

    /**
     * 转码成功后输出文件地址
     */
    @ApiField("OutputFileUrl")
    private String outputFileUrl;

    /**
     * 转码模板ID
     */
    @ApiField("TemplateId")
    private String templateId;

    /**
     * 视频固有特征信息
     */
    @ApiField("VideoFeatures")
    private VideoFeatures videoFeatures;

    public String getOutputFileUrl() {
        return this.outputFileUrl;
    }

    public void setOutputFileUrl(String outputFileUrl) {
        this.outputFileUrl = outputFileUrl;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public VideoFeatures getVideoFeatures() {
        return this.videoFeatures;
    }

    public void setVideoFeatures(VideoFeatures videoFeatures) {
        this.videoFeatures = videoFeatures;
    }

}
