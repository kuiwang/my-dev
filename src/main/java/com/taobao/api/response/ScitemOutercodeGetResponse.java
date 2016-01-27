package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ScItem;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.scitem.outercode.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ScitemOutercodeGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7617422545692838134L;

    /**
     * 后台商品
     */
    @ApiField("sc_item")
    private ScItem scItem;

    public ScItem getScItem() {
        return this.scItem;
    }

    public void setScItem(ScItem scItem) {
        this.scItem = scItem;
    }

}
