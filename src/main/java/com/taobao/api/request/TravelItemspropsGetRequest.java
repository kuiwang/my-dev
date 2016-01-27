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

    /**
     * 商品所属叶子类目ID，支持旅游度假线路8个类目。
     */
    private Long cid;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 属性id (取某个类目属性时，传pid；若不传该值，返回该类目下所有属性)
     */
    private Long pid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(cid, "cid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.travel.itemsprops.get";
    }

    public Long getCid() {
        return this.cid;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPid() {
        return this.pid;
    }

    @Override
    public Class<TravelItemspropsGetResponse> getResponseClass() {
        return TravelItemspropsGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cid", this.cid);
        txtParams.put("pid", this.pid);
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

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
