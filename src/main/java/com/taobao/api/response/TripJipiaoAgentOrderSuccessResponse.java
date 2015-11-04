package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trip.jipiao.agent.order.success response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TripJipiaoAgentOrderSuccessResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4463289318938334217L;

    /**
     * 返回操作成功失败信息
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
