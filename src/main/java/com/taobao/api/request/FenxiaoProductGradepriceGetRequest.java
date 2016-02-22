package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductGradepriceGetResponse;

/**
 * TOP API: taobao.fenxiao.product.gradeprice.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoProductGradepriceGetRequest
        implements TaobaoRequest<FenxiaoProductGradepriceGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 产品id
     */
    private Long productId;

    /**
     * skuId
     */
    private Long skuId;

    private Long timestamp;

    /**
     * 经、代销模式（1：代销、2：经销）
     */
    private Long tradeType;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(productId, "productId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.product.gradeprice.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getProductId() {
        return this.productId;
    }

    @Override
    public Class<FenxiaoProductGradepriceGetResponse> getResponseClass() {
        return FenxiaoProductGradepriceGetResponse.class;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("product_id", this.productId);
        txtParams.put("sku_id", this.skuId);
        txtParams.put("trade_type", this.tradeType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getTradeType() {
        return this.tradeType;
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

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTradeType(Long tradeType) {
        this.tradeType = tradeType;
    }
}
