package com.aliyun.api.ess.ess20140828.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.ScheduledTaskModel;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ess.aliyuncs.com.DescribeScheduledTasks.2014-08-28 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeScheduledTasksResponse extends AliyunResponse {

    private static final long serialVersionUID = 2424633587491824597L;

    /**
     * PageNumber
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * PageSize
     */
    @ApiField("PageSize")
    private Long pageSize;

    /**
     * RequestId
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 定时任务信息组成的集合
     */
    @ApiListField("ScheduledTasks")
    @ApiField("ScheduledTaskModel")
    private List<ScheduledTaskModel> scheduledTasks;

    /**
     * 定时任务总数
     */
    @ApiField("TotalCount")
    private Long totalCount;

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public List<ScheduledTaskModel> getScheduledTasks() {
        return this.scheduledTasks;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setScheduledTasks(List<ScheduledTaskModel> scheduledTasks) {
        this.scheduledTasks = scheduledTasks;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
