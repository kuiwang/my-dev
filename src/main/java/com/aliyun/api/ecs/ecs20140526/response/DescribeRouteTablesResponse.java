package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.RouteTable;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeRouteTables.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeRouteTablesResponse extends AliyunResponse {

    private static final long serialVersionUID = 3438523522346398493L;

    /**
     * 页码
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 分页大小
     */
    @ApiField("PageSize")
    private Long pageSize;

    /**
     * 请求id
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 路由表
     */
    @ApiListField("RouteTables")
    @ApiField("RouteTable")
    private List<RouteTable> routeTables;

    /**
     * 总条数
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

    public List<RouteTable> getRouteTables() {
        return this.routeTables;
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

    public void setRouteTables(List<RouteTable> routeTables) {
        this.routeTables = routeTables;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
