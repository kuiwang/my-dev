package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WaybillApplyUpdateInfo;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.waybill.i.fullupdate response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbWaybillIFullupdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6622177172358826943L;

    /**
     * 更新接口出参
     */
    @ApiField("waybill_apply_update_info")
    private WaybillApplyUpdateInfo waybillApplyUpdateInfo;

    public void setWaybillApplyUpdateInfo(WaybillApplyUpdateInfo waybillApplyUpdateInfo) {
        this.waybillApplyUpdateInfo = waybillApplyUpdateInfo;
    }

    public WaybillApplyUpdateInfo getWaybillApplyUpdateInfo() {
        return this.waybillApplyUpdateInfo;
    }

}
