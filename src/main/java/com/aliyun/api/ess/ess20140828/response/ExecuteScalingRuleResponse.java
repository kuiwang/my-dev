package com.aliyun.api.ess.ess20140828.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ess.aliyuncs.com.ExecuteScalingRule.2014-08-28 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ExecuteScalingRuleResponse extends AliyunResponse {

    private static final long serialVersionUID = 1511738472471399254L;

    /**
     * 1
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 伸缩活动id
     */
    @ApiField("ScalingActivityId")
    private String scalingActivityId;

    public String getRequestId() {
        return this.requestId;
    }

    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
    }

}
