package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WaybillApplySubscriptionInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.waybill.i.search response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbWaybillISearchResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7531794272415447347L;

    /**
     * 订购关系
     */
    @ApiListField("subscribtions")
    @ApiField("waybill_apply_subscription_info")
    private List<WaybillApplySubscriptionInfo> subscribtions;

    public void setSubscribtions(List<WaybillApplySubscriptionInfo> subscribtions) {
        this.subscribtions = subscribtions;
    }

    public List<WaybillApplySubscriptionInfo> getSubscribtions() {
        return this.subscribtions;
    }

}
