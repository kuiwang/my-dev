package com.scott.dev.taobao.api.msgcenter.domain;

import java.util.Date;

//消息通道的用户结构
public class TmcUser {

    //用户首次开通时间
    private Date created;

    //接收用户消息的组名
    private String groupName;

    //用户授权是否有效，true表示授权有效，false表示授权过期
    private Boolean isValid;

    //用户最后开通时间
    private Date modified;

    //用户开通的消息类型列表。如果为空表示应用开通的所有类型
    private String[] topics;

    //用户昵称
    private Number userId;

    //用户昵称
    private String userNick;

    public Date getCreated() {
        return created;
    }

    public String getGroupName() {
        return groupName;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public Date getModified() {
        return modified;
    }

    public String[] getTopics() {
        return topics;
    }

    public Number getUserId() {
        return userId;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    public void setUserId(Number userId) {
        this.userId = userId;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }
}
