package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shipping;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.logistics.offline.send response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsOfflineSendResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7647184733737375477L;

    /**
     * 返回发货是否成功is_success
     */
    @ApiField("shipping")
    private Shipping shipping;

    public Shipping getShipping() {
        return this.shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

}
