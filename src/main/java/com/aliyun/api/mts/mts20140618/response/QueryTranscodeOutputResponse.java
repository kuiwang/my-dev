package com.aliyun.api.mts.mts20140618.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.TranscodeOutput;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: mts.aliyuncs.com.QueryTranscodeOutput.2014-06-18 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class QueryTranscodeOutputResponse extends AliyunResponse {

    private static final long serialVersionUID = 3775855964529894226L;

    /**
     * RequestId
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 转码输出列表
     */
    @ApiListField("TranscodeOutputs")
    @ApiField("TranscodeOutput")
    private List<TranscodeOutput> transcodeOutputs;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setTranscodeOutputs(List<TranscodeOutput> transcodeOutputs) {
        this.transcodeOutputs = transcodeOutputs;
    }

    public List<TranscodeOutput> getTranscodeOutputs() {
        return this.transcodeOutputs;
    }

}
