package com.scott.dev.taobao.api.wangwang.domain;

import java.util.List;

/**
 * 客服评价统计
 */
public class StaffEvalStatById {

    /**
     * 客服评价
     */
    private List<Evaluation> evaluations;

    /**
     * 客服人员ID
     */
    private String serviceStaffId;

    public List<Evaluation> getEvaluations() {
        return this.evaluations;
    }

    public String getServiceStaffId() {
        return this.serviceStaffId;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public void setServiceStaffId(String serviceStaffId) {
        this.serviceStaffId = serviceStaffId;
    }

}
