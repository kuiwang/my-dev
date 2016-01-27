package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.rpt.custbase.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptCustbaseGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1485917138253442261L;

    /**
     * 用户帐户结果
     */
    @ApiField("rpt_cust_base_list")
    private String rptCustBaseList;

    public String getRptCustBaseList() {
        return this.rptCustBaseList;
    }

    public void setRptCustBaseList(String rptCustBaseList) {
        this.rptCustBaseList = rptCustBaseList;
    }

}
