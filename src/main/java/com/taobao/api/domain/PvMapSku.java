package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 属性sku映射
 *
 * @author auto create
 * @since 1.0, null
 */
public class PvMapSku extends TaobaoObject {

    private static final long serialVersionUID = 2579963229898142118L;

    /**
     * 用户选择的属性对
     */
    @ApiField("pv")
    private String pv;

    /**
     * sku id
     */
    @ApiField("sku_id")
    private String skuId;

    public String getPv() {
        return this.pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

}
