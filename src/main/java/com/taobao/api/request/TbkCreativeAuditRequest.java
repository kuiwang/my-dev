package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TbkCreativeAuditResponse;

/**
 * TOP API: taobao.tbk.creative.audit request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class TbkCreativeAuditRequest implements TaobaoRequest<TbkCreativeAuditResponse> {

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 审核说明
     */
    private String comment;

    /**
     * 创意Id
     */
    private Long creativeId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 结果类型，1：审核成功，2：审核未通过，3.视频未成功下载
     */
    private Long result;

    /**
     * 展示页面
     */
    private String successUrl;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(creativeId, "creativeId");
        RequestCheckUtils.checkNotEmpty(result, "result");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.tbk.creative.audit";
    }

    public Date getAuditTime() {
        return this.auditTime;
    }

    public String getComment() {
        return this.comment;
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TbkCreativeAuditResponse> getResponseClass() {
        return TbkCreativeAuditResponse.class;
    }

    public Long getResult() {
        return this.result;
    }

    public String getSuccessUrl() {
        return this.successUrl;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("audit_time", this.auditTime);
        txtParams.put("comment", this.comment);
        txtParams.put("creative_id", this.creativeId);
        txtParams.put("result", this.result);
        txtParams.put("success_url", this.successUrl);
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

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCreativeId(Long creativeId) {
        this.creativeId = creativeId;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
