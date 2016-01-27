package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SubuserEmployeeAddResponse;

/**
 * TOP API: taobao.subuser.employee.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class SubuserEmployeeAddRequest implements TaobaoRequest<SubuserEmployeeAddResponse> {

    /**
     * 当前员工所属部门ID
     */
    private Long departmentId;

    /**
     * 当前员工担任职务ID
     */
    private Long dutyId;

    /**
     * 员工姓名
     */
    private String employeeName;

    /**
     * 员工花名
     */
    private String employeeNickname;

    /**
     * 员工工号(可以用大小写英文字母和数字)
     */
    private String employeeNum;

    /**
     * 员工入职时间
     */
    private Date entryDate;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 员工身份证号码
     */
    private String idCardNum;

    /**
     * 直接上级的员工ID
     */
    private Long leaderId;

    /**
     * 办公电话
     */
    private String officePhone;

    /**
     * 员工私人邮箱
     */
    private String personalEmail;

    /**
     * 员工手机号码
     */
    private String personalMobile;

    /**
     * 员工性别 1：男; 2:女
     */
    private Long sex;

    /**
     * 子账号ID
     */
    private Long subId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 工作地点
     */
    private String workLocation;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(departmentId, "departmentId");
        RequestCheckUtils.checkNotEmpty(employeeName, "employeeName");
        RequestCheckUtils.checkNotEmpty(sex, "sex");
        RequestCheckUtils.checkNotEmpty(subId, "subId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.subuser.employee.add";
    }

    public Long getDepartmentId() {
        return this.departmentId;
    }

    public Long getDutyId() {
        return this.dutyId;
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

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getIdCardNum() {
        return this.idCardNum;
    }

    public Long getLeaderId() {
        return this.leaderId;
    }

    public String getOfficePhone() {
        return this.officePhone;
    }

    public String getPersonalEmail() {
        return this.personalEmail;
    }

    public String getPersonalMobile() {
        return this.personalMobile;
    }

    @Override
    public Class<SubuserEmployeeAddResponse> getResponseClass() {
        return SubuserEmployeeAddResponse.class;
    }

    public Long getSex() {
        return this.sex;
    }

    public Long getSubId() {
        return this.subId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("department_id", this.departmentId);
        txtParams.put("duty_id", this.dutyId);
        txtParams.put("employee_name", this.employeeName);
        txtParams.put("employee_nickname", this.employeeNickname);
        txtParams.put("employee_num", this.employeeNum);
        txtParams.put("entry_date", this.entryDate);
        txtParams.put("id_card_num", this.idCardNum);
        txtParams.put("leader_id", this.leaderId);
        txtParams.put("office_phone", this.officePhone);
        txtParams.put("personal_email", this.personalEmail);
        txtParams.put("personal_mobile", this.personalMobile);
        txtParams.put("sex", this.sex);
        txtParams.put("sub_id", this.subId);
        txtParams.put("work_location", this.workLocation);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getWorkLocation() {
        return this.workLocation;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setDutyId(Long dutyId) {
        this.dutyId = dutyId;
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

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public void setPersonalMobile(String personalMobile) {
        this.personalMobile = personalMobile;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
}
