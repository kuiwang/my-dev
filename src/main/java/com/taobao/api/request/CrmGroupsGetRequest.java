package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGroupsGetResponse;

/**
 * TOP API: taobao.crm.groups.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class CrmGroupsGetRequest implements TaobaoRequest<CrmGroupsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 显示第几页的分组，如果输入的页码大于总共的页码数，例如总共10页，但是current_page的值为11，则返回空白页，最小页码为1<br />
     * 支持最大值为：1000000<br />
     * 支持最小值为：1<br />
     * 支持的最大列表长度为：3
     */
    private Long currentPage;

    /**
     * 每页显示的记录数，其最大值不能超过100条，最小值为1，默认20条<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1<br />
     * 支持的最大列表长度为：3
     */
    private Long pageSize;

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.crm.groups.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("current_page", this.currentPage);
        txtParams.put("page_size", this.pageSize);
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

    public Class<CrmGroupsGetResponse> getResponseClass() {
        return CrmGroupsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(currentPage, "currentPage");
        RequestCheckUtils.checkMaxValue(currentPage, 1000000L, "currentPage");
        RequestCheckUtils.checkMinValue(currentPage, 1L, "currentPage");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
