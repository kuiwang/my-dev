package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SpuTemplateDO;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.product.template.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallProductTemplateGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8394239623735441448L;

    /**
     * 见SpuTemplateDO说明
     */
    @ApiField("template")
    private SpuTemplateDO template;

    public SpuTemplateDO getTemplate() {
        return this.template;
    }

    public void setTemplate(SpuTemplateDO template) {
        this.template = template;
    }

}
