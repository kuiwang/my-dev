package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.DescribeInstancesResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.DescribeInstances.2014-05-26 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:36
 */
public class DescribeInstancesRequest implements AliyunRequest<DescribeInstancesResponse> {

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
     * 实例网络类型
     */
    private String instanceNetworkType;

    /**
     * 实例状态列表的页码，起始值为1，默认值为1
     */
    private Long pageNumber;

    /**
     * 分页查询时设置的每页行数，最大值50行，默认为10<br />
     * 支持最大值为：50
     */
    private Long pageSize;

    /**
     * 区域Id
     */
    private String regionId;

    /**
     * 安全组Id
     */
    private String securityGroupId;

    /**
     * 虚拟交换机Id
     */
    private String vSwitchId;

    /**
     * 虚拟专有网络Id
     */
    private String vpcId;

    /**
     * 可用区Id
     */
    private String zoneId;

    public void setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
    }

    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
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

    public void setvSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
    }

    public String getvSwitchId() {
        return this.vSwitchId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getVpcId() {
        return this.vpcId;
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
        return "ecs.aliyuncs.com.DescribeInstances.2014-05-26";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("InstanceNetworkType", this.instanceNetworkType);
        txtParams.put("PageNumber", this.pageNumber);
        txtParams.put("PageSize", this.pageSize);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("SecurityGroupId", this.securityGroupId);
        txtParams.put("VSwitchId", this.vSwitchId);
        txtParams.put("VpcId", this.vpcId);
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

    public Class<DescribeInstancesResponse> getResponseClass() {
        return DescribeInstancesResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
