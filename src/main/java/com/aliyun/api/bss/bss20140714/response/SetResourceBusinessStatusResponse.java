package com.aliyun.api.bss.bss20140714.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: bss.aliyuncs.com.SetResourceBusinessStatus.2014-07-14 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SetResourceBusinessStatusResponse extends AliyunResponse {

    private static final long serialVersionUID = 4227673284632354115L;

    /**
     * 请求的唯一ID，系统自动生成
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
