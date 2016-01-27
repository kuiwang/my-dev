package com.scott.dev.taobao.api.item.domain;

import java.util.Date;

/*
 * 产品规格审核信息
 */
public class Ticket {

    /*
     * 如果产品规格，需要商家审核，为商家审核用户ID
     */
    private Number auditSellerId;

    /*
     * 创建人ID
     */
    private Number createUserId;

    /*
     * 产品规格申请时间
     */
    private Date gmtCreate;

    /*
     * 产品规格审核单最后修改时间
     */
    private Date gmtModified;

    /*
     * 关于审核原因，更详细的说明
     */
    private String memo;

    /*
     * 审核原因
     */
    private String reason;

    /*
     * 产品规格ID
     */
    private Number specId;

    /*
     * 1, "商家确认" 2, "商家拒绝" 3, "小二确认" 4, "小二拒绝" 
     * 5, "待商家处理" 6, "商家审核超时" 7, "待小二审核" 9, "品牌商确认" 
     * 10, "免审通过" 14, "免审拒绝"
     */
    private Number status;

    public Number getAuditSellerId() {
        return auditSellerId;
    }

    public Number getCreateUserId() {
        return createUserId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public String getMemo() {
        return memo;
    }

    public String getReason() {
        return reason;
    }

    public Number getSpecId() {
        return specId;
    }

    public Number getStatus() {
        return status;
    }

    public void setAuditSellerId(Number auditSellerId) {
        this.auditSellerId = auditSellerId;
    }

    public void setCreateUserId(Number createUserId) {
        this.createUserId = createUserId;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setSpecId(Number specId) {
        this.specId = specId;
    }

    public void setStatus(Number status) {
        this.status = status;
    }

}
