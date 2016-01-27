package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DeliveryTemplate;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.delivery.templates.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DeliveryTemplatesGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6689658956727358453L;

    /**
     * 运费模板列表
     */
    @ApiListField("delivery_templates")
    @ApiField("delivery_template")
    private List<DeliveryTemplate> deliveryTemplates;

    /**
     * 获得到符合条件的结果总数
     */
    @ApiField("total_results")
    private Long totalResults;

    public List<DeliveryTemplate> getDeliveryTemplates() {
        return this.deliveryTemplates;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setDeliveryTemplates(List<DeliveryTemplate> deliveryTemplates) {
        this.deliveryTemplates = deliveryTemplates;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
