package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Vpcs;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeVpcs.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeVpcsResponse extends AliyunResponse {

    private static final long serialVersionUID = 2775415958314319799L;

    /**
     * 当前页码
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 当前分页包含多少条目
     */
    @ApiField("PageSize")
    private Long pageSize;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 列表条条目数
     */
    @ApiField("TotalCount")
    private Long totalCount;

    /**
     * 虚拟网络详情VpcSetType组成的集合
     */
    @ApiListField("Vpcs")
    @ApiField("Vpcs")
    private List<Vpcs> vpcs;

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

    public void setVpcs(List<Vpcs> vpcs) {
        this.vpcs = vpcs;
    }

    public List<Vpcs> getVpcs() {
        return this.vpcs;
    }

}
