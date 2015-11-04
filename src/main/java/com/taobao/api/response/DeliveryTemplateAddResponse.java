package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DeliveryTemplate;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.delivery.template.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DeliveryTemplateAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6313585259743816571L;

    /**
     * 模板对象
     */
    @ApiField("delivery_template")
    private DeliveryTemplate deliveryTemplate;

    public void setDeliveryTemplate(DeliveryTemplate deliveryTemplate) {
        this.deliveryTemplate = deliveryTemplate;
    }

    public DeliveryTemplate getDeliveryTemplate() {
        return this.deliveryTemplate;
    }

}
