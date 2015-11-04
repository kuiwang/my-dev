package com.scott.dev.taobao.api.msgcenter.domain;

//消息通道的分组结构
public class TmcGroup {

    //分组名称
    private String name;

    //用户列表
    private String[] users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getUsers() {
        return users;
    }

    public void setUsers(String[] users) {
        this.users = users;
    }

}
