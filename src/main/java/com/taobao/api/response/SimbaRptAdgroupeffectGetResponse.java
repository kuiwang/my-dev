package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.rpt.adgroupeffect.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptAdgroupeffectGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7559918845361112411L;

    /**
     * 推广组效果报表数据对象
     */
    @ApiField("rpt_adgroup_effect_list")
    private String rptAdgroupEffectList;

    public String getRptAdgroupEffectList() {
        return this.rptAdgroupEffectList;
    }

    public void setRptAdgroupEffectList(String rptAdgroupEffectList) {
        this.rptAdgroupEffectList = rptAdgroupEffectList;
    }

}
