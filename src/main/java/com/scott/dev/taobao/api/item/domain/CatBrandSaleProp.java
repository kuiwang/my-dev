package com.scott.dev.taobao.api.item.domain;

/*
 * 被管控的品牌和类目的所对应的销售属性
 */
public class CatBrandSaleProp {

    /*
     * 被管控的类目ID
     */
    private Number catId;

    /*
     * 被管控的品牌的Id
     */
    private Number brandId;

    /*
     * 被管控的销售属性ID
     */
    private Number propertyId;

    /*
     * true表示：不是产品的规格属性 false表示：是产品的规格属性。
     */
    private Boolean isNotSpec;

    /*
     * 如果该属性为营销属性，则获取默认值
     */
    private Number defMarketPropValue;

    public Number getCatId() {
        return catId;
    }

    public void setCatId(Number catId) {
        this.catId = catId;
    }

    public Number getBrandId() {
        return brandId;
    }

    public void setBrandId(Number brandId) {
        this.brandId = brandId;
    }

    public Number getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Number propertyId) {
        this.propertyId = propertyId;
    }

    public Boolean getIsNotSpec() {
        return isNotSpec;
    }

    public void setIsNotSpec(Boolean isNotSpec) {
        this.isNotSpec = isNotSpec;
    }

    public Number getDefMarketPropValue() {
        return defMarketPropValue;
    }

    public void setDefMarketPropValue(Number defMarketPropValue) {
        this.defMarketPropValue = defMarketPropValue;
    }
}
