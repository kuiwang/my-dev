package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaAdgroupAdgroupcatmatchsGetResponse;

/**
 * TOP API: taobao.simba.adgroup.adgroupcatmatchs.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:15
 */
public class SimbaAdgroupAdgroupcatmatchsGetRequest implements
        TaobaoRequest<SimbaAdgroupAdgroupcatmatchsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 推广组Id列表
     */
    private String adgroupIds;

    /**
     * 主人昵称
     */
    private String nick;

    public void setAdgroupIds(String adgroupIds) {
        this.adgroupIds = adgroupIds;
    }

    public String getAdgroupIds() {
        return this.adgroupIds;
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
        return "taobao.simba.adgroup.adgroupcatmatchs.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adgroup_ids", this.adgroupIds);
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

    public Class<SimbaAdgroupAdgroupcatmatchsGetResponse> getResponseClass() {
        return SimbaAdgroupAdgroupcatmatchsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(adgroupIds, "adgroupIds");
        RequestCheckUtils.checkMaxListSize(adgroupIds, 200, "adgroupIds");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
