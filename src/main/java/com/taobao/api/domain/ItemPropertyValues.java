package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 服务属性对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class ItemPropertyValues extends TaobaoObject {

    private static final long serialVersionUID = 3341418749128666176L;

    /**
     * 服务属性id
     */
    @ApiField("property_id")
    private Long propertyId;

    /**
     * 属性名称
     */
    @ApiField("property_name")
    private String propertyName;

    /**
     * 属性值列表.
     */
    @ApiListField("property_values")
    @ApiField("string")
    private List<String> propertyValues;

    public Long getPropertyId() {
        return this.propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return this.propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public List<String> getPropertyValues() {
        return this.propertyValues;
    }

    public void setPropertyValues(List<String> propertyValues) {
        this.propertyValues = propertyValues;
    }

}
