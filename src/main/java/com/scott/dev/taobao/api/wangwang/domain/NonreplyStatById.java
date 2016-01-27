package com.scott.dev.taobao.api.wangwang.domain;

/**
 * 客服未回复统计
 */
public class NonreplyStatById {

    /**
     * 客服人员未回复的客户ID
     */
    private String nonReplyCustomId;

    /**
     * 客服未回复数
     */
    private Long nonReplyNum;

    /**
     * 客服人员ID
     */
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
