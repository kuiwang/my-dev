package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpDetailAddResponse;

/**
 * TOP API: taobao.ump.detail.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class UmpDetailAddRequest implements TaobaoRequest<UmpDetailAddResponse> {

    /**
     * 增加工具详情
     */
    private Long actId;

    /**
     * 活动详情内容，json格式，可以通过ump sdk中的MarketingTool来进行处理
     */
    private String content;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(actId, "actId");
        RequestCheckUtils.checkNotEmpty(content, "content");
    }

    public Long getActId() {
        return this.actId;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.ump.detail.add";
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<UmpDetailAddResponse> getResponseClass() {
        return UmpDetailAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("act_id", this.actId);
        txtParams.put("content", this.content);
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

    public void setActId(Long actId) {
        this.actId = actId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
