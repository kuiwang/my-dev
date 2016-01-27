package com.scott.dev.taobao.api.wangwang.domain;

import java.util.Date;
import java.util.List;

/**
 * 客户等待（客服）平均时长列表
 */
public class WaitingTimesOnDay {

    /**
     * 等待时长（统计）日期
     */
    private Date waitingDate;

    /**
     * 等待时长列表
     */
    private List<WaitingTimeById> waitingTimeByIds;

    public Date getWaitingDate() {
        return this.waitingDate;
    }

    public List<WaitingTimeById> getWaitingTimeByIds() {
        return this.waitingTimeByIds;
    }

    public void setWaitingDate(Date waitingDate) {
        this.waitingDate = waitingDate;
    }

    public void setWaitingTimeByIds(List<WaitingTimeById> waitingTimeByIds) {
        this.waitingTimeByIds = waitingTimeByIds;
    }

}
