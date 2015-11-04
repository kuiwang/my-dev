package com.scott.dev.taobao.api.airticket.domain;

import java.util.Date;

/**
 * 国内机票订单行程购票数据结构录入【top订单优化】
 */
public class CorpInfo {

    /**
     * 申请人姓名
     */
    private String applyName;

    /**
     * 申请人工号
     */
    private String applyNo;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 集团id
     */
    private String corprationId;

    /**
     * 成本中心
     */
    private String costCenter;

    /**
     * 成本中心代码
     */
    private String costCenterCode;

    /**
     * 费用归属OU的CODE
     */
    private String costOu;

    /**
     * 扩展字段
     */
    private String extra;

    /**
     * BPM的fromNO
     */
    private String formNo;

    /**
     * 单据状态代码
     */
    private String formStatus;

    /**
     * 单据状态描述
     */
    private String receiptsStatus;

    /**
     * 出差人姓名
     */
    private String tripPersonName;

    /**
     * 出差人工号
     */
    private String tripPersonNo;

    /**
     * 工作地点
     */
    private String workSpace;

    public String getApplyName() {
        return this.applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getApplyNo() {
        return this.applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public Date getApplyTime() {
        return this.applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getCorprationId() {
        return this.corprationId;
    }

    public void setCorprationId(String corprationId) {
        this.corprationId = corprationId;
    }

    public String getCostCenter() {
        return this.costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getCostCenterCode() {
        return this.costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

    public String getCostOu() {
        return this.costOu;
    }

    public void setCostOu(String costOu) {
        this.costOu = costOu;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getFormNo() {
        return this.formNo;
    }

    public void setFormNo(String formNo) {
        this.formNo = formNo;
    }

    public String getFormStatus() {
        return this.formStatus;
    }

    public void setFormStatus(String formStatus) {
        this.formStatus = formStatus;
    }

    public String getReceiptsStatus() {
        return this.receiptsStatus;
    }

    public void setReceiptsStatus(String receiptsStatus) {
        this.receiptsStatus = receiptsStatus;
    }

    public String getTripPersonName() {
        return this.tripPersonName;
    }

    public void setTripPersonName(String tripPersonName) {
        this.tripPersonName = tripPersonName;
    }

    public String getTripPersonNo() {
        return this.tripPersonNo;
    }

    public void setTripPersonNo(String tripPersonNo) {
        this.tripPersonNo = tripPersonNo;
    }

    public String getWorkSpace() {
        return this.workSpace;
    }

    public void setWorkSpace(String workSpace) {
        this.workSpace = workSpace;
    }

}
