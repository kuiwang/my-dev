package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RpRefundReviewResponse;

/**
 * TOP API: taobao.rp.refund.review request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class RpRefundReviewRequest implements TaobaoRequest<RpRefundReviewResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 审核留言
     */
    private String message;

    /**
     * 审核人姓名
     */
    private String operator;

    /**
     * 退款单编号
     */
    private Long refundId;

    /**
     * 退款阶段，可选值：售中：onsale，售后：aftersale
     */
    private String refundPhase;

    /**
     * 退款最后更新时间，以时间戳的方式表示
     */
    private Long refundVersion;

    /**
     * 审核是否可用于批量退款，可选值：true（审核通过），false（审核不通过或反审核）
     */
    private Boolean result;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public Long getRefundId() {
        return this.refundId;
    }

    public void setRefundPhase(String refundPhase) {
        this.refundPhase = refundPhase;
    }

    public String getRefundPhase() {
        return this.refundPhase;
    }

    public void setRefundVersion(Long refundVersion) {
        this.refundVersion = refundVersion;
    }

    public Long getRefundVersion() {
        return this.refundVersion;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Boolean getResult() {
        return this.result;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.rp.refund.review";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("message", this.message);
        txtParams.put("operator", this.operator);
        txtParams.put("refund_id", this.refundId);
        txtParams.put("refund_phase", this.refundPhase);
        txtParams.put("refund_version", this.refundVersion);
        txtParams.put("result", this.result);
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

    public Class<RpRefundReviewResponse> getResponseClass() {
        return RpRefundReviewResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(message, "message");
        RequestCheckUtils.checkNotEmpty(operator, "operator");
        RequestCheckUtils.checkNotEmpty(refundId, "refundId");
        RequestCheckUtils.checkNotEmpty(refundPhase, "refundPhase");
        RequestCheckUtils.checkNotEmpty(refundVersion, "refundVersion");
        RequestCheckUtils.checkNotEmpty(result, "result");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
