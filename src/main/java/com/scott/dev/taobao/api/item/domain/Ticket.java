package com.scott.dev.taobao.api.item.domain;

import java.util.Date;

/*
 * 产品规格审核信息
 */
public class Ticket {

    /*
     * 产品规格ID
     */
    private Number specId;

    /*
     * 创建人ID
     */
    private Number createUserId;

    /*
     * 如果产品规格，需要商家审核，为商家审核用户ID
     */
    private Number auditSellerId;

    /*
     * 审核原因
     */
    private String reason;

    /*
     * 关于审核原因，更详细的说明
     */
    private String memo;

    /*
     * 1, "商家确认" 2, "商家拒绝" 3, "小二确认" 4, "小二拒绝" 
     * 5, "待商家处理" 6, "商家审核超时" 7, "待小二审核" 9, "品牌商确认" 
     * 10, "免审通过" 14, "免审拒绝"
     */
    private Number status;

    /*
     * 产品规格申请时间
     */
    private Date gmtCreate;

    /*
     * 产品规格审核单最后修改时间
     */
    private Date gmtModified;

    public Number getSpecId() {
        return specId;
    }

    public void setSpecId(Number specId) {
        this.specId = specId;
    }

    public Number getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Number createUserId) {
        this.createUserId = createUserId;
    }

    public Number getAuditSellerId() {
        return auditSellerId;
    }

    public void setAuditSellerId(Number auditSellerId) {
        this.auditSellerId = auditSellerId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Number getStatus() {
        return status;
    }

    public void setStatus(Number status) {
        this.status = status;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

}
