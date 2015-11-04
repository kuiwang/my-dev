package com.taobao.api.response;

import java.util.Date;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.logistics.online.cancel response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsOnlineCancelResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2464248356278911556L;

    /**
     * 成功与失败
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    /**
     * 修改时间
     */
    @ApiField("modify_time")
    private Date modifyTime;

    /**
     * 重新创建物流订单id
     */
    @ApiField("recreated_order_id")
    private Long recreatedOrderId;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public void setRecreatedOrderId(Long recreatedOrderId) {
        this.recreatedOrderId = recreatedOrderId;
    }

    public Long getRecreatedOrderId() {
        return this.recreatedOrderId;
    }

}
