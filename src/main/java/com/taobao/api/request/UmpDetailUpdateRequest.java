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

    /**
     * 活动详情内容，可以通过ump sdk中的MarketingTool来生成这个内容
     */
    private String content;

    /**
     * 活动详情id
     */
    private Long detailId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(content, "content");
        RequestCheckUtils.checkNotEmpty(detailId, "detailId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.ump.detail.update";
    }

    public String getContent() {
        return this.content;
    }

    public Long getDetailId() {
        return this.detailId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<UmpDetailUpdateResponse> getResponseClass() {
        return UmpDetailUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("content", this.content);
        txtParams.put("detail_id", this.detailId);
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

    public void setContent(String content) {
        this.content = content;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
