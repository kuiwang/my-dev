package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WaimaiShopListResponse;

/**
 * TOP API: taobao.waimai.shop.list request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class WaimaiShopListRequest implements TaobaoRequest<WaimaiShopListResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 查询关键字
     */
    private String keywords;

    /**
     * 页码<br />
     * 支持最小值为：1
     */
    private Long page;

    /**
     * 每页条数<br />
     * 支持最大值为：20<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 店铺状态，歇业：0，营业：1，所有：-1
     */
    private Long status;

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPage() {
        return this.page;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.waimai.shop.list";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("keywords", this.keywords);
        txtParams.put("page", this.page);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("status", this.status);
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

    public Class<WaimaiShopListResponse> getResponseClass() {
        return WaimaiShopListResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(page, "page");
        RequestCheckUtils.checkMinValue(page, 1L, "page");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkMaxValue(pageSize, 20L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
