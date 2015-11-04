package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DdAuctionRuleQueryResponse;

/**
 * TOP API: taobao.dd.auction.rule.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class DdAuctionRuleQueryRequest implements TaobaoRequest<DdAuctionRuleQueryResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 当前日期时间
     */
    private Date currentDate;

    /**
     * 时间
     */
    private Long dayTime;

    /**
     * 规则id
     */
    private Long id;

    /**
     * 是否是到店
     */
    private Boolean isDiandian;

    /**
     * 是否是外卖
     */
    private Boolean isTakeout;

    /**
     * 规则名
     */
    private String name;

    /**
     * 状态数组string
     */
    private String statusArray;

    /**
     * 商铺ID
     */
    private String storeId;

    /**
     * 轮询周期
     */
    private String weekly;

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Date getCurrentDate() {
        return this.currentDate;
    }

    public void setDayTime(Long dayTime) {
        this.dayTime = dayTime;
    }

    public Long getDayTime() {
        return this.dayTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
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

    public void setStatusArray(String statusArray) {
        this.statusArray = statusArray;
    }

    public String getStatusArray() {
        return this.statusArray;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public void setWeekly(String weekly) {
        this.weekly = weekly;
    }

    public String getWeekly() {
        return this.weekly;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.dd.auction.rule.query";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("current_date", this.currentDate);
        txtParams.put("day_time", this.dayTime);
        txtParams.put("id", this.id);
        txtParams.put("is_diandian", this.isDiandian);
        txtParams.put("is_takeout", this.isTakeout);
        txtParams.put("name", this.name);
        txtParams.put("status_array", this.statusArray);
        txtParams.put("store_id", this.storeId);
        txtParams.put("weekly", this.weekly);
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

    public Class<DdAuctionRuleQueryResponse> getResponseClass() {
        return DdAuctionRuleQueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(isDiandian, "isDiandian");
        RequestCheckUtils.checkNotEmpty(isTakeout, "isTakeout");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
