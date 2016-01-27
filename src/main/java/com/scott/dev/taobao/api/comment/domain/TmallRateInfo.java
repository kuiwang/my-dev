package com.scott.dev.taobao.api.comment.domain;

import java.util.Date;

/*
 * 评价信息包括标签信息
 */
public class TmallRateInfo {

    /*
     * 追加评价中带有的语义标签列表   
     */
    private TmallRateTag[] append_tags;

    /*
     * 追加评价内容
     */
    private String appendContent;

    /*
     * 追评中是否含有负向标签
     */
    private Boolean appendHasNegtv;

    /*
     * 追加评价时间
     */
    private Date appendTime;

    /*
     * 评价时间
     */
    private Date commentTime;

    /*
     * 评价内容
     */
    private String content;

    /*
     * 原始评价是否含有负向标签
     */
    private Boolean hasNegtv;

    /*
     * 原始评价对应的标签列表
     */
    private TmallRateTag[] tags;

    /*
     * 表示评价者的昵称
     */
    private String userNick;

    public TmallRateTag[] getAppend_tags() {
        return append_tags;
    }

    public String getAppendContent() {
        return appendContent;
    }

    public Boolean getAppendHasNegtv() {
        return appendHasNegtv;
    }

    public Date getAppendTime() {
        return appendTime;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public String getContent() {
        return content;
    }

    public Boolean getHasNegtv() {
        return hasNegtv;
    }

    public TmallRateTag[] getTags() {
        return tags;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setAppend_tags(TmallRateTag[] append_tags) {
        this.append_tags = append_tags;
    }

    public void setAppendContent(String appendContent) {
        this.appendContent = appendContent;
    }

    public void setAppendHasNegtv(Boolean appendHasNegtv) {
        this.appendHasNegtv = appendHasNegtv;
    }

    public void setAppendTime(Date appendTime) {
        this.appendTime = appendTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setHasNegtv(Boolean hasNegtv) {
        this.hasNegtv = hasNegtv;
    }

    public void setTags(TmallRateTag[] tags) {
        this.tags = tags;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

}
