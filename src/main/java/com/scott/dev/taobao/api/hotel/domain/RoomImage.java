package com.scott.dev.taobao.api.hotel.domain;

/**
 * RoomImage（酒店图片）结构。各字段详细说明可参考接口定义，如：商品图片上传接口。
 */
public class RoomImage {

    /**
     * 商品所有图片的url，用”,”隔开。即，当前该商品的所有图片地址。
     */
    private String allImages;

    /**
     * 酒店商品id
     */
    private Long gid;

    /**
     * 图片url。当前接口操作的图片url。调用上传图片接口时，代表上传图片后得到的图片url。调用删除图片接口时，代表被删除掉的图片url。
     */
    private String image;

    /**
     * 图片位置，可选值：1,2,3,4,5。代表图片的位置，如：2，代表第二张图片。
     */
    private Long position;

    public String getAllImages() {
        return this.allImages;
    }

    public Long getGid() {
        return this.gid;
    }

    public String getImage() {
        return this.image;
    }

    public Long getPosition() {
        return this.position;
    }

    public void setAllImages(String allImages) {
        this.allImages = allImages;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

}
