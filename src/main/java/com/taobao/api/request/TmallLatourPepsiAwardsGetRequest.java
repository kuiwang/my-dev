package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallLatourPepsiAwardsGetResponse;

/**
 * TOP API: tmall.latour.pepsi.awards.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:51
 */
public class TmallLatourPepsiAwardsGetRequest implements
        TaobaoRequest<TmallLatourPepsiAwardsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 活动ID 由互动平台生成
     */
    private String lotteryId;

    /**
     * 用户昵称
     */
    private String nick;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(lotteryId, "lotteryId");
        RequestCheckUtils.checkNotEmpty(nick, "nick");
    }

    @Override
    public String getApiMethodName() {
        return "tmall.latour.pepsi.awards.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getLotteryId() {
        return this.lotteryId;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<TmallLatourPepsiAwardsGetResponse> getResponseClass() {
        return TmallLatourPepsiAwardsGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("lottery_id", this.lotteryId);
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

    public void setLotteryId(String lotteryId) {
        this.lotteryId = lotteryId;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
