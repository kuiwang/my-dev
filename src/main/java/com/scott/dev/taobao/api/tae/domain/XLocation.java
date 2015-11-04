package com.scott.dev.taobao.api.tae.domain;

/**
 * 位置信息
 */
public class XLocation {

    /**
     * 商品所在市
     */
    private String city;

    /**
     * 商品所在省
     */
    private String state;

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
