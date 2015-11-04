package com.aliyun.api.ess.ess20140828.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.ScalingInstanceModel;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ess.aliyuncs.com.DescribeScalingInstances.2014-08-28 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeScalingInstancesResponse extends AliyunResponse {

    private static final long serialVersionUID = 3884991122683814714L;

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
     * scalingInstances
     */
    @ApiListField("ScalingInstances")
    @ApiField("ScalingInstanceModel")
    private List<ScalingInstanceModel> scalingInstances;

    /**
     * TotalCount
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

    public void setScalingInstances(List<ScalingInstanceModel> scalingInstances) {
        this.scalingInstances = scalingInstances;
    }

    public List<ScalingInstanceModel> getScalingInstances() {
        return this.scalingInstances;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

}
