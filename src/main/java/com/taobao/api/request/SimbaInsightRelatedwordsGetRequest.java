package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightRelatedwordsGetResponse;

/**
 * TOP API: taobao.simba.insight.relatedwords.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:19
 */
public class SimbaInsightRelatedwordsGetRequest implements
        TaobaoRequest<SimbaInsightRelatedwordsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 要查询的词列表
     */
    private String bidwordList;

    /**
     * 表示返回数据的条数<br />
     * 支持最大值为：10<br />
     * 支持最小值为：1
     */
    private Long number;

    public void setBidwordList(String bidwordList) {
        this.bidwordList = bidwordList;
    }

    public String getBidwordList() {
        return this.bidwordList;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getNumber() {
        return this.number;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.insight.relatedwords.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bidword_list", this.bidwordList);
        txtParams.put("number", this.number);
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

    public Class<SimbaInsightRelatedwordsGetResponse> getResponseClass() {
        return SimbaInsightRelatedwordsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bidwordList, "bidwordList");
        RequestCheckUtils.checkMaxListSize(bidwordList, 10, "bidwordList");
        RequestCheckUtils.checkNotEmpty(number, "number");
        RequestCheckUtils.checkMaxValue(number, 10L, "number");
        RequestCheckUtils.checkMinValue(number, 1L, "number");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
