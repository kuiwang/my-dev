package com.aliyun.api.ecs.ecs20130110.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeSnapshotAttribute.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeSnapshotAttributeResponse extends AliyunResponse {

    private static final long serialVersionUID = 8633529238648411266L;

    /**
     * 快照创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为： YYYY-MM-DDThh:mmZ
     */
    @ApiField("CreationTime")
    private String creationTime;

    /**
     * 创建进度，单位为百分比，100表示创建完成
     */
    @ApiField("Progress")
    private String progress;

    /**
     * 请求的唯一ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 快照标识编码
     */
    @ApiField("SnapshotId")
    private String snapshotId;

    /**
     * 快照显示名称。如果创建时指定了快照显示名称，则返回指定的名称
     */
    @ApiField("SnapshotName")
    private String snapshotName;

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getProgress() {
        return this.progress;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    public String getSnapshotName() {
        return this.snapshotName;
    }

}
