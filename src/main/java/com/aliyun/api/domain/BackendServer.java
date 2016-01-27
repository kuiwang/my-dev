package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * SLB实例内多个后端服务器的信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class BackendServer extends TaobaoObject {

    private static final long serialVersionUID = 5793728683875152219L;

    /**
     * 后端服务器的健康状况，normal,abnormal或unavailable。 normal表示状态为健康；
     * abnormal表示状态为不健康；
     * unavailable表示未能完成健康检查，具体原因可能是：未开启健康检查、因故未能正常触发健康检查。
     * 针对最后一种情况，需要与我们取得联系确认原因。
     */
    @ApiField("ServerHealthStatus")
    private String serverHealthStatus;

    /**
     * 后端服务器名称Id，为ECS实例Id
     */
    @ApiField("ServerId")
    private String serverId;

    /**
     * 后端服务器的权重
     */
    @ApiField("Weight")
    private Long weight;

    public String getServerHealthStatus() {
        return this.serverHealthStatus;
    }

    public String getServerId() {
        return this.serverId;
    }

    public Long getWeight() {
        return this.weight;
    }

    public void setServerHealthStatus(String serverHealthStatus) {
        this.serverHealthStatus = serverHealthStatus;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

}
