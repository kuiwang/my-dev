package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.BillBillsGetResponse;

/**
 * TOP API: taobao.bill.bills.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class BillBillsGetRequest implements TaobaoRequest<BillBillsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 科目编号
     */
    private Long accountId;

    /**
     * 结束时间,限制:结束时间-开始时间不能大于1天(根据order_id或者trade_id查询除外)
     */
    private Date endTime;

    /**
     * 传入需要返回的字段,参见Bill结构体
     */
    private String fields;

    /**
     * 子订单编号
     */
    private Long orderId;

    /**
     * 页数,建议不要超过100页,越大性能越低,有可能会超时
     */
    private Long pageNo;

    /**
     * 每页大小,默认40条,可选范围 ：40~100
     */
    private Long pageSize;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 查询条件中的时间类型:1-交易订单完成时间biz_time 2-支付宝扣款时间pay_time
     * 如果不填默认为2即根据支付时间查询,查询的结果会根据该时间倒排序
     */
    private Long timeType;

    /**
     * 交易编号
     */
    private Long tradeId;

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return this.orderId;
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

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setTimeType(Long timeType) {
        this.timeType = timeType;
    }

    public Long getTimeType() {
        return this.timeType;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Long getTradeId() {
        return this.tradeId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.bill.bills.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("account_id", this.accountId);
        txtParams.put("end_time", this.endTime);
        txtParams.put("fields", this.fields);
        txtParams.put("order_id", this.orderId);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_time", this.startTime);
        txtParams.put("time_type", this.timeType);
        txtParams.put("trade_id", this.tradeId);
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

    public Class<BillBillsGetResponse> getResponseClass() {
        return BillBillsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
