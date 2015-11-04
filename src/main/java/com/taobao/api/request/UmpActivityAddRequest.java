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

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 活动内容，通过ump sdk里面的MarkeitngTool来生成
     */
    private String content;

    /**
     * 工具id
     */
    private Long toolId;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setToolId(Long toolId) {
        this.toolId = toolId;
    }

    public Long getToolId() {
        return this.toolId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ump.activity.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
        txtParams.put("tool_id", this.toolId);
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

    public Class<UmpActivityAddResponse> getResponseClass() {
        return UmpActivityAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(content, "content");
        RequestCheckUtils.checkNotEmpty(toolId, "toolId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
