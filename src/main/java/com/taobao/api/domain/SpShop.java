package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 店铺信息的数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class SpShop extends TaobaoObject {

    private static final long serialVersionUID = 4265312223175498223L;

    /**
     * 店铺好评率，即店铺累计好评数/店铺评价总数。
     */
    @ApiField("gerd")
    private String gerd;

    /**
     * 卖家信用等级,如果是天猫店铺则返回空值
     */
    @ApiField("seller_credit")
    private String sellerCredit;

    /**
     * 店铺标题
     */
    @ApiField("shop_title")
    private String shopTitle;

    /**
     * 店铺的链接URL
     */
    @ApiField("shop_url")
    private String shopUrl;

    /**
     * 是否天猫： 1是，0否
     */
    @ApiField("tmall")
    private String tmall;

    public String getGerd() {
        return this.gerd;
    }

    public String getSellerCredit() {
        return this.sellerCredit;
    }

    public String getShopTitle() {
        return this.shopTitle;
    }

    public String getShopUrl() {
        return this.shopUrl;
    }

    public String getTmall() {
        return this.tmall;
    }

    public void setGerd(String gerd) {
        this.gerd = gerd;
    }

    public void setSellerCredit(String sellerCredit) {
        this.sellerCredit = sellerCredit;
    }

    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public void setTmall(String tmall) {
        this.tmall = tmall;
    }

}
