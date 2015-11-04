package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 物流订单商品
 *
 * @author auto create
 * @since 1.0, null
 */
public class OrderGoods extends TaobaoObject {

    private static final long serialVersionUID = 6441191273663396924L;

    /**
     * 商品的商家编码
     */
    @ApiField("auction_code")
    private String auctionCode;

    /**
     * 外卖商品购买数量
     */
    @ApiField("count")
    private Long count;

    /**
     * 外卖商品外部ID
     */
    @ApiField("goods_code")
    private String goodsCode;

    /**
     * 商品名称
     */
    @ApiField("goods_name")
    private String goodsName;

    /**
     * 商品图片id
     */
    @ApiField("goods_pic_id")
    private String goodsPicId;

    /**
     * 物流订单商品数量
     */
    @ApiField("goods_quantity")
    private Long goodsQuantity;

    /**
     * 商品ID
     */
    @ApiField("id")
    private Long id;

    /**
     * 是否是优惠商品
     */
    @ApiField("is_promotion")
    private Boolean isPromotion;

    /**
     * 商品价格
     */
    @ApiField("item_value")
    private Long itemValue;

    /**
     * 外卖商品名称
     */
    @ApiField("name")
    private String name;

    /**
     * 商品的唯一编码
     */
    @ApiField("order_goods_id")
    private Long orderGoodsId;

    /**
     * 优惠名称
     */
    @ApiField("promotion_name")
    private String promotionName;

    /**
     * 0 未优惠 1 已优惠
     */
    @ApiField("promotion_status")
    private Long promotionStatus;

    /**
     * 优惠类型
     */
    @ApiField("promotion_type")
    private Long promotionType;

    /**
     * 外卖商品实际购买价格
     */
    @ApiField("real_price")
    private String realPrice;

    /**
     * 销售属性
     */
    @ApiField("sell_property")
    private String sellProperty;

    /**
     * 用户id
     */
    @ApiField("user_id")
    private Long userId;

    public String getAuctionCode() {
        return this.auctionCode;
    }

    public void setAuctionCode(String auctionCode) {
        this.auctionCode = auctionCode;
    }

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getGoodsCode() {
        return this.goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return this.goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPicId() {
        return this.goodsPicId;
    }

    public void setGoodsPicId(String goodsPicId) {
        this.goodsPicId = goodsPicId;
    }

    public Long getGoodsQuantity() {
        return this.goodsQuantity;
    }

    public void setGoodsQuantity(Long goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsPromotion() {
        return this.isPromotion;
    }

    public void setIsPromotion(Boolean isPromotion) {
        this.isPromotion = isPromotion;
    }

    public Long getItemValue() {
        return this.itemValue;
    }

    public void setItemValue(Long itemValue) {
        this.itemValue = itemValue;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOrderGoodsId() {
        return this.orderGoodsId;
    }

    public void setOrderGoodsId(Long orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public String getPromotionName() {
        return this.promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Long getPromotionStatus() {
        return this.promotionStatus;
    }

    public void setPromotionStatus(Long promotionStatus) {
        this.promotionStatus = promotionStatus;
    }

    public Long getPromotionType() {
        return this.promotionType;
    }

    public void setPromotionType(Long promotionType) {
        this.promotionType = promotionType;
    }

    public String getRealPrice() {
        return this.realPrice;
    }

    public void setRealPrice(String realPrice) {
        this.realPrice = realPrice;
    }

    public String getSellProperty() {
        return this.sellProperty;
    }

    public void setSellProperty(String sellProperty) {
        this.sellProperty = sellProperty;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
