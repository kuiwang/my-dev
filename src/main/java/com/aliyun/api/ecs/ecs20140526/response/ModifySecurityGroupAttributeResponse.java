package com.aliyun.api.ecs.ecs20140526.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.ModifySecurityGroupAttribute.2014-05-26
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ModifySecurityGroupAttributeResponse extends AliyunResponse {

    private static final long serialVersionUID = 3537235375885493397L;

    /**
     * 请求id
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
