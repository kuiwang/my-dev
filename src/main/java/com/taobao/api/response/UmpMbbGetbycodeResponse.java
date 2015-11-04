package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ump.mbb.getbycode response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpMbbGetbycodeResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8858173819881544927L;

    /**
     * 营销积木块的内容，通过ump sdk来进行处理
     */
    @ApiField("mbb")
    private String mbb;

    public void setMbb(String mbb) {
        this.mbb = mbb;
    }

    public String getMbb() {
        return this.mbb;
    }

}
