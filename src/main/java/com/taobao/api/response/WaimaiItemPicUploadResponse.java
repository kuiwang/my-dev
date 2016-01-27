package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CreateResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.item.pic.upload response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiItemPicUploadResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3131879294239425869L;

    /**
     * 返回图片地址及提示信息及code. 返回结果result_data为完整图片地址,例如:
     * http://img.taobaocdn.com/bao/uploaded/i1/T1uTCUXExiXXcK5RZ8
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
