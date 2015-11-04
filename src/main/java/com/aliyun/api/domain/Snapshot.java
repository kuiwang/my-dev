package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Aliyun的ECS快照详情
 *
 * @author auto create
 * @since 1.0, null
 */
public class Snapshot extends TaobaoObject {

    private static final long serialVersionUID = 4468813828287494927L;

    /**
     * 快照创建时间
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 快照说明
     */
    @ApiField("Description")
    private String description;

    /**
     * 从镜像市场继承的产品编号
     */
    @ApiField("ProductCode")
    private String productCode;

    /**
     * 快照完成进度
     */
    @ApiField("Progress")
    private String progress;

    /**
     * 快照ID
     */
    @ApiField("SnapshotId")
    private String snapshotId;

    /**
     * 快照名称
     */
    @ApiField("SnapshotName")
    private String snapshotName;

    /**
     * 创建快照的磁盘id
     */
    @ApiField("SourceDiskId")
    private String sourceDiskId;

    /**
     * 创建快照的磁盘大小
     */
    @ApiField("SourceDiskSize")
    private Long sourceDiskSize;

    /**
     * 创建快照的磁盘种类
     */
    @ApiField("SourceDiskType")
    private String sourceDiskType;

    public String getCreationTime() {
        return this.creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProgress() {
        return this.progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getSnapshotName() {
        return this.snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    public String getSourceDiskId() {
        return this.sourceDiskId;
    }

    public void setSourceDiskId(String sourceDiskId) {
        this.sourceDiskId = sourceDiskId;
    }

    public Long getSourceDiskSize() {
        return this.sourceDiskSize;
    }

    public void setSourceDiskSize(Long sourceDiskSize) {
        this.sourceDiskSize = sourceDiskSize;
    }

    public String getSourceDiskType() {
        return this.sourceDiskType;
    }

    public void setSourceDiskType(String sourceDiskType) {
        this.sourceDiskType = sourceDiskType;
    }

}
