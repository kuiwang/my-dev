package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 质检报告
 *
 * @author auto create
 * @since 1.0, null
 */
public class QtReport extends TaobaoObject {

    private static final long serialVersionUID = 5879136892561989199L;

    /**
     * 扩展属性通过冒号分隔属性与属性值. 分号分隔不同属性
     */
    @ApiField("ext_attr")
    private String extAttr;

    /**
     * 创建日期
     */
    @ApiField("gmt_create")
    private Date gmtCreate;

    /**
     * 质检有效期限
     */
    @ApiField("gmt_expiry")
    private Date gmtExpiry;

    /**
     * 出具报告时间。
     */
    @ApiField("gmt_report")
    private Date gmtReport;

    /**
     * 提交检查时间
     */
    @ApiField("gmt_submit")
    private Date gmtSubmit;

    /**
     * 质检报告在淘宝的Id
     */
    @ApiField("id")
    private Long id;

    /**
     * 是否合格
     */
    @ApiField("is_passed")
    private Boolean isPassed;

    /**
     * 样品的链接
     */
    @ApiField("item_url")
    private String itemUrl;

    /**
     * 不合格原因
     */
    @ApiField("message")
    private String message;

    /**
     * 送检人昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 样本宝贝id
     */
    @ApiField("num_iid")
    private Long numIid;

    /**
     * 质检编号
     */
    @ApiField("qt_code")
    private String qtCode;

    /**
     * 质检项名称
     */
    @ApiField("qt_name")
    private String qtName;

    /**
     * 质检标准
     */
    @ApiField("qt_standard")
    private String qtStandard;

    /**
     * 质检类型 0,全部 1,聚划算认证2,消保打标
     */
    @ApiField("qt_type")
    private Long qtType;

    /**
     * 质检报告地址
     */
    @ApiField("report_url")
    private String reportUrl;

    /**
     * 质检服务商名称
     */
    @ApiField("sp_name")
    private String spName;

    /**
     * 质检报告状态 0:已提交申请 1:已收到样品 2:已出检测结果 3.已出具报告
     */
    @ApiField("status")
    private Long status;

    public String getExtAttr() {
        return this.extAttr;
    }

    public void setExtAttr(String extAttr) {
        this.extAttr = extAttr;
    }

    public Date getGmtCreate() {
        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtExpiry() {
        return this.gmtExpiry;
    }

    public void setGmtExpiry(Date gmtExpiry) {
        this.gmtExpiry = gmtExpiry;
    }

    public Date getGmtReport() {
        return this.gmtReport;
    }

    public void setGmtReport(Date gmtReport) {
        this.gmtReport = gmtReport;
    }

    public Date getGmtSubmit() {
        return this.gmtSubmit;
    }

    public void setGmtSubmit(Date gmtSubmit) {
        this.gmtSubmit = gmtSubmit;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsPassed() {
        return this.isPassed;
    }

    public void setIsPassed(Boolean isPassed) {
        this.isPassed = isPassed;
    }

    public String getItemUrl() {
        return this.itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public String getQtCode() {
        return this.qtCode;
    }

    public void setQtCode(String qtCode) {
        this.qtCode = qtCode;
    }

    public String getQtName() {
        return this.qtName;
    }

    public void setQtName(String qtName) {
        this.qtName = qtName;
    }

    public String getQtStandard() {
        return this.qtStandard;
    }

    public void setQtStandard(String qtStandard) {
        this.qtStandard = qtStandard;
    }

    public Long getQtType() {
        return this.qtType;
    }

    public void setQtType(Long qtType) {
        this.qtType = qtType;
    }

    public String getReportUrl() {
        return this.reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getSpName() {
        return this.spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

}
