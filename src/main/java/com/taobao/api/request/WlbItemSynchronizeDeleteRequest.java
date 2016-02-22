package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemSynchronizeDeleteResponse;

/**
 * TOP API: taobao.wlb.item.synchronize.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemSynchronizeDeleteRequest
        implements TaobaoRequest<WlbItemSynchronizeDeleteResponse> {

    /**
     * 外部实体ID<br />
     * 支持的最大列表长度为：64
     */
    private Long extEntityId;

    /**
     * 外部实体类型.存如下值 IC_ITEM --表示IC商品; IC_SKU --表示IC最小单位商品;若输入其他值，则按IC_ITEM处理
     */
    private String extEntityType;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 物流宝商品ID<br />
     * 支持的最大列表长度为：20
     */
    private Long itemId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(extEntityId, "extEntityId");
        RequestCheckUtils.checkNotEmpty(extEntityType, "extEntityType");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.item.synchronize.delete";
    }

    public Long getExtEntityId() {
        return this.extEntityId;
    }

    public String getExtEntityType() {
        return this.extEntityType;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    @Override
    public Class<WlbItemSynchronizeDeleteResponse> getResponseClass() {
        return WlbItemSynchronizeDeleteResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ext_entity_id", this.extEntityId);
        txtParams.put("ext_entity_type", this.extEntityType);
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

    public void setExtEntityId(Long extEntityId) {
        this.extEntityId = extEntityId;
    }

    public void setExtEntityType(String extEntityType) {
        this.extEntityType = extEntityType;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
