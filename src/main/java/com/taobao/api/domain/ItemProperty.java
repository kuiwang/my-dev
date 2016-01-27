package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商品属性
 *
 * @author auto create
 * @since 1.0, null
 */
public class ItemProperty extends TaobaoObject {

    private static final long serialVersionUID = 3179493597681159388L;

    /**
     * 商品属性名
     */
    @ApiField("name")
    private String name;

    /**
     * 商值属性值
     */
    @ApiField("value")
    private String value;

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
