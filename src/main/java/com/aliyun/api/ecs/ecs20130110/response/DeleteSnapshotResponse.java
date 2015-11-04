package com.aliyun.api.ecs.ecs20130110.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.DeleteSnapshot.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DeleteSnapshotResponse extends AliyunResponse {

    private static final long serialVersionUID = 4711359592637535265L;

    /**
     * 请求的唯一ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
