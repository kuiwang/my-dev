package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 未回复统计列表(按天)
 *
 * @author auto create
 * @since 1.0, null
 */
public class NonReplyStatOnDay extends TaobaoObject {

    private static final long serialVersionUID = 6165294548789514727L;

    /**
     * （某天的）未回复统计
     */
    @ApiField("nonreply_date")
    private Date nonreplyDate;

    /**
     * 未回复统计列表
     */
    @ApiListField("nonreply_stat_by_ids")
    @ApiField("nonreply_stat_by_id")
    private List<NonreplyStatById> nonreplyStatByIds;

    public Date getNonreplyDate() {
        return this.nonreplyDate;
    }

    public void setNonreplyDate(Date nonreplyDate) {
        this.nonreplyDate = nonreplyDate;
    }

    public List<NonreplyStatById> getNonreplyStatByIds() {
        return this.nonreplyStatByIds;
    }

    public void setNonreplyStatByIds(List<NonreplyStatById> nonreplyStatByIds) {
        this.nonreplyStatByIds = nonreplyStatByIds;
    }

}
