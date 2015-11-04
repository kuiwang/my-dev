package com.scott.dev.taobao.api.tae.domain;

/**
 * 运费信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class Carriage {

    /**
     * 运费
     */
    private String name;

    /**
     * 快递公司
     */
    private String price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
