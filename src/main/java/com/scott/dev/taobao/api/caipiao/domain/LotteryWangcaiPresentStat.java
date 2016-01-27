package com.scott.dev.taobao.api.caipiao.domain;

/**
 * 彩票赠送的统计数据DO
 */
public class LotteryWangcaiPresentStat {

    /**
     * 日期
     */
    private Long dateId;

    /**
     * 当日赠送彩票的金额
     */
    private Long presentFee;

    /**
     * 当日赠送彩票的注数
     */
    private Long presentStake;

    /**
     * 当日赠送用户数
     */
    private Long presentUser;

    /**
     * 送彩方的淘宝数字ID
     */
    private Long sellerId;

    public Long getDateId() {
        return this.dateId;
    }

    public Long getPresentFee() {
        return this.presentFee;
    }

    public Long getPresentStake() {
        return this.presentStake;
    }

    public Long getPresentUser() {
        return this.presentUser;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setDateId(Long dateId) {
        this.dateId = dateId;
    }

    public void setPresentFee(Long presentFee) {
        this.presentFee = presentFee;
    }

    public void setPresentStake(Long presentStake) {
        this.presentStake = presentStake;
    }

    public void setPresentUser(Long presentUser) {
        this.presentUser = presentUser;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

}
