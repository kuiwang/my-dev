package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 关键词
 *
 * @author auto create
 * @since 1.0, null
 */
public class Keyword extends TaobaoObject {

    private static final long serialVersionUID = 4548716457267242179L;

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
     * 审核状态： audit_wait-待审核； audit_pass-审核通过(上线)； audit_reject-审核拒绝；
     * audit_offline-审核直接下线； 默认为 audit_pass。
     */
    @ApiField("audit_status")
    private String auditStatus;

    /**
     * 推广计划id
     */
    @ApiField("campaign_id")
    private Long campaignId;

    /**
     * 创建时间
     */
    @ApiField("create_time")
    private Date createTime;

    /**
     * 是否使用推广组默认出价，true-是；false-否；
     */
    @ApiField("is_default_price")
    private Boolean isDefaultPrice;

    /**
     * 是否是垃圾词，false-不是；true-是；垃圾词是近期无点击的词
     */
    @ApiField("is_garbage")
    private Boolean isGarbage;

    /**
     * 关键词id
     */
    @ApiField("keyword_id")
    private Long keywordId;

    /**
     * 匹配模式
     */
    @ApiField("match_scope")
    private String matchScope;

    /**
     * 关键词出价，单位为分，不能小于5
     */
    @ApiField("max_price")
    private Long maxPrice;

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
     * 词质量得分
     */
    @ApiField("qscore")
    private String qscore;

    /**
     * 关键词
     */
    @ApiField("word")
    private String word;

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

    public Boolean getIsDefaultPrice() {
        return this.isDefaultPrice;
    }

    public Boolean getIsGarbage() {
        return this.isGarbage;
    }

    public Long getKeywordId() {
        return this.keywordId;
    }

    public String getMatchScope() {
        return this.matchScope;
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

    public String getQscore() {
        return this.qscore;
    }

    public String getWord() {
        return this.word;
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

    public void setIsDefaultPrice(Boolean isDefaultPrice) {
        this.isDefaultPrice = isDefaultPrice;
    }

    public void setIsGarbage(Boolean isGarbage) {
        this.isGarbage = isGarbage;
    }

    public void setKeywordId(Long keywordId) {
        this.keywordId = keywordId;
    }

    public void setMatchScope(String matchScope) {
        this.matchScope = matchScope;
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

    public void setQscore(String qscore) {
        this.qscore = qscore;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
