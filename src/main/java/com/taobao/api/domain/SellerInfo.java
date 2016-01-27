package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 卖家信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class SellerInfo extends TaobaoObject {

    private static final long serialVersionUID = 8837445767467929993L;

    /**
     * 卖家昵称
     */
    @ApiField("seller_nick")
    private String sellerNick;

    /**
     * 卖家类型
     */
    @ApiField("seller_type")
    private String sellerType;

    /**
     * 卖家店铺名称
     */
    @ApiField("shop_name")
    private String shopName;

    public String getSellerNick() {
        return this.sellerNick;
    }

    public String getSellerType() {
        return this.sellerType;
    }

    public String getShopName() {
        return this.shopName;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

}
