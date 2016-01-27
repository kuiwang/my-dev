package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpDetailListAddResponse;

/**
 * TOP API: taobao.ump.detail.list.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class UmpDetailListAddRequest implements TaobaoRequest<UmpDetailListAddResponse> {

    /**
     * 营销活动id。
     */
    private Long actId;

    /**
     * 营销详情的列表。此列表由detail的json字符串组成。最多插入为10个。
     */
    private String details;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(actId, "actId");
        RequestCheckUtils.checkNotEmpty(details, "details");
    }

    public Long getActId() {
        return this.actId;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.ump.detail.list.add";
    }

    public String getDetails() {
        return this.details;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<UmpDetailListAddResponse> getResponseClass() {
        return UmpDetailListAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("act_id", this.actId);
        txtParams.put("details", this.details);
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

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
