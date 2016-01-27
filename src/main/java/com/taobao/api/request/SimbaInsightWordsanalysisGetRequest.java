package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightWordsanalysisGetResponse;

/**
 * TOP API: taobao.simba.insight.wordsanalysis.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:19
 */
public class SimbaInsightWordsanalysisGetRequest implements
        TaobaoRequest<SimbaInsightWordsanalysisGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 结果过滤。 AREA： 返回地域占比； SOURCE：返回来源占比； HPRICE：返回竞价分布。
     * stu只能是AREA、SOURCE或HPRICE中的一个
     */
    private String stu;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 查询词组，最大长度200
     */
    private String words;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(stu, "stu");
        RequestCheckUtils.checkNotEmpty(words, "words");
        RequestCheckUtils.checkMaxListSize(words, 200, "words");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.insight.wordsanalysis.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<SimbaInsightWordsanalysisGetResponse> getResponseClass() {
        return SimbaInsightWordsanalysisGetResponse.class;
    }

    public String getStu() {
        return this.stu;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
        txtParams.put("stu", this.stu);
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

    public void setStu(String stu) {
        this.stu = stu;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setWords(String words) {
        this.words = words;
    }
}
