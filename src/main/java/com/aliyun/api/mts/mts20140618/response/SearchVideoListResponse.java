package com.aliyun.api.mts.mts20140618.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Video;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: mts.aliyuncs.com.SearchVideoList.2014-06-18 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SearchVideoListResponse extends AliyunResponse {

    private static final long serialVersionUID = 4664771887175268226L;

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
     * 视频列表
     */
    @ApiListField("VideoList")
    @ApiField("Video")
    private List<Video> videoList;

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setVideoList(List<Video> videoList) {
        this.videoList = videoList;
    }

    public List<Video> getVideoList() {
        return this.videoList;
    }

}
