package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 机票订单的详情
 *
 * @author auto create
 * @since 1.0, null
 */
public class TripOrder extends TaobaoObject {

    private static final long serialVersionUID = 1581787132779944558L;

    /**
     * 订单基础信息
     */
    @ApiField("base_info")
    private TripBaseInfo baseInfo;

    /**
     * 订单行政购票信息
     */
    @ApiField("corp_info")
    private CorpInfo corpInfo;

    /**
     * 扩展字段
     */
    @ApiField("extra")
    private String extra;

    /**
     * 订单航班信息（包含航班乘机人）
     */
    @ApiListField("flight_infos")
    @ApiField("trip_flight_info")
    private List<TripFlightInfo> flightInfos;

    /**
     * 订单行程单信息
     */
    @ApiField("itinerary")
    private Itinerary itinerary;

    public TripBaseInfo getBaseInfo() {
        return this.baseInfo;
    }

    public CorpInfo getCorpInfo() {
        return this.corpInfo;
    }

    public String getExtra() {
        return this.extra;
    }

    public List<TripFlightInfo> getFlightInfos() {
        return this.flightInfos;
    }

    public Itinerary getItinerary() {
        return this.itinerary;
    }

    public void setBaseInfo(TripBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public void setCorpInfo(CorpInfo corpInfo) {
        this.corpInfo = corpInfo;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setFlightInfos(List<TripFlightInfo> flightInfos) {
        this.flightInfos = flightInfos;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

}
