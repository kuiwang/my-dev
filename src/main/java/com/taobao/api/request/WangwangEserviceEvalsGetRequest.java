package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangEserviceEvalsGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.evals.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class WangwangEserviceEvalsGetRequest
        implements TaobaoRequest<WangwangEserviceEvalsGetResponse> {

    /**
     * 结束时间
     */
    private Date endDate;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 想要查询的账号列表
     */
    private String serviceStaffId;

    /**
     * 开始时间
     */
    private Date startDate;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(serviceStaffId, "serviceStaffId");
        RequestCheckUtils.checkMaxListSize(serviceStaffId, 30, "serviceStaffId");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wangwang.eservice.evals.get";
    }

    public Date getEndDate() {
        return this.endDate;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<WangwangEserviceEvalsGetResponse> getResponseClass() {
        return WangwangEserviceEvalsGetResponse.class;
    }

    public String getServiceStaffId() {
        return this.serviceStaffId;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_date", this.endDate);
        txtParams.put("service_staff_id", this.serviceStaffId);
        txtParams.put("start_date", this.startDate);
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

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setServiceStaffId(String serviceStaffId) {
        this.serviceStaffId = serviceStaffId;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
