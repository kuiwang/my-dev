package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoRefundQueryResponse;

/**
 * TOP API: taobao.fenxiao.refund.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoRefundQueryRequest implements TaobaoRequest<FenxiaoRefundQueryResponse> {

    /**
     * 代销采购退款最迟修改时间。与start_date的最大时间间隔不能超过30天
     */
    private Date endDate;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 页码（大于0的整数。无值或小于1的值按默认值1计）
     */
    private Long pageNo;

    /**
     * 每页条数（大于0但小于等于50的整数。无值或大于50或小于1的值按默认值50计）
     */
    private Long pageSize;

    /**
     * 是否查询下游买家的退款信息
     */
    private Boolean querySellerRefund;

    /**
     * 代销采购退款单最早修改时间
     */
    private Date startDate;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.refund.query";
    }

    public Date getEndDate() {
        return this.endDate;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public Boolean getQuerySellerRefund() {
        return this.querySellerRefund;
    }

    @Override
    public Class<FenxiaoRefundQueryResponse> getResponseClass() {
        return FenxiaoRefundQueryResponse.class;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_date", this.endDate);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("query_seller_refund", this.querySellerRefund);
        txtParams.put("start_date", this.startDate);
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

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setQuerySellerRefund(Boolean querySellerRefund) {
        this.querySellerRefund = querySellerRefund;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
