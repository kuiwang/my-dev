package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 质检订单使用明细
 *
 * @author auto create
 * @since 1.0, null
 */
public class QualityUsageDetail extends TaobaoObject {

    private static final long serialVersionUID = 2364626133412784754L;

    /**
     * 该订单已经使用的数量
     */
    @ApiField("application_amount")
    private Long applicationAmount;

    /**
     * 质检服务的收费项目码
     */
    @ApiField("article_item_code")
    private String articleItemCode;

    /**
     * 该订单中尚未使用的数量
     */
    @ApiField("available_amount")
    private Long availableAmount;

    /**
     * 该订单的到期时间
     */
    @ApiField("end_date")
    private Date endDate;

    /**
     * 该订单中每个质检服务的价格
     */
    @ApiField("price")
    private String price;

    /**
     * 该订单订购的数量
     */
    @ApiField("purchas_amount")
    private Long purchasAmount;

    /**
     * 该订单的开通时间
     */
    @ApiField("start_date")
    private Date startDate;

    /**
     * 订购ID
     */
    @ApiField("sub_id")
    private Long subId;

    /**
     * 用户ID
     */
    @ApiField("user_id")
    private Long userId;

    public Long getApplicationAmount() {
        return this.applicationAmount;
    }

    public String getArticleItemCode() {
        return this.articleItemCode;
    }

    public Long getAvailableAmount() {
        return this.availableAmount;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public String getPrice() {
        return this.price;
    }

    public Long getPurchasAmount() {
        return this.purchasAmount;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public Long getSubId() {
        return this.subId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setApplicationAmount(Long applicationAmount) {
        this.applicationAmount = applicationAmount;
    }

    public void setArticleItemCode(String articleItemCode) {
        this.articleItemCode = articleItemCode;
    }

    public void setAvailableAmount(Long availableAmount) {
        this.availableAmount = availableAmount;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPurchasAmount(Long purchasAmount) {
        this.purchasAmount = purchasAmount;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
