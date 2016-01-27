package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 旺彩赠送DO
 *
 * @author auto create
 * @since 1.0, null
 */
public class LotteryWangcaiPresent extends TaobaoObject {

    private static final long serialVersionUID = 2125578969171247885L;

    /**
     * isv应用的名称
     */
    @ApiField("app_name")
    private String appName;

    /**
     * 彩种名称
     */
    @ApiField("lottery_name")
    private String lotteryName;

    /**
     * 赠送时间
     */
    @ApiField("present_date")
    private Date presentDate;

    /**
     * 主键id
     */
    @ApiField("present_id")
    private Long presentId;

    /**
     * 彩票注数
     */
    @ApiField("stake_count")
    private Long stakeCount;

    /**
     * 订单状态
     */
    @ApiField("status")
    private Long status;

    /**
     * 订单状态描述
     */
    @ApiField("status_desc")
    private String statusDesc;

    /**
     * 赠言
     */
    @ApiField("sweety_words")
    private String sweetyWords;

    /**
     * 用户昵称
     */
    @ApiField("user_nick")
    private String userNick;

    /**
     * 用户数字id
     */
    @ApiField("user_num_id")
    private Long userNumId;

    /**
     * 中奖金额，以分为单位
     */
    @ApiField("win_fee")
    private Long winFee;

    public String getAppName() {
        return this.appName;
    }

    public String getLotteryName() {
        return this.lotteryName;
    }

    public Date getPresentDate() {
        return this.presentDate;
    }

    public Long getPresentId() {
        return this.presentId;
    }

    public Long getStakeCount() {
        return this.stakeCount;
    }

    public Long getStatus() {
        return this.status;
    }

    public String getStatusDesc() {
        return this.statusDesc;
    }

    public String getSweetyWords() {
        return this.sweetyWords;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public Long getUserNumId() {
        return this.userNumId;
    }

    public Long getWinFee() {
        return this.winFee;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public void setPresentDate(Date presentDate) {
        this.presentDate = presentDate;
    }

    public void setPresentId(Long presentId) {
        this.presentId = presentId;
    }

    public void setStakeCount(Long stakeCount) {
        this.stakeCount = stakeCount;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public void setSweetyWords(String sweetyWords) {
        this.sweetyWords = sweetyWords;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public void setUserNumId(Long userNumId) {
        this.userNumId = userNumId;
    }

    public void setWinFee(Long winFee) {
        this.winFee = winFee;
    }

}
