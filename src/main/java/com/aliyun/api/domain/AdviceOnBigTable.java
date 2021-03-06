package com.aliyun.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * AdviceOnBigTable
 *
 * @author auto create
 * @since 1.0, null
 */
public class AdviceOnBigTable extends TaobaoObject {

    private static final long serialVersionUID = 2214545623832162713L;

    /**
     * 数据大小，单位：Byte
     */
    @ApiField("DataSize")
    private Long dataSize;

    /**
     * 数据库名
     */
    @ApiField("DBName")
    private String dBName;

    /**
     * 索引大小，单位：Byte
     */
    @ApiField("IndexSize")
    private Long indexSize;

    /**
     * 数据表名
     */
    @ApiField("TableName")
    private String tableName;

    /**
     * 表大小（数据大小+索引大小），单位：Byte
     */
    @ApiField("TableSize")
    private Long tableSize;

    public Long getDataSize() {
        return this.dataSize;
    }

    public String getdBName() {
        return this.dBName;
    }

    public Long getIndexSize() {
        return this.indexSize;
    }

    public String getTableName() {
        return this.tableName;
    }

    public Long getTableSize() {
        return this.tableSize;
    }

    public void setDataSize(Long dataSize) {
        this.dataSize = dataSize;
    }

    public void setdBName(String dBName) {
        this.dBName = dBName;
    }

    public void setIndexSize(Long indexSize) {
        this.indexSize = indexSize;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setTableSize(Long tableSize) {
        this.tableSize = tableSize;
    }

}
