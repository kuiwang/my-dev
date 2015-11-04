package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaKeywordsvonAddResponse;

/**
 * TOP API: taobao.simba.keywordsvon.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:20
 */
public class SimbaKeywordsvonAddRequest implements TaobaoRequest<SimbaKeywordsvonAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 推广组id
     */
    private Long adgroupId;

    /**
     * 关键词，出价和匹配方式json字符串，word:词，不能有一些特殊字符。maxPrice：价格，是整数，以“分”为单位，不能小于5，
     * 不能大于日限额,当使用默认出价时必须将这个值设置为0。;
     * isDefaultPrice：是否使用默认出价，只能是0，1(0代表不使用，1代表使用
     * )。matchscope只能是1,2,4（1代表精确匹配，2代表子串匹配，4代表广泛匹配）。
     */
    private String keywordPrices;

    /**
     * 主人昵称
     */
    private String nick;

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    public void setKeywordPrices(String keywordPrices) {
        this.keywordPrices = keywordPrices;
    }

    public String getKeywordPrices() {
        return this.keywordPrices;
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
        return "taobao.simba.keywordsvon.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adgroup_id", this.adgroupId);
        txtParams.put("keyword_prices", this.keywordPrices);
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

    public Class<SimbaKeywordsvonAddResponse> getResponseClass() {
        return SimbaKeywordsvonAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(adgroupId, "adgroupId");
        RequestCheckUtils.checkNotEmpty(keywordPrices, "keywordPrices");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
