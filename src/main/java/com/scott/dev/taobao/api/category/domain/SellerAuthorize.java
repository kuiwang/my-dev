package com.scott.dev.taobao.api.category.domain;

/*
 * 授权
 */
public class SellerAuthorize {

    /*
     * 类目列表
     */
    private ItemCat[] itemCats;

    /*
     * 品牌列表
     */
    private Brand[] brands;

    /*
     * 被授权的新品类目列表
     */
    private ItemCat[] xinpinItemCats;

    public ItemCat[] getItemCats() {
        return itemCats;
    }

    public void setItemCats(ItemCat[] itemCats) {
        this.itemCats = itemCats;
    }

    public Brand[] getBrands() {
        return brands;
    }

    public void setBrands(Brand[] brands) {
        this.brands = brands;
    }

    public ItemCat[] getXinpinItemCats() {
        return xinpinItemCats;
    }

    public void setXinpinItemCats(ItemCat[] xinpinItemCats) {
        this.xinpinItemCats = xinpinItemCats;
    }
}
