package com.scott.dev.taobao.api.airticket.domain;

import java.util.List;

/**
 * 国内机票订单数据结构【top订单优化】
 */
public class AtOrder {

    /**
     * 订单基础信息
     */
    private BaseInfo baseInfo;

    /**
     * 订单行政购票信息
     */
    private CorpInfo corpInfo;

    /**
     * 扩展字段
     */
    private String extra;

    /**
     * 订单行程单信息
     */
    private Itinerary itinerary;

    /**
     * 订单航段信息
     */
    private List<SegmentInfo> segmentInfos;

    public BaseInfo getBaseInfo() {
        return this.baseInfo;
    }

    public CorpInfo getCorpInfo() {
        return this.corpInfo;
    }

    public String getExtra() {
        return this.extra;
    }

    public Itinerary getItinerary() {
        return this.itinerary;
    }

    public List<SegmentInfo> getSegmentInfos() {
        return this.segmentInfos;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public void setCorpInfo(CorpInfo corpInfo) {
        this.corpInfo = corpInfo;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public void setSegmentInfos(List<SegmentInfo> segmentInfos) {
        this.segmentInfos = segmentInfos;
    }

}
