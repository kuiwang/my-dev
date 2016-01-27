package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商品规则
 *
 * @author auto create
 * @since 1.0, null
 */
public class DdTopAuctionRuleVO extends TaobaoObject {

    private static final long serialVersionUID = 8488684151933315599L;

    /**
     * 结束时间
     */
    @ApiField("day_ends")
    private Long dayEnds;

    /**
     * 每天的开始时间， 格式：10000*hh+100*mm+ss
     */
    @ApiField("day_starts")
    private Long dayStarts;

    /**
     * 扩展属性
     */
    @ApiField("features")
    private String features;

    /**
     * 规则ID
     */
    @ApiField("id")
    private Long id;

    /**
     * 是否是到店
     */
    @ApiField("is_diandian")
    private Boolean isDiandian;

    /**
     * 是否是外卖
     */
    @ApiField("is_takeout")
    private Boolean isTakeout;

    /**
     * 规则名
     */
    @ApiField("name")
    private String name;

    /**
     * 规则结束时间
     */
    @ApiField("rule_ends")
    private Date ruleEnds;

    /**
     * 规则开始时间
     */
    @ApiField("rule_starts")
    private Date ruleStarts;

    /**
     * 排序
     */
    @ApiField("sort")
    private Long sort;

    /**
     * 状态
     */
    @ApiField("status")
    private Long status;

    /**
     * 商铺ID
     */
    @ApiField("store_id")
    private String storeId;

    /**
     * 用户ID
     */
    @ApiField("user_id")
    private Long userId;

    /**
     * 周期轮询0,1,2,3通过逗号间隔
     */
    @ApiField("weeklys")
    private String weeklys;

    public Long getDayEnds() {
        return this.dayEnds;
    }

    public Long getDayStarts() {
        return this.dayStarts;
    }

    public String getFeatures() {
        return this.features;
    }

    public Long getId() {
        return this.id;
    }

    public Boolean getIsDiandian() {
        return this.isDiandian;
    }

    public Boolean getIsTakeout() {
        return this.isTakeout;
    }

    public String getName() {
        return this.name;
    }

    public Date getRuleEnds() {
        return this.ruleEnds;
    }

    public Date getRuleStarts() {
        return this.ruleStarts;
    }

    public Long getSort() {
        return this.sort;
    }

    public Long getStatus() {
        return this.status;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getWeeklys() {
        return this.weeklys;
    }

    public void setDayEnds(Long dayEnds) {
        this.dayEnds = dayEnds;
    }

    public void setDayStarts(Long dayStarts) {
        this.dayStarts = dayStarts;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsDiandian(Boolean isDiandian) {
        this.isDiandian = isDiandian;
    }

    public void setIsTakeout(Boolean isTakeout) {
        this.isTakeout = isTakeout;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRuleEnds(Date ruleEnds) {
        this.ruleEnds = ruleEnds;
    }

    public void setRuleStarts(Date ruleStarts) {
        this.ruleStarts = ruleStarts;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setWeeklys(String weeklys) {
        this.weeklys = weeklys;
    }

}
