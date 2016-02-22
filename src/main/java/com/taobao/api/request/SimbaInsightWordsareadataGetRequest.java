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
public class SimbaInsightWordsareadataGetRequest
        implements TaobaoRequest<SimbaInsightWordsareadataGetResponse> {

    /**
     * 关键词
     */
    private String bidword;

    /**
     * 结束时间，格式：yyyy-MM-dd
     */
    private String endDate;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 开始时间，格式：yyyy-MM-dd
     */
    private String startDate;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bidword, "bidword");
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.insight.wordsareadata.get";
    }

    public String getBidword() {
        return this.bidword;
    }

    public String getEndDate() {
        return this.endDate;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<SimbaInsightWordsareadataGetResponse> getResponseClass() {
        return SimbaInsightWordsareadataGetResponse.class;
    }

    public String getStartDate() {
        return this.startDate;
    }

    @Override
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

    public void setBidword(String bidword) {
        this.bidword = bidword;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
