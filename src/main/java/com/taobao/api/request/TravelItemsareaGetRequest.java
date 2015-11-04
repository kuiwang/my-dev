package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TravelItemsareaGetResponse;

/**
 * TOP API: taobao.travel.itemsarea.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class TravelItemsareaGetRequest implements TaobaoRequest<TravelItemsareaGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商品所属叶子类目ID，支持旅游度假线路8个类目。
     */
    private Long cid;

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return this.cid;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.travel.itemsarea.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cid", this.cid);
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

    public Class<TravelItemsareaGetResponse> getResponseClass() {
        return TravelItemsareaGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(cid, "cid");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
