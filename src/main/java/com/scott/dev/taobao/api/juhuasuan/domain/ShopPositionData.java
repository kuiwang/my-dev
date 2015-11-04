package com.scott.dev.taobao.api.juhuasuan.domain;

/**
 * 聚划算应用，展示本地化服务类商品的分店地理信息的对象
 */
public class ShopPositionData {

    /**
     * 店铺的地址
     */
    private String address;

    /**
     * 卖家店铺所在的城市
     */
    private String city;

    /**
     * 淘宝商品的数字id，对应了商品线的一个商品对象标识
     */
    private Long itemId;

    /**
     * 卖家店铺的手机联系号码
     */
    private String phone;

    /**
     * 卖家的账户数字id
     */
    private Long sellerId;

    /**
     * 标识了一个唯一的地址位置对象，具有独立的坐标和交通信息
     */
    private Long shopPositionId;

    /**
     * 描述店铺的名称
     */
    private String storeName;

    /**
     * 店铺的一些交通提示信息
     */
    private String traffic;

    /**
     * 店铺所在的经度，放大100000倍
     */
    private Long x;

    /**
     * 店铺所在的纬度，放大100000倍
     */
    private Long y;

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

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getShopPositionId() {
        return this.shopPositionId;
    }

    public void setShopPositionId(Long shopPositionId) {
        this.shopPositionId = shopPositionId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getTraffic() {
        return this.traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public Long getX() {
        return this.x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public Long getY() {
        return this.y;
    }

    public void setY(Long y) {
        this.y = y;
    }

}
