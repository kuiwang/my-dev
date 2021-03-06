package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AthenaItemSolutionDelResponse;

/**
 * TOP API: taobao.athena.item.solution.del request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:51
 */
public class AthenaItemSolutionDelRequest implements TaobaoRequest<AthenaItemSolutionDelResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主键ID
     */
    private Long id;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(id, "id");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.athena.item.solution.del";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getId() {
        return this.id;
    }

    @Override
    public Class<AthenaItemSolutionDelResponse> getResponseClass() {
        return AthenaItemSolutionDelResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
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

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
