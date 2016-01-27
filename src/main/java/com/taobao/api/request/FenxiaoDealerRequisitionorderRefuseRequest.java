package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDealerRequisitionorderRefuseResponse;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.refuse request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoDealerRequisitionorderRefuseRequest implements
        TaobaoRequest<FenxiaoDealerRequisitionorderRefuseResponse> {

    /**
     * 采购申请/经销采购单编号
     */
    private Long dealerOrderId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 驳回原因（1：价格不合理；2：采购数量不合理；3：其他原因）
     */
    private Long reason;

    /**
     * 驳回详细原因，字数范围5-200字
     */
    private String reasonDetail;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dealerOrderId, "dealerOrderId");
        RequestCheckUtils.checkNotEmpty(reason, "reason");
        RequestCheckUtils.checkNotEmpty(reasonDetail, "reasonDetail");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.dealer.requisitionorder.refuse";
    }

    public Long getDealerOrderId() {
        return this.dealerOrderId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getReason() {
        return this.reason;
    }

    public String getReasonDetail() {
        return this.reasonDetail;
    }

    @Override
    public Class<FenxiaoDealerRequisitionorderRefuseResponse> getResponseClass() {
        return FenxiaoDealerRequisitionorderRefuseResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dealer_order_id", this.dealerOrderId);
        txtParams.put("reason", this.reason);
        txtParams.put("reason_detail", this.reasonDetail);
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

    public void setDealerOrderId(Long dealerOrderId) {
        this.dealerOrderId = dealerOrderId;
    }

    public void setReason(Long reason) {
        this.reason = reason;
    }

    public void setReasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
