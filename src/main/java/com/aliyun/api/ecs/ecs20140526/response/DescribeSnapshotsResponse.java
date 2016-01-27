package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Snapshot;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeSnapshots.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeSnapshotsResponse extends AliyunResponse {

    private static final long serialVersionUID = 5135954212747856712L;

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
     * 请求的唯一ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 快照详情列表
     */
    @ApiListField("Snapshots")
    @ApiField("Snapshot")
    private List<Snapshot> snapshots;

    /**
     * 实例总个数
     */
    @ApiField("TotalCount")
    private Long totalCount;

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

    public List<Snapshot> getSnapshots() {
        return this.snapshots;
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

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setSnapshots(List<Snapshot> snapshots) {
        this.snapshots = snapshots;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
