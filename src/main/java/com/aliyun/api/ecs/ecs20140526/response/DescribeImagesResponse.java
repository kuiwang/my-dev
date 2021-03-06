package com.aliyun.api.ecs.ecs20140526.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Image;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: ecs.aliyuncs.com.DescribeImages.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DescribeImagesResponse extends AliyunResponse {

    private static final long serialVersionUID = 3496378992984455694L;

    /**
     * 镜像信息组成的集合
     */
    @ApiListField("Images")
    @ApiField("Image")
    private List<Image> images;

    /**
     * 页数
     */
    @ApiField("PageNumber")
    private Long pageNumber;

    /**
     * 每页最大行数，默认 10 行，最大值 50 行
     */
    @ApiField("PageSize")
    private Long pageSize;

    /**
     * 实例所属于的 Region ID
     */
    @ApiField("RegionId")
    private String regionId;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 镜像总数
     */
    @ApiField("TotalCount")
    private Long totalCount;

    public List<Image> getImages() {
        return this.images;
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

    public void setImages(List<Image> images) {
        this.images = images;
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
