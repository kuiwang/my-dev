package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 投放人群设置
 *
 * @author auto create
 * @since 1.0, null
 */
public class DemographicSetting extends TaobaoObject {

    private static final long serialVersionUID = 6643988313116974349L;

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
     * 投放人群ID
     */
    @ApiField("demographic_id")
    private Long demographicId;

    /**
     * 加价
     */
    @ApiField("incremental_price")
    private Long incrementalPrice;

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

    public Long getDemographicId() {
        return this.demographicId;
    }

    public void setDemographicId(Long demographicId) {
        this.demographicId = demographicId;
    }

    public Long getIncrementalPrice() {
        return this.incrementalPrice;
    }

    public void setIncrementalPrice(Long incrementalPrice) {
        this.incrementalPrice = incrementalPrice;
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
