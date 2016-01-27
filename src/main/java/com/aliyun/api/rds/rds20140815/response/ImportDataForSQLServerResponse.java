package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.ImportDataForSQLServer.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ImportDataForSQLServerResponse extends AliyunResponse {

    private static final long serialVersionUID = 5664812684471388259L;

    /**
     * 任务ID
     */
    @ApiField("ImportID")
    private Long importID;

    /**
     * 请求id
     */
    @ApiField("RequestId")
    private String requestId;

    public Long getImportID() {
        return this.importID;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setImportID(Long importID) {
        this.importID = importID;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
