package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightCatsinfoGetResponse;

/**
 * TOP API: taobao.simba.insight.catsinfo.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:18
 */
public class SimbaInsightCatsinfoGetRequest implements
        TaobaoRequest<SimbaInsightCatsinfoGetResponse> {

    /**
     * 需要查询的类目id
     */
    private String categoryIdList;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    /**
     * 表示请求的类型：0表示请求所有顶级类目的信息，这时可以忽略第二个参数，1表示获取给定的类目id的详细信息，2
     * 表示获取给定类目id的所有子类目的详细信息
     */
    private Long type;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(categoryIdList, 20, "categoryIdList");
        RequestCheckUtils.checkNotEmpty(type, "type");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.insight.catsinfo.get";
    }

    public String getCategoryIdList() {
        return this.categoryIdList;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<SimbaInsightCatsinfoGetResponse> getResponseClass() {
        return SimbaInsightCatsinfoGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_id_list", this.categoryIdList);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getType() {
        return this.type;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setCategoryIdList(String categoryIdList) {
        this.categoryIdList = categoryIdList;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(Long type) {
        this.type = type;
    }
}
