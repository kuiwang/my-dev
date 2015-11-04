package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * com.aliyun.ess.coordinator.model.ScalingConfigurationModel
 *
 * @author auto create
 * @since 1.0, null
 */
public class ScalingConfigurationModel extends TaobaoObject {

    private static final long serialVersionUID = 1532417718761114291L;

    /**
     * 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 镜像文件ID，表示启动实例时选择的镜像资源
     */
    @ApiField("ImageId")
    private String imageId;

    /**
     * 实例的资源规则。 ecs.t1.xsmall ecs.t1.small ecs.s1.small ecs.s1.medium
     * ecs.s2.small ecs.s2.large ecs.s2.xlarge ecs.s3.medium ecs.s3.large
     * ecs.m1.medium ecs.m1.xlarge ecs.c1.small ecs.c1.large ecs.c2.xlarge
     */
    @ApiField("InstanceType")
    private String instanceType;

    /**
     * 网络计费类型，按流量计费还是按固定带宽计费。 可选值： PayByBandwidth PayByTraffic
     */
    @ApiField("InternetChargeType")
    private String internetChargeType;

    /**
     * 公网入带宽最大值，单位为Mbps(Mega bit per second)，取值范围：[1,200]
     */
    @ApiField("InternetMaxBandwidthIn")
    private Long internetMaxBandwidthIn;

    /**
     * 公网出带宽最大值，单位为Mbps(Mega bit per second)，取值范围： 按带宽计费：[1,5]
     * 按流量计费：[1,100]
     */
    @ApiField("InternetMaxBandwidthOut")
    private Long internetMaxBandwidthOut;

    /**
     * Active或Inactive
     */
    @ApiField("LifecycleState")
    private String lifecycleState;

    /**
     * 伸缩配置的ID
     */
    @ApiField("ScalingConfigurationId")
    private String scalingConfigurationId;

    /**
     * Scaling Group关联的Scaling Configuration名称。
     */
    @ApiField("ScalingConfigurationName")
    private String scalingConfigurationName;

    /**
     * 伸缩组Id
     */
    @ApiField("ScalingGroupId")
    private String scalingGroupId;

    /**
     * 指定新创建实例所属于的安全组代码，同一个安全组内的实例之间可以互相访问。
     */
    @ApiField("SecurityGroupId")
    private String securityGroupId;

    /**
     * 系统盘的磁盘种类：云磁盘（cloud）或临时磁盘（ephemeral） 可选值： cloud ephemeral
     */
    @ApiField("SystemDiskCategory")
    private String systemDiskCategory;

    public String getCreationTime() {
        return this.creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public Long getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public void setInternetMaxBandwidthIn(Long internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
    }

    public Long getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public void setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
    }

    public String getLifecycleState() {
        return this.lifecycleState;
    }

    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public void setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
    }

    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    public void setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
    }

    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public void setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
    }

}
