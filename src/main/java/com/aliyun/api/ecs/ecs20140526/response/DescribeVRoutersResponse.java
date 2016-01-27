package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.VRouter;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeVRouters.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeVRoutersResponse extends AliyunResponse {

    private static final long serialVersionUID = 3437234155459584166L;

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
     * 总条数
     */
    @ApiField("TotalCount")
    private Long totalCount;

    /**
     * 虚拟路由列表
     */
    @ApiListField("VRouters")
    @ApiField("VRouter")
    private List<VRouter> vRouters;

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public List<VRouter> getvRouters() {
        return this.vRouters;
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

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public void setvRouters(List<VRouter> vRouters) {
        this.vRouters = vRouters;
    }

}
