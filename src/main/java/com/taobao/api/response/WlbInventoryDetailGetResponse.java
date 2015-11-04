package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbInventory;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.inventory.detail.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbInventoryDetailGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6737134167353259225L;

    /**
     * 库存详情列表
     */
    @ApiListField("inventory_list")
    @ApiField("wlb_inventory")
    private List<WlbInventory> inventoryList;

    /**
     * 商品ID
     */
    @ApiField("item_id")
    private Long itemId;

    public void setInventoryList(List<WlbInventory> inventoryList) {
        this.inventoryList = inventoryList;
    }

    public List<WlbInventory> getInventoryList() {
        return this.inventoryList;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

}
