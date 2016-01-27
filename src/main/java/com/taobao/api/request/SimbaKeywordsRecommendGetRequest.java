package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaKeywordsRecommendGetResponse;

/**
 * TOP API: taobao.simba.keywords.recommend.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:20
 */
public class SimbaKeywordsRecommendGetRequest implements
        TaobaoRequest<SimbaKeywordsRecommendGetResponse> {

    /**
     * 推广组ID
     */
    private Long adgroupId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 排序方式: 搜索量 search_volume 市场平均价格 average_price 相关度 relevance 不排序 non
     * 默认为 non
     */
    private String orderBy;

    /**
     * 返回的第几页数据，默认为1<br />
     * 支持最小值为：1
     */
    private Long pageNo;

    /**
     * 返回的每页数据量大小,最大200<br />
     * 支持最大值为：200<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 相关度
     */
    private String pertinence;

    /**
     * 搜索量,设置此值后返回的就是大于此搜索量的词列表
     */
    private Long search;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(adgroupId, "adgroupId");
        RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
        RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkMaxValue(pageSize, 200L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.keywords.recommend.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getPertinence() {
        return this.pertinence;
    }

    @Override
    public Class<SimbaKeywordsRecommendGetResponse> getResponseClass() {
        return SimbaKeywordsRecommendGetResponse.class;
    }

    public Long getSearch() {
        return this.search;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adgroup_id", this.adgroupId);
        txtParams.put("nick", this.nick);
        txtParams.put("order_by", this.orderBy);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("pertinence", this.pertinence);
        txtParams.put("search", this.search);
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

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setPertinence(String pertinence) {
        this.pertinence = pertinence;
    }

    public void setSearch(Long search) {
        this.search = search;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
