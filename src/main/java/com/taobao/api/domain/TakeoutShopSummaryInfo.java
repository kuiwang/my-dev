package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 外卖店信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class TakeoutShopSummaryInfo extends TaobaoObject {

    private static final long serialVersionUID = 8871989196351137676L;

    /**
     * 店铺地址
     */
    @ApiField("address")
    private String address;

    /**
     * 城市
     */
    @ApiField("city")
    private String city;

    /**
     * 等待确认的兑换券的订单笔数
     */
    @ApiField("digital_wait_confirm")
    private Long digitalWaitConfirm;

    /**
     * 店铺营业状态，歇业：0，营业：1
     */
    @ApiField("is_open")
    private Long isOpen;

    /**
     * 外卖店铺名称
     */
    @ApiField("name")
    private String name;

    /**
     * 电话号码
     */
    @ApiField("phone")
    private String phone;

    /**
     * 外卖店铺id
     */
    @ApiField("shopid")
    private Long shopid;

    /**
     * 店铺与ISV的关联ID
     */
    @ApiField("shopoutid")
    private String shopoutid;

    /**
     * 等待确认配送的订单笔数
     */
    @ApiField("wait_confirm")
    private Long waitConfirm;

    /**
     * 等待退款的订单笔数
     */
    @ApiField("wait_refund")
    private Long waitRefund;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getDigitalWaitConfirm() {
        return this.digitalWaitConfirm;
    }

    public void setDigitalWaitConfirm(Long digitalWaitConfirm) {
        this.digitalWaitConfirm = digitalWaitConfirm;
    }

    public Long getIsOpen() {
        return this.isOpen;
    }

    public void setIsOpen(Long isOpen) {
        this.isOpen = isOpen;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getShopid() {
        return this.shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public String getShopoutid() {
        return this.shopoutid;
    }

    public void setShopoutid(String shopoutid) {
        this.shopoutid = shopoutid;
    }

    public Long getWaitConfirm() {
        return this.waitConfirm;
    }

    public void setWaitConfirm(Long waitConfirm) {
        this.waitConfirm = waitConfirm;
    }

    public Long getWaitRefund() {
        return this.waitRefund;
    }

    public void setWaitRefund(Long waitRefund) {
        this.waitRefund = waitRefund;
    }

}
