package com.scott.dev.taobao.api.item.domain;

/*
 * 优惠信息对象
 */
public class PromotionDisplayTop {

    /*
     * 单品级优惠信息
     */
    private PromotionInItem[] promotionInItem;

    /*
     * 单品级优惠信息
     */
    private PromotionInShop[] promotionInShop;

    public PromotionInItem[] getPromotionInItem() {
        return promotionInItem;
    }

    public void setPromotionInItem(PromotionInItem[] promotionInItem) {
        this.promotionInItem = promotionInItem;
    }

    public PromotionInShop[] getPromotionInShop() {
        return promotionInShop;
    }

    public void setPromotionInShop(PromotionInShop[] promotionInShop) {
        this.promotionInShop = promotionInShop;
    }
}
