package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 外卖优惠物件
 *
 * @author auto create
 * @since 1.0, null
 */
public class PromotionO extends TaobaoObject {

    private static final long serialVersionUID = 4464159847878964935L;

    /**
     * 优惠金额（免运费、限时打折时为空）,单位：元
     */
    @ApiField("discount_fee")
    private String discountFee;

    /**
     * 赠品的宝贝id
     */
    @ApiField("gift_item_id")
    private Long giftItemId;

    /**
     * 满就送商品时，所送商品的名称
     */
    @ApiField("gift_item_name")
    private String giftItemName;

    /**
     * 满就送礼物的礼物数量
     */
    @ApiField("gift_item_num")
    private Long giftItemNum;

    /**
     * 赠送商品的类型
     */
    @ApiField("gift_item_type")
    private Long giftItemType;

    /**
     * 赠品的skuid
     */
    @ApiField("gift_sku_id")
    private Long giftSkuId;

    /**
     * 就是因为这个商品ID而产生的优惠
     */
    @ApiField("item_id")
    private Long itemId;

    /**
     * 交易的主订单或子订单号
     */
    @ApiField("order_id")
    private Long orderId;

    /**
     * 优惠活动的描述
     */
    @ApiField("promotion_desc")
    private String promotionDesc;

    /**
     * 优惠id，(由营销工具id、优惠活动id和优惠详情id组成，结构为：营销工具id-优惠活动id_优惠详情id，如mjs-
     * 123024_211143）
     */
    @ApiField("promotion_id")
    private String promotionId;

    /**
     * 优惠信息的名称
     */
    @ApiField("promotion_name")
    private String promotionName;

    /**
     * ORDER_DISCOUNT(1, "订单优惠"), ITEM_DISCOUNT(2, "菜品优惠"),
     * ALIPAY_DISCOUNT(3, "支付宝优惠"), ITEM_LARGESS(4, "满就送菜"),
     * GIFT_LARGESS(5, "满就送礼物");
     */
    @ApiField("promotion_type")
    private Long promotionType;

    /**
     * item_id的sku_id
     */
    @ApiField("sku_id")
    private Long skuId;

    public String getDiscountFee() {
        return this.discountFee;
    }

    public void setDiscountFee(String discountFee) {
        this.discountFee = discountFee;
    }

    public Long getGiftItemId() {
        return this.giftItemId;
    }

    public void setGiftItemId(Long giftItemId) {
        this.giftItemId = giftItemId;
    }

    public String getGiftItemName() {
        return this.giftItemName;
    }

    public void setGiftItemName(String giftItemName) {
        this.giftItemName = giftItemName;
    }

    public Long getGiftItemNum() {
        return this.giftItemNum;
    }

    public void setGiftItemNum(Long giftItemNum) {
        this.giftItemNum = giftItemNum;
    }

    public Long getGiftItemType() {
        return this.giftItemType;
    }

    public void setGiftItemType(Long giftItemType) {
        this.giftItemType = giftItemType;
    }

    public Long getGiftSkuId() {
        return this.giftSkuId;
    }

    public void setGiftSkuId(Long giftSkuId) {
        this.giftSkuId = giftSkuId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getPromotionDesc() {
        return this.promotionDesc;
    }

    public void setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionName() {
        return this.promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Long getPromotionType() {
        return this.promotionType;
    }

    public void setPromotionType(Long promotionType) {
        this.promotionType = promotionType;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

}
