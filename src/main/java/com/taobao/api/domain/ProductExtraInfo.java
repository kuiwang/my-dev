package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 产品扩展信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class ProductExtraInfo extends TaobaoObject {

    private static final long serialVersionUID = 2679859566761358921L;

    /**
     * 产品扩展信息键
     */
    @ApiField("field_key")
    private String fieldKey;

    /**
     * 产品扩展信息名称
     */
    @ApiField("field_name")
    private String fieldName;

    /**
     * 产品扩展信息简介
     */
    @ApiField("field_value")
    private String fieldValue;

    /**
     * 产品ID
     */
    @ApiField("product_id")
    private Long productId;

    public String getFieldKey() {
        return this.fieldKey;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public String getFieldValue() {
        return this.fieldValue;
    }

    public Long getProductId() {
        return this.productId;
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

    public void setProductId(Long productId) {
        this.productId = productId;
    }

}
