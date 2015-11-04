package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallPromotagTaguserRemoveResponse;

/**
 * TOP API: tmall.promotag.taguser.remove request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class TmallPromotagTaguserRemoveRequest implements
        TaobaoRequest<TmallPromotagTaguserRemoveResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 买家昵称
     */
    private String nick;

    /**
     * 标签ID
     */
    private Long tagId;

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getTagId() {
        return this.tagId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "tmall.promotag.taguser.remove";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
        txtParams.put("tag_id", this.tagId);
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

    public Class<TmallPromotagTaguserRemoveResponse> getResponseClass() {
        return TmallPromotagTaguserRemoveResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(nick, "nick");
        RequestCheckUtils.checkNotEmpty(tagId, "tagId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
