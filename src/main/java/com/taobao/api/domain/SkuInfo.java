package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * SKU信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class SkuInfo extends TaobaoObject {

    private static final long serialVersionUID = 7144891998445525137L;

    /**
     * 属性sku映射
     */
    @ApiListField("pv_map_sku_list")
    @ApiField("pv_map_sku")
    private List<PvMapSku> pvMapSkuList;

    /**
     * SKU属性列
     */
    @ApiListField("sku_props")
    @ApiField("sku_property")
    private List<SkuProperty> skuProps;

    public List<PvMapSku> getPvMapSkuList() {
        return this.pvMapSkuList;
    }

    public void setPvMapSkuList(List<PvMapSku> pvMapSkuList) {
        this.pvMapSkuList = pvMapSkuList;
    }

    public List<SkuProperty> getSkuProps() {
        return this.skuProps;
    }

    public void setSkuProps(List<SkuProperty> skuProps) {
        this.skuProps = skuProps;
    }

}
