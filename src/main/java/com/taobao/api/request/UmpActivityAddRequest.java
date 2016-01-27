package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpActivityAddResponse;

/**
 * TOP API: taobao.ump.activity.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class UmpActivityAddRequest implements TaobaoRequest<UmpActivityAddResponse> {

    /**
     * 活动内容，通过ump sdk里面的MarkeitngTool来生成
     */
    private String content;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    /**
     * 工具id
     */
    private Long toolId;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(content, "content");
        RequestCheckUtils.checkNotEmpty(toolId, "toolId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.ump.activity.add";
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<UmpActivityAddResponse> getResponseClass() {
        return UmpActivityAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
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

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setToolId(Long toolId) {
        this.toolId = toolId;
    }
}
