package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallPromotagTaguserJudgeResponse;

/**
 * TOP API: tmall.promotag.taguser.judge request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class TmallPromotagTaguserJudgeRequest
        implements TaobaoRequest<TmallPromotagTaguserJudgeResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 买家昵称
     */
    private String nick;

    /**
     * 标签ID
     */
    private Long tagId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(nick, "nick");
        RequestCheckUtils.checkNotEmpty(tagId, "tagId");
    }

    @Override
    public String getApiMethodName() {
        return "tmall.promotag.taguser.judge";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<TmallPromotagTaguserJudgeResponse> getResponseClass() {
        return TmallPromotagTaguserJudgeResponse.class;
    }

    public Long getTagId() {
        return this.tagId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
        txtParams.put("tag_id", this.tagId);
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

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
