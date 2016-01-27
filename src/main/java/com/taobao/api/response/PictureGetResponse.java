package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Picture;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.picture.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class PictureGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6594355566714828958L;

    /**
     * 图片信息列表
     */
    @ApiListField("pictures")
    @ApiField("picture")
    private List<Picture> pictures;

    /**
     * 总的结果数
     */
    @ApiField("totalResults")
    private Long totalResults;

    public List<Picture> getPictures() {
        return this.pictures;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

}
