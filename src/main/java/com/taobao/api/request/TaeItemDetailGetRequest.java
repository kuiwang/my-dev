package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaeItemDetailGetResponse;

/**
 * TOP API: taobao.tae.item.detail.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class TaeItemDetailGetRequest implements TaobaoRequest<TaeItemDetailGetResponse> {

    /**
     * 用户所在位置ip
     */
    private String buyerIp;

    /**
     * 区块信息
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品open_iid
     */
    private String id;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkNotEmpty(id, "id");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.tae.item.detail.get";
    }

    public String getBuyerIp() {
        return this.buyerIp;
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public Class<TaeItemDetailGetResponse> getResponseClass() {
        return TaeItemDetailGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_ip", this.buyerIp);
        txtParams.put("fields", this.fields);
        txtParams.put("id", this.id);
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

    public void setBuyerIp(String buyerIp) {
        this.buyerIp = buyerIp;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
