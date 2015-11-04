package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangEserviceEvaluationGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.evaluation.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class WangwangEserviceEvaluationGetRequest implements
        TaobaoRequest<WangwangEserviceEvaluationGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 查询结束日期
     */
    private Date endDate;

    /**
     * 客服人员id：cntaobao+淘宝nick，例如cntaobaotest<br />
     * 支持最大长度为：1900<br />
     * 支持的最大列表长度为：1900
     */
    private String serviceStaffId;

    /**
     * 查询开始日期
     */
    private Date startDate;

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setServiceStaffId(String serviceStaffId) {
        this.serviceStaffId = serviceStaffId;
    }

    public String getServiceStaffId() {
        return this.serviceStaffId;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wangwang.eservice.evaluation.get";
    }

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

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<WangwangEserviceEvaluationGetResponse> getResponseClass() {
        return WangwangEserviceEvaluationGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endDate, "endDate");
        RequestCheckUtils.checkNotEmpty(serviceStaffId, "serviceStaffId");
        RequestCheckUtils.checkMaxLength(serviceStaffId, 1900, "serviceStaffId");
        RequestCheckUtils.checkNotEmpty(startDate, "startDate");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
