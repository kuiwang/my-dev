package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TravelItemspropsGetResponse;

/**
 * TOP API: taobao.travel.itemsprops.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class TravelItemspropsGetRequest implements TaobaoRequest<TravelItemspropsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商品所属叶子类目ID，支持旅游度假线路8个类目。
     */
    private Long cid;

    /**
     * 属性id (取某个类目属性时，传pid；若不传该值，返回该类目下所有属性)
     */
    private Long pid;

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getPid() {
        return this.pid;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.travel.itemsprops.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cid", this.cid);
        txtParams.put("pid", this.pid);
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

    public Class<TravelItemspropsGetResponse> getResponseClass() {
        return TravelItemspropsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(cid, "cid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
