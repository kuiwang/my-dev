package com.scott.dev.taobao.api.item.domain;

import java.util.Date;

/*
 * 商品视频关联记录
 */
public class Video {

    /*
     * 视频关联记录的id，和商品相对应
     */
    private Number id;

    /*
     * video的id，对应于视频在淘秀的存储记录
     */
    private Number videoId;

    /*
     * video的url连接地址。淘秀里视频记录里面存储的url地址
     */
    private String url;

    /*
     * 视频关联记录创建时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    private Date created;

    /*
     * 视频关联记录修改时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    private Date modified;

    /*
     * 视频记录关联的商品的数字id(注意：iid近期即将废弃，请用num_iid参数)
     */
    private String iid;

    /*
     * 视频记录所关联的商品的数字id
     */
    private String numIid;

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public Number getVideoId() {
        return videoId;
    }

    public void setVideoId(Number videoId) {
        this.videoId = videoId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public String getNumIid() {
        return numIid;
    }

    public void setNumIid(String numIid) {
        this.numIid = numIid;
    }
}
