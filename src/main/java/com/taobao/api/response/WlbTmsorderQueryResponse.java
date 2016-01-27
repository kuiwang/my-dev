package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbTmsOrder;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.tmsorder.query response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbTmsorderQueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4786333699686349788L;

    /**
     * 物流订单运单信息列表
     */
    @ApiListField("tms_order_list")
    @ApiField("wlb_tms_order")
    private List<WlbTmsOrder> tmsOrderList;

    /**
     * 结果总数
     */
    @ApiField("total_count")
    private Long totalCount;

    public List<WlbTmsOrder> getTmsOrderList() {
        return this.tmsOrderList;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setTmsOrderList(List<WlbTmsOrder> tmsOrderList) {
        this.tmsOrderList = tmsOrderList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
