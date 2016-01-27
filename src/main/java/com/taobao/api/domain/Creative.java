package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 创意
 *
 * @author auto create
 * @since 1.0, null
 */
public class Creative extends TaobaoObject {

    private static final long serialVersionUID = 1477629362318126715L;

    /**
     * 推广组id
     */
    @ApiField("adgroup_id")
    private Long adgroupId;

    /**
     * 审核拒绝原因描述
     */
    @ApiField("audit_desc")
    private String auditDesc;

    /**
     * 审核状态：
     * audit_wait-待审核；audit_pass-审核通过(上线)；audit_reject-审核拒绝；默认为audit_pass。
     */
    @ApiField("audit_status")
    private String auditStatus;

    /**
     * 推广计划Id
     */
    @ApiField("campaign_id")
    private Long campaignId;

    /**
     * 创建时间
     */
    @ApiField("create_time")
    private Date createTime;

    /**
     * 创意id
     */
    @ApiField("creative_id")
    private Long creativeId;

    /**
     * 创意图片地址，必须是推广组对应商品的图片之一
     */
    @ApiField("img_url")
    private String imgUrl;

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
     * 创意标题，最多20个汉字
     */
    @ApiField("title")
    private String title;

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    public String getAuditDesc() {
        return this.auditDesc;
    }

    public String getAuditStatus() {
        return this.auditStatus;
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public Date getModifiedTime() {
        return this.modifiedTime;
    }

    public String getNick() {
        return this.nick;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public void setAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCreativeId(Long creativeId) {
        this.creativeId = creativeId;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
