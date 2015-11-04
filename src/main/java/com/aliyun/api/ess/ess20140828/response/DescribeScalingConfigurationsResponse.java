package com.aliyun.api.ess.ess20140828.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.ScalingConfigurationModel;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ess.aliyuncs.com.DescribeScalingConfigurations.2014-08-28
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeScalingConfigurationsResponse extends AliyunResponse {

    private static final long serialVersionUID = 5889553478222441354L;

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
     * 伸缩配置信息组成的集合
     */
    @ApiListField("ScalingConfigurations")
    @ApiField("ScalingConfigurationModel")
    private List<ScalingConfigurationModel> scalingConfigurations;

    /**
     * 伸缩规则总数
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

    public void setScalingConfigurations(List<ScalingConfigurationModel> scalingConfigurations) {
        this.scalingConfigurations = scalingConfigurations;
    }

    public List<ScalingConfigurationModel> getScalingConfigurations() {
        return this.scalingConfigurations;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

}
