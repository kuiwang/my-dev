package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.ModifyBackupPolicy.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ModifyBackupPolicyResponse extends AliyunResponse {

    private static final long serialVersionUID = 1885719187764925146L;

    /**
     * RequestId
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
