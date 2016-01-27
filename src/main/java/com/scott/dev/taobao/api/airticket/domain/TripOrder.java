package com.scott.dev.taobao.api.airticket.domain;

import java.util.List;

/**
 * 机票订单的详情
 */
public class TripOrder {

    /**
     * 订单基础信息
     */
    private TripBaseInfo baseInfo;

    /**
     * 订单行政购票信息
     */
    private CorpInfo corpInfo;

    /**
     * 扩展字段
     */
    private String extra;

    /**
     * 订单航班信息（包含航班乘机人）
     */
    private List<TripFlightInfo> flightInfos;

    /**
     * 订单行程单信息
     */
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
