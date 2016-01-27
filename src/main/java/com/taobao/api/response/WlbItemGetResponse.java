package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbItem;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.item.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbItemGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3762285996915474892L;

    /**
     * 商品信息
     */
    @ApiField("item")
    private WlbItem item;

    public WlbItem getItem() {
        return this.item;
    }

    public void setItem(WlbItem item) {
        this.item = item;
    }

}
