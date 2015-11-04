package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoRequisitionsGetResponse;

/**
 * TOP API: taobao.fenxiao.requisitions.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoRequisitionsGetRequest implements TaobaoRequest<FenxiaoRequisitionsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 申请结束时间yyyy-MM-dd
     */
    private Date applyEnd;

    /**
     * 申请开始时间yyyy-MM-dd
     */
    private Date applyStart;

    /**
     * 页码（大于0的整数，默认1）
     */
    private Long pageNo;

    /**
     * 每页记录数（默认20，最大50）
     */
    private Long pageSize;

    /**
     * 申请状态（1-申请中、2-成功、3-被退回、4-已撤消、5-过期）
     */
    private Long status;

    public void setApplyEnd(Date applyEnd) {
        this.applyEnd = applyEnd;
    }

    public Date getApplyEnd() {
        return this.applyEnd;
    }

    public void setApplyStart(Date applyStart) {
        this.applyStart = applyStart;
    }

    public Date getApplyStart() {
        return this.applyStart;
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

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.requisitions.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("apply_end", this.applyEnd);
        txtParams.put("apply_start", this.applyStart);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("status", this.status);
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

    public Class<FenxiaoRequisitionsGetResponse> getResponseClass() {
        return FenxiaoRequisitionsGetResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
