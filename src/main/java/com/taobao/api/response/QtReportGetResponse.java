package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.QtReport;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.qt.report.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class QtReportGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3254653767149655451L;

    /**
     * 质检报告对象
     */
    @ApiField("qt_report")
    private QtReport qtReport;

    public QtReport getQtReport() {
        return this.qtReport;
    }

    public void setQtReport(QtReport qtReport) {
        this.qtReport = qtReport;
    }

}
