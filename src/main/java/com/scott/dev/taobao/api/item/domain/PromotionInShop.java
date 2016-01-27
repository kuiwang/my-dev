package com.scott.dev.taobao.api.item.domain;

/*
 * 店铺级优惠信息
 */
public class PromotionInShop {

    /*
     * 优惠活动名称
     */
    private String name;

    /*
     * 优惠详情描述。
     */
    private String promotionDetailDesc;

    /*
     * idValue值
     */
    private String promotionId;

    public String getName() {
        return name;
    }

    public String getPromotionDetailDesc() {
        return promotionDetailDesc;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPromotionDetailDesc(String promotionDetailDesc) {
        this.promotionDetailDesc = promotionDetailDesc;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }
}
