package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmGrademktMemberAddResponse;

/**
 * TOP API: taobao.crm.grademkt.member.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:26
 */
public class CrmGrademktMemberAddRequest implements TaobaoRequest<CrmGrademktMemberAddResponse> {

    /**
     * 会员nick
     */
    private String buyerNick;

    /**
     * 系统属性，json格式
     */
    private String feather;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 会员属性-json format
     * 生成方法见http://open.taobao.com/doc/detail.htm?id=101281
     */
    private String parameter;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(buyerNick, "buyerNick");
        RequestCheckUtils.checkNotEmpty(feather, "feather");
        RequestCheckUtils.checkNotEmpty(parameter, "parameter");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.crm.grademkt.member.add";
    }

    public String getBuyerNick() {
        return this.buyerNick;
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
    public Class<CrmGrademktMemberAddResponse> getResponseClass() {
        return CrmGrademktMemberAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
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

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
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
