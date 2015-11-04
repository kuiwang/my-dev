package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 客服评价统计
 *
 * @author auto create
 * @since 1.0, null
 */
public class StaffEvalStatById extends TaobaoObject {

    private static final long serialVersionUID = 4895542474617949851L;

    /**
     * 客服评价
     */
    @ApiListField("evaluations")
    @ApiField("evaluation")
    private List<Evaluation> evaluations;

    /**
     * 客服人员ID
     */
    @ApiField("service_staff_id")
    private String serviceStaffId;

    public List<Evaluation> getEvaluations() {
        return this.evaluations;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public String getServiceStaffId() {
        return this.serviceStaffId;
    }

    public void setServiceStaffId(String serviceStaffId) {
        this.serviceStaffId = serviceStaffId;
    }

}
