package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.GrantAccountPrivilege.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class GrantAccountPrivilegeResponse extends AliyunResponse {

    private static final long serialVersionUID = 4891924896917728654L;

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
