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

    /**
     * 当前日期时间
     */
    private Date currentDate;

    /**
     * 时间
     */
    private Long dayTime;

    private Map<String, String> headerMap = new TaobaoHashMap();

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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 轮询周期
     */
    private String weekly;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(isDiandian, "isDiandian");
        RequestCheckUtils.checkNotEmpty(isTakeout, "isTakeout");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.dd.auction.rule.query";
    }

    public Date getCurrentDate() {
        return this.currentDate;
    }

    public Long getDayTime() {
        return this.dayTime;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
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

    @Override
    public Class<DdAuctionRuleQueryResponse> getResponseClass() {
        return DdAuctionRuleQueryResponse.class;
    }

    public String getStatusArray() {
        return this.statusArray;
    }

    public String getStoreId() {
        return this.storeId;
    }

    @Override
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

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getWeekly() {
        return this.weekly;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public void setDayTime(Long dayTime) {
        this.dayTime = dayTime;
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

    public void setStatusArray(String statusArray) {
        this.statusArray = statusArray;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setWeekly(String weekly) {
        this.weekly = weekly;
    }
}
