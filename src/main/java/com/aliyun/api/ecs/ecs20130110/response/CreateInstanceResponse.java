package com.aliyun.api.ecs.ecs20130110.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.CreateInstance.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateInstanceResponse extends AliyunResponse {

    private static final long serialVersionUID = 1334137651372241358L;

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

    /**
     * 云服务器所属于的可用区
     */
    @ApiField("ZoneId")
    private String zoneId;

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

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

}
