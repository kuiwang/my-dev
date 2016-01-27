package com.scott.dev.taobao.api;

import com.taobao.api.TaobaoObject;

/**
 * 价格单元
 *
 * @author auto create
 * @since 1.0, null
 */
public class Price extends TaobaoObject {

    private static final long serialVersionUID = 7241285376658824481L;

    /**
     * 价格Label
     */
    private String name;

    /**
     * 售卖价格,单位元
     */
    private String price;

    /**
     * price后面的tips
     */
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
