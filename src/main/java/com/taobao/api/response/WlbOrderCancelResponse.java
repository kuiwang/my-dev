package com.taobao.api.response;

import java.util.Date;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbOrderCancelResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7186531158977156126L;

    /**
     * 错误编码列表
     */
    @ApiField("error_code_list")
    private String errorCodeList;

    /**
     * 修改时间，只有在取消成功的情况下，才可以做
     */
    @ApiField("modify_time")
    private Date modifyTime;

    public void setErrorCodeList(String errorCodeList) {
        this.errorCodeList = errorCodeList;
    }

    public String getErrorCodeList() {
        return this.errorCodeList;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

}
