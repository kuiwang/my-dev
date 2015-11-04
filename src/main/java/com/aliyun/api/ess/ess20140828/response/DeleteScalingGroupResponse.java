package com.aliyun.api.ess.ess20140828.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ess.aliyuncs.com.DeleteScalingGroup.2014-08-28 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DeleteScalingGroupResponse extends AliyunResponse {

    private static final long serialVersionUID = 3556948561289736135L;

    /**
     * RequestId
     */
    @ApiField("RequestId")
    private String requestId;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
