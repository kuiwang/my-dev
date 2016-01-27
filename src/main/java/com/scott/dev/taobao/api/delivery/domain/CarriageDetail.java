package com.scott.dev.taobao.api.delivery.domain;

/*
 * 物流公司资费相关信息
 */
public class CarriageDetail {

    /*
     * 续费（单位：元）
     */
    private Number addFee;

    /*
     * 续重（单位：千克）
     */
    private Number addWeight;

    /*
     * 破损赔付
     */
    private String damagePayment;

    /*
     * 物流公司揽收时间段
     */
    private String gotTime;

    /*
     * 首费（单位：元）
     */
    private Number initialFee;

    /*
     * 首重（单位：千克）
     */
    private Number initialWeight;

    /*
     * 丢单赔付
     */
    private String lostPayment;

    /*
     * 快件送达所需的时间(单位：天)
     */
    private String wayDay;

    public Number getAddFee() {
        return addFee;
    }

    public Number getAddWeight() {
        return addWeight;
    }

    public String getDamagePayment() {
        return damagePayment;
    }

    public String getGotTime() {
        return gotTime;
    }

    public Number getInitialFee() {
        return initialFee;
    }

    public Number getInitialWeight() {
        return initialWeight;
    }

    public String getLostPayment() {
        return lostPayment;
    }

    public String getWayDay() {
        return wayDay;
    }

    public void setAddFee(Number addFee) {
        this.addFee = addFee;
    }

    public void setAddWeight(Number addWeight) {
        this.addWeight = addWeight;
    }

    public void setDamagePayment(String damagePayment) {
        this.damagePayment = damagePayment;
    }

    public void setGotTime(String gotTime) {
        this.gotTime = gotTime;
    }

    public void setInitialFee(Number initialFee) {
        this.initialFee = initialFee;
    }

    public void setInitialWeight(Number initialWeight) {
        this.initialWeight = initialWeight;
    }

    public void setLostPayment(String lostPayment) {
        this.lostPayment = lostPayment;
    }

    public void setWayDay(String wayDay) {
        this.wayDay = wayDay;
    }

}
