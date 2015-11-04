package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.system.oauth.token response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlipaySystemOauthTokenResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2851124778224993235L;

    /**
     * 访问令牌
     */
    @ApiField("access_token")
    private String accessToken;

    /**
     * 支付宝用户的id。
     */
    @ApiField("alipay_user_id")
    private String alipayUserId;

    /**
     * 访问令牌的有效时间，单位是秒。
     */
    @ApiField("expires_in")
    private String expiresIn;

    /**
     * 刷新令牌的有效时间，单位是秒。
     */
    @ApiField("re_expires_in")
    private String reExpiresIn;

    /**
     * 刷新令牌
     */
    @ApiField("refresh_token")
    private String refreshToken;

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
    }

    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getExpiresIn() {
        return this.expiresIn;
    }

    public void setReExpiresIn(String reExpiresIn) {
        this.reExpiresIn = reExpiresIn;
    }

    public String getReExpiresIn() {
        return this.reExpiresIn;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

}
