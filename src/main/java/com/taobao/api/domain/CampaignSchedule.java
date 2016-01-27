package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 推广计划的分时折扣设置
 *
 * @author auto create
 * @since 1.0, null
 */
public class CampaignSchedule extends TaobaoObject {

    private static final long serialVersionUID = 2199782167898445339L;

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
     * 值为：“all”；或者用“;”分割的每天的设置字符串，该字符串为用“,”分割的时段折扣字符串，格式为：起始时间-结束时间:折扣，
     * 其中时间是24小时格式记录18:30，，折扣是1-150整数，表示折扣百分比；
     */
    @ApiField("schedule")
    private String schedule;

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

    public String getSchedule() {
        return this.schedule;
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

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

}
