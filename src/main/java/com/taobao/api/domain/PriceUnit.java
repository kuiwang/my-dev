package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 价格单元
 *
 * @author auto create
 * @since 1.0, null
 */
public class PriceUnit extends TaobaoObject {

    private static final long serialVersionUID = 7241285376658824481L;

    /**
     * 价格Label
     */
    @ApiField("name")
    private String name;

    /**
     * 售卖价格,单位元
     */
    @ApiField("price")
    private String price;

    /**
     * price后面的tips
     */
    @ApiField("tips")
    private String tips;

    public String getName() {
        return this.name;
    }

    public String getPrice() {
        return this.price;
    }

    public String getTips() {
        return this.tips;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

}
