package com.scott.dev.taobao.api.delivery.domain;

/*
 * 物流公司资费相关信息
 */
public class CarriageDetail {

    /*
     * 物流公司揽收时间段
     */
    private String gotTime;

    /*
     * 快件送达所需的时间(单位：天)
     */
    private String wayDay;

    /*
     * 首重（单位：千克）
     */
    private Number initialWeight;

    /*
     * 首费（单位：元）
     */
    private Number initialFee;

    /*
     * 续重（单位：千克）
     */
    private Number addWeight;

    /*
     * 续费（单位：元）
     */
    private Number addFee;

    /*
     * 丢单赔付
     */
    private String lostPayment;

    /*
     * 破损赔付
     */
    private String damagePayment;

    public String getGotTime() {
        return gotTime;
    }

    public void setGotTime(String gotTime) {
        this.gotTime = gotTime;
    }

    public String getWayDay() {
        return wayDay;
    }

    public void setWayDay(String wayDay) {
        this.wayDay = wayDay;
    }

    public Number getInitialWeight() {
        return initialWeight;
    }

    public void setInitialWeight(Number initialWeight) {
        this.initialWeight = initialWeight;
    }

    public Number getInitialFee() {
        return initialFee;
    }

    public void setInitialFee(Number initialFee) {
        this.initialFee = initialFee;
    }

    public Number getAddWeight() {
        return addWeight;
    }

    public void setAddWeight(Number addWeight) {
        this.addWeight = addWeight;
    }

    public Number getAddFee() {
        return addFee;
    }

    public void setAddFee(Number addFee) {
        this.addFee = addFee;
    }

    public String getLostPayment() {
        return lostPayment;
    }

    public void setLostPayment(String lostPayment) {
        this.lostPayment = lostPayment;
    }

    public String getDamagePayment() {
        return damagePayment;
    }

    public void setDamagePayment(String damagePayment) {
        this.damagePayment = damagePayment;
    }

}
