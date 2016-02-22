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
public class CrmGrademktMemberGradeactivityInitRequest
        implements TaobaoRequest<CrmGrademktMemberGradeactivityInitResponse> {

    /**
     * 扩展字段
     */
    private String feather;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 活动名称，不传默认为“等级营销”
     */
    private String parameter;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(feather, "feather");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.crm.grademkt.member.gradeactivity.init";
    }

    public String getFeather() {
        return this.feather;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getParameter() {
        return this.parameter;
    }

    @Override
    public Class<CrmGrademktMemberGradeactivityInitResponse> getResponseClass() {
        return CrmGrademktMemberGradeactivityInitResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("feather", this.feather);
        txtParams.put("parameter", this.parameter);
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

    public void setFeather(String feather) {
        this.feather = feather;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
