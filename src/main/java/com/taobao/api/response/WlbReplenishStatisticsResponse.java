package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbReplenish;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.replenish.statistics response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbReplenishStatisticsResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2413179151671836125L;

    /**
     * 补货统计列表
     */
    @ApiListField("replenish_list")
    @ApiField("wlb_replenish")
    private List<WlbReplenish> replenishList;

    /**
     * 查询记录总数
     */
    @ApiField("total_count")
    private Long totalCount;

    public List<WlbReplenish> getReplenishList() {
        return this.replenishList;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setReplenishList(List<WlbReplenish> replenishList) {
        this.replenishList = replenishList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
