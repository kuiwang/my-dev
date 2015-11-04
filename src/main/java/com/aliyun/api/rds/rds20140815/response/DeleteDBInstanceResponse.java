package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.DeleteDBInstance.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DeleteDBInstanceResponse extends AliyunResponse {

    private static final long serialVersionUID = 6169857114665279217L;

    /**
     * 请求id
     */
    @ApiField("reuqestId")
    private String reuqestId;

    public void setReuqestId(String reuqestId) {
        this.reuqestId = reuqestId;
    }

    public String getReuqestId() {
        return this.reuqestId;
    }

}
