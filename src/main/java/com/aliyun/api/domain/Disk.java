package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Disk
 *
 * @author auto create
 * @since 1.0, null
 */
public class Disk extends TaobaoObject {

    private static final long serialVersionUID = 4326492828764542971L;

    /**
     * 挂载时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     * 只有在Status为In_use时才有意义
     */
    @ApiField("AttachedTime")
    private String attachedTime;

    /**
     * 磁盘种类 可选值：cloud: 云磁盘，ephemeral: 临时磁盘
     */
    @ApiField("Category")
    private String category;

    /**
     * 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 是否同时删除自动快照，true|false。 通过CreateSnapshot或者在控制台创建的快照，不受这个参数的影响，始终会被保留。
     */
    @ApiField("DeleteAutoSnapshot")
    private String deleteAutoSnapshot;

    /**
     * True表示Instance释放时，这块磁盘随Instance一起释放；false表示Instance释放时，这块磁盘保留不释放。
     */
    @ApiField("DeleteWithInstance")
    private String deleteWithInstance;

    /**
     * 磁盘描述
     */
    @ApiField("Description")
    private String description;

    /**
     * 卸载时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     * 只有在Status为Available时才有意义
     */
    @ApiField("DetachedTime")
    private String detachedTime;

    /**
     * 所属Instance的Device信息：比如/dev/xvdb 只有在Status为In_use是才有值，其他状态为空。
     */
    @ApiField("Device")
    private String device;

    /**
     * 磁盘ID
     */
    @ApiField("DiskId")
    private String diskId;

    /**
     * 磁盘名
     */
    @ApiField("DiskName")
    private String diskName;

    /**
     * 创建磁盘的镜像ID，只有通过镜像创建的磁盘才有值，否则为空。这个值在磁盘的生命周期内始终不变
     */
    @ApiField("ImageId")
    private String imageId;

    /**
     * 所属Instance ID 只有在Status为In_use时才有值，其他状态为空。
     */
    @ApiField("InstanceId")
    private String instanceId;

    /**
     * 磁盘锁定原因类型
     */
    @ApiField("OperationLocks")
    private String operationLocks;

    /**
     * True代表是独立云磁盘，可以独立存在且可以自由在可用区内挂载和下载，false代表非独立云磁盘，只能和实例同生同灭。
     * 用户如果需要做attach和detach操作
     * ，必须先查询一下这个属性为true的磁盘才能操作。临时磁盘，云磁盘的系统盘和包月的云磁盘，该属性都为false。这个属性用户不能更改。
     */
    @ApiField("Portable")
    private String portable;

    /**
     * 镜像市场的商品标识
     */
    @ApiField("ProductCode")
    private String productCode;

    /**
     * 磁盘所属的地域 ID
     */
    @ApiField("RegionId")
    private String regionId;

    /**
     * 磁盘大小，单位GB
     */
    @ApiField("Size")
    private Long size;

    /**
     * 创建磁盘使用的快照，如果创建磁盘时，没有指定快照，则为空。这个值在磁盘的生命周期内始终不变。
     */
    @ApiField("SourceSnapshotId")
    private String sourceSnapshotId;

    /**
     * 磁盘状态 In_use|Available|Attaching|Detaching|Creating|ReIniting
     */
    @ApiField("Status")
    private String status;

    /**
     * 磁盘类型 可选值：system: 系统盘，data: 数据盘
     */
    @ApiField("Type")
    private String type;

    /**
     * 磁盘所属的可用区ID
     */
    @ApiField("ZoneId")
    private String zoneId;

    public String getAttachedTime() {
        return this.attachedTime;
    }

    public void setAttachedTime(String attachedTime) {
        this.attachedTime = attachedTime;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    public void setDeleteAutoSnapshot(String deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
    }

    public String getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    public void setDeleteWithInstance(String deleteWithInstance) {
        this.deleteWithInstance = deleteWithInstance;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetachedTime() {
        return this.detachedTime;
    }

    public void setDetachedTime(String detachedTime) {
        this.detachedTime = detachedTime;
    }

    public String getDevice() {
        return this.device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDiskId() {
        return this.diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public String getDiskName() {
        return this.diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getOperationLocks() {
        return this.operationLocks;
    }

    public void setOperationLocks(String operationLocks) {
        this.operationLocks = operationLocks;
    }

    public String getPortable() {
        return this.portable;
    }

    public void setPortable(String portable) {
        this.portable = portable;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public Long getSize() {
        return this.size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }

    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

}
