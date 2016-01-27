package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.SQLSlowRecord;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeSlowLogRecords.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeSlowLogRecordsResponse extends AliyunResponse {

    private static final long serialVersionUID = 6498466334767628733L;

    /**
     * 数据库类型
     */
    @ApiField("Engine")
    private String engine;

    /**
     * SQLSlowLog列表
     */
    @ApiListField("Items")
    @ApiField("SQLSlowRecord")
    private List<SQLSlowRecord> items;

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

    public String getEngine() {
        return this.engine;
    }

    public List<SQLSlowRecord> getItems() {
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

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setItems(List<SQLSlowRecord> items) {
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
