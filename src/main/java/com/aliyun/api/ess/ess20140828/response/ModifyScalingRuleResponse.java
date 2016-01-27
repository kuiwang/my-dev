package com.aliyun.api.ess.ess20140828.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ess.aliyuncs.com.ModifyScalingRule.2014-08-28 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ModifyScalingRuleResponse extends AliyunResponse {

    private static final long serialVersionUID = 6873963318529683462L;

    /**
     * RequestId
     */
    @ApiField("RequestId")
    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
