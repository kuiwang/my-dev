package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductGradepriceUpdateResponse;

/**
 * TOP API: taobao.fenxiao.product.gradeprice.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoProductGradepriceUpdateRequest
        implements TaobaoRequest<FenxiaoProductGradepriceUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 会员等级的id或者分销商id，例如：”1001,2001,1002”
     */
    private String ids;

    /**
     * 优惠价格,大小为0到100000000之间的整数或两位小数，例：优惠价格为：100元2角5分，传入的参数应写成：100.25
     */
    private String prices;

    /**
     * 产品Id
     */
    private Long productId;

    /**
     * skuId，如果产品有skuId,必须要输入skuId;没有skuId的时候不必选
     */
    private Long skuId;

    /**
     * 选择折扣方式：GRADE（按等级进行设置）;DISCITUTOR(按分销商进行设置）。例如"GRADE,DISTRIBUTOR"
     */
    private String targetType;

    private Long timestamp;

    /**
     * 交易类型： AGENT(代销)、DEALER(经销)，ALL(代销和经销)
     */
    private String tradeType;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(ids, "ids");
        RequestCheckUtils.checkMaxListSize(ids, 200, "ids");
        RequestCheckUtils.checkNotEmpty(prices, "prices");
        RequestCheckUtils.checkMaxListSize(prices, 200, "prices");
        RequestCheckUtils.checkNotEmpty(productId, "productId");
        RequestCheckUtils.checkNotEmpty(targetType, "targetType");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.product.gradeprice.update";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getIds() {
        return this.ids;
    }

    public String getPrices() {
        return this.prices;
    }

    public Long getProductId() {
        return this.productId;
    }

    @Override
    public Class<FenxiaoProductGradepriceUpdateResponse> getResponseClass() {
        return FenxiaoProductGradepriceUpdateResponse.class;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public String getTargetType() {
        return this.targetType;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ids", this.ids);
        txtParams.put("prices", this.prices);
        txtParams.put("product_id", this.productId);
        txtParams.put("sku_id", this.skuId);
        txtParams.put("target_type", this.targetType);
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

    public String getTradeType() {
        return this.tradeType;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }
}
