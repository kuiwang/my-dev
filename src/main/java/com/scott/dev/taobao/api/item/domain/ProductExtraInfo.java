package com.scott.dev.taobao.api.item.domain;

/*
 * 产品扩展信息
 */
public class ProductExtraInfo {

    /*
     * 产品ID
     */
    private Number productId;

    /*
     * 产品扩展信息键
     */
    private String fieldKey;

    /*
     * 产品扩展信息名称
     */
    private String fieldName;

    /*
     * 产品扩展信息简介
     */
    private String fieldValue;

    public Number getProductId() {
        return productId;
    }

    public void setProductId(Number productId) {
        this.productId = productId;
    }

    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }
}
