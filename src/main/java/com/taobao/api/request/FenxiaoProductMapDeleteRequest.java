package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductMapDeleteResponse;

/**
 * TOP API: taobao.fenxiao.product.map.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoProductMapDeleteRequest implements
        TaobaoRequest<FenxiaoProductMapDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 分销产品id。
     */
    private Long productId;

    /**
     * 分销产品的sku id列表，逗号分隔，在有sku时需要指定。
     */
    private String skuIds;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(productId, "productId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.product.map.delete";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getProductId() {
        return this.productId;
    }

    @Override
    public Class<FenxiaoProductMapDeleteResponse> getResponseClass() {
        return FenxiaoProductMapDeleteResponse.class;
    }

    public String getSkuIds() {
        return this.skuIds;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("product_id", this.productId);
        txtParams.put("sku_ids", this.skuIds);
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

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
