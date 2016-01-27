package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 推广组
 *
 * @author auto create
 * @since 1.0, null
 */
public class ADGroup extends TaobaoObject {

    private static final long serialVersionUID = 6225394177563417795L;

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
     * 商品类目id，从根类目到子类目，用空格分割
     */
    @ApiField("category_ids")
    private String categoryIds;

    /**
     * 创建时间
     */
    @ApiField("create_time")
    private Date createTime;

    /**
     * 默认出价，单位为分，不能小于5
     */
    @ApiField("default_price")
    private Long defaultPrice;

    /**
     * 非搜索是否使用默认出价，false-不用；true-使用；默认为true;
     */
    @ApiField("is_nonsearch_default_price")
    private Boolean isNonsearchDefaultPrice;

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
     * 非搜索出价，单位为分，不能小于5
     */
    @ApiField("nonsearch_max_price")
    private Long nonsearchMaxPrice;

    /**
     * 通投状态,1：开启；0：暂停；默认为1
     */
    @ApiField("nonsearch_status")
    private Long nonsearchStatus;

    /**
     * 商品数字id
     */
    @ApiField("num_iid")
    private Long numIid;

    /**
     * online-上线；audit_offline-审核下线；crm_offline-CRM下线；默认为online
     */
    @ApiField("offline_type")
    private String offlineType;

    /**
     * 用户设置的上下线状态，offline-下线(暂停竞价)；online-上线；默认为online
     */
    @ApiField("online_status")
    private String onlineStatus;

    /**
     * 审核下线原因
     */
    @ApiField("reason")
    private String reason;

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Long getDefaultPrice() {
        return this.defaultPrice;
    }

    public Boolean getIsNonsearchDefaultPrice() {
        return this.isNonsearchDefaultPrice;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public String getNick() {
        return this.nick;
    }

    public Long getNonsearchMaxPrice() {
        return this.nonsearchMaxPrice;
    }

    public Long getNonsearchStatus() {
        return this.nonsearchStatus;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public String getOfflineType() {
        return this.offlineType;
    }

    public String getOnlineStatus() {
        return this.onlineStatus;
    }

    public String getReason() {
        return this.reason;
    }

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setDefaultPrice(Long defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public void setIsNonsearchDefaultPrice(Boolean isNonsearchDefaultPrice) {
        this.isNonsearchDefaultPrice = isNonsearchDefaultPrice;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNonsearchMaxPrice(Long nonsearchMaxPrice) {
        this.nonsearchMaxPrice = nonsearchMaxPrice;
    }

    public void setNonsearchStatus(Long nonsearchStatus) {
        this.nonsearchStatus = nonsearchStatus;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public void setOfflineType(String offlineType) {
        this.offlineType = offlineType;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
