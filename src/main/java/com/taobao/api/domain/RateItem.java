package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 评价条目
 *
 * @author auto create
 * @since 1.0, null
 */
public class RateItem extends TaobaoObject {

    private static final long serialVersionUID = 4831578983812573288L;

    /**
     * 评价内容
     */
    @ApiField("feedback")
    private String feedback;

    /**
     * 评价人nick
     */
    @ApiField("nick")
    private String nick;

    public String getFeedback() {
        return this.feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

}
