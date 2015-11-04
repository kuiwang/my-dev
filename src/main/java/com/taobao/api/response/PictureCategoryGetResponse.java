package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PictureCategory;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.picture.category.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PictureCategoryGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3534854952768699512L;

    /**
     * 图片分类
     */
    @ApiListField("picture_categories")
    @ApiField("picture_category")
    private List<PictureCategory> pictureCategories;

    public void setPictureCategories(List<PictureCategory> pictureCategories) {
        this.pictureCategories = pictureCategories;
    }

    public List<PictureCategory> getPictureCategories() {
        return this.pictureCategories;
    }

}
