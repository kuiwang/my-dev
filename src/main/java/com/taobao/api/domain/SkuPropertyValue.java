package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * SKU属性值
 *
 * @author auto create
 * @since 1.0, null
 */
public class SkuPropertyValue extends TaobaoObject {

    private static final long serialVersionUID = 8771678954473795736L;

    /**
     * sku属性url
     */
    @ApiField("img_url")
    private String imgUrl;

    /**
     * sku属性值名称
     */
    @ApiField("name")
    private String name;

    /**
     * sku属性值id
     */
    @ApiField("value_id")
    private String valueId;

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValueId() {
        return this.valueId;
    }

    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

}
