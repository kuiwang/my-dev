package com.aliyun.api.mts.mts20140618.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.VideoTranscodeJob;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: mts.aliyuncs.com.QueryTranscodeJobListByIds.2014-06-18
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class QueryTranscodeJobListByIdsResponse extends AliyunResponse {

    private static final long serialVersionUID = 6634462478286298377L;

    /**
     * 不存在的视频ID列表
     */
    @ApiListField("NonExistMids")
    @ApiField("String")
    private List<String> nonExistMids;

    /**
     * 不属于用户的视频ID列表
     */
    @ApiListField("PermissionDeniedMids")
    @ApiField("String")
    private List<String> permissionDeniedMids;

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

    public List<String> getNonExistMids() {
        return this.nonExistMids;
    }

    public List<String> getPermissionDeniedMids() {
        return this.permissionDeniedMids;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public List<VideoTranscodeJob> getTranscodeJobs() {
        return this.transcodeJobs;
    }

    public void setNonExistMids(List<String> nonExistMids) {
        this.nonExistMids = nonExistMids;
    }

    public void setPermissionDeniedMids(List<String> permissionDeniedMids) {
        this.permissionDeniedMids = permissionDeniedMids;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setTranscodeJobs(List<VideoTranscodeJob> transcodeJobs) {
        this.transcodeJobs = transcodeJobs;
    }

}
