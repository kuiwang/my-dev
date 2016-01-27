package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 运费信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class Carriage extends TaobaoObject {

    private static final long serialVersionUID = 6355778937148468642L;

    /**
     * 运费
     */
    @ApiField("name")
    private String name;

    /**
     * 快递公司
     */
    @ApiField("price")
    private String price;

    public String getName() {
        return this.name;
    }

    public String getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
