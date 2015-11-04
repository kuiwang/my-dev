package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * AdviceOnMissPK
 *
 * @author auto create
 * @since 1.0, null
 */
public class AdviceOnMissPK extends TaobaoObject {

    private static final long serialVersionUID = 2872155478375316962L;

    /**
     * 数据库名
     */
    @ApiField("DBName")
    private String dBName;

    /**
     * 数据表名
     */
    @ApiField("TableName")
    private String tableName;

    public String getdBName() {
        return this.dBName;
    }

    public void setdBName(String dBName) {
        this.dBName = dBName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

}
