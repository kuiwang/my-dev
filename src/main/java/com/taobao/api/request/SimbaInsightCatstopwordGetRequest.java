package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightCatstopwordGetResponse;

/**
 * TOP API: taobao.simba.insight.catstopword.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:18
 */
public class SimbaInsightCatstopwordGetRequest
        implements TaobaoRequest<SimbaInsightCatstopwordGetResponse> {

    /**
     * 类目id数组，最大长度200
     */
    private String categoryIds;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 最大返回数量(1-100)<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1
     */
    private Long resultNum;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(categoryIds, "categoryIds");
        RequestCheckUtils.checkMaxListSize(categoryIds, 200, "categoryIds");
        RequestCheckUtils.checkNotEmpty(resultNum, "resultNum");
        RequestCheckUtils.checkMaxValue(resultNum, 100L, "resultNum");
        RequestCheckUtils.checkMinValue(resultNum, 1L, "resultNum");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.insight.catstopword.get";
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<SimbaInsightCatstopwordGetResponse> getResponseClass() {
        return SimbaInsightCatstopwordGetResponse.class;
    }

    public Long getResultNum() {
        return this.resultNum;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_ids", this.categoryIds);
        txtParams.put("nick", this.nick);
        txtParams.put("result_num", this.resultNum);
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

    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
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
}
