package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.DeleteDatabase.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DeleteDatabaseResponse extends AliyunResponse {

    private static final long serialVersionUID = 1175987864783935867L;

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
