package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGrademktMemberDetailCreateResponse;

/**
 * TOP API: taobao.crm.grademkt.member.detail.create request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:26
 */
public class CrmGrademktMemberDetailCreateRequest
        implements TaobaoRequest<CrmGrademktMemberDetailCreateResponse> {

    /**
     * 扩展字段
     */
    private String feather;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 创建营销详情，生成方法见http://open.taobao.com/doc/detail.htm?id=101281
     */
    private String parameter;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(feather, "feather");
        RequestCheckUtils.checkNotEmpty(parameter, "parameter");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.crm.grademkt.member.detail.create";
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
    public Class<CrmGrademktMemberDetailCreateResponse> getResponseClass() {
        return CrmGrademktMemberDetailCreateResponse.class;
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
