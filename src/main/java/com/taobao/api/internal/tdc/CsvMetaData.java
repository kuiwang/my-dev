package com.taobao.api.internal.tdc;

import java.util.ArrayList;
import java.util.List;

/**
 * TDC查询结果中CSV结果的metadata类 主要包括结果中显示列的表名，字段名和显示名称
 * 
 * @author haofeng 2013-1-18
 * @date 2013-1-18 上午11:20:23
 */
public class CsvMetaData {

    private List<MetaData> metaDatas;

    public List<MetaData> getMetaDatas() {
        return metaDatas;
    }

    public void setMetaDatas(List<MetaData> metaDatas) {
        this.metaDatas = metaDatas;
    }

    public void addMetaData(String tableName, String columnName, String lableName) {
        if (null == metaDatas) {
            metaDatas = new ArrayList<MetaData>();
        }
        MetaData md = new MetaData(tableName, columnName, lableName);
        metaDatas.add(md);
    }

    public class MetaData {

        private String tableName;

        private String columnName;

        private String labelName;

        public MetaData(String tableName, String columnName, String labelName) {
            this.tableName = tableName;
            this.columnName = columnName;
            this.labelName = labelName;
        }

        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public String getColumnName() {
            return columnName;
        }

        public void setColumnName(String columnName) {
            this.columnName = columnName;
        }

        public String getLabelName() {
            return labelName;
        }

        public void setLabelName(String labelName) {
            this.labelName = labelName;
        }
    }
}
