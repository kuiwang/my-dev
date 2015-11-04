package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeOrderskuUpdateResponse;

/**
 * TOP API: taobao.trade.ordersku.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TradeOrderskuUpdateRequest implements TaobaoRequest<TradeOrderskuUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 子订单编号（对于单笔订单的交易可以传交易编号）。
     */
    private Long oid;

    /**
     * 销售属性编号，可以通过taobao.item.skus.get获取订单对应的商品的所有销售属性。
     */
    private Long skuId;

    /**
     * 销售属性组合串，格式：p1:v1;p2:v2，如：1627207:28329;20509:28314。可以通过taobao.item.
     * skus.get获取订单对应的商品的所有销售属性。
     */
    private String skuProps;

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getOid() {
        return this.oid;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuProps(String skuProps) {
        this.skuProps = skuProps;
    }

    public String getSkuProps() {
        return this.skuProps;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.trade.ordersku.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("oid", this.oid);
        txtParams.put("sku_id", this.skuId);
        txtParams.put("sku_props", this.skuProps);
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

    public Class<TradeOrderskuUpdateResponse> getResponseClass() {
        return TradeOrderskuUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(oid, "oid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
