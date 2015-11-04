package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 国内机票订单行程购票数据结构录入【top订单优化】
 *
 * @author auto create
 * @since 1.0, null
 */
public class CorpInfo extends TaobaoObject {

    private static final long serialVersionUID = 7175757624344674169L;

    /**
     * 申请人姓名
     */
    @ApiField("apply_name")
    private String applyName;

    /**
     * 申请人工号
     */
    @ApiField("apply_no")
    private String applyNo;

    /**
     * 申请时间
     */
    @ApiField("apply_time")
    private Date applyTime;

    /**
     * 集团id
     */
    @ApiField("corpration_id")
    private String corprationId;

    /**
     * 成本中心
     */
    @ApiField("cost_center")
    private String costCenter;

    /**
     * 成本中心代码
     */
    @ApiField("cost_center_code")
    private String costCenterCode;

    /**
     * 费用归属OU的CODE
     */
    @ApiField("cost_ou")
    private String costOu;

    /**
     * 扩展字段
     */
    @ApiField("extra")
    private String extra;

    /**
     * BPM的fromNO
     */
    @ApiField("form_no")
    private String formNo;

    /**
     * 单据状态代码
     */
    @ApiField("form_status")
    private String formStatus;

    /**
     * 单据状态描述
     */
    @ApiField("receipts_status")
    private String receiptsStatus;

    /**
     * 出差人姓名
     */
    @ApiField("trip_person_name")
    private String tripPersonName;

    /**
     * 出差人工号
     */
    @ApiField("trip_person_no")
    private String tripPersonNo;

    /**
     * 工作地点
     */
    @ApiField("work_space")
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
