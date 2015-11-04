package com.aliyun.api.rds.rds20140815.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.SQLSlowLog;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: rds.aliyuncs.com.DescribeSlowLogs.2014-08-15 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeSlowLogsResponse extends AliyunResponse {

    private static final long serialVersionUID = 7588339217421511544L;

    /**
     * 查询结束日期， 格式：YYYY-MM-DDZ，如2011-05-30Z
     */
    @ApiField("EndTime")
    private String endTime;

    /**
     * 数据库类型
     */
    @ApiField("Engine")
    private String engine;

    /**
     * SQLSlowLog列表
     */
    @ApiListField("Items")
    @ApiField("SQLSlowLog")
    private List<SQLSlowLog> items;

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
     * 请求id
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 查询开始日期， 格式：YYYY-MM-DDZ，如2011-05-30Z
     */
    @ApiField("StartTime")
    private String startTime;

    /**
     * 总记录数
     */
    @ApiField("TotalRecordCount")
    private Long totalRecordCount;

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setItems(List<SQLSlowLog> items) {
        this.items = items;
    }

    public List<SQLSlowLog> getItems() {
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

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

}
