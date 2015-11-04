package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SellercenterSubuserPermissionsRolesGetResponse;

/**
 * TOP API: taobao.sellercenter.subuser.permissions.roles.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class SellercenterSubuserPermissionsRolesGetRequest implements
        TaobaoRequest<SellercenterSubuserPermissionsRolesGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 子账号昵称(子账号标识)<br />
     * 支持最大长度为：100<br />
     * 支持的最大列表长度为：100
     */
    private String nick;

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.sellercenter.subuser.permissions.roles.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
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

    public Class<SellercenterSubuserPermissionsRolesGetResponse> getResponseClass() {
        return SellercenterSubuserPermissionsRolesGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(nick, "nick");
        RequestCheckUtils.checkMaxLength(nick, 100, "nick");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}