package com.aliyun.api.ecs.ecs20140526.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.RevokeSecurityGroup.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RevokeSecurityGroupResponse extends AliyunResponse {

    private static final long serialVersionUID = 6646871738177279367L;

    /**
     * 请求的ID,作为请求的唯一编号
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
