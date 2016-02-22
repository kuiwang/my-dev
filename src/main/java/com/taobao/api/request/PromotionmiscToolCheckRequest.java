package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionmiscToolCheckResponse;

/**
 * TOP API: taobao.promotionmisc.tool.check request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class PromotionmiscToolCheckRequest
        implements TaobaoRequest<PromotionmiscToolCheckResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 可使用的元数据。PRD审核后，会告诉isv可使用的元数据。
     */
    private String metaAllow;

    private Long timestamp;

    /**
     * 工具ID, taobao.ump.tool.add成功后返回的id。<br />
     * 支持最小值为：10
     */
    private Long toolId;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(toolId, "toolId");
        RequestCheckUtils.checkMinValue(toolId, 10L, "toolId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.promotionmisc.tool.check";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getMetaAllow() {
        return this.metaAllow;
    }

    @Override
    public Class<PromotionmiscToolCheckResponse> getResponseClass() {
        return PromotionmiscToolCheckResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("meta_allow", this.metaAllow);
        txtParams.put("tool_id", this.toolId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getToolId() {
        return this.toolId;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setMetaAllow(String metaAllow) {
        this.metaAllow = metaAllow;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setToolId(Long toolId) {
        this.toolId = toolId;
    }
}
