package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AddressReachableResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.logistics.address.reachable response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsAddressReachableResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2786192637737373463L;

    /**
     * 地址可达返回结果，每个TP对应一个
     */
    @ApiListField("reachable_result_list")
    @ApiField("address_reachable_result")
    private List<AddressReachableResult> reachableResultList;

    public void setReachableResultList(List<AddressReachableResult> reachableResultList) {
        this.reachableResultList = reachableResultList;
    }

    public List<AddressReachableResult> getReachableResultList() {
        return this.reachableResultList;
    }

}
