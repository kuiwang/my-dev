package com.aliyun.api.ess.ess20140828.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ess.ess20140828.response.CreateScalingConfigurationResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ess.aliyuncs.com.CreateScalingConfiguration.2014-08-28 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:40
 */
public class CreateScalingConfigurationRequest implements
        AliyunRequest<CreateScalingConfigurationResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 镜像文件ID，表示启动实例时选择的镜像资源
     */
    private String imageId;

    /**
     * 实例的资源规则。
     */
    private String instanceType;

    /**
     * 公网出带宽最大值，单位为Mbps(Mega bit per second)，取值范围： 按带宽计费：[1,5]
     * 按流量计费：[1,100] 如果客户不指定，API将自动将出带宽设置成0Mbps。
     * 当InternetMaxBandwidthOut的值为0时，该ECS仅会被分配内网ip，不会被分配外网ip。
     * 当InternetMaxBandwidthOut的值大于0时，该ECS将会被分配内网ip和外网ip。
     * 如果需要可以通过阿里云工单系统申请将带宽范围设置成1~200Mbps。
     */
    private String internetChargeType;

    /**
     * 公网出带宽最大值，单位为Mbps(Mega bit per second)，取值范围： 按带宽计费：[1,5]
     * 按流量计费：[1,100] 如果客户不指定，API将自动将出带宽设置成0Mbps。
     * 当InternetMaxBandwidthOut的值为0时，该ECS仅会被分配内网ip，不会被分配外网ip。
     * 当InternetMaxBandwidthOut的值大于0时，该ECS将会被分配内网ip和外网ip。
     * 如果需要可以通过阿里云工单系统申请将带宽范围设置成1~200Mbps。
     */
    private Long internetMaxBandwidthIn;

    /**
     * 公网出带宽最大值，单位为Mbps(Mega bit per second)，取值范围： 按带宽计费：[1,5]
     * 按流量计费：[1,100] 如果客户不指定，API将自动将出带宽设置成0Mbps。
     * 当InternetMaxBandwidthOut的值为0时，该ECS仅会被分配内网ip，不会被分配外网ip。
     * 当InternetMaxBandwidthOut的值大于0时，该ECS将会被分配内网ip和外网ip。
     * 如果需要可以通过阿里云工单系统申请将带宽范围设置成1~200Mbps。
     */
    private Long internetMaxBandwidthOut;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * Scaling Group关联的Scaling Configuration名称。同一用户账号，同一region，同一伸缩组下唯一。
     * 如果没有指定该参数，默认值为实例的ScalingConfigurationId 英文或中文字符为2-40
     * 个字符（中英文长度一样），以大小字母或中文开头，可包含数字，"_"或"-"。
     */
    private String scalingConfigurationName;

    /**
     * ScalingGroupId
     */
    private String scalingGroupId;

    /**
     * 指定新创建实例所属于的安全组代码，同一个安全组内的实例之间可以互相访问。
     */
    private String securityGroupId;

    /**
     * 镜像文件ID，表示启动实例时选择的镜像资源
     */
    private String systemDiskCategory;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(imageId, "imageId");
        RequestCheckUtils.checkNotEmpty(instanceType, "instanceType");
        RequestCheckUtils.checkNotEmpty(scalingGroupId, "scalingGroupId");
        RequestCheckUtils.checkNotEmpty(securityGroupId, "securityGroupId");
    }

    @Override
    public String getApiMethodName() {
        return "ess.aliyuncs.com.CreateScalingConfiguration.2014-08-28";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getImageId() {
        return this.imageId;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public Long getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public Long getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    @Override
    public Class<CreateScalingConfigurationResponse> getResponseClass() {
        return CreateScalingConfigurationResponse.class;
    }

    public String getScalingConfigurationName() {
        return this.scalingConfigurationName;
    }

    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("ImageId", this.imageId);
        txtParams.put("InstanceType", this.instanceType);
        txtParams.put("InternetChargeType", this.internetChargeType);
        txtParams.put("InternetMaxBandwidthIn", this.internetMaxBandwidthIn);
        txtParams.put("InternetMaxBandwidthOut", this.internetMaxBandwidthOut);
        txtParams.put("ScalingConfigurationName", this.scalingConfigurationName);
        txtParams.put("ScalingGroupId", this.scalingGroupId);
        txtParams.put("SecurityGroupId", this.securityGroupId);
        txtParams.put("SystemDisk.Category", this.systemDiskCategory);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public void setInternetMaxBandwidthIn(Long internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
    }

    public void setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public void setScalingConfigurationName(String scalingConfigurationName) {
        this.scalingConfigurationName = scalingConfigurationName;
    }

    public void setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public void setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
