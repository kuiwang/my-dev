package com.aliyun.api.rds.rds20130528.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.DeleteDBInstance.2013-05-28 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DeleteDBInstanceResponse extends AliyunResponse {

    private static final long serialVersionUID = 7372832285869855611L;

    /**
     * 请求id
     */
    @ApiField("reuqest_id")
    private String reuqestId;

    public void setReuqestId(String reuqestId) {
        this.reuqestId = reuqestId;
    }

    public String getReuqestId() {
        return this.reuqestId;
    }

}
