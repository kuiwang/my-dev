package com.scott.dev.taobao.api.wangwang.domain;

import java.util.Date;
import java.util.List;

/**
 * (某天)回复统计列表
 */
public class ReplyStatOnDay {

    /**
     * 某天（的回复统计）
     */
    private Date replyDate;

    /**
     * 客服回复统计
     */
    private List<ReplyStatById> replyStatByIds;

    public Date getReplyDate() {
        return this.replyDate;
    }

    public List<ReplyStatById> getReplyStatByIds() {
        return this.replyStatByIds;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public void setReplyStatByIds(List<ReplyStatById> replyStatByIds) {
        this.replyStatByIds = replyStatByIds;
    }

}
