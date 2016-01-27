package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WaybillApplyPrintCheckInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.waybill.i.print response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbWaybillIPrintResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7499547272655817535L;

    /**
     * 错误的面单号
     */
    @ApiField("error_waybill_code")
    private String errorWaybillCode;

    /**
     * 面单打印信息
     */
    @ApiListField("waybill_apply_print_check_infos")
    @ApiField("waybill_apply_print_check_info")
    private List<WaybillApplyPrintCheckInfo> waybillApplyPrintCheckInfos;

    public String getErrorWaybillCode() {
        return this.errorWaybillCode;
    }

    public List<WaybillApplyPrintCheckInfo> getWaybillApplyPrintCheckInfos() {
        return this.waybillApplyPrintCheckInfos;
    }

    public void setErrorWaybillCode(String errorWaybillCode) {
        this.errorWaybillCode = errorWaybillCode;
    }

    public void setWaybillApplyPrintCheckInfos(
            List<WaybillApplyPrintCheckInfo> waybillApplyPrintCheckInfos) {
        this.waybillApplyPrintCheckInfos = waybillApplyPrintCheckInfos;
    }

}
