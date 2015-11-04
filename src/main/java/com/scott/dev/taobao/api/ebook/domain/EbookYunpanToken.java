package com.scott.dev.taobao.api.ebook.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 云盘token信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class EbookYunpanToken extends TaobaoObject {

    private static final long serialVersionUID = 6629297746969493127L;

    /**
     * 云盘访问的token信息
     */
    @ApiField("access_token")
    private String accessToken;

    /**
     * access_token的失效时间
     */
    @ApiField("expires_in")
    private Long expiresIn;

    /**
     * 刷新云盘access_token信息
     */
    @ApiField("refresh_token")
    private String refreshToken;

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Long getExpiresIn() {
        return this.expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

}
