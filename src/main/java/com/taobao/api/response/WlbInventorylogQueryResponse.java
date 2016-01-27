package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbItemInventoryLog;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.inventorylog.query response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbInventorylogQueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7372649587472241798L;

    /**
     * 库存变更记录列表
     */
    @ApiListField("inventory_log_list")
    @ApiField("wlb_item_inventory_log")
    private List<WlbItemInventoryLog> inventoryLogList;

    /**
     * 记录数
     */
    @ApiField("total_count")
    private Long totalCount;

    public List<WlbItemInventoryLog> getInventoryLogList() {
        return this.inventoryLogList;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setInventoryLogList(List<WlbItemInventoryLog> inventoryLogList) {
        this.inventoryLogList = inventoryLogList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
