package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.caipiao.goods.info.input response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CaipiaoGoodsInfoInputResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5839162288428263671L;

    /**
     * 录入操作是否成功
     */
    @ApiField("input_result")
    private Boolean inputResult;

    public Boolean getInputResult() {
        return this.inputResult;
    }

    public void setInputResult(Boolean inputResult) {
        this.inputResult = inputResult;
    }

}
