package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserFullinfoGetResponse;

/**
 * TOP API: taobao.subuser.fullinfo.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class SubuserFullinfoGetRequest implements TaobaoRequest<SubuserFullinfoGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 传入所需要的参数信息（若不需要获取子账号或主账号的企业邮箱地址，则无需传入该参数；若需要获取子账号或主账号的企业邮箱地址，
     * 则需要传入fields
     * ；可选参数值为subuser_email和user_email，传入其他参数值均无效；两个参数都需要则以逗号隔开传入即可
     * ，例如：subuser_email,user_email）
     */
    private String fields;

    /**
     * 子账号ID（传参中sub_id和sub_nick至少需要其中一个，若sub_id与sub_nick同时传入并且合法，
     * 那么sub_nick优先，以sub_nick查询子账号）
     */
    private Long subId;

    /**
     * 子账号用户名（传参中sub_id和sub_nick至少需要其中一个，若sub_id与sub_nick同时传入并且合法，
     * 那么sub_nick优先，以sub_nick查询子账号）
     */
    private String subNick;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public Long getSubId() {
        return this.subId;
    }

    public void setSubNick(String subNick) {
        this.subNick = subNick;
    }

    public String getSubNick() {
        return this.subNick;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.subuser.fullinfo.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("sub_id", this.subId);
        txtParams.put("sub_nick", this.subNick);
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

    public Class<SubuserFullinfoGetResponse> getResponseClass() {
        return SubuserFullinfoGetResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
