package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaKeywordsPricevonSetResponse;

/**
 * TOP API: taobao.simba.keywords.pricevon.set request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:20
 */
public class SimbaKeywordsPricevonSetRequest implements
        TaobaoRequest<SimbaKeywordsPricevonSetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 关键词ID，出价和匹配方式json字符串，keywordId:词ID，整数。maxPrice：价格，是整数，以“分”为单位，不能小于5，
     * 不能大于日限额,当使用默认出价时必须将这个值设置为0。;
     * isDefaultPrice：是否使用默认出价，只能是0，1(0代表不使用，1代表使用
     * )。matchscope只能是1,2,4（1代表精确匹配，2代表子串匹配，4代表广泛匹配）
     */
    private String keywordidPrices;

    /**
     * 主人昵称
     */
    private String nick;

    public void setKeywordidPrices(String keywordidPrices) {
        this.keywordidPrices = keywordidPrices;
    }

    public String getKeywordidPrices() {
        return this.keywordidPrices;
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
        return "taobao.simba.keywords.pricevon.set";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("keywordid_prices", this.keywordidPrices);
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

    public Class<SimbaKeywordsPricevonSetResponse> getResponseClass() {
        return SimbaKeywordsPricevonSetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(keywordidPrices, "keywordidPrices");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
