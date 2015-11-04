package com.aliyun.api.mts.mts20140618.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.VideoTranscodeJob;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: mts.aliyuncs.com.QueryTranscodeJobList.2014-06-18 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class QueryTranscodeJobListResponse extends AliyunResponse {

    private static final long serialVersionUID = 7868939898824125453L;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 视频转码任务列表
     */
    @ApiListField("TranscodeJobs")
    @ApiField("VideoTranscodeJob")
    private List<VideoTranscodeJob> transcodeJobs;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setTranscodeJobs(List<VideoTranscodeJob> transcodeJobs) {
        this.transcodeJobs = transcodeJobs;
    }

    public List<VideoTranscodeJob> getTranscodeJobs() {
        return this.transcodeJobs;
    }

}
