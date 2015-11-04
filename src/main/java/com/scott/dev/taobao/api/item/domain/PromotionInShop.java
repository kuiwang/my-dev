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
     * idValue值
     */
    private String promotionId;

    /*
     * 优惠详情描述。
     */
    private String promotionDetailDesc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionDetailDesc() {
        return promotionDetailDesc;
    }

    public void setPromotionDetailDesc(String promotionDetailDesc) {
        this.promotionDetailDesc = promotionDetailDesc;
    }
}
