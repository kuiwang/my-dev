package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FreshWaybill;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.waybill.shengxian.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbWaybillShengxianGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2125262252272165321L;

    /**
     * 成功后返回的生鲜电子面单信息
     */
    @ApiField("fresh_waybill")
    private FreshWaybill freshWaybill;

    /**
     * 生成是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public FreshWaybill getFreshWaybill() {
        return this.freshWaybill;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setFreshWaybill(FreshWaybill freshWaybill) {
        this.freshWaybill = freshWaybill;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
