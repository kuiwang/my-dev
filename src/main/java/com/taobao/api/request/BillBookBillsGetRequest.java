package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.BillBookBillsGetResponse;

/**
 * TOP API: taobao.bill.book.bills.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class BillBookBillsGetRequest implements TaobaoRequest<BillBookBillsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 虚拟账户科目编号
     */
    private Long accountId;

    /**
     * 记账结束时间,end_time与start_time相差不能超过30天
     */
    private Date endTime;

    /**
     * 需要返回的字段:bid,account_id,journal_type,amount,book_time,description,
     * gmt_create,gmt_modified ,如果不是以上字段将自动忽略<br />
     * 支持的最大列表长度为：300
     */
    private String fields;

    /**
     * 明细流水类型:流水类型:101、可用金充值；102、可用金扣除；103、冻结；104、解冻；105、冻结金充值；106、冻结金扣除
     */
    private String journalTypes;

    /**
     * 页码,传入值为1代表第一页,传入值为2代表第二页,依此类推.默认返回的数据是从第一页开始
     */
    private Long pageNo;

    /**
     * 每页大小,建议40~100,不能超过100
     */
    private Long pageSize;

    /**
     * 记账开始时间
     */
    private Date startTime;

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

    public void setJournalTypes(String journalTypes) {
        this.journalTypes = journalTypes;
    }

    public String getJournalTypes() {
        return this.journalTypes;
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

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.bill.book.bills.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("account_id", this.accountId);
        txtParams.put("end_time", this.endTime);
        txtParams.put("fields", this.fields);
        txtParams.put("journal_types", this.journalTypes);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_time", this.startTime);
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

    public Class<BillBookBillsGetResponse> getResponseClass() {
        return BillBookBillsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(accountId, "accountId");
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMaxLength(fields, 300, "fields");
        RequestCheckUtils.checkMaxListSize(journalTypes, 10, "journalTypes");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
