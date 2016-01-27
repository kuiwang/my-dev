package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.StaffEvalStatOnDay;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wangwang.eservice.evaluation.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WangwangEserviceEvaluationGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8631567361874881255L;

    /**
     * 客服平均统计列表
     */
    @ApiListField("staff_eval_stat_on_days")
    @ApiField("staff_eval_stat_on_day")
    private List<StaffEvalStatOnDay> staffEvalStatOnDays;

    public List<StaffEvalStatOnDay> getStaffEvalStatOnDays() {
        return this.staffEvalStatOnDays;
    }

    public void setStaffEvalStatOnDays(List<StaffEvalStatOnDay> staffEvalStatOnDays) {
        this.staffEvalStatOnDays = staffEvalStatOnDays;
    }

}
