package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * AdviceOnExcessIndex
 *
 * @author auto create
 * @since 1.0, null
 */
public class AdviceOnExcessIndex extends TaobaoObject {

    private static final long serialVersionUID = 3423326682587962438L;

    /**
     * 数据库名
     */
    @ApiField("DBName")
    private String dBName;

    /**
     * 数据表索引个数
     */
    @ApiField("IndexCount")
    private Long indexCount;

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

    public Long getIndexCount() {
        return this.indexCount;
    }

    public void setIndexCount(Long indexCount) {
        this.indexCount = indexCount;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

}
