package com.aliyun.api.ess.ess20140828.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ess.aliyuncs.com.CreateScalingConfiguration.2014-08-28
 * response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateScalingConfigurationResponse extends AliyunResponse {

    private static final long serialVersionUID = 5458223566316877762L;

    /**
     * RequestId
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 创建的伸缩配置id
     */
    @ApiField("ScalingConfigurationId")
    private String scalingConfigurationId;

    public String getRequestId() {
        return this.requestId;
    }

    public String getScalingConfigurationId() {
        return this.scalingConfigurationId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
    }

}
