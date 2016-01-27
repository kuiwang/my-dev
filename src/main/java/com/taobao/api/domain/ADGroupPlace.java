package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 推广组与定向推广位置关系
 *
 * @author auto create
 * @since 1.0, null
 */
public class ADGroupPlace extends TaobaoObject {

    private static final long serialVersionUID = 3641872338897827741L;

    /**
     * 推广组ID
     */
    @ApiField("adgroup_id")
    private Long adgroupId;

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
     * 是否使用默认出价，0-不用；1-使用；
     */
    @ApiField("is_default_price")
    private Long isDefaultPrice;

    /**
     * 出价
     */
    @ApiField("max_price")
    private Long maxPrice;

    /**
     * 修改时间
     */
    @ApiField("modified_time")
    private Date modifiedTime;

    /**
     * 主人昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 位置标识
     */
    @ApiField("place_id")
    private Long placeId;

    /**
     * 位置名称
     */
    @ApiField("place_name")
    private String placeName;

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Long getIsDefaultPrice() {
        return this.isDefaultPrice;
    }

    public Long getMaxPrice() {
        return this.maxPrice;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public String getNick() {
        return this.nick;
    }

    public Long getPlaceId() {
        return this.placeId;
    }

    public String getPlaceName() {
        return this.placeName;
    }

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setIsDefaultPrice(Long isDefaultPrice) {
        this.isDefaultPrice = isDefaultPrice;
    }

    public void setMaxPrice(Long maxPrice) {
        this.maxPrice = maxPrice;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

}
