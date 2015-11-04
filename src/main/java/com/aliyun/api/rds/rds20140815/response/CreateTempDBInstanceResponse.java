package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.CreateTempDBInstance.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateTempDBInstanceResponse extends AliyunResponse {

    private static final long serialVersionUID = 5833794998619871522L;

    /**
     * 请求id
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * TempDBInstanceId
     */
    @ApiField("TempDBInstanceId")
    private String tempDBInstanceId;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setTempDBInstanceId(String tempDBInstanceId) {
        this.tempDBInstanceId = tempDBInstanceId;
    }

    public String getTempDBInstanceId() {
        return this.tempDBInstanceId;
    }

}
