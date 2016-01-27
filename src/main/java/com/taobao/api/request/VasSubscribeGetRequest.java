package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.VasSubscribeGetResponse;

/**
 * TOP API: taobao.vas.subscribe.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class VasSubscribeGetRequest implements TaobaoRequest<VasSubscribeGetResponse> {

    /**
     * 商品编码，从合作伙伴后台（my.open.taobao.com）-收费管理-收费项目列表 能够获得该应用的商品代码
     */
    private String articleCode;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 淘宝会员名
     */
    private String nick;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(articleCode, "articleCode");
        RequestCheckUtils.checkNotEmpty(nick, "nick");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.vas.subscribe.get";
    }

    public String getArticleCode() {
        return this.articleCode;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<VasSubscribeGetResponse> getResponseClass() {
        return VasSubscribeGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("article_code", this.articleCode);
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

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
