package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CaipiaoPresentItemsGetResponse;

/**
 * TOP API: taobao.caipiao.present.items.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:33
 */
public class CaipiaoPresentItemsGetRequest implements TaobaoRequest<CaipiaoPresentItemsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 赠送订单的截止时间，格式为yyyyMMdd,
     * 距当前最长时间间隔是3个月，最近可以取当天的时间。不可为空。要求endDate-startDate必须<=3个月，
     */
    private String endDate;

    /**
     * 当前页码， 不可为空、0和负数。
     */
    private Long pageNo;

    /**
     * 每页的大小，不可为空、0和负数。最大为500，如果超过500，则取默认的500.
     */
    private Long pageSize;

    /**
     * 赠送订单的开始时间， 格式为yyyyMMdd, 距当前最长时间间隔是3个月， 最近可以取当天的时间. 不可为空。
     */
    private String startDate;

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return this.endDate;
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

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.caipiao.present.items.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_date", this.endDate);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_date", this.startDate);
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

    public Class<CaipiaoPresentItemsGetResponse> getResponseClass() {
        return CaipiaoPresentItemsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
