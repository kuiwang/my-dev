package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SkusQuantityUpdateResponse;

/**
 * TOP API: taobao.skus.quantity.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class SkusQuantityUpdateRequest implements TaobaoRequest<SkusQuantityUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品数字ID，必填参数
     */
    private Long numIid;

    /**
     * 特殊可选，skuIdQuantities为空的时候用该字段通过outerId来指定sku和其库存修改值。格式为outerId:库存修改值
     * ;outerId:库存修改值。当skuIdQuantities不为空的时候该字段失效。当一个outerId对应多个sku时，
     * 所有匹配到的sku都会被修改库存。最多支持20个SKU同时修改。
     */
    private String outeridQuantities;

    /**
     * sku库存批量修改入参，用于指定一批sku和每个sku的库存修改值，特殊可填。格式为skuId:库存修改值;skuId:库存修改值。
     * 最多支持20个SKU同时修改。
     */
    private String skuidQuantities;

    private Long timestamp;

    /**
     * 库存更新方式，可选。1为全量更新，2为增量更新。如果不填，默认为全量更新。当选择全量更新时，如果库存更新值传入的是负数，
     * 会出错并返回错误码；当选择增量更新时，如果库存更新值为负数且绝对值大于当前库存，则sku库存会设置为0.
     */
    private Long type;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(numIid, "numIid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.skus.quantity.update";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public String getOuteridQuantities() {
        return this.outeridQuantities;
    }

    @Override
    public Class<SkusQuantityUpdateResponse> getResponseClass() {
        return SkusQuantityUpdateResponse.class;
    }

    public String getSkuidQuantities() {
        return this.skuidQuantities;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("num_iid", this.numIid);
        txtParams.put("outerid_quantities", this.outeridQuantities);
        txtParams.put("skuid_quantities", this.skuidQuantities);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getType() {
        return this.type;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public void setOuteridQuantities(String outeridQuantities) {
        this.outeridQuantities = outeridQuantities;
    }

    public void setSkuidQuantities(String skuidQuantities) {
        this.skuidQuantities = skuidQuantities;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(Long type) {
        this.type = type;
    }
}
