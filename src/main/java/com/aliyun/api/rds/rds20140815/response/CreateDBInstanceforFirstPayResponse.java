package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.CreateDBInstanceforFirstPay.2014-08-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateDBInstanceforFirstPayResponse extends AliyunResponse {

    private static final long serialVersionUID = 6281218594184933884L;

    /**
     * 数据库连接地址。
     */
    @ApiField("ConnectionString")
    private String connectionString;

    /**
     * 实例名
     */
    @ApiField("DBInstanceId")
    private String dBInstanceId;

    /**
     * 数据库连接端口。
     */
    @ApiField("Port")
    private String port;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getConnectionString() {
        return this.connectionString;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPort() {
        return this.port;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
