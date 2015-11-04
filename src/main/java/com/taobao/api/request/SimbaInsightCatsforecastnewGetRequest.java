package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightCatsforecastnewGetResponse;

/**
 * TOP API: taobao.simba.insight.catsforecastnew.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:18
 */
public class SimbaInsightCatsforecastnewGetRequest implements
        TaobaoRequest<SimbaInsightCatsforecastnewGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 需要查询的词列表
     */
    private String bidwordList;

    public void setBidwordList(String bidwordList) {
        this.bidwordList = bidwordList;
    }

    public String getBidwordList() {
        return this.bidwordList;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.insight.catsforecastnew.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("bidword_list", this.bidwordList);
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

    public Class<SimbaInsightCatsforecastnewGetResponse> getResponseClass() {
        return SimbaInsightCatsforecastnewGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bidwordList, "bidwordList");
        RequestCheckUtils.checkMaxListSize(bidwordList, 10, "bidwordList");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
