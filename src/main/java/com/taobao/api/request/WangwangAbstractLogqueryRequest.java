package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangAbstractLogqueryResponse;

/**
 * TOP API: taobao.wangwang.abstract.logquery request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class WangwangAbstractLogqueryRequest implements
        TaobaoRequest<WangwangAbstractLogqueryResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 传入参数的字符集
     */
    private String charset;

    /**
     * 获取记录条数，默认值是1000<br />
     * 支持最小值为：1
     */
    private Long count;

    /**
     * 东八区时间
     */
    private String endDate;

    /**
     * 卖家id，有cntaobao前缀
     */
    private String fromId;

    /**
     * 设置了这个值，那么聊天记录就从这个点开始查询
     */
    private String nextKey;

    /**
     * 东八区时间
     */
    private String startDate;

    /**
     * 买家id，有cntaobao前缀
     */
    private String toId;

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getCharset() {
        return this.charset;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return this.count;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getFromId() {
        return this.fromId;
    }

    public void setNextKey(String nextKey) {
        this.nextKey = nextKey;
    }

    public String getNextKey() {
        return this.nextKey;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public String getToId() {
        return this.toId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wangwang.abstract.logquery";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("charset", this.charset);
        txtParams.put("count", this.count);
        txtParams.put("end_date", this.endDate);
        txtParams.put("from_id", this.fromId);
        txtParams.put("next_key", this.nextKey);
        txtParams.put("start_date", this.startDate);
        txtParams.put("to_id", this.toId);
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

    public Class<WangwangAbstractLogqueryResponse> getResponseClass() {
        return WangwangAbstractLogqueryResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMinValue(count, 1L, "count");
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(fromId, "fromId");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
        RequestCheckUtils.checkNotEmpty(toId, "toId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
