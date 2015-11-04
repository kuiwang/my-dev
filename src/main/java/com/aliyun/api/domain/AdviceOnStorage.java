package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * AdviceOnStorage
 *
 * @author auto create
 * @since 1.0, null
 */
public class AdviceOnStorage extends TaobaoObject {

    private static final long serialVersionUID = 8215175486371665252L;

    /**
     * 建议存储引擎
     */
    @ApiField("AdviseEngine")
    private String adviseEngine;

    /**
     * 存储引擎
     */
    @ApiField("CurrentEngine")
    private String currentEngine;

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

    public String getAdviseEngine() {
        return this.adviseEngine;
    }

    public void setAdviseEngine(String adviseEngine) {
        this.adviseEngine = adviseEngine;
    }

    public String getCurrentEngine() {
        return this.currentEngine;
    }

    public void setCurrentEngine(String currentEngine) {
        this.currentEngine = currentEngine;
    }

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
