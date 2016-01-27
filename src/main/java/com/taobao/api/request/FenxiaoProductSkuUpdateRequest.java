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

    /**
     * 代销采购价
     */
    private String agentCostPrice;

    /**
     * 经销采购价
     */
    private String dealerCostPrice;

    private Map<String, String> headerMap = new TaobaoHashMap();

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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(productId, "productId");
        RequestCheckUtils.checkNotEmpty(properties, "properties");
    }

    public String getAgentCostPrice() {
        return this.agentCostPrice;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.product.sku.update";
    }

    public String getDealerCostPrice() {
        return this.dealerCostPrice;
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

    public Long getQuantity() {
        return this.quantity;
    }

    @Override
    public Class<FenxiaoProductSkuUpdateResponse> getResponseClass() {
        return FenxiaoProductSkuUpdateResponse.class;
    }

    public String getSkuNumber() {
        return this.skuNumber;
    }

    public String getStandardPrice() {
        return this.standardPrice;
    }

    @Override
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

    public void setAgentCostPrice(String agentCostPrice) {
        this.agentCostPrice = agentCostPrice;
    }

    public void setDealerCostPrice(String dealerCostPrice) {
        this.dealerCostPrice = dealerCostPrice;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber;
    }

    public void setStandardPrice(String standardPrice) {
        this.standardPrice = standardPrice;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
