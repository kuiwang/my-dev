package com.scott.dev.taobao.api.item.domain;

/*
 * 产品扩展信息
 */
public class ProductExtraInfo {

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

    /*
     * 产品ID
     */
    private Number productId;

    public String getFieldKey() {
        return fieldKey;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public Number getProductId() {
        return productId;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public void setProductId(Number productId) {
        this.productId = productId;
    }
}
