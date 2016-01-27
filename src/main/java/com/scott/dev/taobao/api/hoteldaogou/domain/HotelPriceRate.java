package com.scott.dev.taobao.api.hoteldaogou.domain;

/**
 * 酒店价格rate
 */
public class HotelPriceRate {

    /**
     * 手机购买链接前缀
     */
    private String h5BuyUrl;

    /**
     * 价格和库存信息。 B:date 日期必须为 T---T+28 日内的日期（T为当天），且不能重复 C:price 价格 int类型
     * 取值范围1-99999999 单位为分 D:quota 库存 0为不存在，1为存在
     */
    private String inventoryPrice;

    /**
     * 名称
     */
    private String name;

    /**
     * 1, "全额支付" 2, "手续费" 3, "定金" 4, "手续费/间夜" 5, "面付" 6, "后付"
     */
    private Long paymentType;

    /**
     * pc购买链接前缀
     */
    private String pcBuyUrl;

    /**
     * 酒店RPID
     */
    private Long rpid;

    public String getH5BuyUrl() {
        return this.h5BuyUrl;
    }

    public String getInventoryPrice() {
        return this.inventoryPrice;
    }

    public String getName() {
        return this.name;
    }

    public Long getPaymentType() {
        return this.paymentType;
    }

    public String getPcBuyUrl() {
        return this.pcBuyUrl;
    }

    public Long getRpid() {
        return this.rpid;
    }

    public void setH5BuyUrl(String h5BuyUrl) {
        this.h5BuyUrl = h5BuyUrl;
    }

    public void setInventoryPrice(String inventoryPrice) {
        this.inventoryPrice = inventoryPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPaymentType(Long paymentType) {
        this.paymentType = paymentType;
    }

    public void setPcBuyUrl(String pcBuyUrl) {
        this.pcBuyUrl = pcBuyUrl;
    }

    public void setRpid(Long rpid) {
        this.rpid = rpid;
    }

}
