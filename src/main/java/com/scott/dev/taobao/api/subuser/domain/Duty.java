package com.scott.dev.taobao.api.subuser.domain;

/**
 * 子账号职务信息
 */
public class Duty {

    /**
     * 职务ID
     */
    private Long dutyId;

    /**
     * 职务级别
     */
    private Long dutyLevel;

    /**
     * 职务名称
     */
    private String dutyName;

    public Long getDutyId() {
        return this.dutyId;
    }

    public void setDutyId(Long dutyId) {
        this.dutyId = dutyId;
    }

    public Long getDutyLevel() {
        return this.dutyLevel;
    }

    public void setDutyLevel(Long dutyLevel) {
        this.dutyLevel = dutyLevel;
    }

    public String getDutyName() {
        return this.dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

}
