package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DistributorItemFlow;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.fenxiao.distributor.procuct.static.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoDistributorProcuctStaticGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2615233686914893735L;

    /**
     * 分销商商品流量
     */
    @ApiListField("distributor_item_flows")
    @ApiField("distributor_item_flow")
    private List<DistributorItemFlow> distributorItemFlows;

    /**
     * 执行结果，true表示执行成功；false表示执行失败。
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public List<DistributorItemFlow> getDistributorItemFlows() {
        return this.distributorItemFlows;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setDistributorItemFlows(List<DistributorItemFlow> distributorItemFlows) {
        this.distributorItemFlows = distributorItemFlows;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
