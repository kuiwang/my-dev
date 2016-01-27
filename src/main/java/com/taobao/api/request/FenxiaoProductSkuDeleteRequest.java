package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductSkuDeleteResponse;

/**
 * TOP API: taobao.fenxiao.product.sku.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoProductSkuDeleteRequest implements
        TaobaoRequest<FenxiaoProductSkuDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 产品id
     */
    private Long productId;

    /**
     * sku属性
     */
    private String properties;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(productId, "productId");
        RequestCheckUtils.checkNotEmpty(properties, "properties");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.product.sku.delete";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getProperties() {
        return this.properties;
    }

    @Override
    public Class<FenxiaoProductSkuDeleteResponse> getResponseClass() {
        return FenxiaoProductSkuDeleteResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("product_id", this.productId);
        txtParams.put("properties", this.properties);
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

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
