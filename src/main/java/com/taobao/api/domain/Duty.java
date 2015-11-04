package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 子账号职务信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class Duty extends TaobaoObject {

    private static final long serialVersionUID = 4885393564433194456L;

    /**
     * 职务ID
     */
    @ApiField("duty_id")
    private Long dutyId;

    /**
     * 职务级别
     */
    @ApiField("duty_level")
    private Long dutyLevel;

    /**
     * 职务名称
     */
    @ApiField("duty_name")
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
