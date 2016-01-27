package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.athena.item.solution.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AthenaItemSolutionAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8624931375883747375L;

    /**
     * 添加结果
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
