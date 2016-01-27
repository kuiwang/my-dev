package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * com.aliyun.ess.coordinator.model.ScalingInstanceModel
 *
 * @author auto create
 * @since 1.0, null
 */
public class ScalingInstanceModel extends TaobaoObject {

    private static final long serialVersionUID = 3342781551164768814L;

    /**
     * 实例的创建时间。 按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 实例由哪个系统创建，取值：AutoCreated, Attached
     */
    @ApiField("CreationType")
    private String creationType;

    /**
     * Healthy 或 Unhealthy
     */
    @ApiField("HealthStatus")
    private String healthStatus;

    /**
     * ECS实例ID
     */
    @ApiField("InstanceId")
    private String instanceId;

    /**
     * Pending | InService | Removing
     */
    @ApiField("LifecycleState")
    private String lifecycleState;

    /**
     * 关联的伸缩配置Id。
     */
    @ApiField("ScalingConfigurationId")
    private String scalingConfigurationId;

    /**
     * 伸缩组的ID
     */
    @ApiField("ScalingGroupId")
    private String scalingGroupId;

    public String getCreationTime() {
        return this.creationTime;
    }

    public String getCreationType() {
        return this.creationType;
    }

    public String getHealthStatus() {
        return this.healthStatus;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public String getLifecycleState() {
        return this.lifecycleState;
    }

    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public void setCreationType(String creationType) {
        this.creationType = creationType;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    public void setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

}
