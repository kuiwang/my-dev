package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ServiceItemProperty;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ts.property.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TsPropertyGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2542931862944359425L;

    /**
     * 服务收费项相关属性对象
     */
    @ApiField("service_item_property")
    private ServiceItemProperty serviceItemProperty;

    public ServiceItemProperty getServiceItemProperty() {
        return this.serviceItemProperty;
    }

    public void setServiceItemProperty(ServiceItemProperty serviceItemProperty) {
        this.serviceItemProperty = serviceItemProperty;
    }

}
