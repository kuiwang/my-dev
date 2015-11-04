package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trip.jipiao.agent.order.fail response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TripJipiaoAgentOrderFailResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6316373785483247568L;

    /**
     * 失败订单操作成功失败
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
