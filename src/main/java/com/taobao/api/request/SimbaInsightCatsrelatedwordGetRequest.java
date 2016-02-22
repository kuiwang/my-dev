package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightCatsrelatedwordGetResponse;

/**
 * TOP API: taobao.simba.insight.catsrelatedword.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:18
 */
public class SimbaInsightCatsrelatedwordGetRequest
        implements TaobaoRequest<SimbaInsightCatsrelatedwordGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 最大返回数量(1-10)<br />
     * 支持最大值为：10<br />
     * 支持最小值为：1
     */
    private Long resultNum;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 查询词数组，最大长度200
     */
    private String words;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(resultNum, "resultNum");
        RequestCheckUtils.checkMaxValue(resultNum, 10L, "resultNum");
        RequestCheckUtils.checkMinValue(resultNum, 1L, "resultNum");
        RequestCheckUtils.checkNotEmpty(words, "words");
        RequestCheckUtils.checkMaxListSize(words, 200, "words");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.insight.catsrelatedword.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<SimbaInsightCatsrelatedwordGetResponse> getResponseClass() {
        return SimbaInsightCatsrelatedwordGetResponse.class;
    }

    public Long getResultNum() {
        return this.resultNum;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
        txtParams.put("result_num", this.resultNum);
        txtParams.put("words", this.words);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getWords() {
        return this.words;
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

    public void setResultNum(Long resultNum) {
        this.resultNum = resultNum;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setWords(String words) {
        this.words = words;
    }
}
