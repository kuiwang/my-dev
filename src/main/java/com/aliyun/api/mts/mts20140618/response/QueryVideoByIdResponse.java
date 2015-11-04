package com.aliyun.api.mts.mts20140618.response;

import com.aliyun.api.AliyunResponse;
import com.aliyun.api.domain.Video;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: mts.aliyuncs.com.QueryVideoById.2014-06-18 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class QueryVideoByIdResponse extends AliyunResponse {

    private static final long serialVersionUID = 8876896843748973349L;

    /**
     * RequestId
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 视频信息
     */
    @ApiField("Video")
    private Video video;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Video getVideo() {
        return this.video;
    }

}
