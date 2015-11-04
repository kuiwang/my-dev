package com.aliyun.api.mts.mts20140618.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: mts.aliyuncs.com.QueryMediaBucket.2014-06-18 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class QueryMediaBucketResponse extends AliyunResponse {

    private static final long serialVersionUID = 7693311252434652753L;

    /**
     * 当用户订购视频服务后，云视频服务会创建一个bucket供用户上传使用，用户使用MTS客户端SDK上传视频时指定到此bucket
     */
    @ApiField("BucketName")
    private String bucketName;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
