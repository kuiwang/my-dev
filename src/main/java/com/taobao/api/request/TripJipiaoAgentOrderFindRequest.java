package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TripJipiaoAgentOrderFindResponse;

/**
 * TOP API: taobao.trip.jipiao.agent.order.find request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class TripJipiaoAgentOrderFindRequest
        implements TaobaoRequest<TripJipiaoAgentOrderFindResponse> {

    /**
     * 创建订单时间范围的开始时间，注意：当前搜索条件开始结束时间范围不能超过三天，默认开始时间为当前时间往前推三天 （具体天数可能调整）
     */
    private Date beginTime;

    /**
     * 创建订单时间范围的结束时间，注意：当前搜索条件开始结束时间范围不能超过三天，默认为当前时间 （具体天数可能调整）
     */
    private Date endTime;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 页码，默认第一页；注意：页大小固定，搜索结果中返回页大小pageSize，和是否包含下一页hasNext
     */
    private Long page;

    /**
     * 淘宝机票政策id
     */
    private Long policyId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(policyId, "policyId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.trip.jipiao.agent.order.find";
    }

    public Date getBeginTime() {
        return this.beginTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPage() {
        return this.page;
    }

    public Long getPolicyId() {
        return this.policyId;
    }

    @Override
    public Class<TripJipiaoAgentOrderFindResponse> getResponseClass() {
        return TripJipiaoAgentOrderFindResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("begin_time", this.beginTime);
        txtParams.put("end_time", this.endTime);
        txtParams.put("page", this.page);
        txtParams.put("policy_id", this.policyId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
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

    public void setPage(Long page) {
        this.page = page;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
