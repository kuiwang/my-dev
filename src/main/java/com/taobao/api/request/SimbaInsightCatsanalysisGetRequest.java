package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightCatsanalysisGetResponse;

/**
 * TOP API: taobao.simba.insight.catsanalysis.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:18
 */
public class SimbaInsightCatsanalysisGetRequest implements
        TaobaoRequest<SimbaInsightCatsanalysisGetResponse> {

    /**
     * 查询类目id数组，最大长度200
     */
    private String categoryIds;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 结果过滤。 AREA：返回地域占比； SOURCE：返回来源占比； HPRICE：返回竞价分布。
     * stu只能是AREA、SOURCE或HPRICE中的一个
     */
    private String stu;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(categoryIds, "categoryIds");
        RequestCheckUtils.checkMaxListSize(categoryIds, 200, "categoryIds");
        RequestCheckUtils.checkNotEmpty(stu, "stu");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.insight.catsanalysis.get";
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
    public Class<SimbaInsightCatsanalysisGetResponse> getResponseClass() {
        return SimbaInsightCatsanalysisGetResponse.class;
    }

    public String getStu() {
        return this.stu;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_ids", this.categoryIds);
        txtParams.put("nick", this.nick);
        txtParams.put("stu", this.stu);
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

    public void setStu(String stu) {
        this.stu = stu;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
