package com.scott.dev.taobao.api.shop.domain;

import java.util.Date;

public class Shop {

    /*
     * 店铺编号。shop+sid.taobao.com即店铺地址，如shop123456.taobao.com
     */
    private Number sid;

    /*
     * 店铺所属的类目编号
     */
    private Number cid;

    /*
     * 卖家昵称
     */
    private String nick;

    /*
     * 店铺标题
     */
    private String title;

    /*
     * 店铺描述
     */
    private String desc;

    /*
     * 店铺公告
     */
    private String bulletin;

    /*
     * 店标地址。返回相对路径，可以用"http://logo.taobao.com/shop-logo"来拼接成绝对路径
     */
    private String picPath;

    /*
     * 开店时间。格式：yyyy-MM-dd HH:mm:ss
     */
    private Date created;

    /*
     * 最后修改时间。格式：yyyy-MM-dd HH:mm:ss
     */
    private Date modified;

    /*
     * 店铺动态评分信息
     */
    private ShopScore[] shopScore;

    /*
     * 剩余橱窗数量，对于C卖家返回剩余橱窗数，对于B卖家返回-1（只有taobao.shop.remainshowcase.get可以返回）
     */
    private Number remainCount;

    /*
     * 总橱窗数量，对于C卖家返回总橱窗数，对于B卖家返回0（只有taobao.shop.remainshowcase.get可以返回）
     */
    private Number allCount;

    /*
     * 已用的橱窗数量，对于C卖家返回已使用的橱窗数，对于B卖家返回-1（只有taobao.shop.remainshowcase.get可以返回）
     */
    private Number usedCount;

    public Number getSid() {
        return sid;
    }

    public void setSid(Number sid) {
        this.sid = sid;
    }

    public Number getCid() {
        return cid;
    }

    public void setCid(Number cid) {
        this.cid = cid;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBulletin() {
        return bulletin;
    }

    public void setBulletin(String bulletin) {
        this.bulletin = bulletin;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
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

    public ShopScore[] getShopScore() {
        return shopScore;
    }

    public void setShopScore(ShopScore[] shopScore) {
        this.shopScore = shopScore;
    }

    public Number getRemainCount() {
        return remainCount;
    }

    public void setRemainCount(Number remainCount) {
        this.remainCount = remainCount;
    }

    public Number getAllCount() {
        return allCount;
    }

    public void setAllCount(Number allCount) {
        this.allCount = allCount;
    }

    public Number getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Number usedCount) {
        this.usedCount = usedCount;
    }

}
