package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightWordsdataGetResponse;

/**
 * TOP API: taobao.simba.insight.wordsdata.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:19
 */
public class SimbaInsightWordsdataGetRequest
        implements TaobaoRequest<SimbaInsightWordsdataGetResponse> {

    /**
     * 关键词列表
     */
    private String bidwordList;

    /**
     * 结束时间
     */
    private String endDate;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 开始时间
     */
    private String startDate;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bidwordList, "bidwordList");
        RequestCheckUtils.checkMaxListSize(bidwordList, 10, "bidwordList");
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.insight.wordsdata.get";
    }

    public String getBidwordList() {
        return this.bidwordList;
    }

    public String getEndDate() {
        return this.endDate;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<SimbaInsightWordsdataGetResponse> getResponseClass() {
        return SimbaInsightWordsdataGetResponse.class;
    }

    public String getStartDate() {
        return this.startDate;
    }

    @Override
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

    public void setBidwordList(String bidwordList) {
        this.bidwordList = bidwordList;
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
