package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 外卖店信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class TakeoutShop extends TaobaoObject {

    private static final long serialVersionUID = 4851876152889254968L;

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
     * 商户类型 （1：品牌连锁 2:代理商 3：单店经营）
     */
    @ApiField("merchant_type")
    private Long merchantType;

    /**
     * 店铺名称
     */
    @ApiField("name")
    private String name;

    /**
     * 电话号码
     */
    @ApiField("phone")
    private String phone;

    /**
     * 店铺标志图片
     */
    @ApiField("pic_url")
    private String picUrl;

    /**
     * 地图坐标x，注意此坐标是乘以100000后的值
     */
    @ApiField("posx")
    private Long posx;

    /**
     * 地图坐标y，注意此坐标是乘以100000后的值
     */
    @ApiField("posy")
    private Long posy;

    /**
     * 外卖店铺id
     */
    @ApiField("shopid")
    private Long shopid;

    /**
     * 店铺与ISV的关联关系
     */
    @ApiField("shopoutid")
    private String shopoutid;

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public Long getMerchantType() {
        return this.merchantType;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public Long getPosx() {
        return this.posx;
    }

    public Long getPosy() {
        return this.posy;
    }

    public Long getShopid() {
        return this.shopid;
    }

    public String getShopoutid() {
        return this.shopoutid;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMerchantType(Long merchantType) {
        this.merchantType = merchantType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setPosx(Long posx) {
        this.posx = posx;
    }

    public void setPosy(Long posy) {
        this.posy = posy;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public void setShopoutid(String shopoutid) {
        this.shopoutid = shopoutid;
    }

}
