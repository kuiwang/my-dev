package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 评价信息包括标签信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class TmallRateInfo extends TaobaoObject {

    private static final long serialVersionUID = 5642851126672221365L;

    /**
     * 追加评价内容
     */
    @ApiField("append_content")
    private String appendContent;

    /**
     * 追评中是否含有负向标签
     */
    @ApiField("append_has_negtv")
    private Boolean appendHasNegtv;

    /**
     * 追加评价中带有的语义标签列表
     */
    @ApiListField("append_tags")
    @ApiField("tmall_rate_tag")
    private List<TmallRateTag> appendTags;

    /**
     * 追加评价时间
     */
    @ApiField("append_time")
    private Date appendTime;

    /**
     * 评价时间
     */
    @ApiField("comment_time")
    private Date commentTime;

    /**
     * 评价内容
     */
    @ApiField("content")
    private String content;

    /**
     * 原始评价是否含有负向标签
     */
    @ApiField("has_negtv")
    private Boolean hasNegtv;

    /**
     * 原始评价对应的标签列表
     */
    @ApiListField("tags")
    @ApiField("tmall_rate_tag")
    private List<TmallRateTag> tags;

    /**
     * 表示评价者的昵称
     */
    @ApiField("user_nick")
    private String userNick;

    public String getAppendContent() {
        return this.appendContent;
    }

    public Boolean getAppendHasNegtv() {
        return this.appendHasNegtv;
    }

    public List<TmallRateTag> getAppendTags() {
        return this.appendTags;
    }

    public Date getAppendTime() {
        return this.appendTime;
    }

    public Date getCommentTime() {
        return this.commentTime;
    }

    public String getContent() {
        return this.content;
    }

    public Boolean getHasNegtv() {
        return this.hasNegtv;
    }

    public List<TmallRateTag> getTags() {
        return this.tags;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public void setAppendContent(String appendContent) {
        this.appendContent = appendContent;
    }

    public void setAppendHasNegtv(Boolean appendHasNegtv) {
        this.appendHasNegtv = appendHasNegtv;
    }

    public void setAppendTags(List<TmallRateTag> appendTags) {
        this.appendTags = appendTags;
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

    public void setTags(List<TmallRateTag> tags) {
        this.tags = tags;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

}
