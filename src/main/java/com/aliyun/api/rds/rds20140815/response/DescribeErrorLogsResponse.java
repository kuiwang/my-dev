package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.ErrorLog;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeErrorLogs.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeErrorLogsResponse extends AliyunResponse {

    private static final long serialVersionUID = 6832729655585836712L;

    /**
     * SQLSlowLog列表
     */
    @ApiListField("Items")
    @ApiField("ErrorLog")
    private List<ErrorLog> items;

    /**
     * 页码
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 本页SQL语句个数
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

    public void setItems(List<ErrorLog> items) {
        this.items = items;
    }

    public List<ErrorLog> getItems() {
        return this.items;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public void setPageRecordCount(Long pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
    }

    public Long getPageRecordCount() {
        return this.pageRecordCount;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

}