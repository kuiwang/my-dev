package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipaySystemOauthTokenResponse;

/**
 * TOP API: alipay.system.oauth.token request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:31
 */
public class AlipaySystemOauthTokenRequest
        implements TaobaoRequest<AlipaySystemOauthTokenResponse> {

    /**
     * 授权码，用户对应用授权后得到。<br />
     * 支持最大长度为：40<br />
     * 支持的最大列表长度为：40
     */
    private String code;

    /**
     * 获取访问令牌的类型，authorization_code表示用授权码换，refresh_token表示用刷新令牌来换。<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String grantType;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 刷新令牌，上次换取访问令牌是得到。<br />
     * 支持最大长度为：40<br />
     * 支持的最大列表长度为：40
     */
    private String refreshToken;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(code, 40, "code");
        RequestCheckUtils.checkNotEmpty(grantType, "grantType");
        RequestCheckUtils.checkMaxLength(grantType, 20, "grantType");
        RequestCheckUtils.checkMaxLength(refreshToken, 40, "refreshToken");
    }

    @Override
    public String getApiMethodName() {
        return "alipay.system.oauth.token";
    }

    public String getCode() {
        return this.code;
    }

    public String getGrantType() {
        return this.grantType;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    @Override
    public Class<AlipaySystemOauthTokenResponse> getResponseClass() {
        return AlipaySystemOauthTokenResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("code", this.code);
        txtParams.put("grant_type", this.grantType);
        txtParams.put("refresh_token", this.refreshToken);
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

    public void setCode(String code) {
        this.code = code;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
