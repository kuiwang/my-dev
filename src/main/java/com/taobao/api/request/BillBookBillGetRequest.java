package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.BillBookBillGetResponse;

/**
 * TOP API: taobao.bill.book.bill.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class BillBookBillGetRequest implements TaobaoRequest<BillBookBillGetResponse> {

    /**
     * 虚拟账户流水编号
     */
    private Long bid;

    /**
     * 需要返回的字段:参见BookBill结构体
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bid, "bid");
        RequestCheckUtils.checkNotEmpty(fields, "fields");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.bill.book.bill.get";
    }

    public Long getBid() {
        return this.bid;
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<BillBookBillGetResponse> getResponseClass() {
        return BillBookBillGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bid", this.bid);
        txtParams.put("fields", this.fields);
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

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
