package com.aliyun.api.mts.mts20140618.response;

import java.util.List;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Video;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: mts.aliyuncs.com.QueryVideoListByIds.2014-06-18 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class QueryVideoListByIdsResponse extends AliyunResponse {

    private static final long serialVersionUID = 7848531335335333726L;

    /**
     * 不存在的视频ID列表
     */
    @ApiListField("NonExistMids")
    @ApiField("String")
    private List<String> nonExistMids;

    /**
     * 不属于用户的视频ID列表
     */
    @ApiListField("PermissionDeniedMids")
    @ApiField("String")
    private List<String> permissionDeniedMids;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 视频列表
     */
    @ApiListField("VideoList")
    @ApiField("Video")
    private List<Video> videoList;

    public void setNonExistMids(List<String> nonExistMids) {
        this.nonExistMids = nonExistMids;
    }

    public List<String> getNonExistMids() {
        return this.nonExistMids;
    }

    public void setPermissionDeniedMids(List<String> permissionDeniedMids) {
        this.permissionDeniedMids = permissionDeniedMids;
    }

    public List<String> getPermissionDeniedMids() {
        return this.permissionDeniedMids;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setVideoList(List<Video> videoList) {
        this.videoList = videoList;
    }

    public List<Video> getVideoList() {
        return this.videoList;
    }

}
