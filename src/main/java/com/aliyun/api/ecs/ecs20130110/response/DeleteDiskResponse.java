package com.aliyun.api.ecs.ecs20130110.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.DeleteDisk.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DeleteDiskResponse extends AliyunResponse {

    private static final long serialVersionUID = 7179374743343312133L;

    /**
     * 请求的唯一ID，系统自动生成
     */
    @ApiField("RequestId")
    private String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
