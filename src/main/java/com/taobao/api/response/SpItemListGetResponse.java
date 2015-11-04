package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.item.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpItemListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2636313385891432377L;

    /**
     * {"sp_item_list_get_response":{"value":
     * "[{\"itemId\":\"21\",\"sellerId\":\"20668\",\"nick\":\"zztest\",\"title\":\"淘女郎"
     * ,\
     * "price\":\"50.00\",\"finalPrice\":\"\",\"biz30day\":\"0\",\"tk\":\"5\",\"picUrl\":\""
     * ,\"itemUrl\":\"",\"shopUrl\":\""}]"}} itemId:商品ID; sellerId:卖家ID;
     * nick:卖家昵称; title:商品标题; price:商品价格; finalPrice:商品优惠价格, 如果为空则无优惠;
     * biz30day:30天内销售笔数; tk:0-非淘客商品,5-淘客商品; picUrl:图片地址; itemUrl:商品链接地址;
     * shopUrl:店铺链接地址
     */
    @ApiField("value")
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
