package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 酒店价格rate
 *
 * @author auto create
 * @since 1.0, null
 */
public class HotelPriceRate extends TaobaoObject {

    private static final long serialVersionUID = 1836929399239496755L;

    /**
     * 手机购买链接前缀
     */
    @ApiField("h5_buy_url")
    private String h5BuyUrl;

    /**
     * 价格和库存信息。 B:date 日期必须为 T---T+28 日内的日期（T为当天），且不能重复 C:price 价格 int类型
     * 取值范围1-99999999 单位为分 D:quota 库存 0为不存在，1为存在
     */
    @ApiField("inventory_price")
    private String inventoryPrice;

    /**
     * 名称
     */
    @ApiField("name")
    private String name;

    /**
     * 1, "全额支付" 2, "手续费" 3, "定金" 4, "手续费/间夜" 5, "面付" 6, "后付"
     */
    @ApiField("payment_type")
    private Long paymentType;

    /**
     * pc购买链接前缀
     */
    @ApiField("pc_buy_url")
    private String pcBuyUrl;

    /**
     * 酒店RPID
     */
    @ApiField("rpid")
    private Long rpid;

    public String getH5BuyUrl() {
        return this.h5BuyUrl;
    }

    public void setH5BuyUrl(String h5BuyUrl) {
        this.h5BuyUrl = h5BuyUrl;
    }

    public String getInventoryPrice() {
        return this.inventoryPrice;
    }

    public void setInventoryPrice(String inventoryPrice) {
        this.inventoryPrice = inventoryPrice;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(Long paymentType) {
        this.paymentType = paymentType;
    }

    public String getPcBuyUrl() {
        return this.pcBuyUrl;
    }

    public void setPcBuyUrl(String pcBuyUrl) {
        this.pcBuyUrl = pcBuyUrl;
    }

    public Long getRpid() {
        return this.rpid;
    }

    public void setRpid(Long rpid) {
        this.rpid = rpid;
    }

}
