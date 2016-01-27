package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.simba.rpt.adgroupkeywordbase.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaRptAdgroupkeywordbaseGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8479679394437218132L;

    /**
     * 词基础数据返回结果
     */
    @ApiField("rpt_adgroupkeyword_base_list")
    private String rptAdgroupkeywordBaseList;

    public String getRptAdgroupkeywordBaseList() {
        return this.rptAdgroupkeywordBaseList;
    }

    public void setRptAdgroupkeywordBaseList(String rptAdgroupkeywordBaseList) {
        this.rptAdgroupkeywordBaseList = rptAdgroupkeywordBaseList;
    }

}
