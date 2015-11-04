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

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

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

    /**
     * 请求类型，1：类目下热门商品推荐。其他值当非法值处理
     */
    private Long recommendType;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return this.count;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getExt() {
        return this.ext;
    }

    public void setRecommendType(Long recommendType) {
        this.recommendType = recommendType;
    }

    public Long getRecommendType() {
        return this.recommendType;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.categoryrecommend.items.get";
    }

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

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<CategoryrecommendItemsGetResponse> getResponseClass() {
        return CategoryrecommendItemsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
        RequestCheckUtils.checkNotEmpty(count, "count");
        RequestCheckUtils.checkNotEmpty(recommendType, "recommendType");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
