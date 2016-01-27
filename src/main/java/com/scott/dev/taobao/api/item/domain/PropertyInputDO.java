package com.scott.dev.taobao.api.item.domain;

/*
 * 属性输入特征DO
 */
public class PropertyInputDO {

    /*
     * property_id对应的属性是否可输入
     */
    private Boolean isAllowInput;

    /*
     * 如果property_id对应的属性是子属性，is_root_allow_input标识该子属性的顶级父属性是否可输入。
     * 否则is_root_allow_input和is_allow_input 值是一样的。
     * 目前只有品牌会出现父属性不可输入，子属性可输入的情况
     */
    private Boolean isRootAllowInput;

    /*
     * property_id对应的属性是不是子属性
     */
    private Boolean isSubProperty;

    /*
     * 属性ID
     */
    private Number propertyId;

    public Boolean getIsAllowInput() {
        return isAllowInput;
    }

    public Boolean getIsRootAllowInput() {
        return isRootAllowInput;
    }

    public Boolean getIsSubProperty() {
        return isSubProperty;
    }

    public Number getPropertyId() {
        return propertyId;
    }

    public void setIsAllowInput(Boolean isAllowInput) {
        this.isAllowInput = isAllowInput;
    }

    public void setIsRootAllowInput(Boolean isRootAllowInput) {
        this.isRootAllowInput = isRootAllowInput;
    }

    public void setIsSubProperty(Boolean isSubProperty) {
        this.isSubProperty = isSubProperty;
    }

    public void setPropertyId(Number propertyId) {
        this.propertyId = propertyId;
    }
}
