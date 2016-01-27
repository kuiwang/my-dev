package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopatsSimbaCampkeywordbaseGetResponse;

/**
 * TOP API: taobao.topats.simba.campkeywordbase.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class TopatsSimbaCampkeywordbaseGetRequest implements
        TaobaoRequest<TopatsSimbaCampkeywordbaseGetResponse> {

    /**
     * 查询推广计划ID
     */
    private Long campaignId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 查询的昵称
     */
    private String nick;

    /**
     * 报表类型。可选值：SEARCH（搜索）、CAT（类目出价）、 NOSEARCH（定向投放），可多选，如：SEARCH,CAT
     */
    private String searchType;

    /**
     * 数据来源。可选值：1（站内）、2（站外）、SUMMARY（汇总），其中SUMMARY必须单选，其它值可多选，如：1,2
     */
    private String source;

    /**
     * 时间参数（昨天：DAY、 前一周：7DAY 、前15天：15DAY 、前30天：30DAY 、前90天：90DAY）单选
     */
    private String timeSlot;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
        RequestCheckUtils.checkNotEmpty(searchType, "searchType");
        RequestCheckUtils.checkNotEmpty(source, "source");
        RequestCheckUtils.checkNotEmpty(timeSlot, "timeSlot");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.topats.simba.campkeywordbase.get";
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<TopatsSimbaCampkeywordbaseGetResponse> getResponseClass() {
        return TopatsSimbaCampkeywordbaseGetResponse.class;
    }

    public String getSearchType() {
        return this.searchType;
    }

    public String getSource() {
        return this.source;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("campaign_id", this.campaignId);
        txtParams.put("nick", this.nick);
        txtParams.put("search_type", this.searchType);
        txtParams.put("source", this.source);
        txtParams.put("time_slot", this.timeSlot);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public String getTimeSlot() {
        return this.timeSlot;
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

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
