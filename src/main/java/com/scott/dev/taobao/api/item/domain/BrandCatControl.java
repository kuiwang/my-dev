package com.scott.dev.taobao.api.item.domain;

/*
 * 管控的品牌类目信息
 */
public class BrandCatControl {

    /*
     * 被管控的品牌的ID号码
     */
    private Number brandId;

    /*
     * 被管控的品牌名称
     */
    private String brandName;

    /*
     * 被管控的类目的ID号
     */
    private Number catId;

    /*
     * 被管控的类目的ID号
     */
    private String catName;

    /*
     * 以;隔开多个认证资料。:隔开资料ID与内容。如？1:产品包装图片;2:完整产品资质
     */
    private String certifiedData;

    public Number getBrandId() {
        return brandId;
    }

    public void setBrandId(Number brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Number getCatId() {
        return catId;
    }

    public void setCatId(Number catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCertifiedData() {
        return certifiedData;
    }

    public void setCertifiedData(String certifiedData) {
        this.certifiedData = certifiedData;
    }
}
