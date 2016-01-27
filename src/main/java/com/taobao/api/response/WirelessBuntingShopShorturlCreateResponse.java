package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wireless.bunting.shop.shorturl.create response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WirelessBuntingShopShorturlCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2728722877855337821L;

    /**
     * 短链
     */
    @ApiField("shorturl")
    private String shorturl;

    public String getShorturl() {
        return this.shorturl;
    }

    public void setShorturl(String shorturl) {
        this.shorturl = shorturl;
    }

}
