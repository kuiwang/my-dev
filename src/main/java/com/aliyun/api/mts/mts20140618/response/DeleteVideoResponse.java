package com.aliyun.api.mts.mts20140618.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: mts.aliyuncs.com.DeleteVideo.2014-06-18 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class DeleteVideoResponse extends AliyunResponse {

    private static final long serialVersionUID = 1173767871724534814L;

    /**
     * 请求ID
     */
    @ApiField("RequestId")
    private String requestId;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
