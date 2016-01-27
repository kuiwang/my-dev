package com.aliyun.api.ecs.ecs20130110.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.CreateSecurityGroup.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateSecurityGroupResponse extends AliyunResponse {

    private static final long serialVersionUID = 5458799357384441968L;

    /**
     * 请求的唯一ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 安全组ID
     */
    @ApiField("SecurityGroupId")
    private String securityGroupId;

    public String getRequestId() {
        return this.requestId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

}
