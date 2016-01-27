package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 满就送对象数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class MjsPromotion extends TaobaoObject {

    private static final long serialVersionUID = 1824489576675221331L;

    /**
     * 活动id
     */
    @ApiField("activity_id")
    private Long activityId;

    /**
     * 减多少钱。当is_decrease_money为true时，该值才有意义。注意：该值单位为分，即100表示1元。
     */
    @ApiField("decrease_amount")
    private Long decreaseAmount;

    /**
     * 活动的有效条件、人群和行为描述。
     */
    @ApiField("description")
    private String description;

    /**
     * 折扣值。当is_discount为true时，该值才有意义。注意：800表示8折。
     */
    @ApiField("discount_rate")
    private Long discountRate;

    /**
     * 活动结束时间。
     */
    @ApiField("end_time")
    private Date endTime;

    /**
     * 免邮的排除地区，即，除指定地区外，其他地区包邮。当is_free_post为true时，该值才有意义。代码使用*链接，代码为行政区划代码
     * 。
     */
    @ApiField("exclude_area")
    private String excludeArea;

    /**
     * 礼品id，当is_send_gift为true时，该值才有意义。
     * 1）只有填写真实的淘宝商品id时，才能生成物流单，并且在确定订单的页面上可以点击该商品名称跳转到商品详情页面
     * 。2）当礼物为实物商品时(有宝贝id),礼物必须为上架商品,不能为虚拟商品,不能为拍卖商品,不能有sku,不符合条件的,不做为礼物。
     */
    @ApiField("gift_id")
    private Long giftId;

    /**
     * 礼品名称。当is_send_gift为true时，该值才有意义。
     */
    @ApiField("gift_name")
    private String giftName;

    /**
     * 商品详情的url，当is_send_gift为true时，该值才有效。
     */
    @ApiField("gift_url")
    private String giftUrl;

    /**
     * 满元是否上不封顶。当is_amount_over为true时，该值才有意义。当该值为true时，表示满元上不封顶，例如满100元减10元
     * ，当满200时，则减20元。。。
     */
    @ApiField("is_amount_multiple")
    private Boolean isAmountMultiple;

    /**
     * 是否有满元条件。
     */
    @ApiField("is_amount_over")
    private Boolean isAmountOver;

    /**
     * 是否有减钱行为。
     */
    @ApiField("is_decrease_money")
    private Boolean isDecreaseMoney;

    /**
     * 是否有打折行为。
     */
    @ApiField("is_discount")
    private Boolean isDiscount;

    /**
     * 是否有免邮行为。
     */
    @ApiField("is_free_post")
    private Boolean isFreePost;

    /**
     * 是否有满件条件。
     */
    @ApiField("is_item_count_over")
    private Boolean isItemCountOver;

    /**
     * 满件是否上不封顶。当is_amount_multiple为true时，该值才有意义。当该值为true时，表示满件上不封顶，
     * 例如满10件减2元，当满20件时，则减4元。。。
     */
    @ApiField("is_item_multiple")
    private Boolean isItemMultiple;

    /**
     * 是否有送礼品行为。
     */
    @ApiField("is_send_gift")
    private Boolean isSendGift;

    /**
     * 是否有店铺会员等级条件。
     */
    @ApiField("is_shop_member")
    private Boolean isShopMember;

    /**
     * 是否指定用户标签。
     */
    @ApiField("is_user_tag")
    private Boolean isUserTag;

    /**
     * 满多少件。当is_item_count_over为true时，该值才有意义。
     */
    @ApiField("item_count")
    private Long itemCount;

    /**
     * 活动名称。
     */
    @ApiField("name")
    private String name;

    /**
     * 活动范围：0表示全部参与； 1表示部分商品参与。
     */
    @ApiField("participate_range")
    private Long participateRange;

    /**
     * 店铺会员等级，当is_shop_member为true时，该值才有意义。0：店铺客户；1：普通客户；2：高级会员；3：VIP会员；
     * 4：至尊VIP会员。
     */
    @ApiField("shop_member_level")
    private Long shopMemberLevel;

    /**
     * 活动开始时间。
     */
    @ApiField("start_time")
    private Date startTime;

    /**
     * 满多少元。当is_amount_over为true时，该才字段有意义。注意：单位是分，即10000表示100元。
     */
    @ApiField("total_price")
    private Long totalPrice;

    /**
     * 活动类型： 1表示商品级别的活动；2表示店铺级别的活动。
     */
    @ApiField("type")
    private Long type;

    /**
     * 用户标签。当is_user_tag为true时，该值才有意义。
     */
    @ApiField("user_tag")
    private String userTag;

    public Long getActivityId() {
        return this.activityId;
    }

    public Long getDecreaseAmount() {
        return this.decreaseAmount;
    }

    public String getDescription() {
        return this.description;
    }

    public Long getDiscountRate() {
        return this.discountRate;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public String getExcludeArea() {
        return this.excludeArea;
    }

    public Long getGiftId() {
        return this.giftId;
    }

    public String getGiftName() {
        return this.giftName;
    }

    public String getGiftUrl() {
        return this.giftUrl;
    }

    public Boolean getIsAmountMultiple() {
        return this.isAmountMultiple;
    }

    public Boolean getIsAmountOver() {
        return this.isAmountOver;
    }

    public Boolean getIsDecreaseMoney() {
        return this.isDecreaseMoney;
    }

    public Boolean getIsDiscount() {
        return this.isDiscount;
    }

    public Boolean getIsFreePost() {
        return this.isFreePost;
    }

    public Boolean getIsItemCountOver() {
        return this.isItemCountOver;
    }

    public Boolean getIsItemMultiple() {
        return this.isItemMultiple;
    }

    public Boolean getIsSendGift() {
        return this.isSendGift;
    }

    public Boolean getIsShopMember() {
        return this.isShopMember;
    }

    public Boolean getIsUserTag() {
        return this.isUserTag;
    }

    public Long getItemCount() {
        return this.itemCount;
    }

    public String getName() {
        return this.name;
    }

    public Long getParticipateRange() {
        return this.participateRange;
    }

    public Long getShopMemberLevel() {
        return this.shopMemberLevel;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Long getTotalPrice() {
        return this.totalPrice;
    }

    public Long getType() {
        return this.type;
    }

    public String getUserTag() {
        return this.userTag;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public void setDecreaseAmount(Long decreaseAmount) {
        this.decreaseAmount = decreaseAmount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDiscountRate(Long discountRate) {
        this.discountRate = discountRate;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setExcludeArea(String excludeArea) {
        this.excludeArea = excludeArea;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public void setGiftUrl(String giftUrl) {
        this.giftUrl = giftUrl;
    }

    public void setIsAmountMultiple(Boolean isAmountMultiple) {
        this.isAmountMultiple = isAmountMultiple;
    }

    public void setIsAmountOver(Boolean isAmountOver) {
        this.isAmountOver = isAmountOver;
    }

    public void setIsDecreaseMoney(Boolean isDecreaseMoney) {
        this.isDecreaseMoney = isDecreaseMoney;
    }

    public void setIsDiscount(Boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    public void setIsFreePost(Boolean isFreePost) {
        this.isFreePost = isFreePost;
    }

    public void setIsItemCountOver(Boolean isItemCountOver) {
        this.isItemCountOver = isItemCountOver;
    }

    public void setIsItemMultiple(Boolean isItemMultiple) {
        this.isItemMultiple = isItemMultiple;
    }

    public void setIsSendGift(Boolean isSendGift) {
        this.isSendGift = isSendGift;
    }

    public void setIsShopMember(Boolean isShopMember) {
        this.isShopMember = isShopMember;
    }

    public void setIsUserTag(Boolean isUserTag) {
        this.isUserTag = isUserTag;
    }

    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParticipateRange(Long participateRange) {
        this.participateRange = participateRange;
    }

    public void setShopMemberLevel(Long shopMemberLevel) {
        this.shopMemberLevel = shopMemberLevel;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public void setUserTag(String userTag) {
        this.userTag = userTag;
    }

}
