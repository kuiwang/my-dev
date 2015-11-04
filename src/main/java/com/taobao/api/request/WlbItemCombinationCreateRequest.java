package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemCombinationCreateResponse;

/**
 * TOP API: taobao.wlb.item.combination.create request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemCombinationCreateRequest implements
        TaobaoRequest<WlbItemCombinationCreateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 组合商品的id列表
     */
    private String destItemList;

    /**
     * 要建立组合关系的商品id
     */
    private Long itemId;

    /**
     * 组成组合商品的比例列表，描述组合商品的组合比例，默认为1,1,1
     */
    private String proportionList;

    public void setDestItemList(String destItemList) {
        this.destItemList = destItemList;
    }

    public String getDestItemList() {
        return this.destItemList;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setProportionList(String proportionList) {
        this.proportionList = proportionList;
    }

    public String getProportionList() {
        return this.proportionList;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.combination.create";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("dest_item_list", this.destItemList);
        txtParams.put("item_id", this.itemId);
        txtParams.put("proportion_list", this.proportionList);
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

    public Class<WlbItemCombinationCreateResponse> getResponseClass() {
        return WlbItemCombinationCreateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(destItemList, "destItemList");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
