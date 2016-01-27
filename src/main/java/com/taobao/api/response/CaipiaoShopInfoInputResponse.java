package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.caipiao.shop.info.input response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CaipiaoShopInfoInputResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7733223288254533341L;

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
