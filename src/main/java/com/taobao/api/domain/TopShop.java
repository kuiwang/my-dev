package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 店铺基础信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class TopShop extends TaobaoObject {

    private static final long serialVersionUID = 1498422436254822511L;

    /**
     * 外卖店铺id
     */
    @ApiField("shopid")
    private Long shopid;

    /**
     * 外卖店铺名称
     */
    @ApiField("shopname")
    private String shopname;

    public Long getShopid() {
        return this.shopid;
    }

    public String getShopname() {
        return this.shopname;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

}
