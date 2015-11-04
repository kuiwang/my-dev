package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.caipiao.lottery.sendbynick response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CaipiaoLotterySendbynickResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3621628495657359593L;

    /**
     * 赠送是否成功，成功为true, 否则为false
     */
    @ApiField("send_result")
    private Boolean sendResult;

    public void setSendResult(Boolean sendResult) {
        this.sendResult = sendResult;
    }

    public Boolean getSendResult() {
        return this.sendResult;
    }

}
