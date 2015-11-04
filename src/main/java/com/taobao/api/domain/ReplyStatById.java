package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 客服回复统计
 *
 * @author auto create
 * @since 1.0, null
 */
public class ReplyStatById extends TaobaoObject {

    private static final long serialVersionUID = 5399838955415196492L;

    /**
     * 客服回复数
     */
    @ApiField("reply_num")
    private Long replyNum;

    /**
     * 客服ID
     */
    @ApiField("user_id")
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
