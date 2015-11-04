package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.CreateInstanceResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.CreateInstance.2014-05-26 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:34
 */
public class CreateInstanceRequest implements AliyunRequest<CreateInstanceResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的ID */
    private String ownerId;

    /** 仅用于渠道商发起API调用时，指定访问的资源拥有者的账号 */
    private String ownerAccount;

    /**
     * API调用者试图通过API调用来访问别人拥有但已经授权给他的资源时，通过使用该参数来声明此次操作涉及到的资源是谁名下的,
     * 该参数仅官网用户可用
     */
    private String resourceOwnerAccount;

    /**
     * 用于保证请求的幂等性。由客户端生成该参数值，要保证在不同请求间唯一，最大不值过64个ASCII字符。 具体参见附录：如何保证幂等性。
     */
    private String clientToken;

    /**
     * 数据盘1类型。
     */
    private String dataDisk1Category;

    /**
     * 数据盘名称，不填则为空，默认值为空，[0,128]英文或中文字符，磁盘名称会展示在控制台。不能以http://和https://开头。
     */
    private String dataDisk1Description;

    /**
     * 空表示由系统默认分配，/dev/xvdb/开始到/dev/xvdz/
     */
    private String dataDisk1Device;

    /**
     * 数据盘名称，不填则为空，默认值为空，[0,128]英文或中文字符，磁盘名称会展示在控制台。不能以http://和https://开头。
     */
    private String dataDisk1DiskName;

    /**
     * 数据盘1大小
     */
    private Long dataDisk1Size;

    /**
     * 数据盘1快照
     */
    private String dataDisk1SnapshotId;

    /**
     * 数据盘2类型
     */
    private String dataDisk2Category;

    /**
     * 数据盘描述，不填则为空，默认值为空，[0,256]英文或中文字符，磁盘描述会展示在控制台。不能以http://和https://开头。
     */
    private String dataDisk2Description;

    /**
     * 空表示由系统默认分配，/dev/xvdb/开始到/dev/xvdz/
     */
    private String dataDisk2Device;

    /**
     * 数据盘名称，不填则为空，默认值为空，[0,128]英文或中文字符，磁盘名称会展示在控制台。不能以http://和https://开头。
     */
    private String dataDisk2DiskName;

    /**
     * 数据盘2大小
     */
    private Long dataDisk2Size;

    /**
     * 数据盘2快照
     */
    private String dataDisk2SnapshotId;

    /**
     * 数据盘3类型
     */
    private String dataDisk3Category;

    /**
     * 数据盘描述，不填则为空，默认值为空，[0,256]英文或中文字符，磁盘描述会展示在控制台。不能以http://和https://开头。
     */
    private String dataDisk3Description;

    /**
     * 空表示由系统默认分配，/dev/xvdb/开始到/dev/xvdz/
     */
    private String dataDisk3Device;

    /**
     * 数据盘名称，不填则为空，默认值为空，[0,128]英文或中文字符，磁盘名称会展示在控制台。不能以http://和https://开头。
     */
    private String dataDisk3DiskName;

    /**
     * 数据盘3大小
     */
    private Long dataDisk3Size;

    /**
     * 数据盘3快照
     */
    private String dataDisk3SnapshotId;

    /**
     * 数据盘4类型
     */
    private String dataDisk4Category;

    /**
     * 数据盘描述，不填则为空，默认值为空，[0,256]英文或中文字符，磁盘描述会展示在控制台。不能以http://和https://开头。
     */
    private String dataDisk4Description;

    /**
     * 空表示由系统默认分配，/dev/xvdb/开始到/dev/xvdz/
     */
    private String dataDisk4Device;

    /**
     * 数据盘名称，不填则为空，默认值为空，[0,128]英文或中文字符，磁盘名称会展示在控制台。不能以http://和https://开头。
     */
    private String dataDisk4DiskName;

    /**
     * 数据盘4大小
     */
    private Long dataDisk4Size;

    /**
     * 数据盘4快照
     */
    private String dataDisk4SnapshotId;

    /**
     * 实例的描述，[0,256]英文或中文字符，实例描述会显示在控制台。不填则为空，默认为空。不能以http://和https://开头。
     */
    private String description;

    /**
     * 表示云服务器的主机名，最少2字符，“.”和“-”是不能作为hostname的首尾字符，不能连续使用。
     * Windows平台最长为15字符，允许字母（不限制大小写）、数字和“-”组成，不支持点号（"."），不能全是数字。
     * 其他（Linux等）平台最长为30字符，允许支持多个点号，点之间为一段，每段允许字母（不限制大小写）、数字和“-”组成。
     */
    private String hostName;

    /**
     * 镜像文件ID，表示启动实例时选择的镜像资源
     */
    private String imageId;

    /**
     * 实例的显示名称，由字母、数字、"-"组成，最长64个字符 实例的显示名称在同一个用户账号下必须唯一，不能重名
     * 如果没有指定该参数，默认值为实例的InstanceId
     */
    private String instanceName;

    /**
     * 实例的资源规则。取值参见附表实例资源规格对照表，也可以调用查询实例资源规格列表接口获得最新的规格表。
     */
    private String instanceType;

    /**
     * 带宽计费类型.
     */
    private String internetChargeType;

    /**
     * 公网入带宽最大值，单位为Mbps(Mega bit per second)，取值范围为1~200，即最大值为200Mbps<br />
     * 支持最大值为：200<br />
     * 支持最小值为：1
     */
    private Long internetMaxBandwidthIn;

    /**
     * 公网出带宽最大值，单位为Mbps(Mega bit per second)，取值范围为1~200，即最大值为200Mbps
     * 默认值为200Mbps
     */
    private Long internetMaxBandwidthOut;

    /**
     * 实例的密码，8-30个字符，必须由大小写字母和数字组成
     */
    private String password;

    /**
     * 实例私网IP地址，不能单独指定。
     */
    private String privateIpAddress;

    /**
     * 实例所属的Region ID
     */
    private String regionId;

    /**
     * 指定新创建实例所属于的安全组代码，同一个安全组内的实例之间可以互相访问。注意：同一安全组内的实例不能超过1000个
     */
    private String securityGroupId;

    /**
     * 系统盘类型
     */
    private String systemDiskCategory;

    /**
     * 系统盘描述，不填则为空，默认值为空，[0,256]英文或中文字符，磁盘描述会展示在控制台。不能以http://和https://开头。
     */
    private String systemDiskDescription;

    /**
     * 系统盘名称
     */
    private String systemDiskDiskName;

    /**
     * 如果是创建VPC类型的实例，需要指定虚拟交换机的ID
     */
    private String vSwitchId;

    /**
     * 实例所属可用区
     */
    private String zoneId;

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setDataDisk1Category(String dataDisk1Category) {
        this.dataDisk1Category = dataDisk1Category;
    }

    public String getDataDisk1Category() {
        return this.dataDisk1Category;
    }

    public void setDataDisk1Description(String dataDisk1Description) {
        this.dataDisk1Description = dataDisk1Description;
    }

    public String getDataDisk1Description() {
        return this.dataDisk1Description;
    }

    public void setDataDisk1Device(String dataDisk1Device) {
        this.dataDisk1Device = dataDisk1Device;
    }

    public String getDataDisk1Device() {
        return this.dataDisk1Device;
    }

    public void setDataDisk1DiskName(String dataDisk1DiskName) {
        this.dataDisk1DiskName = dataDisk1DiskName;
    }

    public String getDataDisk1DiskName() {
        return this.dataDisk1DiskName;
    }

    public void setDataDisk1Size(Long dataDisk1Size) {
        this.dataDisk1Size = dataDisk1Size;
    }

    public Long getDataDisk1Size() {
        return this.dataDisk1Size;
    }

    public void setDataDisk1SnapshotId(String dataDisk1SnapshotId) {
        this.dataDisk1SnapshotId = dataDisk1SnapshotId;
    }

    public String getDataDisk1SnapshotId() {
        return this.dataDisk1SnapshotId;
    }

    public void setDataDisk2Category(String dataDisk2Category) {
        this.dataDisk2Category = dataDisk2Category;
    }

    public String getDataDisk2Category() {
        return this.dataDisk2Category;
    }

    public void setDataDisk2Description(String dataDisk2Description) {
        this.dataDisk2Description = dataDisk2Description;
    }

    public String getDataDisk2Description() {
        return this.dataDisk2Description;
    }

    public void setDataDisk2Device(String dataDisk2Device) {
        this.dataDisk2Device = dataDisk2Device;
    }

    public String getDataDisk2Device() {
        return this.dataDisk2Device;
    }

    public void setDataDisk2DiskName(String dataDisk2DiskName) {
        this.dataDisk2DiskName = dataDisk2DiskName;
    }

    public String getDataDisk2DiskName() {
        return this.dataDisk2DiskName;
    }

    public void setDataDisk2Size(Long dataDisk2Size) {
        this.dataDisk2Size = dataDisk2Size;
    }

    public Long getDataDisk2Size() {
        return this.dataDisk2Size;
    }

    public void setDataDisk2SnapshotId(String dataDisk2SnapshotId) {
        this.dataDisk2SnapshotId = dataDisk2SnapshotId;
    }

    public String getDataDisk2SnapshotId() {
        return this.dataDisk2SnapshotId;
    }

    public void setDataDisk3Category(String dataDisk3Category) {
        this.dataDisk3Category = dataDisk3Category;
    }

    public String getDataDisk3Category() {
        return this.dataDisk3Category;
    }

    public void setDataDisk3Description(String dataDisk3Description) {
        this.dataDisk3Description = dataDisk3Description;
    }

    public String getDataDisk3Description() {
        return this.dataDisk3Description;
    }

    public void setDataDisk3Device(String dataDisk3Device) {
        this.dataDisk3Device = dataDisk3Device;
    }

    public String getDataDisk3Device() {
        return this.dataDisk3Device;
    }

    public void setDataDisk3DiskName(String dataDisk3DiskName) {
        this.dataDisk3DiskName = dataDisk3DiskName;
    }

    public String getDataDisk3DiskName() {
        return this.dataDisk3DiskName;
    }

    public void setDataDisk3Size(Long dataDisk3Size) {
        this.dataDisk3Size = dataDisk3Size;
    }

    public Long getDataDisk3Size() {
        return this.dataDisk3Size;
    }

    public void setDataDisk3SnapshotId(String dataDisk3SnapshotId) {
        this.dataDisk3SnapshotId = dataDisk3SnapshotId;
    }

    public String getDataDisk3SnapshotId() {
        return this.dataDisk3SnapshotId;
    }

    public void setDataDisk4Category(String dataDisk4Category) {
        this.dataDisk4Category = dataDisk4Category;
    }

    public String getDataDisk4Category() {
        return this.dataDisk4Category;
    }

    public void setDataDisk4Description(String dataDisk4Description) {
        this.dataDisk4Description = dataDisk4Description;
    }

    public String getDataDisk4Description() {
        return this.dataDisk4Description;
    }

    public void setDataDisk4Device(String dataDisk4Device) {
        this.dataDisk4Device = dataDisk4Device;
    }

    public String getDataDisk4Device() {
        return this.dataDisk4Device;
    }

    public void setDataDisk4DiskName(String dataDisk4DiskName) {
        this.dataDisk4DiskName = dataDisk4DiskName;
    }

    public String getDataDisk4DiskName() {
        return this.dataDisk4DiskName;
    }

    public void setDataDisk4Size(Long dataDisk4Size) {
        this.dataDisk4Size = dataDisk4Size;
    }

    public Long getDataDisk4Size() {
        return this.dataDisk4Size;
    }

    public void setDataDisk4SnapshotId(String dataDisk4SnapshotId) {
        this.dataDisk4SnapshotId = dataDisk4SnapshotId;
    }

    public String getDataDisk4SnapshotId() {
        return this.dataDisk4SnapshotId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostName() {
        return this.hostName;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public void setInternetMaxBandwidthIn(Long internetMaxBandwidthIn) {
        this.internetMaxBandwidthIn = internetMaxBandwidthIn;
    }

    public Long getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    public void setInternetMaxBandwidthOut(Long internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
    }

    public Long getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public void setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
    }

    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public void setSystemDiskDescription(String systemDiskDescription) {
        this.systemDiskDescription = systemDiskDescription;
    }

    public String getSystemDiskDescription() {
        return this.systemDiskDescription;
    }

    public void setSystemDiskDiskName(String systemDiskDiskName) {
        this.systemDiskDiskName = systemDiskDiskName;
    }

    public String getSystemDiskDiskName() {
        return this.systemDiskDiskName;
    }

    public void setvSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
    }

    public String getvSwitchId() {
        return this.vSwitchId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "ecs.aliyuncs.com.CreateInstance.2014-05-26";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("ClientToken", this.clientToken);
        txtParams.put("DataDisk.1.Category", this.dataDisk1Category);
        txtParams.put("DataDisk.1.Description", this.dataDisk1Description);
        txtParams.put("DataDisk.1.Device", this.dataDisk1Device);
        txtParams.put("DataDisk.1.DiskName", this.dataDisk1DiskName);
        txtParams.put("DataDisk.1.Size", this.dataDisk1Size);
        txtParams.put("DataDisk.1.SnapshotId", this.dataDisk1SnapshotId);
        txtParams.put("DataDisk.2.Category", this.dataDisk2Category);
        txtParams.put("DataDisk.2.Description", this.dataDisk2Description);
        txtParams.put("DataDisk.2.Device", this.dataDisk2Device);
        txtParams.put("DataDisk.2.DiskName", this.dataDisk2DiskName);
        txtParams.put("DataDisk.2.Size", this.dataDisk2Size);
        txtParams.put("DataDisk.2.SnapshotId", this.dataDisk2SnapshotId);
        txtParams.put("DataDisk.3.Category", this.dataDisk3Category);
        txtParams.put("DataDisk.3.Description", this.dataDisk3Description);
        txtParams.put("DataDisk.3.Device", this.dataDisk3Device);
        txtParams.put("DataDisk.3.DiskName", this.dataDisk3DiskName);
        txtParams.put("DataDisk.3.Size", this.dataDisk3Size);
        txtParams.put("DataDisk.3.SnapshotId", this.dataDisk3SnapshotId);
        txtParams.put("DataDisk.4.Category", this.dataDisk4Category);
        txtParams.put("DataDisk.4.Description", this.dataDisk4Description);
        txtParams.put("DataDisk.4.Device", this.dataDisk4Device);
        txtParams.put("DataDisk.4.DiskName", this.dataDisk4DiskName);
        txtParams.put("DataDisk.4.Size", this.dataDisk4Size);
        txtParams.put("DataDisk.4.SnapshotId", this.dataDisk4SnapshotId);
        txtParams.put("Description", this.description);
        txtParams.put("HostName", this.hostName);
        txtParams.put("ImageId", this.imageId);
        txtParams.put("InstanceName", this.instanceName);
        txtParams.put("InstanceType", this.instanceType);
        txtParams.put("InternetChargeType", this.internetChargeType);
        txtParams.put("InternetMaxBandwidthIn", this.internetMaxBandwidthIn);
        txtParams.put("InternetMaxBandwidthOut", this.internetMaxBandwidthOut);
        txtParams.put("Password", this.password);
        txtParams.put("PrivateIpAddress", this.privateIpAddress);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("SecurityGroupId", this.securityGroupId);
        txtParams.put("SystemDisk.Category", this.systemDiskCategory);
        txtParams.put("SystemDisk.Description", this.systemDiskDescription);
        txtParams.put("SystemDisk.DiskName", this.systemDiskDiskName);
        txtParams.put("VSwitchId", this.vSwitchId);
        txtParams.put("ZoneId", this.zoneId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<CreateInstanceResponse> getResponseClass() {
        return CreateInstanceResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(imageId, "imageId");
        RequestCheckUtils.checkNotEmpty(instanceType, "instanceType");
        RequestCheckUtils.checkMaxValue(internetMaxBandwidthIn, 200L, "internetMaxBandwidthIn");
        RequestCheckUtils.checkMinValue(internetMaxBandwidthIn, 1L, "internetMaxBandwidthIn");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
        RequestCheckUtils.checkNotEmpty(securityGroupId, "securityGroupId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
