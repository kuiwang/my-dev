package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.picture.isreferenced.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PictureIsreferencedGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3421424656573921891L;

    /**
     * 图片是否被引用
     */
    @ApiField("is_referenced")
    private Boolean isReferenced;

    public Boolean getIsReferenced() {
        return this.isReferenced;
    }

    public void setIsReferenced(Boolean isReferenced) {
        this.isReferenced = isReferenced;
    }

}
