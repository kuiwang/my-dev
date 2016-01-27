package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.waybill.i.cancel response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbWaybillICancelResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6479188659917351547L;

    /**
     * 调用取消是否成功
     */
    @ApiField("cancel_result")
    private Boolean cancelResult;

    public Boolean getCancelResult() {
        return this.cancelResult;
    }

    public void setCancelResult(Boolean cancelResult) {
        this.cancelResult = cancelResult;
    }

}
