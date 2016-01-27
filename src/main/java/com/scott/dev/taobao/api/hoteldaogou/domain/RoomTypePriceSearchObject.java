package com.scott.dev.taobao.api.hoteldaogou.domain;

import java.util.List;

/**
 * 房型价格结果对象
 */
public class RoomTypePriceSearchObject {

    /**
     * 房型名称
     */
    private String name;

    /**
     * rate列表
     */
    private List<HotelPriceRate> rates;

    /**
     * 标准酒店id
     */
    private Long srid;

    public String getName() {
        return this.name;
    }

    public List<HotelPriceRate> getRates() {
        return this.rates;
    }

    public Long getSrid() {
        return this.srid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRates(List<HotelPriceRate> rates) {
        this.rates = rates;
    }

    public void setSrid(Long srid) {
        this.srid = srid;
    }

}
