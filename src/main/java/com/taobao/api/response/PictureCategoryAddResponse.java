package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PictureCategory;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.picture.category.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PictureCategoryAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8526447146877532447L;

    /**
     * 图片分类信息
     */
    @ApiField("picture_category")
    private PictureCategory pictureCategory;

    public PictureCategory getPictureCategory() {
        return this.pictureCategory;
    }

    public void setPictureCategory(PictureCategory pictureCategory) {
        this.pictureCategory = pictureCategory;
    }

}
