package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ServiceSubscribe;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ts.subscribe.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TsSubscribeGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6611134198695682782L;

    /**
     * 订购关系对象
     */
    @ApiField("service_subscribe")
    private ServiceSubscribe serviceSubscribe;

    public ServiceSubscribe getServiceSubscribe() {
        return this.serviceSubscribe;
    }

    public void setServiceSubscribe(ServiceSubscribe serviceSubscribe) {
        this.serviceSubscribe = serviceSubscribe;
    }

}
