package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 客服评价统计列表(按天)
 *
 * @author auto create
 * @since 1.0, null
 */
public class StaffEvalStatOnDay extends TaobaoObject {

    private static final long serialVersionUID = 1559472782366422178L;

    /**
     * 评价产生的日期
     */
    @ApiField("eval_date")
    private Date evalDate;

    /**
     * 客服评价统计列表
     */
    @ApiListField("staff_eval_stat_by_ids")
    @ApiField("staff_eval_stat_by_id")
    private List<StaffEvalStatById> staffEvalStatByIds;

    public Date getEvalDate() {
        return this.evalDate;
    }

    public void setEvalDate(Date evalDate) {
        this.evalDate = evalDate;
    }

    public List<StaffEvalStatById> getStaffEvalStatByIds() {
        return this.staffEvalStatByIds;
    }

    public void setStaffEvalStatByIds(List<StaffEvalStatById> staffEvalStatByIds) {
        this.staffEvalStatByIds = staffEvalStatByIds;
    }

}
