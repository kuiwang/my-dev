package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CreateResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.item.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiItemUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4689656346757194966L;

    /**
     * 返回新增成功的宝贝id
     */
    @ApiField("result")
    private CreateResult result;

    public CreateResult getResult() {
        return this.result;
    }

    public void setResult(CreateResult result) {
        this.result = result;
    }

}
