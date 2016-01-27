package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.rpt.adgroupkeywordeffect.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptAdgroupkeywordeffectGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8193198948586659954L;

    /**
     * 词效果数据返回结果
     */
    @ApiField("rpt_adgroupkeyword_effect_list")
    private String rptAdgroupkeywordEffectList;

    public String getRptAdgroupkeywordEffectList() {
        return this.rptAdgroupkeywordEffectList;
    }

    public void setRptAdgroupkeywordEffectList(String rptAdgroupkeywordEffectList) {
        this.rptAdgroupkeywordEffectList = rptAdgroupkeywordEffectList;
    }

}
