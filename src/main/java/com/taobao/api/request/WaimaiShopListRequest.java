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

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(page, "page");
        RequestCheckUtils.checkMinValue(page, 1L, "page");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkMaxValue(pageSize, 20L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.waimai.shop.list";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public Long getPage() {
        return this.page;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<WaimaiShopListResponse> getResponseClass() {
        return WaimaiShopListResponse.class;
    }

    public Long getStatus() {
        return this.status;
    }

    @Override
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

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
