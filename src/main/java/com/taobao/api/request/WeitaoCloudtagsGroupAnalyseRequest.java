package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WeitaoCloudtagsGroupAnalyseResponse;

/**
 * TOP API: taobao.weitao.cloudtags.group.analyse request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class WeitaoCloudtagsGroupAnalyseRequest implements
        TaobaoRequest<WeitaoCloudtagsGroupAnalyseResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 透视的sql
     */
    private String analyzeExpression;

    /**
     * 分组sql信息
     */
    private String groupExpression;

    public void setAnalyzeExpression(String analyzeExpression) {
        this.analyzeExpression = analyzeExpression;
    }

    public String getAnalyzeExpression() {
        return this.analyzeExpression;
    }

    public void setGroupExpression(String groupExpression) {
        this.groupExpression = groupExpression;
    }

    public String getGroupExpression() {
        return this.groupExpression;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.weitao.cloudtags.group.analyse";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("analyze_expression", this.analyzeExpression);
        txtParams.put("group_expression", this.groupExpression);
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

    public Class<WeitaoCloudtagsGroupAnalyseResponse> getResponseClass() {
        return WeitaoCloudtagsGroupAnalyseResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(analyzeExpression, "analyzeExpression");
        RequestCheckUtils.checkNotEmpty(groupExpression, "groupExpression");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
