package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CreateResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.item.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiItemAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1457913434442355929L;

    /**
     * 返回新增成功的宝贝id
     */
    @ApiField("result")
    private CreateResult result;

    public void setResult(CreateResult result) {
        this.result = result;
    }

    public CreateResult getResult() {
        return this.result;
    }

}
