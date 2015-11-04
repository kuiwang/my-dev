package com.scott.dev.taobao.api.wangwang.domain;

/**
 * 聊天对象ID列表
 */
public class Chatpeer {

    /**
     * 聊天日期
     */
    private String date;

    /**
     * 聊天对象用户ID：cntaobao+淘宝nick，例如cntaobaotest
     */
    private String uid;

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
