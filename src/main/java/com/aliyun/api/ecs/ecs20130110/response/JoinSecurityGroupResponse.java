package com.aliyun.api.ecs.ecs20130110.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.JoinSecurityGroup.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JoinSecurityGroupResponse extends AliyunResponse {

    private static final long serialVersionUID = 2271445345996719861L;

    /**
     * 请求的唯一ID
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