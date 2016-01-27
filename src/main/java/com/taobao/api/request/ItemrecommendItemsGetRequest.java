package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemrecommendItemsGetResponse;

/**
 * TOP API: taobao.itemrecommend.items.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class ItemrecommendItemsGetRequest implements TaobaoRequest<ItemrecommendItemsGetResponse> {

    /**
     * 请求返回宝贝的个数，建议取20个
     */
    private Long count;

    /**
     * 额外的参数信息
     */
    private String ext;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品ID
     */
    private Long itemId;

    /**
     * 查询类型标识符，可传入1-3，1：同类商品推荐，2：异类商品推荐， 3：同店商品推荐。其他值当非法值处理
     */
    private Long recommendType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(count, "count");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(recommendType, "recommendType");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.itemrecommend.items.get";
    }

    public Long getCount() {
        return this.count;
    }

    public String getExt() {
        return this.ext;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public Long getRecommendType() {
        return this.recommendType;
    }

    @Override
    public Class<ItemrecommendItemsGetResponse> getResponseClass() {
        return ItemrecommendItemsGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("count", this.count);
        txtParams.put("ext", this.ext);
        txtParams.put("item_id", this.itemId);
        txtParams.put("recommend_type", this.recommendType);
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

    public void setCount(Long count) {
        this.count = count;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setRecommendType(Long recommendType) {
        this.recommendType = recommendType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
