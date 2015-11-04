package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sp.content.getallclass response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpContentGetallclassResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4693573397888855617L;

    /**
     * 返回Json格式的分类名称列表
     */
    @ApiField("value")
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
