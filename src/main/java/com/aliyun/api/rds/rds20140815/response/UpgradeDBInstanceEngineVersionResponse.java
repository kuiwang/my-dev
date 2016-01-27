package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.UpgradeDBInstanceEngineVersion.2014-08-15
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UpgradeDBInstanceEngineVersionResponse extends AliyunResponse {

    private static final long serialVersionUID = 8645211624178616365L;

    /**
     * 请求ID
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
