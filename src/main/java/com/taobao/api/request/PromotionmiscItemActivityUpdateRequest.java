package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionmiscItemActivityUpdateResponse;

/**
 * TOP API: taobao.promotionmisc.item.activity.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class PromotionmiscItemActivityUpdateRequest implements
        TaobaoRequest<PromotionmiscItemActivityUpdateResponse> {

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

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 是否有减钱行为。
     */
    private Boolean isDecreaseMoney;

    /**
     * 是否有打折行为。
     */
    private Boolean isDiscount;

    /**
     * 是否指定用户标签。
     */
    private Boolean isUserTag;

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
     * 活动开始时间。
     */
    private Date startTime;

    private Long timestamp;

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
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkMaxLength(name, 32, "name");
        RequestCheckUtils.checkNotEmpty(participateRange, "participateRange");
        RequestCheckUtils.checkMaxValue(participateRange, 1L, "participateRange");
        RequestCheckUtils.checkMinValue(participateRange, 0L, "participateRange");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
    }

    public Long getActivityId() {
        return this.activityId;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.promotionmisc.item.activity.update";
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

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Boolean getIsDecreaseMoney() {
        return this.isDecreaseMoney;
    }

    public Boolean getIsDiscount() {
        return this.isDiscount;
    }

    public Boolean getIsUserTag() {
        return this.isUserTag;
    }

    public String getName() {
        return this.name;
    }

    public Long getParticipateRange() {
        return this.participateRange;
    }

    @Override
    public Class<PromotionmiscItemActivityUpdateResponse> getResponseClass() {
        return PromotionmiscItemActivityUpdateResponse.class;
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
        txtParams.put("is_decrease_money", this.isDecreaseMoney);
        txtParams.put("is_discount", this.isDiscount);
        txtParams.put("is_user_tag", this.isUserTag);
        txtParams.put("name", this.name);
        txtParams.put("participate_range", this.participateRange);
        txtParams.put("start_time", this.startTime);
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

    public void setIsDecreaseMoney(Boolean isDecreaseMoney) {
        this.isDecreaseMoney = isDecreaseMoney;
    }

    public void setIsDiscount(Boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    public void setIsUserTag(Boolean isUserTag) {
        this.isUserTag = isUserTag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParticipateRange(Long participateRange) {
        this.participateRange = participateRange;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUserTag(String userTag) {
        this.userTag = userTag;
    }
}
