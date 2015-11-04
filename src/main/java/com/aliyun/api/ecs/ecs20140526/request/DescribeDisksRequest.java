package com.aliyun.api.ecs.ecs20140526.request;

import java.util.Map;

import com.aliyun.api.AliyunRequest;
import com.aliyun.api.ecs.ecs20140526.response.DescribeDisksResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

/**
 * TOP API: ecs.aliyuncs.com.DescribeDisks.2014-05-26 request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:36
 */
public class DescribeDisksRequest implements AliyunRequest<DescribeDisksResponse> {

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
     * 磁盘种类，all|cloud|ephemaral。默认值为all
     */
    private String category;

    /**
     * 删除磁盘时，是否同时删除自动快照。 True表示同时删除自动快照 False表示保留自动快照
     */
    private Boolean deleteAutoSnapshot;

    /**
     * 磁盘是否随实例释放： True表示Instance释放时，这块磁盘随Instance一起释放；
     * False表示Instance释放时，这块磁盘保留不释放。 默认值为
     */
    private Boolean deleteWithInstance;

    /**
     * 磁盘ID
     */
    private String diskIds;

    /**
     * all|system|data，默认值为all。
     */
    private String diskType;

    /**
     * 目标云服务器ID
     */
    private String instanceId;

    /**
     * 实例状态列表的页码，起始值为1，默认值为1<br />
     * 支持最小值为：1
     */
    private Long pageNumber;

    /**
     * 分页查询时设置的每页行数，最大值50行，默认为10<br />
     * 支持最大值为：50<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * True代表是独立云磁盘，可以独立存在且可以自由在独立区内挂载和下载，false代表非独立云磁盘，只能和实例同生同灭。
     * 用户如果需要做attach和detach操作
     * ，必须先查询一下这个属性为true的磁盘才能操作。临时磁盘，云磁盘的系统盘和包月的云磁盘，该属性都为false。这个属性用户不能更改
     */
    private Boolean portable;

    /**
     * 实例所属于的Region ID
     */
    private String regionId;

    /**
     * 创建数据盘使用的快照 指定该参数后Size会被忽略，实际创建的磁盘大小为指定快照的大小
     * 2013年7月15日（含）前的快照不能用来创建磁盘
     */
    private String snapshotId;

    /**
     * 磁盘状态 In-use|Availalble|Attaching|
     * Detaching|Creating|Deleting|All，默认值为All
     */
    private String status;

    /**
     * 可用区ID。
     */
    private String zoneId;

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
    }

    public Boolean getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    public void setDeleteWithInstance(Boolean deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
    }

    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public void setDiskIds(String diskIds) {
        this.diskIds = diskIds;
    }

    public String getDiskIds() {
        return this.diskIds;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getDiskType() {
        return this.diskType;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceId() {
        return this.instanceId;
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

    public void setPortable(Boolean portable) {
        this.portable = portable;
    }

    public Boolean getPortable() {
        return this.portable;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
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
        return "ecs.aliyuncs.com.DescribeDisks.2014-05-26";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("OwnerId", this.ownerId);
        txtParams.put("OwnerAccount", this.ownerAccount);
        txtParams.put("ResourceOwnerAccount", this.resourceOwnerAccount);
        txtParams.put("Category", this.category);
        txtParams.put("DeleteAutoSnapshot", this.deleteAutoSnapshot);
        txtParams.put("DeleteWithInstance", this.deleteWithInstance);
        txtParams.put("DiskIds", this.diskIds);
        txtParams.put("DiskType", this.diskType);
        txtParams.put("InstanceId", this.instanceId);
        txtParams.put("PageNumber", this.pageNumber);
        txtParams.put("PageSize", this.pageSize);
        txtParams.put("Portable", this.portable);
        txtParams.put("RegionId", this.regionId);
        txtParams.put("SnapshotId", this.snapshotId);
        txtParams.put("Status", this.status);
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

    public Class<DescribeDisksResponse> getResponseClass() {
        return DescribeDisksResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMinValue(pageNumber, 1L, "pageNumber");
        RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(regionId, "regionId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
