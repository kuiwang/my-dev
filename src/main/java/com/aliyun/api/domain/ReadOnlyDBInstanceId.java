package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * ReadOnlyDBInstanceId
 *
 * @author auto create
 * @since 1.0, null
 */
public class ReadOnlyDBInstanceId extends TaobaoObject {

    private static final long serialVersionUID = 7691733672582557738L;

    /**
     * 实例ID
     */
    @ApiField("DBInstanceId")
    private String dBInstanceId;

    public String getdBInstanceId() {
        return this.dBInstanceId;
    }

    public void setdBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

}
