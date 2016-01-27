package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.ResetAccountPassword.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ResetAccountPasswordResponse extends AliyunResponse {

    private static final long serialVersionUID = 7188439862867937975L;

    /**
     * 请求id
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
