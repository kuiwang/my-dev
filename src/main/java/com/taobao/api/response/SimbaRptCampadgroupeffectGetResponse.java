package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.rpt.campadgroupeffect.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptCampadgroupeffectGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6169242822416593559L;

    /**
     * 推广计划下推广组的效果数据列表
     */
    @ApiField("rpt_campadgroup_effect_list")
    private String rptCampadgroupEffectList;

    public String getRptCampadgroupEffectList() {
        return this.rptCampadgroupEffectList;
    }

    public void setRptCampadgroupEffectList(String rptCampadgroupEffectList) {
        this.rptCampadgroupEffectList = rptCampadgroupEffectList;
    }

}
