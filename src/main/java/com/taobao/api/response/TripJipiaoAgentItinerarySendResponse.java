package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trip.jipiao.agent.itinerary.send response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TripJipiaoAgentItinerarySendResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7464923212222578868L;

    /**
     * 成功或者失败
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
