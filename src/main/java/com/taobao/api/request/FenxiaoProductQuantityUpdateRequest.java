package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoProductQuantityUpdateResponse;

/**
 * TOP API: taobao.fenxiao.product.quantity.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoProductQuantityUpdateRequest implements
        TaobaoRequest<FenxiaoProductQuantityUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * sku属性值，产品有sku时填写，多个sku用,分隔。为空时默认该产品无sku，则只修改产品的库存。
     */
    private String properties;

    /**
     * 库存修改值。产品有sku时，与sku属性顺序对应，用,分隔。产品无sku时，只写库存值。
     * 当全量更新库存时，quantity必须为大于等于0的正整数
     * ；当增量更新库存时，quantity为整数，可小于等于0。若增量更新时传入的库存为负数
     * ，则负数与实际库存之和不能小于0。比如当前实际库存为1，传入增量更新quantity=-1，库存改为0
     */
    private String quantity;

    /**
     * 库存更新方式，可选。1为全量更新，2为增量更新。如果不填，默认为全量更新。当选择全量更新时，如果库存更新值传入的是负数，
     * 会出错并返回错误码；当选择增量更新时，如果库存更新值为负数且绝对值大于当前库存，则sku库存会设置为0
     */
    private Long type;

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

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.fenxiao.product.quantity.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("product_id", this.productId);
        txtParams.put("properties", this.properties);
        txtParams.put("quantity", this.quantity);
        txtParams.put("type", this.type);
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

    public Class<FenxiaoProductQuantityUpdateResponse> getResponseClass() {
        return FenxiaoProductQuantityUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(productId, "productId");
        RequestCheckUtils.checkNotEmpty(quantity, "quantity");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
