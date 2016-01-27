package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 返回的ECS实例的状态信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class InstanceStatus extends TaobaoObject {

    private static final long serialVersionUID = 1274666636182621195L;

    /**
     * 实例ID
     */
    @ApiField("InstanceId")
    private String instanceId;

    /**
     * 实例状态
     */
    @ApiField("Status")
    private String status;

    public String getInstanceId() {
        return this.instanceId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
