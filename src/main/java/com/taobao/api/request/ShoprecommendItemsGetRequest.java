package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ShoprecommendItemsGetResponse;

/**
 * TOP API: taobao.shoprecommend.items.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class ShoprecommendItemsGetRequest implements TaobaoRequest<ShoprecommendItemsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 请求个数，最大只能获取10个
     */
    private Long count;

    /**
     * 额外参数
     */
    private String ext;

    /**
     * 请求类型，1：店内热门商品推荐。其他值当非法值处理
     */
    private Long recommendType;

    /**
     * <p>
     * 传入卖家ID。这里的seller_id得通过<a href=
     * "http://api.taobao.com/apidoc/api.htm?path=cid:38-apiId:10449"
     * >taobao.taobaoke.shops.get</a> 跟<a href=
     * "http://api.taobao.com/apidoc/api.htm?path=cid:38-apiId:21419"
     * >taobao.taobaoke.widget.shops.convert</a>这两个接口去获取user_id字段。
     * </p>
     * <p>
     * 如果是非淘客卖家，则无法获取，暂无替代方案。
     * </p>
     */
    private Long sellerId;

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

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.shoprecommend.items.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("count", this.count);
        txtParams.put("ext", this.ext);
        txtParams.put("recommend_type", this.recommendType);
        txtParams.put("seller_id", this.sellerId);
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

    public Class<ShoprecommendItemsGetResponse> getResponseClass() {
        return ShoprecommendItemsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(count, "count");
        RequestCheckUtils.checkNotEmpty(recommendType, "recommendType");
        RequestCheckUtils.checkNotEmpty(sellerId, "sellerId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
