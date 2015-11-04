package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RdsDbInfo;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.rds.db.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RdsDbDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4728766873136932127L;

    /**
     * 删除数据库，返回结果对象
     */
    @ApiField("rds_db_info")
    private RdsDbInfo rdsDbInfo;

    public void setRdsDbInfo(RdsDbInfo rdsDbInfo) {
        this.rdsDbInfo = rdsDbInfo;
    }

    public RdsDbInfo getRdsDbInfo() {
        return this.rdsDbInfo;
    }

}
