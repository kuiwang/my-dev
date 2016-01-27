package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoRefundGetResponse;

/**
 * TOP API: taobao.fenxiao.refund.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoRefundGetRequest implements TaobaoRequest<FenxiaoRefundGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 是否查询下游买家的退款信息
     */
    private Boolean querySellerRefund;

    /**
     * 要查询的退款子单的id
     */
    private Long subOrderId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(subOrderId, "subOrderId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.refund.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Boolean getQuerySellerRefund() {
        return this.querySellerRefund;
    }

    @Override
    public Class<FenxiaoRefundGetResponse> getResponseClass() {
        return FenxiaoRefundGetResponse.class;
    }

    public Long getSubOrderId() {
        return this.subOrderId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("query_seller_refund", this.querySellerRefund);
        txtParams.put("sub_order_id", this.subOrderId);
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

    public void setQuerySellerRefund(Boolean querySellerRefund) {
        this.querySellerRefund = querySellerRefund;
    }

    public void setSubOrderId(Long subOrderId) {
        this.subOrderId = subOrderId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
