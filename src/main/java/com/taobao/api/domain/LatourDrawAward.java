package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 抽奖奖品结果
 *
 * @author auto create
 * @since 1.0, null
 */
public class LatourDrawAward extends TaobaoObject {

    private static final long serialVersionUID = 6671814284769586516L;

    /**
     * 奖品id
     */
    @ApiField("award_id")
    private Long awardId;

    /**
     * 奖品文案
     */
    @ApiField("award_name")
    private String awardName;

    /**
     * 奖品类型：coupon、physicalPrize、tagging、unknown等等
     */
    @ApiField("award_type")
    private String awardType;

    /**
     * ext_value1
     */
    @ApiField("ext_value1")
    private String extValue1;

    /**
     * ext_value2
     */
    @ApiField("ext_value2")
    private String extValue2;

    /**
     * ext_value3
     */
    @ApiField("ext_value3")
    private String extValue3;

    /**
     * ext_value4
     */
    @ApiField("ext_value4")
    private String extValue4;

    /**
     * ext_value5
     */
    @ApiField("ext_value5")
    private String extValue5;

    /**
     * 奖品组
     */
    @ApiField("group_id")
    private Long groupId;

    /**
     * 是否中奖
     */
    @ApiField("is_win")
    private Boolean isWin;

    /**
     * 未中奖原因
     */
    @ApiField("reason")
    private String reason;

    /**
     * 中奖记录id
     */
    @ApiField("winning_record_id")
    private Long winningRecordId;

    /**
     * 中奖时间
     */
    @ApiField("winning_time")
    private Date winningTime;

    public Long getAwardId() {
        return this.awardId;
    }

    public void setAwardId(Long awardId) {
        this.awardId = awardId;
    }

    public String getAwardName() {
        return this.awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAwardType() {
        return this.awardType;
    }

    public void setAwardType(String awardType) {
        this.awardType = awardType;
    }

    public String getExtValue1() {
        return this.extValue1;
    }

    public void setExtValue1(String extValue1) {
        this.extValue1 = extValue1;
    }

    public String getExtValue2() {
        return this.extValue2;
    }

    public void setExtValue2(String extValue2) {
        this.extValue2 = extValue2;
    }

    public String getExtValue3() {
        return this.extValue3;
    }

    public void setExtValue3(String extValue3) {
        this.extValue3 = extValue3;
    }

    public String getExtValue4() {
        return this.extValue4;
    }

    public void setExtValue4(String extValue4) {
        this.extValue4 = extValue4;
    }

    public String getExtValue5() {
        return this.extValue5;
    }

    public void setExtValue5(String extValue5) {
        this.extValue5 = extValue5;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Boolean getIsWin() {
        return this.isWin;
    }

    public void setIsWin(Boolean isWin) {
        this.isWin = isWin;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Long getWinningRecordId() {
        return this.winningRecordId;
    }

    public void setWinningRecordId(Long winningRecordId) {
        this.winningRecordId = winningRecordId;
    }

    public Date getWinningTime() {
        return this.winningTime;
    }

    public void setWinningTime(Date winningTime) {
        this.winningTime = winningTime;
    }

}
