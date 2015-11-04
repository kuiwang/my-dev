package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ScitemMapAddResponse;

/**
 * TOP API: taobao.scitem.map.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class ScitemMapAddRequest implements TaobaoRequest<ScitemMapAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 前台ic商品id
     */
    private Long itemId;

    /**
     * 默认值为false true:进行高级校验,前端商品或SKU的商家编码必须与后端商品的商家编码一致，否则会拒绝关联
     * false:不进行高级校验
     */
    private Boolean needCheck;

    /**
     * sc_item_id和outer_code 其中一个不能为空
     */
    private String outerCode;

    /**
     * sc_item_id和outer_code 其中一个不能为空
     */
    private Long scItemId;

    /**
     * 前台ic商品skuid
     */
    private Long skuId;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setNeedCheck(Boolean needCheck) {
        this.needCheck = needCheck;
    }

    public Boolean getNeedCheck() {
        return this.needCheck;
    }

    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }

    public String getOuterCode() {
        return this.outerCode;
    }

    public void setScItemId(Long scItemId) {
        this.scItemId = scItemId;
    }

    public Long getScItemId() {
        return this.scItemId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.scitem.map.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("need_check", this.needCheck);
        txtParams.put("outer_code", this.outerCode);
        txtParams.put("sc_item_id", this.scItemId);
        txtParams.put("sku_id", this.skuId);
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

    public Class<ScitemMapAddResponse> getResponseClass() {
        return ScitemMapAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
