package com.taobao.api.response;

import java.util.Date;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.tbk.shop.coupon.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TbkShopCouponGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8137189322638946631L;

    /**
     * 券值，精确到分
     */
    @ApiField("amount")
    private Long amount;

    /**
     * 券数量
     */
    @ApiField("count")
    private Long count;

    /**
     * 优惠的结束时间
     */
    @ApiField("end_time")
    private Date endTime;

    /**
     * 优惠的开始时间
     */
    @ApiField("start_time")
    private Date startTime;

    /**
     * 券名称
     */
    @ApiField("title")
    private String title;

    public Long getAmount() {
        return this.amount;
    }

    public Long getCount() {
        return this.count;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
