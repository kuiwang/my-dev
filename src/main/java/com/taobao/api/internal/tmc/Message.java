package com.taobao.api.internal.tmc;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * 消息服务-通用消息结构。
 * 
 * @author fengsheng
 * @since 1.0, May 4, 2013
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 3770198526461322514L;

    private String content;

    private Map<?, ?> contentMap;

    private Long id;

    private Date outgoingTime;

    private String pubAppKey;

    private Date pubTime;

    private Map<String, Object> raw;

    private String topic;

    private Long userId;

    private String userNick;

    public String getContent() {
        return this.content;
    }

    public Map<?, ?> getContentMap() {
        return this.contentMap;
    }

    public Long getId() {
        return this.id;
    }

    public Date getOutgoingTime() {
        return this.outgoingTime;
    }

    public String getPubAppKey() {
        return this.pubAppKey;
    }

    public Date getPubTime() {
        return this.pubTime;
    }

    public Map<String, Object> getRaw() {
        return this.raw;
    }

    public String getTopic() {
        return this.topic;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setContentMap(Map<?, ?> contentMap) {
        this.contentMap = contentMap;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOutgoingTime(Date outgoingTime) {
        this.outgoingTime = outgoingTime;
    }

    public void setPubAppKey(String pubAppKey) {
        this.pubAppKey = pubAppKey;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    protected void setRaw(Map<String, Object> raw) {
        this.raw = raw;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }
}
