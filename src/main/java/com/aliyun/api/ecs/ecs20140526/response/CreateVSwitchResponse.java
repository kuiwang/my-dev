package com.aliyun.api.ecs.ecs20140526.response;

import com.aliyun.api.AliyunResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: ecs.aliyuncs.com.CreateVSwitch.2014-05-26 response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CreateVSwitchResponse extends AliyunResponse {

    private static final long serialVersionUID = 8252482473311175114L;

    /**
     * RequestId
     */
    @ApiField("RequestId")
    private String requestId;

    /**
     * 系统分配的虚拟网络 ID
     */
    @ApiField("VSwitchId")
    private String vSwitchId;

    public String getRequestId() {
        return this.requestId;
    }

    public String getvSwitchId() {
        return this.vSwitchId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setvSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
    }

}
