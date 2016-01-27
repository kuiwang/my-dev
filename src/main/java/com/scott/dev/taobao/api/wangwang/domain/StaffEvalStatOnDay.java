package com.scott.dev.taobao.api.wangwang.domain;

import java.util.Date;
import java.util.List;

/**
 * 客服评价统计列表(按天)
 */
public class StaffEvalStatOnDay {

    /**
     * 评价产生的日期
     */
    private Date evalDate;

    /**
     * 客服评价统计列表
     */
    private List<StaffEvalStatById> staffEvalStatByIds;

    public Date getEvalDate() {
        return this.evalDate;
    }

    public List<StaffEvalStatById> getStaffEvalStatByIds() {
        return this.staffEvalStatByIds;
    }

    public void setEvalDate(Date evalDate) {
        this.evalDate = evalDate;
    }

    public void setStaffEvalStatByIds(List<StaffEvalStatById> staffEvalStatByIds) {
        this.staffEvalStatByIds = staffEvalStatByIds;
    }

}
