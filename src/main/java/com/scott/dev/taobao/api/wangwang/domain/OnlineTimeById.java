package com.scott.dev.taobao.api.wangwang.domain;

/**
 * 在线时长
 */
public class OnlineTimeById {

    /**
     * 客服在线时间长度（秒）
     */
    private Long onlineTimes;

    /**
     * 客服人员ID
     */
    private String serviceStaffId;

    public Long getOnlineTimes() {
        return this.onlineTimes;
    }

    public String getServiceStaffId() {
        return this.serviceStaffId;
    }

    public void setOnlineTimes(Long onlineTimes) {
        this.onlineTimes = onlineTimes;
    }

    public void setServiceStaffId(String serviceStaffId) {
        this.serviceStaffId = serviceStaffId;
    }

}
