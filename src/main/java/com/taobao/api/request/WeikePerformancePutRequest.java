package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WeikePerformancePutResponse;

/**
 * TOP API: taobao.weike.performance.put request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class WeikePerformancePutRequest implements TaobaoRequest<WeikePerformancePutResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 订单id
     */
    private Long id;

    /**
     * 绩效数据封装类
     */
    private String perInfoWrapper;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setPerInfoWrapper(String perInfoWrapper) {
        this.perInfoWrapper = perInfoWrapper;
    }

    public String getPerInfoWrapper() {
        return this.perInfoWrapper;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.weike.performance.put";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("id", this.id);
        txtParams.put("per_info_wrapper", this.perInfoWrapper);
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

    public Class<WeikePerformancePutResponse> getResponseClass() {
        return WeikePerformancePutResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
