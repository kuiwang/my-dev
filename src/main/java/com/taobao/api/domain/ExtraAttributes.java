package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 直通车商品对象属性（Map）
 *
 * @author auto create
 * @since 1.0, null
 */
public class ExtraAttributes extends TaobaoObject {

    private static final long serialVersionUID = 8135582991867585623L;

    /**
     * 商品在淘宝的发布时间
     */
    @ApiField("publish_time")
    private Date publishTime;

    /**
     * 库存数量
     */
    @ApiField("quantity")
    private String quantity;

    /**
     * 商品的累积销量
     */
    @ApiField("sales_count")
    private String salesCount;

    public Date getPublishTime() {
        return this.publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSalesCount() {
        return this.salesCount;
    }

    public void setSalesCount(String salesCount) {
        this.salesCount = salesCount;
    }

}
