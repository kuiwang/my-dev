package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shipping;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.logistics.online.send response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsOnlineSendResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4464849453479788651L;

    /**
     * 返回发货是否成功is_success
     */
    @ApiField("shipping")
    private Shipping shipping;

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Shipping getShipping() {
        return this.shipping;
    }

}
