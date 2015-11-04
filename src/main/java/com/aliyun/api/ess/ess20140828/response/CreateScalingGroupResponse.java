package com.aliyun.api.ess.ess20140828.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ess.aliyuncs.com.CreateScalingGroup.2014-08-28 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateScalingGroupResponse extends AliyunResponse {

    private static final long serialVersionUID = 6813661354191356535L;

    /**
     * RequestId
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 伸缩组的ID
     */
    @ApiField("ScalingGroupId")
    private String scalingGroupId;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
