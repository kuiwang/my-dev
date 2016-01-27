package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.rp.returngoods.refuse response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class RpReturngoodsRefuseResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5139251861466753578L;

    /**
     * asdf
     */
    @ApiField("result")
    private Boolean result;

    public Boolean getResult() {
        return this.result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

}
