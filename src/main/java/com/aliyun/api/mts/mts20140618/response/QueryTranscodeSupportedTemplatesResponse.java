package com.aliyun.api.mts.mts20140618.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.TranscodeTemplate;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: mts.aliyuncs.com.QueryTranscodeSupportedTemplates.2014-06-18
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class QueryTranscodeSupportedTemplatesResponse extends AliyunResponse {

    private static final long serialVersionUID = 7133925114364681715L;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 预处理状态，Preprocessing表示正在预处理中，PreprocessSuccess表示预处理完成，
     * PreprocessFail表示视频预处理失败
     */
    @ApiField("Status")
    private String status;

    /**
     * 视频预处理成功时返回的推荐模板，其余状态都返回NULL
     */
    @ApiListField("TranscodeTemplates")
    @ApiField("TranscodeTemplate")
    private List<TranscodeTemplate> transcodeTemplates;

    public String getRequestId() {
        return this.requestId;
    }

    public String getStatus() {
        return this.status;
    }

    public List<TranscodeTemplate> getTranscodeTemplates() {
        return this.transcodeTemplates;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTranscodeTemplates(List<TranscodeTemplate> transcodeTemplates) {
        this.transcodeTemplates = transcodeTemplates;
    }

}
