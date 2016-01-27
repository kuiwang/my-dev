package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeReceivetimeDelayResponse;

/**
 * TOP API: taobao.trade.receivetime.delay request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TradeReceivetimeDelayRequest implements TaobaoRequest<TradeReceivetimeDelayResponse> {

    /**
     * 延长收货的天数，可选值为：3, 5, 7, 10。<br />
     * 支持最大值为：10<br />
     * 支持最小值为：3
     */
    private Long days;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主订单号
     */
    private Long tid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(days, "days");
        RequestCheckUtils.checkMaxValue(days, 10L, "days");
        RequestCheckUtils.checkMinValue(days, 3L, "days");
        RequestCheckUtils.checkNotEmpty(tid, "tid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.trade.receivetime.delay";
    }

    public Long getDays() {
        return this.days;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TradeReceivetimeDelayResponse> getResponseClass() {
        return TradeReceivetimeDelayResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("days", this.days);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Long getTid() {
        return this.tid;
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

    public void setDays(Long days) {
        this.days = days;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
