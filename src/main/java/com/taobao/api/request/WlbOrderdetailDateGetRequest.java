package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbOrderdetailDateGetResponse;

/**
 * TOP API: taobao.wlb.orderdetail.date.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbOrderdetailDateGetRequest implements TaobaoRequest<WlbOrderdetailDateGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 查询条件截止日期
     */
    private Date endTime;

    /**
     * 分页查询参数，指定查询页数，默认为1
     */
    private Long pageNo;

    /**
     * 分页查询参数，每页查询数量，默认20，最大值50,大于50时按照50条查询
     */
    private Long pageSize;

    /**
     * 查询起始日期
     */
    private Date startTime;

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
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

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.orderdetail.date.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_time", this.endTime);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_time", this.startTime);
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

    public Class<WlbOrderdetailDateGetResponse> getResponseClass() {
        return WlbOrderdetailDateGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
