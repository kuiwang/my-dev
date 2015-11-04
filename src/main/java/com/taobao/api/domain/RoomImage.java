package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * RoomImage（酒店图片）结构。各字段详细说明可参考接口定义，如：商品图片上传接口。
 *
 * @author auto create
 * @since 1.0, null
 */
public class RoomImage extends TaobaoObject {

    private static final long serialVersionUID = 2531681116962278261L;

    /**
     * 商品所有图片的url，用”,”隔开。即，当前该商品的所有图片地址。
     */
    @ApiField("all_images")
    private String allImages;

    /**
     * 酒店商品id
     */
    @ApiField("gid")
    private Long gid;

    /**
     * 图片url。当前接口操作的图片url。调用上传图片接口时，代表上传图片后得到的图片url。调用删除图片接口时，代表被删除掉的图片url。
     */
    @ApiField("image")
    private String image;

    /**
     * 图片位置，可选值：1,2,3,4,5。代表图片的位置，如：2，代表第二张图片。
     */
    @ApiField("position")
    private Long position;

    public String getAllImages() {
        return this.allImages;
    }

    public void setAllImages(String allImages) {
        this.allImages = allImages;
    }

    public Long getGid() {
        return this.gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getPosition() {
        return this.position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

}
