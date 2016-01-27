package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Picture;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.picture.upload response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PictureUploadResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3885389376991181468L;

    /**
     * 当前上传的一张图片信息
     */
    @ApiField("picture")
    private Picture picture;

    public Picture getPicture() {
        return this.picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

}
