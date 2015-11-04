package com.scott.dev.taobao.api.laiwang.domain;

//来往用户基本信息
public class LaiwangUser {

    //openid
    private String openid;

    //用户昵称
    private String name;

    //用户性别
    private String gender;

    //用户所在城市
    private String city;

    //头像URL（大幅）
    private String avatarBig;

    ///头像URL
    private String avatar;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAvatarBig() {
        return avatarBig;
    }

    public void setAvatarBig(String avatarBig) {
        this.avatarBig = avatarBig;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
