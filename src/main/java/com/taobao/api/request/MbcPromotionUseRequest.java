package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MbcPromotionUseResponse;

/**
 * TOP API: taobao.mbc.promotion.use request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:52
 */
public class MbcPromotionUseRequest implements TaobaoRequest<MbcPromotionUseResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 实际金额单位(分)
     */
    private Long actualFee;

    /**
     * 优惠金额单位(分)
     */
    private Long discountFee;

    /**
     * 有效结束时间
     */
    private Date endTime;

    /**
     * 外部流水号， promotion_type+outer_no 唯一
     */
    private String outerNo;

    /**
     * 权益ID
     */
    private String promotionId;

    /**
     * 权限类型
     */
    private Long promotionType;

    /**
     * 有效开始时间
     */
    private Date startTime;

    /**
     * 交易总金额单位(分)
     */
    private Long totalFee;

    /**
     * 使用时间
     */
    private Date useTime;

    /**
     * 买家淘宝ID
     */
    private Long userId;

    public void setActualFee(Long actualFee) {
        this.actualFee = actualFee;
    }

    public Long getActualFee() {
        return this.actualFee;
    }

    public void setDiscountFee(Long discountFee) {
        this.discountFee = discountFee;
    }

    public Long getDiscountFee() {
        return this.discountFee;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setOuterNo(String outerNo) {
        this.outerNo = outerNo;
    }

    public String getOuterNo() {
        return this.outerNo;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public void setPromotionType(Long promotionType) {
        this.promotionType = promotionType;
    }

    public Long getPromotionType() {
        return this.promotionType;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    public Long getTotalFee() {
        return this.totalFee;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Date getUseTime() {
        return this.useTime;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.mbc.promotion.use";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("actual_fee", this.actualFee);
        txtParams.put("discount_fee", this.discountFee);
        txtParams.put("end_time", this.endTime);
        txtParams.put("outer_no", this.outerNo);
        txtParams.put("promotion_id", this.promotionId);
        txtParams.put("promotion_type", this.promotionType);
        txtParams.put("start_time", this.startTime);
        txtParams.put("total_fee", this.totalFee);
        txtParams.put("use_time", this.useTime);
        txtParams.put("user_id", this.userId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<MbcPromotionUseResponse> getResponseClass() {
        return MbcPromotionUseResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(actualFee, "actualFee");
        RequestCheckUtils.checkNotEmpty(discountFee, "discountFee");
        RequestCheckUtils.checkNotEmpty(outerNo, "outerNo");
        RequestCheckUtils.checkNotEmpty(promotionId, "promotionId");
        RequestCheckUtils.checkNotEmpty(promotionType, "promotionType");
        RequestCheckUtils.checkNotEmpty(totalFee, "totalFee");
        RequestCheckUtils.checkNotEmpty(useTime, "useTime");
        RequestCheckUtils.checkNotEmpty(userId, "userId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
