package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaAdgroupCatmatchUpdateResponse;

/**
 * TOP API: taobao.simba.adgroup.catmatch.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:15
 */
public class SimbaAdgroupCatmatchUpdateRequest implements
        TaobaoRequest<SimbaAdgroupCatmatchUpdateResponse> {

    /**
     * 推广组Id
     */
    private Long adgroupId;

    /**
     * 类目出价Id
     */
    private Long catmatchId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 类目出价，单位为分，不能小于5。如果use_default_price字段为使用默认出价，则此max_price字段所传入的值不起作用。
     * 商品将会使用默认出价。<br />
     * 支持最小值为：5
     */
    private Long maxPrice;

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 是否启用类目出价； offline-不启用
     * online-启用,如果此字段状态为offline时，则max_price,use_default_price字段值不起作用
     */
    private String onlineStatus;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 是否使用推广组默认出价false为不使用，true为使用
     */
    private Boolean useDefaultPrice;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(adgroupId, "adgroupId");
        RequestCheckUtils.checkNotEmpty(catmatchId, "catmatchId");
        RequestCheckUtils.checkNotEmpty(maxPrice, "maxPrice");
        RequestCheckUtils.checkMinValue(maxPrice, 5L, "maxPrice");
        RequestCheckUtils.checkNotEmpty(onlineStatus, "onlineStatus");
        RequestCheckUtils.checkNotEmpty(useDefaultPrice, "useDefaultPrice");
    }

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.adgroup.catmatch.update";
    }

    public Long getCatmatchId() {
        return this.catmatchId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getMaxPrice() {
        return this.maxPrice;
    }

    public String getNick() {
        return this.nick;
    }

    public String getOnlineStatus() {
        return this.onlineStatus;
    }

    @Override
    public Class<SimbaAdgroupCatmatchUpdateResponse> getResponseClass() {
        return SimbaAdgroupCatmatchUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adgroup_id", this.adgroupId);
        txtParams.put("catmatch_id", this.catmatchId);
        txtParams.put("max_price", this.maxPrice);
        txtParams.put("nick", this.nick);
        txtParams.put("online_status", this.onlineStatus);
        txtParams.put("use_default_price", this.useDefaultPrice);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Boolean getUseDefaultPrice() {
        return this.useDefaultPrice;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public void setCatmatchId(Long catmatchId) {
        this.catmatchId = catmatchId;
    }

    public void setMaxPrice(Long maxPrice) {
        this.maxPrice = maxPrice;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUseDefaultPrice(Boolean useDefaultPrice) {
        this.useDefaultPrice = useDefaultPrice;
    }
}
