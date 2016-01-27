package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.VSwitch;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeVSwitches.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeVSwitchesResponse extends AliyunResponse {

    private static final long serialVersionUID = 7472896712619897326L;

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
     * 虚拟交换机详情VSwitchSetType组成的集合
     */
    @ApiListField("VSwitches")
    @ApiField("VSwitch")
    private List<VSwitch> vSwitches;

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

    public List<VSwitch> getvSwitches() {
        return this.vSwitches;
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

    public void setvSwitches(List<VSwitch> vSwitches) {
        this.vSwitches = vSwitches;
    }

}
