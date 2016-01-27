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

    /**
     * 组合商品的id列表
     */
    private String destItemList;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 要建立组合关系的商品id
     */
    private Long itemId;

    /**
     * 组成组合商品的比例列表，描述组合商品的组合比例，默认为1,1,1
     */
    private String proportionList;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(destItemList, "destItemList");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.item.combination.create";
    }

    public String getDestItemList() {
        return this.destItemList;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getProportionList() {
        return this.proportionList;
    }

    @Override
    public Class<WlbItemCombinationCreateResponse> getResponseClass() {
        return WlbItemCombinationCreateResponse.class;
    }

    @Override
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

    public void setDestItemList(String destItemList) {
        this.destItemList = destItemList;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setProportionList(String proportionList) {
        this.proportionList = proportionList;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
