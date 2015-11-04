package com.aliyun.api.ecs.ecs20130110.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.LeaveSecurityGroup.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class LeaveSecurityGroupResponse extends AliyunResponse {

    private static final long serialVersionUID = 8358512493822549983L;

    /**
     * 请求ID
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
