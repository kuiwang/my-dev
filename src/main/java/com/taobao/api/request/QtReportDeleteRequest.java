package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.QtReportDeleteResponse;

/**
 * TOP API: taobao.qt.report.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:29
 */
public class QtReportDeleteRequest implements TaobaoRequest<QtReportDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 一个质检服务唯一标识质量检验单的编号<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String qtCode;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(qtCode, "qtCode");
        RequestCheckUtils.checkMaxLength(qtCode, 64, "qtCode");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.qt.report.delete";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getQtCode() {
        return this.qtCode;
    }

    @Override
    public Class<QtReportDeleteResponse> getResponseClass() {
        return QtReportDeleteResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("qt_code", this.qtCode);
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

    public void setQtCode(String qtCode) {
        this.qtCode = qtCode;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
