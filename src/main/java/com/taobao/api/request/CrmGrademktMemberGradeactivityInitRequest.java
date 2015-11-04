package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGrademktMemberGradeactivityInitResponse;

/**
 * TOP API: taobao.crm.grademkt.member.gradeactivity.init request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class CrmGrademktMemberGradeactivityInitRequest implements
        TaobaoRequest<CrmGrademktMemberGradeactivityInitResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 扩展字段
     */
    private String feather;

    /**
     * 活动名称，不传默认为“等级营销”
     */
    private String parameter;

    public void setFeather(String feather) {
        this.feather = feather;
    }

    public String getFeather() {
        return this.feather;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return this.parameter;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.crm.grademkt.member.gradeactivity.init";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("feather", this.feather);
        txtParams.put("parameter", this.parameter);
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

    public Class<CrmGrademktMemberGradeactivityInitResponse> getResponseClass() {
        return CrmGrademktMemberGradeactivityInitResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(feather, "feather");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
