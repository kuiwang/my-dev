package com.aliyun.api.mts.mts20140618.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: mts.aliyuncs.com.AddVideo.2014-06-18 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AddVideoResponse extends AliyunResponse {

    private static final long serialVersionUID = 5261698697759278961L;

    /**
     * 视频在媒资库中唯一媒资ID
     */
    @ApiField("MediaId")
    private String mediaId;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
