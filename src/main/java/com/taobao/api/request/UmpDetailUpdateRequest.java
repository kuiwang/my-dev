package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpDetailUpdateResponse;

/**
 * TOP API: taobao.ump.detail.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class UmpDetailUpdateRequest implements TaobaoRequest<UmpDetailUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 活动详情内容，可以通过ump sdk中的MarketingTool来生成这个内容
     */
    private String content;

    /**
     * 活动详情id
     */
    private Long detailId;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public Long getDetailId() {
        return this.detailId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ump.detail.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
        txtParams.put("detail_id", this.detailId);
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

    public Class<UmpDetailUpdateResponse> getResponseClass() {
        return UmpDetailUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(content, "content");
        RequestCheckUtils.checkNotEmpty(detailId, "detailId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
