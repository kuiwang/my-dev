package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DdAuctionRuleAddResponse;

/**
 * TOP API: taobao.dd.auction.rule.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class DdAuctionRuleAddRequest implements TaobaoRequest<DdAuctionRuleAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 每天的结束时间 ， 格式：10000*hh+100*mm+ss
     */
    private Long dayEnd;

    /**
     * 每天的开始时间， 格式：10000*hh+100*mm+ss
     */
    private Long dayStart;

    /**
     * 扩展属性
     */
    private String features;

    /**
     * 是否是点点商品规则
     */
    private Boolean isDiandian;

    /**
     * 是否是外卖商品规则
     */
    private Boolean isTakeout;

    /**
     * 商户规则名称
     */
    private String name;

    /**
     * 规则结束时间
     */
    private Date ruleEnd;

    /**
     * 规则开始时间
     */
    private Date ruleStart;

    /**
     * 排序
     */
    private Long sort;

    /**
     * 状态
     */
    private Long status;

    /**
     * 商户ID
     */
    private String storeId;

    /**
     * 周期轮询0,1,2,3通过逗号间隔
     */
    private String weeklys;

    public void setDayEnd(Long dayEnd) {
        this.dayEnd = dayEnd;
    }

    public Long getDayEnd() {
        return this.dayEnd;
    }

    public void setDayStart(Long dayStart) {
        this.dayStart = dayStart;
    }

    public Long getDayStart() {
        return this.dayStart;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getFeatures() {
        return this.features;
    }

    public void setIsDiandian(Boolean isDiandian) {
        this.isDiandian = isDiandian;
    }

    public Boolean getIsDiandian() {
        return this.isDiandian;
    }

    public void setIsTakeout(Boolean isTakeout) {
        this.isTakeout = isTakeout;
    }

    public Boolean getIsTakeout() {
        return this.isTakeout;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRuleEnd(Date ruleEnd) {
        this.ruleEnd = ruleEnd;
    }

    public Date getRuleEnd() {
        return this.ruleEnd;
    }

    public void setRuleStart(Date ruleStart) {
        this.ruleStart = ruleStart;
    }

    public Date getRuleStart() {
        return this.ruleStart;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Long getSort() {
        return this.sort;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public void setWeeklys(String weeklys) {
        this.weeklys = weeklys;
    }

    public String getWeeklys() {
        return this.weeklys;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.dd.auction.rule.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("day_end", this.dayEnd);
        txtParams.put("day_start", this.dayStart);
        txtParams.put("features", this.features);
        txtParams.put("is_diandian", this.isDiandian);
        txtParams.put("is_takeout", this.isTakeout);
        txtParams.put("name", this.name);
        txtParams.put("rule_end", this.ruleEnd);
        txtParams.put("rule_start", this.ruleStart);
        txtParams.put("sort", this.sort);
        txtParams.put("status", this.status);
        txtParams.put("store_id", this.storeId);
        txtParams.put("weeklys", this.weeklys);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<DdAuctionRuleAddResponse> getResponseClass() {
        return DdAuctionRuleAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(isDiandian, "isDiandian");
        RequestCheckUtils.checkNotEmpty(isTakeout, "isTakeout");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkNotEmpty(storeId, "storeId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
