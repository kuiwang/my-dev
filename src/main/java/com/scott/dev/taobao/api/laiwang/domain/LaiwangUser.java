package com.scott.dev.taobao.api.laiwang.domain;

//来往用户基本信息
public class LaiwangUser {

    ///头像URL
    private String avatar;

    //头像URL（大幅）
    private String avatarBig;

    //用户所在城市
    private String city;

    //用户性别
    private String gender;

    //用户昵称
    private String name;

    //openid
    private String openid;

    public String getAvatar() {
        return avatar;
    }

    public String getAvatarBig() {
        return avatarBig;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getOpenid() {
        return openid;
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
