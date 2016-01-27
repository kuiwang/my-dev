package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 在线时长
 *
 * @author auto create
 * @since 1.0, null
 */
public class OnlineTimeById extends TaobaoObject {

    private static final long serialVersionUID = 2812144337584248154L;

    /**
     * 客服在线时间长度（秒）
     */
    @ApiField("online_times")
    private Long onlineTimes;

    /**
     * 客服人员ID
     */
    @ApiField("service_staff_id")
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
