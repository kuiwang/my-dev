package com.aliyun.api.ecs.ecs20140526.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.CreateSnapshot.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateSnapshotResponse extends AliyunResponse {

    private static final long serialVersionUID = 2351434588673694883L;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 快照ID
     */
    @ApiField("SnapshotId")
    private String snapshotId;

    public String getRequestId() {
        return this.requestId;
    }

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

}
