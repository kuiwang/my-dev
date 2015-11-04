package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaAdgroupCatmatchforecastGetResponse;

/**
 * TOP API: taobao.simba.adgroup.catmatchforecast.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:15
 */
public class SimbaAdgroupCatmatchforecastGetRequest implements
        TaobaoRequest<SimbaAdgroupCatmatchforecastGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 推广组ID
     */
    private Long adgroupId;

    /**
     * 类目出价,出价范围在5-9999之间,单位分
     */
    private Long catmatchPrice;

    /**
     * 主人昵称
     */
    private String nick;

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    public void setCatmatchPrice(Long catmatchPrice) {
        this.catmatchPrice = catmatchPrice;
    }

    public Long getCatmatchPrice() {
        return this.catmatchPrice;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.adgroup.catmatchforecast.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adgroup_id", this.adgroupId);
        txtParams.put("catmatch_price", this.catmatchPrice);
        txtParams.put("nick", this.nick);
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

    public Class<SimbaAdgroupCatmatchforecastGetResponse> getResponseClass() {
        return SimbaAdgroupCatmatchforecastGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(adgroupId, "adgroupId");
        RequestCheckUtils.checkNotEmpty(catmatchPrice, "catmatchPrice");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
