package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightWordsareadataGetResponse;

/**
 * TOP API: taobao.simba.insight.wordsareadata.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:19
 */
public class SimbaInsightWordsareadataGetRequest implements
        TaobaoRequest<SimbaInsightWordsareadataGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 关键词
     */
    private String bidword;

    /**
     * 结束时间，格式：yyyy-MM-dd
     */
    private String endDate;

    /**
     * 开始时间，格式：yyyy-MM-dd
     */
    private String startDate;

    public void setBidword(String bidword) {
        this.bidword = bidword;
    }

    public String getBidword() {
        return this.bidword;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.insight.wordsareadata.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bidword", this.bidword);
        txtParams.put("end_date", this.endDate);
        txtParams.put("start_date", this.startDate);
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

    public Class<SimbaInsightWordsareadataGetResponse> getResponseClass() {
        return SimbaInsightWordsareadataGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bidword, "bidword");
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
