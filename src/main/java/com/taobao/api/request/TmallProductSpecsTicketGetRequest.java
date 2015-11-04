package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallProductSpecsTicketGetResponse;

/**
 * TOP API: tmall.product.specs.ticket.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TmallProductSpecsTicketGetRequest implements
        TaobaoRequest<TmallProductSpecsTicketGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 产品规格ID，多个用逗号分隔
     */
    private String specIds;

    public void setSpecIds(String specIds) {
        this.specIds = specIds;
    }

    public String getSpecIds() {
        return this.specIds;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "tmall.product.specs.ticket.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("spec_ids", this.specIds);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<TmallProductSpecsTicketGetResponse> getResponseClass() {
        return TmallProductSpecsTicketGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(specIds, "specIds");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
