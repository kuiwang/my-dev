package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 聊天对象ID列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class Chatpeer extends TaobaoObject {

    private static final long serialVersionUID = 1716914884929498347L;

    /**
     * 聊天日期
     */
    @ApiField("date")
    private String date;

    /**
     * 聊天对象用户ID：cntaobao+淘宝nick，例如cntaobaotest
     */
    @ApiField("uid")
    private String uid;

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}
