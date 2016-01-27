package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ScitemMapQueryResponse;

/**
 * TOP API: taobao.scitem.map.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class ScitemMapQueryRequest implements TaobaoRequest<ScitemMapQueryResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * map_type为1：前台ic商品id map_type为2：分销productid
     */
    private Long itemId;

    /**
     * map_type为1：前台ic商品skuid map_type为2：分销商品的skuid
     */
    private Long skuId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.scitem.map.query";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    @Override
    public Class<ScitemMapQueryResponse> getResponseClass() {
        return ScitemMapQueryResponse.class;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("sku_id", this.skuId);
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

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
