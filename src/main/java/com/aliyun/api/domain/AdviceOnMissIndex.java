package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * AdviceOnMissIndex
 *
 * @author auto create
 * @since 1.0, null
 */
public class AdviceOnMissIndex extends TaobaoObject {

    private static final long serialVersionUID = 6163762653772272893L;

    /**
     * 数据库名
     */
    @ApiField("DBName")
    private String dBName;

    /**
     * 缺失索引的查询列
     */
    @ApiField("QueryColumn")
    private String queryColumn;

    /**
     * 推荐创建索引的SQL语句
     */
    @ApiField("SQLText")
    private String sQLText;

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

    public String getQueryColumn() {
        return this.queryColumn;
    }

    public void setQueryColumn(String queryColumn) {
        this.queryColumn = queryColumn;
    }

    public String getsQLText() {
        return this.sQLText;
    }

    public void setsQLText(String sQLText) {
        this.sQLText = sQLText;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

}
