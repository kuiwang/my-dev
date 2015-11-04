package com.scott.dev.taobao.api.wangwang.domain;

import java.util.Date;
import java.util.List;

/**
 * 未回复统计列表(按天)
 */
public class NonReplyStatOnDay {

    /**
     * （某天的）未回复统计
     */
    private Date nonreplyDate;

    /**
     * 未回复统计列表
     */
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
