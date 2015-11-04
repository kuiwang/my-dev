package com.aliyun.api.ecs.ecs20130110.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.AuthorizeSecurityGroup.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AuthorizeSecurityGroupResponse extends AliyunResponse {

    private static final long serialVersionUID = 7168898362685477123L;

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
