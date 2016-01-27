package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 被管控的品牌和类目的所对应的销售属性
 *
 * @author auto create
 * @since 1.0, null
 */
public class CatBrandSaleProp extends TaobaoObject {

    private static final long serialVersionUID = 5227715834734811915L;

    /**
     * 被管控的品牌的Id
     */
    @ApiField("brand_id")
    private Long brandId;

    /**
     * 被管控的类目ID
     */
    @ApiField("cat_id")
    private Long catId;

    /**
     * 如果该属性为营销属性，则获取默认值
     */
    @ApiField("def_market_prop_value")
    private Long defMarketPropValue;

    /**
     * true表示：不是产品的规格属性 false表示：是产品的规格属性。
     */
    @ApiField("is_not_spec")
    private Boolean isNotSpec;

    /**
     * 被管控的销售属性ID
     */
    @ApiField("property_id")
    private Long propertyId;

    public Long getBrandId() {
        return this.brandId;
    }

    public Long getCatId() {
        return this.catId;
    }

    public Long getDefMarketPropValue() {
        return this.defMarketPropValue;
    }

    public Boolean getIsNotSpec() {
        return this.isNotSpec;
    }

    public Long getPropertyId() {
        return this.propertyId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setDefMarketPropValue(Long defMarketPropValue) {
        this.defMarketPropValue = defMarketPropValue;
    }

    public void setIsNotSpec(Boolean isNotSpec) {
        this.isNotSpec = isNotSpec;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

}
