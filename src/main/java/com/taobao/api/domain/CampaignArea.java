package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 推广计划的投放地域
 *
 * @author auto create
 * @since 1.0, null
 */
public class CampaignArea extends TaobaoObject {

    private static final long serialVersionUID = 6173782271766391414L;

    /**
     * 值为：“all”；或者用“,”分割的数字，数字必须是直通车全国省市列表的AreaID，如果已经包含省、自治区id，
     * 请不要再包括省内市的id；
     */
    @ApiField("area")
    private String area;

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

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

}
