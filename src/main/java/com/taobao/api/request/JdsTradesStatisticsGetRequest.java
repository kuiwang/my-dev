package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JdsTradesStatisticsGetResponse;

/**
 * TOP API: taobao.jds.trades.statistics.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class JdsTradesStatisticsGetRequest implements TaobaoRequest<JdsTradesStatisticsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 查询的日期，格式如YYYYMMDD的日期对应的数字
     */
    private Long date;

    public void setDate(Long date) {
        this.date = date;
    }

    public Long getDate() {
        return this.date;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.jds.trades.statistics.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("date", this.date);
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

    public Class<JdsTradesStatisticsGetResponse> getResponseClass() {
        return JdsTradesStatisticsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(date, "date");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
