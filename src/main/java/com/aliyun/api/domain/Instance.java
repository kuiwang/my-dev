package com.aliyun.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 实例信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class Instance extends TaobaoObject {

    private static final long serialVersionUID = 5453189118186142865L;

    /**
     * 集群Id
     */
    @ApiField("ClusterId")
    private String clusterId;

    /**
     * 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 实例的描述
     */
    @ApiField("Description")
    private String description;

    /**
     * 绑定的Eip信息
     */
    @ApiField("EipAddress")
    private EipAddressAssignType eipAddress;

    /**
     * 实例机器名称
     */
    @ApiField("HostName")
    private String hostName;

    /**
     * 镜像ID
     */
    @ApiField("ImageId")
    private String imageId;

    /**
     * 实例的内网IP地址
     */
    @ApiListField("InnerIpAddress")
    @ApiField("IpAddress")
    private List<IpAddress> innerIpAddress;

    /**
     * 实例ID
     */
    @ApiField("InstanceId")
    private String instanceId;

    /**
     * 实例的显示名称
     */
    @ApiField("InstanceName")
    private String instanceName;

    /**
     * 实例网络类型，可选值Classic | Vpc
     */
    @ApiField("InstanceNetworkType")
    private String instanceNetworkType;

    /**
     * 实例资源规格
     */
    @ApiField("InstanceType")
    private String instanceType;

    /**
     * 网络计费类型
     */
    @ApiField("InternetChargeType")
    private String internetChargeType;

    /**
     * 公网入带宽最大值
     */
    @ApiField("InternetMaxBandwidthIn")
    private Long internetMaxBandwidthIn;

    /**
     * 公网出带宽最大值
     */
    @ApiField("InternetMaxBandwidthOut")
    private Long internetMaxBandwidthOut;

    /**
     * 锁定列表
     */
    @ApiListField("OperationLocks")
    @ApiField("LockReason")
    private List<LockReason> operationLocks;

    /**
     * 实例的公网IP地址
     */
    @ApiListField("PublicIpAddress")
    @ApiField("IpAddress")
    private List<IpAddress> publicIpAddress;

    /**
     * 实例所属地域ID
     */
    @ApiField("RegionId")
    private String regionId;

    /**
     * 实例所属安全组的集合
     */
    @ApiListField("SecurityGroupIds")
    @ApiField("SecurityGroupId")
    private List<SecurityGroupId> securityGroupIds;

    /**
     * 实例状态
     */
    @ApiField("Status")
    private String status;

    /**
     * 虚拟局域网Id
     */
    @ApiField("VlanId")
    private String vlanId;

    /**
     * VPC属性列表
     */
    @ApiField("VpcAttributes")
    private VpcAttribute vpcAttributes;

    /**
     * 实例所属可用区
     */
    @ApiField("ZoneId")
    private String zoneId;

    public String getClusterId() {
        return this.clusterId;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public String getDescription() {
        return this.description;
    }

    public EipAddressAssignType getEipAddress() {
        return this.eipAddress;
    }

    public String getHostName() {
        return this.hostName;
    }

    public String getImageId() {
        return this.imageId;
    }

    public List<IpAddress> getInnerIpAddress() {
        return this.innerIpAddress;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
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

    public List<LockReason> getOperationLocks() {
        return this.operationLocks;
    }

    public List<IpAddress> getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public List<SecurityGroupId> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public String getStatus() {
        return this.status;
    }

    public String getVlanId() {
        return this.vlanId;
    }

    public VpcAttribute getVpcAttributes() {
        return this.vpcAttributes;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEipAddress(EipAddressAssignType eipAddress) {
        this.eipAddress = eipAddress;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public void setInnerIpAddress(List<IpAddress> innerIpAddress) {
        this.innerIpAddress = innerIpAddress;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public void setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
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

    public void setOperationLocks(List<LockReason> operationLocks) {
        this.operationLocks = operationLocks;
    }

    public void setPublicIpAddress(List<IpAddress> publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setSecurityGroupIds(List<SecurityGroupId> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setVlanId(String vlanId) {
        this.vlanId = vlanId;
    }

    public void setVpcAttributes(VpcAttribute vpcAttributes) {
        this.vpcAttributes = vpcAttributes;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}
