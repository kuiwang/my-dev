package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.XhotelIncrementInfoGetResponse;

/**
 * TOP API: taobao.xhotel.increment.info.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class XhotelIncrementInfoGetRequest
        implements TaobaoRequest<XhotelIncrementInfoGetResponse> {

    /**
     * 变化类别，1为酒店价格，0为酒店
     */
    private Long changeType;

    /**
     * 分页参数：当前页数，从1开始计数。 默认值：1
     */
    private Long currentPage;

    /**
     * 更新时间
     */
    private Date gmtModified;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 分页参数：每页酒店数量。最小值1，最大值为1000。默认值：1000
     */
    private Long pageSize;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(changeType, "changeType");
        RequestCheckUtils.checkNotEmpty(gmtModified, "gmtModified");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.xhotel.increment.info.get";
    }

    public Long getChangeType() {
        return this.changeType;
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    public Date getGmtModified() {
        return this.gmtModified;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<XhotelIncrementInfoGetResponse> getResponseClass() {
        return XhotelIncrementInfoGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("change_type", this.changeType);
        txtParams.put("current_page", this.currentPage);
        txtParams.put("gmt_modified", this.gmtModified);
        txtParams.put("page_size", this.pageSize);
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

    public void setChangeType(Long changeType) {
        this.changeType = changeType;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
