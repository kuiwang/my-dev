package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.QtReportsGetResponse;

/**
 * TOP API: taobao.qt.reports.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class QtReportsGetRequest implements TaobaoRequest<QtReportsGetResponse> {

    /**
     * 查询时间段的结束时间
     */
    private Date endTime;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 送检者昵称
     */
    private String nick;

    /**
     * 质检类型，目前只支持查询qt_type=11的类型
     */
    private Long qtType;

    /**
     * 收费项code
     */
    private String servcieItemCode;

    /**
     * 质检服务商名<br />
     * 支持最大长度为：50<br />
     * 支持的最大列表长度为：50
     */
    private String spName;

    /**
     * 查询时间段的开始时间
     */
    private Date startTime;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(nick, "nick");
        RequestCheckUtils.checkNotEmpty(qtType, "qtType");
        RequestCheckUtils.checkNotEmpty(servcieItemCode, "servcieItemCode");
        RequestCheckUtils.checkNotEmpty(spName, "spName");
        RequestCheckUtils.checkMaxLength(spName, 50, "spName");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.qt.reports.get";
    }

    public Date getEndTime() {
        return this.endTime;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    public Long getQtType() {
        return this.qtType;
    }

    @Override
    public Class<QtReportsGetResponse> getResponseClass() {
        return QtReportsGetResponse.class;
    }

    public String getServcieItemCode() {
        return this.servcieItemCode;
    }

    public String getSpName() {
        return this.spName;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_time", this.endTime);
        txtParams.put("nick", this.nick);
        txtParams.put("qt_type", this.qtType);
        txtParams.put("servcie_item_code", this.servcieItemCode);
        txtParams.put("sp_name", this.spName);
        txtParams.put("start_time", this.startTime);
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

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setQtType(Long qtType) {
        this.qtType = qtType;
    }

    public void setServcieItemCode(String servcieItemCode) {
        this.servcieItemCode = servcieItemCode;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
