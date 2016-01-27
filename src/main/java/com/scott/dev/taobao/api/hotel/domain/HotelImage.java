package com.scott.dev.taobao.api.hotel.domain;

/**
 * 酒店图片
 */
public class HotelImage {

    /**
     * 酒店id
     */
    private Long hid;

    /**
     * 图片地址链接
     */
    private String pic;

    public Long getHid() {
        return this.hid;
    }

    public String getPic() {
        return this.pic;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

}
