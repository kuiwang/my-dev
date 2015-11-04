package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CrmMembergradeSetResponse;

/**
 * TOP API: taobao.crm.membergrade.set request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class CrmMembergradeSetRequest implements TaobaoRequest<CrmMembergradeSetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 买家昵称
     */
    private String buyerNick;

    /**
     * 买家会员级别有四种1：普通会员。2：高级会员。 3VIP会员。 4：至尊VIP<br />
     * 支持最大值为：4<br />
     * 支持最小值为：1
     */
    private Long grade;

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public Long getGrade() {
        return this.grade;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.crm.membergrade.set";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("grade", this.grade);
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

    public Class<CrmMembergradeSetResponse> getResponseClass() {
        return CrmMembergradeSetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(buyerNick, "buyerNick");
        RequestCheckUtils.checkNotEmpty(grade, "grade");
        RequestCheckUtils.checkMaxValue(grade, 4L, "grade");
        RequestCheckUtils.checkMinValue(grade, 1L, "grade");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
