package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallBrandcatSalesproGetResponse;

/**
 * TOP API: tmall.brandcat.salespro.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TmallBrandcatSalesproGetRequest
        implements TaobaoRequest<TmallBrandcatSalesproGetResponse> {

    /**
     * 被管控的品牌Id
     */
    private Long brandId;

    /**
     * 被管控的类目Id
     */
    private Long catId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(brandId, "brandId");
        RequestCheckUtils.checkNotEmpty(catId, "catId");
    }

    @Override
    public String getApiMethodName() {
        return "tmall.brandcat.salespro.get";
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public Long getCatId() {
        return this.catId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TmallBrandcatSalesproGetResponse> getResponseClass() {
        return TmallBrandcatSalesproGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("brand_id", this.brandId);
        txtParams.put("cat_id", this.catId);
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

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
