package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaeItemsListResponse;

/**
 * TOP API: taobao.tae.items.list request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class TaeItemsListRequest implements TaobaoRequest<TaeItemsListResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 返回值中需要的字段. 可选值
     * title,nick,pic_url,location,cid,price,post_fee,promoted_service.字段间用
     * (,) 逗号分隔
     */
    private String fields;

    /**
     * 商品的ID列表, 使用 (,)逗号分隔. 最多支持50个商品ID
     */
    private String numIids;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setNumIids(String numIids) {
        this.numIids = numIids;
    }

    public String getNumIids() {
        return this.numIids;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.tae.items.list";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("num_iids", this.numIids);
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

    public Class<TaeItemsListResponse> getResponseClass() {
        return TaeItemsListResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkNotEmpty(numIids, "numIids");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
