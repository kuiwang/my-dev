package com.aliyun.api.rds.rds20140815.response;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.SQLReport;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: rds.aliyuncs.com.DescribeSQLLogReports.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeSQLLogReportsResponse extends AliyunResponse {

    private static final long serialVersionUID = 3513441839681158375L;

    /**
     * SQLReport列表
     */
    @ApiField("Items")
    private SQLReport items;

    /**
     * 页码
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 本页SQL日志运行报告个数
     */
    @ApiField("PageRecordCount")
    private Long pageRecordCount;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 总记录数
     */
    @ApiField("TotalRecordCount")
    private Long totalRecordCount;

    public SQLReport getItems() {
        return this.items;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public Long getPageRecordCount() {
        return this.pageRecordCount;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public void setItems(SQLReport items) {
        this.items = items;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageRecordCount(Long pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

}
