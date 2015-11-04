package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.QtReportGetResponse;

/**
 * TOP API: taobao.qt.report.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class QtReportGetRequest implements TaobaoRequest<QtReportGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 质检编号
     */
    private String qtCode;

    public void setQtCode(String qtCode) {
        this.qtCode = qtCode;
    }

    public String getQtCode() {
        return this.qtCode;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.qt.report.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("qt_code", this.qtCode);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<QtReportGetResponse> getResponseClass() {
        return QtReportGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(qtCode, "qtCode");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
