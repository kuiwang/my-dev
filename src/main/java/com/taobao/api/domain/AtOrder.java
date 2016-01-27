package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 国内机票订单数据结构【top订单优化】
 *
 * @author auto create
 * @since 1.0, null
 */
public class AtOrder extends TaobaoObject {

    private static final long serialVersionUID = 5663933957193364638L;

    /**
     * 订单基础信息
     */
    @ApiField("base_info")
    private BaseInfo baseInfo;

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
     * 订单行程单信息
     */
    @ApiField("itinerary")
    private Itinerary itinerary;

    /**
     * 订单航段信息
     */
    @ApiListField("segment_infos")
    @ApiField("segment_info")
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
