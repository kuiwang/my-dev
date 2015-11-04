package com.aliyun.api.ess.ess20140828.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ess.aliyuncs.com.CreateScalingRule.2014-08-28 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateScalingRuleResponse extends AliyunResponse {

    private static final long serialVersionUID = 6497816346568311874L;

    /**
     * RequestId
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 伸缩规则的唯一标识符
     */
    @ApiField("ScalingRuleAri")
    private String scalingRuleAri;

    /**
     * 伸缩规则的ID
     */
    @ApiField("ScalingRuleId")
    private String scalingRuleId;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setScalingRuleAri(String scalingRuleAri) {
        this.scalingRuleAri = scalingRuleAri;
    }

    public String getScalingRuleAri() {
        return this.scalingRuleAri;
    }

    public void setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
    }

    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

}
