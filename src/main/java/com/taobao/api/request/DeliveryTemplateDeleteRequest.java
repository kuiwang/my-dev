package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DeliveryTemplateDeleteResponse;

/**
 * TOP API: taobao.delivery.template.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class DeliveryTemplateDeleteRequest implements TaobaoRequest<DeliveryTemplateDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 运费模板ID
     */
    private Long templateId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(templateId, "templateId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.delivery.template.delete";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<DeliveryTemplateDeleteResponse> getResponseClass() {
        return DeliveryTemplateDeleteResponse.class;
    }

    public Long getTemplateId() {
        return this.templateId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("template_id", this.templateId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
