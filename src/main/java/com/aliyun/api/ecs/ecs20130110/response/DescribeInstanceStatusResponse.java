package com.aliyun.api.ecs.ecs20130110.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.InstanceStatus;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeInstanceStatus.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeInstanceStatusResponse extends AliyunResponse {

    private static final long serialVersionUID = 6636137149163172278L;

    /**
     * 返回实例的状态信息列表
     */
    @ApiListField("InstanceStatuses")
    @ApiField("InstanceStatus")
    private List<InstanceStatus> instanceStatuses;

    /**
     * 实例列表的页码
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 输入时设置的每页行数
     */
    @ApiField("PageSize")
    private Long pageSize;

    /**
     * 请求的唯一ID，系统自动生成
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 实例总个数
     */
    @ApiField("TotalCount")
    private Long totalCount;

    public void setInstanceStatuses(List<InstanceStatus> instanceStatuses) {
        this.instanceStatuses = instanceStatuses;
    }

    public List<InstanceStatus> getInstanceStatuses() {
        return this.instanceStatuses;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

}
