package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 服务平台评价流水对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class ScoreResult extends TaobaoObject {

    private static final long serialVersionUID = 8252851723365239371L;

    /**
     * 服务态度评分
     */
    @ApiField("attitude_score")
    private String attitudeScore;

    /**
     * 平均分
     */
    @ApiField("avg_score")
    private String avgScore;

    /**
     * 易用性评分
     */
    @ApiField("easyuse_score")
    private String easyuseScore;

    /**
     * 评价时间
     */
    @ApiField("gmt_create")
    private Date gmtCreate;

    /**
     * 评价id
     */
    @ApiField("id")
    private Long id;

    /**
     * 是否实际付费 1-实际付费 2-实际未付费
     */
    @ApiField("is_pay")
    private Long isPay;

    /**
     * 是否为有效评分 1-有效评分 2-无效评分
     */
    @ApiField("is_valid")
    private Long isValid;

    /**
     * 服务规格code
     */
    @ApiField("item_code")
    private String itemCode;

    /**
     * 服务规格名称
     */
    @ApiField("item_name")
    private String itemName;

    /**
     * 描述相符
     */
    @ApiField("matched_score")
    private String matchedScore;

    /**
     * 专业性评分
     */
    @ApiField("prof_score")
    private String profScore;

    /**
     * 交片速度
     */
    @ApiField("rapid_score")
    private String rapidScore;

    /**
     * 服务code
     */
    @ApiField("service_code")
    private String serviceCode;

    /**
     * 稳定性评分
     */
    @ApiField("stability_score")
    private String stabilityScore;

    /**
     * 评论内容
     */
    @ApiField("suggestion")
    private String suggestion;

    /**
     * 评价人用户昵称
     */
    @ApiField("user_nick")
    private String userNick;

    public String getAttitudeScore() {
        return this.attitudeScore;
    }

    public String getAvgScore() {
        return this.avgScore;
    }

    public String getEasyuseScore() {
        return this.easyuseScore;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public Long getId() {
        return this.id;
    }

    public Long getIsPay() {
        return this.isPay;
    }

    public Long getIsValid() {
        return this.isValid;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getMatchedScore() {
        return this.matchedScore;
    }

    public String getProfScore() {
        return this.profScore;
    }

    public String getRapidScore() {
        return this.rapidScore;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public String getStabilityScore() {
        return this.stabilityScore;
    }

    public String getSuggestion() {
        return this.suggestion;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public void setAttitudeScore(String attitudeScore) {
        this.attitudeScore = attitudeScore;
    }

    public void setAvgScore(String avgScore) {
        this.avgScore = avgScore;
    }

    public void setEasyuseScore(String easyuseScore) {
        this.easyuseScore = easyuseScore;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsPay(Long isPay) {
        this.isPay = isPay;
    }

    public void setIsValid(Long isValid) {
        this.isValid = isValid;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setMatchedScore(String matchedScore) {
        this.matchedScore = matchedScore;
    }

    public void setProfScore(String profScore) {
        this.profScore = profScore;
    }

    public void setRapidScore(String rapidScore) {
        this.rapidScore = rapidScore;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setStabilityScore(String stabilityScore) {
        this.stabilityScore = stabilityScore;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

}
