package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 优惠券数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class Coupon extends TaobaoObject {

    private static final long serialVersionUID = 4223912921186684941L;

    /**
     * 订单满多少分才能用这个优惠券，501就是满501分能使用。注意：返回的是“分”，不是“元”
     */
    @ApiField("condition")
    private Long condition;

    /**
     * 优惠券ID
     */
    @ApiField("coupon_id")
    private Long couponId;

    /**
     * 优惠券的创建渠道，自己创建/他人创建
     */
    @ApiField("create_channel")
    private String createChannel;

    /**
     * 优惠券创建时间
     */
    @ApiField("creat_time")
    private Date creatTime;

    /**
     * 优惠券的面值，返回的是“分”，不是“元”，500代表500分相当于5元
     */
    @ApiField("denominations")
    private Long denominations;

    /**
     * 优惠券的截止日期
     */
    @ApiField("end_time")
    private Date endTime;

    public Long getCondition() {
        return this.condition;
    }

    public Long getCouponId() {
        return this.couponId;
    }

    public String getCreateChannel() {
        return this.createChannel;
    }

    public Date getCreatTime() {
        return this.creatTime;
    }

    public Long getDenominations() {
        return this.denominations;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setCondition(Long condition) {
        this.condition = condition;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public void setCreateChannel(String createChannel) {
        this.createChannel = createChannel;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public void setDenominations(Long denominations) {
        this.denominations = denominations;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

}
