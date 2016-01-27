package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 物流公司资费相关信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class CarriageDetail extends TaobaoObject {

    private static final long serialVersionUID = 4455997758345244547L;

    /**
     * 续费（单位：元）
     */
    @ApiField("add_fee")
    private Long addFee;

    /**
     * 续重（单位：千克）
     */
    @ApiField("add_weight")
    private Long addWeight;

    /**
     * 破损赔付
     */
    @ApiField("damage_payment")
    private String damagePayment;

    /**
     * 物流公司揽收时间段
     */
    @ApiField("got_time")
    private String gotTime;

    /**
     * 首费（单位：元）
     */
    @ApiField("initial_fee")
    private Long initialFee;

    /**
     * 首重（单位：千克）
     */
    @ApiField("initial_weight")
    private Long initialWeight;

    /**
     * 丢单赔付
     */
    @ApiField("lost_payment")
    private String lostPayment;

    /**
     * 快件送达所需的时间(单位：天)
     */
    @ApiField("way_day")
    private String wayDay;

    public Long getAddFee() {
        return this.addFee;
    }

    public Long getAddWeight() {
        return this.addWeight;
    }

    public String getDamagePayment() {
        return this.damagePayment;
    }

    public String getGotTime() {
        return this.gotTime;
    }

    public Long getInitialFee() {
        return this.initialFee;
    }

    public Long getInitialWeight() {
        return this.initialWeight;
    }

    public String getLostPayment() {
        return this.lostPayment;
    }

    public String getWayDay() {
        return this.wayDay;
    }

    public void setAddFee(Long addFee) {
        this.addFee = addFee;
    }

    public void setAddWeight(Long addWeight) {
        this.addWeight = addWeight;
    }

    public void setDamagePayment(String damagePayment) {
        this.damagePayment = damagePayment;
    }

    public void setGotTime(String gotTime) {
        this.gotTime = gotTime;
    }

    public void setInitialFee(Long initialFee) {
        this.initialFee = initialFee;
    }

    public void setInitialWeight(Long initialWeight) {
        this.initialWeight = initialWeight;
    }

    public void setLostPayment(String lostPayment) {
        this.lostPayment = lostPayment;
    }

    public void setWayDay(String wayDay) {
        this.wayDay = wayDay;
    }

}
