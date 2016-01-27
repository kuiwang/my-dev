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

    /**
     * 分页读取的城市个数，最小值为1，最大值为200
     */
    private Long count;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 分页读取的开始下标,从0开始
     */
    private Long start;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(count, "count");
        RequestCheckUtils.checkNotEmpty(start, "start");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.xhotel.city.get";
    }

    public Long getCount() {
        return this.count;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<XhotelCityGetResponse> getResponseClass() {
        return XhotelCityGetResponse.class;
    }

    public Long getStart() {
        return this.start;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("count", this.count);
        txtParams.put("start", this.start);
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

    public void setCount(Long count) {
        this.count = count;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
