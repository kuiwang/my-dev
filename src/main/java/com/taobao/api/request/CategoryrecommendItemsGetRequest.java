package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CategoryrecommendItemsGetResponse;

/**
 * TOP API: taobao.categoryrecommend.items.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class CategoryrecommendItemsGetRequest implements
        TaobaoRequest<CategoryrecommendItemsGetResponse> {

    /**
     * 传入叶子类目ID
     */
    private Long categoryId;

    /**
     * 请求个数，建议获取20个
     */
    private Long count;

    /**
     * 额外参数
     */
    private String ext;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 请求类型，1：类目下热门商品推荐。其他值当非法值处理
     */
    private Long recommendType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
        RequestCheckUtils.checkNotEmpty(count, "count");
        RequestCheckUtils.checkNotEmpty(recommendType, "recommendType");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.categoryrecommend.items.get";
    }

    public Long getCategoryId() {
        return this.categoryId;
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

    public Long getRecommendType() {
        return this.recommendType;
    }

    @Override
    public Class<CategoryrecommendItemsGetResponse> getResponseClass() {
        return CategoryrecommendItemsGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id", this.categoryId);
        txtParams.put("count", this.count);
        txtParams.put("ext", this.ext);
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

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public void setRecommendType(Long recommendType) {
        this.recommendType = recommendType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
