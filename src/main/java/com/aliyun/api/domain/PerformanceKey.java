package com.aliyun.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 性能参数列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class PerformanceKey extends TaobaoObject {

    private static final long serialVersionUID = 1785812952982135975L;

    /**
     * 性能参数
     */
    @ApiField("Key")
    private String key;

    /**
     * 展示单位
     */
    @ApiField("Unit")
    private String unit;

    /**
     * 值格式
     */
    @ApiField("ValueFormat")
    private String valueFormat;

    /**
     * 性能值列表
     */
    @ApiListField("Values")
    @ApiField("PerformanceValue")
    private List<PerformanceValue> values;

    public String getKey() {
        return this.key;
    }

    public String getUnit() {
        return this.unit;
    }

    public String getValueFormat() {
        return this.valueFormat;
    }

    public List<PerformanceValue> getValues() {
        return this.values;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setValueFormat(String valueFormat) {
        this.valueFormat = valueFormat;
    }

    public void setValues(List<PerformanceValue> values) {
        this.values = values;
    }

}
