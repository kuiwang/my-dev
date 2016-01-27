package com.scott.dev.taobao.api.tmallinteract.domain;

import java.util.Date;

/**
 * 抽奖奖品结果
 */
public class LatourDrawAward {

    /**
     * 奖品id
     */
    private Long awardId;

    /**
     * 奖品文案
     */
    private String awardName;

    /**
     * 奖品类型：coupon、physicalPrize、tagging、unknown等等
     */
    private String awardType;

    /**
     * ext_value1
     */
    private String extValue1;

    /**
     * ext_value2
     */
    private String extValue2;

    /**
     * ext_value3
     */
    private String extValue3;

    /**
     * ext_value4
     */
    private String extValue4;

    /**
     * ext_value5
     */
    private String extValue5;

    /**
     * 奖品组
     */
    private Long groupId;

    /**
     * 是否中奖
     */
    private Boolean isWin;

    /**
     * 未中奖原因
     */
    private String reason;

    /**
     * 中奖记录id
     */
    private Long winningRecordId;

    /**
     * 中奖时间
     */
    private Date winningTime;

    public Long getAwardId() {
        return this.awardId;
    }

    public String getAwardName() {
        return this.awardName;
    }

    public String getAwardType() {
        return this.awardType;
    }

    public String getExtValue1() {
        return this.extValue1;
    }

    public String getExtValue2() {
        return this.extValue2;
    }

    public String getExtValue3() {
        return this.extValue3;
    }

    public String getExtValue4() {
        return this.extValue4;
    }

    public String getExtValue5() {
        return this.extValue5;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public Boolean getIsWin() {
        return this.isWin;
    }

    public String getReason() {
        return this.reason;
    }

    public Long getWinningRecordId() {
        return this.winningRecordId;
    }

    public Date getWinningTime() {
        return this.winningTime;
    }

    public void setAwardId(Long awardId) {
        this.awardId = awardId;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public void setAwardType(String awardType) {
        this.awardType = awardType;
    }

    public void setExtValue1(String extValue1) {
        this.extValue1 = extValue1;
    }

    public void setExtValue2(String extValue2) {
        this.extValue2 = extValue2;
    }

    public void setExtValue3(String extValue3) {
        this.extValue3 = extValue3;
    }

    public void setExtValue4(String extValue4) {
        this.extValue4 = extValue4;
    }

    public void setExtValue5(String extValue5) {
        this.extValue5 = extValue5;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public void setIsWin(Boolean isWin) {
        this.isWin = isWin;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setWinningRecordId(Long winningRecordId) {
        this.winningRecordId = winningRecordId;
    }

    public void setWinningTime(Date winningTime) {
        this.winningTime = winningTime;
    }

}
