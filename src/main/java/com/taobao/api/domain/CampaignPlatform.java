package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 推广计划的投放平台
 *
 * @author auto create
 * @since 1.0, null
 */
public class CampaignPlatform extends TaobaoObject {

    private static final long serialVersionUID = 1612553164247271439L;

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
     * 无线折扣百分比。必须大于等于1，小于等于200的整数
     */
    @ApiField("mobile_discount")
    private Long mobileDiscount;

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
     * 非搜索投放频道代码数组，频道代码必须是直通车非搜索类频道列表中的值。？
     */
    @ApiListField("nonsearch_channels")
    @ApiField("number")
    private List<Long> nonsearchChannels;

    /**
     * 溢价的百分比，必须是大于等于 1小于等于200的整数
     */
    @ApiField("outside_discount")
    private Long outsideDiscount;

    /**
     * 搜索投放频道代码数组，频道代码必须是直通车搜索类频道列表中的值。
     */
    @ApiListField("search_channels")
    @ApiField("number")
    private List<Long> searchChannels;

    public Long getCampaignId() {
        return this.campaignId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Long getMobileDiscount() {
        return this.mobileDiscount;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public String getNick() {
        return this.nick;
    }

    public List<Long> getNonsearchChannels() {
        return this.nonsearchChannels;
    }

    public Long getOutsideDiscount() {
        return this.outsideDiscount;
    }

    public List<Long> getSearchChannels() {
        return this.searchChannels;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setMobileDiscount(Long mobileDiscount) {
        this.mobileDiscount = mobileDiscount;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNonsearchChannels(List<Long> nonsearchChannels) {
        this.nonsearchChannels = nonsearchChannels;
    }

    public void setOutsideDiscount(Long outsideDiscount) {
        this.outsideDiscount = outsideDiscount;
    }

    public void setSearchChannels(List<Long> searchChannels) {
        this.searchChannels = searchChannels;
    }

}
