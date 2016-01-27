package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbConsignMent;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.item.consignment.page.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbItemConsignmentPageGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8816174163443297396L;

    /**
     * 条件查询结果总数
     */
    @ApiField("total_count")
    private Long totalCount;

    /**
     * 代销关系列表
     */
    @ApiListField("wlb_consign_ments")
    @ApiField("wlb_consign_ment")
    private List<WlbConsignMent> wlbConsignMents;

    public Long getTotalCount() {
        return this.totalCount;
    }

    public List<WlbConsignMent> getWlbConsignMents() {
        return this.wlbConsignMents;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public void setWlbConsignMents(List<WlbConsignMent> wlbConsignMents) {
        this.wlbConsignMents = wlbConsignMents;
    }

}
