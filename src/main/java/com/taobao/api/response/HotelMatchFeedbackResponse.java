package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.hotel.match.feedback response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelMatchFeedbackResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6643153156843565862L;

    /**
     * 结果回传是否成功
     */
    @ApiField("succ")
    private Boolean succ;

    public Boolean getSucc() {
        return this.succ;
    }

    public void setSucc(Boolean succ) {
        this.succ = succ;
    }

}
