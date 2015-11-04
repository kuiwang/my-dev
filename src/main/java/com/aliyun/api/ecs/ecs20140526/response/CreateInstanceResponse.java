package com.aliyun.api.ecs.ecs20140526.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.CreateInstance.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateInstanceResponse extends AliyunResponse {

    private static final long serialVersionUID = 6795767681574494525L;

    /**
     * 实例ID
     */
    @ApiField("InstanceId")
    private String instanceId;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
