package com.aliyun.api.mts.mts20140618.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: mts.aliyuncs.com.CreateTranscodeJob.2014-06-18 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateTranscodeJobResponse extends AliyunResponse {

    private static final long serialVersionUID = 5651657929898351682L;

    /**
     * 转码任务ID
     */
    @ApiField("JobId")
    private String jobId;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
