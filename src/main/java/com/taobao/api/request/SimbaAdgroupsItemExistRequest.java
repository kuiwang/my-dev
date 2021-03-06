package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaAdgroupsItemExistResponse;

/**
 * TOP API: taobao.simba.adgroups.item.exist request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:16
 */
public class SimbaAdgroupsItemExistRequest
        implements TaobaoRequest<SimbaAdgroupsItemExistResponse> {

    /**
     * 推广计划Id
     */
    private Long campaignId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品Id
     */
    private Long itemId;

    /**
     * 主人昵称
     */
    private String nick;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.adgroups.item.exist";
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<SimbaAdgroupsItemExistResponse> getResponseClass() {
        return SimbaAdgroupsItemExistResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("campaign_id", this.campaignId);
        txtParams.put("item_id", this.itemId);
        txtParams.put("nick", this.nick);
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

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
