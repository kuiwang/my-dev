package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 发货时间数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class DeliveryTime extends TaobaoObject {

    private static final long serialVersionUID = 6185193435914689469L;

    /**
     * 商品级别设置的发货时间。设置了商品级别的发货时间，相对发货时间，则填写相对发货时间的天数（大于3）；绝对发货时间，则填写yyyy-mm-
     * dd格式，如2013-11-11
     */
    @ApiField("delivery_time")
    private String deliveryTime;

    /**
     * 发货时间类型：绝对发货时间或者相对发货时间
     */
    @ApiField("delivery_time_type")
    private String deliveryTimeType;

    /**
     * 设置是否使用发货时间，商品级别，sku级别
     */
    @ApiField("need_delivery_time")
    private String needDeliveryTime;

    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public String getDeliveryTimeType() {
        return this.deliveryTimeType;
    }

    public String getNeedDeliveryTime() {
        return this.needDeliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public void setDeliveryTimeType(String deliveryTimeType) {
        this.deliveryTimeType = deliveryTimeType;
    }

    public void setNeedDeliveryTime(String needDeliveryTime) {
        this.needDeliveryTime = needDeliveryTime;
    }

}
