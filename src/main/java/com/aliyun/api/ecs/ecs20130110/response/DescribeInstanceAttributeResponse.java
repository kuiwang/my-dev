package com.aliyun.api.ecs.ecs20130110.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.IpAddress;
import com.aliyun.api.domain.SecurityGroupId;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeInstanceAttribute.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeInstanceAttributeResponse extends AliyunResponse {

    private static final long serialVersionUID = 1874745871114631466L;

    /**
     * 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("CreationTime")
    private String creationTime;

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
     * 实例资源规格
     */
    @ApiField("InstanceType")
    private String instanceType;

    /**
     * 网络计费类型，PayByBandwidth |
     * PayByTraffic两个值中的一个。预付费实例显示PayByBandwidth（按带宽计费）。 PayByTraffic：按流量计费
     * PayByBandwidth：按带宽计费
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
     * 请求的唯一ID
     */
    @ApiField("RequestId")
    private String requestId;

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
     * 虚拟局域网ID
     */
    @ApiField("VlanId")
    private String vlanId;

    /**
     * 云服务器所属于的可用区
     */
    @ApiField("ZoneId")
    private String zoneId;

    public String getCreationTime() {
        return this.creationTime;
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

    public List<IpAddress> getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public String getRequestId() {
        return this.requestId;
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

    public String getZoneId() {
        return this.zoneId;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
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

    public void setPublicIpAddress(List<IpAddress> publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}
