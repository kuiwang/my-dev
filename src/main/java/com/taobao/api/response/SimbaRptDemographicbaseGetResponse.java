package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.rpt.demographicbase.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptDemographicbaseGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6549843658718451931L;

    /**
     * 非搜索推广计划基础数据对象
     */
    @ApiField("rpt_demographic_base")
    private String rptDemographicBase;

    public void setRptDemographicBase(String rptDemographicBase) {
        this.rptDemographicBase = rptDemographicBase;
    }

    public String getRptDemographicBase() {
        return this.rptDemographicBase;
    }

}
