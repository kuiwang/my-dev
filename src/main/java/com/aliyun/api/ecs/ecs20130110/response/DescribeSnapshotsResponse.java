package com.aliyun.api.ecs.ecs20130110.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Snapshot;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeSnapshots.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeSnapshotsResponse extends AliyunResponse {

    private static final long serialVersionUID = 8758263746323951954L;

    /**
     * 请求的唯一ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 快照详情列表
     */
    @ApiListField("Snapshots")
    @ApiField("Snapshot")
    private List<Snapshot> snapshots;

    public String getRequestId() {
        return this.requestId;
    }

    public List<Snapshot> getSnapshots() {
        return this.snapshots;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setSnapshots(List<Snapshot> snapshots) {
        this.snapshots = snapshots;
    }

}
