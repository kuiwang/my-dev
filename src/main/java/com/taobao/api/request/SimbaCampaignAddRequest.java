package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaCampaignAddResponse;

/**
 * TOP API: taobao.simba.campaign.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:16
 */
public class SimbaCampaignAddRequest implements TaobaoRequest<SimbaCampaignAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 推广计划名称，不能多余20个汉字，不能和客户其他推广计划同名。<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String title;

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.campaign.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
        txtParams.put("title", this.title);
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

    public Class<SimbaCampaignAddResponse> getResponseClass() {
        return SimbaCampaignAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkMaxLength(title, 20, "title");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
