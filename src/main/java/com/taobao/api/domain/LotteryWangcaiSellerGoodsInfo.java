package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 卖家商品信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class LotteryWangcaiSellerGoodsInfo extends TaobaoObject {

    private static final long serialVersionUID = 6483467781569129612L;

    /**
     * 活动开始时间
     */
    @ApiField("act_begin_time")
    private Date actBeginTime;

    /**
     * 活动结束时间
     */
    @ApiField("act_end_time")
    private Date actEndTime;

    /**
     * 商品id
     */
    @ApiField("goods_id")
    private Long goodsId;

    /**
     * 彩种id
     */
    @ApiField("lottery_type_id")
    private Long lotteryTypeId;

    /**
     * 赠送类型：0：满就送，1：好评送，2：分享送，3：游戏送，4：收藏送
     */
    @ApiField("present_type")
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
