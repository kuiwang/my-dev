package com.aliyun.api.ecs.ecs20130110.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.SecurityGroup;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeSecurityGroups.2013-01-10 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeSecurityGroupsResponse extends AliyunResponse {

    private static final long serialVersionUID = 6653547199562111576L;

    /**
     * 当前页码
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 每页行数
     */
    @ApiField("PageSize")
    private Long pageSize;

    /**
     * 安全组所属地域Id
     */
    @ApiField("RegionId")
    private String regionId;

    /**
     * 请求的唯一ID，系统自动生成
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 安全组信息，由SecurityGroup组成的集合
     */
    @ApiListField("SecurityGroups")
    @ApiField("SecurityGroup")
    private List<SecurityGroup> securityGroups;

    /**
     * 安全组的总数
     */
    @ApiField("TotalCount")
    private Long totalCount;

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

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public List<SecurityGroup> getSecurityGroups() {
        return this.securityGroups;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

}
