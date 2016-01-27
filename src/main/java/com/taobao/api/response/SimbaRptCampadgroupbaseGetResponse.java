package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.rpt.campadgroupbase.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptCampadgroupbaseGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2132848286823759883L;

    /**
     * 推广计划下推广组的基础数据列表
     */
    @ApiField("rpt_campadgroup_base_list")
    private String rptCampadgroupBaseList;

    public String getRptCampadgroupBaseList() {
        return this.rptCampadgroupBaseList;
    }

    public void setRptCampadgroupBaseList(String rptCampadgroupBaseList) {
        this.rptCampadgroupBaseList = rptCampadgroupBaseList;
    }

}
