package com.aliyun.api.mts.mts20140618.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: mts.aliyuncs.com.GetSnapshotById.2014-06-18 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class GetSnapshotByIdResponse extends AliyunResponse {

    private static final long serialVersionUID = 6381839993115151514L;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 截图的地址
     */
    @ApiField("SnapshotUrl")
    private String snapshotUrl;

    public String getRequestId() {
        return this.requestId;
    }

    public String getSnapshotUrl() {
        return this.snapshotUrl;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

}
