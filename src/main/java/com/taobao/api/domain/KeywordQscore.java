package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 关键词质量得分
 *
 * @author auto create
 * @since 1.0, null
 */
public class KeywordQscore extends TaobaoObject {

    private static final long serialVersionUID = 1559739513557928428L;

    /**
     * 推广组id
     */
    @ApiField("adgroup_id")
    private Long adgroupId;

    /**
     * 推广计划id
     */
    @ApiField("campaign_id")
    private Long campaignId;

    /**
     * 创意得分
     */
    @ApiField("creative_score")
    private String creativeScore;

    /**
     * 基础分
     */
    @ApiField("cust_score")
    private String custScore;

    /**
     * 买家体验分
     */
    @ApiField("cvr_score")
    private String cvrScore;

    /**
     * 关键词id
     */
    @ApiField("keyword_id")
    private Long keywordId;

    /**
     * 主人昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 质量总分
     */
    @ApiField("qscore")
    private String qscore;

    /**
     * 相关性
     */
    @ApiField("rele_score")
    private String releScore;

    /**
     * 关键词
     */
    @ApiField("word")
    private String word;

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    public String getCreativeScore() {
        return this.creativeScore;
    }

    public String getCustScore() {
        return this.custScore;
    }

    public String getCvrScore() {
        return this.cvrScore;
    }

    public Long getKeywordId() {
        return this.keywordId;
    }

    public String getNick() {
        return this.nick;
    }

    public String getQscore() {
        return this.qscore;
    }

    public String getReleScore() {
        return this.releScore;
    }

    public String getWord() {
        return this.word;
    }

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public void setCreativeScore(String creativeScore) {
        this.creativeScore = creativeScore;
    }

    public void setCustScore(String custScore) {
        this.custScore = custScore;
    }

    public void setCvrScore(String cvrScore) {
        this.cvrScore = cvrScore;
    }

    public void setKeywordId(Long keywordId) {
        this.keywordId = keywordId;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setQscore(String qscore) {
        this.qscore = qscore;
    }

    public void setReleScore(String releScore) {
        this.releScore = releScore;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
