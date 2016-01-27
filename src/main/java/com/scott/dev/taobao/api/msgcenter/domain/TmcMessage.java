package com.scott.dev.taobao.api.msgcenter.domain;

import java.util.Date;

//消息通道的通用消息结构
public class TmcMessage {

    //消息详细内容，格式为JSON/XML
    private String content;

    //消息ID
    private Number id;

    //消息发布者的AppKey
    private String pubAppKey;

    //消息发布时间
    private Date pubTime;

    //消息所属主题
    private String topic;

    //消息所属的用户编号
    private Number userId;

    //用户的昵称
    private String userNick;

    public String getContent() {
        return content;
    }

    public Number getId() {
        return id;
    }

    public String getPubAppKey() {
        return pubAppKey;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public String getTopic() {
        return topic;
    }

    public Number getUserId() {
        return userId;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public void setPubAppKey(String pubAppKey) {
        this.pubAppKey = pubAppKey;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setUserId(Number userId) {
        this.userId = userId;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

}
