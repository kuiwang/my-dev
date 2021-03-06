package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoCooperationAuditResponse;

/**
 * TOP API: taobao.fenxiao.cooperation.audit request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoCooperationAuditRequest
        implements TaobaoRequest<FenxiaoCooperationAuditResponse> {

    /**
     * 1:审批通过，审批通过后要加入授权产品线列表； 2:审批拒绝
     */
    private Long auditResult;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 当审批通过时需要指定授权产品线id列表(代销)，如果没传则表示不开通，且经销和代销的授权产品线列表至少传入一种，同时传入则表示都开通。
     */
    private String productLineListAgent;

    /**
     * 当审批通过时需要指定授权产品线id列表(经销)，如果没传则表示不开通，且经销和代销的授权产品线列表至少传入一种，同时传入则表示都开通。
     */
    private String productLineListDealer;

    /**
     * 备注
     */
    private String remark;

    /**
     * 合作申请Id
     */
    private Long requisitionId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(auditResult, "auditResult");
        RequestCheckUtils.checkNotEmpty(remark, "remark");
        RequestCheckUtils.checkNotEmpty(requisitionId, "requisitionId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.cooperation.audit";
    }

    public Long getAuditResult() {
        return this.auditResult;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getProductLineListAgent() {
        return this.productLineListAgent;
    }

    public String getProductLineListDealer() {
        return this.productLineListDealer;
    }

    public String getRemark() {
        return this.remark;
    }

    public Long getRequisitionId() {
        return this.requisitionId;
    }

    @Override
    public Class<FenxiaoCooperationAuditResponse> getResponseClass() {
        return FenxiaoCooperationAuditResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("audit_result", this.auditResult);
        txtParams.put("product_line_list_agent", this.productLineListAgent);
        txtParams.put("product_line_list_dealer", this.productLineListDealer);
        txtParams.put("remark", this.remark);
        txtParams.put("requisition_id", this.requisitionId);
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

    public void setAuditResult(Long auditResult) {
        this.auditResult = auditResult;
    }

    public void setProductLineListAgent(String productLineListAgent) {
        this.productLineListAgent = productLineListAgent;
    }

    public void setProductLineListDealer(String productLineListDealer) {
        this.productLineListDealer = productLineListDealer;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setRequisitionId(Long requisitionId) {
        this.requisitionId = requisitionId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
