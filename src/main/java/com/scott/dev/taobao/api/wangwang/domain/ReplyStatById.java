package com.scott.dev.taobao.api.wangwang.domain;

/**
 * 客服回复统计
 */
public class ReplyStatById {

    /**
     * 客服回复数
     */
    private Long replyNum;

    /**
     * 客服ID
     */
    private String userId;

    public Long getReplyNum() {
        return this.replyNum;
    }

    public void setReplyNum(Long replyNum) {
        this.replyNum = replyNum;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
