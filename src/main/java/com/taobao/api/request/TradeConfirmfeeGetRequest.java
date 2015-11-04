package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeConfirmfeeGetResponse;

/**
 * TOP API: taobao.trade.confirmfee.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TradeConfirmfeeGetRequest implements TaobaoRequest<TradeConfirmfeeGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 是否是子订单。可选值:IS_FATHER(父订单),IS_CHILD(子订单)
     */
    private String isDetail;

    /**
     * 交易编号，或子订单编号
     */
    private Long tid;

    public void setIsDetail(String isDetail) {
        this.isDetail = isDetail;
    }

    public String getIsDetail() {
        return this.isDetail;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Long getTid() {
        return this.tid;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.trade.confirmfee.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("is_detail", this.isDetail);
        txtParams.put("tid", this.tid);
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

    public Class<TradeConfirmfeeGetResponse> getResponseClass() {
        return TradeConfirmfeeGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(isDetail, "isDetail");
        RequestCheckUtils.checkNotEmpty(tid, "tid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
