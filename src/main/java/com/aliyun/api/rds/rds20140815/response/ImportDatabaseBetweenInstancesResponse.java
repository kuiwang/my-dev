package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.ImportDatabaseBetweenInstances.2014-08-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ImportDatabaseBetweenInstancesResponse extends AliyunResponse {

    private static final long serialVersionUID = 4228219973845725187L;

    /**
     * 导入实例Id
     */
    @ApiField("ImportID")
    private String importID;

    /**
     * 请求id
     */
    @ApiField("RequestId")
    private String requestId;

    public String getImportID() {
        return this.importID;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setImportID(String importID) {
        this.importID = importID;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
