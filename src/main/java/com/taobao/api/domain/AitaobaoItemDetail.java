package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 爱淘宝商品详情
 *
 * @author auto create
 * @since 1.0, null
 */
public class AitaobaoItemDetail extends TaobaoObject {

    private static final long serialVersionUID = 8892152312382863454L;

    /**
     * 商品详细信息. fields中需要设置Item下的字段,如设置:iid,detail_url等;
     * 只设置item_detail,则不返回的Item下的所有信息.
     */
    @ApiField("item")
    private Item item;

    /**
     * 商品所属卖家的信用等级
     */
    @ApiField("seller_credit_score")
    private Long sellerCreditScore;

    public Item getItem() {
        return this.item;
    }

    public Long getSellerCreditScore() {
        return this.sellerCreditScore;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setSellerCreditScore(Long sellerCreditScore) {
        this.sellerCreditScore = sellerCreditScore;
    }

}
