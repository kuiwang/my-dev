package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.BillAccountsGetResponse;

/**
 * TOP API: taobao.bill.accounts.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class BillAccountsGetRequest implements TaobaoRequest<BillAccountsGetResponse> {

    /**
     * 需要获取的科目ID
     */
    private String aids;

    /**
     * 需要返回的字段
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(aids, 200, "aids");
        RequestCheckUtils.checkNotEmpty(fields, "fields");
    }

    public String getAids() {
        return this.aids;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.bill.accounts.get";
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<BillAccountsGetResponse> getResponseClass() {
        return BillAccountsGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("aids", this.aids);
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

    public void setAids(String aids) {
        this.aids = aids;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
