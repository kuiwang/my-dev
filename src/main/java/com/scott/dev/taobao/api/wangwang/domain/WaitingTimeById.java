package com.scott.dev.taobao.api.wangwang.domain;

/**
 * 平均等待时长
 */
public class WaitingTimeById {

    /**
     * 平均等待时间长度（秒）
     */
    private Long avgWaitingTimes;

    /**
     * 客服人员ID
     */
    private String serviceStaffId;

    public Long getAvgWaitingTimes() {
        return this.avgWaitingTimes;
    }

    public String getServiceStaffId() {
        return this.serviceStaffId;
    }

    public void setAvgWaitingTimes(Long avgWaitingTimes) {
        this.avgWaitingTimes = avgWaitingTimes;
    }

    public void setServiceStaffId(String serviceStaffId) {
        this.serviceStaffId = serviceStaffId;
    }

}
