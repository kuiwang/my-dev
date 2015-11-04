package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.rpt.adgroupnonsearcheffect.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptAdgroupnonsearcheffectGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5164589475169526539L;

    /**
     * 非搜索推广组效果对象
     */
    @ApiField("rpt_adgroup_nonsearch_effect")
    private String rptAdgroupNonsearchEffect;

    public void setRptAdgroupNonsearchEffect(String rptAdgroupNonsearchEffect) {
        this.rptAdgroupNonsearchEffect = rptAdgroupNonsearchEffect;
    }

    public String getRptAdgroupNonsearchEffect() {
        return this.rptAdgroupNonsearchEffect;
    }

}
