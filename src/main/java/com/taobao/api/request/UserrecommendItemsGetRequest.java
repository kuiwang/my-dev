package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UserrecommendItemsGetResponse;

/**
 * TOP API: taobao.userrecommend.items.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class UserrecommendItemsGetRequest implements TaobaoRequest<UserrecommendItemsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 请求个数，建议取20个
     */
    private Long count;

    /**
     * 额外参数
     */
    private String ext;

    /**
     * 请求类型，1：用户购买意图。其他值当非法值处理
     */
    private Long recommendType;

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
        return "taobao.userrecommend.items.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
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

    public Class<UserrecommendItemsGetResponse> getResponseClass() {
        return UserrecommendItemsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(count, "count");
        RequestCheckUtils.checkNotEmpty(recommendType, "recommendType");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
