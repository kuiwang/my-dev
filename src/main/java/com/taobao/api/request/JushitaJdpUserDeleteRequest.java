package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JushitaJdpUserDeleteResponse;

/**
 * TOP API: taobao.jushita.jdp.user.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class JushitaJdpUserDeleteRequest implements TaobaoRequest<JushitaJdpUserDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 要删除用户的昵称
     */
    private String nick;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 需要删除的用户编号<br />
     * 支持最小值为：1
     */
    private Long userId;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMinValue(userId, 1L, "userId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.jushita.jdp.user.delete";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<JushitaJdpUserDeleteResponse> getResponseClass() {
        return JushitaJdpUserDeleteResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
        txtParams.put("user_id", this.userId);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getUserId() {
        return this.userId;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
