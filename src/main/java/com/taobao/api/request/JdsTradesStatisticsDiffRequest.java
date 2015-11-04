package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JdsTradesStatisticsDiffResponse;

/**
 * TOP API: taobao.jds.trades.statistics.diff request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class JdsTradesStatisticsDiffRequest implements
        TaobaoRequest<JdsTradesStatisticsDiffResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 查询的日期，格式如YYYYMMDD的日期对应的数字
     */
    private String date;

    /**
     * 页数
     */
    private Long pageNo;

    /**
     * 需要比较的状态
     */
    private String postStatus;

    /**
     * 需要比较的状态，将会和post_status做比较
     */
    private String preStatus;

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    public String getPostStatus() {
        return this.postStatus;
    }

    public void setPreStatus(String preStatus) {
        this.preStatus = preStatus;
    }

    public String getPreStatus() {
        return this.preStatus;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.jds.trades.statistics.diff";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("date", this.date);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("post_status", this.postStatus);
        txtParams.put("pre_status", this.preStatus);
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

    public Class<JdsTradesStatisticsDiffResponse> getResponseClass() {
        return JdsTradesStatisticsDiffResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(date, "date");
        RequestCheckUtils.checkNotEmpty(postStatus, "postStatus");
        RequestCheckUtils.checkNotEmpty(preStatus, "preStatus");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
