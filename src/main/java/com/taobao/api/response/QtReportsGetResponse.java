package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.QtReport;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.qt.reports.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class QtReportsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3612233292625525959L;

    /**
     * 质检报告列表
     */
    @ApiListField("reports")
    @ApiField("qt_report")
    private List<QtReport> reports;

    public void setReports(List<QtReport> reports) {
        this.reports = reports;
    }

    public List<QtReport> getReports() {
        return this.reports;
    }

}
