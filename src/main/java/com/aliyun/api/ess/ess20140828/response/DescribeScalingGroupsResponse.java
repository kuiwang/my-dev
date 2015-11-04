package com.aliyun.api.ess.ess20140828.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.ScalingGroupModel;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ess.aliyuncs.com.DescribeScalingGroups.2014-08-28 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeScalingGroupsResponse extends AliyunResponse {

    private static final long serialVersionUID = 1784467987572713331L;

    /**
     * 页数
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 每页最大行数，默认10行，最大值50行
     */
    @ApiField("PageSize")
    private Long pageSize;

    /**
     * RequestId
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 伸缩组信息组成的集合
     */
    @ApiListField("ScalingGroups")
    @ApiField("ScalingGroupModel")
    private List<ScalingGroupModel> scalingGroups;

    /**
     * 伸缩组总数
     */
    @ApiField("TotalCount")
    private Long totalCount;

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

    public void setScalingGroups(List<ScalingGroupModel> scalingGroups) {
        this.scalingGroups = scalingGroups;
    }

    public List<ScalingGroupModel> getScalingGroups() {
        return this.scalingGroups;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

}
