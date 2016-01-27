package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.RdsDbInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.rds.db.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RdsDbGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1554363348796934799L;

    /**
     * 数据库查询返回数据结构
     */
    @ApiListField("rds_db_infos")
    @ApiField("rds_db_info")
    private List<RdsDbInfo> rdsDbInfos;

    public List<RdsDbInfo> getRdsDbInfos() {
        return this.rdsDbInfos;
    }

    public void setRdsDbInfos(List<RdsDbInfo> rdsDbInfos) {
        this.rdsDbInfos = rdsDbInfos;
    }

}
