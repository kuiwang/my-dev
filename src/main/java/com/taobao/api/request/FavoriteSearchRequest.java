package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FavoriteSearchResponse;

/**
 * TOP API: taobao.favorite.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class FavoriteSearchRequest implements TaobaoRequest<FavoriteSearchResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * ITEM表示宝贝，SHOP表示商铺，collect_type只能为这两者之一<br />
     * 支持最大长度为：4<br />
     * 支持的最大列表长度为：4
     */
    private String collectType;

    /**
     * 页码。取值范围:大于零的整数; 默认值:1。一页20条记录。<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1<br />
     * 支持的最大列表长度为：20
     */
    private Long pageNo;

    public void setCollectType(String collectType) {
        this.collectType = collectType;
    }

    public String getCollectType() {
        return this.collectType;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.favorite.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("collect_type", this.collectType);
        txtParams.put("page_no", this.pageNo);
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

    public Class<FavoriteSearchResponse> getResponseClass() {
        return FavoriteSearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(collectType, "collectType");
        RequestCheckUtils.checkMaxLength(collectType, 4, "collectType");
        RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
        RequestCheckUtils.checkMaxValue(pageNo, 100L, "pageNo");
        RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
