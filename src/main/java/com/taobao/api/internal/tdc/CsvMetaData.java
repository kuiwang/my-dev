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

    public class MetaData {

        private String columnName;

        private String labelName;

        private String tableName;

        public MetaData(String tableName, String columnName, String labelName) {
            this.tableName = tableName;
            this.columnName = columnName;
            this.labelName = labelName;
        }

        public String getColumnName() {
            return columnName;
        }

        public String getLabelName() {
            return labelName;
        }

        public String getTableName() {
            return tableName;
        }

        public void setColumnName(String columnName) {
            this.columnName = columnName;
        }

        public void setLabelName(String labelName) {
            this.labelName = labelName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }
    }

    private List<MetaData> metaDatas;

    public void addMetaData(String tableName, String columnName, String lableName) {
        if (null == metaDatas) {
            metaDatas = new ArrayList<MetaData>();
        }
        MetaData md = new MetaData(tableName, columnName, lableName);
        metaDatas.add(md);
    }

    public List<MetaData> getMetaDatas() {
        return metaDatas;
    }

    public void setMetaDatas(List<MetaData> metaDatas) {
        this.metaDatas = metaDatas;
    }
}
