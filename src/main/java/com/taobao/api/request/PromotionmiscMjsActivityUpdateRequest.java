package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionmiscMjsActivityUpdateResponse;

/**
 * TOP API: taobao.promotionmisc.mjs.activity.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class PromotionmiscMjsActivityUpdateRequest
        implements TaobaoRequest<PromotionmiscMjsActivityUpdateResponse> {

    /**
     * 活动id。<br />
     * 支持最小值为：0
     */
    private Long activityId;

    /**
     * 减多少钱。当is_decrease_money为true时，该值才有意义。注意：该值单位为分，即100表示1元。<br />
     * 支持最小值为：0
     */
    private Long decreaseAmount;

    /**
     * 折扣值。当is_discount为true时，该值才有意义。注意：800表示8折。<br />
     * 支持最小值为：0
     */
    private Long discountRate;

    /**
     * 活动结束时间。
     */
    private Date endTime;

    /**
     * 免邮的排除地区，即，除指定地区外，其他地区包邮。当is_free_post为true时，该值才有意义。代码使用*链接，代码为行政区划代码
     * 。
     */
    private String excludeArea;

    /**
     * 礼品id，当is_send_gift为true时，该值才有意义。
     * 1）只有填写真实的淘宝商品id时，才能生成物流单，并且在确定订单的页面上可以点击该商品名称跳转到商品详情页面
     * 。2）当礼物为实物商品时(有宝贝id),礼物必须为上架商品,不能为虚拟商品,不能为拍卖商品,不能有sku,不符合条件的,不做为礼物。
     */
    private Long giftId;

    /**
     * 礼品名称。当is_send_gift为true时，该值才有意义。<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String giftName;

    /**
     * 商品详情的url，当is_send_gift为true时，该值才有效。
     */
    private String giftUrl;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 满元是否上不封顶。当is_amount_over为true时，该值才有意义。当该值为true时，表示满元上不封顶，例如满100元减10元
     * ，当满200时，则减20元。。。默认为false。
     */
    private Boolean isAmountMultiple;

    /**
     * 是否有满元条件。
     */
    private Boolean isAmountOver;

    /**
     * 是否有减钱行为。
     */
    private Boolean isDecreaseMoney;

    /**
     * 是否有打折行为。
     */
    private Boolean isDiscount;

    /**
     * 是否有免邮行为。
     */
    private Boolean isFreePost;

    /**
     * 是否有满件条件。
     */
    private Boolean isItemCountOver;

    /**
     * 满件是否上不封顶。当is_amount_multiple为true时，该值才有意义。当该值为true时，表示满件上不封顶，
     * 例如满10件减2元，当满20件时，则减4元。。。 默认为false。
     */
    private Boolean isItemMultiple;

    /**
     * 是否有送礼品行为。
     */
    private Boolean isSendGift;

    /**
     * 是否有店铺会员等级条件。
     */
    private Boolean isShopMember;

    /**
     * 是否指定用户标签。
     */
    private Boolean isUserTag;

    /**
     * 满多少件。当is_item_count_over为true时，该值才有意义。<br />
     * 支持最小值为：0
     */
    private Long itemCount;

    /**
     * 活动名称。<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String name;

    /**
     * 活动范围：0表示全部参与； 1表示部分商品参与。<br />
     * 支持最大值为：1<br />
     * 支持最小值为：0<br />
     * 支持的最大列表长度为：1
     */
    private Long participateRange;

    /**
     * 店铺会员等级，当is_shop_member为true时，该值才有意义。0：店铺客户；1：普通客户；2：高级会员；3：VIP会员；
     * 4：至尊VIP会员。<br />
     * 支持最大值为：9<br />
     * 支持最小值为：0
     */
    private Long shopMemberLevel;

    /**
     * 活动开始时间。
     */
    private Date startTime;

    private Long timestamp;

    /**
     * 满多少元。当is_amount_over为true时，该才字段有意义。注意：单位是分，即10000表示100元。<br />
     * 支持最小值为：0
     */
    private Long totalPrice;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 用户标签。当is_user_tag为true时，该值才有意义。
     */
    private String userTag;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(activityId, "activityId");
        RequestCheckUtils.checkMinValue(activityId, 0L, "activityId");
        RequestCheckUtils.checkMinValue(decreaseAmount, 0L, "decreaseAmount");
        RequestCheckUtils.checkMinValue(discountRate, 0L, "discountRate");
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkMaxLength(giftName, 32, "giftName");
        RequestCheckUtils.checkMinValue(itemCount, 0L, "itemCount");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkMaxLength(name, 32, "name");
        RequestCheckUtils.checkNotEmpty(participateRange, "participateRange");
        RequestCheckUtils.checkMaxValue(participateRange, 1L, "participateRange");
        RequestCheckUtils.checkMinValue(participateRange, 0L, "participateRange");
        RequestCheckUtils.checkMaxValue(shopMemberLevel, 9L, "shopMemberLevel");
        RequestCheckUtils.checkMinValue(shopMemberLevel, 0L, "shopMemberLevel");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
        RequestCheckUtils.checkMinValue(totalPrice, 0L, "totalPrice");
    }

    public Long getActivityId() {
        return this.activityId;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.promotionmisc.mjs.activity.update";
    }

    public Long getDecreaseAmount() {
        return this.decreaseAmount;
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

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
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

    @Override
    public Class<PromotionmiscMjsActivityUpdateResponse> getResponseClass() {
        return PromotionmiscMjsActivityUpdateResponse.class;
    }

    public Long getShopMemberLevel() {
        return this.shopMemberLevel;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("activity_id", this.activityId);
        txtParams.put("decrease_amount", this.decreaseAmount);
        txtParams.put("discount_rate", this.discountRate);
        txtParams.put("end_time", this.endTime);
        txtParams.put("exclude_area", this.excludeArea);
        txtParams.put("gift_id", this.giftId);
        txtParams.put("gift_name", this.giftName);
        txtParams.put("gift_url", this.giftUrl);
        txtParams.put("is_amount_multiple", this.isAmountMultiple);
        txtParams.put("is_amount_over", this.isAmountOver);
        txtParams.put("is_decrease_money", this.isDecreaseMoney);
        txtParams.put("is_discount", this.isDiscount);
        txtParams.put("is_free_post", this.isFreePost);
        txtParams.put("is_item_count_over", this.isItemCountOver);
        txtParams.put("is_item_multiple", this.isItemMultiple);
        txtParams.put("is_send_gift", this.isSendGift);
        txtParams.put("is_shop_member", this.isShopMember);
        txtParams.put("is_user_tag", this.isUserTag);
        txtParams.put("item_count", this.itemCount);
        txtParams.put("name", this.name);
        txtParams.put("participate_range", this.participateRange);
        txtParams.put("shop_member_level", this.shopMemberLevel);
        txtParams.put("start_time", this.startTime);
        txtParams.put("total_price", this.totalPrice);
        txtParams.put("user_tag", this.userTag);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getTotalPrice() {
        return this.totalPrice;
    }

    public String getUserTag() {
        return this.userTag;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public void setDecreaseAmount(Long decreaseAmount) {
        this.decreaseAmount = decreaseAmount;
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

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setUserTag(String userTag) {
        this.userTag = userTag;
    }
}
