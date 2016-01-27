package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SellercenterRoleAddResponse;

/**
 * TOP API: taobao.sellercenter.role.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class SellercenterRoleAddRequest implements TaobaoRequest<SellercenterRoleAddResponse> {

    /**
     * 角色描述<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String description;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 角色名<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String name;

    /**
     * 表示卖家昵称<br />
     * 支持最大长度为：500<br />
     * 支持的最大列表长度为：500
     */
    private String nick;

    /**
     * 需要授权的权限点permission_code列表,以","分割.其code值可以通过调用taobao.sellercenter.
     * user
     * .permissions.get返回，其中permission.is_authorize=1的权限点可以通过本接口授权给对应角色。
     */
    private String permissionCodes;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(description, 20, "description");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkMaxLength(name, 20, "name");
        RequestCheckUtils.checkNotEmpty(nick, "nick");
        RequestCheckUtils.checkMaxLength(nick, 500, "nick");
        RequestCheckUtils.checkMaxListSize(permissionCodes, 2000, "permissionCodes");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.sellercenter.role.add";
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getName() {
        return this.name;
    }

    public String getNick() {
        return this.nick;
    }

    public String getPermissionCodes() {
        return this.permissionCodes;
    }

    @Override
    public Class<SellercenterRoleAddResponse> getResponseClass() {
        return SellercenterRoleAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("description", this.description);
        txtParams.put("name", this.name);
        txtParams.put("nick", this.nick);
        txtParams.put("permission_codes", this.permissionCodes);
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPermissionCodes(String permissionCodes) {
        this.permissionCodes = permissionCodes;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
