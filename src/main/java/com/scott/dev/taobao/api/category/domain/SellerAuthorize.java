package com.scott.dev.taobao.api.category.domain;

/*
 * 授权
 */
public class SellerAuthorize {

    /*
     * 品牌列表
     */
    private Brand[] brands;

    /*
     * 类目列表
     */
    private ItemCat[] itemCats;

    /*
     * 被授权的新品类目列表
     */
    private ItemCat[] xinpinItemCats;

    public Brand[] getBrands() {
        return brands;
    }

    public ItemCat[] getItemCats() {
        return itemCats;
    }

    public ItemCat[] getXinpinItemCats() {
        return xinpinItemCats;
    }

    public void setBrands(Brand[] brands) {
        this.brands = brands;
    }

    public void setItemCats(ItemCat[] itemCats) {
        this.itemCats = itemCats;
    }

    public void setXinpinItemCats(ItemCat[] xinpinItemCats) {
        this.xinpinItemCats = xinpinItemCats;
    }
}
