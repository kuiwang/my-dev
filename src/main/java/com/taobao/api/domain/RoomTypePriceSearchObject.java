package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 房型价格结果对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class RoomTypePriceSearchObject extends TaobaoObject {

    private static final long serialVersionUID = 6828973365751365153L;

    /**
     * 房型名称
     */
    @ApiField("name")
    private String name;

    /**
     * rate列表
     */
    @ApiListField("rates")
    @ApiField("hotel_price_rate")
    private List<HotelPriceRate> rates;

    /**
     * 标准酒店id
     */
    @ApiField("srid")
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
