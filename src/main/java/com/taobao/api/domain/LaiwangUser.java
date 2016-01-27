package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 来往用户基本信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class LaiwangUser extends TaobaoObject {

    private static final long serialVersionUID = 6424749212427846725L;

    /**
     * 头像URL
     */
    @ApiField("avatar")
    private String avatar;

    /**
     * 头像URL（大幅）
     */
    @ApiField("avatar_big")
    private String avatarBig;

    /**
     * 用户所在城市
     */
    @ApiField("city")
    private String city;

    /**
     * 用户性别
     */
    @ApiField("gender")
    private String gender;

    /**
     * 用户昵称
     */
    @ApiField("name")
    private String name;

    /**
     * openid
     */
    @ApiField("openid")
    private String openid;

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatarBig() {
        return this.avatarBig;
    }

    public String getCity() {
        return this.city;
    }

    public String getGender() {
        return this.gender;
    }

    public String getName() {
        return this.name;
    }

    public String getOpenid() {
        return this.openid;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setAvatarBig(String avatarBig) {
        this.avatarBig = avatarBig;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

}
