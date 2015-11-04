package com.aliyun.api.ecs.ecs20130110.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.StopInstance.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class StopInstanceResponse extends AliyunResponse {

    private static final long serialVersionUID = 4799112328447397483L;

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
