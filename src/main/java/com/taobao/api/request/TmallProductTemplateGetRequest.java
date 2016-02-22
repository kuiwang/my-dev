package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallProductTemplateGetResponse;

/**
 * TOP API: tmall.product.template.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class TmallProductTemplateGetRequest
        implements TaobaoRequest<TmallProductTemplateGetResponse> {

    /**
     * 类目ID
     */
    private Long cid;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(cid, "cid");
    }

    @Override
    public String getApiMethodName() {
        return "tmall.product.template.get";
    }

    public Long getCid() {
        return this.cid;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TmallProductTemplateGetResponse> getResponseClass() {
        return TmallProductTemplateGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cid", this.cid);
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

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
