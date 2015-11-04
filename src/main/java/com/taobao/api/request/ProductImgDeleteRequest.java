package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ProductImgDeleteResponse;

/**
 * TOP API: taobao.product.img.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class ProductImgDeleteRequest implements TaobaoRequest<ProductImgDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 非主图ID
     */
    private Long id;

    /**
     * 产品ID.Product的id,通过taobao.product.add接口新增产品的时候会返回id.
     */
    private Long productId;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.product.img.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("product_id", this.productId);
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

    public Class<ProductImgDeleteResponse> getResponseClass() {
        return ProductImgDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(id, "id");
        RequestCheckUtils.checkNotEmpty(productId, "productId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
