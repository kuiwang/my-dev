package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserDutyAddResponse;

/**
 * TOP API: taobao.subuser.duty.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class SubuserDutyAddRequest implements TaobaoRequest<SubuserDutyAddResponse> {

    /**
     * 职务级别
     */
    private Long dutyLevel;

    /**
     * 职务名称
     */
    private String dutyName;

    private Map<String, String> headerMap = new TaobaoHashMap();

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 主账号用户名
     */
    private String userNick;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dutyLevel, "dutyLevel");
        RequestCheckUtils.checkNotEmpty(dutyName, "dutyName");
        RequestCheckUtils.checkNotEmpty(userNick, "userNick");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.subuser.duty.add";
    }

    public Long getDutyLevel() {
        return this.dutyLevel;
    }

    public String getDutyName() {
        return this.dutyName;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<SubuserDutyAddResponse> getResponseClass() {
        return SubuserDutyAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("duty_level", this.dutyLevel);
        txtParams.put("duty_name", this.dutyName);
        txtParams.put("user_nick", this.userNick);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getUserNick() {
        return this.userNick;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setDutyLevel(Long dutyLevel) {
        this.dutyLevel = dutyLevel;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }
}
