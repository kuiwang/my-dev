package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 代送商订单模型
 *
 * @author auto create
 * @since 1.0, null
 */
public class TopDeliveryAgentOrderVO extends TaobaoObject {

    private static final long serialVersionUID = 8116613145462463718L;

    /**
     * 买家地址
     */
    @ApiField("address")
    private String address;

    /**
     * 买家姓名
     */
    @ApiField("buyer_name")
    private String buyerName;

    /**
     * 买家手机号码
     */
    @ApiField("buyer_phone")
    private String buyerPhone;

    /**
     * 买家坐标
     */
    @ApiField("buyer_pos")
    private String buyerPos;

    /**
     * 订单创建时间
     */
    @ApiField("create_time")
    private String createTime;

    /**
     * 结束配送时间
     */
    @ApiField("end_delivery_time")
    private Date endDeliveryTime;

    /**
     * 用户留言
     */
    @ApiField("note")
    private String note;

    /**
     * 订单ID
     */
    @ApiField("order_id")
    private Long orderId;

    /**
     * 1:创建订单 2:买家支付订单 4:买家申请退款 6:卖家拒绝退款 12:卖家确认发货 20:订单关闭 21:交易成功
     * 22:订单关闭未付款
     */
    @ApiField("order_status")
    private Long orderStatus;

    /**
     * 店铺ID
     */
    @ApiField("shop_id")
    private Long shopId;

    /**
     * 店铺坐标
     */
    @ApiField("shop_pos")
    private String shopPos;

    /**
     * 开始配送时间
     */
    @ApiField("start_delivery_time")
    private Date startDeliveryTime;

    /**
     * 店铺地址
     */
    @ApiField("store_address")
    private String storeAddress;

    /**
     * 店铺名称
     */
    @ApiField("store_name")
    private String storeName;

    /**
     * 店铺电话号码
     */
    @ApiField("store_phone")
    private String storePhone;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuyerName() {
        return this.buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPhone() {
        return this.buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerPos() {
        return this.buyerPos;
    }

    public void setBuyerPos(String buyerPos) {
        this.buyerPos = buyerPos;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Date getEndDeliveryTime() {
        return this.endDeliveryTime;
    }

    public void setEndDeliveryTime(Date endDeliveryTime) {
        this.endDeliveryTime = endDeliveryTime;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopPos() {
        return this.shopPos;
    }

    public void setShopPos(String shopPos) {
        this.shopPos = shopPos;
    }

    public Date getStartDeliveryTime() {
        return this.startDeliveryTime;
    }

    public void setStartDeliveryTime(Date startDeliveryTime) {
        this.startDeliveryTime = startDeliveryTime;
    }

    public String getStoreAddress() {
        return this.storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStorePhone() {
        return this.storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

}
