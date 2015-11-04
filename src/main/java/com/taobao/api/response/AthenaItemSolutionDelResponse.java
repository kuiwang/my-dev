package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.athena.item.solution.del response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AthenaItemSolutionDelResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1189319756683557321L;

    /**
     * 添加结果
     */
    @ApiField("result")
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }

}
