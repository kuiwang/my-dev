package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemSynchronizeResponse;

/**
 * TOP API: taobao.wlb.item.synchronize request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemSynchronizeRequest implements TaobaoRequest<WlbItemSynchronizeResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 外部实体ID<br />
     * 支持的最大列表长度为：64
     */
    private Long extEntityId;

    /**
     * 外部实体类型.存如下值 IC_ITEM --表示IC商品 IC_SKU --表示IC最小单位商品 若输入其他值，则按IC_ITEM处理
     */
    private String extEntityType;

    /**
     * 商品ID<br />
     * 支持的最大列表长度为：20
     */
    private Long itemId;

    /**
     * 商品所有人淘宝nick<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String userNick;

    public void setExtEntityId(Long extEntityId) {
        this.extEntityId = extEntityId;
    }

    public Long getExtEntityId() {
        return this.extEntityId;
    }

    public void setExtEntityType(String extEntityType) {
        this.extEntityType = extEntityType;
    }

    public String getExtEntityType() {
        return this.extEntityType;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.synchronize";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ext_entity_id", this.extEntityId);
        txtParams.put("ext_entity_type", this.extEntityType);
        txtParams.put("item_id", this.itemId);
        txtParams.put("user_nick", this.userNick);
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

    public Class<WlbItemSynchronizeResponse> getResponseClass() {
        return WlbItemSynchronizeResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(extEntityId, "extEntityId");
        RequestCheckUtils.checkNotEmpty(extEntityType, "extEntityType");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(userNick, "userNick");
        RequestCheckUtils.checkMaxLength(userNick, 64, "userNick");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
