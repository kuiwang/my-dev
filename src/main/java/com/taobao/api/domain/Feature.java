package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 类目属性
 *
 * @author auto create
 * @since 1.0, null
 */
public class Feature extends TaobaoObject {

    private static final long serialVersionUID = 6398725163454821855L;

    /**
     * 属性键
     */
    @ApiField("attr_key")
    private String attrKey;

    /**
     * 属性值
     */
    @ApiField("attr_value")
    private String attrValue;

    public String getAttrKey() {
        return this.attrKey;
    }

    public String getAttrValue() {
        return this.attrValue;
    }

    public void setAttrKey(String attrKey) {
        this.attrKey = attrKey;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

}
