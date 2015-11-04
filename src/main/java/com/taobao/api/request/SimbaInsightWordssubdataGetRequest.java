package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightWordssubdataGetResponse;

/**
 * TOP API: taobao.simba.insight.wordssubdata.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:19
 */
public class SimbaInsightWordssubdataGetRequest implements
        TaobaoRequest<SimbaInsightWordssubdataGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 关键词列表
     */
    private String bidwordList;

    /**
     * 结束时间
     */
    private String endDate;

    /**
     * 开始时间
     */
    private String startDate;

    public void setBidwordList(String bidwordList) {
        this.bidwordList = bidwordList;
    }

    public String getBidwordList() {
        return this.bidwordList;
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
        return "taobao.simba.insight.wordssubdata.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bidword_list", this.bidwordList);
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

    public Class<SimbaInsightWordssubdataGetResponse> getResponseClass() {
        return SimbaInsightWordssubdataGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bidwordList, "bidwordList");
        RequestCheckUtils.checkMaxListSize(bidwordList, 10, "bidwordList");
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
