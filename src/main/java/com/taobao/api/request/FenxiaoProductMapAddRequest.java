package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductMapAddResponse;

/**
 * TOP API: taobao.fenxiao.product.map.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoProductMapAddRequest implements TaobaoRequest<FenxiaoProductMapAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 是否需要校验商家编码，true不校验，false校验。
     */
    private Boolean notCheckOuterCode;

    /**
     * 分销产品id。
     */
    private Long productId;

    /**
     * 后端商品id（如果当前分销产品没有sku和后端商品时需要指定）。
     */
    private Long scItemId;

    /**
     * 在有sku的情况下，与各个sku对应的后端商品id列表。逗号分隔，顺序需要保证与sku_ids一致。
     */
    private String scItemIds;

    /**
     * 分销产品的sku id。逗号分隔，顺序需要保证与sc_item_ids一致（没有sku就不传）。
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
        return "taobao.fenxiao.product.map.add";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Boolean getNotCheckOuterCode() {
        return this.notCheckOuterCode;
    }

    public Long getProductId() {
        return this.productId;
    }

    @Override
    public Class<FenxiaoProductMapAddResponse> getResponseClass() {
        return FenxiaoProductMapAddResponse.class;
    }

    public Long getScItemId() {
        return this.scItemId;
    }

    public String getScItemIds() {
        return this.scItemIds;
    }

    public String getSkuIds() {
        return this.skuIds;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("not_check_outer_code", this.notCheckOuterCode);
        txtParams.put("product_id", this.productId);
        txtParams.put("sc_item_id", this.scItemId);
        txtParams.put("sc_item_ids", this.scItemIds);
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

    public void setNotCheckOuterCode(Boolean notCheckOuterCode) {
        this.notCheckOuterCode = notCheckOuterCode;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setScItemId(Long scItemId) {
        this.scItemId = scItemId;
    }

    public void setScItemIds(String scItemIds) {
        this.scItemIds = scItemIds;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
