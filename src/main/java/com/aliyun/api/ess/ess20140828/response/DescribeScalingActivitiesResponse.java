package com.aliyun.api.ess.ess20140828.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.ScalingActivityModel;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ess.aliyuncs.com.DescribeScalingActivities.2014-08-28 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeScalingActivitiesResponse extends AliyunResponse {

    private static final long serialVersionUID = 4622431521819967388L;

    /**
     * PageNumber
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * PageSize
     */
    @ApiField("PageSize")
    private Long pageSize;

    /**
     * RequestId
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 伸缩活动信息组成的集合
     */
    @ApiListField("ScalingActivities")
    @ApiField("ScalingActivityModel")
    private List<ScalingActivityModel> scalingActivities;

    /**
     * 伸缩活动总数
     */
    @ApiField("TotalCount")
    private Long totalCount;

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public List<ScalingActivityModel> getScalingActivities() {
        return this.scalingActivities;
    }

    public Long getTotalCount() {
        return this.totalCount;
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

    public void setScalingActivities(List<ScalingActivityModel> scalingActivities) {
        this.scalingActivities = scalingActivities;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
