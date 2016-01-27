package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JipiaoAgentOrderSearchResponse;

/**
 * TOP API: taobao.jipiao.agent.order.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class JipiaoAgentOrderSearchRequest implements TaobaoRequest<JipiaoAgentOrderSearchResponse> {

    /**
     * 创建订单时间范围的开始时间，注意：当前搜索条件开始结束时间范围不能超过三天，默认开始时间为当前时间往前推三天 （具体天数可能调整）
     */
    private Date beginTime;

    /**
     * 创建订单时间范围的结束时间，注意：当前搜索条件开始结束时间范围不能超过三天，默认为当前时间 （具体天数可能调整）
     */
    private Date endTime;

    /**
     * 是否需要行程单，true表示需要行程单；false表示不许要
     */
    private Boolean hasItinerary;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 页码，默认第一页；注意：页大小固定，搜索结果中返回页大小pageSize，和是否包含下一页hasNext
     */
    private Long page;

    /**
     * 订单状态，默认为空，查询所有状态的订单 1:待确认 2:待出票 3:强制成功 4:未付款 5:预订成功 6:已失效
     */
    private Long status;

    private Long timestamp;

    /**
     * 航程类型： 0.单程；1.往返
     */
    private Long tripType;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.jipiao.agent.order.search";
    }

    public Date getBeginTime() {
        return this.beginTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public Boolean getHasItinerary() {
        return this.hasItinerary;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPage() {
        return this.page;
    }

    @Override
    public Class<JipiaoAgentOrderSearchResponse> getResponseClass() {
        return JipiaoAgentOrderSearchResponse.class;
    }

    public Long getStatus() {
        return this.status;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("begin_time", this.beginTime);
        txtParams.put("end_time", this.endTime);
        txtParams.put("has_itinerary", this.hasItinerary);
        txtParams.put("page", this.page);
        txtParams.put("status", this.status);
        txtParams.put("trip_type", this.tripType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getTripType() {
        return this.tripType;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setHasItinerary(Boolean hasItinerary) {
        this.hasItinerary = hasItinerary;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTripType(Long tripType) {
        this.tripType = tripType;
    }
}
