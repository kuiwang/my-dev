package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 透视结果
 *
 * @author auto create
 * @since 1.0, null
 */
public class AnalyzeDO extends TaobaoObject {

    private static final long serialVersionUID = 2453927689455571736L;

    /**
     * 返回透视结果的二维数组
     */
    @ApiListField("data_list")
    @ApiField("analyze_data")
    private List<AnalyzeData> dataList;

    /**
     * 列的名字
     */
    @ApiListField("field_names_list")
    @ApiField("string")
    private List<String> fieldNamesList;

    /**
     * 返回类型
     */
    @ApiListField("field_types_list")
    @ApiField("string")
    private List<String> fieldTypesList;

    public List<AnalyzeData> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<AnalyzeData> dataList) {
        this.dataList = dataList;
    }

    public List<String> getFieldNamesList() {
        return this.fieldNamesList;
    }

    public void setFieldNamesList(List<String> fieldNamesList) {
        this.fieldNamesList = fieldNamesList;
    }

    public List<String> getFieldTypesList() {
        return this.fieldTypesList;
    }

    public void setFieldTypesList(List<String> fieldTypesList) {
        this.fieldTypesList = fieldTypesList;
    }

}
