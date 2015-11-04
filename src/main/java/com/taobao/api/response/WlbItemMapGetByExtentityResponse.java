package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.item.map.get.by.extentity response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbItemMapGetByExtentityResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3533199889661999148L;

    /**
     * 物流宝商品id
     */
    @ApiField("item_id")
    private Long itemId;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

}
