package com.aliyun.api.ecs.ecs20140526.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.ModifyDiskAttribute.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ModifyDiskAttributeResponse extends AliyunResponse {

    private static final long serialVersionUID = 5831181383688117584L;

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
