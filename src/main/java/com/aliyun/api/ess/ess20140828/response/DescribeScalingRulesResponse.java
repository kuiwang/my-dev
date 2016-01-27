package com.aliyun.api.ess.ess20140828.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.ScalingRuleModel;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ess.aliyuncs.com.DescribeScalingRules.2014-08-28 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeScalingRulesResponse extends AliyunResponse {

    private static final long serialVersionUID = 8832836424577722837L;

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
     * 伸缩规则信息组成的集合
     */
    @ApiListField("ScalingRules")
    @ApiField("ScalingRuleModel")
    private List<ScalingRuleModel> scalingRules;

    /**
     * 伸缩规则总数
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

    public List<ScalingRuleModel> getScalingRules() {
        return this.scalingRules;
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

    public void setScalingRules(List<ScalingRuleModel> scalingRules) {
        this.scalingRules = scalingRules;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
