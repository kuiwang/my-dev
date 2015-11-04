package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 无条件单品优惠数据对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class ItemPromotion extends TaobaoObject {

    private static final long serialVersionUID = 7388236698155316288L;

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
     * 是否指定用户标签。
     */
    @ApiField("is_user_tag")
    private Boolean isUserTag;

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
     * 活动开始时间。
     */
    @ApiField("start_time")
    private Date startTime;

    /**
     * 用户标签。当is_user_tag为true时，该值才有意义。
     */
    @ApiField("user_tag")
    private String userTag;

    public Long getActivityId() {
        return this.activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getDecreaseAmount() {
        return this.decreaseAmount;
    }

    public void setDecreaseAmount(Long decreaseAmount) {
        this.decreaseAmount = decreaseAmount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate(Long discountRate) {
        this.discountRate = discountRate;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Boolean getIsDecreaseMoney() {
        return this.isDecreaseMoney;
    }

    public void setIsDecreaseMoney(Boolean isDecreaseMoney) {
        this.isDecreaseMoney = isDecreaseMoney;
    }

    public Boolean getIsDiscount() {
        return this.isDiscount;
    }

    public void setIsDiscount(Boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    public Boolean getIsUserTag() {
        return this.isUserTag;
    }

    public void setIsUserTag(Boolean isUserTag) {
        this.isUserTag = isUserTag;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParticipateRange() {
        return this.participateRange;
    }

    public void setParticipateRange(Long participateRange) {
        this.participateRange = participateRange;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getUserTag() {
        return this.userTag;
    }

    public void setUserTag(String userTag) {
        this.userTag = userTag;
    }

}
