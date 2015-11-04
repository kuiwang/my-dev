package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundMessagesGetResponse;

/**
 * TOP API: taobao.refund.messages.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class RefundMessagesGetRequest implements TaobaoRequest<RefundMessagesGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 需返回的字段列表。可选值：RefundMessage结构体中的所有字段，以半角逗号(,)分隔。
     */
    private String fields;

    /**
     * 页码<br />
     * 支持最小值为：1
     */
    private Long pageNo;

    /**
     * 每页条数<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 退款单号<br />
     * 支持最小值为：1
     */
    private Long refundId;

    /**
     * 退款阶段，可选值：onsale（售中），aftersale（售后），天猫退款为必传。
     */
    private String refundPhase;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
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

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.refund.messages.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("refund_id", this.refundId);
        txtParams.put("refund_phase", this.refundPhase);
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

    public Class<RefundMessagesGetResponse> getResponseClass() {
        return RefundMessagesGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMaxListSize(fields, 100, "fields");
        RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(refundId, "refundId");
        RequestCheckUtils.checkMinValue(refundId, 1L, "refundId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
