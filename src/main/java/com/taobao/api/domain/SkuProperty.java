package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * SKU属性
 *
 * @author auto create
 * @since 1.0, null
 */
public class SkuProperty extends TaobaoObject {

    private static final long serialVersionUID = 8764631995711776696L;

    /**
     * sku属性id
     */
    @ApiField("prop_id")
    private String propId;

    /**
     * sku属性名称
     */
    @ApiField("prop_name")
    private String propName;

    /**
     * SKU属性值
     */
    @ApiListField("values")
    @ApiField("sku_property_value")
    private List<SkuPropertyValue> values;

    public String getPropId() {
        return this.propId;
    }

    public void setPropId(String propId) {
        this.propId = propId;
    }

    public String getPropName() {
        return this.propName;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public List<SkuPropertyValue> getValues() {
        return this.values;
    }

    public void setValues(List<SkuPropertyValue> values) {
        this.values = values;
    }

}
