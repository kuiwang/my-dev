package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductSkuUpdateResponse;

/**
 * TOP API: taobao.fenxiao.product.sku.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoProductSkuUpdateRequest implements
        TaobaoRequest<FenxiaoProductSkuUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 代销采购价
     */
    private String agentCostPrice;

    /**
     * 经销采购价
     */
    private String dealerCostPrice;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * sku属性
     */
    private String properties;

    /**
     * 产品SKU库存
     */
    private Long quantity;

    /**
     * 商家编码
     */
    private String skuNumber;

    /**
     * 采购基准价
     */
    private String standardPrice;

    public void setAgentCostPrice(String agentCostPrice) {
        this.agentCostPrice = agentCostPrice;
    }

    public String getAgentCostPrice() {
        return this.agentCostPrice;
    }

    public void setDealerCostPrice(String dealerCostPrice) {
        this.dealerCostPrice = dealerCostPrice;
    }

    public String getDealerCostPrice() {
        return this.dealerCostPrice;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getProperties() {
        return this.properties;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber;
    }

    public String getSkuNumber() {
        return this.skuNumber;
    }

    public void setStandardPrice(String standardPrice) {
        this.standardPrice = standardPrice;
    }

    public String getStandardPrice() {
        return this.standardPrice;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.product.sku.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("agent_cost_price", this.agentCostPrice);
        txtParams.put("dealer_cost_price", this.dealerCostPrice);
        txtParams.put("product_id", this.productId);
        txtParams.put("properties", this.properties);
        txtParams.put("quantity", this.quantity);
        txtParams.put("sku_number", this.skuNumber);
        txtParams.put("standard_price", this.standardPrice);
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

    public Class<FenxiaoProductSkuUpdateResponse> getResponseClass() {
        return FenxiaoProductSkuUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(productId, "productId");
        RequestCheckUtils.checkNotEmpty(properties, "properties");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
