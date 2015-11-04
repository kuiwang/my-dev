package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.rpt.adgroupcreativeeffect.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptAdgroupcreativeeffectGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2769177937666269661L;

    /**
     * 推广组下的创意效果数据列表
     */
    @ApiField("rpt_adgroupcreative_effect_list")
    private String rptAdgroupcreativeEffectList;

    public void setRptAdgroupcreativeEffectList(String rptAdgroupcreativeEffectList) {
        this.rptAdgroupcreativeEffectList = rptAdgroupcreativeEffectList;
    }

    public String getRptAdgroupcreativeEffectList() {
        return this.rptAdgroupcreativeEffectList;
    }

}
