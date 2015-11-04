package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商品优惠策略详情
 *
 * @author auto create
 * @since 1.0, null
 */
public class Promotion extends TaobaoObject {

    private static final long serialVersionUID = 8892972571421128873L;

    /**
     * 减价件数，1只减一件，0表示多件
     */
    @ApiField("decrease_num")
    private Long decreaseNum;

    /**
     * 优惠类型，PRICE表示按价格优惠，DISCOUNT表示按折扣优惠
     */
    @ApiField("discount_type")
    private String discountType;

    /**
     * 优惠额度
     */
    @ApiField("discount_value")
    private String discountValue;

    /**
     * 优惠结束日期
     */
    @ApiField("end_date")
    private Date endDate;

    /**
     * 商品数字ID
     */
    @ApiField("num_iid")
    private Long numIid;

    /**
     * 优惠描述
     */
    @ApiField("promotion_desc")
    private String promotionDesc;

    /**
     * 优惠ID
     */
    @ApiField("promotion_id")
    private Long promotionId;

    /**
     * 优惠标题，显示在宝贝详情页面的优惠图标的tip。
     */
    @ApiField("promotion_title")
    private String promotionTitle;

    /**
     * 优惠开始日期
     */
    @ApiField("start_date")
    private Date startDate;

    /**
     * 优惠策略状态，ACTIVE表示有效，UNACTIVE表示无效
     */
    @ApiField("status")
    private String status;

    /**
     * 对应的人群标签ID
     */
    @ApiField("tag_id")
    private Long tagId;

    public Long getDecreaseNum() {
        return this.decreaseNum;
    }

    public void setDecreaseNum(Long decreaseNum) {
        this.decreaseNum = decreaseNum;
    }

    public String getDiscountType() {
        return this.discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getDiscountValue() {
        return this.discountValue;
    }

    public void setDiscountValue(String discountValue) {
        this.discountValue = discountValue;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public String getPromotionDesc() {
        return this.promotionDesc;
    }

    public void setPromotionDesc(String promotionDesc) {
        this.promotionDesc = promotionDesc;
    }

    public Long getPromotionId() {
        return this.promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionTitle() {
        return this.promotionTitle;
    }

    public void setPromotionTitle(String promotionTitle) {
        this.promotionTitle = promotionTitle;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTagId() {
        return this.tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

}
