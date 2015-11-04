package com.aliyun.api.yundun.yundun20140924.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: yundun.aliyuncs.com.setSLBDdosSetting.2014-09-24 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SetSLBDdosSettingResponse extends AliyunResponse {

    private static final long serialVersionUID = 5532934119753997727L;

    /**
     * requestid
     */
    @ApiField("requestId")
    private String requestId;

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

}
