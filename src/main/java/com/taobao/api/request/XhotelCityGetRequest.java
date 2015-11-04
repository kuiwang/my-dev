package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.XhotelCityGetResponse;

/**
 * TOP API: taobao.xhotel.city.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:51
 */
public class XhotelCityGetRequest implements TaobaoRequest<XhotelCityGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 分页读取的城市个数，最小值为1，最大值为200
     */
    private Long count;

    /**
     * 分页读取的开始下标,从0开始
     */
    private Long start;

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return this.count;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getStart() {
        return this.start;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.xhotel.city.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("count", this.count);
        txtParams.put("start", this.start);
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

    public Class<XhotelCityGetResponse> getResponseClass() {
        return XhotelCityGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(count, "count");
        RequestCheckUtils.checkNotEmpty(start, "start");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
