package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.QtReportAddResponse;

/**
 * TOP API: taobao.qt.report.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class QtReportAddRequest implements TaobaoRequest<QtReportAddResponse> {

    /**
     * 自定义属性字段;分号分隔<br />
     * 支持最大长度为：2000<br />
     * 支持的最大列表长度为：2000
     */
    private String extAttr;

    /**
     * 质检有效到期时间，一般为一年有效期 status状态为3时必须非空
     */
    private Date gmtExpiry;

    /**
     * 提交报告结果时间
     */
    private Date gmtReport;

    /**
     * 送检日期
     */
    private Date gmtSubmit;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 只有status=3时赋值, true 质检结果合格,false质检结果不合格. 留空表示成分鉴定,不做判定
     */
    private Boolean isPassed;

    /**
     * 样品信息描述<br />
     * 支持最大长度为：150<br />
     * 支持的最大列表长度为：150
     */
    private String itemDesc;

    /**
     * 样品链接. QT_TYPE=9的时候，请填写N\A<br />
     * 支持最大长度为：256<br />
     * 支持的最大列表长度为：256
     */
    private String itemUrl;

    /**
     * 检测结果消息描述<br />
     * 支持最大长度为：600<br />
     * 支持的最大列表长度为：600
     */
    private String message;

    /**
     * 送检者昵称<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String nick;

    /**
     * 当前接口只有淘宝订单真假鉴定（QT_TYPE=9）的报告在该字段传入订单号，其他类型报告都不需要传输该值
     */
    private Long numIid;

    /**
     * 一个质检服务唯一标识质量检验单的编号<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String qtCode;

    /**
     * 质检名称<br />
     * 支持最大长度为：150<br />
     * 支持的最大列表长度为：150
     */
    private String qtName;

    /**
     * 质检标准 status=3 时 必须非空<br />
     * 支持最大长度为：16<br />
     * 支持的最大列表长度为：16
     */
    private String qtStandard;

    /**
     * (1L, "聚划算"), (2L, "消保"), (3L, "分销"), (4L, "抽检"), (5L, "良无限线下数据"),
     * (6L, "入驻/续签商城"), (7L, "买家质检维权"), (8L, "实地验证"), (9L, "淘宝买家订单商品鉴定"),
     * (10L,"假一赔三");<br />
     * 支持最大值为：15<br />
     * 支持最小值为：0
     */
    private Long qtType;

    /**
     * 质检报告源文件url status状态为3时必须非空<br />
     * 支持最大长度为：256<br />
     * 支持的最大列表长度为：256
     */
    private String reportUrl;

    /**
     * 收费项code<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String servcieItemCode;

    /**
     * 质检服务商名称<br />
     * 支持最大长度为：50<br />
     * 支持的最大列表长度为：50
     */
    private String spName;

    /**
     * 0:已提交申请 1:已收到样品 2:已出检测结果 3.已出具报告<br />
     * 支持最大值为：4<br />
     * 支持最小值为：0
     */
    private Long status;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(extAttr, 2000, "extAttr");
        RequestCheckUtils.checkNotEmpty(gmtSubmit, "gmtSubmit");
        RequestCheckUtils.checkNotEmpty(itemDesc, "itemDesc");
        RequestCheckUtils.checkMaxLength(itemDesc, 150, "itemDesc");
        RequestCheckUtils.checkNotEmpty(itemUrl, "itemUrl");
        RequestCheckUtils.checkMaxLength(itemUrl, 256, "itemUrl");
        RequestCheckUtils.checkMaxLength(message, 600, "message");
        RequestCheckUtils.checkNotEmpty(nick, "nick");
        RequestCheckUtils.checkMaxLength(nick, 32, "nick");
        RequestCheckUtils.checkNotEmpty(qtCode, "qtCode");
        RequestCheckUtils.checkMaxLength(qtCode, 64, "qtCode");
        RequestCheckUtils.checkNotEmpty(qtName, "qtName");
        RequestCheckUtils.checkMaxLength(qtName, 150, "qtName");
        RequestCheckUtils.checkMaxLength(qtStandard, 16, "qtStandard");
        RequestCheckUtils.checkNotEmpty(qtType, "qtType");
        RequestCheckUtils.checkMaxValue(qtType, 15L, "qtType");
        RequestCheckUtils.checkMinValue(qtType, 0L, "qtType");
        RequestCheckUtils.checkMaxLength(reportUrl, 256, "reportUrl");
        RequestCheckUtils.checkNotEmpty(servcieItemCode, "servcieItemCode");
        RequestCheckUtils.checkMaxLength(servcieItemCode, 64, "servcieItemCode");
        RequestCheckUtils.checkNotEmpty(spName, "spName");
        RequestCheckUtils.checkMaxLength(spName, 50, "spName");
        RequestCheckUtils.checkNotEmpty(status, "status");
        RequestCheckUtils.checkMaxValue(status, 4L, "status");
        RequestCheckUtils.checkMinValue(status, 0L, "status");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.qt.report.add";
    }

    public String getExtAttr() {
        return this.extAttr;
    }

    public Date getGmtExpiry() {
        return this.gmtExpiry;
    }

    public Date getGmtReport() {
        return this.gmtReport;
    }

    public Date getGmtSubmit() {
        return this.gmtSubmit;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Boolean getIsPassed() {
        return this.isPassed;
    }

    public String getItemDesc() {
        return this.itemDesc;
    }

    public String getItemUrl() {
        return this.itemUrl;
    }

    public String getMessage() {
        return this.message;
    }

    public String getNick() {
        return this.nick;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public String getQtCode() {
        return this.qtCode;
    }

    public String getQtName() {
        return this.qtName;
    }

    public String getQtStandard() {
        return this.qtStandard;
    }

    public Long getQtType() {
        return this.qtType;
    }

    public String getReportUrl() {
        return this.reportUrl;
    }

    @Override
    public Class<QtReportAddResponse> getResponseClass() {
        return QtReportAddResponse.class;
    }

    public String getServcieItemCode() {
        return this.servcieItemCode;
    }

    public String getSpName() {
        return this.spName;
    }

    public Long getStatus() {
        return this.status;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ext_attr", this.extAttr);
        txtParams.put("gmt_expiry", this.gmtExpiry);
        txtParams.put("gmt_report", this.gmtReport);
        txtParams.put("gmt_submit", this.gmtSubmit);
        txtParams.put("is_passed", this.isPassed);
        txtParams.put("item_desc", this.itemDesc);
        txtParams.put("item_url", this.itemUrl);
        txtParams.put("message", this.message);
        txtParams.put("nick", this.nick);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("qt_code", this.qtCode);
        txtParams.put("qt_name", this.qtName);
        txtParams.put("qt_standard", this.qtStandard);
        txtParams.put("qt_type", this.qtType);
        txtParams.put("report_url", this.reportUrl);
        txtParams.put("servcie_item_code", this.servcieItemCode);
        txtParams.put("sp_name", this.spName);
        txtParams.put("status", this.status);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setExtAttr(String extAttr) {
        this.extAttr = extAttr;
    }

    public void setGmtExpiry(Date gmtExpiry) {
        this.gmtExpiry = gmtExpiry;
    }

    public void setGmtReport(Date gmtReport) {
        this.gmtReport = gmtReport;
    }

    public void setGmtSubmit(Date gmtSubmit) {
        this.gmtSubmit = gmtSubmit;
    }

    public void setIsPassed(Boolean isPassed) {
        this.isPassed = isPassed;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public void setQtCode(String qtCode) {
        this.qtCode = qtCode;
    }

    public void setQtName(String qtName) {
        this.qtName = qtName;
    }

    public void setQtStandard(String qtStandard) {
        this.qtStandard = qtStandard;
    }

    public void setQtType(Long qtType) {
        this.qtType = qtType;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public void setServcieItemCode(String servcieItemCode) {
        this.servcieItemCode = servcieItemCode;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
