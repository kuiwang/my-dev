package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 描述镜像和快照的关系。
 *
 * @author auto create
 * @since 1.0, null
 */
public class DiskDeviceMapping extends TaobaoObject {

    private static final long serialVersionUID = 3497138634881564545L;

    /**
     * 生成磁盘的Device信息：比如/dev/xvdb
     */
    @ApiField("Device")
    private String device;

    /**
     * 生成磁盘的大小
     */
    @ApiField("Size")
    private String size;

    /**
     * 快照ID
     */
    @ApiField("SnapshotId")
    private String snapshotId;

    public String getDevice() {
        return this.device;
    }

    public String getSize() {
        return this.size;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

}
