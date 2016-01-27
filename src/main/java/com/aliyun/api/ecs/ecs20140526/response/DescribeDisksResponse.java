package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Disk;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeDisks.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeDisksResponse extends AliyunResponse {

    private static final long serialVersionUID = 4589356268247631819L;

    /**
     * 磁盘信息DiskItemType组成的集合
     */
    @ApiListField("Disks")
    @ApiField("Disk")
    private List<Disk> disks;

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
     * 镜像所属地域Id
     */
    @ApiField("RegionId")
    private String regionId;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 实例列表的页码
     */
    @ApiField("TotalCount")
    private Long totalCount;

    public List<Disk> getDisks() {
        return this.disks;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setDisks(List<Disk> disks) {
        this.disks = disks;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
