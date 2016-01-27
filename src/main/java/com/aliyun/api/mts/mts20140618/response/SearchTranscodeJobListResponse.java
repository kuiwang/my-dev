package com.aliyun.api.mts.mts20140618.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.VideoTranscodeJob;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: mts.aliyuncs.com.SearchTranscodeJobList.2014-06-18 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SearchTranscodeJobListResponse extends AliyunResponse {

    private static final long serialVersionUID = 2382694381642347959L;

    /**
     * 当前页面
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 分页查询时设置的每页行数
     */
    @ApiField("PageSize")
    private Long pageSize;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 总数
     */
    @ApiField("TotalCount")
    private Long totalCount;

    /**
     * 视频转码任务列表
     */
    @ApiListField("TranscodeJobs")
    @ApiField("VideoTranscodeJob")
    private List<VideoTranscodeJob> transcodeJobs;

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public List<VideoTranscodeJob> getTranscodeJobs() {
        return this.transcodeJobs;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public void setTranscodeJobs(List<VideoTranscodeJob> transcodeJobs) {
        this.transcodeJobs = transcodeJobs;
    }

}
