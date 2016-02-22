package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WirelessBuntingItemShorturlCreateResponse;

/**
 * TOP API: taobao.wireless.bunting.item.shorturl.create request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:49
 */
public class WirelessBuntingItemShorturlCreateRequest
        implements TaobaoRequest<WirelessBuntingItemShorturlCreateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品ID
     */
    private String itemId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wireless.bunting.item.shorturl.create";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getItemId() {
        return this.itemId;
    }

    @Override
    public Class<WirelessBuntingItemShorturlCreateResponse> getResponseClass() {
        return WirelessBuntingItemShorturlCreateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
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

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
