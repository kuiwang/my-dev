package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ump.mbb.getbyid response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UmpMbbGetbyidResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1841979344221477971L;

    /**
     * 营销积木块定义信息，可以通过ump sdk里面的MBB.fromJson来处理
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
