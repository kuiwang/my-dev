package com.aliyun.api.ecs.ecs20140526.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.CreateImage.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateImageResponse extends AliyunResponse {

    private static final long serialVersionUID = 6538699831113685831L;

    /**
     * 镜像ID
     */
    @ApiField("ImageId")
    private String imageId;

    /**
     * 请求的唯一ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageId() {
        return this.imageId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
