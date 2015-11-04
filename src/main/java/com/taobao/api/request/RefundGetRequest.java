package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundGetResponse;

/**
 * TOP API: taobao.refund.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class RefundGetRequest implements TaobaoRequest<RefundGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 需要返回的字段。目前支持有：refund_id, alipay_no, tid, oid, buyer_nick,
     * seller_nick, total_fee, status, created, refund_fee, good_status,
     * has_good_return, payment, reason, desc, num_iid, title, price, num,
     * good_return_time, company_name, sid, address, shipping_type,
     * refund_remind_timeout, refund_phase, refund_version,
     * operation_contraint, attribute, outer_id, sku
     */
    private String fields;

    /**
     * 退款单号<br />
     * 支持最大值为：9223372036854775807<br />
     * 支持最小值为：1
     */
    private Long refundId;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.refund.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("refund_id", this.refundId);
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

    public Class<RefundGetResponse> getResponseClass() {
        return RefundGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMaxListSize(fields, 100, "fields");
        RequestCheckUtils.checkNotEmpty(refundId, "refundId");
        RequestCheckUtils.checkMaxValue(refundId, 9223372036854775807L, "refundId");
        RequestCheckUtils.checkMinValue(refundId, 1L, "refundId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
