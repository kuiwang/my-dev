package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallTemaiItemsSearchResponse;

/**
 * TOP API: tmall.temai.items.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:31
 */
public class TmallTemaiItemsSearchRequest implements TaobaoRequest<TmallTemaiItemsSearchResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 特卖前台类目id，传入的必须是特卖类目50100982或其下的二级类目。
     */
    private Long cat;

    /**
     * 排序类型。类型包括： s: 人气排序 p: 价格从低到高; pd: 价格从高到低; d: 月销量从高到低; pt: 按发布时间排序.
     */
    private String sort;

    /**
     * 表示查询起始位置: start=0:返回第1条记录到第48条记录（即第一页）；
     * start=48:返回第48条记录到第96条记录（即第二页）； start=96，start=144，start=192......
     * 依此类推，每次加start值加48(每页返回记录数固定为48条)
     */
    private Long start;

    public void setCat(Long cat) {
        this.cat = cat;
    }

    public Long getCat() {
        return this.cat;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSort() {
        return this.sort;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getStart() {
        return this.start;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "tmall.temai.items.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cat", this.cat);
        txtParams.put("sort", this.sort);
        txtParams.put("start", this.start);
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

    public Class<TmallTemaiItemsSearchResponse> getResponseClass() {
        return TmallTemaiItemsSearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(cat, "cat");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
