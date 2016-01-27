package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 客服未回复统计
 *
 * @author auto create
 * @since 1.0, null
 */
public class NonreplyStatById extends TaobaoObject {

    private static final long serialVersionUID = 2179158957392894253L;

    /**
     * 客服人员未回复的客户ID
     */
    @ApiField("non_reply_customId")
    private String nonReplyCustomId;

    /**
     * 客服未回复数
     */
    @ApiField("non_reply_num")
    private Long nonReplyNum;

    /**
     * 客服人员ID
     */
    @ApiField("service_staff_id")
    private String serviceStaffId;

    public String getNonReplyCustomId() {
        return this.nonReplyCustomId;
    }

    public Long getNonReplyNum() {
        return this.nonReplyNum;
    }

    public String getServiceStaffId() {
        return this.serviceStaffId;
    }

    public void setNonReplyCustomId(String nonReplyCustomId) {
        this.nonReplyCustomId = nonReplyCustomId;
    }

    public void setNonReplyNum(Long nonReplyNum) {
        this.nonReplyNum = nonReplyNum;
    }

    public void setServiceStaffId(String serviceStaffId) {
        this.serviceStaffId = serviceStaffId;
    }

}
