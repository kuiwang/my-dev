package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 消息通道的通用消息结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class TmcMessage extends TaobaoObject {

    private static final long serialVersionUID = 2499774379375451793L;

    /**
     * 消息详细内容，格式为JSON/XML
     */
    @ApiField("content")
    private String content;

    /**
     * 消息ID
     */
    @ApiField("id")
    private Long id;

    /**
     * 消息发布者的AppKey
     */
    @ApiField("pub_app_key")
    private String pubAppKey;

    /**
     * 消息发布时间
     */
    @ApiField("pub_time")
    private Date pubTime;

    /**
     * 消息所属主题
     */
    @ApiField("topic")
    private String topic;

    /**
     * 消息所属的用户编号
     */
    @ApiField("user_id")
    private Long userId;

    /**
     * 用户的昵称
     */
    @ApiField("user_nick")
    private String userNick;

    public String getContent() {
        return this.content;
    }

    public Long getId() {
        return this.id;
    }

    public String getPubAppKey() {
        return this.pubAppKey;
    }

    public Date getPubTime() {
        return this.pubTime;
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

    public void setId(Long id) {
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

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

}
