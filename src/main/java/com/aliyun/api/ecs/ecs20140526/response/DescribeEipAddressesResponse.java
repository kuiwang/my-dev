package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Eip;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeEipAddresses.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeEipAddressesResponse extends AliyunResponse {

    private static final long serialVersionUID = 4334555912574698846L;

    /**
     * 弹性IP地址详情EipAddressType组成的集合
     */
    @ApiListField("EipAddresses")
    @ApiField("Eip")
    private List<Eip> eipAddresses;

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

    public List<Eip> getEipAddresses() {
        return this.eipAddresses;
    }

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

    public void setEipAddresses(List<Eip> eipAddresses) {
        this.eipAddresses = eipAddresses;
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

}
