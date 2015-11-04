package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * (某天)回复统计列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class ReplyStatOnDay extends TaobaoObject {

    private static final long serialVersionUID = 2646355261975683337L;

    /**
     * 某天（的回复统计）
     */
    @ApiField("reply_date")
    private Date replyDate;

    /**
     * 客服回复统计
     */
    @ApiListField("reply_stat_by_ids")
    @ApiField("reply_stat_by_id")
    private List<ReplyStatById> replyStatByIds;

    public Date getReplyDate() {
        return this.replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public List<ReplyStatById> getReplyStatByIds() {
        return this.replyStatByIds;
    }

    public void setReplyStatByIds(List<ReplyStatById> replyStatByIds) {
        this.replyStatByIds = replyStatByIds;
    }

}
