package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CategoryResult;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.waimai.bcategory.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WaimaiBcategoryGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7727178936927839544L;

    /**
     * 类目对象集合
     */
    @ApiField("result")
    private CategoryResult result;

    public void setResult(CategoryResult result) {
        this.result = result;
    }

    public CategoryResult getResult() {
        return this.result;
    }

}
