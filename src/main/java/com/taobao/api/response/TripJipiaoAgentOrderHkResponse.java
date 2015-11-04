package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trip.jipiao.agent.order.hk response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TripJipiaoAgentOrderHkResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4869316713838931531L;

    /**
     * 手工HK成功失败
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

}
