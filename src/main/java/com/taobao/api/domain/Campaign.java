package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 推广计划
 *
 * @author auto create
 * @since 1.0, null
 */
public class Campaign extends TaobaoObject {

    private static final long serialVersionUID = 3667125635557141869L;

    /**
     * 推广计划ID
     */
    @ApiField("campaign_id")
    private Long campaignId;

    /**
     * 创建时间
     */
    @ApiField("create_time")
    private Date createTime;

    /**
     * 最后修改时间
     */
    @ApiField("modified_time")
    private Date modifiedTime;

    /**
     * 主人昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 用户设置的上下限状态；offline-下线；online-上线；
     */
    @ApiField("online_status")
    private String onlineStatus;

    /**
     * 推广计划结算下线原因，1-余额不足；2-超过日限额，以分号分隔多个下线原因
     */
    @ApiField("settle_reason")
    private String settleReason;

    /**
     * 推广计划结算状态，offline-下线；online-上线，
     */
    @ApiField("settle_status")
    private String settleStatus;

    /**
     * 推广计划名称，不能多余20个汉字
     */
    @ApiField("title")
    private String title;

    public Long getCampaignId() {
        return this.campaignId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public String getNick() {
        return this.nick;
    }

    public String getOnlineStatus() {
        return this.onlineStatus;
    }

    public String getSettleReason() {
        return this.settleReason;
    }

    public String getSettleStatus() {
        return this.settleStatus;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public void setSettleReason(String settleReason) {
        this.settleReason = settleReason;
    }

    public void setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
