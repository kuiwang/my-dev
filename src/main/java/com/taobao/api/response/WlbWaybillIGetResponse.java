package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WaybillApplyNewInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.waybill.i.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbWaybillIGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1722556885611959841L;

    /**
     * 面单申请接口返回信息
     */
    @ApiListField("waybill_apply_new_cols")
    @ApiField("waybill_apply_new_info")
    private List<WaybillApplyNewInfo> waybillApplyNewCols;

    public void setWaybillApplyNewCols(List<WaybillApplyNewInfo> waybillApplyNewCols) {
        this.waybillApplyNewCols = waybillApplyNewCols;
    }

    public List<WaybillApplyNewInfo> getWaybillApplyNewCols() {
        return this.waybillApplyNewCols;
    }

}
