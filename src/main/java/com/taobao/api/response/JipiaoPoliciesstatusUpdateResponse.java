package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.jipiao.policiesstatus.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JipiaoPoliciesstatusUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4437934318614864152L;

    /**
     * 代理商核对接收处理信息的时间序号
     */
    @ApiField("invoke_id")
    private String invokeId;

    /**
     * 机票政策状态更新任务提交结果，true，成功；false，失败
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public String getInvokeId() {
        return this.invokeId;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setInvokeId(String invokeId) {
        this.invokeId = invokeId;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
