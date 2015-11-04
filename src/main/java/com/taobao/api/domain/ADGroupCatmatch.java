package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 推广组类目出价
 *
 * @author auto create
 * @since 1.0, null
 */
public class ADGroupCatmatch extends TaobaoObject {

    private static final long serialVersionUID = 1892628944274995424L;

    /**
     * 推广组id
     */
    @ApiField("adgroup_id")
    private Long adgroupId;

    /**
     * 推广计划Id
     */
    @ApiField("campaign_id")
    private Long campaignId;

    /**
     * 类目出价Id
     */
    @ApiField("catmatch_id")
    private Long catmatchId;

    /**
     * 创建时间
     */
    @ApiField("create_time")
    private Date createTime;

    /**
     * 是否使用推广组默认出价，false-不使用默认出价 true-使用默认出价；默认true
     */
    @ApiField("is_default_price")
    private Boolean isDefaultPrice;

    /**
     * 类目出价，单位为分，不能小于5
     */
    @ApiField("max_price")
    private Long maxPrice;

    /**
     * 最后修改时间
     */
    @ApiField("modified_time")
    private Date modifiedTime;

    /**
     * 推广组主人昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 是否启用类目出价；offline-不启用；online-启用；默认启用
     */
    @ApiField("online_status")
    private String onlineStatus;

    /**
     * 类目出价质量得分
     */
    @ApiField("qscore")
    private String qscore;

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public Long getCatmatchId() {
        return this.catmatchId;
    }

    public void setCatmatchId(Long catmatchId) {
        this.catmatchId = catmatchId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsDefaultPrice() {
        return this.isDefaultPrice;
    }

    public void setIsDefaultPrice(Boolean isDefaultPrice) {
        this.isDefaultPrice = isDefaultPrice;
    }

    public Long getMaxPrice() {
        return this.maxPrice;
    }

    public void setMaxPrice(Long maxPrice) {
        this.maxPrice = maxPrice;
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

    public String getOnlineStatus() {
        return this.onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getQscore() {
        return this.qscore;
    }

    public void setQscore(String qscore) {
        this.qscore = qscore;
    }

}
