package com.aliyun.api.ecs.ecs20140526.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.RebootInstance.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RebootInstanceResponse extends AliyunResponse {

    private static final long serialVersionUID = 1789255246456162528L;

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
