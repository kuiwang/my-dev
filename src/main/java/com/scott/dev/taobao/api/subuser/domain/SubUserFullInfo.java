package com.scott.dev.taobao.api.subuser.domain;

import java.util.Date;

/**
 * 子账号详细信息，其中包括账号基本信息、员工信息和部门职务信息
 */
public class SubUserFullInfo {

    /**
     * 部门Id
     */
    private Long departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 职务Id
     */
    private Long dutyId;

    /**
     * 职务等级
     */
    private Long dutyLevel;

    /**
     * 职务名称
     */
    private String dutyName;

    /**
     * 员工ID
     */
    private Long employeeId;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 员工花名
     */
    private String employeeNickname;

    /**
     * 入职员工工号
     */
    private String employeeNum;

    /**
     * 员工入职时间
     */
    private Date entryDate;

    /**
     * 直接上级的员工ID
     */
    private Long leaderId;

    /**
     * 办公电话
     */
    private String officePhone;

    /**
     * 父部门Id
     */
    private Long parentDepartment;

    /**
     * 员工性别 1:男; 2:女
     */
    private Long sex;

    /**
     * 子账号是否参与分流 true:参与分流 false:未参与分流
     */
    private Boolean subDispatchStatus;

    /**
     * 子账号Id
     */
    private Long subId;

    /**
     * 子账号用户名
     */
    private String subNick;

    /**
     * 子账号是否已欠费 true:已欠费 false:未欠费
     */
    private Boolean subOwedStatus;

    /**
     * 子账号当前状态：1正常，2卖家停用，3处罚冻结
     */
    private Long subStatus;

    /**
     * 子账号企业邮箱
     */
    private String subuserEmail;

    /**
     * 主账号企业邮箱
     */
    private String userEmail;

    /**
     * 主账号Id
     */
    private Long userId;

    /**
     * 主账号用户名
     */
    private String userNick;

    /**
     * 工作地点
     */
    private String workLocation;

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public Long getDutyId() {
        return this.dutyId;
    }

    public Long getDutyLevel() {
        return this.dutyLevel;
    }

    public String getDutyName() {
        return this.dutyName;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public String getEmployeeNickname() {
        return this.employeeNickname;
    }

    public String getEmployeeNum() {
        return this.employeeNum;
    }

    public Date getEntryDate() {
        return this.entryDate;
    }

    public Long getLeaderId() {
        return this.leaderId;
    }

    public String getOfficePhone() {
        return this.officePhone;
    }

    public Long getParentDepartment() {
        return this.parentDepartment;
    }

    public Long getSex() {
        return this.sex;
    }

    public Boolean getSubDispatchStatus() {
        return this.subDispatchStatus;
    }

    public Long getSubId() {
        return this.subId;
    }

    public String getSubNick() {
        return this.subNick;
    }

    public Boolean getSubOwedStatus() {
        return this.subOwedStatus;
    }

    public Long getSubStatus() {
        return this.subStatus;
    }

    public String getSubuserEmail() {
        return this.subuserEmail;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public String getWorkLocation() {
        return this.workLocation;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDutyId(Long dutyId) {
        this.dutyId = dutyId;
    }

    public void setDutyLevel(Long dutyLevel) {
        this.dutyLevel = dutyLevel;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeNickname(String employeeNickname) {
        this.employeeNickname = employeeNickname;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public void setParentDepartment(Long parentDepartment) {
        this.parentDepartment = parentDepartment;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public void setSubDispatchStatus(Boolean subDispatchStatus) {
        this.subDispatchStatus = subDispatchStatus;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public void setSubNick(String subNick) {
        this.subNick = subNick;
    }

    public void setSubOwedStatus(Boolean subOwedStatus) {
        this.subOwedStatus = subOwedStatus;
    }

    public void setSubStatus(Long subStatus) {
        this.subStatus = subStatus;
    }

    public void setSubuserEmail(String subuserEmail) {
        this.subuserEmail = subuserEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

}
