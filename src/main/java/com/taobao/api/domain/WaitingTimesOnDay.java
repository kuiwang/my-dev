package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 客户等待（客服）平均时长列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class WaitingTimesOnDay extends TaobaoObject {

    private static final long serialVersionUID = 4269581948135164512L;

    /**
     * 等待时长（统计）日期
     */
    @ApiField("waiting_date")
    private Date waitingDate;

    /**
     * 等待时长列表
     */
    @ApiListField("waiting_time_by_ids")
    @ApiField("waiting_time_by_id")
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
