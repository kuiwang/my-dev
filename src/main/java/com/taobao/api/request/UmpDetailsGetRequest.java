package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpDetailsGetResponse;

/**
 * TOP API: taobao.ump.details.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class UmpDetailsGetRequest implements TaobaoRequest<UmpDetailsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 营销活动id
     */
    private Long actId;

    /**
     * 分页的页码<br />
     * 支持最小值为：0
     */
    private Long pageNo;

    /**
     * 每页的最大条数<br />
     * 支持最大值为：50<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    public void setActId(Long actId) {
        this.actId = actId;
    }

    public Long getActId() {
        return this.actId;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
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
        return "taobao.ump.details.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("act_id", this.actId);
        txtParams.put("page_no", this.pageNo);
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

    public Class<UmpDetailsGetResponse> getResponseClass() {
        return UmpDetailsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(actId, "actId");
        RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
        RequestCheckUtils.checkMinValue(pageNo, 0L, "pageNo");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkMaxValue(pageSize, 50L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
