package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaInsightCatsbaseGetResponse;

/**
 * TOP API: taobao.simba.insight.catsbase.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:18
 */
public class SimbaInsightCatsbaseGetRequest implements
        TaobaoRequest<SimbaInsightCatsbaseGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 查询类目id数组，最大长度200
     */
    private String categoryIds;

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
     * 时间格式(DAY: 最近一天； WEEK：最近一周。MONTH：最近一个月。3MONTH：最近三个月)
     */
    private String time;

    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getCategoryIds() {
        return this.categoryIds;
    }

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

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return this.time;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.insight.catsbase.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("category_ids", this.categoryIds);
        txtParams.put("filter", this.filter);
        txtParams.put("nick", this.nick);
        txtParams.put("time", this.time);
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

    public Class<SimbaInsightCatsbaseGetResponse> getResponseClass() {
        return SimbaInsightCatsbaseGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(categoryIds, "categoryIds");
        RequestCheckUtils.checkMaxListSize(categoryIds, 200, "categoryIds");
        RequestCheckUtils.checkNotEmpty(filter, "filter");
        RequestCheckUtils.checkNotEmpty(time, "time");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
