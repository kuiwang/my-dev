package com.scott.dev.taobao.api.caipiao.domain;

import java.util.Date;

/**
 * 卖家商品信息
 */
public class LotteryWangcaiSellerGoodsInfo {

    /**
     * 活动开始时间
     */
    private Date actBeginTime;

    /**
     * 活动结束时间
     */
    private Date actEndTime;

    /**
     * 商品id
     */
    private Long goodsId;

    /**
     * 彩种id
     */
    private Long lotteryTypeId;

    /**
     * 赠送类型：0：满就送，1：好评送，2：分享送，3：游戏送，4：收藏送
     */
    private Long presentType;

    public Date getActBeginTime() {
        return this.actBeginTime;
    }

    public void setActBeginTime(Date actBeginTime) {
        this.actBeginTime = actBeginTime;
    }

    public Date getActEndTime() {
        return this.actEndTime;
    }

    public void setActEndTime(Date actEndTime) {
        this.actEndTime = actEndTime;
    }

    public Long getGoodsId() {
        return this.goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getLotteryTypeId() {
        return this.lotteryTypeId;
    }

    public void setLotteryTypeId(Long lotteryTypeId) {
        this.lotteryTypeId = lotteryTypeId;
    }

    public Long getPresentType() {
        return this.presentType;
    }

    public void setPresentType(Long presentType) {
        this.presentType = presentType;
    }

}
