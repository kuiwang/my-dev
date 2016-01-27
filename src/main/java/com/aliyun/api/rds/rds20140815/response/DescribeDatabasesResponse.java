package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Database;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeDatabases.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeDatabasesResponse extends AliyunResponse {

    private static final long serialVersionUID = 1214677966828893232L;

    /**
     * 数据库列表
     */
    @ApiListField("Databases")
    @ApiField("Database")
    private List<Database> databases;

    /**
     * 请求id
     */
    @ApiField("RequestId")
    private String requestId;

    public List<Database> getDatabases() {
        return this.databases;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setDatabases(List<Database> databases) {
        this.databases = databases;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
