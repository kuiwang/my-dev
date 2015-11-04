package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightWordscatsGetResponse;

/**
 * TOP API: taobao.simba.insight.wordscats.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:19
 */
public class SimbaInsightWordscatsGetRequest implements
        TaobaoRequest<SimbaInsightWordscatsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 结果过滤。PV：返回展现量；CLICK：返回点击量；AVGCPC：返回平均出价；COMPETITION ：返回竞争宝贝数;CTR
     * 点击率。filter可由,组合
     */
    private String filter;

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 查询词和类目数组，最大长度200，每一个数组元素都是词+类目，以”^^”分割如下： 词^^类目
     */
    private String wordCategories;

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getFilter() {
        return this.filter;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setWordCategories(String wordCategories) {
        this.wordCategories = wordCategories;
    }

    public String getWordCategories() {
        return this.wordCategories;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.insight.wordscats.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("filter", this.filter);
        txtParams.put("nick", this.nick);
        txtParams.put("word_categories", this.wordCategories);
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

    public Class<SimbaInsightWordscatsGetResponse> getResponseClass() {
        return SimbaInsightWordscatsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(filter, "filter");
        RequestCheckUtils.checkNotEmpty(wordCategories, "wordCategories");
        RequestCheckUtils.checkMaxListSize(wordCategories, 200, "wordCategories");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
