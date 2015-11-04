package com.scott.dev.taobao.api.comment.domain;

import java.util.Date;

/*
 * 评价信息包括标签信息
 */
public class TmallRateInfo {

    /*
     * 表示评价者的昵称
     */
    private String userNick;

    /*
     * 评价内容
     */
    private String content;

    /*
     * 评价时间
     */
    private Date commentTime;

    /*
     * 原始评价对应的标签列表
     */
    private TmallRateTag[] tags;

    /*
     * 原始评价是否含有负向标签
     */
    private Boolean hasNegtv;

    /*
     * 追加评价内容
     */
    private String appendContent;

    /*
     * 追加评价时间
     */
    private Date appendTime;

    /*
     * 追加评价中带有的语义标签列表   
     */
    private TmallRateTag[] append_tags;

    /*
     * 追评中是否含有负向标签
     */
    private Boolean appendHasNegtv;

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public TmallRateTag[] getTags() {
        return tags;
    }

    public void setTags(TmallRateTag[] tags) {
        this.tags = tags;
    }

    public Boolean getHasNegtv() {
        return hasNegtv;
    }

    public void setHasNegtv(Boolean hasNegtv) {
        this.hasNegtv = hasNegtv;
    }

    public String getAppendContent() {
        return appendContent;
    }

    public void setAppendContent(String appendContent) {
        this.appendContent = appendContent;
    }

    public Date getAppendTime() {
        return appendTime;
    }

    public void setAppendTime(Date appendTime) {
        this.appendTime = appendTime;
    }

    public TmallRateTag[] getAppend_tags() {
        return append_tags;
    }

    public void setAppend_tags(TmallRateTag[] append_tags) {
        this.append_tags = append_tags;
    }

    public Boolean getAppendHasNegtv() {
        return appendHasNegtv;
    }

    public void setAppendHasNegtv(Boolean appendHasNegtv) {
        this.appendHasNegtv = appendHasNegtv;
    }

}
