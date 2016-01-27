package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.category.operate response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiCategoryOperateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3229888855933165588L;

    /**
     * 是一个JSON
     */
    @ApiField("result")
    private String result;

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
