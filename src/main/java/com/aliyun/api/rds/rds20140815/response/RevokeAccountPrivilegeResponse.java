package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.RevokeAccountPrivilege.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RevokeAccountPrivilegeResponse extends AliyunResponse {

    private static final long serialVersionUID = 2499754373443137789L;

    /**
     * 请求id
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
