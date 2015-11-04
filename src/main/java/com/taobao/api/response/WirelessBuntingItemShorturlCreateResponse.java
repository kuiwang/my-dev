package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wireless.bunting.item.shorturl.create response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WirelessBuntingItemShorturlCreateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3322892555773811843L;

    /**
     * 短地址
     */
    @ApiField("shorturl")
    private String shorturl;

    public void setShorturl(String shorturl) {
        this.shorturl = shorturl;
    }

    public String getShorturl() {
        return this.shorturl;
    }

}
